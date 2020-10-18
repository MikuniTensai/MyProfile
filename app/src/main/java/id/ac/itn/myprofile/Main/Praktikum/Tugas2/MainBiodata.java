package id.ac.itn.myprofile.Main.Praktikum.Tugas2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import id.ac.itn.myprofile.R;

public class MainBiodata extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_biodata);

        final EditText nama = findViewById(R.id.input_nama);
        final EditText nim = findViewById(R.id.input_nim);
        final EditText jurusan = findViewById(R.id.input_jurusan);
        final EditText angkatan = findViewById(R.id.input_angkatan);
        final TextView nama_t = findViewById(R.id.output_nama);
        final TextView nim_t = findViewById(R.id.output_nim);
        final TextView jurusan_t = findViewById(R.id.output_jurusan);
        final TextView angkatan_t = findViewById(R.id.output_angkatan);
        final Button tampil = findViewById(R.id.btn_tampil);
        tampil.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String nama1 = nama.getText().toString();
                String nim1 = nim.getText().toString();
                String jurusan1 = jurusan.getText().toString();
                String angkatan1 = angkatan.getText().toString();
                nama_t.setText(nama1);
                nim_t.setText(nim1);
                jurusan_t.setText(jurusan1);
                angkatan_t.setText(angkatan1);
            }
        });
    }
}