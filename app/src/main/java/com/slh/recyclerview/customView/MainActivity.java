package com.slh.recyclerview.customView;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.slh.recyclerview.R;

public class MainActivity extends AppCompatActivity {

    private Button mTextView;
    private Button mTextView1;

    StringBuilder builder = new StringBuilder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        mTextView =  findViewById(R.id.button);
//        mTextView1 =  findViewById(R.id.button1);

        mTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("Custom", mTextView + "invalidate");
                mTextView.invalidate();
            }
        });

//        mTextView1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Log.i("Custom", mTextView1 + "invalidate");
//                mTextView1.invalidate();
//            }
//        });

    }

    public void click(View view) {
        Thread.dumpStack();
        Log.i("Custom", "click  LinearLayout");
    }
}