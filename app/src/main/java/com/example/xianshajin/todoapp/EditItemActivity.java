package com.example.xianshajin.todoapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class EditItemActivity extends AppCompatActivity {
    EditText itemEditText;
    int pos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_item);
        pos = getIntent().getIntExtra("pos", 0);
        itemEditText = (EditText) findViewById(R.id.itemEditText);
        itemEditText.setText(getIntent().getStringExtra("text"));
        itemEditText.setSelection(itemEditText.getText().length());
    }

    public void onSave(View view) {
        Intent data = new Intent();
        data.putExtra("text", itemEditText.getText().toString());
        data.putExtra("pos", pos);
        setResult(RESULT_OK, data);
        finish();
    }
}
