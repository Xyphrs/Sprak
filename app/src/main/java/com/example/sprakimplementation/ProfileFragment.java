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

import com.example.sprakimplementation.databinding.FragmentProfileBinding;
import com.example.sprakimplementation.databinding.FragmentRegisterBinding;

public class ProfileFragment extends Fragment {

    FragmentProfileBinding binding;
    NavController navController;
    Button botonRegister;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_profile, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        navController = Navigation.findNavController(view);
        botonRegister = view.findViewById(R.id.buttonLogin);
        botonRegister.setOnClickListener(v -> navController.navigate(R.id.action_profileFragment_to_loginFragment));
    }
}