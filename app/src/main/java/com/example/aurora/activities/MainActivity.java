package com.example.aurora.activities;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.aurora.R;
import com.example.aurora.adapters.ServiceAdapter;
import com.example.aurora.models.Service;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    ArrayList<Service> serviceList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);

        // Lista de servicios
        serviceList = new ArrayList<>();
        serviceList.add(new Service("Diseño de Logo", "Creamos logos profesionales"));
        serviceList.add(new Service("Diseño para Redes", "Posts e historias atractivas"));
        serviceList.add(new Service("Página Web", "Sitios modernos y responsivos"));

        // Adapter personalizado
        ServiceAdapter adapter = new ServiceAdapter(this, serviceList);
        listView.setAdapter(adapter);

        // Click en item
        listView.setOnItemClickListener((parent, view, position, id) -> {
            Intent intent = new Intent(MainActivity.this, DetailActivity.class);

            intent.putExtra("name", serviceList.get(position).getName());
            intent.putExtra("description", serviceList.get(position).getDescription());

            startActivity(intent);
        });
    }
}