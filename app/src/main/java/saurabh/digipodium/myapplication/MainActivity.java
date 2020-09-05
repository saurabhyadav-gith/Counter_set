package saurabh.digipodium.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {

    int counter = 0;
    private TextView textCount;
    private EditText editStart;
    boolean isSet = false;
    private Button setCounter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnCount = findViewById(R.id.btnCount);
        Button btnReset = findViewById(R.id.btnReset);
        setCounter = findViewById(R.id.setCounter);
        editStart = findViewById(R.id.editStart);
        textCount = findViewById(R.id.textCount);

    }

    public void setCount(View v){
        //        counter = Integer.parseInt(editStart.getText().toString());
        String val = editStart.getText().toString();
        if(val.length()>0 && !isSet ){

            counter = Integer.parseInt(val);
            isSet = true;
        }
        textCount.setText(String.valueOf(counter)); //for setting value to the text area

    }

    public void increaseCount(View v) {

//            counter = Integer.parseInt(editStart.getText().toString());
            if (isSet == true) {

                counter++;
                textCount.setText(String.valueOf(counter));
            }

    }
    public void ResetCount(View v){
        counter = 0;
        textCount.setText(String.valueOf(counter));
        isSet=false;
    }
}
