package org.codeforiraq.recyclerviewproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Details extends AppCompatActivity {
Bundle extras;
TextView name,type,descripton;
ImageView image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        name=findViewById(R.id.name);
        type=findViewById(R.id.type);
        descripton=findViewById(R.id.description);
        image=findViewById(R.id.filmImage);

        extras=getIntent().getExtras();
name.setText(extras.getString("name"));
        type.setText(extras.getString("type"));
       descripton.setText(extras.getString("description"));
       image.setImageResource( extras.getInt("image"));

    }
}