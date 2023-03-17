package com.example.pr2;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ActivityLinear extends AppCompatActivity implements View.OnClickListener {
    private static final String TAG = "My app";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.liner_layout);
        Button button1 = (Button)findViewById(R.id.prog_button);
        button1.setOnClickListener(this);
        Bundle arguments = getIntent().getExtras();
        String enter = arguments.get("enter").toString();
        TextView text = (TextView) findViewById(R.id.linear);
        text.setText(enter);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.prog_button:
                Button button1 = (Button)findViewById(R.id.prog_button);
                button1.setText("Success!!");
                break;
        }
    }
    public void changeText(View view){
        Button button = (Button) findViewById(R.id.decl_button);
        button.setText("Success!!");
        Log.w(TAG, "Declared button message");
    }
}