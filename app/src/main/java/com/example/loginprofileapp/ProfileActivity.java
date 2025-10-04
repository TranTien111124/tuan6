package com.example.loginprofileapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {

    TextView tvFullName, tvUsername, tvEmail, tvStudentID, tvMajor, tvClass, tvStatus;
    ImageView imgSetting;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        // Ánh xạ
        tvFullName = findViewById(R.id.tvFullName);
        tvUsername = findViewById(R.id.tvUsername);
        tvEmail = findViewById(R.id.tvEmail);
        tvStudentID = findViewById(R.id.tvStudentID);
        tvMajor = findViewById(R.id.tvMajor);
        tvClass = findViewById(R.id.tvClass);
        tvStatus = findViewById(R.id.tvStatus);
        imgSetting = findViewById(R.id.imgSetting);

        // Nhận username từ màn Login
        String username = getIntent().getStringExtra("username");

        // Gán dữ liệu mô phỏng (ở thực tế có thể lấy từ database hoặc API)
        String fullName = "Trần Tiến";
        String email = username + "@ute.udn.vn";
        String studentID = "22115053122247";
        String major = "Công nghệ thông tin";
        String className = "22T2";

        // Hiển thị thông tin
        tvFullName.setText("Họ tên: " + fullName);
        tvUsername.setText("Tên đăng nhập: " + username);
        tvEmail.setText("Email: " + email);
        tvStudentID.setText("Mã sinh viên: " + studentID);
        tvMajor.setText("Ngành học: " + major);
        tvClass.setText("Lớp: " + className);
        tvStatus.setText("Trạng thái: Đang hoạt động");

        // Khi nhấn bánh răng -> quay lại màn Login
        imgSetting.setOnClickListener(v -> {
            Intent intent = new Intent(ProfileActivity.this, MainActivity.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
            finish();
        });
    }
}
