package id.ac.itn.myprofile.Main;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

import id.ac.itn.myprofile.Adapter.KAdapter;
import id.ac.itn.myprofile.Model.KModel;
import id.ac.itn.myprofile.R;
import me.ibrahimsn.lib.SmoothBottomBar;

public class MainKuliah extends AppCompatActivity{

    SmoothBottomBar BottomBar;
    ViewPager viewpager;

    private ActionBar actionbar;
    private ViewPager viewPager;
    private ArrayList<KModel> modelArrayList;
    private KAdapter kAdapter;

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
                "Pertemuan 1",
                "RPS & Pengantar Mobile Programming",
                "21/09/2020",
                R.drawable.capture));
        modelArrayList.add(new KModel(
                "Pertemuan 2",
                "Activity and Intent",
                "28/09/2020",
                R.drawable.capture));
        modelArrayList.add(new KModel(
                "Pertemuan 3",
                "View & ViewGroup",
                "05/10/2020",
                R.drawable.capture));
        modelArrayList.add(new KModel(
                "Pertemuan 4",
                "Fragment and Style & Themes",
                "12/10/2020",
                R.drawable.capture));
        modelArrayList.add(new KModel(
                "Pertemuan 5",
                "RecyclerView",
                "12/10/2020",
                R.drawable.capture));
        //setup adapter
        kAdapter = new KAdapter(this, modelArrayList);
        //set adapter to view pager
        viewPager.setAdapter(kAdapter);
        //set default padding
        viewPager.setPadding(100,0,100,0);

    }
}