package com.example.moaathalrajab.week7_demo1_staticfragment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
        implements BlankFragment.OnFrgmntIntrctionListener{

    Button btn;
    //TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn=findViewById(R.id.btn1);
        btn.setOnClickListener(this::clickedMe);

    }

    public void clickedMe(View v){
        ((TextView)findViewById(R.id.tv1)).setText("Moaath");
    }

    @Override
    public void onFragmentInteraction(int i) {
        Toast.makeText(this, "This is coming from mainActivity",
                Toast.LENGTH_SHORT).show();
    }
}
