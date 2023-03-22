package com.example.ft20230306;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Spinner spCountingOptions;
    private EditText edMain;
    private TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.tvResult = findViewById(R.id.tvResult);
        this.edMain = findViewById(R.id.edMain);
        this.spCountingOptions = findViewById(R.id.spCountingOptions);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.options_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        this.spCountingOptions.setAdapter(adapter);
    }

    public void btnCountOnClick(View view) {
        String userInput = this.edMain.getText().toString();
        String selectedOptions = this.spCountingOptions.getSelectedItem().toString();
        if(selectedOptions.equalsIgnoreCase(getResources().getString(R.string.chars_selection))){
            //this.tvResult.setText(String.valueOf(userInput.length()));
            this.tvResult.setText(getCharsCount(userInput));
        }
        else{
            Toast.makeText(getApplicationContext(),"Not implemented", Toast.LENGTH_LONG).show();
        }
    }

    private String getCharsCount(String inputSting){
        return String.valueOf(inputSting.length());

    }
}