package com.acme.dennis.sqlite;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CrudBd db=new CrudBd(this);
        db.insertar("edwin","edwindennis@hotmail.com");
       // db.actualizar("pedro","pedro@hotmail.com","1");
      //  db.eliminar("1");
        db.consultarDatos();



    }

}
