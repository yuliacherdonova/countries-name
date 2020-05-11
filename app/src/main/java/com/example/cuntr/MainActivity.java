package com.example.cuntr;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView list = findViewById(R.id.countryList);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.countries,
                android.R.layout.simple_list_item_1);
        list.setAdapter(adapter);


        list.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l)
            {
                Toast toast = Toast.makeText(getApplicationContext(), ((TextView)view).getText(), Toast.LENGTH_SHORT);
                toast.show();

            }
        });
    }
}