package com.example.sprakimplementation.RecyclerView;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Ranks {
    @PrimaryKey(autoGenerate = true)
    public int id;
    public String nombre;
    public String puntos;

    public Ranks(String nombre, String puntos) {
        this.nombre = nombre;
        this.puntos = puntos;
    }
}
