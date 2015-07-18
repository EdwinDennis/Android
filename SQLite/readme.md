# Funciones Basicas SQLite : (CRUD)

```
 public void insertar(String nuevo_Nombre,String nuevo_Correo){
        valores=new ContentValues();

        valores.put(NAME,nuevo_Nombre);
        valores.put(CORREO,nuevo_Correo);

        sql.insert(TABLE_NAME, null, valores);
        valores=null;

        Log.d(DbHelper.TAG,"Se Insertaron Datos");
    }

```

```
  public void actualizar(String nuevoNombre,String nuevoCorreo,String idBusqueda){

        valores = new ContentValues();

        valores.put(NAME,nuevoNombre);
        valores.put(CORREO,nuevoCorreo);


        String condicion = ID+ " = ?";
        String[] parametro = { idBusqueda };

        sql.update(TABLE_NAME, valores, condicion, parametro);

        valores=null;
    }
```

```
      public void eliminar(String id){
        String condicion = ID + " = ?";
        String[] parametro = { id };

        sql.delete(TABLE_NAME, condicion, parametro);
    }
```


***

![Ejemplo](https://dl.dropboxusercontent.com/s/z0oi0wa6d40ixdr/layout-2015-07-17-175525.png?dl=0)

![](https://dl.dropboxusercontent.com/s/b5lvbs97bryqnod/LOG.PNG?dl=0)


