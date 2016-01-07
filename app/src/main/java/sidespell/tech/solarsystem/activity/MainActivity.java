package sidespell.tech.solarsystem.activity;

import android.media.Image;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Spinner;

import sidespell.tech.solarsystem.R;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

private ImageView planet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        spinner.setOnItemSelectedListener(this);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.planets_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);


    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

        ImageView img = (ImageView) findViewById(R.id.planet);



        if(parent.getItemAtPosition(position).toString().equals("Mercury")){
                img.setImageResource(R.drawable.mercury);
        }

        if(parent.getItemAtPosition(position).toString().equals("Mars")){
            img.setImageResource(R.drawable.mars);
        }
        if(parent.getItemAtPosition(position).toString().equals("Earth")){
            img.setImageResource(R.drawable.earth);
        }

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
