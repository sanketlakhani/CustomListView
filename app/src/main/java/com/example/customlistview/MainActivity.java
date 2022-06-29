package com.example.customlistview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    String[] number={"9877654322","87498747","63268273879","9877654322","87498747","63268273879","9877654322","87498747","63268273879","63268273879","63268273879"};
    String[] contactList={"Mom","Dad","Bhai","Ben","Kaka","Kaki","Bapa","Motaba","Bhabhi","Fai","Fuva"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initview();
    }
    private void initview() {

        listView=findViewById(R.id.listView);

        MyAdapter adapter=new MyAdapter(contactList, this,number);
        listView.setAdapter(adapter);

    }
}