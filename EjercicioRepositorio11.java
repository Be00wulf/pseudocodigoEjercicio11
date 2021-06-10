//EjercicioRepositorio11
import java.util.Scanner;
public class EjercicioRepositorio11 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, contadorImpares = 0, contadorPares = 0, sumaPares = 0, contador2docena = 0, valorMayor = 0;
        double promedioPares;
 
        for (int i = 1; i <= 10; i++) {
            numero = (int)(Math.random() * (36));
            System.out.println("#" + i + ": " + numero);
            
            if (numero % 2 != 0 ) {
                ++contadorImpares;
                
            }   if (numero % 2 == 0 && numero != 0) {
                ++contadorPares;
        sumaPares += numero;
                
            }   else if (numero >= 13 && numero <= 24) {
                ++contador2docena;
                
            //valor mayor
            }   else if (numero >= valorMayor) {
                valorMayor = numero;
            }
            
        }
        
        
        promedioPares = (double)(sumaPares / contadorPares);
        
        System.out.println("La cantidad de numeros impares es de " + contadorImpares);
        System.out.println("La cantidad de numeros pares es de " + promedioPares);
        System.out.println("El numero mayor es: " + valorMayor);
        System.out.println("Si ahora se leen números hasta que llega el valor36, habrían mas numeros imapres, mas valores a evaluar en el promedio de pares y el resultado mayor seríá 36 siempre ya que es el limite");
    }
}