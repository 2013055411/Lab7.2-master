package jehealneil.sih.com.week14;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;


public class Lacson extends AppCompatActivity {

    public void process (View v) {
        Intent i = null, chooser = null;

        if (v.getId() == R.id.bigguy) {

            i = new Intent(this, bigguys.class);

            startActivity(i);
        }


        if (v.getId() == R.id.mcdo) {

            i = new Intent(this, mcdo.class);

            startActivity(i);
        }
        if (v.getId() == R.id.ilar) {

            i = new Intent(this, ilars.class);

            startActivity(i);
        }
        if (v.getId() == R.id.jackos) {

            i = new Intent(this, jackos.class);

            startActivity(i);
        }
        if (v.getId() == R.id.ichill) {

            i = new Intent(this, ichill.class);

            startActivity(i);
        }
        if (v.getId() == R.id.xtreme) {

            i = new Intent(this, xtreme.class);

            startActivity(i);
        }
        if (v.getId() == R.id.octane) {

            i = new Intent(this, octane.class);

            startActivity(i);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lacson);
        final int currentItem = 0;
        Spinner mySpinner = (Spinner) findViewById(R.id.spinner1);


        ArrayAdapter<String> myAdapter = new ArrayAdapter<>(Lacson.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.names));
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mySpinner.setAdapter(myAdapter);

        mySpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                if(currentItem==position){
                    return;

                }else{
                    Intent intent = new Intent(Lacson.this,MainActivity.class);
                    startActivity(intent);
                    Toast.makeText(parent.getContext(),
                            "OnItemSelected: " + parent.getItemAtPosition(position).toString(),
                            Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


    }
}
