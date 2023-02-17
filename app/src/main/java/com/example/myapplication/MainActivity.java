package com.example.myapplication;
import static androidx.fragment.app.FragmentManager.TAG;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    Button camera;
    @SuppressLint("RestrictedApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Context context = getApplicationContext();
        CharSequence text = "One piece is real!";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        camera = (Button) findViewById(R.id.button);
        camera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { try {
                Intent intent = new Intent();
                intent.setAction(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivity(intent);
            }
            catch (Exception e){
                e.printStackTrace();
            }
            }
        });
    }
}
