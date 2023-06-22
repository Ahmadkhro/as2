package com.example.assignment1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button)  findViewById(R.id.button);
    button.setOnClickListener( new View.OnClickListener() {
        @Override
        public void onClick(View v) {
        openMainActivity2();
        }

    });
        RecyclerView recycler = findViewById(R.id.CITY_recycler);

        String[] captions = new String[CITY.CITIES.length];
        int[] ids = new int[CITY.CITIES.length];

        for(int i = 0; i<captions.length;i++){
            captions[i] = CITY.CITIES[i].getName();
            ids[i] = CITY.CITIES[i].getImageID();
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
