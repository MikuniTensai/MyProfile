package id.ac.itn.myprofile.Main;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;

import id.ac.itn.myprofile.Adapter.PAdapter;
import id.ac.itn.myprofile.Model.KModel;
import id.ac.itn.myprofile.R;
import me.ibrahimsn.lib.SmoothBottomBar;

public class MainKuliah extends AppCompatActivity {

    SmoothBottomBar BottomBar;

    private ActionBar actionbar;
    private ViewPager viewPager;
    private ArrayList<KModel> modelArrayList;
    private PAdapter pAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_kuliah);

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
        //init action bar
        actionbar = getSupportActionBar();

        //init UI views
        viewPager = findViewById(R.id.viewPager);
        loadCards();

        //set viewpager change listener
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                //ill just change the title of action bar
//                String title = modelArrayList.get(position).getTitle();
//                actionbar.setTitle(title);
            }

            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }

    private void loadCards() {
        //init list
        modelArrayList = new ArrayList<>();

        //add items to list
        modelArrayList.add(new KModel(
                "Tugas 1 - Instalasi Android Studio",
                "Android Studio adalah lingkungan pengembangan terintegrasi resmi untuk sistem operasi Android Google, yang dibangun di perangkat lunak IntelliJ IDEA JetBrains dan dirancang khusus untuk pengembangan Android.",
                "10/10/2020",
                R.drawable.brochure));
        modelArrayList.add(new KModel(
                "BAB 2 - Intent",
                "Intent adalah mekanisme untuk melakukan sebuah aksi dan komunikasi antar komponen aplikasi pada platform Android. Atau dapat juga dijelaskan sebagai sebuah object yang memungkinkan kita untuk dapat berkomunikasi antara Activity satu dengan Activity lainnya.",
                "18/10/2020",
                R.drawable.namecard));
        modelArrayList.add(new KModel(
                "Tugas 3",
                "Description 03",
                "17/10/2020",
                R.drawable.poster));
        modelArrayList.add(new KModel(
                "Tugas 4",
                "Description 04",
                "17/10/2020",
                R.drawable.sticker));

        //setup adapter
        pAdapter = new PAdapter(this, modelArrayList);
        //set adapter to view pager
        viewPager.setAdapter(pAdapter);
        //set default padding
        viewPager.setPadding(100,0,100,0);

    }
}