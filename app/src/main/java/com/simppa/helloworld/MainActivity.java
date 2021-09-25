package com.simppa.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText nameField = findViewById(R.id.editName);
        nameField.getText().toString();
    }

    public void btnRegisterClick (View view) {

        TextView tName = findViewById(R.id.textViewName);
        TextView tEmail = findViewById(R.id.textViewEmail);

        EditText editName = findViewById(R.id.editName);
        EditText editEmail = findViewById(R.id.editEmail);

        tName.setText(editName.getText());
        tEmail.setText(editEmail.getText());
        editName.setText("");
        editEmail.setText("");
    }
}
