package com.example.weiss.iban;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.Image;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

/**
 * Created by weiss on 1/10/2017.
 */

public class CheckIBAN extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.checkiban);

        final EditText iban = (EditText) findViewById(R.id.editText);
        Button button = (Button) findViewById(R.id.button);
        final ImageView image = (ImageView) findViewById(R.id.imageView);
        final TextView output = (TextView) findViewById(R.id.textView3);

        Toolbar toolbar = (Toolbar) findViewById(R.id.my_toolbar);

        toolbar.setTitle("Check IBAN");
        setSupportActionBar(toolbar);

        image.getLayoutParams().height = 150;
        image.getLayoutParams().width = 150;

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isValid(iban.getText().toString())) {
                    image.setImageResource(R.drawable.tick);
                    output.setText("This IBAN is valid.");
                } else {
                    image.setImageResource(R.drawable.cross);
                    output.setText("This IBAN is invalid.");
                }
            }
        });
    }

    boolean isValid(String iban) {
        //TODO: Implementation for Checking IBAN
        if (iban.length() < 3) {
            return false;
        }
        iban = iban.toUpperCase();
        String ibanNumbers = String.valueOf(iban.charAt(0) - 55) + String.valueOf(iban.charAt(1) - 55)
                + iban.substring(2);
        if (!lengthIsValid(iban.substring(0, 2), ibanNumbers.length())) {
            return false;
        }
        return false;
    }

    boolean lengthIsValid(String country, int length) {
        Log.i("Country", country);
        Log.i("Length", String.valueOf(length));
        switch (country) {
            case "AL":
                return length == 28;
            case "AD":
                return length == 24;
            case "AT":
                return length == 20;
            case "AZ":
                return length == 28;
            case "BH":
                return length == 22;
            case "BY":
                return length == 28;
            case "BE":
                return length == 16;
            case "BA":
                return length == 20;
            case "BR":
                return length == 29;
            case "BG":
                return length == 22;
            case "CR":
                return length == 22;
            case "HR":
                return length == 21;
            case "CY":
                return length == 28;
            case "CZ":
                return length == 24;
            case "DK":
                return length == 18;
            case "DO":
                return length == 28;
            case "TL":
                return length == 23;
            case "EE":
                return length == 20;
            case "FO":
                return length == 18;
            case "FI":
                return length == 18;
            case "FR":
                return length == 27;
            case "GE":
                return length == 22;
            case "DE":
                return length == 24;
            case "GI":
                return length == 23;
            case "GR":
                return length == 27;
            case "GL":
                return length == 18;
            case "GT":
                return length == 28;
            case "HU":
                return length == 28;
            case "IS":
                return length == 26;
            case "IE":
                return length == 22;
            case "IL":
                return length == 23;
            case "IT":
                return length == 27;
            case "JO":
                return length == 30;
            case "KZ":
                return length == 20;
            case "XK":
                return length == 20;
            case "KW":
                return length == 30;
            case "LV":
                return length == 21;
            case "LB":
                return length == 28;
            case "LI":
                return length == 21;
            case "LT":
                return length == 20;
            case "LU":
                return length == 20;
            case "MK":
                return length == 19;
            case "MT":
                return length == 31;
            case "MR":
                return length == 27;
            case "MU":
                return length == 30;
            case "MC":
                return length == 27;
            case "MD":
                return length == 24;
            case "ME":
                return length == 22;
            case "NL":
                return length == 18;
            case "NO":
                return length == 15;
            case "PK":
                return length == 24;
            case "PS":
                return length == 29;
            case "PL":
                return length == 28;
            case "PT":
                return length == 25;
            case "QA":
                return length == 29;
            case "RO":
                return length == 24;
            case "SM":
                return length == 27;
            case "SA":
                return length == 24;
            case "RS":
                return length == 22;
            case "SK":
                return length == 24;
            case "SI":
                return length == 19;
            case "ES":
                return length == 24;
            case "SE":
                return length == 24;
            case "CH":
                return length == 21;
            case "TN":
                return length == 24;
            case "TR":
                return length == 26;
            case "AE":
                return length == 23;
            case "GB":
                return length == 22;
            case "VG":
                return length == 24;
        }
        return false;
    }
}
