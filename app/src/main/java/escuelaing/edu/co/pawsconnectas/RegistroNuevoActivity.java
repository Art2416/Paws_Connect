package escuelaing.edu.co.pawsconnectas;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class RegistroNuevoActivity extends AppCompatActivity {
    private EditText etNombre, etCorreo, etClave, etVerificacionClave;
    private Button btnRegistrar;

    private ArrayList<Usuario> listaUsuarios;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_nuevo);

        etNombre = findViewById(R.id.editTextNombre);
        etCorreo = findViewById(R.id.editTextCorreo);
        etClave = findViewById(R.id.editTextClave);
        etVerificacionClave = findViewById(R.id.editTextVerificacionClave);
        btnRegistrar = findViewById(R.id.buttonRegistrar);

        listaUsuarios = new ArrayList<>();

        btnRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nombre = etNombre.getText().toString();
                String correo = etCorreo.getText().toString();
                String clave = etClave.getText().toString();
                String verificacionClave = etVerificacionClave.getText().toString();

                // Verifica si las contraseñas coinciden
                if (!clave.equals(verificacionClave)) {
                    Toast.makeText(RegistroNuevoActivity.this, "Las contraseñas no coinciden", Toast.LENGTH_SHORT).show();
                    return;
                }

                // Crea un nuevo usuario
                Usuario nuevoUsuario = new Usuario(nombre, correo, clave);

                // Agrega el nuevo usuario a la lista
                listaUsuarios.add(nuevoUsuario);

                // Puedes imprimir la lista de usuarios para verificar
                for (Usuario usuario : listaUsuarios) {
                    System.out.println("Nombre: " + usuario.getNombre() +
                            ", Correo: " + usuario.getCorreo() +
                            ", Clave: " + usuario.getClave());
                }

                // Puedes agregar más lógica aquí, como guardar la lista en SharedPreferences, etc.

                // Muestra un mensaje de éxito
                Toast.makeText(RegistroNuevoActivity.this, "Registro exitoso", Toast.LENGTH_SHORT).show();

                // Puedes cerrar la actividad después de registrar
                finish();
            }
        });
    }
}
