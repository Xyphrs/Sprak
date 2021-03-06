package com.example.sprakimplementation;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import com.example.sprakimplementation.databinding.FragmentFinalTestBinding;

public class FinalTestFragment extends Fragment {

    FragmentFinalTestBinding binding;
    NavController navController;
    ConstraintLayout botonSiguiente;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_final_test, container, false);
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        /* Hacer click en el boton "Registrate" y la navegacion hacia fragmentRegister */
        navController = Navigation.findNavController(view);
        botonSiguiente = view.findViewById(R.id.finaltest);
        botonSiguiente.setOnClickListener(v -> navController.navigate(R.id.action_finalTestFragment_to_languageFragment));
    }
}