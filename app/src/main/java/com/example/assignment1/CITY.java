package com.example.assignment1;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class CITY {
    private String name;
    private int imageID;



    public static final CITY[] CITIES = {
            new CITY("عكا", R.drawable.ac),
            new CITY("جنين", R.drawable.gi),
            new CITY("نابلس", R.drawable.na),
            new CITY("الخليل", R.drawable.he),
            new CITY("القدس", R.drawable.jaro),
    };
    private CITY(String name, int imageID){
        this.name = name;
        this.imageID = imageID;
    }
    public String getName(){return name;}
    public int getImageID(){return imageID;}

    public static class MainActivity extends AppCompatActivity {

        private Button button;

            @SuppressLint("MissingInflatedId")
            @Override
            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main);


                button = (Button)  findViewById(R.id.button);
                button.setOnClickListener( new View.OnClickListener() {
                    public void onClick(View v) {
                        openMainActivity2();
                    }

                });
                @SuppressLint({"MissingInflatedId", "LocalSuppress"}) RecyclerView recycler = findViewById(R.id.CITY_recycler);

                String[] captions = new String[CITIES.length];
                int[] ids = new int[CITIES.length];

                for(int i = 0; i<captions.length;i++){
                    captions[i] = CITIES[i].getName();
                    ids[i] = CITIES[i].getImageID();
                }
                recycler.setLayoutManager(new LinearLayoutManager(this));
                CaptionedImagesAdapter adapter = new CaptionedImagesAdapter(captions, ids);
                recycler.setAdapter(adapter);


            }



    public void openMainActivity2(){
            Intent intent =new Intent(this, MainActivity3.class);
            startActivity(intent);
            }
            }
}
