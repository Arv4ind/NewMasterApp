package com.example.newmasterapp.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.newmasterapp.Entity.Model;

import java.util.List;


@Dao

public interface UserDao
{
    @Insert
    void insertalldata(Model model);

    @Query("Select * FROM new_register")

   public List<Model> getAllUser();

//    @Delete
//    public default void delete(M use) {

  //  }


}
