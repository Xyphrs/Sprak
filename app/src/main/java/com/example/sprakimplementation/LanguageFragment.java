package com.example.sprakimplementation;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import com.example.sprakimplementation.databinding.FragmentLoginBinding;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class LanguageFragment extends Fragment {
    FragmentLoginBinding binding;
    NavController navController;
    FloatingActionButton botonTest;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_language, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        /* Hacer click en el boton "Registrate" y la navegacion hacia fragmentRegister */
        navController = Navigation.findNavController(view);
        botonTest = view.findViewById(R.id.floatingActionButton);
        botonTest.setOnClickListener(v -> navController.navigate(R.id.action_languageFragment_to_testFragment));

    }
}