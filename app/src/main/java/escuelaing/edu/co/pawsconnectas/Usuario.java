package escuelaing.edu.co.pawsconnectas;

public class Usuario {
    private String nombre;
    private String correo;
    private String clave;

    public Usuario(String nombre, String correo, String clave) {
        this.nombre = nombre;
        this.correo = correo;
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public String getClave() {
        return clave;
    }
}
