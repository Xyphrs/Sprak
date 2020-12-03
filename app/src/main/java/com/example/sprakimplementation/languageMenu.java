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

import com.example.sprakimplementation.databinding.FragmentLanguageMenuBinding;
import com.example.sprakimplementation.databinding.FragmentLoginBinding;

public class languageMenu extends Fragment {
    FragmentLanguageMenuBinding binding;
    NavController navController;
    Button botonNoruego;
    Button botonCatalan;
    Button botonIngles;
    Button botonSueco;
    Button botonAleman;
    Button botonItaliano;
    Button botonFrench;
    Button botonPortu;
    Button botonDanes;



    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_language_menu, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        navController = Navigation.findNavController(view);

        botonIngles = view.findViewById(R.id.inglesSeleccion);
        botonIngles.setOnClickListener(v -> navController.navigate(R.id.action_chooseALanguage_to_languageMenu));

        botonCatalan = view.findViewById(R.id.catalanSeleccion);
        botonCatalan.setOnClickListener(v -> navController.navigate(R.id.action_chooseALanguage_to_languageMenu));

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