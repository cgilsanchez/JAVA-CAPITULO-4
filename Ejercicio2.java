import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca una hora:");
        int hora = sc.nextInt();
        if (hora>6){
            System.out.println("Buenos dias");

        }else if (hora>13){
            System.out.println("Buenas tardes");
        }else if(hora>21){
            System.out.println("Buenas noches");
        }
        sc.close();
    }
}
