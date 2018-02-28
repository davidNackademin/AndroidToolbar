package com.example.david.wed28toolbar;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setTitle("Welcome");
        toolbar.setSubtitle("all");

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
           toolbar.setElevation(10f);

        } else {
            // without material desig API below 21
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        String msg = "";

        switch (item.getItemId()) {
            case R.id.discard :
                msg = "delete";
                break;
            case R.id.search :
                msg = "search";
                break;
            case R.id.edit :
                msg = "edit";
                break;
            case R.id.settings :
                msg = "settings";
                break;
            case R.id.exit :
                msg = "exit";
                break;

        }

        Toast.makeText(this, msg + "clicked", Toast.LENGTH_SHORT).show();


        return super.onOptionsItemSelected(item);
    }


}
