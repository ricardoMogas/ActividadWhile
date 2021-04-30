
package actividadwhile;

import java.util.Scanner;

public class ActividadWhile {
    
    public static void factorial() {
        int cont = 1;
        int fact = 1;
        while (cont <= 10) {
            fact = fact * cont;
            cont++;
        }
        System.out.println("factorial de 10 : " + fact);
    }
    public static void media() {
        Scanner leer = new Scanner(System.in);
        int x = 0;
        System.out.println("ingrese el total de numeros a sumar");
        int total =leer.nextInt();
        int sum = 0; 
        while(x<=total){ 
            sum = sum + x;
            x++;
        }
        int media = sum/total;
        System.out.println("la media es" + media );
    }
    public static void sumNumeros(){
        Scanner leer = new Scanner(System.in);
        float sum = 0;
        int total = 0;
        int cont = 0;
        float tl = 0;
        int num =0;
        int mayor = 0;
        int menor = 1000000000;
        System.out.println("Ingrese la cantidad");
        total= leer.nextInt();
        System.out.println("Ingrese los numeros");
        while (cont<total){
            num = leer.nextInt(); 
            sum = sum + num;
            cont++;
            if (num > mayor) {
                mayor = num;
            }
            if (num < mayor ) {
                menor = num;
            }
            
        }
        tl= sum/cont;
        int distancia = mayor - menor;
        System.out.println("El Promedio es" + tl );
        System.out.println("|El mayor es:" + mayor + "|El menor es: " + menor + "|" );
        System.out.println ("La distancia entre ellos es" + distancia ) ;
    }
    
    
 
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int opcion = 0;
        do{
            
            System.out.println("1.-Ejercicio 1: factorial de 10");
            System.out.println("2.-Ejercicio 2: Sacar la media ");
            System.out.println("3.-Ejercicio 3: Suma, promedio, mayor,menor y distacia. ");
            System.out.println("4.- finalizar Programa");
            opcion= leer.nextInt();
            switch(opcion){
                case 1:
                    factorial();
                    break;
                case 2:
                    media();
                    break;
                case 3:
                    sumNumeros();
                    break;
                case 4:
                    opcion=0;
                default:
                    
            }
        }while (opcion != 0);
        System.out.println("|fin del programa|");
       
    }
    
}
