package escuelaing.edu.co.pawsconnectas;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class RegistroMascotaActivity extends AppCompatActivity {

    private EditText etNombre, etRaza, etEdad, etColor;
    private Button btnRegistrarMascota;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_mascota);

        etNombre = findViewById(R.id.editTextNombre);
        etRaza = findViewById(R.id.editTextRaza);
        etEdad = findViewById(R.id.editTextEdad);
        etColor = findViewById(R.id.editTextColor);
        btnRegistrarMascota = findViewById(R.id.buttonRegistrarMascota);

        btnRegistrarMascota.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Aquí puedes manejar la lógica para registrar la mascota
                String nombre = etNombre.getText().toString();
                String raza = etRaza.getText().toString();
                String edad = etEdad.getText().toString();
                String color = etColor.getText().toString();

                // Puedes agregar la lógica para almacenar esta información en una base de datos, por ejemplo

                // Ejemplo de mensaje de registro exitoso
                Toast.makeText(RegistroMascotaActivity.this, "Mascota registrada con éxito", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
