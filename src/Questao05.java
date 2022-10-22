import java.util.Scanner;

public class Questao05 {
    public static void main (String[] args){
        Scanner ler = new Scanner (System.in);
        System.out.println ("Digite sua idade :");
        int idade = ler.nextInt();
        if (idade < 16){
            System.out.println("Você não pode nem votar e nem dirigir!!");
        } else if (idade < 18){
            System.out.println("Você já pode votar, porém não pode dirigir!!");
        } else {
           System.out.println("Você já pode votar e já pode tirar CNH");
        }
        ler.close();
    }
    
}
