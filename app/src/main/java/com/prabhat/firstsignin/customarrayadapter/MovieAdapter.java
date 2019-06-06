package com.prabhat.firstsignin.customarrayadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MovieAdapter extends ArrayAdapter<Movie> {
   private Context mContext;

   private List<Movie> movieList = new ArrayList<>();


    public MovieAdapter(Context context, List<Movie> objects) {
        super(context, 0, objects);
        mContext=context;
        movieList=objects;

    }

  /*  @Override
    public View getView(int position, View convertView,  ViewGroup parent) {

        View listItem=convertView;

                if(listItem==null)
                listItem=LayoutInflater.from(mContext).inflate(R.layout.list_item,parent,false);

                Movie currentMovie=movieList.get(position);

                    ImageView imageView= listItem.findViewById(R.id.imageView_poster);
                    imageView.setImageResource(currentMovie.getmImageDrawable());

                    TextView name=listItem.findViewById(R.id.textView_name);
                    name.setText(currentMovie.getmName());

                    TextView release=listItem.findViewById(R.id.textView_release);
                    release.setText(currentMovie.getmRelease());

                    return  listItem;


    }*/

    @Override
    public View getView(int position, View convertView,ViewGroup parent) {
        View listView=convertView;

        if(listView==null)
            listView=LayoutInflater.from(mContext).inflate(R.layout.list_item,parent,false);
        Movie moviewList=movieList.get(position);

        ImageView imageVi= listView.findViewById(R.id.imageView_poster);
        imageVi.setImageResource(moviewList.getmImageDrawable());

        TextView name= listView.findViewById(R.id.textView_name);
        name.setText(moviewList.getmName());

        TextView release= listView.findViewById(R.id.textView_release);
        release.setText(moviewList.getmRelease());
        return listView;
    }
}


