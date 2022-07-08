package org.codeforiraq.recyclerviewproject;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class MyDatabase extends SQLiteOpenHelper {

    public MyDatabase(@Nullable Context context) {
        super(context,Utils.DATABASE_NAME, null, Utils.DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        String CREATE_FILM_TABLE = "CREATE TABLE "+ Utils.DATABASE_NAME+" ( "+Utils.name+"INTEGER PRIMARY KEY , "
                +Utils.time+"TEXT , "  +Utils.type+"TEXT, "+Utils.description +"TEXT )" ;
        db.execSQL(CREATE_FILM_TABLE);


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+ Utils.DATABASE_NAME);
        onCreate(db);

    }
    public void  addFilm(filmList filmList){
SQLiteDatabase db= this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put(Utils.name,filmList.getName());
        contentValues.put(Utils.time,filmList.getTime());
        contentValues.put(Utils.type,filmList.getType());
        contentValues.put(Utils.description,filmList.getDescription());
db.insert(Utils.TABLE_NAME,null,contentValues);


    }

}
