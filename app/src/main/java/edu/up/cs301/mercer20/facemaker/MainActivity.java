package edu.up.cs301.mercer20.facemaker;

import android.graphics.Canvas;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.SurfaceView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    private String[] hairStyleNames = {"Bowl Cut", "Spiky", "Balding"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayAdapter<String> hairAdapter =
                new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, hairStyleNames);
        Spinner hairStyles = (Spinner)findViewById(R.id.spinnerHairStyles);
        hairStyles.setAdapter(hairAdapter);

        FaceView myFaceView = findViewById(R.id.surfaceFaceView);
        Face myFace = new Face();
        myFaceView.getFace(myFace);
    }
}
