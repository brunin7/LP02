// Escreva um programa que solicita a idade de uma pessoa e 
// verifica se ela pode dirigir (idade>=18).

import java.util.Scanner;

public class Questao04 {
    public static void main (String[] args){
        Scanner ler = new Scanner (System.in);
        System.out.println ("Digite sua idade :");
        int idade = ler.nextInt();
        if (idade < 18){
            System.out.println("Você não pode tirar CNH.");
        } else{
            System.out.println("Você já pode tirar CNH.");
        }
    
    }
   
    
}
