package sg.edu.rp.c346.id18016094.p02_holidays;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.time.Year;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lv;
    TextView tv;
    ArrayAdapter aa;
    ArrayList<First> year;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = (ListView)this.findViewById(R.id.lv1);

        year = new ArrayList<First>();
        year.add(new First("Secular"));
        year.add(new First("Ethnic and Religion"));

        aa = new FirstAdapter(this, R.layout.row1, year);
        lv.setAdapter(aa);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                First selectedYear = year.get(position);
                String[] info = {selectedYear.getName()};
                Log.d("dqjndw", info.toString());

                Intent i = new Intent(MainActivity.this,SecondPage.class);
                i.putExtra("info",info);
                startActivity(i);
            }
        });
    }
}
