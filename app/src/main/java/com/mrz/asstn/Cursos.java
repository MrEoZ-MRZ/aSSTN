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

//LUCAS FABRICIO BENITO
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "LUCAS FABRICIO BENITO");
        values.put(DNI_COL, "45507523");
        values.put(CURSOS_COL, "5B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//DANEI IARA BLANCHE
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "DANEI IARA BLANCHE");
        values.put(DNI_COL, "45410747");
        values.put(CURSOS_COL, "5B");
        values.put(GENERO_COL, "F");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//AYLEN DI BERNARDINI
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "AYLEN DI BERNARDINI");
        values.put(DNI_COL, "45952330");
        values.put(CURSOS_COL, "5B");
        values.put(GENERO_COL, "F");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//AGUSTÍN ISMAEL FRANKLIN
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "AGUSTÍN ISMAEL FRANKLIN");
        values.put(DNI_COL, "44524242");
        values.put(CURSOS_COL, "5B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//LEISA AYELÉN HILLE
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "LEISA AYELÉN HILLE");
        values.put(DNI_COL, "45507552");
        values.put(CURSOS_COL, "5B");
        values.put(GENERO_COL, "F");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//JEREMÍAS ESTEBAN GABRIEL KLENG
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "JEREEMÍAS ESTESBAN GABRIEL KLENG");
        values.put(DNI_COL, "44441039");
        values.put(CURSOS_COL, "5B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//YOEL SEBASTIAN MAINA
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "YOEL SEBASTIAN MAINA");
        values.put(DNI_COL, "45657844");
        values.put(CURSOS_COL, "5B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//ELIAS BENJAMÍN MANSILLA
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "ELIAS BENJAMÍN MANSILLA");
        values.put(DNI_COL, "45265516");
        values.put(CURSOS_COL, "5B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//LUCAS DANIEL PEREZ
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "LUCAS DANIEL PEREZ");
        values.put(DNI_COL, "44781602");
        values.put(CURSOS_COL, "5B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//ERICK AARON PURAMA
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "ERICK AARON PURAMA");
        values.put(DNI_COL, "46255397");
        values.put(CURSOS_COL, "5B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//ANDRÉS ARIEL RAMIREZ
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "ANDRÉS ARIEL RAMIREZ");
        values.put(DNI_COL, "44654824");
        values.put(CURSOS_COL, "5B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//DAVID AGUSTÍN ROMERO
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "DAVID AGUSTÍN ROMERO");
        values.put(DNI_COL, "45269232");
        values.put(CURSOS_COL, "5B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//MARINA ALEJANDRA SANDOVAL
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "MARINA ALEJANDRA SANDOVAL");
        values.put(DNI_COL, "45488985");
        values.put(CURSOS_COL, "5B");
        values.put(GENERO_COL, "F");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//TOMÁS SARBONIANI
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "TOMÁS SARBONIANI");
        values.put(DNI_COL, "45508557");
        values.put(CURSOS_COL, "5B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//ELÍAS SILVA
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "ELÍAS SILVA");
        values.put(DNI_COL, "45829447");
        values.put(CURSOS_COL, "5B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//SANTIAGO AGUSTIN SOSA
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "SANTIAGO AGUSTIN SOSA");
        values.put(DNI_COL, "45215055");
        values.put(CURSOS_COL, "5B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//LUCAS DAVID SPACCESI
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "LUCAS DAVID SPACCESI");
        values.put(DNI_COL, "45269233");
        values.put(CURSOS_COL, "5B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//JOAQUÍN NICOLÁS VERA
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "JOAQUÍN NICOLÁS VERA");
        values.put(DNI_COL, "45269236");
        values.put(CURSOS_COL, "5B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//SABRINA BELÉN WALDEN
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "SABRINA BELÉN WALDEN");
        values.put(DNI_COL, "45414624");
        values.put(CURSOS_COL, "5B");
        values.put(GENERO_COL, "F");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

    }

    //Añadir alumnos de Cuarto "B" a la base de datos diaria
    //Se pueden agregar otros cursos tambien con la misma funcion
    public static void AñadirCuartoB(Context ctx) {
        dbHelper dbhelp = new dbHelper(ctx);
        SQLiteDatabase db = dbhelp.getWritableDatabase();

//AGUSTINA GUADALUPE ARANDA
        ContentValues values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "AGUSTINA GUADALUPE ARANDA");
        values.put(DNI_COL, "46040456");
        values.put(CURSOS_COL, "4B");
        values.put(GENERO_COL, "F");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//MARTINA BOGOVICH
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "MARTINA BOGOVIVH");
        values.put(DNI_COL, "46763297");
        values.put(CURSOS_COL, "4B");
        values.put(GENERO_COL, "F");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//MELANY CABAL
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "MELANY CABAL");
        values.put(DNI_COL, "46298342");
        values.put(CURSOS_COL, "4B");
        values.put(GENERO_COL, "F");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//VALENTIN ALEJO CAITO
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "VALENTIN ALEJO CAITO");
        values.put(DNI_COL, "44732627");
        values.put(CURSOS_COL, "4B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//ALMA SERENA CARLEVARIS
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "ALMA SERENA CARLEVARIS");
        values.put(DNI_COL, "44429230");
        values.put(CURSOS_COL, "4B");
        values.put(GENERO_COL, "F");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//MAURO JOSUE CÓRDOBA
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "MAURO JOSUE CÓRDOBA");
        values.put(DNI_COL, "46040473");
        values.put(CURSOS_COL, "4B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//LAUTARO MARTIN CORNEJO
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "LAUTARO MARTIN CORNEJO");
        values.put(DNI_COL, "46298398");
        values.put(CURSOS_COL, "4B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//MANUEL DÍAZ
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "MAUNEL DÍAZ");
        values.put(DNI_COL, "46537203");
        values.put(CURSOS_COL, "4B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//DAIANA BELEN ESQUIVEL
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "DAIANA BELEN ESQUIVEL");
        values.put(DNI_COL, "46492541");
        values.put(CURSOS_COL, "4B");
        values.put(GENERO_COL, "F");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//ADRIAN LEANDRO FERNANDEZ
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "ADRIAN LEANDRO FERNANDEZ");
        values.put(DNI_COL, "45343672");
        values.put(CURSOS_COL, "4B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//LUDMILA ANELEY FERNANDEZ
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "LUDMILA ANELEY FERNANDEZ");
        values.put(DNI_COL, "45344767");
        values.put(CURSOS_COL, "4B");
        values.put(GENERO_COL, "F");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//FRANCO NICOLÁS FIGINI
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "FRANCO NICOLAS FIGINI");
        values.put(DNI_COL, "45637380");
        values.put(CURSOS_COL, "4B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//JOSÉ MARÍA FRANCO
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "JOSÉ MARÍA FRANCO");
        values.put(DNI_COL, "45410777");
        values.put(CURSOS_COL, "4B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//BRIAN EXEQUIEL FRANKLIN
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "BRIAN EXEQUIEL FRANKLIN");
        values.put(DNI_COL, "46492266");
        values.put(CURSOS_COL, "4B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//CAMILA DANIELA FRANKLIN
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "CAMILA DANIELA FRANKLIN");
        values.put(DNI_COL, "46492629");
        values.put(CURSOS_COL, "4B");
        values.put(GENERO_COL, "F");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//LAUTARO NICOLÁS GAMARRA
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "LAUTARO NICOLÁS GAMARRA");
        values.put(DNI_COL, "45030640");
        values.put(CURSOS_COL, "4B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//NICOLÁS MARCELO GONZÁLES
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "NICOLÁS MARCELO GONZÁLES");
        values.put(DNI_COL, "46537258");
        values.put(CURSOS_COL, "4B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//SANTIAGO LEONEL GONZÁLES
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "SANTIAGO LEONEL GONZÁLES");
        values.put(DNI_COL, "46537259");
        values.put(CURSOS_COL, "4B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//VALENTIN ALEJANDRO LASSO
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "VALENTIN ALEJANDRO LASSO");
        values.put(DNI_COL, "46133734");
        values.put(CURSOS_COL, "4B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//LAUTARO JAVIER LEDEZMA
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "LAUTARO JAVIER LEDEZMA");
        values.put(DNI_COL, "46294884");
        values.put(CURSOS_COL, "4B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//DENISE PRISCILA LUCENA
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "DENISE PRISCILA LUCENA");
        values.put(DNI_COL, "45341566");
        values.put(CURSOS_COL, "4B");
        values.put(GENERO_COL, "F");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//JOSE LUIS ANDRÉS MAIDANA
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "JOSE LUIS ANDRÉS MAIDANA");
        values.put(DNI_COL, "45268806");
        values.put(CURSOS_COL, "4B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//AGUSTÍN ARIEL MEDINA
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "AGUSTÍN ARIEL MEDINA");
        values.put(DNI_COL, "45507560");
        values.put(CURSOS_COL, "4B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//LUDMILA ABIGAIL MOLINA
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "LUDMILA ABIGAIL MOLINA");
        values.put(DNI_COL, "45832438");
        values.put(CURSOS_COL, "4B");
        values.put(GENERO_COL, "F");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//NABILA MUALEM 
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "NABILA MUALEM");
        values.put(DNI_COL, "45832377");
        values.put(CURSOS_COL, "4B");
        values.put(GENERO_COL, "F");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//AYLÉN ESTEFANÍA OCHOA
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "AYLÉN ESTEFANÍA OCHOA");
        values.put(DNI_COL, "44630121");
        values.put(CURSOS_COL, "4B");
        values.put(GENERO_COL, "F");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);


