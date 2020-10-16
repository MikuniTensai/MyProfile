package id.ac.itn.myprofile.Main;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import id.ac.itn.myprofile.R;
import me.ibrahimsn.lib.SmoothBottomBar;

public class MainPraktikum extends AppCompatActivity {
    SmoothBottomBar BottomBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_praktikum);

        BottomBar = findViewById(R.id.BottomBar);
        BottomBar.setOnItemSelectedListener(i -> {
            switch (i){
                case 0:
                    Intent home = new Intent(this, MainScreen.class);
                    startActivity(home);
                    break;
                case 1:
                    Intent kuliah = new Intent(this, MainKuliah.class);
                    startActivity(kuliah);
                    break;
                case 2:
                    Intent praktikum = new Intent(this, MainPraktikum.class);
                    startActivity(praktikum);
                    break;
            }
        });
    }
}