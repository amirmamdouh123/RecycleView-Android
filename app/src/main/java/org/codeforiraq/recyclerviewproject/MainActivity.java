package org.codeforiraq.recyclerviewproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.graphics.Movie;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
RecyclerView recyclerView;
MyAdapter myAdapter;
List<filmList> films=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recyclerView);

        MovieData();
        myAdapter= new MyAdapter(this,films);
        RecyclerView.LayoutManager manager=new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(manager);
        recyclerView.setAdapter(myAdapter);

    }

    @SuppressLint("NotifyDataSetChanged")
    private void MovieData() {
        filmList avatar=new filmList("Avatar","100 min","action",
                "A paraplegic Marine dispatched to the moon Pandora on a unique mission becomes torn" +
                " between following his orders and protecting " +
                "the world he feels is his home.",R.drawable.avatar);
        films.add(avatar);
        filmList GameOfIhrones=new filmList("Game of Thrones","120 min","Historical",
                "Nine noble families fight for control over the lands of Westeros," +
                        " while an ancient enemy returns after being dormant for millennia.",R.drawable.got);
        films.add(GameOfIhrones);
        filmList Vikings=new filmList("Vikings","82 min","Action  |  Historical ",
                "Vikings transports us to the brutal " +
                "and mysterious world of Ragnar Lothbrok, a Viking warrior and farmer who yearns " +
                "to explore - and raid - the distant shores across the ocean.",R.drawable.vikings);
        films.add(Vikings);
        filmList threeHundred=new filmList("300","56 min","Blood",
                "King Leonidas of Sparta and a force of 300 men" +
                        " fight the Persians at Thermopylae in 480 B.C."
                       ,R.drawable.threehundred);
        films.add(threeHundred);




    }
}