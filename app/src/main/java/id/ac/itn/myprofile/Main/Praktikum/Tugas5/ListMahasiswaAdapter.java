package id.ac.itn.myprofile.Main.Praktikum.Tugas5;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

import id.ac.itn.myprofile.R;

public class ListMahasiswaAdapter extends RecyclerView.Adapter<ListMahasiswaAdapter.ListViewHolder> {
    private ArrayList<Mahasiswa> listMahasiswa;

    public ListMahasiswaAdapter(ArrayList<Mahasiswa> list) {
        this.listMahasiswa = list;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_mahasiswa, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {
        Mahasiswa mahasiswa = listMahasiswa.get(position);
        Glide.with(holder.itemView.getContext())
                .load(mahasiswa.getPhoto())
                .apply(new RequestOptions().override(55, 55))
                .into(holder.imgPhoto);
        holder.tvName.setText(mahasiswa.getName());
        holder.tvDetail.setText(mahasiswa.getDetail());
    }

    @Override
    public int getItemCount() {
        return listMahasiswa.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvDetail;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvDetail = itemView.findViewById(R.id.tv_item_detail);
        }
    }
}
