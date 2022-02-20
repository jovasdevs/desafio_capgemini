package br.com.jovas;

import java.util.Scanner;
/**
 * Classe principal da aplicação
 * @author Jovas
 * @version 1.0.0
 */
public class Aplicacao {
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int n = input.nextInt();
        System.out.println("Saída:");

        Escada.escada(n);
        System.out.print("Digite uma senha: ");
        String senha = input.next();
        System.out.println("Saída: " + Senha.validaSenha(senha));

        System.out.print("Digite uma palavra: ");
        String palavra = input.next();
        System.out.println("Saída: " + Anagrama.getAnagramasQuantity(palavra));

        input.close();
    }
}
