package sg.edu.rp.c346.problemstatement;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {

    TextView tvType;
    ListView lvHolidays;
    ArrayList<Holidays> holiday = new ArrayList<>();
    ArrayAdapter aa;
    String types;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        tvType = findViewById(R.id.tvType);
        lvHolidays = findViewById(R.id.lvHolidays);

        Intent i = getIntent();
        types = i.getStringExtra("types");
        tvType.setText(types);

        if (types.equalsIgnoreCase("secular")){
            holiday.add(new Holidays("New Year's Day","1 Jan 2020"));
            holiday.add(new Holidays("Labour Day","1 May 2020"));
            holiday.add(new Holidays("Christmas Day","25 December 2020"));
            holiday.add(new Holidays("National Day","9 August 2020"));
        }else{
            holiday.add(new Holidays("Chinese New Year","25-26 Jan 2020"));
            holiday.add(new Holidays("Good Friday","10 April 2020"));
            holiday.add(new Holidays("Vesak Day","7 May 2020"));
            holiday.add(new Holidays("Hari Raya Puasa","24 May 2020"));
            holiday.add(new Holidays("Hari Raya Haji","31 July 2020"));
            holiday.add(new Holidays("Deepavali","14 November 2020"));
        }
        aa = new HolidayAdapter(this,R.layout.row,holiday);
        lvHolidays.setAdapter(aa);



















    }
}
