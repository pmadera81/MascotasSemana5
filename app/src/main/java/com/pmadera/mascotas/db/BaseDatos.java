package com.pmadera.mascotas.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import com.pmadera.mascotas.R;
import com.pmadera.mascotas.pojo.Mascota;

import java.util.ArrayList;

public class BaseDatos extends SQLiteOpenHelper {
    private Context context;

    public BaseDatos(@Nullable Context context) {
        super(context,ConstantesDB.DATABASE_NAME,null, ConstantesDB.DATABASE_VERSION);

        this.context=context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        String crearTablaMascota="create table " + ConstantesDB.TABLA_MASCOTA
                + "(" + ConstantesDB.TABLA_MASCOTA_ID           + " integer primary key autoincrement,"
                +  ConstantesDB.TABLA_MASCOTA_NOMBRE            + " text not null,"
                +  ConstantesDB.TABLA_MASCOTA_RAZA              + " text not null,"
                +  ConstantesDB.TABLA_MASCOTA_ANIO_NACIMIENTO   + " integer not null,"
                +  ConstantesDB.TABLA_MASCOTA_COLOR_PELO        + " text not null,"
                +  ConstantesDB.TABLA_MASCOTA_FOTO              + " integer not null,"
                +  ConstantesDB.TABLA_MASCOTA_CANT_RATING       + " integer not null"
                + ")";

        db.execSQL(crearTablaMascota);

        //despues de crearla ya la cargo con los datos iniciales
        ContentValues contentValues=new ContentValues();

        contentValues.put(ConstantesDB.TABLA_MASCOTA_NOMBRE,"Bimba");
        contentValues.put(ConstantesDB.TABLA_MASCOTA_RAZA,"Labrador");
        contentValues.put(ConstantesDB.TABLA_MASCOTA_ANIO_NACIMIENTO,2020);
        contentValues.put(ConstantesDB.TABLA_MASCOTA_COLOR_PELO,"Amarillo");
        contentValues.put(ConstantesDB.TABLA_MASCOTA_FOTO, R.drawable.bimba);
        contentValues.put(ConstantesDB.TABLA_MASCOTA_CANT_RATING, 0);
        insertoMascota(contentValues,db);

        contentValues.put(ConstantesDB.TABLA_MASCOTA_NOMBRE,"Chico");
        contentValues.put(ConstantesDB.TABLA_MASCOTA_RAZA,"Beagle");
        contentValues.put(ConstantesDB.TABLA_MASCOTA_ANIO_NACIMIENTO,2010);
        contentValues.put(ConstantesDB.TABLA_MASCOTA_COLOR_PELO,"Blanco");
        contentValues.put(ConstantesDB.TABLA_MASCOTA_FOTO, R.drawable.chico);
        contentValues.put(ConstantesDB.TABLA_MASCOTA_CANT_RATING, 0);
        insertoMascota(contentValues,db);

        contentValues.put(ConstantesDB.TABLA_MASCOTA_NOMBRE,"Chiqui");
        contentValues.put(ConstantesDB.TABLA_MASCOTA_RAZA,"Golden Retriever");
        contentValues.put(ConstantesDB.TABLA_MASCOTA_ANIO_NACIMIENTO,2008);
        contentValues.put(ConstantesDB.TABLA_MASCOTA_COLOR_PELO,"Amarillo");
        contentValues.put(ConstantesDB.TABLA_MASCOTA_FOTO, R.drawable.chiqui);
        contentValues.put(ConstantesDB.TABLA_MASCOTA_CANT_RATING, 0);
        insertoMascota(contentValues,db);

        contentValues.put(ConstantesDB.TABLA_MASCOTA_NOMBRE,"Coco");
        contentValues.put(ConstantesDB.TABLA_MASCOTA_RAZA,"Dálmata");
        contentValues.put(ConstantesDB.TABLA_MASCOTA_ANIO_NACIMIENTO,2012);
        contentValues.put(ConstantesDB.TABLA_MASCOTA_COLOR_PELO,"Blanco y negro");
        contentValues.put(ConstantesDB.TABLA_MASCOTA_FOTO, R.drawable.coco);
        contentValues.put(ConstantesDB.TABLA_MASCOTA_CANT_RATING, 0);
        insertoMascota(contentValues,db);

        contentValues.put(ConstantesDB.TABLA_MASCOTA_NOMBRE,"Luna");
        contentValues.put(ConstantesDB.TABLA_MASCOTA_RAZA,"Boxer");
        contentValues.put(ConstantesDB.TABLA_MASCOTA_ANIO_NACIMIENTO,2014);
        contentValues.put(ConstantesDB.TABLA_MASCOTA_COLOR_PELO,"Negro");
        contentValues.put(ConstantesDB.TABLA_MASCOTA_FOTO, R.drawable.luna);
        contentValues.put(ConstantesDB.TABLA_MASCOTA_CANT_RATING, 0);
        insertoMascota(contentValues,db);

        contentValues.put(ConstantesDB.TABLA_MASCOTA_NOMBRE,"Mico");
        contentValues.put(ConstantesDB.TABLA_MASCOTA_RAZA,"Cocker Spaniel");
        contentValues.put(ConstantesDB.TABLA_MASCOTA_ANIO_NACIMIENTO,2018);
        contentValues.put(ConstantesDB.TABLA_MASCOTA_COLOR_PELO,"Blanco");
        contentValues.put(ConstantesDB.TABLA_MASCOTA_FOTO, R.drawable.mico);
        contentValues.put(ConstantesDB.TABLA_MASCOTA_CANT_RATING, 0);
        insertoMascota(contentValues,db);

        contentValues.put(ConstantesDB.TABLA_MASCOTA_NOMBRE,"Rocky");
        contentValues.put(ConstantesDB.TABLA_MASCOTA_RAZA,"Chihuahua");
        contentValues.put(ConstantesDB.TABLA_MASCOTA_ANIO_NACIMIENTO,2015);
        contentValues.put(ConstantesDB.TABLA_MASCOTA_COLOR_PELO,"Gris");
        contentValues.put(ConstantesDB.TABLA_MASCOTA_FOTO, R.drawable.rocky);
        contentValues.put(ConstantesDB.TABLA_MASCOTA_CANT_RATING, 0);
        insertoMascota(contentValues,db);


        contentValues.put(ConstantesDB.TABLA_MASCOTA_NOMBRE,"Simba");
        contentValues.put(ConstantesDB.TABLA_MASCOTA_RAZA,"Pug");
        contentValues.put(ConstantesDB.TABLA_MASCOTA_ANIO_NACIMIENTO,2013);
        contentValues.put(ConstantesDB.TABLA_MASCOTA_COLOR_PELO,"Amarillo");
        contentValues.put(ConstantesDB.TABLA_MASCOTA_FOTO, R.drawable.simba);
        contentValues.put(ConstantesDB.TABLA_MASCOTA_CANT_RATING, 0);
        insertoMascota(contentValues,db);

        contentValues.put(ConstantesDB.TABLA_MASCOTA_NOMBRE,"Toby");
        contentValues.put(ConstantesDB.TABLA_MASCOTA_RAZA,"Border Collie");
        contentValues.put(ConstantesDB.TABLA_MASCOTA_ANIO_NACIMIENTO,2019);
        contentValues.put(ConstantesDB.TABLA_MASCOTA_COLOR_PELO,"Amarillo");
        contentValues.put(ConstantesDB.TABLA_MASCOTA_FOTO, R.drawable.toby);
        contentValues.put(ConstantesDB.TABLA_MASCOTA_CANT_RATING, 0);
        insertoMascota(contentValues,db);

        //db.close();

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("DROP TABLE IF EXISTS " + ConstantesDB.TABLA_MASCOTA);

        onCreate(db);
    }

