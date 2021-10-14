package com.briones.tony.practica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.briones.tony.practica.adapters.NombreAdapter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.btnBorrar);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                //llamar por telefono
               Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "21223", null));
               startActivity(intent);

            }
        });

    }
}