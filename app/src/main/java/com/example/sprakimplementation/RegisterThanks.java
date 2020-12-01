package com.example.sprakimplementation;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.sprakimplementation.databinding.FragmentRegisterBinding;
import com.example.sprakimplementation.databinding.FragmentRegisterThanksBinding;

public class RegisterThanks extends Fragment {
    FragmentRegisterThanksBinding binding;
    NavController navController;
    Button botonRegister;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_register_thanks, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        navController = Navigation.findNavController(view);
        botonRegister = view.findViewById(R.id.buttonRegisterThanks);
        botonRegister.setOnClickListener(v -> navController.navigate(R.id.action_registerThanks_to_chooseALanguage));
    }
}