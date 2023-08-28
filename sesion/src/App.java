public class App {
    public static void main(String[] args) throws Exception {
       //sentencia comndicional simple
       byte edad = 5;
       char sexo = 'm';
       if((edad == 5 || sexo == 'f') && (edad == 10 && sexo == 'm')){
        System.out.println("Linea 1 Dentro del if "  );
        System.out.println("Linea 2 Dentro del if " );
       }  else{
           System.out.println("Dentro del else " );
       }
    }
}
