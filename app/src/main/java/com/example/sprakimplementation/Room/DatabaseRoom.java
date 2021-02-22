package com.example.sprakimplementation.Room;

import android.content.Context;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Database;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.sprakimplementation.RecyclerView.Ranks;

import java.util.List;

@Database(entities = {Ranks.class}, version = 1, exportSchema = false)
public abstract class DatabaseRoom extends RoomDatabase {

    private static volatile DatabaseRoom db;

    public abstract ranksDao getRanksDao();

    public static DatabaseRoom getInstance(final Context context){
        if (db == null){
            synchronized (DatabaseRoom.class){
                if (db == null){
                    db = Room.databaseBuilder(context, DatabaseRoom.class, "db")
                            .fallbackToDestructiveMigration()
                            .build();
                }
            }
        }

        return db;
    }

    @Dao
    public interface ranksDao {
        @Insert
        void insert(Ranks ranks);

        @Query("SELECT * FROM ranks")
        LiveData<List<Ranks>> obtener();
    }
}
