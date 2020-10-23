package id.ac.itn.myprofile.Main.Kuliah.Pertemuan1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

import id.ac.itn.myprofile.Main.MainKuliah;
import id.ac.itn.myprofile.Main.MainPraktikum;
import id.ac.itn.myprofile.Main.MainScreen;
import id.ac.itn.myprofile.R;
import me.ibrahimsn.lib.SmoothBottomBar;

public class MainPertemuan4 extends AppCompatActivity {
    SmoothBottomBar BottomBar;
    Button button;

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_pertemuan4);

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

        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(MainPertemuan4.this, MainScreen.class);
                startActivity(a);
            }
        });
    }
}