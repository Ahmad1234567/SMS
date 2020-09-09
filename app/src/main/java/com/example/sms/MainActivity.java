package com.example.sms;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void SMS(){

        Button button = (Button) findViewById(R.id.Button1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText phonenumber= (EditText) findViewById(R.id.phonenumber);
                EditText sms=(EditText) findViewById(R.id.sms);

                String ph = phonenumber.getText().toString();
                String Sms = sms.getText().toString();

                SmsManager smsManager= SmsManager.getDefault();
                smsManager.sendTextMessage(ph,null,Sms,null, null);

                Toast.makeText(getApplicationContext(), "SMS send Successfully", Toast.LENGTH_SHORT).show();

            }
        });

    }
}
