package id.ac.itn.myprofile.Main.Praktikum.Tugas6;

import android.app.Dialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.text.format.DateFormat;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;
import java.util.Calendar;

public class TimePickerFragment extends DialogFragment {
    Calendar c;
    int jam, menit;
    @NonNull
    @Override
    public Dialog onCreateDialog(@NonNull Bundle savedInstanceState){
        c = Calendar.getInstance();
        jam = c.get(Calendar.HOUR_OF_DAY);
        menit = c.get(Calendar.MINUTE);
        return new TimePickerDialog(getActivity(), (TimePickerDialog.OnTimeSetListener) getActivity(), jam, menit, DateFormat.is24HourFormat(getActivity()));
    }
}

