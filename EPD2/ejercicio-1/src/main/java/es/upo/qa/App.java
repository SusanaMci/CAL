package es.upo.qa;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.RandomStringUtils;


public class App 
{
    static final int TAM= 10;
    public static void main( String[] args )
    {
        caracteresAleatorios(TAM);
        caracteresAlfanumericos();
        String[] array=arrayCaracteresAleatorios();
        invierteOrdenArray(array);
    }
    
    
    public static String caracteresAleatorios(int tam) {

//     
//        System.out.println("Cadena de 10  "+cadenaAleatoria);
        
        String cadenaAleatoria=RandomStringUtils.randomPrint(tam);
        System.out.print("Cadena de 10 carácteres aleatorios:");
        System.out.println( cadenaAleatoria);
        
        return cadenaAleatoria;
    }
    
    public static void caracteresAlfanumericos() {
        String cadenaAlfanumerica = RandomStringUtils.randomAlphanumeric(5);
     
        System.out.println("Cadena de 5 carácteres alfanuméricos: "+cadenaAlfanumerica);
    }
    
    public static String[] arrayCaracteresAleatorios() {
        String[] arrayAleatorio = new String[0];
        String cadenaAleatoria;
        System.out.println("\nArray de 5 cadenas de 8 carácteres aleatorios:");
        for (int i = 0; i < 5; i++) {
            cadenaAleatoria=caracteresAleatorios(8);
            
           // cadenaAleatoria = RandomStringUtils.randomPrint(8);
            arrayAleatorio=(String[]) ArrayUtils.add(arrayAleatorio, cadenaAleatoria);
            //System.out.println(arrayAleatorio[i]);
            
        }
      return arrayAleatorio;
    }
    
    public static void invierteOrdenArray(String[] array){
       System.out.println("\nArray anterior invertido de 5 cadenas de 8 carácteres aleatorios");
       ArrayUtils.reverse(array);
       for (int i = 0; i < 5; i++) {
           System.out.println(array[i]);
       }
    }
  
}
