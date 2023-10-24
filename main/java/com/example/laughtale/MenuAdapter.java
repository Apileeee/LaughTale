package com.example.laughtale;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.text.BreakIterator;
import java.util.List;

public class MenuAdapter extends RecyclerView.Adapter<MenuAdapter.MenuViewHolder> {

    private List<CoffeeMenu> menuItems;

    public MenuAdapter(List<CoffeeMenu> menuItems) {
        this.menuItems = menuItems;
    }

    @NonNull
    @Override
    public MenuViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_menu_item, parent, false);
        return new MenuViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MenuViewHolder holder, int position) {
        CoffeeMenu coffeeMenu = menuItems.get(position);
        holder.menuTitleTextView.setText(coffeeMenu.getMenuTitle());
        holder.menuPrice.setText(coffeeMenu.getPrice());
        holder.menuImageView.setImageResource(coffeeMenu.getImageResource());
        // Tambahkan logika untuk menetapkan gambar di sini jika diperlukan
    }

    @Override
    public int getItemCount() {
        return menuItems.size();
    }

    public static class MenuViewHolder extends RecyclerView.ViewHolder {
        TextView menuPrice;
        ImageView menuImageView;
        TextView menuTitleTextView;

        public MenuViewHolder(View itemView) {
            super(itemView);
            menuImageView = itemView.findViewById(R.id.menuImageView);
            menuTitleTextView = itemView.findViewById(R.id.menuTitleTextView);
            menuPrice = itemView.findViewById(R.id.menuPriceTextView);
        }
    }
}
