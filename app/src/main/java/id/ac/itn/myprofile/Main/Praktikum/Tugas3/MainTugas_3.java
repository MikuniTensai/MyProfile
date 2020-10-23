package id.ac.itn.myprofile.Main.Praktikum.Tugas3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.app.Fragment;
import android.os.Bundle;

import id.ac.itn.myprofile.Main.Praktikum.Tugas3.Fragment.FragmentA;
import id.ac.itn.myprofile.R;

public class MainTugas_3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_tugas_3);

        FragmentManager fragmentManager = getSupportFragmentManager();

        FragmentTransaction transaction = fragmentManager.beginTransaction();

        FragmentA fragment = new FragmentA();
        transaction.add(R.id.frame, fragment);
        transaction.addToBackStack("fragmentA");
        transaction.commit();
    }

    @Override
    public void onBackPressed() {
        if (getSupportFragmentManager().getBackStackEntryCount() == 1) {
            finish();
            return;
        }
        super.onBackPressed();
    }
}