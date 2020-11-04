package id.ac.itn.myprofile.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import java.util.ArrayList;

import id.ac.itn.myprofile.Main.Praktikum.Tugas2.MainTugas_2;
import id.ac.itn.myprofile.Main.Praktikum.Tugas3.MainTugas_3;
import id.ac.itn.myprofile.Main.Praktikum.Tugas4.MainTugas_4;
import id.ac.itn.myprofile.Main.Praktikum.Tugas5.MainTugas_5;
import id.ac.itn.myprofile.Model.KModel;
import id.ac.itn.myprofile.R;

public class PAdapter extends PagerAdapter {
    private Context context;
    private ArrayList<KModel> modelArrayList;

    int i;

    public PAdapter(Context context, ArrayList<KModel> modelArrayList) {
        this.context = context;
        this.modelArrayList = modelArrayList;
    }

    @Override
    public int getCount() {
        return modelArrayList.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view.equals(object);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        View view = LayoutInflater.from(context).inflate(R.layout.card_item, container, false);

        //init from card_item.xml
        ImageView ivBanner = view.findViewById(R.id.ivBanner);
        TextView tvTitle = view.findViewById(R.id.tvTitle);
        TextView tvDescription = view.findViewById(R.id.tvDescription);
        TextView tvDate = view.findViewById(R.id.tvDate);

        //get data
        KModel model = modelArrayList.get(position);
        final String title = model.getTitle();
        String description = model.getDessription();
        String date = model.getDate();
        int image = model.getImage();

        //set data
        ivBanner.setImageResource(image);
        tvTitle.setText(title);
        tvDescription.setText(description);
        tvDate.setText(date);

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Class c=null;
                switch (position){
                    case 0:
                        c = MainTugas_2.class;
                        break;
                    case 1:
                        c = MainTugas_3.class;
                        break;
                    case 2:
                        c = MainTugas_4.class;
                        break;
                    case 3:
                        c = MainTugas_5.class;
                        break;
                }
                Intent intent = new Intent(context, c);
                context.startActivity(intent);
                Toast.makeText(context, title+ "\n"+description+"\n"+date, Toast.LENGTH_SHORT).show();
            }
        });

        container.addView(view, position);

        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View)object);
    }
}
