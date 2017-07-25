package com.ottosoft.maxi.quinigen;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.animation.Interpolator;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    EditText edtTxt;
    Button btnPrincipal;

    CheckBox jugada1 , jugada2 , jugada3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtTxt = (EditText) findViewById(R.id.txtNumAleatorio);
        btnPrincipal = (Button) findViewById(R.id.btnPrincipal);

        jugada1 = (CheckBox) findViewById(R.id.checkBox_jugada1);
        jugada2 = (CheckBox) findViewById(R.id.checkBox_jugada2);
        jugada3 = (CheckBox) findViewById(R.id.checkBox_jugada3);


        btnPrincipal.setOnClickListener(this);
        jugada1.setOnClickListener(this);
        jugada2.setOnClickListener(this);
        jugada3.setOnClickListener(this);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {

        Random numeroSuerte = new Random();

        switch (v.getId()) {

            case R.id.btnPrincipal:

                edtTxt.setText("Tú número de la suerte es: " + Integer.toString(numeroSuerte.nextInt(9999)));

                break;

            case R.id.checkBox_jugada1:

                jugada2.setChecked(false);
                jugada3.setChecked(false);

                break;

            case R.id.checkBox_jugada2:

                jugada1.setChecked(false);
                jugada3.setChecked(false);

                break;

            case R.id.checkBox_jugada3:

                jugada1.setChecked(false);
                jugada2.setChecked(false);

                break;
        }

    }
}
