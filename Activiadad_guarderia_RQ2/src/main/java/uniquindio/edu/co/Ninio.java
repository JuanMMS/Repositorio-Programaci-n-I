package uniquindio.edu.co;

public class Ninio {
    private String iD, nombre_completo, genero, documento_identidad, alergias, nombre_acudiente, numero_contacto_acudiente;
    private int edad;

    public Ninio(String iD, String nombre_completo, String genero,  String documento_identidad, String alergias, String nombre_acudiente, int edad) {
        this.iD = iD;
        this.nombre_completo = nombre_completo;
        this.genero = genero;
        this.documento_identidad = documento_identidad;
        this.alergias = alergias;
        this.nombre_acudiente = nombre_acudiente;
        this.edad = edad;
    }
    public String getID() {
        return iD;
    }
    
}
