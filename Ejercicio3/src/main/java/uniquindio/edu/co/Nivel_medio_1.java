package uniquindio.edu.co;

import java.util.Scanner;

public class Nivel_medio_1 {
    public static void main(String[] args) {
        int numero_n = ingresar_entero();
        String triangulo = generar_triangulo(numero_n);
        System.out.println(triangulo);
    }

    public static int ingresar_entero(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el número N para formar el triangulo: ");
        int numero_n = Integer.parseInt(scanner.nextLine());
        return numero_n;
    }
    public static String generar_triangulo(int numero_n){
        String triangulo = "";
        char forma = '#';
        int i = 1;
        while(i<=numero_n){
            for(int j=i; j<=numero_n; j++){
                triangulo += forma;
            }
            triangulo += "\n";
            i++;
        }
        return triangulo;
        }

    }
