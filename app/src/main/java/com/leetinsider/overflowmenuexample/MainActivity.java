package com.leetinsider.overflowmenuexample;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        switch (id){
            case R.id.menu_red:
                if(item.isChecked()) item.setChecked(false);
                else item.setChecked(true);
                getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.RED));
                return true;
            case R.id.menu_cyan:
                if(item.isChecked()) item.setChecked(false);
                else item.setChecked(true);
                getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.CYAN));
                return true;
            case R.id.menu_yellow:
                if(item.isChecked()) item.setChecked(false);
                else item.setChecked(true);
                getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.YELLOW));
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }
}
