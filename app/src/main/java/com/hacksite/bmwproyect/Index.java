package com.hacksite.bmwproyect;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Index extends AppCompatActivity {

    private TextView velocidad;
    private TextView distancia;
    private TextView aceleracion;
    private TextView bateria;
    private TextView temperatura;

    private DatabaseReference dbVelocidad;
    private DatabaseReference dbPrediccion;
    private ValueEventListener eventListener;
/*
    DatabaseReference mRootRef = FirebaseDatabase.getInstance().getReference();
    DatabaseReference mvelocidadRef = mRootRef.child("Nombre");
    DatabaseReference dbVelocidad = FirebaseDatabase.getInstance().getReference().child("Velocidad/").child("velocidad")*/;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index);

        velocidad = (TextView) findViewById(R.id.velocidad);
        aceleracion = (TextView) findViewById(R.id.aceleracion);
        bateria = (TextView) findViewById(R.id.bateria);
        distancia = (TextView) findViewById(R.id.distancia);
        temperatura = (TextView) findViewById(R.id.temperatura);

        dbPrediccion = FirebaseDatabase.getInstance().getReference().child("DatosAuto");

        eventListener = new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                Prediccion pred = dataSnapshot.getValue(Prediccion.class);
                assert pred != null;
                velocidad.setText(pred.getVelocidad() + "");
                aceleracion.setText(pred.getAceleracion() + "");

                bateria.setText(pred.getBateria() + "");
                distancia.setText(pred.getDistancia() + "");
                temperatura.setText(pred.getDistancia() + "ºC");
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        };
        dbPrediccion.addValueEventListener(eventListener);
    }
}
