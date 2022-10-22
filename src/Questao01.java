//Escreva um programa que leia um número e escreva na tela se o número é menor, 
//igual ou maior que zero:
    
import java.util.Scanner;

public class Questao01 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int numero = ler.nextInt();
        String mensagem = "O número %s é %s que Zero,";
		if (numero < 0) {
            // %s cacaractere coringa para ser substituido pela variavel/valor.
			mensagem = String.format(mensagem, numero, "menor");	
		}else if (numero > 0) {
			mensagem = String.format (mensagem, numero, "maior");			
		}else{
			mensagem = String.format (mensagem, numero, "igual");
            mensagem = mensagem.replaceAll ("que","a");
		}	
        System.out.println (mensagem);
        ler.close();	
	}	
}