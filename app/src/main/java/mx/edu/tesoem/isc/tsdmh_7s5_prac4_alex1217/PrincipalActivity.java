package mx.edu.tesoem.isc.tsdmh_7s5_prac4_alex1217;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class PrincipalActivity extends AppCompatActivity {

    EditText editTextText;
    Button button;
    Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        editTextText = findViewById(R.id.editTextText);
        button = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);

        // ENVIAR DATOS
        button.setOnClickListener(v -> {

            String nombre = editTextText.getText().toString();

            Intent intent = new Intent(
                    PrincipalActivity.this,
                    RecibeActivity.class
            );

            intent.putExtra("nombre", nombre);

            startActivity(intent);
        });

        // EN ESPERA DE RESULTADO
        button2.setOnClickListener(v -> {

            Intent intent = new Intent(
                    PrincipalActivity.this,
                    RegresoInfoActivity.class
            );

            startActivity(intent);
        });
    }
}