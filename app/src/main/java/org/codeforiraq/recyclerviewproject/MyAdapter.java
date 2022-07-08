package org.codeforiraq.recyclerviewproject;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder>{
Context context;
List <filmList> list;

    public MyAdapter(Context context, List<filmList> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view = LayoutInflater.from(parent.getContext())
               .inflate(R.layout.film_list,parent,false);
return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
filmList film=list.get(position);
holder.name.setText(film.getName());
        holder.time.setText(film.getTime());
        holder.type.setText(film.getType());
        holder.description.setText(film.getDescription());
        holder.Image.setImageResource(film.getImage());


    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
TextView name,time,type,description;
ImageView Image;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
       name=itemView.findViewById(R.id.filmName);
       time=itemView.findViewById(R.id.time);
       type=itemView.findViewById(R.id.type);
       description=itemView.findViewById(R.id.description);
Image=itemView.findViewById(R.id.Image);
        }

        @Override
        public void onClick(View v) {
            int position =getAdapterPosition();
filmList model=list.get(position);
            Intent intent=new Intent(context,Details.class);
intent.putExtra("name",model.getName());
            intent.putExtra("type",model.getType());
            intent.putExtra("description",model.getDescription());
            intent.putExtra("image",model.getImage());
context.startActivity(intent);
        }
    }
}