//AMILCAR JOSUÉ OJEDA
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "AMILAR JOSUE OJEDA");
        values.put(DNI_COL, "45268839");
        values.put(CURSOS_COL, "4B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//BRUNO ULISES OJEDA
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "BRUNO ULISES OJEDA");
        values.put(DNI_COL, "45268839");
        values.put(CURSOS_COL, "4B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//EMILIANO TADEO OJEDA
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "EMILIANO TADEO OJEDA");
        values.put(DNI_COL, "44574996");
        values.put(CURSOS_COL, "4B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//ELIÁN AÍN PERRI
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "ELIÁN AÍN PERRI");
        values.put(DNI_COL, "46448964");
        values.put(CURSOS_COL, "4B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//MICAELA AYLÉN RAMIREZ
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "MICAELA AYLÉN RAMIREZ");
        values.put(DNI_COL, "46537214");
        values.put(CURSOS_COL, "4B");
        values.put(GENERO_COL, "F");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//ALAN JEREMIAS REGERA
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "ALAN JEREMIAS REGERA");
        values.put(DNI_COL, "45488927");
        values.put(CURSOS_COL, "4B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//BRUNO RITTINER
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "BRUNO RITTINER");
        values.put(DNI_COL, "46266674");
        values.put(CURSOS_COL, "4B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//JULIETA BEATRIZ RUIZ DIAZ
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "JULIETA BEATRIZ RUIZ DIAZ");
        values.put(DNI_COL, "46367021");
        values.put(CURSOS_COL, "4B");
        values.put(GENERO_COL, "F");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//GERALDINE NEHIEL VELOSO
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "GERALDINE NEHIEL VELOSO");
        values.put(DNI_COL, "46043658");
        values.put(CURSOS_COL, "4B");
        values.put(GENERO_COL, "F");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

    }

    //Añadir alumnos de Tercero "B" a la base de datos diaria
    //Se pueden agregar otros cursos tambien con la misma funcion
    public static void AñadirTerceroB(Context ctx) {
        dbHelper dbhelp = new dbHelper(ctx);
        SQLiteDatabase db = dbhelp.getWritableDatabase();

//JOAQUIN GERARDO AGUIAR
        ContentValues values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "JOAQUIN GERARDO AGUIAR");
        values.put(DNI_COL, "46763224");
        values.put(CURSOS_COL, "3B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//KIARA AILÍN ALEGRE
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "KIARA AILÍN ALEGRE");
        values.put(DNI_COL, "46837963");
        values.put(CURSOS_COL, "3B");
        values.put(GENERO_COL, "F");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//MAXIMILIANO EZEQUIEL ARDILES PALAVECINO
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "MAXIMILIANO EZEQUIEL ARDILES PALAVECINO");
        values.put(DNI_COL, "45828897");
        values.put(CURSOS_COL, "3B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//VALENTINA ARNOLD
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "VALENTINA ARNOLD");
        values.put(DNI_COL, "46878711");
        values.put(CURSOS_COL, "3B");
        values.put(GENERO_COL, "F");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//VICTORIA LUDMILA BRITES
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "VICTORIA LUDMILA BRITES");
        values.put(DNI_COL, "47037530");
        values.put(CURSOS_COL, "3B");
        values.put(GENERO_COL, "F");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//IARA AZUL BRITO
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "IARA AZUL BRITO");
        values.put(DNI_COL, "47976801");
        values.put(CURSOS_COL, "3B");
        values.put(GENERO_COL, "F");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//SELENE ABRIL BRITO
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "SELENE ABRIL BRITO");
        values.put(DNI_COL, "47105567");
        values.put(CURSOS_COL, "3B");
        values.put(GENERO_COL, "F");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//NICOL ABIGAIL BRUNO
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "NICOL ABIGAIL BRUNO");
        values.put(DNI_COL, "47106098");
        values.put(CURSOS_COL, "3B");
        values.put(GENERO_COL, "F");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//CANDELARIA CABAL
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "CANDELARIA CABAL");
        values.put(DNI_COL, "46763213");
        values.put(CURSOS_COL, "3B");
        values.put(GENERO_COL, "F");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//MAXIMO AGUSTIN CHAVARRIA
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "MAXIMO AGUSTIN CHAVARRIA");
        values.put(DNI_COL, "46998457");
        values.put(CURSOS_COL, "3B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//PATRICIO DANIEL DAMELLI DODORICO
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "PATRICIO DANIEL DAMELLI DODORICO");
        values.put(DNI_COL, "46652228");
        values.put(CURSOS_COL, "3B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//SEBASTIAN FAGGI
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "SEBASTIAN FIGGI");
        values.put(DNI_COL, "46880384");
        values.put(CURSOS_COL, "3B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//FRANCO ESTEBAN FARIAS
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "FRANCO ESTEBAN FARIAS");
        values.put(DNI_COL, "447037529");
        values.put(CURSOS_COL, "3B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//NAHUEL DAVID GALLO
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "NAHUEL DAVID GALLO");
        values.put(DNI_COL, "46367218");
        values.put(CURSOS_COL, "3B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//MILAGROS MARTINA GIMENEZ
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "MILAGROS MARTINA GIMENEZ");
        values.put(DNI_COL, "46966248");
        values.put(CURSOS_COL, "3B");
        values.put(GENERO_COL, "F");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//SANTIAGO JESÚS GODOY
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "SANTIAGO JESÚS GODOY");
        values.put(DNI_COL, "46539900");
        values.put(CURSOS_COL, "3B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//JUAN IGNACIO GOMEZ
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "JUAN IGNACIO GOMEZ");
        values.put(DNI_COL, "45215059");
        values.put(CURSOS_COL, "3B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//TATIANA AILÉN GRANERO
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "TATIANA AILÉN GRANERO");
        values.put(DNI_COL, "47105657");
        values.put(CURSOS_COL, "3B");
        values.put(GENERO_COL, "F");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//MILAGROS GUADALUPE LARES
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "MILAGROS GUADALUPE LARES");
        values.put(DNI_COL, "46838355");
        values.put(CURSOS_COL, "3B");
        values.put(GENERO_COL, "F");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//ESTEBAN RUBÉN LEGUIZAMÓN
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "ESTEBAN RUBÉN LEGUIZAMÓN");
        values.put(DNI_COL, "46968558");
        values.put(CURSOS_COL, "3B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//SET LEONELLO
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "SET LEONELLO");
        values.put(DNI_COL, "47137359");
        values.put(CURSOS_COL, "3B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//MICAELA AGOSTINA MAINA
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "MICAELA AGOSTINA MAINA");
        values.put(DNI_COL, "46968942");
        values.put(CURSOS_COL, "3B");
        values.put(GENERO_COL, "F");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//JAZMIN SOLEDAD MARQUEZ TORRES
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "JAZMIN SOLEDAD MARQUEZ TORRES");
        values.put(DNI_COL, "46878757");
        values.put(CURSOS_COL, "3B");
        values.put(GENERO_COL, "F");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//RAFAELA TAHIEL MENDOZA
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "RAFAELA TAHIEL MENDOZA");
        values.put(DNI_COL, "46039585");
        values.put(CURSOS_COL, "3B");
        values.put(GENERO_COL, "F");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//MAURO ANDRES MOREYRA
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "MAURO ANDRES MOREIRA");
        values.put(DNI_COL, "46763635");
        values.put(CURSOS_COL, "3B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//PATRICIO AGUSTIN ORELLANA
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "PATRICIO AGUSTIN ORELLANA");
        values.put(DNI_COL, "47105478");
        values.put(CURSOS_COL, "3B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);


//JAZMÍN NAILÉN OVIEDO
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "JAZMÍN NAILÉN OVIEDO");
        values.put(DNI_COL, "46966224");
        values.put(CURSOS_COL, "3B");
        values.put(GENERO_COL, "F");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//MAGALÍ NOEMÍ PAREDES
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "MAGALÍ NOEMÍ PAREDES");
        values.put(DNI_COL, "46552490");
        values.put(CURSOS_COL, "3B");
        values.put(GENERO_COL, "F");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//LUCAS JULIÁN PÉREZ
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "LUCAS JULIÁN PÉREZ");
        values.put(DNI_COL, "46966240");
        values.put(CURSOS_COL, "3B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//MILAGROS PRIETO FABRE
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "MILAGROS PRIETO FABRE");
        values.put(DNI_COL, "46554325");
        values.put(CURSOS_COL, "3B");
        values.put(GENERO_COL, "F");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//MAURICIO NADIR RATHGE
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "MAURICIO NADIR RATHGE");
        values.put(DNI_COL, "46043623");
        values.put(CURSOS_COL, "3B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//MARIA PAZ RIERA
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "MARIA PAZ RIERA");
        values.put(DNI_COL, "46637357");
        values.put(CURSOS_COL, "3B");
        values.put(GENERO_COL, "F");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

