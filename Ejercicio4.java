import java.util.Scanner;

public class Ejercicio4 {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca las horas trabajadas de este mes");
        int horas = sc.nextInt();
        if (horas>40){
            horas = horas*16;
        }
        double sueldo= horas*12;
        double sueldosemanal = sueldo/4;
        
        System.out.println("Su sueldo a recibir a la semana es: "+sueldosemanal);
        sc.close();
    }
}
