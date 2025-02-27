package uniquindio.edu.co;

import java.util.List;
import java.util.ArrayList;

public class Guarderia {
    private String nombre;
    private List<Ninio> listNinios;

    public Guarderia(String nombre){
        this.nombre = nombre;
        this.listNinios = new ArrayList<>();
    }

    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){}

    public List<Ninio> getListNinios(){
        return listNinios;
    }
    public void setListNinios(List<Ninio> listNinios) { this.listNinios = listNinios;}

    public boolean verificarNinio(Ninio ninio){
        boolean existe = true;
        for (Ninio ninios : listNinios){
            if (ninios.getID().equals(ninio.getID())){
                existe = false;
            }
        }
        return existe;
    }
    public void almacenarNinios(Ninio ninio){
        boolean existe = verificarNinio(ninio);
        if (existe){
            listNinios.add(ninio);
            System.out.println("Ninio almacenado");
        }else{
            System.out.println("Niño ya está almacenado");
        }
    }

    public void eliminarNinio(String ID){
        for (Ninio ninio : listNinios){
            if(ninio.getID().equals(ID)){
                listNinios.remove(ninio);
                System.out.println("Ninio eliminado");
            }
        }
    }
    public void actualizarNinio(String ID, Ninio ninio){{
        for(int i=0; i<listNinios.size(); i++){
            if(listNinios.get(i).getID().equals(ID)){
                listNinios.set(i, ninio);
                System.out.println("Ninio actualizado con éxito");
                break;
            }
        }
    }

    }

    }
