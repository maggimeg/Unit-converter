packagecom.example.mylaptop.project;

import android.support.v7.app.AppCompatActivity;
importandroid.os.Bundle;
importandroid.text.Editable;
importandroid.view.View;
importandroid.widget.AdapterView;
importandroid.widget.Button;
importandroid.widget.EditText;
importandroid.widget.Spinner;
importandroid.widget.TextView;
importandroid.widget.Toast;
public class length extends AppCompatActivity {
    Button b1;
EditText et1;
TextView tv1;
    Spinner s1,s2;
    String x,y;
double num2;
    @Override
protected void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout.length);
        b1 = (Button) findViewById(R.id.button);
        et1 = (EditText) findViewById(R.id.editText2);
        tv1 = (TextView) findViewById(R.id.textView2);
        s1 = (Spinner) findViewById(R.id.spinner1);
        s2 = (Spinner) findViewById(R.id.spinner);
s1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
public void onItemSelected(AdapterView<?>adapterView, View view, inti, long l) {
if (i == 0) {
                    x = "cen";
                }
if (i == 1) {
                    x = "fah";
                }
if (i == 2) {
                    x = "kel";
                }


            }

            @Override
public void onNothingSelected(AdapterView<?>adapterView) {

            }
        });
s2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
public void onItemSelected(AdapterView<?>adapterView, View view, inti, long l) {
if (i == 0) {
                    y = "cen";
                }
if (i == 1) {
                    y = "fah";
                }
if (i == 2) {
                    y = "kel";
                }

            }

            @Override
public void onNothingSelected(AdapterView<?>adapterView) {

            }
        });
b1.setOnClickListener(new View.OnClickListener() {
            @Override
public void onClick(View view) {
                String s = et1.getText().toString();
double num1 = Double.parseDouble(s);
if (x == y) {
                    num2 = num1;
Toast.makeText(getApplicationContext(), "Select a valid unit", Toast.LENGTH_LONG).show();
                }
else if (x == "cen") 
if (y == "fah") {
                        num2 = (  9/5 *(num1) + 32 );
                    }
if (y == "kel") {
                        num2 = ( num1+273 );
                    }



                } 
else if (x == "fah") {
if (y == "cel") {
                        num2 = ( (5/9)*(num1 - 32));
                    }
if (y == "kel") {
                        num2 = (5/9 * (num1 - 32) + 273);
                    }

                } 
else if (x == "kel") 
                 {
if (y == "cel") {
                        num2 = (num2-273);
                    }
if (y == "fah") {
                        num2 = ( 9/5(num1 - 273) + 32);
                    }}
tv1.setText(String.valueOf(num2));
            }
        });}}
