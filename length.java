packagecom.example.mylaptop.unitconvertor;
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
public class Length extends AppCompatActivity {
Button b1;
EditText et1;
TextView tv1;
Spinner s1,s2;
String x,y;
double num2;
    @Override
protected void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout.activity_length);
        b1 = (Button) findViewById(R.id.button);
        et1 = (EditText) findViewById(R.id.editText2);
        tv1 = (TextView) findViewById(R.id.textView2);
        s1 = (Spinner) findViewById(R.id.spinner1);
        s2 = (Spinner) findViewById(R.id.spinner);
s1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
public void onItemSelected(AdapterView<?>adapterView, View view, inti, long l) {
if (i == 0) {
                    x = "mm";
                }
if (i == 1) {
                    x = "cm";
                }
if (i == 2) {
                    x = "dm";
                }
if (i == 3) {
                    x = "m";
                }
if (i == 4) {
                    x = "km";
                }
if (i == 5) {
                    x = "mile";
                }
if (i == 6) {
                    x = "inch";
                }
if (i == 7) {
                    x = "ft";
                }
if (i == 8) {
                    x = "yard";
                }}
 @Override
public void onNothingSelected(AdapterView<?>adapterView){

            }
        });
s2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
public void onItemSelected(AdapterView<?>adapterView, View view, inti, long l) {
if (i == 0) {
                    y = "mm";
                }
if (i == 1) {
                    y = "cm";
                }
if (i == 2) {
                    y = "dm";
                }
if (i == 3) {
                    y = "m";
                }
if (i == 4) {
                    y = "km";
                }
if (i == 5) {
                    y = "mile";
                }
if (i == 6) {
                    y = "inch";
                }
if (i == 7) {
                    y = "ft";
                }
if (i == 8) {
                    y = "yard";
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
                } else if (x == "mm") {
if (y == "cm") {
                        num2 = (num1 * 0.1);
                    }
if (y == "dm") {
                        num2 = (num1 * 0.01);
                    }
if (y == "m") {
                        num2 = (num1 * 0.001);
                    }
if (y == "km") {
                        num2 = (num1 * 0.000001);
                    }
if (y == "mile") {
                        num2 = (num1 * 6.2137e-7);
                    }
if (y == "inch") {
                        num2 = (num1 * 0.03937);
                    }
if (y == "ft") {
                        num2 = (num1 * 0.003281);
                    }
if (y == "yard") {
                        num2 = (num1 * 0.001094);
                    }


                } else if (x == "cm") {
if (y == "mm") {
                        num2 = (num1 * 10);
                    }
if (y == "dm") {
                        num2 = (num1 * 0.1);
                    }
if (y == "m") {
                        num2 = (num1 * 0.01);
                    }
if (y == "km") {
                        num2 = (num1 * 0.00001);
                    }
if (y == "mile") {
                        num2 = (num1 * 0.000006);
                    }
if (y == "inch") {
                        num2 = (num1 * 0.393701);
                    }
if (y == "ft") {
                        num2 = (num1 * 0.032808);
                    }
if (y == "yard") {
                        num2 = (num1 * 0.010936);
                    }
                } else if (x == "dm") {
if (y == "mm") {
                        num2 = (num1 * 100);
                    }
if (y == "cm") {
                        num2 = (num1 * 10);
                    }
if (y == "m") {
                        num2 = (num1 * 0.1);
                    }
if (y == "km") {
                        num2 = (num1 *0.0001);
                    }
if (y == "mile") {
                        num2 = (num1 * 0.000062);
                    }
if (y == "inch") {
                        num2 = (num1 * 3.937008);
                    }
if (y == "ft") {
                        num2 = (num1 * 0.328084);
                    }
if (y == "yard") {
                        num2 = (num1 * 0.109361);
                    }
                } else if (x == "m") {
if (y == "mm") {
                        num2 = (num1 * 1000);
                    }
if (y == "cm") {
                        num2 = (num1 * 100);
                    }
if (y == "dm") {
                        num2 = (num1 * 10);
                    }
if (y == "km") {
                        num2 = (num1 * 0.001);
                    }
if (y == "mile") {
                        num2 = (num1 * 0.000621);
                    }
if (y == "inch") {
                        num2 = (num1 * 39.37008);
                    }
if (y == "ft") {
                        num2 = (num1 * 3.28084);
                    }
if (y == "yard") {
                        num2 = (num1 * 1.093613);
                    }
                } else if (x == "km") {
if (y == "mm") {
                        num2 = (num1 * 1000000);
                    }
if (y == "cm") {
                        num2 = (num1 * 100000);
                    }
if (y == "dm") {
num2 = (num1 * 10000);
                    }
if (y == "m") {
                        num2 = (num1 * 1000);
                    }
if (y == "mile") {
                        num2 = (num1 * 0.621371);
                    }
if (y == "inch") {
                        num2 = (num1 * 39370.08);
                    }
if (y == "ft") {
                        num2 = (num1 * 3280.84);
                    }
if (y == "yard") {
                        num2 = (num1 * 1093.613);
                    }
                } else if (x == "mile") {
if (y == "mm") {
                        num2 = (num1 * 1609344);
                    }
if (y == "cm") {
                        num2 = (num1 * 160934.4);
                    }
if (y == "dm") {
                        num2 = (num1 * 16093.4);
                    }
if (y == "m") {
                        num2 = (num1 * 1609.344);
                    }
if (y == "km") {
                        num2 = (num1 * 1.609344);
                    }
if (y == "inch") {
                        num2 = (num1 * 63360);
                    }
if (y == "ft") {
                        num2 = (num1 * 5280);
                    }
if (y == "yard") {
                        num2 = (num1 * 1760);
                    }
                } else if (x == "inch") {
if (y == "mm") {
                        num2 = (num1 * 25.4);
                    }
if (y == "cm") {
                        num2 = (num1 * 2.54);
                    }
if (y == "dm") {
                        num2 = (num1 * 0.254);
                    }
if (y == "m") {
                        num2 = (num1 * 0.0254);
                    }
if (y == "km") {
                        num2 = (num1 * 0.000025);
                    }
if (y == "mile") {
                        num2 = (num1 * 0.000016);
                    }
if (y == "ft") {
                        num2 = (num1 * 0.083333);
                    }
if (y == "yard") {
                        num2 = (num1 * 0.027778);
                    }
                } else if (x == "ft") {
if (y == "mm") {
                        num2 = (num1 * 304.8);
                    }
if (y == "cm") {
                        num2 = (num1 * 30.48);
                    }
if (y == "dm") {
                        num2 = (num1 * 3.048);
                    }
if (y == "m") {
                        num2 = (num1 * 0.3048);
                    }
if (y == "km") {
                        num2 = (num1 * 0.000305);
                    }
if (y == "mile") {
                        num2 = (num1 * 0.000189);
                    }
if (y == "inch") {
                        num2 = (num1 * 12);
                    }
if (y == "yard") {
                        num2 = (num1 * 0.3333);
                    }
                } else if (x == "yard") {
if (y == "mm") {
                        num2 = (num1 * 914.4);
                    }
if (y == "cm") {
                        num2 = (num1 * 91.44);
                    }
if (y == "dm") {
                        num2 = (num1 * 9.144);
                    }
if (y == "m") {
                        num2 = (num1 * 0.9144);
                    }
if (y == "km") {
                        num2 = (num1 * 0.0009144);
                    }
if (y == "mile") {
                        num2 = (num1 * 36);
                    }
if (y == "inch") {
                        num2 = (num1 * 3);
                    }
if (y == "ft") {
                        num2 = (num1 * 0.000568);
                    }
                }
tv1.setText(String.valueOf(num2));
            }
        });}}
