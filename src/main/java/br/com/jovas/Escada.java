package br.com.jovas;
/**
 * Classe utilitária relacionada ao desenho de uma Escada
 * utilizando (*) para formar o desenho da escada.
 * @author Jovas
 * @version 1.0.0
 */
public class Escada {

    /**
     * Método void que recebe um número que será
     * o tamanho da base e altura da escada.
     * @param N Tamanho da base e altura.
     * @return void.
     * @exception InvalidStringNumberException Se o parâmetro não
     * representar um int.
     */
    public static int escada(int N){
        int i = 0;
        while(i <= N){
            for(int X = 0;X < N-i;X++){
                System.out.print("  ");
            }
            for(int Y = 0; Y < i; Y++){
                System.out.print("*" + " ");
            }
            i++;
            System.out.println();
        }
        return i;
    }
}
