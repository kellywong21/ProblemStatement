package sg.edu.rp.c346.problemstatement;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvHolidaysType;
    ArrayList<String> holidayTypesList = new ArrayList<>();
    ArrayAdapter<String> aa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvHolidaysType = findViewById(R.id.lvHolidayTypes);
        aa = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,holidayTypesList);
        holidayTypesList.add("Secular");
        holidayTypesList.add("Ethnic & Religion");
        lvHolidaysType.setAdapter(aa);

        lvHolidaysType.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                intent.putExtra("types",holidayTypesList.get(position));
                startActivity(intent);
            }
        });


    }
}
