package jehealneil.sih.com.week14;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class espanya extends AppCompatActivity {

    public void process (View v) {
        Intent i = null, chooser = null;

        if (v.getId() == R.id.kfcespanya) {

            i = new Intent(this, kfcespanya.class);

            startActivity(i);
        }

        if (v.getId() == R.id.mcdoespanya) {

            i = new Intent(this, mcdoespanya.class);

            startActivity(i);
        }
        if (v.getId() == R.id.bentesilogespanya) {

            i = new Intent(this, bentesilogespanya.class);

            startActivity(i);
        }

        if (v.getId() == R.id.ycespanya) {

            i = new Intent(this, ycespanya.class);

            startActivity(i);
        }
        if (v.getId() == R.id.amorbakeryespanya) {

            i = new Intent(this, amorbakeryespanya.class);

            startActivity(i);
        }
        if (v.getId() == R.id.amoyamieespanya) {

            i = new Intent(this, amoyamieespanya.class);

            startActivity(i);
        }
        if (v.getId() == R.id.samgespanya) {

            i = new Intent(this, samgespanya.class);

            startActivity(i);
        }
        if (v.getId() == R.id.paresespanya) {

            i = new Intent(this, paresespanya.class);

            startActivity(i);
        }
    }



       @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_lacson);
            final int currentItem = 0;
            Spinner mySpinner = (Spinner) findViewById(R.id.spinner1);


            ArrayAdapter<String> myAdapter = new ArrayAdapter<>(espanya.this,
                    android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.names));
            myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            mySpinner.setAdapter(myAdapter);

            mySpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                    if(currentItem==position){
                        return;

                    }else{
                        Intent intent = new Intent(espanya.this,MainActivity.class);
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
