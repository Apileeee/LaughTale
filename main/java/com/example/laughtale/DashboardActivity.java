package com.example.laughtale;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class DashboardActivity extends AppCompatActivity {

    private RecyclerView menuRecyclerView;
    private MenuAdapter coffeeMenuAdapter;
    private List<CoffeeMenu> coffeeMenuList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        menuRecyclerView = findViewById(R.id.menuRecyclerView);
        menuRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        List<CoffeeMenu> items = new ArrayList<>();
        items.add(new CoffeeMenu("Espresso", "Rp 25.000", R.drawable.esspresso));
        items.add(new CoffeeMenu("Cappuccino", "Rp 30.000", R.drawable.cappucino));
        items.add(new CoffeeMenu("Latte", "Rp 35.000", R.drawable.latte));
        items.add(new CoffeeMenu("Mocha", "Rp 40.000", R.drawable.mocha));
        items.add(new CoffeeMenu("Americano", "Rp 28.000", R.drawable.americano));
        items.add(new CoffeeMenu("Macchiato", "Rp 35.000", R.drawable.machiato));
        items.add(new CoffeeMenu("Affogato", "Rp 45.000", R.drawable.affogato));
        // Tambahkan lebih banyak menu di sini...

        coffeeMenuAdapter = new MenuAdapter(items);
        menuRecyclerView.setAdapter(coffeeMenuAdapter);
    }
}
