package uniquindio.edu.co;

import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nombre = ingresarTexto("Ingrese nombre del niño: ");
        int edad = ingresarEntero("Ingrese la edad: ");
        char genero = ingresarChar("Ingrese el género (M/F): ");
        int documento_identidad = ingresarEntero("Ingrese el documento de indentidad: ");
        String alergias = ingresarTexto("Ingrese las alergias: ");
        String nombre_acudiente = ingresarTexto("Ingrese el nombre del acudiente: ");
        int numero_contacto = ingresarEntero("Ingrese el numero de contacto: ");
        Ninio ninio_unico = new Ninio(nombre, edad, genero, documento_identidad, alergias, nombre_acudiente, numero_contacto);

        //Ninio ninio1 = new Ninio("Ivan", 2, 'M', 456, "N/a", "Esteban Dido", 32221);
        //Ninio ninio2 = new Ninio("Perez", 3, 'M', 123, "Brocoli", "Esteban Dido", 310222);

        System.out.println(ninio_unico.toString());
        //System.out.println(ninio2.toString());
    }
    public static String ingresarTexto(String mensaje){
        Scanner scanner = new Scanner(System.in);
        String texto = JOptionPane.showInputDialog(mensaje);
        return texto;
    }
    public static int ingresarEntero(String mensaje){
        Scanner scanner = new Scanner(System.in);
        int entero = Integer.parseInt(JOptionPane.showInputDialog(mensaje));
        return entero;
    }
    public static char ingresarChar(String mensaje){
        Scanner scanner = new Scanner(System.in);
        System.out.println(mensaje);
        char caracter = scanner.nextLine().charAt(0);
        return caracter;
    }
    public static int documento_identidad(String mensaje){
        Scanner scanner = new Scanner(System.in);
        int documento_identidad = Integer.parseInt(JOptionPane.showInputDialog(mensaje));
        return documento_identidad;
    }
    public static String alergias(String mensaje){
        Scanner scanner = new Scanner(System.in);
        String alergias = JOptionPane.showInputDialog(mensaje);
        return alergias;
    }
    public static String nombre_acudiente(String mensaje){
        Scanner sacnner = new Scanner(System.in);
        String nombre_acudiente = JOptionPane.showInputDialog(mensaje);
        return nombre_acudiente;
    }
    public static int numero_contacto(String mensaje){
        Scanner scanner = new Scanner(System.in);
        int numero_contacto = Integer.parseInt(JOptionPane.showInputDialog(mensaje));
        return numero_contacto;
    }

    }
