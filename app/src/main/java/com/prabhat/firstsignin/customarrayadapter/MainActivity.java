package com.prabhat.firstsignin.customarrayadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView listView;

    private MovieAdapter movieAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView=findViewById(R.id.movies_list);
        ArrayList<Movie> movieList= new ArrayList<>();
        movieList.add(new Movie(R.drawable.a,"Black Panther","2010"));

        movieList.add(new Movie(R.drawable.b,"Star Wars","2012"));

        movieList.add(new Movie(R.drawable.c,"Captain Marvel","2019"));

        movieList.add(new Movie(R.drawable.d,"Replicas","2011"));

        movieList.add(new Movie(R.drawable.e,"The Guity","2015"));

        movieList.add(new Movie(R.drawable.f,"Blade Runner","2007"));

        movieList.add(new Movie(R.drawable.g,"Avengers Infinity","2018"));

        movieList.add(new Movie(R.drawable.h,"The Crime Of GrindlWorld","2018"));

        movieAdapter = new MovieAdapter(this,movieList);

        listView.setAdapter(movieAdapter);
    }
}
