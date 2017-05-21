package com.example.wuziqi;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Emma on 2016/6/3.
 */
public class MainActivity extends AppCompatActivity {


    private WuziqiPanel wuziqiPanel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wuziqiPanel = (WuziqiPanel) findViewById(R.id.id_wuziqi);

    }

}
