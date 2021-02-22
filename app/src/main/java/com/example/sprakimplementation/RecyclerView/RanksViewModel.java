package com.example.sprakimplementation.RecyclerView;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import java.util.List;

public class RanksViewModel extends AndroidViewModel {

    RanksRepo ranksRepo;
    public RanksViewModel(@NonNull Application application) {
        super(application);

        ranksRepo = new RanksRepo(application);
    }

    public void insert(String username, String score) {
        ranksRepo.insert(username, score);
    }

    public LiveData<List<Ranks>> obtener() {
        return ranksRepo.obtener();
    }
}
