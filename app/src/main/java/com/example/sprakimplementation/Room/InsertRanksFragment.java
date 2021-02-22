package com.example.sprakimplementation.Room;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.sprakimplementation.R;
import com.example.sprakimplementation.RecyclerView.RanksViewModel;
import com.example.sprakimplementation.databinding.FragmentInsertRanksBinding;
import com.example.sprakimplementation.databinding.FragmentRankingBinding;

public class InsertRanksFragment extends Fragment {
    FragmentInsertRanksBinding binding;
    NavController navController;
    RanksViewModel ranksViewModel;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return (binding = FragmentInsertRanksBinding.inflate(inflater, container, false)).getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        navController = Navigation.findNavController(view);

        ranksViewModel = new ViewModelProvider(requireActivity()).get(RanksViewModel.class);

        binding.insertar.setOnClickListener(v -> {
            String username = binding.username.getText().toString();
            String score = binding.puntos.getText().toString();

            ranksViewModel.insert(username, score);

            navController.popBackStack();
        });
    }
}