    private void insertoMascota(ContentValues contentValues,SQLiteDatabase db){

        db.insert(ConstantesDB.TABLA_MASCOTA, null, contentValues);

    }


    public ArrayList<Mascota> retornarMascotas(){
        ArrayList<Mascota> listaMascotas=new ArrayList<>();

        String consulta="select * from " + ConstantesDB.TABLA_MASCOTA
                    + " order by " + ConstantesDB.TABLA_MASCOTA_ID;
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor registros=db.rawQuery(consulta,null);


        while (registros.moveToNext()){
            Mascota oMascota=new Mascota(registros.getInt(0),registros.getString(1),registros.getString(2),
                    registros.getInt(3),registros.getString(4),registros.getInt(5),registros.getInt(6));

            listaMascotas.add(oMascota);
        }


        db.close();


        return listaMascotas;
    }

    public void darRating(ContentValues contentValues){
        SQLiteDatabase db = this.getWritableDatabase();

        db.update(ConstantesDB.TABLA_MASCOTA,contentValues," id=" + contentValues.get(ConstantesDB.TABLA_MASCOTA_ID),null);

        db.close();
    }

    public int obtenerRatingMascota(Mascota pMascota){
        int rating=0;

        String consulta="select " + ConstantesDB.TABLA_MASCOTA_CANT_RATING + " from " + ConstantesDB.TABLA_MASCOTA
                + " where " + ConstantesDB.TABLA_MASCOTA_ID + "=" + pMascota.getId();

        SQLiteDatabase db=this.getWritableDatabase();
        Cursor registro=db.rawQuery(consulta,null);

        if(registro.moveToNext()){
            rating=registro.getInt(0);
        }


        db.close();


        return rating;

    }

    public ArrayList<Mascota> retornar5MascotasMasRating(){
        ArrayList<Mascota> listaMascotas=new ArrayList<>();

        String consulta="select * from " + ConstantesDB.TABLA_MASCOTA
                + " order by " + ConstantesDB.TABLA_MASCOTA_CANT_RATING + " desc limit 5";
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor registros=db.rawQuery(consulta,null);


        while (registros.moveToNext()){

            //EN CASO DE NO TENER RATING NO LO MUESTRO
            if(registros.getInt(6)>0) {

                Mascota oMascota = new Mascota(registros.getInt(0), registros.getString(1), registros.getString(2),
                        registros.getInt(3), registros.getString(4), registros.getInt(5), registros.getInt(6));

                listaMascotas.add(oMascota);
            }
        }


        db.close();


        return listaMascotas;
    }

}
