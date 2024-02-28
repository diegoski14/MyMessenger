package com.example.mymessenger;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ReceiveMessageActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receive_message);

        String mensaje = getIntent().getStringExtra("mensaje");
        TextView textView1 = (TextView) findViewById(R.id.textView1);
        textView1.setText(mensaje);

    }

}
