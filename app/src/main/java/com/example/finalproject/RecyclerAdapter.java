package com.example.finalproject;


import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ItemViewHolder>{
    Context context;
    ArrayList<Integer> al_deckCompletions, al_deckCounts, al_deckSymbols;
    ArrayList<String> al_deckNames, al_deckDescriptions;

    //ArrayList<Integer> al_deckCompletions, ArrayList<Integer> al_deckCounts, ArrayList<Integer> al_deckSymbols, ArrayList<String> al_deckDescriptions,

    public RecyclerAdapter(Context context, ArrayList<String> al_deckNames){
        this.context = context;
        this.al_deckNames = al_deckNames;
        //Deck definitions
        /*
        this.al_deckCompletions = al_deckCompletions;
        this.al_deckCounts = al_deckCounts;
        this.al_deckSymbols = al_deckSymbols;
        this.al_deckDescriptions = al_deckDescriptions;
        */
    }

    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.deck_layout, parent, false);
        return new ItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {
        holder.textView.setText(al_deckNames.get(position));

        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(holder.getAdapterPosition() == 0){
                    context.startActivity(new Intent(context, ReviewActivity.class));
                    Toast.makeText(context.getApplicationContext(), "Selected: Deck 1!", Toast.LENGTH_SHORT).show();
                }else if(holder.getAdapterPosition() == 1){
                    Toast.makeText(context.getApplicationContext(), "Selected: Deck 2!", Toast.LENGTH_SHORT).show();
                }else{

                    Toast.makeText(context.getApplicationContext(), "Selected: Lobelia!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return al_deckNames.size();
    }

    public class ItemViewHolder extends RecyclerView.ViewHolder {
        CardView cardView;
        ImageView imageView;
        TextView textView, textView2;

        //Deck definitions
        ImageView iv_symbol;
        TextView tv_deckName, tv_description, tv_completion;
        public ItemViewHolder(@NonNull View itemView) {
            super(itemView);
            cardView = itemView.findViewById(R.id.cardView);
            textView = itemView.findViewById(R.id.tv_deckName);
        }
    }
}
