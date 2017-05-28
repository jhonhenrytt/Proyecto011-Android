package henrytenetorres.proyecto011;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText et1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1=(EditText)findViewById(R.id.et1);
    }
    public void verificar(View view){
        String valor1=et1.getText().toString();
        if(valor1.equals("123"))
            {
                Intent i=new Intent(this,Bienvenida.class);
                startActivity(i);

        }else
            {
                Toast notificacion=Toast.makeText(this,"La clave es incorrecta.", Toast.LENGTH_LONG);
                notificacion.show();
                Toast notificacion1=Toast.makeText(this,valor1, Toast.LENGTH_LONG);
                notificacion1.show();

        }


    }
}
