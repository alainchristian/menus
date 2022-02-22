package com.example.menus;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.mymenu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.mnuView:
                Toast.makeText(this, "Selected view", Toast.LENGTH_SHORT).show();
                break;
            case R.id.mnuAdd:
                Toast.makeText(this, "Selected Add", Toast.LENGTH_SHORT).show();
                break;
            case R.id.mnuAbout:
                Toast.makeText(this, "Selected About", Toast.LENGTH_SHORT).show();
                break;
            case R.id.mnuLocation:
                Toast.makeText(this, "Selected Location", Toast.LENGTH_SHORT).show();
                break;
            case R.id.mnuContact:
                Toast.makeText(this, "Selected Contact", Toast.LENGTH_SHORT).show();
                break;
            case R.id.mnMore:
                Toast.makeText(this, "Selected More", Toast.LENGTH_SHORT).show();
                break;
        }

        return super.onOptionsItemSelected(item);
    }
}