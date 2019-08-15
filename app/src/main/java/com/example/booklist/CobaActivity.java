package com.example.booklist;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class CobaActivity extends AppCompatActivity {

    String[] menuItem = {"Rindu", "Hujan", "Konspirasi Alam Semesta", "Bumi", "Bulan", "Rentang Kisah", "Bumi Manusia", "Perahu Kertas", "Aroma Karsa", "Filosofi Kopi"};
    Integer[] menuImage = {
            R.drawable.book1,
            R.drawable.book2,
            R.drawable.book3,
            R.drawable.book4,
            R.drawable.book5,
            R.drawable.book6,
            R.drawable.book7,
            R.drawable.book8,
            R.drawable.book9,
            R.drawable.book10};
    String[] menuLagi = {"Tere Liye", "Tere Liye", "Firsa Besari", "Tere Liye", "Tere Liye", "Gita Savitri", "Pramoedya Ananta Toer", "Dee Lestari",
            "Dee Lestasi", "Dee Lestari"};

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        ImageView ivAccount = findViewById(R.id.iv_account);

        ivAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CobaActivity.this, AccountActivity.class);
                startActivity(intent);

            }
        });

        toolbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // back button pressed
            }
        });

        ListAdapter adapter = new ListAdapter(this, menuItem, menuImage, menuLagi);
        listView = (ListView)findViewById(R.id.list_book);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               // Toast.makeText(getApplicationContext(), "Yang diklik adalah posisi ke : " + position, Toast.LENGTH_LONG).show();
                Intent intent = new Intent(getBaseContext(), DetailActivity.class);
                intent.putExtra("id", position);
                startActivity(intent);
            }
        });
    }
}
