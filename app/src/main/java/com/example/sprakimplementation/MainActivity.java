package com.example.sprakimplementation;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.sprakimplementation.databinding.ActivityMainBinding;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((binding = ActivityMainBinding.inflate(getLayoutInflater())).getRoot());

        setSupportActionBar(binding.toolbarDraw);

        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.languageFragment, R.id.versusFragment, R.id.rankingFragment, R.id.socialFragment
        )
                .setOpenableLayout(binding.drawerLayout)
                .build();

        NavController navController = ((NavHostFragment) Objects.requireNonNull(getSupportFragmentManager().findFragmentById(R.id.nav_host_fragment))).getNavController();
        NavigationUI.setupWithNavController(binding.navView, navController);
        NavigationUI.setupWithNavController(binding.toolbarDraw, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(binding.bottomNavView, navController);
        binding.navView.setItemIconTintList(null);

        navController.addOnDestinationChangedListener((controller, destination, arguments) -> {
            if(destination.getId()==R.id.loginFragment){
                binding.toolbarDraw.setVisibility(View.GONE);
                binding.bottomNavView.setVisibility(View.GONE);
            }else if( destination.getId()==R.id.registerFragment){
                binding.toolbarDraw.setVisibility(View.GONE);
                binding.bottomNavView.setVisibility(View.GONE);
            }else if( destination.getId()==R.id.splashScreenFragment){
                binding.toolbarDraw.setVisibility(View.GONE);
                binding.bottomNavView.setVisibility(View.GONE);
            }else if( destination.getId()==R.id.registerThanks){
                binding.bottomNavView.setVisibility(View.GONE);
                binding.toolbarDraw.setVisibility(View.GONE);
            }else if( destination.getId()==R.id.chooseALanguage){
                binding.bottomNavView.setVisibility(View.GONE);
                binding.toolbarDraw.setVisibility(View.GONE);
            }else if( destination.getId()==R.id.wipFragment){
                binding.bottomNavView.setVisibility(View.GONE);
                binding.toolbarDraw.setVisibility(View.GONE);
            } else if( destination.getId()==R.id.testFragment){
                binding.bottomNavView.setVisibility(View.GONE);
                binding.toolbarDraw.setVisibility(View.VISIBLE);
            } else if( destination.getId()==R.id.testFragment2){
                binding.bottomNavView.setVisibility(View.GONE);
                binding.toolbarDraw.setVisibility(View.VISIBLE);
            } else if( destination.getId()==R.id.finalTestFragment){
                binding.bottomNavView.setVisibility(View.GONE);
                binding.toolbarDraw.setVisibility(View.GONE);
            } else if( destination.getId()==R.id.versusFragment){
                binding.bottomNavView.setVisibility(View.VISIBLE);
                binding.toolbarDraw.setVisibility(View.GONE);
            } else if( destination.getId()==R.id.rankingFragment){
                binding.bottomNavView.setVisibility(View.VISIBLE);
                binding.toolbarDraw.setVisibility(View.GONE);
            } else if( destination.getId()==R.id.socialFragment){
                binding.bottomNavView.setVisibility(View.VISIBLE);
                binding.toolbarDraw.setVisibility(View.GONE);
            } else if( destination.getId()==R.id.profileFragment){
                binding.bottomNavView.setVisibility(View.GONE);
                binding.toolbarDraw.setVisibility(View.GONE);
            } else {
                binding.bottomNavView.setVisibility(View.VISIBLE);
                binding.toolbarDraw.setVisibility(View.VISIBLE);
            }
        });

        binding.toolbarDraw.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                binding.toolbarDraw.setVisibility(View.GONE);
                return false;
            }
        });
    }
}