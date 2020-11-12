package id.ac.itn.myprofile.Main.Praktikum.Tugas5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

import id.ac.itn.myprofile.R;

public class MainTugas_5 extends AppCompatActivity {
    private RecyclerView rvMahasiswa;
    private final ArrayList<Mahasiswa> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_tugas_5);

        rvMahasiswa = findViewById(R.id.mahasiswa);
        rvMahasiswa.setHasFixedSize(true);

        list.addAll(DataMahasiswa.getListData());
        showRecyclerList();
    }

    private void showRecyclerList(){
        rvMahasiswa.setLayoutManager(new LinearLayoutManager(this));
        ListMahasiswaAdapter listHeroAdapter = new ListMahasiswaAdapter(list);
        rvMahasiswa.setAdapter(listHeroAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_tugas5, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    @SuppressLint("NonConstantResourceId")
    public void setMode(int selectedMode) {
        switch (selectedMode) {
            case R.id.action_list:
            case R.id.action_cardview:
            case R.id.action_grid:
                break;
        }
    }
}