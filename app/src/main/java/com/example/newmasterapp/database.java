package com.example.newmasterapp;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.newmasterapp.Entity.Model;
import com.example.newmasterapp.dao.UserDao;

//@Database(entities = (User.class),version = 1)
@Database(entities = {Model.class},version = 1,exportSchema = false)
abstract class database extends RoomDatabase
{

    public abstract UserDao getdao();
   public static database instance;


    //    private static DatabaseProvider databaseProvider=null;
    public static database getdbConnection(Context context)
    {

        if (instance ==null){
            synchronized (database.class){

                instance= Room.databaseBuilder(context, database.class,"DATABASE")
                        .allowMainThreadQueries()
                        .build();

            }
        }

        return instance;
    }

}
