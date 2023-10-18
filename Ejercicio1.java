import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un dia de la semana para saber que asignatura le toca a primera hora");
        String dia = sc.next();
        switch(dia){
            case "lunes":
            System.out.println("Programacion");
            break;
            case "martes":
            System.out.println("Lenguaje de Marcas");
            break;
            case "miercoles":
            System.out.println("Sistemas informaticos");
            break;
            case "jueves":
            System.out.println("Base de Datos");
            break;
            case "viernes":
            System.out.println("Fol");
            break;

            default:
            System.out.println("No ha introducido bien el dia de la semana");
        }

        sc.close();
    }
}
