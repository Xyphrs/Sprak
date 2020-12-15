package com.example.sprakimplementation;

import android.os.Bundle;

import com.example.sprakimplementation.databinding.ActivityBottomBinding;
import com.example.sprakimplementation.databinding.ActivityMainBinding;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import java.util.Objects;

public class BottomActivity extends AppCompatActivity {
    ActivityBottomBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((binding = ActivityBottomBinding.inflate(getLayoutInflater())).getRoot());

        NavController navController = ((NavHostFragment) Objects.requireNonNull(getSupportFragmentManager().findFragmentById(R.id.nav_host_fragment))).getNavController();
        NavigationUI.setupWithNavController(binding.navView, navController);
    }
}