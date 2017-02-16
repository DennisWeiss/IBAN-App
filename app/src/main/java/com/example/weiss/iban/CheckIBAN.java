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
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;

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

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isValid(iban.getText().toString())) {
                    image.setImageResource(R.drawable.tick);
                } else {
                    image.setImageResource(R.drawable.cross);
                }
            }
        });
    }

    boolean isValid(String iban) {
        //TODO: Implementation for Checking IBAN
        return true;
    }
}
