package com.example.sprakimplementation;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.NavigationUI;

import com.example.sprakimplementation.databinding.ActivityMainBinding;
import com.example.sprakimplementation.databinding.FragmentLanguageMenuBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((binding = ActivityMainBinding.inflate(getLayoutInflater())).getRoot());

        NavController navController = ((NavHostFragment) getSupportFragmentManager().findFragmentById(R.id.nav_host_fragment)).getNavController();
        NavigationUI.setupWithNavController(binding.bottomNavView, navController);

        navController.addOnDestinationChangedListener(new NavController.OnDestinationChangedListener() {
            @Override
            public void onDestinationChanged(@NonNull NavController controller, @NonNull NavDestination destination, @Nullable Bundle arguments) {
                if(destination.getId()==R.id.loginFragment){
                    binding.toolbar.setVisibility(View.GONE);
                    binding.bottomNavView.setVisibility(View.GONE);
                }else if( destination.getId()==R.id.registerFragment){
                    binding.toolbar.setVisibility(View.GONE);
                    binding.bottomNavView.setVisibility(View.GONE);
                }else if( destination.getId()==R.id.splashScreenFragment){
                    binding.toolbar.setVisibility(View.GONE);
                    binding.bottomNavView.setVisibility(View.GONE);
                }else if( destination.getId()==R.id.registerThanks){
                    binding.toolbar.setVisibility(View.GONE);
                    binding.bottomNavView.setVisibility(View.GONE);
                }else if( destination.getId()==R.id.chooseALanguage){
                    binding.toolbar.setVisibility(View.GONE);
                    binding.bottomNavView.setVisibility(View.GONE);
                }else if( destination.getId()==R.id.wipFragment){
                    binding.toolbar.setVisibility(View.GONE);
                    binding.bottomNavView.setVisibility(View.GONE);
                }
                else {
                    binding.toolbar.setVisibility(View.VISIBLE);
                }
            }
        });
    }
}