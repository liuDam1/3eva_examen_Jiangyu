// JiangyuLiu
import java.util.Scanner;

/**
 * Clase principal para el registro de usuarios.
 */
public class RegistroUsuario {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Persona persona = new Persona();

        // Solicitar y establecer el DNI
        System.out.print("Ingrese el DNI: ");
        while (!persona.setDni(scanner.nextLine()))
            ;

        // Solicitar y establecer el correo electrónico
        System.out.print("Ingrese el correo electrónico: ");
        while (!persona.setCorreo(scanner.nextLine()))
            ;

        // Solicitar y establecer la contraseña
        System.out.print("Ingrese la contraseña: ");
        while (!persona.setContrasena(scanner.nextLine()))
            ;

        // Solicitar y establecer el nombre
        System.out.print("Ingrese el nombre: ");
        persona.setNombre(scanner.nextLine());

        // Solicitar y establecer los apellidos
        System.out.print("Ingrese los apellidos: ");
        persona.setApellidos(scanner.nextLine());

        // Solicitar y establecer la dirección postal
        System.out.print("Ingrese la dirección postal: ");
        persona.setDireccionPostal(scanner.nextLine());

        // Solicitar y establecer el código postal
        System.out.print("Ingrese el código postal: ");
        persona.setCodigoPostal(scanner.nextLine());

        // Solicitar y establecer el teléfono
        System.out.print("Ingrese el teléfono: ");
        persona.setTelefono(scanner.nextLine());

        // Solicitar y establecer la edad
        System.out.print("Ingrese la edad: ");
        while (!persona.setEdad(scanner.nextInt()))
            ;

        // Confirmación del registro y mostrar los detalles del usuario
        System.out.println("Registro exitoso!");
        System.out.println("Detalles del usuario:");
        System.out.println(persona);
    }
}