package com.example.intenttest1;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn_map;
    Button btn_website;
    Button btn_number;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_map = (Button) findViewById(R.id.btn_map);
        btn_website = (Button) findViewById(R.id.btn_website);
        btn_number = (Button) findViewById(R.id.btn_number);

        btn_map.setOnClickListener(this);
        btn_website.setOnClickListener(this);
        btn_number.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent;

        switch (v.getId())
        {
            case R.id.btn_map:
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:55.7532177,37.6193669"));
                startActivity(intent);
                break;
            case R.id.btn_number:
                intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:89159820954"));
                startActivity(intent);
                break;
            case R.id.btn_website:
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.fandroid.info"));
                startActivity(intent);
                break;
        }
    }
}
