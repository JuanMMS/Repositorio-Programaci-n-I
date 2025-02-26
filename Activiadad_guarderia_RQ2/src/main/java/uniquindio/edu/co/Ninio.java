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
    public void setNombre_completo(String nombre_completo){ this.nombre_completo;}
    public void setGenero(String genero){ this.genero = genero;}
    public void setDocumento_identidad(String documento_identidad){this.documento_identidad;}
    public void setNombre_acudiente(String nombre_acudiente){this.nombre_acudiente;}

    @Override
    public String toString(){
        return "Ninio{" +
                "ID: "} + iD + '\'' +
                "Nombres: "} + nombre_completo + '\'' +
                "Genero: "} + genero + '\'' +
                "Documento identidad: "} + documento_identidad + '\'' +
                "Nombre acudiente: "} + nombre_acudiente + '\'' +
                "Edad: "} + edad + '\'' +
                '}';
        }

}
