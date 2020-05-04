package sg.edu.rp.c346.problemstatement;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class HolidayAdapter extends ArrayAdapter<Holidays> {
    private ArrayList<Holidays> holidays;
    private Context context;
    private ImageView ivPic;
    private TextView tvHoliday,tvDate;

    public HolidayAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Holidays> objects) {
        super(context, resource, objects);
        holidays = objects;
        this.context =context;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.row,parent,false);

        tvHoliday = rowView.findViewById(R.id.tvHoliday);
        tvDate = rowView.findViewById(R.id.tvDate);
        ivPic = rowView.findViewById(R.id.ivPic);

        Holidays currentHolidays = holidays.get(position);

        tvHoliday.setText(currentHolidays.getHolidayName());
        tvDate.setText(currentHolidays.getHolidayDates());
        if (currentHolidays.getHolidayName() == "New Year's Day"){
            ivPic.setImageResource(R.drawable.newyear);
        }else if (currentHolidays.getHolidayName() == "Labour Day"){
            ivPic.setImageResource(R.drawable.labourday);
        }else if(currentHolidays.getHolidayName() == "Christmas Day"){
            ivPic.setImageResource(R.drawable.christmas);
        }else if(currentHolidays.getHolidayName()=="National Day"){
            ivPic.setImageResource(R.drawable.nationalday);
        }else if(currentHolidays.getHolidayName()=="Chinese New Year"){
            ivPic.setImageResource(R.drawable.cny);
        }else if(currentHolidays.getHolidayName() == "Good Friday"){
            ivPic.setImageResource(R.drawable.goodfriday);
        }else if(currentHolidays.getHolidayName() == "Vesak Day"){
            ivPic.setImageResource(R.drawable.vesakday);
        }else if(currentHolidays.getHolidayName() == "Hari Raya Puasa"){
            ivPic.setImageResource(R.drawable.harirayapuasa);
        }else if (currentHolidays.getHolidayName() == "Hari Raya Haji"){
            ivPic.setImageResource(R.drawable.harirayahaji);
        }else{
            ivPic.setImageResource(R.drawable.deepavali);
        }
        return rowView;

    }
}
