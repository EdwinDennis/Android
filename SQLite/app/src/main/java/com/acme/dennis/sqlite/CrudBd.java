package com.acme.dennis.sqlite;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.provider.BaseColumns;
import android.util.Log;


/**
 * Created by DENNIS on 16/07/2015.
 */
public class CrudBd {


    private SQLiteDatabase sql;
    private DbHelper helper;
    private ContentValues valores;


    public static final String TABLE_NAME="perfil";
    //columns
    public static final String ID= BaseColumns._ID;
    public static final String NAME="name";
    public static final String CORREO="correo";

    public static final String SCRIPT_TABLA=
            "create table "+TABLE_NAME+"("+
            ID+" "+"integer primary key autoincrement, "+
            NAME+" "+"text, "+
            CORREO+" "+"text )";


    public CrudBd(Context context){

        helper=new DbHelper(context);
        sql=helper.getWritableDatabase();

    }



    public void insertar(String nuevo_Nombre,String nuevo_Correo){
        valores=new ContentValues();

        valores.put(NAME,nuevo_Nombre);
        valores.put(CORREO,nuevo_Correo);

        sql.insert(TABLE_NAME, null, valores);
        valores=null;

        Log.d(DbHelper.TAG,"Se Insertaron Datos");
    }

    public Cursor retornarCursor(){

        return  sql.rawQuery("select * from " + TABLE_NAME, null);

    }
    
    public void consultarDatos(){
        Cursor c=retornarCursor();
        
        while(c.moveToNext()){
            Log.d(DbHelper.TAG, c.getString(1)+",");
            Log.d(DbHelper.TAG, c.getString(2));
        }
            
    }
    

    public void eliminar(String id){
        String condicion = ID + " = ?";
        String[] parametro = { id };

        sql.delete(TABLE_NAME, condicion, parametro);
    }

    public void actualizar(String nuevoNombre,String nuevoCorreo,String idBusqueda){

        valores = new ContentValues();

        valores.put(NAME,nuevoNombre);
        valores.put(CORREO,nuevoCorreo);


        String condicion = ID+ " = ?";
        String[] parametro = { idBusqueda };

        sql.update(TABLE_NAME, valores, condicion, parametro);

        valores=null;
    }

}
