package uniquindio.edu.co;

import javax.swing.*;
import java.util.Scanner;

public class Main {
    String numIdentificacion = ingresarTexto("Ingrese el número de identificación del estudiante: ");
    String nombres = ingresarTexto("Ingrese los nombres del estudiante: ");
    String apellidos = ingresarTexto("Ingrese los apellidos del estudiante: ");
    String correo = ingresarTexto("Ingrese el correo del estudiante: ");
    String telefono = ingresarTexto("Ingrese el teléfono del estudiante: ");
    int Edad = ingresarEntero("Ingrese la edad del estudiante: ");

}

public static String ingrsarTexto(String mensaje){
    Scanner scanner = new Scanner(System.in);
    String texto = JOptionPane.showInputDialog(mensaje);
    return texto;
}

public static int ingresarEntero(String mensaje){
    Scanner scanner = new Scanner(System.in);
    int entero = Integer.parseInt(JOptionPane.showInputDialog(mensaje));
    return entero;
}
