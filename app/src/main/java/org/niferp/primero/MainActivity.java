package org.niferp.primero;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button  b=(Button) findViewById(R.id.idBoton);

        //String antiguaEtiqueta=b.getText().toString();
        //b.setText(antiguaEtiqueta  += "FUERTE");

       /* b.setOnClickListener(new View.OnClickListener() {
                                 @Override
                                 public void onClick(View view) {
                                    accion(view);
                                 }
                             }
        );*/
    }

    private void accion(View view){
        Button boton = (Button) view;
        boton.setText("PULSADO");
    }
}