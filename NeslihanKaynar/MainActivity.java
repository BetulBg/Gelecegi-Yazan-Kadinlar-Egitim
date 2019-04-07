package com.example.myappp;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottomNavigationView=findViewById(R.id.bottom);
        bottomNavigationView.setOnNavigationItemSelectedListener
                (new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                        if (menuItem.getItemId() == R.id.favorite) {
                            Toast.makeText(MainActivity.this, "Beğendiklerime tıklandı."
                                    , Toast.LENGTH_LONG).show();
                        } else if (menuItem.getItemId() == R.id.music) {
                            Toast.makeText(MainActivity.this, "Müziğe tıklandı.",
                                    Toast.LENGTH_SHORT).show();
                        } else if (menuItem.getItemId() == R.id.book) {
                            Toast.makeText(MainActivity.this, "Kitaba tıklandı.",
                                    Toast.LENGTH_SHORT).show();
                        }
                        return false;
                    }
                });
        FragmentTransaction transaction=getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frame_layout,new FavoriteFragment());
        transaction.commit();
    }

}
