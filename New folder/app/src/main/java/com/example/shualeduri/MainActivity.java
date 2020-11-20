package com.example.shualeduri;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public class Manqana {
        private String modeli;
        private String mwarmoebeli;
        private int weli;


        public Manqana(String Modeli, String Mwarmoebeli, int Weli) {
            modeli = Modeli;
            mwarmoebeli = Mwarmoebeli;
            weli = Weli;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        }
        public void OnClickButton (View view){
            EditText Modeli = (EditText) findViewById(R.id.editTextModeli);
            EditText Mwarmoebeli =(EditText) findViewById(R.id.editTextMwarmoebeli);
            EditText Weli = (EditText) findViewById(R.id.editTextWeli);

            if (Modeli.getText().toString().isEmpty() || Mwarmoebeli.getText().toString().isEmpty() ||Weli.getText().toString().isEmpty()){
                Toast.makeText(this, "საჭიროა ველების შევსება", Toast.LENGTH_SHORT).show();
            }
            else if (2020 - (Integer.parseInt(Weli.getText().toString())) > 10){
                Toast.makeText(this, "არ შეიძლება იყოს 10 წელზე ძველი", Toast.LENGTH_SHORT).show();
                Weli.setText("");
            }
            else if (2020 - (Integer.parseInt(Weli.getText().toString())) < 1){
                Toast.makeText(this, "არ შეიძლება იყოს 1 წელზე ნაკლები", Toast.LENGTH_SHORT).show();
                Weli.setText("");
            }
            else {
                Toast.makeText(this, "რეგისტრაცია წარმატებით განხორციელდა", Toast.LENGTH_SHORT).show();
            }
        }

}