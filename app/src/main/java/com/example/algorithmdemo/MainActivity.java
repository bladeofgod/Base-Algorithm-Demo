package com.example.algorithmdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    final int[] testData = {22,52,32,12,34,87,98,31,66,5};

    
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
        int[] temp = testData.clone();
        int len = temp.length;

        quick(temp,0,len-1);
        showResult("快排",temp);

    }
    private void quick(int[] a , int left,int right){
        if(left >= right) return;
        int key = a[left];
        int i = left;
        int j = right;

        while (i<j){
            //j 向左移动，如果直到小于key
            while (a[j] >= key && i<j){
                j--;
            }
            //i向右移动，找到大于key
            while (a[i] <= key && i < j){
                i++;
            }
            if(i<j){
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        a[left] = a[i];
        a[i] = key;
        quick(a,left,i-1);
        quick(a,i+1,right);
    }

    //归并
    private void mergeAlgorithm() {
        int[] temp = testData.clone();
        int len = temp.length;
        mergeSort(temp,0,temp.length-1);
        showResult("归并",temp);

    }

    private void mergeSort(int[] t,int start,int end){
        if(start  < end){
            int mid = (start + end)/2;
            mergeSort(t,start,mid);
            mergeSort(t,mid+1,end);
            merge(t,start,mid,end);
        }
    }

    private void merge(int[] a,int left,int mid, int right){
        int[] temp = new int[a.length];
        int p1 = left,p2 = mid +1 ,k = left;

        while (p1 <= mid && p2 <= right){
            if(a[p1] <= a[p2]){
                temp[k++] = a[p1++];
            }else{
                temp[k++] = a[p2++];
            }
        }
        while (p1<=mid) temp[k++] = a[p1++];
        while (p2<= right) temp[k++] = a[p2++];
        for(int i = left; i <=right; i ++){
            a[i] = temp[i];
        }
    }

    //希尔
    private void shellAlgorithm() {
        int[] temp = testData.clone();
        int len = temp.length;
        for(int gap = (int)Math.floor(len /2);gap > 0;gap = (int)Math.floor(gap / 2)){
            for(int i = gap ; i < len ; i++){
                int j = i;
                int current = temp[i];
                while (j - gap >=0 && current <temp[j-gap]){
                    temp[j] = temp[j - gap];
                    j = j-gap;
                }
                temp[j] = current;
            }

        }
        showResult("希尔",temp);

    }

    //插入
    private void insertAlgorithm() {
        int[] temp = testData.clone();
        int len = temp.length;
        int preIndex,current;

        for(int i=1;i<len;i++){
            preIndex = i-1;
            current = temp[i];
            //后者大于前者后者向后移
            //向前遍历
            while (preIndex >= 0 && temp[preIndex] > current){
                temp[preIndex+1] = temp[preIndex];
                preIndex--;
            }
            temp[preIndex+1] = current;
        }
        showResult("插入",temp);
    }

    //选择
    private void choiceAlgorithm() {
        int[] temp = testData.clone();
        int len = temp.length;

        for(int i=0 ; i< len-1;i++){
            int flag = i;
            for(int j = i+1;j<len;j++){
                if(temp[j] < temp[flag]){
                    flag = j;
                }
            }
            int tt = temp[i];
            temp[i] = temp[flag];
            temp[flag] = tt;
        }
        showResult("选择",temp);
    }

    //冒泡
    private void bubbleAlgorithm() {
        int[] temp = testData.clone();
        int len = temp.length;
        for(int i=0 ; i< len-1;i++){
            //循环一遍，尾部数据有序  : -i
            for(int j = 0; j < len - 1 -i; j++){
                if(temp[j] > temp[j+1]){
                    int t = temp[j+1];
                    temp[j+1] = temp[j];
                    temp[j] = t;
                }
            }
        }
        showResult("冒泡",temp);
    }

    private void showResult(String title,int[] result){
        tvResult.setText(title + "  " + transfer(result));
    }

    private String transfer(int[] o){
        StringBuffer sb = new StringBuffer();
        for (int str : o){
            sb.append(str);
            sb.append(",");
        }
        return sb.toString();
    }


}
