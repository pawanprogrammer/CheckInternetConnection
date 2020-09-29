package com.trishasofttech.checkinternetconnection;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (!checkinternetconnection())
        {
            Toast.makeText(this, "no  internet", Toast.LENGTH_LONG).show();
        }
        else {
            Toast.makeText(this, "Internet connect", Toast.LENGTH_LONG).show();
        }

    }

    private boolean checkinternetconnection() {
        ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);

        return cm.getActiveNetworkInfo() != null && cm.getActiveNetworkInfo().isConnected();
    }
}