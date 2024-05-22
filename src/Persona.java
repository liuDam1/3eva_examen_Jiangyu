// JiangyuLiu
import java.util.regex.Pattern;
import java.util.regex.Matcher;

/**
 * Clase Persona que almacena la información personal de un usuario.
 */
class Persona {
    private String dni;
    private String correo;
    private String contrasena;
    private String nombre;
    private String apellidos;
    private String direccionPostal;
    private String codigoPostal;
    private String telefono;
    private int edad;

    /**
     * Establece el DNI de la persona si es válido.
     * @param dni DNI a establecer. Debe ser una cadena de 8 dígitos.
     * @return true si el DNI es válido y se establece, false de lo contrario.
     */
    public boolean setDni(String dni) {
        if (dni.matches("\\d{8}")) {
            this.dni = dni;
            return true;
        } else {
            System.out.println("DNI no válido. Debe tener 8 dígitos.");
            return false;
        }
    }

    /**
     * Establece el correo electrónico de la persona si es válido.
     * @param correo Correo electrónico a establecer. Debe seguir un formato válido.
     * @return true si el correo es válido y se establece, false de lo contrario.
     */
    public boolean setCorreo(String correo) {
        String regex = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(correo);
        if (matcher.matches()) {
            this.correo = correo;
            return true;
        } else {
            System.out.println("Correo electrónico no válido.");
            return false;
        }
    }

    /**
     * Establece la contraseña de la persona si es válida.
     * @param contrasena Contraseña a establecer. Debe tener más de 8 caracteres.
     * @return true si la contraseña es válida y se establece, false de lo contrario.
     */
    public boolean setContrasena(String contrasena) {
        if (contrasena.length() > 8) {
            this.contrasena = contrasena;
            return true;
        } else {
            System.out.println("Contraseña no válida. Debe tener más de 8 caracteres.");
            return false;
        }
    }

    // Getters y Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setDireccionPostal(String direccionPostal) {
        this.direccionPostal = direccionPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * Establece la edad de la persona si es válida.
     * @param edad Edad a establecer. Debe ser mayor o igual a 18.
     * @return true si la edad es válida y se establece, false de lo contrario.
     */
    public boolean setEdad(int edad) {
        if (edad >= 18) {
            this.edad = edad;
            return true;
        } else {
            System.out.println("Debes ser mayor de 18 años.");
            return false;
        }
    }

    /**
     * Devuelve una representación en cadena de la información de la persona.
     * @return Cadena con la información de la persona.
     */
    @Override
    public String toString() {
        return "DNI: " + dni + "\n" +
                "Correo: " + correo + "\n" +
                "Nombre: " + nombre + "\n" +
                "Apellidos: " + apellidos + "\n" +
                "Dirección Postal: " + direccionPostal + "\n" +
                "Código Postal: " + codigoPostal + "\n" +
                "Teléfono: " + telefono + "\n" +
                "Edad: " + edad;
    }
}
