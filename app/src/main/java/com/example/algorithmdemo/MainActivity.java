package com.example.algorithmdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    
    private TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }
    
    private void initView(){
        tvResult = findViewById(R.id.tv_result);
        
        findViewById(R.id.btn_1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bubbleAlgorithm();
            }
        });

        findViewById(R.id.btn_2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                choiceAlgorithm();
            }
        });
        findViewById(R.id.btn_3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                insertAlgorithm();
            }
        });
        findViewById(R.id.btn_4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                shellAlgorithm();
            }
        });
        findViewById(R.id.btn_5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mergeAlgorithm();
            }
        });

        findViewById(R.id.btn_6).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                quickAlgorithm();
            }
        });

        findViewById(R.id.btn_7).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                heapAlgorithm();
            }
        });

        findViewById(R.id.btn_8).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                countAlgorithm();
            }
        });

        findViewById(R.id.btn_9).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bucketAlgorithm();
            }
        });

        findViewById(R.id.btn_10).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                radixAlgorithm();
            }
        });
        
    }

    //基数
    private void radixAlgorithm() {

    }

    //桶
    private void bucketAlgorithm() {

    }


    //计数
    private void countAlgorithm() {

    }

    //堆
    private void heapAlgorithm() {
    }

    //快速
    private void quickAlgorithm() {

    }

    //归并
    private void mergeAlgorithm() {

    }

    //希尔
    private void shellAlgorithm() {

    }

    //插入
    private void insertAlgorithm() {
    }

    //选择
    private void choiceAlgorithm() {
    }

    //冒泡
    private void bubbleAlgorithm() {
    }


}
