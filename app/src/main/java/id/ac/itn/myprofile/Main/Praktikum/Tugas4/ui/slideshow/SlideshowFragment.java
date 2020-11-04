package id.ac.itn.myprofile.Main.Praktikum.Tugas4.ui.slideshow;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import id.ac.itn.myprofile.R;

public class SlideshowFragment extends Fragment {

    private SlideshowViewModel slideshowViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        slideshowViewModel =
                new ViewModelProvider(this).get(SlideshowViewModel.class);
        View root = inflater.inflate(R.layout.fragment_slideshow, container, false);
//        final TextView textView = root.findViewById(R.id.text_slideshow);
        slideshowViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
//                textView.setText(s);
                final EditText edtNama
                        =root.findViewById(R.id.input_nama);
                final EditText edtNim
                        =root.findViewById(R.id.input_nim);
                final EditText edtJurusan
                        =root.findViewById(R.id.input_jurusan);
                final EditText edtAngkatan
                        =root.findViewById(R.id.input_angkatan);
                final TextView tvNama =
                        root.findViewById(R.id.output_nama);
                final TextView tvNim =
                        root.findViewById(R.id.output_nim);
                final TextView tvJurusan =
                        root.findViewById(R.id.output_jurusan);
                final TextView tvAngkatan =
                        root.findViewById(R.id.output_angkatan);
                final Button btnTampil=
                        root.findViewById(R.id.btn_tampil);

                btnTampil.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        tvNama.setText(edtNama.getText().toString());
                        tvNim.setText(edtNim.getText().toString());
                        tvJurusan.setText(edtJurusan.getText().toString());
                        tvAngkatan.setText(edtAngkatan.getText().toString());
                    }
                });
            }
        });
        return root;
    }
}