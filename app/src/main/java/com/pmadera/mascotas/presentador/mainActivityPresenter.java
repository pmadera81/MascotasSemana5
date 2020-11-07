package com.pmadera.mascotas.presentador;

import android.content.Context;

import com.pmadera.mascotas.db.ConstructorMascotas;
import com.pmadera.mascotas.iMainActivity;
import com.pmadera.mascotas.pojo.Mascota;

import java.util.ArrayList;

public class mainActivityPresenter implements iMainActivityPresenter{

    private com.pmadera.mascotas.iMainActivity iMainActivity;
    private Context context;
    private ArrayList<Mascota> listaMascotas;
    private ConstructorMascotas oConstructorMascotas;

    public mainActivityPresenter(com.pmadera.mascotas.iMainActivity iMainActivity, Context context) {
        this.iMainActivity = iMainActivity;
        this.context = context;


    }

    @Override
    public void retornoMascotas() {
        oConstructorMascotas=new ConstructorMascotas(context);

        listaMascotas=oConstructorMascotas.retornarMascotas();

        mostrarMascotas();

    }

    @Override
    public void mostrarMascotas() {
        iMainActivity.inicializoAdaptador(iMainActivity.crearAdaptador(listaMascotas));
        iMainActivity.creoLayout();
    }


}
