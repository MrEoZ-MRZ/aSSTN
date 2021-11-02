package com.mrz.asstn;

import static com.mrz.asstn.dbHelper.CURSOS_COL;
import static com.mrz.asstn.dbHelper.DNI_COL;
import static com.mrz.asstn.dbHelper.GENERO_COL;
import static com.mrz.asstn.dbHelper.NOMBRE_Y_APPELIDO_COL;
import static com.mrz.asstn.dbHelper.PRESENTE_COL;
import static com.mrz.asstn.dbHelper.getTodaysTable;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class Cursos {

    //Añadir alumnos de Sexto "B" a la base de datos diaria
    //Se pueden agregar otros cursos tambien con la misma funcion
    public static void AñadirSextoB(Context ctx) {
        dbHelper dbhelp = new dbHelper(ctx);
        SQLiteDatabase db = dbhelp.getWritableDatabase();

//Elias Arredondo
        ContentValues values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "ELÍAS GERMÁN	ARREDONDO");
        values.put(DNI_COL, "44306594");
        values.put(CURSOS_COL, "6B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//Juan Pablo Bagnardi
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "JUAN PABLO BAGNARDI");
        values.put(DNI_COL, "44731531");
        values.put(CURSOS_COL, "6B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//SERGIO ANGEL BENTANCOUR
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "SERGIO ANGEL	BENTANCOUR");
        values.put(DNI_COL, "43827843");
        values.put(CURSOS_COL, "6B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//NAZARENO DANIEL BUSI
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "NAZARENO DANIEL BUSI");
        values.put(DNI_COL, "44306548");
        values.put(CURSOS_COL, "6B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//MARÍA SOLEDAD CABRERA
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "MARÍA SOLEDAD CABRERA");
        values.put(DNI_COL, "44525032");
        values.put(CURSOS_COL, "6B");
        values.put(GENERO_COL, "F");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//MARTÍN FACUNDO CAPOCCETTI
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "MARTÍN FACUNDO CAPOCCETTI");
        values.put(DNI_COL, "44781490");
        values.put(CURSOS_COL, "6B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//MÁXIMO SANTIAGO CHIA
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "MÁXIMO SANTIAGO CHIA");
        values.put(DNI_COL, "44629213");
        values.put(CURSOS_COL, "6B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//ESTEBAN NICOLÁS IVÁN CLAVIJO
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "ESTEBAN NICOLÁS IVÁN CLAVIJO");
        values.put(DNI_COL, "44290454");
        values.put(CURSOS_COL, "6B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//GUILLERMINA GUADALUPE	CÓRDOBA
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "GUILLERMINA GUADALUPE CÓRDOBA");
        values.put(DNI_COL, "44290480");
        values.put(CURSOS_COL, "6B");
        values.put(GENERO_COL, "F");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//MILAGROS LUCÍA CORNAGLIA
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "MILAGROS LUCÍA CORNAGLIA");
        values.put(DNI_COL, "44065983");
        values.put(CURSOS_COL, "6B");
        values.put(GENERO_COL, "F");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//BENJAMÍN JOSÉ MARÍA COSTANZO
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "BENJAMÍN JOSÉ MARÍA COSTANZO");
        values.put(DNI_COL, "44781435");
        values.put(CURSOS_COL, "6B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//IVO CROCI
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "IVO CROCI");
        values.put(DNI_COL, "44765934");
        values.put(CURSOS_COL, "6B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//LISET VALERIA	FERNANDEZ
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "LISET VALERIA FERNANDEZ");
        values.put(DNI_COL, "44781469");
        values.put(CURSOS_COL, "6B");
        values.put(GENERO_COL, "F");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//THÓMAS FERNANDEZ
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "THÓMAS FERNANDEZ");
        values.put(DNI_COL, "44630141");
        values.put(CURSOS_COL, "6B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//FRANCISCO BENJAMÍN FERNÁNDEZ
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "FRANCISCO BENJAMÍN FERNÁNDEZ");
        values.put(DNI_COL, "44865684");
        values.put(CURSOS_COL, "6B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//TOMÁS AGUSTÍN	FRANCO
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "TOMÁS AGUSTÍN FRANCO");
        values.put(DNI_COL, "44781614");
        values.put(CURSOS_COL, "6B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//VALENTÍN GALFRÉ
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "VALENTÍN GALFRÉ");
        values.put(DNI_COL, "44178584");
        values.put(CURSOS_COL, "6B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//LEONARDO EMANUEL GRANDE
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "LEONARDO EMANUEL GRANDE");
        values.put(DNI_COL, "44781488");
        values.put(CURSOS_COL, "6B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//ALEXIS RICARDO MAINA
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "ALEXIS RICARDO MAINA");
        values.put(DNI_COL, "44630054");
        values.put(CURSOS_COL, "6B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//SOFÍA MAGALÍ MARSÓ
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "SOFÍA MAGALÍ MARSÓ");
        values.put(DNI_COL, "44629383");
        values.put(CURSOS_COL, "6B");
        values.put(GENERO_COL, "F");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//DIEGO GABRIEL	MEDINA
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "DIEGO GABRIEL MEDINA");
        values.put(DNI_COL, "44777198");
        values.put(CURSOS_COL, "6B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//JOAQUIN RAFAEL NUÑEZ
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "JOAQUIN RAFAEL NUÑEZ");
        values.put(DNI_COL, "44781478");
        values.put(CURSOS_COL, "6B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//PAULA DANIELA	OSUNA
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "PAULA DANIELA	OSUNA");
        values.put(DNI_COL, "44178649");
        values.put(CURSOS_COL, "6B");
        values.put(GENERO_COL, "F");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//VIOLETA ETELVINA PIERINI PETROSINO
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "VIOLETA ETELVINA PIERINI PETROSINO");
        values.put(DNI_COL, "44178599");
        values.put(CURSOS_COL, "6B");
        values.put(GENERO_COL, "F");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//GUSTAVO EMILIANO POIRIER
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "GUSTAVO EMILIANO POIRIER");
        values.put(DNI_COL, "44731567");
        values.put(CURSOS_COL, "6B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//MATIAS NICOLAS RINALDI
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "MATIAS NICOLAS RINALDI");
        values.put(DNI_COL, "44178648");
        values.put(CURSOS_COL, "6B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);


//ORLANDO NICOLÁS ROMERO
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "ORLANDO NICOLÁS ROMERO");
        values.put(DNI_COL, "44865276");
        values.put(CURSOS_COL, "6B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//VICTOR ANDRÉS	RUIZ DIAZ
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "VICTOR ANDRÉS	RUIZ DIAZ");
        values.put(DNI_COL, "44765942");
        values.put(CURSOS_COL, "6B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//GABRIEL OCTAVIO RUSCITTI
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "GABRIEL OCTAVIO RUSCITTI");
        values.put(DNI_COL, "44306455");
        values.put(CURSOS_COL, "6B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//GONZALO NAHUEL RUSCITTI
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "GONZALO NAHUEL RUSCITTI");
        values.put(DNI_COL, "44306520");
        values.put(CURSOS_COL, "6B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//LAUTARO ELÍAS	SANTOS RIAL
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "LAUTARO ELÍAS SANTOS RIAL");
        values.put(DNI_COL, "44765908");
        values.put(CURSOS_COL, "6B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//ALESSANDRO GUILLERMO VARGAS
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "ALESSANDRO GUILLERMO	VARGAS");
        values.put(DNI_COL, "44290356");
        values.put(CURSOS_COL, "6B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//FRANCO VIVA
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "FRANCO VIVA");
        values.put(DNI_COL, "45058369");
        values.put(CURSOS_COL, "6B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//WALTER RUBÉN VIVAS
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "WALTER RUBÉN VIVAS");
        values.put(DNI_COL, "44630026");
        values.put(CURSOS_COL, "6B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//HERNÁN ALEJANDRO WILLENER
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "HERNÁN ALEJANDRO WILLENER");
        values.put(DNI_COL, "44064686");
        values.put(CURSOS_COL, "6B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

    }

    //Añadir alumnos de Quinto "B" a la base de datos diaria
    //Se pueden agregar otros cursos tambien con la misma funcion
    public static void AñadirQuintoB(Context ctx) {
        dbHelper dbhelp = new dbHelper(ctx);
        SQLiteDatabase db = dbhelp.getWritableDatabase();

//Elias Arredondo
        ContentValues values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "ELÍAS GERMÁN	ARREDONDO");
        values.put(DNI_COL, "44306594");
        values.put(CURSOS_COL, "6B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//Juan Pablo Bagnardi
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "JUAN PABLO BAGNARDI");
        values.put(DNI_COL, "44731531");
        values.put(CURSOS_COL, "6B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//SERGIO ANGEL BENTANCOUR
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "SERGIO ANGEL	BENTANCOUR");
        values.put(DNI_COL, "43827843");
        values.put(CURSOS_COL, "6B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//NAZARENO DANIEL BUSI
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "NAZARENO DANIEL BUSI");
        values.put(DNI_COL, "44306548");
        values.put(CURSOS_COL, "6B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//MARÍA SOLEDAD CABRERA
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "MARÍA SOLEDAD CABRERA");
        values.put(DNI_COL, "44525032");
        values.put(CURSOS_COL, "6B");
        values.put(GENERO_COL, "F");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//MARTÍN FACUNDO CAPOCCETTI
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "MARTÍN FACUNDO CAPOCCETTI");
        values.put(DNI_COL, "44781490");
        values.put(CURSOS_COL, "6B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//MÁXIMO SANTIAGO CHIA
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "MÁXIMO SANTIAGO CHIA");
        values.put(DNI_COL, "44629213");
        values.put(CURSOS_COL, "6B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//ESTEBAN NICOLÁS IVÁN CLAVIJO
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "ESTEBAN NICOLÁS IVÁN CLAVIJO");
        values.put(DNI_COL, "44290454");
        values.put(CURSOS_COL, "6B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//GUILLERMINA GUADALUPE	CÓRDOBA
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "GUILLERMINA GUADALUPE CÓRDOBA");
        values.put(DNI_COL, "44290480");
        values.put(CURSOS_COL, "6B");
        values.put(GENERO_COL, "F");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//MILAGROS LUCÍA CORNAGLIA
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "MILAGROS LUCÍA CORNAGLIA");
        values.put(DNI_COL, "44065983");
        values.put(CURSOS_COL, "6B");
        values.put(GENERO_COL, "F");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//BENJAMÍN JOSÉ MARÍA COSTANZO
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "BENJAMÍN JOSÉ MARÍA COSTANZO");
        values.put(DNI_COL, "44781435");
        values.put(CURSOS_COL, "6B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//IVO CROCI
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "IVO CROCI");
        values.put(DNI_COL, "44765934");
        values.put(CURSOS_COL, "6B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//LISET VALERIA	FERNANDEZ
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "LISET VALERIA FERNANDEZ");
        values.put(DNI_COL, "44781469");
        values.put(CURSOS_COL, "6B");
        values.put(GENERO_COL, "F");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//THÓMAS FERNANDEZ
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "THÓMAS FERNANDEZ");
        values.put(DNI_COL, "44630141");
        values.put(CURSOS_COL, "6B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//FRANCISCO BENJAMÍN FERNÁNDEZ
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "FRANCISCO BENJAMÍN FERNÁNDEZ");
        values.put(DNI_COL, "44865684");
        values.put(CURSOS_COL, "6B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//TOMÁS AGUSTÍN	FRANCO
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "TOMÁS AGUSTÍN FRANCO");
        values.put(DNI_COL, "44781614");
        values.put(CURSOS_COL, "6B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//VALENTÍN GALFRÉ
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "VALENTÍN GALFRÉ");
        values.put(DNI_COL, "44178584");
        values.put(CURSOS_COL, "6B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//LEONARDO EMANUEL GRANDE
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "LEONARDO EMANUEL GRANDE");
        values.put(DNI_COL, "44781488");
        values.put(CURSOS_COL, "6B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//ALEXIS RICARDO MAINA
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "ALEXIS RICARDO MAINA");
        values.put(DNI_COL, "44630054");
        values.put(CURSOS_COL, "6B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//SOFÍA MAGALÍ MARSÓ
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "SOFÍA MAGALÍ MARSÓ");
        values.put(DNI_COL, "44629383");
        values.put(CURSOS_COL, "6B");
        values.put(GENERO_COL, "F");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//DIEGO GABRIEL	MEDINA
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "DIEGO GABRIEL MEDINA");
        values.put(DNI_COL, "44777198");
        values.put(CURSOS_COL, "6B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//JOAQUIN RAFAEL NUÑEZ
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "JOAQUIN RAFAEL NUÑEZ");
        values.put(DNI_COL, "44781478");
        values.put(CURSOS_COL, "6B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//PAULA DANIELA	OSUNA
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "PAULA DANIELA	OSUNA");
        values.put(DNI_COL, "44178649");
        values.put(CURSOS_COL, "6B");
        values.put(GENERO_COL, "F");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//VIOLETA ETELVINA PIERINI PETROSINO
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "VIOLETA ETELVINA PIERINI PETROSINO");
        values.put(DNI_COL, "44178599");
        values.put(CURSOS_COL, "6B");
        values.put(GENERO_COL, "F");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//GUSTAVO EMILIANO POIRIER
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "GUSTAVO EMILIANO POIRIER");
        values.put(DNI_COL, "44731567");
        values.put(CURSOS_COL, "6B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//MATIAS NICOLAS RINALDI
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "MATIAS NICOLAS RINALDI");
        values.put(DNI_COL, "44178648");
        values.put(CURSOS_COL, "6B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);


//ORLANDO NICOLÁS ROMERO
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "ORLANDO NICOLÁS ROMERO");
        values.put(DNI_COL, "44865276");
        values.put(CURSOS_COL, "6B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//VICTOR ANDRÉS	RUIZ DIAZ
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "VICTOR ANDRÉS	RUIZ DIAZ");
        values.put(DNI_COL, "44765942");
        values.put(CURSOS_COL, "6B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//GABRIEL OCTAVIO RUSCITTI
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "GABRIEL OCTAVIO RUSCITTI");
        values.put(DNI_COL, "44306455");
        values.put(CURSOS_COL, "6B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//GONZALO NAHUEL RUSCITTI
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "GONZALO NAHUEL RUSCITTI");
        values.put(DNI_COL, "44306520");
        values.put(CURSOS_COL, "6B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//LAUTARO ELÍAS	SANTOS RIAL
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "LAUTARO ELÍAS SANTOS RIAL");
        values.put(DNI_COL, "44765908");
        values.put(CURSOS_COL, "6B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//ALESSANDRO GUILLERMO VARGAS
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "ALESSANDRO GUILLERMO	VARGAS");
        values.put(DNI_COL, "44290356");
        values.put(CURSOS_COL, "6B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//FRANCO VIVA
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "FRANCO VIVA");
        values.put(DNI_COL, "45058369");
        values.put(CURSOS_COL, "6B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//WALTER RUBÉN VIVAS
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "WALTER RUBÉN VIVAS");
        values.put(DNI_COL, "44630026");
        values.put(CURSOS_COL, "6B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//HERNÁN ALEJANDRO WILLENER
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "HERNÁN ALEJANDRO WILLENER");
        values.put(DNI_COL, "44064686");
        values.put(CURSOS_COL, "6B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

    }

    //Añadir alumnos de Cuarto "B" a la base de datos diaria
    //Se pueden agregar otros cursos tambien con la misma funcion
    public static void AñadirCuartoB(Context ctx) {
        dbHelper dbhelp = new dbHelper(ctx);
        SQLiteDatabase db = dbhelp.getWritableDatabase();

//Elias Arredondo
        ContentValues values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "ELÍAS GERMÁN	ARREDONDO");
        values.put(DNI_COL, "44306594");
        values.put(CURSOS_COL, "6B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//Juan Pablo Bagnardi
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "JUAN PABLO BAGNARDI");
        values.put(DNI_COL, "44731531");
        values.put(CURSOS_COL, "6B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//SERGIO ANGEL BENTANCOUR
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "SERGIO ANGEL	BENTANCOUR");
        values.put(DNI_COL, "43827843");
        values.put(CURSOS_COL, "6B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//NAZARENO DANIEL BUSI
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "NAZARENO DANIEL BUSI");
        values.put(DNI_COL, "44306548");
        values.put(CURSOS_COL, "6B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//MARÍA SOLEDAD CABRERA
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "MARÍA SOLEDAD CABRERA");
        values.put(DNI_COL, "44525032");
        values.put(CURSOS_COL, "6B");
        values.put(GENERO_COL, "F");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//MARTÍN FACUNDO CAPOCCETTI
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "MARTÍN FACUNDO CAPOCCETTI");
        values.put(DNI_COL, "44781490");
        values.put(CURSOS_COL, "6B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//MÁXIMO SANTIAGO CHIA
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "MÁXIMO SANTIAGO CHIA");
        values.put(DNI_COL, "44629213");
        values.put(CURSOS_COL, "6B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//ESTEBAN NICOLÁS IVÁN CLAVIJO
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "ESTEBAN NICOLÁS IVÁN CLAVIJO");
        values.put(DNI_COL, "44290454");
        values.put(CURSOS_COL, "6B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//GUILLERMINA GUADALUPE	CÓRDOBA
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "GUILLERMINA GUADALUPE CÓRDOBA");
        values.put(DNI_COL, "44290480");
        values.put(CURSOS_COL, "6B");
        values.put(GENERO_COL, "F");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//MILAGROS LUCÍA CORNAGLIA
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "MILAGROS LUCÍA CORNAGLIA");
        values.put(DNI_COL, "44065983");
        values.put(CURSOS_COL, "6B");
        values.put(GENERO_COL, "F");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//BENJAMÍN JOSÉ MARÍA COSTANZO
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "BENJAMÍN JOSÉ MARÍA COSTANZO");
        values.put(DNI_COL, "44781435");
        values.put(CURSOS_COL, "6B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//IVO CROCI
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "IVO CROCI");
        values.put(DNI_COL, "44765934");
        values.put(CURSOS_COL, "6B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//LISET VALERIA	FERNANDEZ
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "LISET VALERIA FERNANDEZ");
        values.put(DNI_COL, "44781469");
        values.put(CURSOS_COL, "6B");
        values.put(GENERO_COL, "F");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//THÓMAS FERNANDEZ
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "THÓMAS FERNANDEZ");
        values.put(DNI_COL, "44630141");
        values.put(CURSOS_COL, "6B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//FRANCISCO BENJAMÍN FERNÁNDEZ
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "FRANCISCO BENJAMÍN FERNÁNDEZ");
        values.put(DNI_COL, "44865684");
        values.put(CURSOS_COL, "6B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//TOMÁS AGUSTÍN	FRANCO
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "TOMÁS AGUSTÍN FRANCO");
        values.put(DNI_COL, "44781614");
        values.put(CURSOS_COL, "6B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//VALENTÍN GALFRÉ
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "VALENTÍN GALFRÉ");
        values.put(DNI_COL, "44178584");
        values.put(CURSOS_COL, "6B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//LEONARDO EMANUEL GRANDE
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "LEONARDO EMANUEL GRANDE");
        values.put(DNI_COL, "44781488");
        values.put(CURSOS_COL, "6B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//ALEXIS RICARDO MAINA
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "ALEXIS RICARDO MAINA");
        values.put(DNI_COL, "44630054");
        values.put(CURSOS_COL, "6B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//SOFÍA MAGALÍ MARSÓ
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "SOFÍA MAGALÍ MARSÓ");
        values.put(DNI_COL, "44629383");
        values.put(CURSOS_COL, "6B");
        values.put(GENERO_COL, "F");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//DIEGO GABRIEL	MEDINA
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "DIEGO GABRIEL MEDINA");
        values.put(DNI_COL, "44777198");
        values.put(CURSOS_COL, "6B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//JOAQUIN RAFAEL NUÑEZ
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "JOAQUIN RAFAEL NUÑEZ");
        values.put(DNI_COL, "44781478");
        values.put(CURSOS_COL, "6B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//PAULA DANIELA	OSUNA
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "PAULA DANIELA	OSUNA");
        values.put(DNI_COL, "44178649");
        values.put(CURSOS_COL, "6B");
        values.put(GENERO_COL, "F");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//VIOLETA ETELVINA PIERINI PETROSINO
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "VIOLETA ETELVINA PIERINI PETROSINO");
        values.put(DNI_COL, "44178599");
        values.put(CURSOS_COL, "6B");
        values.put(GENERO_COL, "F");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//GUSTAVO EMILIANO POIRIER
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "GUSTAVO EMILIANO POIRIER");
        values.put(DNI_COL, "44731567");
        values.put(CURSOS_COL, "6B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//MATIAS NICOLAS RINALDI
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "MATIAS NICOLAS RINALDI");
        values.put(DNI_COL, "44178648");
        values.put(CURSOS_COL, "6B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);


//ORLANDO NICOLÁS ROMERO
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "ORLANDO NICOLÁS ROMERO");
        values.put(DNI_COL, "44865276");
        values.put(CURSOS_COL, "6B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//VICTOR ANDRÉS	RUIZ DIAZ
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "VICTOR ANDRÉS	RUIZ DIAZ");
        values.put(DNI_COL, "44765942");
        values.put(CURSOS_COL, "6B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//GABRIEL OCTAVIO RUSCITTI
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "GABRIEL OCTAVIO RUSCITTI");
        values.put(DNI_COL, "44306455");
        values.put(CURSOS_COL, "6B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//GONZALO NAHUEL RUSCITTI
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "GONZALO NAHUEL RUSCITTI");
        values.put(DNI_COL, "44306520");
        values.put(CURSOS_COL, "6B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//LAUTARO ELÍAS	SANTOS RIAL
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "LAUTARO ELÍAS SANTOS RIAL");
        values.put(DNI_COL, "44765908");
        values.put(CURSOS_COL, "6B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//ALESSANDRO GUILLERMO VARGAS
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "ALESSANDRO GUILLERMO	VARGAS");
        values.put(DNI_COL, "44290356");
        values.put(CURSOS_COL, "6B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//FRANCO VIVA
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "FRANCO VIVA");
        values.put(DNI_COL, "45058369");
        values.put(CURSOS_COL, "6B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//WALTER RUBÉN VIVAS
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "WALTER RUBÉN VIVAS");
        values.put(DNI_COL, "44630026");
        values.put(CURSOS_COL, "6B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//HERNÁN ALEJANDRO WILLENER
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "HERNÁN ALEJANDRO WILLENER");
        values.put(DNI_COL, "44064686");
        values.put(CURSOS_COL, "6B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

    }

    //Añadir alumnos de Sexto "B" a la base de datos diaria
    //Se pueden agregar otros cursos tambien con la misma funcion
    public static void AñadirTerceroB(Context ctx) {
        dbHelper dbhelp = new dbHelper(ctx);
        SQLiteDatabase db = dbhelp.getWritableDatabase();

//Elias Arredondo
        ContentValues values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "ELÍAS GERMÁN	ARREDONDO");
        values.put(DNI_COL, "44306594");
        values.put(CURSOS_COL, "6B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//Juan Pablo Bagnardi
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "JUAN PABLO BAGNARDI");
        values.put(DNI_COL, "44731531");
        values.put(CURSOS_COL, "6B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//SERGIO ANGEL BENTANCOUR
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "SERGIO ANGEL	BENTANCOUR");
        values.put(DNI_COL, "43827843");
        values.put(CURSOS_COL, "6B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//NAZARENO DANIEL BUSI
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "NAZARENO DANIEL BUSI");
        values.put(DNI_COL, "44306548");
        values.put(CURSOS_COL, "6B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//MARÍA SOLEDAD CABRERA
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "MARÍA SOLEDAD CABRERA");
        values.put(DNI_COL, "44525032");
        values.put(CURSOS_COL, "6B");
        values.put(GENERO_COL, "F");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//MARTÍN FACUNDO CAPOCCETTI
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "MARTÍN FACUNDO CAPOCCETTI");
        values.put(DNI_COL, "44781490");
        values.put(CURSOS_COL, "6B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//MÁXIMO SANTIAGO CHIA
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "MÁXIMO SANTIAGO CHIA");
        values.put(DNI_COL, "44629213");
        values.put(CURSOS_COL, "6B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//ESTEBAN NICOLÁS IVÁN CLAVIJO
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "ESTEBAN NICOLÁS IVÁN CLAVIJO");
        values.put(DNI_COL, "44290454");
        values.put(CURSOS_COL, "6B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//GUILLERMINA GUADALUPE	CÓRDOBA
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "GUILLERMINA GUADALUPE CÓRDOBA");
        values.put(DNI_COL, "44290480");
        values.put(CURSOS_COL, "6B");
        values.put(GENERO_COL, "F");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//MILAGROS LUCÍA CORNAGLIA
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "MILAGROS LUCÍA CORNAGLIA");
        values.put(DNI_COL, "44065983");
        values.put(CURSOS_COL, "6B");
        values.put(GENERO_COL, "F");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//BENJAMÍN JOSÉ MARÍA COSTANZO
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "BENJAMÍN JOSÉ MARÍA COSTANZO");
        values.put(DNI_COL, "44781435");
        values.put(CURSOS_COL, "6B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//IVO CROCI
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "IVO CROCI");
        values.put(DNI_COL, "44765934");
        values.put(CURSOS_COL, "6B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//LISET VALERIA	FERNANDEZ
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "LISET VALERIA FERNANDEZ");
        values.put(DNI_COL, "44781469");
        values.put(CURSOS_COL, "6B");
        values.put(GENERO_COL, "F");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//THÓMAS FERNANDEZ
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "THÓMAS FERNANDEZ");
        values.put(DNI_COL, "44630141");
        values.put(CURSOS_COL, "6B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//FRANCISCO BENJAMÍN FERNÁNDEZ
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "FRANCISCO BENJAMÍN FERNÁNDEZ");
        values.put(DNI_COL, "44865684");
        values.put(CURSOS_COL, "6B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//TOMÁS AGUSTÍN	FRANCO
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "TOMÁS AGUSTÍN FRANCO");
        values.put(DNI_COL, "44781614");
        values.put(CURSOS_COL, "6B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//VALENTÍN GALFRÉ
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "VALENTÍN GALFRÉ");
        values.put(DNI_COL, "44178584");
        values.put(CURSOS_COL, "6B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//LEONARDO EMANUEL GRANDE
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "LEONARDO EMANUEL GRANDE");
        values.put(DNI_COL, "44781488");
        values.put(CURSOS_COL, "6B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//ALEXIS RICARDO MAINA
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "ALEXIS RICARDO MAINA");
        values.put(DNI_COL, "44630054");
        values.put(CURSOS_COL, "6B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//SOFÍA MAGALÍ MARSÓ
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "SOFÍA MAGALÍ MARSÓ");
        values.put(DNI_COL, "44629383");
        values.put(CURSOS_COL, "6B");
        values.put(GENERO_COL, "F");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//DIEGO GABRIEL	MEDINA
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "DIEGO GABRIEL MEDINA");
        values.put(DNI_COL, "44777198");
        values.put(CURSOS_COL, "6B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//JOAQUIN RAFAEL NUÑEZ
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "JOAQUIN RAFAEL NUÑEZ");
        values.put(DNI_COL, "44781478");
        values.put(CURSOS_COL, "6B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//PAULA DANIELA	OSUNA
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "PAULA DANIELA	OSUNA");
        values.put(DNI_COL, "44178649");
        values.put(CURSOS_COL, "6B");
        values.put(GENERO_COL, "F");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//VIOLETA ETELVINA PIERINI PETROSINO
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "VIOLETA ETELVINA PIERINI PETROSINO");
        values.put(DNI_COL, "44178599");
        values.put(CURSOS_COL, "6B");
        values.put(GENERO_COL, "F");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//GUSTAVO EMILIANO POIRIER
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "GUSTAVO EMILIANO POIRIER");
        values.put(DNI_COL, "44731567");
        values.put(CURSOS_COL, "6B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//MATIAS NICOLAS RINALDI
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "MATIAS NICOLAS RINALDI");
        values.put(DNI_COL, "44178648");
        values.put(CURSOS_COL, "6B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);


//ORLANDO NICOLÁS ROMERO
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "ORLANDO NICOLÁS ROMERO");
        values.put(DNI_COL, "44865276");
        values.put(CURSOS_COL, "6B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//VICTOR ANDRÉS	RUIZ DIAZ
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "VICTOR ANDRÉS	RUIZ DIAZ");
        values.put(DNI_COL, "44765942");
        values.put(CURSOS_COL, "6B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//GABRIEL OCTAVIO RUSCITTI
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "GABRIEL OCTAVIO RUSCITTI");
        values.put(DNI_COL, "44306455");
        values.put(CURSOS_COL, "6B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//GONZALO NAHUEL RUSCITTI
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "GONZALO NAHUEL RUSCITTI");
        values.put(DNI_COL, "44306520");
        values.put(CURSOS_COL, "6B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//LAUTARO ELÍAS	SANTOS RIAL
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "LAUTARO ELÍAS SANTOS RIAL");
        values.put(DNI_COL, "44765908");
        values.put(CURSOS_COL, "6B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//ALESSANDRO GUILLERMO VARGAS
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "ALESSANDRO GUILLERMO	VARGAS");
        values.put(DNI_COL, "44290356");
        values.put(CURSOS_COL, "6B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//FRANCO VIVA
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "FRANCO VIVA");
        values.put(DNI_COL, "45058369");
        values.put(CURSOS_COL, "6B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//WALTER RUBÉN VIVAS
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "WALTER RUBÉN VIVAS");
        values.put(DNI_COL, "44630026");
        values.put(CURSOS_COL, "6B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//HERNÁN ALEJANDRO WILLENER
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "HERNÁN ALEJANDRO WILLENER");
        values.put(DNI_COL, "44064686");
        values.put(CURSOS_COL, "6B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

    }

    //Añadir alumnos de Sexto "B" a la base de datos diaria
    //Se pueden agregar otros cursos tambien con la misma funcion
    public static void AñadirSegundoB(Context ctx) {
        dbHelper dbhelp = new dbHelper(ctx);
        SQLiteDatabase db = dbhelp.getWritableDatabase();

//Elias Arredondo
        ContentValues values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "ELÍAS GERMÁN	ARREDONDO");
        values.put(DNI_COL, "44306594");
        values.put(CURSOS_COL, "6B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//Juan Pablo Bagnardi
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "JUAN PABLO BAGNARDI");
        values.put(DNI_COL, "44731531");
        values.put(CURSOS_COL, "6B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//SERGIO ANGEL BENTANCOUR
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "SERGIO ANGEL	BENTANCOUR");
        values.put(DNI_COL, "43827843");
        values.put(CURSOS_COL, "6B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//NAZARENO DANIEL BUSI
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "NAZARENO DANIEL BUSI");
        values.put(DNI_COL, "44306548");
        values.put(CURSOS_COL, "6B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//MARÍA SOLEDAD CABRERA
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "MARÍA SOLEDAD CABRERA");
        values.put(DNI_COL, "44525032");
        values.put(CURSOS_COL, "6B");
        values.put(GENERO_COL, "F");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//MARTÍN FACUNDO CAPOCCETTI
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "MARTÍN FACUNDO CAPOCCETTI");
        values.put(DNI_COL, "44781490");
        values.put(CURSOS_COL, "6B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//MÁXIMO SANTIAGO CHIA
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "MÁXIMO SANTIAGO CHIA");
        values.put(DNI_COL, "44629213");
        values.put(CURSOS_COL, "6B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//ESTEBAN NICOLÁS IVÁN CLAVIJO
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "ESTEBAN NICOLÁS IVÁN CLAVIJO");
        values.put(DNI_COL, "44290454");
        values.put(CURSOS_COL, "6B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//GUILLERMINA GUADALUPE	CÓRDOBA
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "GUILLERMINA GUADALUPE CÓRDOBA");
        values.put(DNI_COL, "44290480");
        values.put(CURSOS_COL, "6B");
        values.put(GENERO_COL, "F");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//MILAGROS LUCÍA CORNAGLIA
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "MILAGROS LUCÍA CORNAGLIA");
        values.put(DNI_COL, "44065983");
        values.put(CURSOS_COL, "6B");
        values.put(GENERO_COL, "F");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//BENJAMÍN JOSÉ MARÍA COSTANZO
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "BENJAMÍN JOSÉ MARÍA COSTANZO");
        values.put(DNI_COL, "44781435");
        values.put(CURSOS_COL, "6B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//IVO CROCI
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "IVO CROCI");
        values.put(DNI_COL, "44765934");
        values.put(CURSOS_COL, "6B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//LISET VALERIA	FERNANDEZ
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "LISET VALERIA FERNANDEZ");
        values.put(DNI_COL, "44781469");
        values.put(CURSOS_COL, "6B");
        values.put(GENERO_COL, "F");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//THÓMAS FERNANDEZ
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "THÓMAS FERNANDEZ");
        values.put(DNI_COL, "44630141");
        values.put(CURSOS_COL, "6B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//FRANCISCO BENJAMÍN FERNÁNDEZ
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "FRANCISCO BENJAMÍN FERNÁNDEZ");
        values.put(DNI_COL, "44865684");
        values.put(CURSOS_COL, "6B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//TOMÁS AGUSTÍN	FRANCO
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "TOMÁS AGUSTÍN FRANCO");
        values.put(DNI_COL, "44781614");
        values.put(CURSOS_COL, "6B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//VALENTÍN GALFRÉ
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "VALENTÍN GALFRÉ");
        values.put(DNI_COL, "44178584");
        values.put(CURSOS_COL, "6B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//LEONARDO EMANUEL GRANDE
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "LEONARDO EMANUEL GRANDE");
        values.put(DNI_COL, "44781488");
        values.put(CURSOS_COL, "6B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//ALEXIS RICARDO MAINA
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "ALEXIS RICARDO MAINA");
        values.put(DNI_COL, "44630054");
        values.put(CURSOS_COL, "6B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//SOFÍA MAGALÍ MARSÓ
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "SOFÍA MAGALÍ MARSÓ");
        values.put(DNI_COL, "44629383");
        values.put(CURSOS_COL, "6B");
        values.put(GENERO_COL, "F");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//DIEGO GABRIEL	MEDINA
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "DIEGO GABRIEL MEDINA");
        values.put(DNI_COL, "44777198");
        values.put(CURSOS_COL, "6B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//JOAQUIN RAFAEL NUÑEZ
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "JOAQUIN RAFAEL NUÑEZ");
        values.put(DNI_COL, "44781478");
        values.put(CURSOS_COL, "6B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//PAULA DANIELA	OSUNA
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "PAULA DANIELA	OSUNA");
        values.put(DNI_COL, "44178649");
        values.put(CURSOS_COL, "6B");
        values.put(GENERO_COL, "F");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//VIOLETA ETELVINA PIERINI PETROSINO
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "VIOLETA ETELVINA PIERINI PETROSINO");
        values.put(DNI_COL, "44178599");
        values.put(CURSOS_COL, "6B");
        values.put(GENERO_COL, "F");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//GUSTAVO EMILIANO POIRIER
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "GUSTAVO EMILIANO POIRIER");
        values.put(DNI_COL, "44731567");
        values.put(CURSOS_COL, "6B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//MATIAS NICOLAS RINALDI
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "MATIAS NICOLAS RINALDI");
        values.put(DNI_COL, "44178648");
        values.put(CURSOS_COL, "6B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);


//ORLANDO NICOLÁS ROMERO
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "ORLANDO NICOLÁS ROMERO");
        values.put(DNI_COL, "44865276");
        values.put(CURSOS_COL, "6B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//VICTOR ANDRÉS	RUIZ DIAZ
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "VICTOR ANDRÉS	RUIZ DIAZ");
        values.put(DNI_COL, "44765942");
        values.put(CURSOS_COL, "6B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//GABRIEL OCTAVIO RUSCITTI
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "GABRIEL OCTAVIO RUSCITTI");
        values.put(DNI_COL, "44306455");
        values.put(CURSOS_COL, "6B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//GONZALO NAHUEL RUSCITTI
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "GONZALO NAHUEL RUSCITTI");
        values.put(DNI_COL, "44306520");
        values.put(CURSOS_COL, "6B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//LAUTARO ELÍAS	SANTOS RIAL
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "LAUTARO ELÍAS SANTOS RIAL");
        values.put(DNI_COL, "44765908");
        values.put(CURSOS_COL, "6B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//ALESSANDRO GUILLERMO VARGAS
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "ALESSANDRO GUILLERMO	VARGAS");
        values.put(DNI_COL, "44290356");
        values.put(CURSOS_COL, "6B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//FRANCO VIVA
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "FRANCO VIVA");
        values.put(DNI_COL, "45058369");
        values.put(CURSOS_COL, "6B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//WALTER RUBÉN VIVAS
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "WALTER RUBÉN VIVAS");
        values.put(DNI_COL, "44630026");
        values.put(CURSOS_COL, "6B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//HERNÁN ALEJANDRO WILLENER
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "HERNÁN ALEJANDRO WILLENER");
        values.put(DNI_COL, "44064686");
        values.put(CURSOS_COL, "6B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);
    }
}
