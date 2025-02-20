package uniquindio.edu.co;

public class Ninio {
    private String nombre;
    private int edad;
    private char genero;
    private int documento_ideantidad;
    private String alergias;
    private String nombre_acudiente;
    private int numero_contacto;

    public Ninio(String nombre, int edad, char genero, int documento_identidad, String alergias, String nombre_Acudiente, int numero_contacto){
        this.nombre = nombre;
        this.edad =edad;
        this.genero = genero;
        this.documento_ideantidad = documento_identidad;
        this.alergias = alergias;
        this.nombre_acudiente = nombre_Acudiente;
        this.numero_contacto = numero_contacto;
    }

    public String toString(){
        return "Niño{" +
                "\nNombre: " + nombre + '\'' +
                "\nEdad: " + edad + '\'' +
                "\nGénero: " + genero + '\'' +
                "\nDocumento de identidad: " + documento_ideantidad + '\'' +
                "\nAlergias: " + alergias + '\'' +
                "\nNombre acudiente: " + nombre_acudiente + '\'' +
                "\nNúmero de contacto: " + numero_contacto + "}";
    }
}
