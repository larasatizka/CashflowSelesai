package com.dhanifudin.cashflow;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;

import com.dhanifudin.cashflow.models.Transaction;

public class SaveActivity extends AppCompatActivity {

    private EditText descriptionInput;
    private EditText amountInput;
    private RadioGroup typeRadioGroup;
    private Transaction item;
    private int index;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_save);

        descriptionInput = findViewById(R.id.input_description);
        amountInput = findViewById(R.id.input_amount);
        typeRadioGroup = findViewById(R.id.group_type);

    }

    public void handleSubmit(View view) {
    }
}
