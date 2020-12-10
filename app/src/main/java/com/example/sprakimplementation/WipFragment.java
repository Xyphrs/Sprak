package com.example.sprakimplementation;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.sprakimplementation.databinding.FragmentSplashScreenBinding;
import com.example.sprakimplementation.databinding.FragmentWipBinding;

public class WipFragment extends Fragment {
    FragmentWipBinding binding;
    NavController navController;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_wip, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        /* Delay de la WipFragment antes de volver al ChooseALanguageFragment */
        navController = Navigation.findNavController(view);
        new Handler().postDelayed(() -> navController.navigate(R.id.action_wipFragment_to_chooseALanguage), 3000);

    }

}