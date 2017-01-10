package com.example.weiss.iban;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Spinner;

/**
 * Created by weiss on 1/10/2017.
 */

public class Settings extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings);

        final CheckBox simCountry = (CheckBox) findViewById(R.id.checkBox2);
        final Spinner country = (Spinner) findViewById(R.id.spinner2);

        if (simCountry.isEnabled()) {
            country.setEnabled(false);
        } else {
            country.setEnabled(true);
        }

        simCountry.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (simCountry.isChecked()) {
                    country.setEnabled(false);
                } else {
                    country.setEnabled(true);
                }
            }
        });

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.country_array, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        country.setAdapter(adapter);
    }
}
