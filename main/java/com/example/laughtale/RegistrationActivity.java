package com.example.laughtale;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class RegistrationActivity extends AppCompatActivity {
    private EditText usernameEditText, passwordEditText, namaEditText, alamatEditText, noTeleponEditText;
    private Button daftarButton;
    private static final String SHARED_PREFS = "sharedPrefs";
    private static final String KEY_USERNAME = "keyUsername";
    private static final String KEY_PASSWORD = "keyPassword";
    private static final String KEY_NAMA = "keyNama";
    private static final String KEY_ALAMAT = "keyAlamat";
    private static final String KEY_NO_TELEPON = "keyNoTelepon";

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        usernameEditText = findViewById(R.id.usernameEditText);
        passwordEditText = findViewById(R.id.passwordEditText);
        namaEditText = findViewById(R.id.namaEditText);
        alamatEditText = findViewById(R.id.alamatEditText);
        noTeleponEditText = findViewById(R.id.noTeleponEditText);
        daftarButton = findViewById(R.id.daftarButton);

        daftarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = usernameEditText.getText().toString().trim();
                String password = passwordEditText.getText().toString().trim();
                String nama = namaEditText.getText().toString().trim();
                String alamat = alamatEditText.getText().toString().trim();
                String noTelepon = noTeleponEditText.getText().toString().trim();

                saveData(username, password, nama, alamat, noTelepon);

                Toast.makeText(RegistrationActivity.this, "Anda telah berhasil mendaftar", Toast.LENGTH_SHORT).show();

                // Kembali ke halaman login setelah pendaftaran
                Intent intent = new Intent(RegistrationActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

    private void saveData(String username, String password, String nama, String alamat, String noTelepon) {
        SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(KEY_USERNAME, username);
        editor.putString(KEY_PASSWORD, password);
        editor.putString(KEY_NAMA, nama);
        editor.putString(KEY_ALAMAT, alamat);
        editor.putString(KEY_NO_TELEPON, noTelepon);
        editor.apply();
    }
}
