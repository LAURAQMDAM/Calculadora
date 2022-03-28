package lqm.am.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements  View.OnClickListener {

    Button btnSum,btnRest,btnDiv,btnMulti,btnResultado;
    EditText editOp1,editOp2,editResult;
    TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //primero asociamos nuestro java con nuestro layout, con los componentes que queramos trabajar:
        btnSum= findViewById(R.id.btnSumar);
        btnRest= findViewById(R.id.btnRestar);
        btnDiv= findViewById(R.id.btnDividir);
        btnMulti= findViewById(R.id.btnMultiplicar);
        btnResultado = findViewById(R.id.btnReset);

        editOp1 = findViewById(R.id.editOp1);
        editOp2 = findViewById(R.id.editOp2);
        resultado = findViewById(R.id.editResultado);

        //ponemos los botones a la escucha de la siguiente manera
        btnSum.setOnClickListener(this);
        btnRest.setOnClickListener(this);
        btnDiv.setOnClickListener(this);
        btnMulti.setOnClickListener(this);
        btnResultado.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        int num1,num2;

        num1 = Integer.parseInt(editOp1.getText().toString());
        num2 = Integer.parseInt(editOp2.getText().toString());
        switch (view.getId()){

            case R.id.btnSumar:

                resultado.setText(String.valueOf(num1+num2));

                break;

            case R.id.btnRestar:
                resultado.setText(String.valueOf(num1-num2));
                break;

            case R.id.btnDividir:

                resultado.setText(String.valueOf(num1/num2));
                break;

            case R.id.btnMultiplicar:

                resultado.setText(String.valueOf(num1*num2));
                break;
            case R.id.btnReset:

                editOp1.setText("0");
                editOp2.setText("0");
                resultado.setText("0");
            default:
                System.out.println("Eso es incorrecto!");
        }

    }
}