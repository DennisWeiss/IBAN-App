package com.example.weiss.iban;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.Image;
import android.os.Bundle;
import android.os.Debug;
import android.preference.PreferenceManager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
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

import java.math.BigInteger;

/**
 * Created by weiss on 1/10/2017.
 */

public class CheckIBAN extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.checkiban);

        final EditText iban = (EditText) findViewById(R.id.editText);
        Button button = (Button) findViewById(R.id.button);
        final ImageView image = (ImageView) findViewById(R.id.imageView);
        final TextView output = (TextView) findViewById(R.id.textView3);

        Toolbar toolbar = (Toolbar) findViewById(R.id.my_toolbar);

        toolbar.setTitle("Validate IBAN");
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
        String ibanNumbers = iban.substring(4) + iban.substring(0, 4);
        ibanNumbers = replaceAllLetters(ibanNumbers);
        Log.i("IBAN NUMBERS", ibanNumbers);
        if (!lengthIsValid(iban.substring(0, 2), ibanNumbers.length())) {
            return false;
        }
        BigInteger number = new BigInteger(ibanNumbers);
        BigInteger remainder = number.mod(new BigInteger("97"));
        return remainder.equals(new BigInteger("1"));
    }

    String replaceAllLetters(String str) {
        str = str.replaceAll("A", "10");
        str = str.replaceAll("B", "11");
        str = str.replaceAll("C", "12");
        str = str.replaceAll("D", "13");
        str = str.replaceAll("E", "14");
        str = str.replaceAll("F", "15");
        str = str.replaceAll("G", "16");
        str = str.replaceAll("H", "17");
        str = str.replaceAll("I", "18");
        str = str.replaceAll("J", "19");
        str = str.replaceAll("K", "20");
        str = str.replaceAll("L", "21");
        str = str.replaceAll("M", "22");
        str = str.replaceAll("N", "23");
        str = str.replaceAll("O", "24");
        str = str.replaceAll("P", "25");
        str = str.replaceAll("Q", "26");
        str = str.replaceAll("R", "27");
        str = str.replaceAll("S", "28");
        str = str.replaceAll("T", "29");
        str = str.replaceAll("U", "30");
        str = str.replaceAll("V", "31");
        str = str.replaceAll("W", "32");
        str = str.replaceAll("X", "33");
        str = str.replaceAll("Y", "34");
        str = str.replaceAll("Z", "35");
        return str;
    }

    boolean lengthIsValid(String country, int length) {
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

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.validate_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.iban:
                IntentContainer.intent = new Intent(CheckIBAN.this, CheckIBAN.class);;
                startActivity(new Intent(CheckIBAN.this, MainActivity.class));
                return true;
            case R.id.action_settings:
                IntentContainer.intent = new Intent(CheckIBAN.this, CheckIBAN.class);;
                startActivity(new Intent(CheckIBAN.this, Settings.class));
                return true;
        }
        return true;
    }
}
