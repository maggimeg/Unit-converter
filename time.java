packagecom.example.mylaptop.unitconvertor;
import android.support.v7.app.AppCompatActivity;
importandroid.os.Bundle;
importandroid.view.View;
importandroid.widget.AdapterView;
importandroid.widget.Button;
importandroid.widget.EditText;
importandroid.widget.Spinner;
importandroid.widget.TextView;
importandroid.widget.Toast;
public class time extends AppCompatActivity {
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
                    x = "hou";
                }
if (i == 1) {
                    x = "min";
                }
if (i == 2) {
                    x = "sec";
                }

}@Override
public void onNothingSelected(AdapterView<?>adapterView) {

            }
        });
s2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
public void onItemSelected(AdapterView<?>adapterView, View view, inti, long l) {
if (i == 0) {
                    y = "hou";
                }
if (i == 1) {
                    y = "min";
                }
if (i == 2) {
                    y = "sec";
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
else if (x == "hou") 
              {
if (y == "min") {
                        num2 = (num1 * 60);
                    }
if (y == "sec") {
                        num2 =(num1 * 3600);
                    }

                } 
else if (x == "min") 
            {
if (y == "hou") {
                        num2 =  (num1 *0.0166 );
                    }
if (y == "sec") {
                        num2 = (num1 * 60);
                    }


                } 
else if (x == "sec") 
              {
if (y == "hou") {
                        num2 = (num1 * 0.000277);
                    }
if (y == "min") {
                        num2 = (num1 * 0.0166);
                    }

                } 

tv1.setText( (String.valueOf(num2)));
            }

            });
        }
}
