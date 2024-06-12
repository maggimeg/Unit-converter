packagecom.example.dell.unitconvertor;

import android.support.v7.app.AppCompatActivity;
importandroid.os.Bundle;
importandroid.view.View;
importandroid.widget.AdapterView;
importandroid.widget.Button;
importandroid.widget.EditText;
importandroid.widget.Spinner;
importandroid.widget.TextView;
importandroid.widget.Toast;
public class Weight extends AppCompatActivity {
Button b1;
EditText et1;
TextView tv1;
    Spinner s1, s2;
    String x, y;
double num2;
@Override
protected void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout.activity_weight);
        b1 = (Button) findViewById(R.id.button);
        et1 = (EditText) findViewById(R.id.editText2);
        tv1 = (TextView) findViewById(R.id.textView2);
        s1 = (Spinner) findViewById(R.id.spinner1);
        s2 = (Spinner) findViewById(R.id.spinner);
s1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
public void onItemSelected(AdapterView<?>adapterView, View view, inti, long l) {
if (i == 0) {
                    x = "mg";
                }
if (i == 1) {
                    x = "g";
                }
if (i == 2) {
                    x = "kg";
                }
if (i == 3) {
                    x = "pound";
                }
if (i == 4) {
                    x = "ton";
                }
if (i == 5) {
                    x = "quintal";
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
                    y = "mg";
                }
if (i == 1) {
                    y = "g";
                }
if (i == 2) {
                    y = "kg";
                }
if (i == 3) {
                    y = "pound";
                }
if (i == 4) {
                    y = "ton";
                }
if (i == 5) {
                    y = "quintal";
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
                } else if (x == "mg") {
if (y == "g") {
                        num2 = (num1 * 0.001);
                    }
if (y == "kg") {
                        num2 =(num1 * 0.000001);
                    }
if (y == "pound") {
                        num2 = (num1 * 0.000002);
                    }
if (y == "ton") {
                        num2 =  (num1 * 1e-9);
                    }
if (y == "quintal") {
                        num2 =  (num1 * 1e-8);
                    }
                } else if (x == "g") {
if (y == "mg") {
                        num2 =  (num1 * 1000);
                    }
if (y == "kg") {
                        num2 = (num1 * 0.001);
                    }
if (y == "pound") {
                        num2 =  (num1 * 0.002205);
                    }
if (y == "ton") {
                        num2 =  (num1 * 0.000001);
                    }
if (y == "quintal") {
                        num2 =  (num1 * 0.00001);
                    }

                } else if (x == "kg") {
if (y == "mg") {
                        num2 = (num1 * 1000000);
                    }
if (y == "g") {
                        num2 = (num1 * 100);
                    }
if (y == "pound") {
                        num2 =  (num1 * 2.204623);
                    }
if (y == "ton") {
                        num2 = (num1 * 0.001);
                    }
if (y == "quintal") {
                        num2 =  (num1 * 0.01);
                    }

                } else if (x == "pound") {
if (y == "mg") {
                        num2 = (num1 * 453592.37);
                    }
if (y == "g") {
                        num2 = (num1 * 453.59237);
                    }
if (y == "kg") {
                        num2 = (num1 * 0.453592);
                    }
if (y == "ton") {
                        num2 = (num1 * 0.000454);
                    }
if (y == "quintal") {
                        num2 =  (num1 * 0.00453592);
                    }

                } else if (x == "ton") {
if (y == "mg") {
                        num2 = (num1 * 1000000000);
                    }
if (y == "g") {
                        num2 = (num1 * 1000000);
                    }
if (y == "kg") {
                        num2 = (num1 * 1000);
                    }
if (y == "pound") {
                        num2 = (num1 * 2204.62262);
                    }
if (y == "quintal") {
                        num2 =  (num1 * 10);
                    }

                } else if (x == "quintal") {
if (y == "mg") {
                        num2 = (num1 * 100000000);
                    }
if (y == "g") {
                        num2 =  (num1 * 100000);
                    }

if (y == "kg") {
                        num2 =  (num1 * 100);
                    }
if (y == "pound") {
                        num2 = (num1 * 220.462);
                    }


if (y == "ton") {
                        num2 = (num1 * 0.1);
                    }
                }
tv1.setText( (String.valueOf(num2)));
            }

            })    }}
