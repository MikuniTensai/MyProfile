package id.ac.itn.myprofile.Main.Praktikum.Tugas4.ui.kalkulator;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import org.w3c.dom.Text;

import id.ac.itn.myprofile.Main.Praktikum.Tugas4.MainTugas_4;
import id.ac.itn.myprofile.R;

public class KalkulatorFragment extends Fragment {
    Integer v1,v2,hasil;

    private KalkulatorViewModel kalkulatorViewModel;

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    @SuppressLint("SetTextI18n")
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        kalkulatorViewModel = new ViewModelProvider(this).get(KalkulatorViewModel.class);
        View root = inflater.inflate(R.layout.fragment_kalkulator, container, false);
        final EditText Bilangan1 = root.findViewById(R.id.edt_Bilangan1);
        final EditText Bilangan2 = root.findViewById(R.id.edt_Bilangan2);
        final TextView tv_Hasil = root.findViewById(R.id.tv_Hasil);
        final Button btn_tambah = root.findViewById(R.id.btn_tambah);
        final Button btn_kurang = root.findViewById(R.id.btn_kurang);
        final Button btn_bagi = root.findViewById(R.id.btn_bagi);
        final Button btn_kali = root.findViewById(R.id.btn_kali);

        btn_tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((Bilangan1.getText().length()>0) && (Bilangan2.getText().length()>0))
                {
                    v1 = Integer.parseInt(Bilangan1.getText().toString().trim());
                    v2 = Integer.parseInt(Bilangan2.getText().toString().trim());
                    int tambah = v1+v2;
                    tv_Hasil.setText(Integer.toString(tambah));
                }
                else{
                    Toast.makeText(getActivity(),"Masukan angka dengan benar!",Toast.LENGTH_SHORT).show();
                }
            }
        });

        btn_kurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((Bilangan1.getText().length()>0) && (Bilangan2.getText().length()>0))
                {
                    v1 = Integer.parseInt(Bilangan1.getText().toString().trim());
                    v2 = Integer.parseInt(Bilangan2.getText().toString().trim());
                    int tambah = v1-v2;
                    tv_Hasil.setText(Integer.toString(tambah));
                }
                else{
                    Toast.makeText(getActivity(),"Masukan angka dengan benar!",Toast.LENGTH_SHORT).show();
                }
            }
        });

        btn_bagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((Bilangan1.getText().length()>0) && (Bilangan2.getText().length()>0))
                {
                    v1 = Integer.parseInt(Bilangan1.getText().toString().trim());
                    v2 = Integer.parseInt(Bilangan2.getText().toString().trim());
                    int tambah = v1/v2;
                    tv_Hasil.setText(Integer.toString(tambah));
                }
                else{
                    Toast.makeText(getActivity(),"Masukan angka dengan benar!",Toast.LENGTH_SHORT).show();
                }
            }
        });

        btn_kali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((Bilangan1.getText().length()>0) && (Bilangan2.getText().length()>0))
                {
                    v1 = Integer.parseInt(Bilangan1.getText().toString().trim());
                    v2 = Integer.parseInt(Bilangan2.getText().toString().trim());
                    int tambah = v1*v2;
                    tv_Hasil.setText(Integer.toString(tambah));
                }
                else{
                    Toast.makeText(getActivity(),"Masukan angka dengan benar!",Toast.LENGTH_SHORT).show();
                }
            }
        });

        kalkulatorViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
//                textView.setText(s);
            }
        });
        return root;
    }

}
