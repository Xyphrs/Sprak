package com.example.sprakimplementation.RecyclerView;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.sprakimplementation.R;
import com.example.sprakimplementation.databinding.FragmentRankingBinding;
import com.example.sprakimplementation.databinding.ViewholderRanksBinding;

import java.util.List;

public class RankingFragment extends Fragment {
    FragmentRankingBinding binding;
    NavController navController;
    RanksViewModel ranksViewModel;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return (binding = FragmentRankingBinding.inflate(inflater, container, false)).getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        navController = Navigation.findNavController(view);
        ranksViewModel = new ViewModelProvider(requireActivity()).get(RanksViewModel.class);

        RanksAdapter ranksAdapter = new RanksAdapter();

        binding.recyclerview.setAdapter(ranksAdapter);

        ranksViewModel.obtener().observe(getViewLifecycleOwner(), new Observer<List<Ranks>>() {
            @Override
            public void onChanged(List<Ranks> ranks) {
                ranksAdapter.setRanksList(ranks);
            }
        });

        binding.insert.setOnClickListener(v -> navController.navigate(R.id.action_rankingFragment_to_insertRanksFragment));


    }

    class RanksAdapter extends RecyclerView.Adapter<RanksViewHolder>{

        List<Ranks> ranksList;

        @NonNull
        @Override
        public RanksViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            return new RanksViewHolder(ViewholderRanksBinding.inflate(getLayoutInflater(), parent,false));
        }

        @Override
        public void onBindViewHolder(@NonNull RanksViewHolder holder, int position) {
            Ranks ranks = ranksList.get(position);

            holder.binding.position.setText(String.valueOf(ranks.id));
            holder.binding.username.setText(ranks.nombre);
            holder.binding.score.setText(ranks.puntos);

        }

        @Override
        public int getItemCount() {
            return ranksList == null ? 0 : ranksList.size();
        }

        void setRanksList(List<Ranks> ranks){
            this.ranksList = ranks;
            notifyDataSetChanged();
        }
    }

    class RanksViewHolder extends RecyclerView.ViewHolder {

        ViewholderRanksBinding binding;

        public RanksViewHolder(@NonNull ViewholderRanksBinding binding) {
            super(binding.getRoot());

            this.binding = binding;
        }
    }
}