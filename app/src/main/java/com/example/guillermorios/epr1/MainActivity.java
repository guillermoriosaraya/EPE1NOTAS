package com.example.guillermorios.epr1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public double nota_epr1, nota_epe1,nota_epr2, nota_epe2, nota_eva1,nota_eva2,nota_eva3,nota_eva4, nota_examen;
    public EditText epr1, epe1,epr2, epe2,eva1, eva2,eva3, eva4, examen;
    public TextView nota_promedio,promedio;
    Toast m;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        epr1 = (EditText) findViewById(R.id.epr1);
        epe1 = (EditText) findViewById(R.id.epe1);
        epr2 = (EditText) findViewById(R.id.epr2);
        epe2 = (EditText) findViewById(R.id.epe2);
        eva1 = (EditText) findViewById(R.id.eva1);
        eva2 = (EditText) findViewById(R.id.eva2);
        eva3 = (EditText) findViewById(R.id.eva3);
        eva4 = (EditText) findViewById(R.id.eva4);
        examen = (EditText) findViewById(R.id.examen);
        //Resultado_cuadrado = (TextView) findViewById(R.id.textView1);
        nota_promedio = (TextView) findViewById(R.id.editText);
    }

    public void contacto (View view){
        Intent i=new Intent(MainActivity.this, Info.class);
        startActivity(i);
    }

    public void Calcular_promedio (View view){



        switch (view.getId()){
            case R.id.button:
                if (epe1.getText().length()==0 || epe2.getText().length()==0 ||
                        epr1.getText().length()==0 || epr2.getText().length()==0 ||
                        eva1.getText().length()==0 || eva2.getText().length()==0 ||
                        eva3.getText().length()==0 || eva4.getText().length()==0)
                       //examen.getText().length()==0)
                {
                    Toast m= Toast.makeText(this, "Ingrese todas las notas", Toast.LENGTH_SHORT);
                    m.show();
                }else {

        double nota_epr1 = Double.parseDouble(epr1.getText().toString());
        double nota_epe1 = Double.parseDouble(epe1.getText().toString());
        double nota_epr2 = Double.parseDouble(epr2.getText().toString());
        double nota_epe2 = Double.parseDouble(epe2.getText().toString());
        double nota_eva1 = Double.parseDouble(eva1.getText().toString());
        double nota_eva2 = Double.parseDouble(eva2.getText().toString());
        double nota_eva3 = Double.parseDouble(eva3.getText().toString());
        double nota_eva4 = Double.parseDouble(eva4.getText().toString());
        //double nota_examen = Double.parseDouble(examen.getText().toString());


                    if(     nota_epe1<3.9 || nota_epr1<3.9 ||
                            nota_epe2<3.9 || nota_epr2<3.9 ) {

                        m= Toast.makeText(this, "Debe ingresar examen", Toast.LENGTH_SHORT);
                        m.show();
                    } else {

        double n1 = (nota_epr1*0.10);
        double n2 = (nota_epe1*0.15);
        double n3 = (nota_epr2*0.20);
        double n4 = (nota_epe2*0.25);
        double promevas = ((nota_eva1+nota_eva2+nota_eva3+nota_eva4)/4)*0.30;
        nota_promedio.setText(Double.toString(n1+n2+n3+n4+promevas));

    }
    break;

}
    }}}