package id.ac.itn.myprofile.Main.Kuliah.Pertemuan1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

import id.ac.itn.myprofile.Main.MainKuliah;
import id.ac.itn.myprofile.Main.MainPraktikum;
import id.ac.itn.myprofile.Main.MainScreen;
import id.ac.itn.myprofile.Main.Praktikum.Tugas2.MainBiodata;
import id.ac.itn.myprofile.Main.Praktikum.Tugas2.MainTugas_2;
import id.ac.itn.myprofile.R;
import me.ibrahimsn.lib.SmoothBottomBar;

public class MainPertemuan2 extends AppCompatActivity {
    SmoothBottomBar BottomBar;
    Button button;

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_pertemuan2);

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

        WebView webView = findViewById(R.id.webview);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("https://drive.google.com/file/d/1-CJ-6lki2Hu3HW6F318ZjaqOojSrZ7Iu/view?usp=sharing");



        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(MainPertemuan2.this, MainScreen.class);
                startActivity(a);
            }
        });
    }
}