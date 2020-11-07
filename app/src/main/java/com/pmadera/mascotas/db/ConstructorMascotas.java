package com.pmadera.mascotas.db;

import android.content.ContentValues;
import android.content.Context;

import com.pmadera.mascotas.pojo.Mascota;

import java.util.ArrayList;

public class ConstructorMascotas {
    private Context context;

    public ConstructorMascotas(Context context) {
        this.context = context;
    }

    public ArrayList<Mascota> retornarMascotas(){
        BaseDatos db=new BaseDatos(context);

        return db.retornarMascotas();

    }

    public void darRating(Mascota pMascota){
        BaseDatos db=new BaseDatos(context);

        ContentValues contentValues=new ContentValues();
        contentValues.put(ConstantesDB.TABLA_MASCOTA_ID,pMascota.getId());
        contentValues.put(ConstantesDB.TABLA_MASCOTA_CANT_RATING,pMascota.getCantRaiting());
        db.darRating(contentValues);

    }

    public int obtenerRatingMascota(Mascota pMascota){
        BaseDatos db=new BaseDatos(context);

        return db.obtenerRatingMascota(pMascota);
    }

    public ArrayList<Mascota> retornar5MascotasMasRating(){
        BaseDatos db=new BaseDatos(context);

        return db.retornar5MascotasMasRating();
    }
}
