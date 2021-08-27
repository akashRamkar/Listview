package com.example.myfirstlistview;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
private ArrayList<String> languages=new ArrayList<>();
private ArrayAdapter arrayAdapter;
private static ListView mylistview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        languages.add("C++");
        languages.add("java");
        languages.add("C");
        languages.add("Python");
        languages.add("javascript");
        languages.add("HTML");
        languages.add("CSS");
        languages.add("swift");
        mylistview=findViewById(R.id.list_view);
        arrayAdapter=new ArrayAdapter(MainActivity.this,R.layout.support_simple_spinner_dropdown_item,languages);
        mylistview.setAdapter(arrayAdapter);
      mylistview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
          @Override
          public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
              String lname=((TextView) view).getText().toString();
              Toast.makeText(MainActivity.this,lname,Toast.LENGTH_SHORT).show();
          }
      });

    }
}