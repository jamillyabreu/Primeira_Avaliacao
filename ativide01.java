package atividadeavaliativa;

import java.util.Scanner ;
public class ativide01 {
    static void main() {
        Scanner input = new Scanner(System.in) ;
        System.out.print("Informe o nome do Aluno ﹕ ");
        String nome = input.nextLine();
        System.out.println("──── ୨୧ ────");
        System.out.print("Informe a primeira nota ﹕");
        double nota01 = input.nextDouble();
        System.out.println("──── ୨୧ ────");
        System.out.print("Informe a segunda nota ﹕");
        double nota02 = input.nextDouble();
        System.out.println("──── ୨୧ ────");
        System.out.print("Informe a terceira nota ﹕");
        double nota03 = input.nextDouble();
        System.out.println("──── ୨୧ ────");
        System.out.print("Informe a quarta nota ﹕");
        double nota04 = input.nextDouble();
        System.out.println("──── ୨୧ ────");
        System.out.print("Informe a quinta nota ﹕");
        double nota05 = input.nextDouble();
        System.out.println("──── ୨୧ ────");
        System.out.print("Informe a sexta nota ﹕");
        double nota06 = input.nextDouble();
        System.out.println("──── ୨୧ ────");
        System.out.print("Informe a setima nota ﹕");
        double nota07 = input.nextDouble();
        System.out.println("──── ୨୧ ────");
        System.out.print("Informe a oitava nota ﹕");
        double nota08 = input.nextDouble();
        System.out.println("──── ୨୧ ────");

        double primeirobimestre = (nota01 + nota02)/2 ;
        double segundobimestre = (nota03 + nota04)/2 ;
        double terceirobimestre = (nota05 + nota06)/2 ;
        double quartobimestre = (nota07 + nota08) /2 ;
        double primeirosemtrestre = (primeirobimestre + segundobimestre)/2;
        double segundosemestre = (terceirobimestre + quartobimestre)/2 ;

        double mediafinal = ( primeirosemtrestre + segundosemestre ) /2 ;

        System.out.println("Primeiro Bimestre ﹕ " + primeirobimestre);
        System.out.println("Segundo Bimestre ﹕ " + segundobimestre);
        System.out.println("Terceiro Bimestre ﹕ " + terceirobimestre);
        System.out.println("Quarto Bimestre ﹕ " + quartobimestre);
        System.out.println("──── ୨୧ ────");
        System.out.println("Primeiro Semestre ﹕ " + primeirosemtrestre);
        System.out.println("Segundo Semestre ﹕ " + segundosemestre);
        System.out.println("──── ୨୧ ────");
        System.out.println("A média final do aluno (a) " + nome + " foi igual á ﹕ " + mediafinal);



    }
}
