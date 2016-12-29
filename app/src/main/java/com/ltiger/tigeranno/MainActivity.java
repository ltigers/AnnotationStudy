package com.ltiger.tigeranno;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.ltiger.annotation.BindView;
import com.ltiger.viewinject.InjectView;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.text)
    TextView textView;
    @BindView(R.id.text2)
    TextView textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        InjectView.bind(this);
        textView.setText("text changged!");
    }
}
