package id.ac.itn.myprofile.Main.Praktikum.Tugas7;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import id.ac.itn.myprofile.R;

public class MainCreate extends AppCompatActivity {
    private MyDatabase db;
    private EditText Enama, Ekelas;
    private String Snama, Skelas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_create);
        db = new MyDatabase(this);
        Enama = (EditText) findViewById(R.id.create_nama);
        Ekelas = (EditText) findViewById(R.id.create_kelas);
        Button btnCreate = (Button) findViewById(R.id.create_btn);
        btnCreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snama = String.valueOf(Enama.getText());
                Skelas = String.valueOf(Ekelas.getText());
                if (Snama.equals("")){
                    Enama.requestFocus();
                    Toast.makeText(MainCreate.this, "Silahkan isi nama",
                            Toast.LENGTH_SHORT).show();
                } else if (Skelas.equals("")){
                    Ekelas.requestFocus();
                    Toast.makeText(MainCreate.this, "Silahkan isi kelas",
                            Toast.LENGTH_SHORT).show();
                } else {
                    Enama.setText("");
                    Ekelas.setText("");
                    Toast.makeText(MainCreate.this, "Data telah ditambah",
                            Toast.LENGTH_SHORT).show();
                    db.CreateMahasiswa(new Mahasiswa(null, Snama, Skelas));
                    Intent a = new Intent(MainCreate.this, MainTugas_7.class);
                    startActivity(a);
                }
            }
        });
    }
}
