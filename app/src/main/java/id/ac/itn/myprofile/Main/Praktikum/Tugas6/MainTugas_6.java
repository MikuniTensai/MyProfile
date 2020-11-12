package id.ac.itn.myprofile.Main.Praktikum.Tugas6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import id.ac.itn.myprofile.R;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.DialogFragment;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.TimePickerDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;
import java.text.DateFormat;
import java.util.Calendar;

public class MainTugas_6 extends AppCompatActivity implements TimePickerDialog.OnTimeSetListener, View.OnClickListener {

    private TextView txt;
    Button button, button_cencel;
    private NotificationHelper notificationHelper;
    Calendar c;
    int jam, menit;
    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_tugas_6);
        c = Calendar.getInstance();
        jam = c.get(Calendar.HOUR_OF_DAY);
        menit = c.get(Calendar.MINUTE);
        notificationHelper = new NotificationHelper(this);
        txt = (TextView) findViewById(R.id.txt_time);
        button = (Button) findViewById(R.id.btn_open);
        button.setOnClickListener(this);
        button_cencel = (Button) findViewById(R.id.btn_cancel);
        button_cencel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cancelAlarm();
            }
        });
    }
    @Override
    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
        c.set(Calendar.HOUR_OF_DAY, hourOfDay);
        c.set(Calendar.MINUTE, minute);
        c.set(Calendar.SECOND, 0);
        updateTime(c);
        startAlarm(c);
    }
    private void updateTime(Calendar c) {
        String timeText = "Alarm Set For : ";
        timeText += DateFormat.getTimeInstance(DateFormat.SHORT).format(c.getTime());
        txt.setText(timeText);
    }
    private void startAlarm(Calendar c) {
        AlarmManager alarmManager = (AlarmManager) getSystemService(Context.ALARM_SERVICE);
        Intent a = new Intent(this, AlertReceiver.class);
        PendingIntent b = PendingIntent.getBroadcast(this, 1, a, 0);
        alarmManager.setExact(AlarmManager.RTC_WAKEUP, c.getTimeInMillis(), b);
    }
    private void cancelAlarm() {
        AlarmManager alarmManager = (AlarmManager) getSystemService(Context.ALARM_SERVICE);
        Intent a = new Intent(this, AlertReceiver.class);
        PendingIntent b = PendingIntent.getBroadcast(this, 1, a, 0);
        alarmManager.cancel(b);
        txt.setText("Alarm Canceled");
    }
    @Override
    public void onClick(View v) {
        DialogFragment timePicker = new TimePickerFragment();
        timePicker.show(getSupportFragmentManager(), "Time Picker");
    }
}