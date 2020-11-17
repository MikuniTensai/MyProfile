package id.ac.itn.myprofile.Main.Praktikum.Tugas7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import id.ac.itn.myprofile.R;

public class MainTugas_7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_tugas_7);
    }
    public void btn_create(View view){
        Intent a = new Intent(MainTugas_7.this, MainCreate.class);
        startActivity(a);
    }
    public void btn_read(View view) {
        Intent b = new Intent(MainTugas_7.this, MainRead.class);
        startActivity(b);
    }

}