package uniquindio.edu.co;

import java.util.Scanner;

public class LibreriaApoyo {
    }
    public static int ingresarEntero(String mensaje){
    Scanner scanner = new Scanner(System.in);
    System.out.println(mensaje);
    int entero = scanner.nextInt();
    scanner.close();
    return entero;

}

}