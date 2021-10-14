package com.briones.tony.practica.adapters;


import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.briones.tony.practica.Contacto;
import com.briones.tony.practica.R;

import java.util.Arrays;
import java.util.List;

public class NombreAdapter extends RecyclerView.Adapter<NombreAdapter.NombreViewHolder> {


    List <Contacto> contactos;

    public NombreAdapter(List<Contacto> contactos) {
        this.contactos = contactos;
    }

    @NonNull
    @Override
    public NombreViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       // se pone cual va a er el layout del item que vamos a usar
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_nombre_adapter, parent, false);

        return new NombreViewHolder(view);
    }

    @Override
    public void onBindViewHolder(NombreAdapter.NombreViewHolder holder, int position) {

    // Acátodo lo que vamos a modificar o hacer
        View view = holder.itemView;

        Contacto contacto = contactos.get(position);

        TextView textViewNombre = view.findViewById(R.id.tvNombre);
        TextView textViewNumero = view.findViewById(R.id.tvNumero);

        textViewNombre.setText(contacto.Nombre);
        textViewNumero.setText(contacto.Telefono);




        // Para btn Llamar
        Button btnLlama = holder.itemView.findViewById(R.id.btnLlamar);
        btnLlama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", contacto.Telefono, null));
                view.getContext().startActivity(intent);


            }
        });


        // Para btn SMS
        Button btnmensaje = holder.itemView.findViewById(R.id.btnSms);
        btnmensaje.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String sms ="";
                Intent smsIntent = new Intent(Intent.ACTION_VIEW, Uri.fromParts("sms", contacto.Telefono, null));
                smsIntent.putExtra("sms_body",sms);
                view.getContext().startActivity(smsIntent);


            }
        });


    }





    @Override
    public int getItemCount() {
        return contactos.size();
    }

    class  NombreViewHolder extends RecyclerView.ViewHolder
    {

        public NombreViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
