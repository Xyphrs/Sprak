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

import com.example.sprakimplementation.databinding.FragmentTest4Binding;
import com.example.sprakimplementation.databinding.FragmentTestBinding;

public class TestFragment4 extends Fragment {

    FragmentTest4Binding binding;
    NavController navController;
    Button botonSiguiente;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_test4, container, false);
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        /* Hacer click en el boton "Registrate" y la navegacion hacia fragmentRegister */
        navController = Navigation.findNavController(view);
        botonSiguiente = view.findViewById(R.id.siguiente);
        botonSiguiente.setOnClickListener(v -> navController.navigate(R.id.action_testFragment42_to_testFragment52));

    }
}