// JUAN IGNACIO RINALDI
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "JUAN IGNACIO RINALDI");
        values.put(DNI_COL, "46966238");
        values.put(CURSOS_COL, "3B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//DIEGO NICOLAS RIVERA
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "DIEGO NICOLAS RIVERA");
        values.put(DNI_COL, "47209179");
        values.put(CURSOS_COL, "3B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//FRANCO DAVID ROZECK
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "FRANCO DAVID ROZECK");
        values.put(DNI_COL, "46537368");
        values.put(CURSOS_COL, "3B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//NICOLAS NAHUEL SCALIA
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "NICOLAS NAHUEL SCALIA");
        values.put(DNI_COL, "46968532");
        values.put(CURSOS_COL, "3B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//LUCCA ALFREDO TIRACCHIA
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "LUCCA ALFREDO TIRACCHIA");
        values.put(DNI_COL, "47077575");
        values.put(CURSOS_COL, "3B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//FRANCO NATANAEL TONÓN
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "FRANCO NATANAEL TONÓN");
        values.put(DNI_COL, "45832436");
        values.put(CURSOS_COL, "3B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//ALESSANDRA TORRES
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "ALESSANDRA TORRES");
        values.put(DNI_COL, "47077597");
        values.put(CURSOS_COL, "3B");
        values.put(GENERO_COL, "F");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//IRINA CAMILA VAZQUEZ
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "IRINA CAMILA VAZQUEZ");
        values.put(DNI_COL, "46762107");
        values.put(CURSOS_COL, "3B");
        values.put(GENERO_COL, "F");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//TOMÁS JAVIER VERDUGO
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "TOMÁS JAVIER VERDUGO");
        values.put(DNI_COL, "46537399");
        values.put(CURSOS_COL, "3B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//LAUTARO DANIEL VIGNATTI
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "LAUTARO DANIEL VIGNATTI");
        values.put(DNI_COL, "47137340");
        values.put(CURSOS_COL, "3B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//GONZALO JOSÉ YOST
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "GONZALO JOSÉ YOST");
        values.put(DNI_COL, "46998458");
        values.put(CURSOS_COL, "3B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//ANA PAULA ZAMORA
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "ANA PAULA ZAMORA");
        values.put(DNI_COL, "46998458");
        values.put(CURSOS_COL, "3B");
        values.put(GENERO_COL, "F");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//MARI LUZ ZEBALLOS
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "MARI LUZ ZEBALLOS");
        values.put(DNI_COL, "46946207");
        values.put(CURSOS_COL, "3B");
        values.put(GENERO_COL, "F");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//AGUSTIN RAÚL ZMUTT
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "AGUSTIN RAÚL ZMUTT");
        values.put(DNI_COL, "46966278");
        values.put(CURSOS_COL, "3B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);
    }


    //Añadir alumnos de Segundo "B" a la base de datos diaria
    //Se pueden agregar otros cursos tambien con la misma funcion
    public static void AñadirSegundoB(Context ctx) {
        dbHelper dbhelp = new dbHelper(ctx);
        SQLiteDatabase db = dbhelp.getWritableDatabase();

//GONZALO NICOLAS ALIA
        ContentValues values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "GONZALO NICOLAS ALIA");
        values.put(DNI_COL, "46540220");
        values.put(CURSOS_COL, "2B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//GUSTAVO NICOLAS ALONSO
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "GUSTAVO NICOLAS ALONSO");
        values.put(DNI_COL, "47506169");
        values.put(CURSOS_COL, "2B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//CANDELA ARANDA
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "CANDELA ARANDA");
        values.put(DNI_COL, "47658973");
        values.put(CURSOS_COL, "2B");
        values.put(GENERO_COL, "F");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//GIOVANA AGOSTINA BARRERA
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "GIOVANA AGOSTINA BARRERA");
        values.put(DNI_COL, "47506162");
        values.put(CURSOS_COL, "2B");
        values.put(GENERO_COL, "F");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//KAREN ABIGAIL BENITEZ
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "KAREN ABIGAIL BENITEZ");
        values.put(DNI_COL, "47767645");
        values.put(CURSOS_COL, "2B");
        values.put(GENERO_COL, "F");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//MARCO BENITEZ
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "MARCO BENITEZ");
        values.put(DNI_COL, "47779941");
        values.put(CURSOS_COL, "2B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//SERGIO GABRIEL CABALLO
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "SERGIO GABRIEL CABALLO");
        values.put(DNI_COL, "47331144");
        values.put(CURSOS_COL, "2B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//NICOLAS JESÚS CABRERA
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "NICOLAS JESÚS CABRERA");
        values.put(DNI_COL, "47209243");
        values.put(CURSOS_COL, "2B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//JOAQUÍN JUAN GABRIEL CARABALLO
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "JOAQUÍN JUAN GRABIEL CARABALLO");
        values.put(DNI_COL, "46367766");
        values.put(CURSOS_COL, "2B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//SASHA NAHIR CARRIZO
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "SASHA NAHIR CARRIZO");
        values.put(DNI_COL, "47105355");
        values.put(CURSOS_COL, "2B");
        values.put(GENERO_COL, "F");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//GONZALO IVÁN DUSO
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "GONZALO IVÁN DUSO");
        values.put(DNI_COL, "46492147");
        values.put(CURSOS_COL, "2B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//SOFIA NICOLE FERNANDEZ
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "SOFIA NICOLE FERNANDEZ");
        values.put(DNI_COL, "47659077");
        values.put(CURSOS_COL, "2B");
        values.put(GENERO_COL, "F");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//ALAN GABRIEL FRANKLIN
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "ALAN GABRIEL FRANKLIN");
        values.put(DNI_COL, "47037602");
        values.put(CURSOS_COL, "2B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//EZEQUIEL TOMÁS GIMENEZ
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "EZEQUIEL TOMÁS GIMENEZ");
        values.put(DNI_COL, "47328985");
        values.put(CURSOS_COL, "2B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//LUCIANO JAIRO EXEQUIEL GOMEZ
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "LUCIANO JAIRO EXEQUIEL GOMEZ");
        values.put(DNI_COL, "46537201");
        values.put(CURSOS_COL, "2B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//BENJAMÍN SEBASTIAN TOMAS GOMEZ
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "BENJAMÍN SEBASTIAN TOMAS GOMEZ");
        values.put(DNI_COL, "47585188");
        values.put(CURSOS_COL, "2B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//DYLAN MICHEL INSAURRALDE
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "DYLAN MICHEL INSAURRALDE");
        values.put(DNI_COL, "47780288");
        values.put(CURSOS_COL, "2B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//NICOLÁS BENJAMÍN LESTUSSI
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "NICOLÁS BENJAMÍN LESTUSSI");
        values.put(DNI_COL, "47328960");
        values.put(CURSOS_COL, "2B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//ELÍAS JULIÁN MANTICA
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "ELÍAS JULIÁN MANTICA");
        values.put(DNI_COL, "47585153");
        values.put(CURSOS_COL, "2B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//GONZALO JOEL MARQUEZ
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "GONZALO JOEL MARQUEZ");
        values.put(DNI_COL, "47209642");
        values.put(CURSOS_COL, "2B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//ISAÍAS JOSÉ ARIEL MOLINA
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "ISAÍAS JOSÉ ARIEL MOLINA");
        values.put(DNI_COL, "47508340");
        values.put(CURSOS_COL, "2B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//NARA IVÓN MOREYRA
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "NARA IVÓN MOREYRA");
        values.put(DNI_COL, "46367659");
        values.put(CURSOS_COL, "2B");
        values.put(GENERO_COL, "F");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//SELENA MILAGROS GUADALUPE MURINGA
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "SELENA MILAGROS GUADALUPE MURIEGA");
        values.put(DNI_COL, "47209411");
        values.put(CURSOS_COL, "2B");
        values.put(GENERO_COL, "F");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//NEHEMÍAS LEONEL ORTIZ
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "NEHEMÍAS LEONEL ORTIZ");
        values.put(DNI_COL, "47761150");
        values.put(CURSOS_COL, "2B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//AYELEN MICAELA PAEZ
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "AYELEN MICAELA PAEZ");
        values.put(DNI_COL, "47209359");
        values.put(CURSOS_COL, "2B");
        values.put(GENERO_COL, "F");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//PATRICIO IGNACIO RIEDEL
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "PATRICIO IGNACIO RIEDEL");
        values.put(DNI_COL, "47441976");
        values.put(CURSOS_COL, "2B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);


//NICOLAS BAUTISTA RUIZ
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "NICOLAS BAUTISTA RUIZ");
        values.put(DNI_COL, "47037753");
        values.put(CURSOS_COL, "2B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//CARLOS MIGUEL SANDOVAL
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "CARLOS MIGUEL SANDOVAL");
        values.put(DNI_COL, "46998408");
        values.put(CURSOS_COL, "2B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//MILENA NICOLE ESTEFANIA SEGUI
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "MILENA NICOLE ESTEFANIA SEGUI");
        values.put(DNI_COL, "47767479");
        values.put(CURSOS_COL, "2B");
        values.put(GENERO_COL, "F");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//CLAUDIO ALEJANDRO VALDEZ
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "CLAUDIO ALEJANDRO VALDEZ");
        values.put(DNI_COL, "46650287");
        values.put(CURSOS_COL, "2B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//MARIANO AUGUSTO VIVAS
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "MARIANO AUGUSTO VIVAS");
        values.put(DNI_COL, "47658897");
        values.put(CURSOS_COL, "2B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//IVÁN SAMUEL ZABALA
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "IVÁN SAMUEL ZABALA");
        values.put(DNI_COL, "47780475");
        values.put(CURSOS_COL, "2B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

    }
    //Añadir alumnos de Primero "B" a la base de datos diaria
    //Se pueden agregar otros cursos tambien con la misma funcion
    public static void AñadirPrimeroB(Context ctx) {
        dbHelper dbhelp = new dbHelper(ctx);
        SQLiteDatabase db = dbhelp.getWritableDatabase();

//CHIARA ALMEIDA
        ContentValues values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "CHIARA ALMEIDA");
        values.put(DNI_COL, "48187125");
        values.put(CURSOS_COL, "1B");
        values.put(GENERO_COL, "F");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//AGUSTIN OSCAR ALTAMIRANO GALARZA
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "AGUSTIN OSCAR ALTAMIRANO GALARZA");
        values.put(DNI_COL, "47976726");
        values.put(CURSOS_COL, "1B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//SEBASTIÁN URIEL ALTAMIRANO GALARZA
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "SEBASTIÁN URIEL ALTAMIRANO GALARZA");
        values.put(DNI_COL, "47976726");
        values.put(CURSOS_COL, "1B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//SANTIAGO TADEO ALVAREZ
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "SANTIAGO TADEO ALVAREZ");
        values.put(DNI_COL, "48468558");
        values.put(CURSOS_COL, "1B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//GÉNESIS AGUSTINA CANAVESIO
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "GENÉSIS AGUSTINA CANAVESIO");
        values.put(DNI_COL, "48463735");
        values.put(CURSOS_COL, "1B");
        values.put(GENERO_COL, "F");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//MILAGROS ANAHI CARBALLO
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "MILAGROS ANAHI CARBALLO");
        values.put(DNI_COL, "48188184");
        values.put(CURSOS_COL, "1B");
        values.put(GENERO_COL, "F");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//JOSEFINA ANTONELLA CUELLO
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "JOSEFINA ANTONELLA CUELLO");
        values.put(DNI_COL, "48469834");
        values.put(CURSOS_COL, "1B");
        values.put(GENERO_COL, "F");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//VALENTINA DANIELA CUEVAS
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "VALENTINA DANIELA CUEVAS");
        values.put(DNI_COL, "48188197");
        values.put(CURSOS_COL, "1B");
        values.put(GENERO_COL, "F");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//GASTÓN DUFOUR
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "GASTÓN DUFOUR");
        values.put(DNI_COL, "48739021");
        values.put(CURSOS_COL, "1B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//SANTIAGO NICOLAS ESCOBAR
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "SANTIAGO NICOLAS ESCOBAR");
        values.put(DNI_COL, "47839239");
        values.put(CURSOS_COL, "1B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//YAHIR THOMÁS FLORES
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "YAHIR THOMÁS FLORES");
        values.put(DNI_COL, "48187832");
        values.put(CURSOS_COL, "1B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//NATANAEL CRISTIAN GAMARRA
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "NATANAEL CRISTIAN GAMARRA");
        values.put(DNI_COL, "47919906");
        values.put(CURSOS_COL, "1B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//MILENA PILAR GAUNA
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "MILENA PILAR GAUNA");
        values.put(DNI_COL, "48709011");
        values.put(CURSOS_COL, "1B");
        values.put(GENERO_COL, "F");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//PALOMA GIMENEZ
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "PALOMA GIMENEZ");
        values.put(DNI_COL, "47976870");
        values.put(CURSOS_COL, "1B");
        values.put(GENERO_COL, "F");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//MATEO LORINCZ
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "MATEO LORINCZ");
        values.put(DNI_COL, "48224071");
        values.put(CURSOS_COL, "1B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//SOFIA MORENA MACHADO
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "SOFIA MORENA MACHADO");
        values.put(DNI_COL, "48065353");
        values.put(CURSOS_COL, "1B");
        values.put(GENERO_COL, "F");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//FABRICIO NICOLAS MILOCCO
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "FABRICIO NICOLAS MILOCCO");
        values.put(DNI_COL, "48187717");
        values.put(CURSOS_COL, "1B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//FABRICIO JAVIER MIR ARIGONI
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "FABRICIO JAVIER MIR ARINGONI");
        values.put(DNI_COL, "48681402");
        values.put(CURSOS_COL, "1B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//GASPAR MAXIMILIANO MOSCONI
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "GASPAR MAXIMILIANO MOSCONI");
        values.put(DNI_COL, "48738199");
        values.put(CURSOS_COL, "1B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//MALCON YAIR MOYANO PINTO
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "MALCON YAIR MOYANO PINTO");
        values.put(DNI_COL, "48065348");
        values.put(CURSOS_COL, "1B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//JUAN PABLO PEREYRA
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "JUAN PABLO PEREYRA");
        values.put(DNI_COL, "48187747");
        values.put(CURSOS_COL, "1B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//FRANCISCO MATÍAS PRADOLINI
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "FRANCISCO MATÍAS PRADOLINI");
        values.put(DNI_COL, "48738209");
        values.put(CURSOS_COL, "1B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//AARON BENJAMIN RIQUELME
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "AARON BANJAMIN RIQUELME");
        values.put(DNI_COL, "48383364");
        values.put(CURSOS_COL, "1B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//LARA RUSCITTI
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "LARA RUSCITTI");
        values.put(DNI_COL, "47976759");
        values.put(CURSOS_COL, "1B");
        values.put(GENERO_COL, "F");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//MILAGROS NICOLE SALAS
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "MILAGROS NICOLE SALAS");
        values.put(DNI_COL, "48190425");
        values.put(CURSOS_COL, "1B");
        values.put(GENERO_COL, "F");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//ERIC LEONEL SELMI
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "ERIC LEONEL SELMI");
        values.put(DNI_COL, "48187794");
        values.put(CURSOS_COL, "1B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);


//LEONEL ARIEL TABORDA
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "LEONEL ARIEL TABORDA");
        values.put(DNI_COL, "47976817");
        values.put(CURSOS_COL, "1B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

//EMANUEL NICOLAS ZARATE
        values = new ContentValues();
        values.put(NOMBRE_Y_APPELIDO_COL, "EMANUEL NICOLAS ZARATE");
        values.put(DNI_COL, "48187795");
        values.put(CURSOS_COL, "1B");
        values.put(GENERO_COL, "M");
        values.put(PRESENTE_COL, "Ausente");
        db.insert(getTodaysTable(ctx),null,values);

    }

}
