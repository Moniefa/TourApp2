package com.robotemi.sdk.sample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class LocationActivity extends AppCompatActivity {


        String[] array = {"Left", "Right", "Up", "Down"};

        @Override
        protected void onCreate (Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_location);


            Spinner spinner = (Spinner) findViewById(R.id.locationsSpinner);
// Spinner click listener
            ArrayAdapter aa = new ArrayAdapter(this, android.R.layout.simple_spinner_item, array);
            aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            //Setting the ArrayAdapter data on the Spinner
            spinner.setAdapter(aa);

            System.out.println(spinner.getCount());


//            // Creating adapter for spinner
//            ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, array);
//
//            // Drop down layout style - list view with radio button
//            dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//
//            // attaching data adapter to spinner
//            spinner.setAdapter(dataAdapter);



//            aa.onItemSelectedListener = object :
//            AdapterView.OnItemSelectedListener {
//                override fun onItemSelected(parent:AdapterView<>,
//                view:
//                View, position:Int, id:Long){
//                    Toast.makeText(this @MainActivity,
//                    getString(R.string.selected_item) + " " +
//                            "" + languages[position], Toast.LENGTH_SHORT).show()
//                }
//
//                override fun onNothingSelected(parent:AdapterView<>){
//                    // write code to perform some action
//                }
//            }




    }

    public void onItemSelected(AdapterView<?> arg0, View arg1, int position, long id) {
        Toast.makeText(getApplicationContext(), array[position], Toast.LENGTH_LONG).show();
    }

    public void onNothingSelected(AdapterView<?> arg0) {
// TODO Auto-generated method stub

    }

}