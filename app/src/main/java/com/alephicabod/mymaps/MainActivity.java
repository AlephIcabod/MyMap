package com.alephicabod.mymaps;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
        private final double LAT_SANTO_DOMINGO=17.065728432657046;
        private final double LON_SANTO_DOMINGO=-96.7232894897461;
        private final double LAT_ZOCALO=17.06055911949029;
        private final double LON_ZOCALO=-96.7253065109253;
        private final double LAT_TULE=17.046527405222477;
        private final double LON_TULE=-96.63621425628662;
        private final double LAT_MONTE_ALBAN=17.0438035;
        private final double LON_MONTE_ALBAN=-96.76811040000001;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void verMapa(View v){
        Intent i=new Intent(MainActivity.this,Mapa.class);
        switch(v.getId()){
            case R.id.monteAlban:
                i.putExtra("LATITUD",LAT_MONTE_ALBAN);
                i.putExtra("LONGITUD",LON_MONTE_ALBAN);
                i.putExtra("TITULO","Monte Alban");

                startActivity(i);
                break;

            case R.id.santoDomingo:
                i.putExtra("LATITUD",LAT_SANTO_DOMINGO);
                i.putExtra("LONGITUD",LON_SANTO_DOMINGO);
                i.putExtra("TITULO","Santo Domingo");
                startActivity(i);
                break;

            case R.id.tule:
                i.putExtra("LATITUD",LAT_TULE);
                i.putExtra("LONGITUD",LON_TULE);
                i.putExtra("TITULO","El Tule");
                startActivity(i);
                break;

            case R.id.zocalo:
                i.putExtra("LATITUD",LAT_ZOCALO);
                i.putExtra("LONGITUD",LON_ZOCALO);
                i.putExtra("TITULO","Zocalo");
                startActivity(i);
                break;
        }

    }
}
