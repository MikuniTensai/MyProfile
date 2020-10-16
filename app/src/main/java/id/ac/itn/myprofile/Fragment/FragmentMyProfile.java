package id.ac.itn.myprofile.Fragment;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import id.ac.itn.myprofile.R;
import me.ibrahimsn.lib.SmoothBottomBar;

public class FragmentMyProfile extends Fragment {

    SmoothBottomBar BottomBar;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_my_profile, container, false);

    }

}