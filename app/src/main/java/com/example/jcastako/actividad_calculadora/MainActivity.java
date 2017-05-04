package com.example.jcastako.actividad_calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.view.View;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity implements OnClickListener{

    double resultado, n1=0, n2=0;
    boolean punto=false;
    boolean suma=false;
    boolean resta=false;
    boolean mult=false;
    boolean divi=false;

    TextView texto1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View v=findViewById(R.id.texto1);
        texto1=(TextView) v;
        texto1.setText("");

        View boton1=findViewById(R.id.button1);
        boton1.setOnClickListener(this);
        View boton2=findViewById(R.id.button2);
        boton2.setOnClickListener(this);
        View boton3=findViewById(R.id.button3);
        boton3.setOnClickListener(this);
        View boton4=findViewById(R.id.button4);
        boton4.setOnClickListener(this);
        View boton5=findViewById(R.id.button5);
        boton5.setOnClickListener(this);
        View boton6=findViewById(R.id.button6);
        boton6.setOnClickListener(this);
        View boton7=findViewById(R.id.button7);
        boton7.setOnClickListener(this);
        View boton8=findViewById(R.id.button8);
        boton8.setOnClickListener(this);
        View boton9=findViewById(R.id.button9);
        boton9.setOnClickListener(this);
        View boton0=findViewById(R.id.button0);
        boton0.setOnClickListener(this);
        View botonMas=findViewById(R.id.buttonMas);
        botonMas.setOnClickListener(this);
        View botonMenos=findViewById(R.id.buttonMenos);
        botonMenos.setOnClickListener(this);
        View botonPor=findViewById(R.id.buttonPor);
        botonPor.setOnClickListener(this);
        View botonDiv=findViewById(R.id.buttonDiv);
        botonDiv.setOnClickListener(this);
        View botonPunto=findViewById(R.id.buttonPunto);
        botonPunto.setOnClickListener(this);
        View botonBorrar=findViewById(R.id.buttonBorrar);
        botonBorrar.setOnClickListener(this);
        View botonIgual=findViewById(R.id.buttonIgual);
        botonIgual.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String texto= texto1.getText().toString();

        int seleccion=v.getId();
        try {
            switch (seleccion) {
                case R.id.button1:
                    texto1.append("1");
                    break;
                case R.id.button2:
                    texto1.append("2");
                    break;
                case R.id.button3:
                    texto1.append("3");
                    break;
                case R.id.button4:
                    texto1.append("4");
                    break;
                case R.id.button5:
                    texto1.append("5");
                    break;
                case R.id.button6:
                    texto1.append("6");
                    break;
                case R.id.button7:
                    texto1.append("7");
                    break;
                case R.id.button8:
                    texto1.append("8");
                    break;
                case R.id.button9:
                    texto1.append("9");
                    break;
                case R.id.button0:
                    texto1.append("0");
                    break;
                case R.id.buttonPunto:
                    if (punto == false) {
                        texto1.append(".");
                        punto = true;
                    }
                    break;
                case R.id.buttonBorrar:
                    texto1.setText("");
                    punto = false;
                    break;
                case R.id.buttonMas:
                    suma = true;
                    n1 = Double.parseDouble(texto);
                    texto1.setText("");
                    break;
                case R.id.buttonMenos:
                    resta = true;
                    n1 = Double.parseDouble(texto);
                    texto1.setText("");
                    break;
                case R.id.buttonPor:
                    mult = true;
                    n1 = Double.parseDouble(texto);
                    texto1.setText("");
                    texto = "";
                    break;
                case R.id.buttonDiv:
                    divi = true;
                    n1 = Double.parseDouble(texto);
                    texto1.setText("");
                    texto = "";
                    break;
                case R.id.buttonIgual:
                    n2 = Double.parseDouble(texto);
                    if (suma == true) {
                        resultado = n1 + n2;
                        texto1.setText(String.valueOf(resultado));
                    }
                    if (resta == true) {
                        resultado = n1 - n2;
                        texto1.setText(String.valueOf(resultado));
                    }
                    if (mult == true) {
                        resultado = n1 * n2;
                        texto1.setText(String.valueOf(resultado));
                    }
                    if (divi == true) {
                        resultado = n1 / n2;
                        texto1.setText(String.valueOf(resultado));
                    }
                    break;
            }
        }catch (Exception e){
            texto1.setText("Error");
        }
    }
}
