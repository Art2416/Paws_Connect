
package escuelaing.edu.co.pawsconnectas;

import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    private EditText etUsuario, etContraseña;
    private Button btnIniciarSesion, btnRegistrarse;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etUsuario = findViewById(R.id.editTextUsuario);
        etContraseña = findViewById(R.id.editTextContraseña);
        btnIniciarSesion = findViewById(R.id.buttonIniciarSesion);
        btnRegistrarse = findViewById(R.id.buttonRegistrarse);

        btnIniciarSesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String usuario = etUsuario.getText().toString();
                String contraseña = etContraseña.getText().toString();

                // Ejemplo de validación básica
                if (usuario.equals("david.narvaez@mail.escuelaing.edu.co") && contraseña.equals("contraseña")) {
                    // Autenticación exitosa
                    Toast.makeText(LoginActivity.this, "Inicio de sesión exitoso", Toast.LENGTH_SHORT).show();

                    // Abrir la actividad de registro de mascotas
                    Intent intent = new Intent(LoginActivity.this, RegistroMascotaActivity.class);
                    startActivity(intent);

                } else {
                    // Autenticación fallida
                    Toast.makeText(LoginActivity.this, "El usuario no existe, debe registrarse", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnRegistrarse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Abrir la actividad de registro nuevo
                Intent intent = new Intent(LoginActivity.this, RegistroNuevoActivity.class);
                startActivity(intent);
            }
        });
    }
}
