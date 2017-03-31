package edu.nxiz.android.examenlp3;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Calculadora extends AppCompatActivity {

    TextView txtDist;
    String operacion;
    double number1;
    double number2;
    double resultado;
    boolean decim = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        txtDist = (TextView)findViewById(R.id.txtDist);

        Button btnNum1 = (Button)findViewById(R.id.btnNum1);
        Button btnNum2 = (Button)findViewById(R.id.btnNum2);
        Button btnNum3 = (Button)findViewById(R.id.btnNum3);
        Button btnNum4 = (Button)findViewById(R.id.btnNum4);
        Button btnNum5 = (Button)findViewById(R.id.btnNum5);
        Button btnNum6 = (Button)findViewById(R.id.btnNum6);
        Button btnNum7 = (Button)findViewById(R.id.btnNum7);
        Button btnNum8 = (Button)findViewById(R.id.btnNum8);
        Button btnNum9 = (Button)findViewById(R.id.btnNum9);
        Button btnNum0 = (Button)findViewById(R.id.btnNum0);
        Button btnPunto = (Button)findViewById(R.id.btnPunto);
        Button btnSum = (Button)findViewById(R.id.btnSum);
        Button btnEquals = (Button)findViewById(R.id.btnEquals);
        Button btnRes = (Button)findViewById(R.id.btnRest);
        Button btnMult = (Button)findViewById(R.id.btnMult);
        Button btnClean = (Button)findViewById(R.id.btnClean);
        Button btnDiv = (Button)findViewById(R.id.btnDiv);
        Button btnSin = (Button)findViewById(R.id.btnSen);
        Button btnCos = (Button)findViewById(R.id.btnCos);
        Button btnTan = (Button)findViewById(R.id.btnTan);
        Button btnLimp = (Button)findViewById(R.id.btnLimp);
        Button btnAsin = (Button)findViewById(R.id.btnAsen);
        Button btnAcos = (Button)findViewById(R.id.btnAcos);
        Button btnAtan = (Button)findViewById(R.id.btnAtan);
        Button btnRaiz = (Button)findViewById(R.id.btnRaiz);
        Button btnLog = (Button)findViewById(R.id.btnLog);
        Button btnPi = (Button)findViewById(R.id.btnPi);
        Button btnPot = (Button)findViewById(R.id.btnPot);
        Button btnFact = (Button)findViewById(R.id.btnFact);
        Button btnPorcen = (Button)findViewById(R.id.btnPorcen);


        btnEquals.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View v){

                number2 = Double.parseDouble(txtDist.getText().toString());
                if (operacion.equals("+")){
                    resultado = number1 + number2;
                    txtDist.setText(resultado + "");
                }if (operacion.equals("-")){
                    resultado = number1 - number2;
                    txtDist.setText(resultado + "");
                }if (operacion.equals("*")){
                    resultado = number1 * number2;
                    txtDist.setText(resultado + "");
                }if (operacion.equals("/")){
                    resultado = number1 / number2;
                    txtDist.setText(resultado + "");
                }if (operacion.equals("^")){
                    resultado = Math.pow(number1,number2);
                    txtDist.setText("" + resultado);

                }if (operacion.equals("%")){
                    resultado= number1*(number2/100);
                    txtDist.setText(resultado + "");
                }
            }

        });

        btnLimp.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                txtDist.setText(txtDist.getText().toString().substring(0, txtDist.getText().length()-1));
            }
        });

        btnPorcen.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View v){
                number1 = Double.parseDouble(txtDist.getText().toString());
                operacion = "%";
                txtDist.setText("");
            }
        });

        btnFact.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View v){
                number1 = Double.parseDouble(txtDist.getText().toString());
                double aux = 1 , i=1;
                while (i <= number1){
                    aux = aux * i;
                    i=i+1;
                    txtDist.setText(""+aux);
                }
            }

        });

        btnPot.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                number1 = Double.parseDouble(txtDist.getText().toString());
                operacion = "^";
                txtDist.setText("");

            }
        });

        btnPi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultado = Math.PI;
                txtDist.setText("" + resultado);
            }
        });

        btnLog.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                number1 = Double.parseDouble(txtDist.getText().toString());
                resultado = Math.log(number1);
                txtDist.setText("" + resultado);
            }
        });

        btnRaiz.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                number1 = Double.parseDouble(txtDist.getText().toString());
                resultado = Math.sqrt(number1);
                txtDist.setText("" + resultado);
            }
        });

        btnAtan.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                number1 = Double.parseDouble(txtDist.getText().toString());
                resultado = Math.atan(number1);
                txtDist.setText("" + resultado);
            }
        });

        btnAcos.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                number1 = Double.parseDouble(txtDist.getText().toString());
                resultado = Math.acos(number1);
                txtDist.setText("" + resultado);
            }
        });

        btnAsin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //double aux;
                number1 = Double.parseDouble(txtDist.getText().toString());
                //aux = Math.sin(number1);
                resultado = Math.asin(number1);
                txtDist.setText("" + resultado);
            }
        });

        btnTan.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                number1 = Double.parseDouble(txtDist.getText().toString());
                resultado = Math.tan(number1);
                txtDist.setText(""+resultado);
            }
        });

        btnCos.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                number1 = Double.parseDouble(txtDist.getText().toString());
                resultado = Math.cos(number1);
                txtDist.setText("" + resultado);
            }
        });

        btnSin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                number1 = Double.parseDouble(txtDist.getText().toString());
                resultado = Math.sin(number1);
                txtDist.setText("" + resultado);
            }
        });

        btnClean.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                number1 = 0;
                txtDist.setText("");
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                number1 = Double.parseDouble(txtDist.getText().toString());
                operacion = "/";
                txtDist.setText("");
            }
        });

        btnMult.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                number1 = Double.parseDouble(txtDist.getText().toString());
                operacion = "*";
                txtDist.setText("");
            }
        });

        btnRes.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                number1 = Double.parseDouble(txtDist.getText().toString());
                operacion = "-";
                txtDist.setText("");
            }
        });

        btnSum.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                number1 = Double.parseDouble(txtDist.getText().toString());
                operacion="+";
                txtDist.setText("");
            }
        });
        btnPunto.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if (decim == false) {
                    txtDist.setText(txtDist.getText() + ".");
                    decim = true;
                } else {
                    return;
                }
            }
        });



        btnNum1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                txtDist.setText(txtDist.getText() +"1");
            }
        });
        btnNum2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                txtDist.setText(txtDist.getText() +"2");
            }
        });
        btnNum3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                txtDist.setText(txtDist.getText() +"3");
            }
        });
        btnNum4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                txtDist.setText(txtDist.getText() +"4");
            }
        });
        btnNum5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                txtDist.setText(txtDist.getText() +"5");
            }
        });
        btnNum6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                txtDist.setText(txtDist.getText() +"6");
            }
        });
        btnNum7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                txtDist.setText(txtDist.getText() +"7");
            }
        });
        btnNum8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                txtDist.setText(txtDist.getText() +"8");
            }
        });
        btnNum9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                txtDist.setText(txtDist.getText() +"9");
            }
        });
        btnNum0.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                txtDist.setText(txtDist.getText() +"0");
            }
        });




        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

}
