package com.acme.dennis.sqlite;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by DENNIS on 16/07/2015.
 */
public class DbHelper extends SQLiteOpenHelper {

    public static final String TAG="DB";
    public static String NAME_DATABASE="perfil.db";
    public static int VERCION=1;


    public DbHelper(Context context) {
        super(context, NAME_DATABASE, null, VERCION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        Log.d(TAG, "Creando Tabla");
        db.execSQL(CrudBd.SCRIPT_TABLA);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}



