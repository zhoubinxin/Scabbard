package com.example.memo;

import android.os.Bundle;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MemoDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_memo_detail);

        TextView titleTextView = findViewById(R.id.memo_detail_title);
        TextView contentTextView = findViewById(R.id.memo_detail_content);

        // 获取传递过来的数据并显示
        String title = getIntent().getStringExtra("memo_title");
        String content = getIntent().getStringExtra("memo_content");

        titleTextView.setText(title);
        contentTextView.setText(content);
    }
}