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
    ArrayList<Second> ss;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.row2);

        lv = (ListView) this.findViewById(R.id.listlist);
        tvDisplayYear = (TextView) findViewById(R.id.textView);

        //Getting the intent so as to get the data inside the intent
        Intent i =getIntent();
        //Get the String array named info we passed in
        String[] info = i.getStringArrayExtra("info");

        tvDisplayYear.setText(info[0]);


        ss = new ArrayList<Second>();

        ss.add(new Second("C208", true));
        ss.add(new Second("C200", false));
        ss.add(new Second("C346", true));

        aa = new SecondAdapter(this,R.layout.row2,ss);
        lv.setAdapter(aa);


    }
}
