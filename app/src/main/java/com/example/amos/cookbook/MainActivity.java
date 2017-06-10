package com.example.amos.cookbook;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    String [] titles = {"Recipe of Bhaji Par Eeda", "Recipe of Chicken 65 Kerala Style", "Recipe of Chicken 65, Dakshin", "Recipe of Cheese & Jalapeno Stuffed Kachori", "Recipe of Mixed Sprouts Corn Chaat", "Recipe of Paneer Methi Satay", "Recipe of Mocha Chingri", "Recipe of Aam Channa Chaat", "Recipe of Sol Kadi (Konkani Kokum Drink)", "Recipe of Mango Rice", "Recipe of Kashmiri Mutton Koftas", "Recipe of Dal Makhni (My Yellow Table)", "Recipe of Laal Duck Mole", "Recipe of Aam Channa Chaat", "Recipe of Dry Mango Kuzhambu", "Recipe of Mango Rice", "Recipe of Sol Kadi (Konkani Kokum Drink)", "Recipe of Moong Dal Chila", "Recipe of Avakkai", "Recipe of Parsi Eggs"};
    ListView foodList;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        foodList =(ListView)findViewById(R.id.food);

        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, titles);
        foodList.setAdapter(adapter);
        foodList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent main = new Intent(MainActivity.this, details.class);
                main.putExtra("pos", position+1);
                startActivity(main);

            }
        });
    }
}
