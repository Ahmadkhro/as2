package com.example.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity3 extends AppCompatActivity {

    private Button ok;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        ok = (Button)  findViewById(R.id.ok);
        ok.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainActivity5();
            }

        });

    }

    public void openMainActivity5(){
        Intent intent =new Intent(this, anim.class);
        startActivity(intent);
    }


}