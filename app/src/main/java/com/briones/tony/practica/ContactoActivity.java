package com.briones.tony.practica;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.briones.tony.practica.adapters.NombreAdapter;

import java.util.ArrayList;
import java.util.List;

public class ContactoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacto);

        // Vinculamos la actividad
        RecyclerView rv = findViewById(R.id.rvContacto);
        rv.setLayoutManager(new LinearLayoutManager(ContactoActivity.this));
        List<Contacto> contactos = GetContacto();

        NombreAdapter nombreAdapter = new NombreAdapter(contactos);

        rv.setAdapter(nombreAdapter);


    }

    private List<Contacto> GetContacto(){
        List<Contacto> contactos = new ArrayList<>();
        contactos.add(new Contacto("Nayeli","9746464644"));
        contactos.add(new Contacto("Anthony","935847383"));
        contactos.add(new Contacto("Andres","930386751"));
        contactos.add(new Contacto("Diego","976547833"));
        contactos.add(new Contacto("Juan","923823744"));
        contactos.add(new Contacto("David","943434"));
        contactos.add(new Contacto("Daniel","98765443"));
        contactos.add(new Contacto("Darwin","9232378247"));
        contactos.add(new Contacto("Carla","924437824"));
        contactos.add(new Contacto("Andrea","92442424"));
        return contactos;
    }



}