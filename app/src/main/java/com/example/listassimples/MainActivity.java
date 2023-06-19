package com.example.listassimples;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView ListViewPlanetas;
    List<Mercurio> lst;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListViewPlanetas=findViewById(R.id.ListViewPlanetas);

        CustomAdapter adapter=new CustomAdapter(this, GetData());
        ListViewPlanetas.setAdapter(adapter);

        ListViewPlanetas.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Mercurio m=lst.get(i);
                Toast.makeText(getBaseContext(),m.nombre,Toast.LENGTH_SHORT).show();
            }
        });

    }

    private List<Mercurio> GetData() {
        lst=new ArrayList<>();
        lst.add(new Mercurio(1,R.drawable.jupiter_1,"Planeta Jupiter","Este planeta es muy grande"));
        lst.add(new Mercurio(2,R.drawable.marte_2,"Planeta Marte","Este planeta es muy rojo"));
        lst.add(new Mercurio(3,R.drawable.mercurio,"Planeta Mercurio","Este planeta es muy oscuro"));
        lst.add(new Mercurio(4,R.drawable.neptuno,"Planeta Neptuno","Este planeta es muy azul"));
        lst.add(new Mercurio(5,R.drawable.saturno,"Planeta Saturno","Este planeta tiene un anillo"));
        lst.add(new Mercurio(6,R.drawable.tierra,"Planeta Tierra","Este planeta es donde vivimos"));
        lst.add(new Mercurio(7,R.drawable.urano,"Planeta Urano","En este planeta hace mucho frio "));
        lst.add(new Mercurio(8,R.drawable.venus,"Planeta Venus","Este planeta es como el sol "));

        return lst;

    }
}