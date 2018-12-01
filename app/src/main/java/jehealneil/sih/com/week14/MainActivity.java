package jehealneil.sih.com.week14;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import com.weiwangcn.betterspinner.library.material.MaterialBetterSpinner;

public class MainActivity extends AppCompatActivity {



    public void process (View v) {
        Intent i = null, chooser = null;

        if (v.getId() == R.id.dimsumtreats) {

            i = new Intent(this, dimsumTreats.class);

            startActivity(i);
        }



            if (v.getId() == R.id.jollibee) {

                i = new Intent(this, jollibee.class);

                startActivity(i);
            }













         };



    //String [] SPINNERLIST={"DAPITAN", "P.NOVAL", "ESPANYA", "LACSON"};
    //@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final int currentItem = 0;
        Spinner mySpinner = (Spinner) findViewById(R.id.spinner1);


        ArrayAdapter<String> myAdapter = new ArrayAdapter<>(MainActivity.this,
                android.R.layout.simple_list_item_1,  getResources().getStringArray(R.array.names));
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mySpinner.setAdapter(myAdapter);

        mySpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {


                if(currentItem==position){
                    return;
                }else{
                    Intent intent = new Intent(MainActivity.this,Lacson.class);
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

        //ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line,SPINNERLIST);
        //MaterialBetterSpinner betterSpinner=(MaterialBetterSpinner)findViewById(R.id.android_material_design_spinner);
        //betterSpinner.setAdapter(arrayAdapter);





    }
}

