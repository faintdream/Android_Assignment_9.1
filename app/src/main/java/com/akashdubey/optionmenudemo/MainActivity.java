package com.akashdubey.optionmenudemo;

import android.app.Activity;
import android.graphics.Color;
import android.support.annotation.ColorInt;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv=(TextView)findViewById(R.id.textview1);

       }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menu1=getMenuInflater();
        menu1.inflate(R.menu.main,menu);
//        return super.onCreateOptionsMenu(menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int itemId = item.getItemId();
        if(itemId==R.id.red){
            tv.setTextColor(getResources().getColor(R.color.red));
        }else if( itemId==R.id.green){
            tv.setTextColor(getResources().getColor(R.color.green));
        }else if(itemId==R.id.blue){
            tv.setTextColor(getResources().getColor(R.color.blue));
        }
        return super.onOptionsItemSelected(item);

    }
}
