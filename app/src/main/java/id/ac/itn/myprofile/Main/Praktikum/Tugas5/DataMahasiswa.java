package id.ac.itn.myprofile.Main.Praktikum.Tugas5;

import java.util.ArrayList;

import id.ac.itn.myprofile.R;

public class DataMahasiswa {
    private static String[] namaMahasiswa = {
            "Mochamad Yusuf",
            "Evan Prima Prasetyo",
            "Hafid Zulkarnain",
            "Eldi Pramadhani",
            "Yoga Prasetyo",
            "Ardy Prayogo",
            "Kirene Wardaini Joas",
            "Sundari",
            "Muhammad Faisol Akbar",
            "Dhiemas Ariobimo Wijaya"
    };

    private static String[] detailMahasiswa = {
            "Mahasiswa Teknik Informatika | 2018 | Pengurus Himpunan }",
            "Mahasiswa Teknik Informatika | 2018 | Labolatorium",
            "Mahasiswa Teknik Informatika | 2018 | Labolatorium",
            "Mahasiswa Teknik Informatika | 2018 | Pengurus Himpunan",
            "Mahasiswa Teknik Informatika | 2018 | Pengurus Himpunan",
            "Mahasiswa Teknik Informatika | 2018 | Pengurus Himpunan",
            "Mahasiswa Teknik Informatika | 2018 | Pengurus Himpunan",
            "Mahasiswa Teknik Informatika | 2018 | Pengurus Himpunan",
            "Mahasiswa Teknik Informatika | 2018 | Pengurus Himpunan",
            "Mahasiswa Teknik Informatika | 2018 | Pengurus Himpunan"
    };

    private static int[] imagesMahasiswa = {
            R.drawable.mochamadyusuf,
            R.drawable.evan,
            R.drawable.hafid,
            R.drawable.eldi,
            R.drawable.yoga,
            R.drawable.ardy,
            R.drawable.warda,
            R.drawable.sundari,
            R.drawable.faisol,
            R.drawable.bimo
    };

    static ArrayList<Mahasiswa> getListData() {
        ArrayList<Mahasiswa> list = new ArrayList<>();
        for (int position = 0; position < namaMahasiswa.length; position++) {
            Mahasiswa mhs = new Mahasiswa();
            mhs.setName(namaMahasiswa[position]);
            mhs.setDetail(detailMahasiswa[position]);
            mhs.setPhoto(imagesMahasiswa[position]);
            list.add(mhs);
        }
        return list;
    }
}
