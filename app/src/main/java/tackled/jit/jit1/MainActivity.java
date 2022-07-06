package tackled.jit.jit1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText etNumber1, etNumber2;
    TextView tvResult;
    int num1, num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNumber1 = findViewById(R.id.editTextNumber1);
        etNumber2 = findViewById(R.id.editTextNumber2);
        tvResult = findViewById(R.id.textViewResult);
    }
    



        public boolean getNumbers()
        {
            String s1, s2;
            s1 = etNumber1.getText().toString();
            s2 = etNumber2.getText().toString();

            if (s1.equals(null) || s2.equals(null) || s1.equals("") || s2.equals(""))
            {
                tvResult.setText("Please enter the numbers!");
                return false;
            }
            else {

                num1 = Integer.parseInt(s1);
                num2 = Integer.parseInt(s2);

                return true;
            }
        }
        public void Addition(View view) {
            if (getNumbers())
            {
                int result = num1 + num2;
                tvResult.setText(String.valueOf(result));
            }


        }

        public void Substraction(View view) {
            if (getNumbers())
            {
                int result = num1 - num2;
                tvResult.setText(String.valueOf(result));
            }

        }

        public void Multiplication(View view) {
            if (getNumbers())
            {
                int result = num1 * num2;
                tvResult.setText(String.valueOf(result));
            } }

        public void Division(View view) {

            if (getNumbers())
            {
                if (num2 != 0) {
                    double result = num1 / num2;
                    tvResult.setText(String.valueOf(result));
                }
                else
                    tvResult.setText("Infinity");

            }
        }
    }