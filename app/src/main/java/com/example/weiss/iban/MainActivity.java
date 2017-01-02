package com.example.weiss.iban;

import android.*;
import android.Manifest;
import android.content.Context;
import android.content.pm.PackageManager;
import android.location.Location;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.view.inputmethod.InputMethodManager;
import android.util.Log;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner country = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.country_array, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        country.setAdapter(adapter);

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.


        TelephonyManager tm = (TelephonyManager)getSystemService(Context.TELEPHONY_SERVICE);
        String countryCode = tm.getSimCountryIso();

        EditText iban = (EditText) findViewById(R.id.iban);

        final Spinner spinner = (Spinner) findViewById(R.id.spinner);
        final EditText branchcode = (EditText) findViewById(R.id.branchcode);


        if (countryCode.equals("ad")) {
            int spinnerPosition = adapter.getPosition("Andorra");
            spinner.setSelection(spinnerPosition);
        } else if (countryCode.equals("at")) {
            int spinnerPosition = adapter.getPosition("Austria");
            spinner.setSelection(spinnerPosition);
        } else if (countryCode.equals("az")) {
            int spinnerPosition = adapter.getPosition("Azerbaijan");
            spinner.setSelection(spinnerPosition);
        } else if (countryCode.equals("bh")) {
            int spinnerPosition = adapter.getPosition("Bahrain");
            spinner.setSelection(spinnerPosition);
        } else if (countryCode.equals("cr")) {
            int spinnerPosition = adapter.getPosition("Costa Rica");
            spinner.setSelection(spinnerPosition);
        } else if (countryCode.equals("hr")) {
            int spinnerPosition = adapter.getPosition("Croatia");
            spinner.setSelection(spinnerPosition);
        } else if (countryCode.equals("cy")) {
            int spinnerPosition = adapter.getPosition("Cyprus");
            spinner.setSelection(spinnerPosition);
        } else if (countryCode.equals("cz")) {
            int spinnerPosition = adapter.getPosition("Czech Republic");
            spinner.setSelection(spinnerPosition);
        } else if (countryCode.equals("dk")) {
            int spinnerPosition = adapter.getPosition("Denmark");
            spinner.setSelection(spinnerPosition);
        } else if (countryCode.equals("do")) {
            int spinnerPosition = adapter.getPosition("Dominican Republic");
            spinner.setSelection(spinnerPosition);
        } else if (countryCode.equals("ge")) {
            int spinnerPosition = adapter.getPosition("Georgia");
            spinner.setSelection(spinnerPosition);
        } else if (countryCode.equals("de")) {
            int spinnerPosition = adapter.getPosition("Germany");
            spinner.setSelection(spinnerPosition);
        } else if (countryCode.equals("gi")) {
            int spinnerPosition = adapter.getPosition("Gibraltar");
            spinner.setSelection(spinnerPosition);
        } else if (countryCode.equals("gr")) {
            int spinnerPosition = adapter.getPosition("Greece");
            spinner.setSelection(spinnerPosition);
        } else if (countryCode.equals("gl")) {
            int spinnerPosition = adapter.getPosition("Greenland");
            spinner.setSelection(spinnerPosition);
        } else if (countryCode.equals("jo")) {
            int spinnerPosition = adapter.getPosition("Jordan");
            spinner.setSelection(spinnerPosition);
        }  else if (countryCode.equals("kz")) {
            int spinnerPosition = adapter.getPosition("Kazakhstan");
            spinner.setSelection(spinnerPosition);
        } else if (countryCode.equals("xk")) {
            int spinnerPosition = adapter.getPosition("Kosovo");
            spinner.setSelection(spinnerPosition);
        } else if (countryCode.equals("kw")) {
            int spinnerPosition = adapter.getPosition("Kuwait");
            spinner.setSelection(spinnerPosition);
        } else if (countryCode.equals("lv")) {
            int spinnerPosition = adapter.getPosition("Latvia");
            spinner.setSelection(spinnerPosition);
        } else if (countryCode.equals("lb")) {
            int spinnerPosition = adapter.getPosition("Lebanon");
            spinner.setSelection(spinnerPosition);
        } else if (countryCode.equals("li")) {
            int spinnerPosition = adapter.getPosition("Liechtenstein");
            spinner.setSelection(spinnerPosition);
        } else if (countryCode.equals("lz")) {
            int spinnerPosition = adapter.getPosition("Lithuania");
            spinner.setSelection(spinnerPosition);
        } else if (countryCode.equals("lu")) {
            int spinnerPosition = adapter.getPosition("Luxembourg");
            spinner.setSelection(spinnerPosition);
        } else if (countryCode.equals("mt")) {
            int spinnerPosition = adapter.getPosition("Malta");
            spinner.setSelection(spinnerPosition);
        } else if (countryCode.equals("md")) {
            int spinnerPosition = adapter.getPosition("Moldova");
            spinner.setSelection(spinnerPosition);
        } else if (countryCode.equals("nl")) {
            int spinnerPosition = adapter.getPosition("Netherlands");
            spinner.setSelection(spinnerPosition);
        } else if (countryCode.equals("pk")) {
            int spinnerPosition = adapter.getPosition("Pakistan");
            spinner.setSelection(spinnerPosition);
        } else if (countryCode.equals("qa")) {
            int spinnerPosition = adapter.getPosition("Qatar");
            spinner.setSelection(spinnerPosition);
        } else if (countryCode.equals("sa")) {
            int spinnerPosition = adapter.getPosition("Saudi Arabia");
            spinner.setSelection(spinnerPosition);
        } else if (countryCode.equals("sk")) {
            int spinnerPosition = adapter.getPosition("Slovakia");
            spinner.setSelection(spinnerPosition);
        } else if (countryCode.equals("se")) {
            int spinnerPosition = adapter.getPosition("Sweden");
            spinner.setSelection(spinnerPosition);
        } else if (countryCode.equals("ch")) {
            int spinnerPosition = adapter.getPosition("Switzerland");
            spinner.setSelection(spinnerPosition);
        } else if (countryCode.equals("tn")) {
            int spinnerPosition = adapter.getPosition("Tunisia");
            spinner.setSelection(spinnerPosition);
        } else if (countryCode.equals("ae")) {
            int spinnerPosition = adapter.getPosition("United Arab Emirates");
            spinner.setSelection(spinnerPosition);
        } else if (countryCode.equals("gb")) {
            int spinnerPosition = adapter.getPosition("United Kingdom");
            spinner.setSelection(spinnerPosition);
        } else if (countryCode.equals("vg")) {
            int spinnerPosition = adapter.getPosition("Virgin Islands, British");
            spinner.setSelection(spinnerPosition);
        }

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (spinner.getSelectedItem().toString().equals("Andorra")) {
                    branchcode.setEnabled(true);
                } else if (spinner.getSelectedItem().toString().equals("Austria")) {
                    branchcode.setEnabled(false);
                } else if (spinner.getSelectedItem().toString().equals("Azerbaijan")) {
                    branchcode.setEnabled(false);
                } else if (spinner.getSelectedItem().toString().equals("Bahrain")) {
                    branchcode.setEnabled(false);
                } else if (spinner.getSelectedItem().toString().equals("Costa Rica")) {
                    branchcode.setEnabled(false);
                } else if (spinner.getSelectedItem().toString().equals("Croatia")) {
                    branchcode.setEnabled(false);
                } else if (spinner.getSelectedItem().toString().equals("Cyprus")) {
                    branchcode.setEnabled(true);
                } else if (spinner.getSelectedItem().toString().equals("Czech Republic")) {
                    branchcode.setEnabled(true);
                } else if (spinner.getSelectedItem().toString().equals("Denmark")) {
                    branchcode.setEnabled(false);
                } else if (spinner.getSelectedItem().toString().equals("Dominican Republic")) {
                    branchcode.setEnabled(false);
                } else if (spinner.getSelectedItem().toString().equals("Georgia")) {
                    branchcode.setEnabled(false);
                } else if (spinner.getSelectedItem().toString().equals("Germany")) {
                    branchcode.setEnabled(false);
                } else if (spinner.getSelectedItem().toString().equals("Gibraltar")) {
                    branchcode.setEnabled(false);
                } else if (spinner.getSelectedItem().toString().equals("Greece")) {
                    branchcode.setEnabled(true);
                } else if (spinner.getSelectedItem().toString().equals("Greenland")) {
                    branchcode.setEnabled(false);
                } else if (spinner.getSelectedItem().toString().equals("Jordan")) {
                    branchcode.setEnabled(true);
                } else if (spinner.getSelectedItem().toString().equals("Kazakhstan")) {
                    branchcode.setEnabled(false);
                } else if (spinner.getSelectedItem().toString().equals("Kosovo")) {
                    branchcode.setEnabled(false);
                } else if (spinner.getSelectedItem().toString().equals("Kuwait")) {
                    branchcode.setEnabled(false);
                } else if (spinner.getSelectedItem().toString().equals("Latvia")) {
                    branchcode.setEnabled(false);
                } else if (spinner.getSelectedItem().toString().equals("Lebanon")) {
                    branchcode.setEnabled(false);
                } else if (spinner.getSelectedItem().toString().equals("Liechtenstein")) {
                    branchcode.setEnabled(false);
                } else if (spinner.getSelectedItem().toString().equals("Lithuania")) {
                    branchcode.setEnabled(false);
                } else if (spinner.getSelectedItem().toString().equals("Luxembourg")) {
                    branchcode.setEnabled(false);
                } else if (spinner.getSelectedItem().toString().equals("Malta")) {
                    branchcode.setEnabled(true);
                } else if (spinner.getSelectedItem().toString().equals("Moldova")) {
                    branchcode.setEnabled(false);
                } else if (spinner.getSelectedItem().toString().equals("Netherlands")) {
                    branchcode.setEnabled(false);
                } else if (spinner.getSelectedItem().toString().equals("Pakistan")) {
                    branchcode.setEnabled(false);
                } else if (spinner.getSelectedItem().toString().equals("Qatar")) {
                    branchcode.setEnabled(false);
                } else if (spinner.getSelectedItem().toString().equals("Saudi Arabia")) {
                    branchcode.setEnabled(false);
                } else if (spinner.getSelectedItem().toString().equals("Slovakia")) {
                    branchcode.setEnabled(true);
                } else if (spinner.getSelectedItem().toString().equals("Sweden")) {
                    branchcode.setEnabled(false);
                } else if (spinner.getSelectedItem().toString().equals("Switzerland")) {
                    branchcode.setEnabled(false);
                } else if (spinner.getSelectedItem().toString().equals("Tunisia")) {
                    branchcode.setEnabled(true);
                } else if (spinner.getSelectedItem().toString().equals("United Arab Emirates")) {
                    branchcode.setEnabled(false);
                } else if (spinner.getSelectedItem().toString().equals("United Kingdom")) {
                    branchcode.setEnabled(true);
                } else if (spinner.getSelectedItem().toString().equals("Virgin Islands, British")) {
                    branchcode.setEnabled(false);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    public void onButtonClick(View v) {
        InputMethodManager inputManager = (InputMethodManager)
                getSystemService(Context.INPUT_METHOD_SERVICE);
        inputManager.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(),
                InputMethodManager.HIDE_NOT_ALWAYS);

        Button button = (Button) v;

        EditText bankcode = (EditText) findViewById(R.id.bankcode);
        EditText branchcode = (EditText) findViewById(R.id.branchcode);
        EditText accountnumber = (EditText) findViewById(R.id.accountnumber);
        EditText iban = (EditText) findViewById(R.id.iban);
        Spinner spinner = (Spinner) findViewById(R.id.spinner);

        String ibannumber = "Test";
        int b = 8;
        int s = 4;
        int c = 10;
        String countrycode = "DE";
        String method = "bc";

        if (spinner.getSelectedItem().toString().equals("Andorra")) {
            countrycode = "AD";
            method = "bsc";
            b = 4;
            s = 4;
            c = 12;
        } else if (spinner.getSelectedItem().toString().equals("Austria")) {
            countrycode = "AT";
            method = "bc";
            b = 5;
            c = 11;
        } else if (spinner.getSelectedItem().toString().equals("Azerbaijan")) {
            countrycode = "AZ";
            method = "bc";
            b = 4;
            c = 20;
        } else if (spinner.getSelectedItem().toString().equals("Bahrain")) {
            countrycode = "BH";
            method = "bc";
            b = 4;
            c = 14;
        } else if (spinner.getSelectedItem().toString().equals("Costa Rica")) {
            countrycode = "CR";
            method = "bc";
            b = 4;
            c = 14;
        } else if (spinner.getSelectedItem().toString().equals("Croatia")) {
            countrycode = "HR";
            method = "bc";
            b = 7;
            c = 10;
        } else if (spinner.getSelectedItem().toString().equals("Cyprus")) {
            countrycode = "CY";
            method = "bc";
            b = 3;
            s = 5;
            c = 16;
        } else if (spinner.getSelectedItem().toString().equals("Czech Republic")) {
            countrycode = "CZ";
            method = "bsc";
            b = 4;
            s = 6;
            c = 10;
        } else if (spinner.getSelectedItem().toString().equals("Denmark")) {
            countrycode = "DK";
            method = "bc";
            b = 4;
            c = 10;
        } else if (spinner.getSelectedItem().toString().equals("Dominican Republic")) {
            countrycode = "DO";
            method = "bc";
            b = 4;
            c = 20;
        } else if (spinner.getSelectedItem().toString().equals("Georgia")) {
            countrycode = "GE";
            method = "bc";
            b = 2;
            c = 16;
        } else if (spinner.getSelectedItem().toString().equals("Germany")) {
            countrycode = "DE";
            method = "bc";
            b = 8;
            c = 10;
        } else if (spinner.getSelectedItem().toString().equals("Gibraltar")) {
            countrycode = "GI";
            method = "bc";
            b = 4;
            c = 15;
        } else if (spinner.getSelectedItem().toString().equals("Greece")) {
            countrycode = "GR";
            method = "bsc";
            b = 3;
            s = 4;
            c = 16;
        } else if (spinner.getSelectedItem().toString().equals("Greenland")) {
            countrycode = "GL";
            method = "bc";
            b = 4;
            c = 10;
        } else if (spinner.getSelectedItem().toString().equals("Jordan")) {
            countrycode = "JO";
            method = "bsc";
            b = 4;
            s = 4;
            c = 18;
        } else if (spinner.getSelectedItem().toString().equals("Kazakhstan")) {
            countrycode = "KZ";
            method = "bc";
            b = 3;
            c = 13;
        } else if (spinner.getSelectedItem().toString().equals("Kosovo")) {
            countrycode = "XK";
            method = "bc";
            b = 4;
            c = 12;
        } else if (spinner.getSelectedItem().toString().equals("Kuwait")) {
            countrycode = "KW";
            method = "bc";
            b = 4;
            c = 22;
        } else if (spinner.getSelectedItem().toString().equals("Latvia")) {
            countrycode = "LV";
            method = "bc";
            b = 4;
            c = 13;
        } else if (spinner.getSelectedItem().toString().equals("Lebanon")) {
            countrycode = "LB";
            method = "bc";
            b = 4;
            c = 20;
        } else if (spinner.getSelectedItem().toString().equals("Liechtenstein")) {
            countrycode = "LI";
            method = "bc";
            b = 5;
            c = 12;
        } else if (spinner.getSelectedItem().toString().equals("Lithuania")) {
            countrycode = "LT";
            method = "bc";
            b = 5;
            c = 11;
        } else if (spinner.getSelectedItem().toString().equals("Luxembourg")) {
            countrycode = "LU";
            method = "bc";
            b = 3;
            c = 13;
        } else if (spinner.getSelectedItem().toString().equals("Malta")) {
            countrycode = "MT";
            method = "bsc";
            b = 4;
            s = 5;
            c = 18;
        } else if (spinner.getSelectedItem().toString().equals("Moldova")) {
            countrycode = "MD";
            method = "bc";
            b = 2;
            c = 18;
        } else if (spinner.getSelectedItem().toString().equals("Netherlands")) {
            countrycode = "NL";
            method = "bc";
            b = 4;
            c = 10;
        } else if (spinner.getSelectedItem().toString().equals("Pakistan")) {
            countrycode = "PK";
            method = "bc";
            b = 4;
            c = 16;
        } else if (spinner.getSelectedItem().toString().equals("Qatar")) {
            countrycode = "QA";
            method = "bc";
            b = 4;
            c = 21;
        } else if (spinner.getSelectedItem().toString().equals("Saudi Arabia")) {
            countrycode = "SA";
            method = "bc";
            b = 2;
            c = 18;
        } else if (spinner.getSelectedItem().toString().equals("Slovakia")) {
            countrycode = "SK";
            method = "bsc";
            b = 4;
            s = 6;
            c = 10;
        } else if (spinner.getSelectedItem().toString().equals("Sweden")) {
            countrycode = "SE";
            method = "bc";
            b = 3;
            c = 17;
        } else if (spinner.getSelectedItem().toString().equals("Switzerland")) {
            countrycode = "CH";
            method = "bc";
            b = 5;
            c = 12;
        } else if (spinner.getSelectedItem().toString().equals("Tunisia")) {
            countrycode = "TN";
            method = "bsc";
            b = 2;
            s = 3;
            c = 15;
        } else if (spinner.getSelectedItem().toString().equals("United Arab Emirates")) {
            countrycode = "AE";
            method = "bc";
            b = 3;
            c = 16;
        } else if (spinner.getSelectedItem().toString().equals("United Kingdom")) {
            countrycode = "GB";
            method = "bsc";
            b = 4;
            s = 6;
            c = 8;
        } else if (spinner.getSelectedItem().toString().equals("Virgin Islands, British")) {
            countrycode = "VG";
            method = "bc";
            b = 4;
            c = 16;
        }

        IBAN ibanGenerator = new IBAN();

        if (method.equals("bsc")) {
            ibannumber = ibanGenerator.getIBANbsc(countrycode, bankcode.getText().toString(), branchcode.getText().toString(), accountnumber.getText().toString(), b, s, c);
            Log.i("IBAN Calculation", "IBAN Calculation completed");
        } else if (method.equals("bc")) {
            ibannumber = ibanGenerator.getIBANbc(countrycode, bankcode.getText().toString(), accountnumber.getText().toString(), b, c);
            Log.i("IBAN Calculation", "IBAN Calculation completed");
        }

        iban.setText(ibannumber);
    }


    public void onItemSelected(AdapterView<?> arg0, View arg1, int pos, long id) {

    }

    public void onNothingSelected(AdapterView<?> parent) {

    }
}