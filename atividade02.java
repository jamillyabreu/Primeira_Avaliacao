package atividadeavaliativa;
import java.util.Scanner ;
public class atividade02 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        System.out.print("Digite uma temperatura em graus °C ﹕ ");
        double celsius = input.nextDouble();
        System.out.println("──── ୨୧ ────");
        double fahrenheit = (celsius*9/5)+32 ;
        double kelvin = celsius + 273.15 ;
        System.out.println("Temperatura em Celsius ﹕ " + celsius + " °C");
        System.out.println("──── ୨୧ ────");
        System.out.println("Temperatura em Fahrenheit ﹕ " + fahrenheit + " °F ");
        System.out.println("──── ୨୧ ────");
        System.out.println("Temperatura em Kelvin  ﹕ " + kelvin + " K ");
        System.out.println("──── ୨୧ ────");
    }
}
