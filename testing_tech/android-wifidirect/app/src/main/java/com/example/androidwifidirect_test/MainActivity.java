package com.example.androidwifidirect_test;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnOnOff, btnDiscover, btnSend;
    ListView listView;
    TextView read_msg_box, connectionStatus;
    EditText writeMsg;
    WifiManager wifiManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initEverything();
        exqListener();
    }

    private void exqListener() {
        btnOnOff.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                if(wifiManager.isWifiEnabled()){
                    Toast.makeText(getApplicationContext(), "IF", Toast.LENGTH_SHORT).show();
                    wifiManager.setWifiEnabled(false);
                    btnOnOff.setText("Wifi On");
                }else{
                    Toast.makeText(getApplicationContext(), "ELSE", Toast.LENGTH_SHORT).show();
                    wifiManager.setWifiEnabled(true);
                    btnOnOff.setText("Wifi Off");
                }
            }
        });
    }

    public void initEverything(){
        wifiManager = (WifiManager) getApplicationContext().getSystemService(Context.WIFI_SERVICE);
        btnOnOff = findViewById(R.id.onOff);
        btnDiscover = findViewById(R.id.discover);
        btnSend = findViewById(R.id.sendButton);
        listView = findViewById(R.id.peerListView);
        read_msg_box = findViewById(R.id.readMsg);
        connectionStatus = findViewById(R.id.connectionStatus);
        writeMsg = findViewById(R.id.writeMsg);
    }
}