package com.example.sprakimplementation.RecyclerView;

import android.app.Application;

import androidx.lifecycle.LiveData;

import com.example.sprakimplementation.Room.DatabaseRoom;

import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class RanksRepo {
    Executor executor = Executors.newSingleThreadExecutor();
    private final DatabaseRoom.ranksDao ranksDao;
    public RanksRepo(Application application) {
        ranksDao = DatabaseRoom.getInstance(application).getRanksDao();
    }

    public void insert(String username, String score) {
        executor.execute(() -> {
            ranksDao.insert(new Ranks(username,score));
        });
    }

    public LiveData<List<Ranks>> obtener() {
        return ranksDao.obtener();
    }
}
