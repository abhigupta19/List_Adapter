package com.sar.user.list_adapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
  ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=findViewById(R.id.dyanmic);
        List<String> list=new ArrayList<String>();
        list.add("abhinav");
        list.add("anurag");
        list.add("lala");

        UserAdapter userAdapter=new UserAdapter(this,listView,list);
        listView.setAdapter(userAdapter);
    }
}
