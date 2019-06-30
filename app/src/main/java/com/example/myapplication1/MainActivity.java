package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.service.autofill.OnClickAction;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b_Begin_click=findViewById(R.id.button_begin);
        b_Begin_click.setOnClickListener(new MyBeginClickListener());

//        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.ll1);
//        TextView tv1 = new TextView(MainActivity.this);
        //tv1.setText("mytest1");
//        linearLayout.addView(tv1, 0);
//        final TextView tv2 = new TextView(MainActivity.this);
//        tv1.setText("mytest2");
//        linearLayout.addView(tv2, 0);
    }

class MyBeginClickListener implements View.OnClickListener{

    @Override
    public void onClick(View v){
        Toast.makeText(MainActivity.this,"您点击了按钮"+((TextView)v).getText(),Toast.LENGTH_SHORT).show();
        if(v.getId()==R.id.button_begin){
//            Toast.makeText(ClickAction.this,"您点击了按钮"+((TextView)v).getText(),Toast.LENGTH_SHORT).show();
//            Toast.makeText(MainActivity.this,"您点击了按钮"+((TextView)v).getText(),Toast.LENGTH_SHORT).show();
            TextView DispOut=findViewById(R.id.myOutputDisp);
            DispOut.setText(R.string.out_str);
            DispOut.setTextColor(getColor(android.R.color.holo_red_light));
            DispOut.setTextSize(30);

            LinearLayout linearLayout = (LinearLayout) findViewById(R.id.ll1);
            TextView tv1 = new TextView(MainActivity.this);
            tv1.setText("mytest1");
//            tv1.setId(mytv1);
            RelativeLayout.LayoutParams lp1 = new RelativeLayout.LayoutParams(LinearLayout.LayoutParams.FILL_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
            lp1.addRule(RelativeLayout.ALIGN_LEFT, R.id.myOutputDisp);
            tv1.setLayoutParams(lp1);
            linearLayout.addView(tv1, lp1);
            TextView tv2 = new TextView(MainActivity.this);
           tv2.setText("mytest2");
            RelativeLayout.LayoutParams lp2 = new RelativeLayout.LayoutParams(LinearLayout.LayoutParams.FILL_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
            lp2.addRule(RelativeLayout.ALIGN_LEFT, R.id.myOutputDisp);
            tv2.setLayoutParams(lp2);
            linearLayout.addView(tv2, lp2);
        }
        if(v.getId()==R.id.button_read){
            TextView DispOut=findViewById(R.id.myOutputDisp);
            DispOut.setText("test kaishi");
            DispOut.setTextColor(getColor(android.R.color.holo_red_light));
            DispOut.setTextSize(30);

        }
    }
}
}
