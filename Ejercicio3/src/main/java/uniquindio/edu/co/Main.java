package uniquindio.edu.co;

public class Main {
    public static void main(String[] args) {
        String numeros_impares = generar_num_impares();
        System.out.println(numeros_impares);

    }
    public static String generar_num_impares(){
        String numeros_imapares = "";
        for (int i =1; i <= 50; i++){
            if (i % 2!=0){
            numeros_imapares += i+", ";
            }
        }
        return numeros_imapares;
    }

}