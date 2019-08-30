package com.example.webview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText direccion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        direccion = (EditText) findViewById(R.id.direccion);
    }

    public void IrAlSitio(View view){
        Intent direccionSitio = new Intent(this,ActivityWeb.class);
        direccionSitio.putExtra("sitio",direccion.getText().toString());
        startActivity(direccionSitio);
    }
}
