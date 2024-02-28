package com.example.mymessenger;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.mymessenger.ReceiveMessageActivity;
import androidx.appcompat.app.AppCompatActivity;

public class CreateMessageActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_message);
    }
    public void enviarMensaje(View view){
        EditText obtenerMensaje = (EditText) findViewById(R.id.inputText1);
        String mensaje = obtenerMensaje.getText().toString();
        // Crear un intent para iniciar la actividad receiveMessageActivity
        Intent intent = new Intent(this, ReceiveMessageActivity.class);

        // Pasar el mensaje como un extra al intent
        intent.putExtra("mensaje", mensaje);

        // Iniciar la actividad
        startActivity(intent);
    }
    }


