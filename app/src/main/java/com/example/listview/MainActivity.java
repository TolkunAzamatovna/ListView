package com.example.listview;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyFruitsAdapter adapter = new MyFruitsAdapter(this, makeFruits());
        ListView lv = (ListView) findViewById(R.id.listView);
        lv.setAdapter(adapter);
    }

    MyFruits[] makeFruits() {
        MyFruits[] arr;
        arr = new MyFruits[20];

        String[] monthArr = {"Алма", "Алмурут", "Өрүк", "Жүзүм",
                "Карагат", "Кулпунай", "Курма", "Анар", "Шабдалы",
                "Дарбыз", "Коон", "Апельсин", "Ананас","Мандарин",
                "Лимон", "Банан", "Киви","Бүлдүркөн","Алча",
                "Кара өрүк"};

         int[] fruitImage = {R.drawable.img,R.drawable.img_1,R.drawable.img_2,R.drawable.img_3,
                R.drawable.img_4,R.drawable.img_5,R.drawable.img_6,
                R.drawable.img_7,R.drawable.img_8,R.drawable.img_9,R.drawable.img_10,
                R.drawable.img_11,R.drawable.img_12,R.drawable.img_13,
                R.drawable.img_14,R.drawable.img_15,R.drawable.img_16,
                R.drawable.img_17,R.drawable.img_18,R.drawable.img_19};

        for (int i = 0; i < arr.length; i++) {
            MyFruits month = new MyFruits();
            month.month = monthArr[i];
            month.image = fruitImage[i];
            arr[i] = month;
        }
        return arr;
    }
}