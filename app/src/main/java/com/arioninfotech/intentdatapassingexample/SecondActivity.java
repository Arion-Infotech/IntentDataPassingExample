package com.arioninfotech.intentdatapassingexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    String company,location;

    TextView lblcompany,lbllocation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        lblcompany=findViewById(R.id.lblcompany);
        lbllocation=findViewById(R.id.lbllocation);

        Intent intent=getIntent();
        company=intent.getStringExtra("company");
        location=intent.getStringExtra("location");

        lblcompany.setText(company);
        lbllocation.setText(location);

    }
}

