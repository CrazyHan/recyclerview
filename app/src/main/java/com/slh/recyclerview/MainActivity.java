package com.slh.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget1.DividerItemDecoration;
import androidx.recyclerview.widget1.GridLayoutManager;
import androidx.recyclerview.widget1.LinearLayoutManager;
import androidx.recyclerview.widget1.RecyclerView;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Queue;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rv;
    private String TAG = "MainActivity";

    int i = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("", "");
        rv = (RecyclerView) findViewById(R.id.rv);

        rv.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        rv.addItemDecoration(new DividerItemDecoration(this, LinearLayout.VERTICAL));

        final List<String> list = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            list.add("" + i);
        }

        final CustomAdapter adapter = new CustomAdapter(this, list);
        rv.setAdapter(adapter);

        final EditText editText = findViewById(R.id.index);
        final EditText editTextDown = findViewById(R.id.range_down);
        final EditText editTextUp = findViewById(R.id.range_up);
//        editTextUp.requestLayout();
        findViewById(R.id.delete).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(editText.getText().toString())) {
                    Toast.makeText(MainActivity.this, "输入正确索引！", Toast.LENGTH_SHORT).show();
                    return ;
                }

                int index = Integer.valueOf(editText.getText().toString());
                Log.e(TAG, "onClick: " +index );
                list.remove(index);
                adapter.notifyItemRemoved(index);

            }
        });

        findViewById(R.id.delete).invalidate();

        findViewById(R.id.update).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(editText.getText().toString())) {
                    Toast.makeText(MainActivity.this, "输入正确索引！", Toast.LENGTH_SHORT).show();
                    return ;
                }
                int index = Integer.valueOf(editText.getText().toString());
                Log.e(TAG, "onClick: " +index );

                list.remove(index);
                list.add(index,index+"update");
                adapter.notifyItemInserted(index);


            }
        });

        findViewById(R.id.insert).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(editText.getText().toString())) {
                    Toast.makeText(MainActivity.this, "输入正确索引！", Toast.LENGTH_SHORT).show();
                    return ;
                }

                int index = Integer.valueOf(editText.getText().toString());
                Log.e(TAG, "onClick: " +index );
                list.add(index,index+"insert");
                adapter.notifyItemInserted(index);

            }
        });



        findViewById(R.id.updateAll).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                if (TextUtils.isEmpty(editText.getText().toString())) {
//                    Toast.makeText(MainActivity.this, "输入正确索引！", Toast.LENGTH_SHORT).show();
//                    return ;
//                }

                list.set(i,"string"+i);

//                for (int i = 0; i < 999; i++) {
//                    list.add(i + "a");
//                }

//                adapter.notifyDataSetChanged();
                adapter.notifyItemChanged(i,null);

                i++;
            }
        });

        findViewById(R.id.updateRange).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                editTextUp.invalidate();
                return;

//                if (TextUtils.isEmpty(editTextDown.getText().toString())) {
//                    Toast.makeText(MainActivity.this, "输入正确索引！", Toast.LENGTH_SHORT).show();
//                    return ;
//                }
//
//                int down = Integer.valueOf(editTextDown.getText().toString());
//                int up = Integer.valueOf(editTextUp.getText().toString());
//
//                list.clear();
//                for (int i = 0; i < 1000; i++) {
//                    if(i>=down && i<=up) {
//                        list.add("range" + i);
//                    }else{
//                        list.add(i+"");
//                    }
//                }
//
//                adapter.notifyItemRangeChanged(down,up);

            }
        });




    }
}