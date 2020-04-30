package sg.edu.rp.c346.id18016094.p02_holidays;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class SecondPage extends AppCompatActivity {
    ListView lv;
    TextView tvDisplayYear;
    ArrayAdapter aa;
    ArrayList<Second> ss, a2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.row2);

        lv = (ListView) this.findViewById(R.id.listlist);
        tvDisplayYear = (TextView) findViewById(R.id.textView);


        //Getting the intent so as to get the data inside the intent
        Intent i =getIntent();
        //Get the String array named info we passed in
        String info = i.getStringExtra("info");

        ss = new ArrayList<Second>();
        ss = new ArrayList<Second>();
        ss.add(new Second("New Year", "1 January 2020", R.drawable.new_year));
        ss.add(new Second("National Day", "9 August 2020", R.drawable.national_day));
        a2 = new ArrayList<Second>();
        a2.add(new Second("Chinese New Year", "25-26 January 2020", R.drawable.cny));
        a2.add(new Second("Vesak Day", "10 April 2020", R.drawable.vesak_day));
        a2.add(new Second("Hari Raya Puasa", "24 May 2020", R.drawable.hari_raya_puasa));
        a2.add(new Second("Hari Raya Haji", "31 July 2020", R.drawable.hari_raya_haji));
        a2.add(new Second("Depavali Day", "14 November 2020", R.drawable.deepavali));
        a2.add(new Second("Christmas Day", "25 December 2020", R.drawable.christmas));
        aa = new SecondAdapter(this,R.layout.activity_second_page,ss);
        lv.setAdapter(aa);
    }
}
