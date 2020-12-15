package com.example.sprakimplementation;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.example.sprakimplementation.databinding.FragmentChooseALanguageBinding;

public class ChooseALanguage extends Fragment {
    FragmentChooseALanguageBinding binding;
    NavController navController;
    LinearLayout botonNoruego;
    LinearLayout botonCatalan;
    LinearLayout botonIngles;
    LinearLayout botonSueco;
    LinearLayout botonAleman;
    LinearLayout botonItaliano;
    LinearLayout botonFrench;
    LinearLayout botonPortu;
    LinearLayout botonDanes;



    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_choose_a_language, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        navController = Navigation.findNavController(view);

        botonCatalan = view.findViewById(R.id.catalanSeleccion);
        botonCatalan.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), BottomActivity.class);
            startActivity(intent);
        });

        botonIngles = view.findViewById(R.id.inglesSeleccion);
        botonIngles.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), BottomActivity.class);
            startActivity(intent);
        });

        botonPortu = view.findViewById(R.id.portuguesSeleccion);
        botonPortu.setOnClickListener(v -> navController.navigate(R.id.action_chooseALanguage_to_wipFragment));

        botonItaliano = view.findViewById(R.id.italianoSeleccion);
        botonItaliano.setOnClickListener(v -> navController.navigate(R.id.action_chooseALanguage_to_wipFragment));

        botonFrench = view.findViewById(R.id.francesSeleccion);
        botonFrench.setOnClickListener(v -> navController.navigate(R.id.action_chooseALanguage_to_wipFragment));

        botonNoruego = view.findViewById(R.id.noruegoSeleccion);
        botonNoruego.setOnClickListener(v -> navController.navigate(R.id.action_chooseALanguage_to_wipFragment));

        botonSueco = view.findViewById(R.id.suecoSeleccion);
        botonSueco.setOnClickListener(v -> navController.navigate(R.id.action_chooseALanguage_to_wipFragment));

        botonAleman = view.findViewById(R.id.alemanSeleccion);
        botonAleman.setOnClickListener(v -> navController.navigate(R.id.action_chooseALanguage_to_wipFragment));

        botonDanes = view.findViewById(R.id.danesSeleccion);
        botonDanes.setOnClickListener(v -> navController.navigate(R.id.action_chooseALanguage_to_wipFragment));

    }
}