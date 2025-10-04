package com.example.loginprofileapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class InfoActivity extends AppCompatActivity {

    TextView tvAccountInfo;
    Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        tvAccountInfo = findViewById(R.id.tvAccountInfo);
        btnBack = findViewById(R.id.btnBack);

        // Nhận username từ ProfileActivity
        String username = getIntent().getStringExtra("username");

        // Giả sử có thêm vài thông tin mẫu
        String info = "Tên đăng nhập: " + username + "\n"
                + "Email: " + username + "@ute.udn.vn\n"
                + "Ngành học: Công nghệ thông tin\n"
                + "Trường: ĐH Sư phạm Kỹ thuật Đà Nẵng";

        tvAccountInfo.setText(info);

        btnBack.setOnClickListener(v -> finish());
    }
}
