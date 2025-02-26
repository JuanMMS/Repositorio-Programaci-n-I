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
    public String getNombre_completo() {
        return nombre_completo;
    }
    public String getGenero(){
        return genero;
    }
    public String getDocumento_identidad() {
        return documento_identidad;
    }
    public String getNombre_acudiente() {
        return nombre_acudiente;
    }
    public int getEdad(){
        return edad;
    }
    public void setiD(String iD) {
        this.iD = iD;
    }
    public String setID() {
        return iD;
    }
    public String setNombre_completo() {
        return nombre_completo;
    }
    public String setGenero(){
        return genero;
    }
    public String setDocumento_identidad() {
        return documento_identidad;
    }
    public String setNombre_acudiente() {
        return nombre_acudiente;
    }
    public int setEdad(){
        return edad;
    }

}
