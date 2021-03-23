package com.example.constraintlayout;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class FormPendaftaran extends AppCompatActivity {

    EditText edNama, edAlamat, edEmail, edPassword, edrepass;
    FloatingActionButton fab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_pendaftaran);
    }


}
