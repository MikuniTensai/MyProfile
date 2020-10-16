package id.ac.itn.myprofile.Main;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.makeramen.roundedimageview.RoundedImageView;
import id.ac.itn.myprofile.Fragment.FragmentMyProfile;
import id.ac.itn.myprofile.R;
import me.ibrahimsn.lib.SmoothBottomBar;

public class MainScreen extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = MainActivity.class.getSimpleName();

    //Sosial Media
    RoundedImageView rivWhatsApp, rivInstagram, rivFacebook, rivTwitter, rivYoutube, rivBlog;
    TextView tvWhatsApp, tvInstagram, tvFacebook, tvTwitter, tvYoutube, tvBlog;

    ImageView ivMyprofile;
    SmoothBottomBar BottomBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);

        //Sosial Media
        rivWhatsApp = findViewById(R.id.rivWhatsApp);
        tvWhatsApp = findViewById(R.id.tvWhatsApp);
        rivInstagram = findViewById(R.id.rivInstagram);
        tvInstagram = findViewById(R.id.tvInstagram);
        rivFacebook = findViewById(R.id.rivFacebook);
        tvFacebook = findViewById(R.id.tvFacebook);
        rivTwitter = findViewById(R.id.rivTwitter);
        tvTwitter = findViewById(R.id.tvTwitter);
        rivYoutube = findViewById(R.id.rivYoutube);
        tvYoutube = findViewById(R.id.tvYoutube);
        rivBlog = findViewById(R.id.rivBlog);
        tvBlog = findViewById(R.id.tvBlog);

        ivMyprofile = findViewById(R.id.ivMyProfile);
        BottomBar = findViewById(R.id.BottomBar);
        BottomBar.setOnItemSelectedListener(i -> {
            switch (i){
                case 0:
                    Intent home = new Intent(this, MainScreen.class);
                    startActivity(home);
//                    Toast.makeText(getBaseContext(), "Home", Toast.LENGTH_SHORT).show();
                    break;
                case 1:
                    Intent kuliah = new Intent(this, MainKuliah.class);
                    startActivity(kuliah);
                    break;
                case 2:
                    Intent praktikum = new Intent(this, MainPraktikum.class);
                    startActivity(praktikum);
                    break;
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();

        rivWhatsApp.setOnClickListener(this);
        tvWhatsApp.setOnClickListener(this);
        rivInstagram.setOnClickListener(this);
        tvInstagram.setOnClickListener(this);
        rivFacebook.setOnClickListener(this);
        tvFacebook.setOnClickListener(this);
        rivTwitter.setOnClickListener(this);
        tvTwitter.setOnClickListener(this);
        rivYoutube.setOnClickListener(this);
        tvYoutube.setOnClickListener(this);
        rivBlog.setOnClickListener(this);
        tvBlog.setOnClickListener(this);

        ivMyprofile.setOnClickListener(this);
        BottomBar.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if((view.getId() == R.id.rivWhatsApp) || (view.getId() == R.id.tvWhatsApp)){
            Intent intent = new Intent();
            intent.setAction(Intent.ACTION_VIEW);
            intent.addCategory(Intent.CATEGORY_BROWSABLE);
            intent.setData(Uri.parse("https://wa.link/62wi61"));
            startActivity(intent);
        }
        if (view.getId() == R.id.rivInstagram || (view.getId() == R.id.tvInstagram)){
            Intent intent = new Intent();
            intent.setAction(Intent.ACTION_VIEW);
            intent.addCategory(Intent.CATEGORY_BROWSABLE);
            intent.setData(Uri.parse("https://www.instagram.com/mikunitensai/"));
            startActivity(intent);
        }
        if (view.getId() == R.id.rivFacebook || (view.getId() == R.id.tvFacebook)){
            Intent intent = new Intent();
            intent.setAction(Intent.ACTION_VIEW);
            intent.addCategory(Intent.CATEGORY_BROWSABLE);
            intent.setData(Uri.parse("https://www.facebook.com/MlKUNITENSAI/"));
            startActivity(intent);
        }
        if (view.getId() == R.id.rivTwitter || view.getId() == R.id.tvTwitter){
            Intent intent = new Intent();
            intent.setAction(Intent.ACTION_VIEW);
            intent.addCategory(Intent.CATEGORY_BROWSABLE);
            intent.setData(Uri.parse("https://twitter.com/MikuniTensai"));
            startActivity(intent);
        }
        if (view.getId() == R.id.rivYoutube || view.getId() == R.id.tvYoutube){
            Intent intent = new Intent();
            intent.setAction(Intent.ACTION_VIEW);
            intent.addCategory(Intent.CATEGORY_BROWSABLE);
            intent.setData(Uri.parse("https://www.youtube.com/channel/UCEWV2o5KsFndN_9k0UuP9fA?view_as=subscriber"));
            startActivity(intent);
        }
        if (view.getId() == R.id.rivBlog || view.getId() == R.id.tvBlog){
            Intent intent = new Intent();
            intent.setAction(Intent.ACTION_VIEW);
            intent.addCategory(Intent.CATEGORY_BROWSABLE);
            intent.setData(Uri.parse("https://mikunitensai.blogspot.com/"));
            startActivity(intent);
        }
        if (view.getId() == R.id.ivMyProfile){
            FragmentManager fm = getSupportFragmentManager();
            Fragment fragmentmyprofile = new FragmentMyProfile();
            Fragment fragment = fm.findFragmentByTag(FragmentMyProfile.class.getSimpleName());
            if (!(fragment instanceof FragmentMyProfile)){
                Log.d(TAG, "onCreate: " + FragmentMyProfile.class.getSimpleName());
                fm.beginTransaction()
                        .add(R.id.frame_cointainer, fragmentmyprofile, FragmentMyProfile.class.getSimpleName())
                        .commit();
            }
        }
    }
}