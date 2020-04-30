package sg.edu.rp.c346.id18016094.p02_holidays;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
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
    ArrayList<First> yy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.row1);

        lv = (ListView)this.findViewById(R.id.lv1);

        yy = new ArrayList<First>();
        yy.add(new First("Secular"));

        aa = new FirstAdapter(this, R.layout.row1, yy);
        lv.setAdapter(aa);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                First selectedYear = yy.get(position);
                String[] info = {selectedYear.getHoli()};
                Intent i = new Intent(MainActivity.this, SecondPage.class);
                i.putExtra("info", info);
                startActivity(i);
            }
    });
    }
}
