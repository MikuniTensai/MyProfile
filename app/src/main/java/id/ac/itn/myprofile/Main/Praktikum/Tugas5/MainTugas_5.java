package id.ac.itn.myprofile.Main.Praktikum.Tugas5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

import id.ac.itn.myprofile.R;

public class MainTugas_5 extends AppCompatActivity {
    private RecyclerView rvMahasiswa;
    private ArrayList<Mahasiswa> list = new ArrayList<>();

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
}