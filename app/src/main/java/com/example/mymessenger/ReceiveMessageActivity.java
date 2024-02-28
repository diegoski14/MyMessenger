package com.example.mymessenger;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class ReceiveMessageActivity extends Activity {
    List<String> chat = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receive_message);
        List<String> chat = ChatHistory.getInstance().getMessages();
        TextView layoutChat = (TextView) findViewById(R.id.chat);
        StringBuilder formaChat = new StringBuilder();
        for(String m: chat){
            formaChat.append(m).append("\n");
        }
        layoutChat.setText(formaChat);
    }

    public void enviarMensaje(View view){
        EditText obtenerMensaje = (EditText) findViewById(R.id.inputText1);
        String mensaje = "Conductor: " + obtenerMensaje.getText().toString();
        ChatHistory.getInstance().addMessages(mensaje);
        Intent intent = new Intent(this, CreateMessageActivity.class);
        startActivity(intent);
    }
}