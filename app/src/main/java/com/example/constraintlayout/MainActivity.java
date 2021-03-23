package com.example.constraintlayout;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    Button btnLogin;
    EditText edemail, edpassword;

    String nama, password;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.mnDaftar)
        {
            Intent i = new Intent(getApplicationContext(), FormPendaftaran.class);
            startActivity(i);
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLogin = findViewById(R.id.btSignin);
        edemail = findViewById(R.id.edEmail);
        edpassword = findViewById(R.id.edPassword);


        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nama = edemail.getText().toString();
                password = edpassword.getText().toString();

                String email = "naa@gmail.com";
                String pass = "123";

                if (nama.equals(email) && password.equals(pass)) {
                    Toast t = Toast.makeText(getApplicationContext(),
                            "Login Sukses", Toast.LENGTH_LONG);
                    t.show();

                    Bundle b = new Bundle();

                    b.putString("a", nama.trim());
                    b.putString("b", password.trim());

                    Intent i = new Intent(getApplicationContext(), ActivityHasil.class);

                    i.putExtras(b);

                    startActivity(i);
                } else {
                    Toast t = Toast.makeText(getApplicationContext(),
                            "Login Gagal", Toast.LENGTH_LONG);
                    t.show();


               /* } else if (!nama.equals("naa@gmail.com") && password.equals("123")) {
                    Toast t = Toast.makeText(getApplicationContext(),
                            "email salah", Toast.LENGTH_LONG);
                    t.show();
                } else if (nama.equals("naa@gmail.com") && !password.equals("123")) {
                    Toast t = Toast.makeText(getApplicationContext(),
                            "password salah", Toast.LENGTH_LONG);
                    t.show();
                } else {
                    Toast t = Toast.makeText(getApplicationContext(),
                            "email dan password salah", Toast.LENGTH_LONG);
                    t.show();
                }*/
                }
            }
        });
    }
}