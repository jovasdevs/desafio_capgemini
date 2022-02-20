package br.com.jovas;

import java.util.Arrays;
import java.util.HashMap;

/**
 * Classe unitária relacionada ao Anagrama
 * @author Jovas
 * @version 1.0.0
 */

public class Anagrama {
 /**
* Método que recebe uma String(palavra) e retorna
* um HashMap que contem: String e uma chave do tipo Integer
*
* @param palavra Palavra inserida.
* @return Lista com todas as substrings da palavra recebida.
* @exception InvalidStringNumberException Caso o parâmetro não
* representar uma String.
*/
public static HashMap<String, Integer> getAllSubstrings(String palavra){
   HashMap<String, Integer> substrings= new HashMap<>();
     for(int i =0; i<palavra.length(); i++){
        for(int j = i +1; j< palavra.length() + 1; j++){
            char[] result = palavra.substring(i,j).toCharArray();
            Arrays.sort(result);
            String newString = new String (result);
              if(substrings.containsKey(newString)){
                  substrings.put(newString, substrings.get(newString)+1);
              }else
                substrings.put(newString, 1);
            }
    }
       return substrings;
  }

 /**
* Método que recebe um HashMap (lista de substrings)
* e retorna através do contador a
* quantidade de anagramas contidos na lista.
* @param substrings Lista de substrings.
* @return Quantidade de anagramas contidos na lista.
* @exception InvalidStringNumberException Se o parâmetro não
* representar um HashMap.
*/
public static int contaAnagramas(HashMap<String, Integer> substrings){
       int count = 0;
       for(String key: substrings.keySet()){
       int nChar = substrings.get(key);
        count += (nChar * (nChar-1))/2;
    }
    return count;
 }
 /**
* Método que recebe uma palavra e verifica caracteres repetidos,
* caso nao haja caracteres repetidas, retorna zero. Caso contrário,
* retorna uma chamada para outro metodo
* @param palavra Palavra inserida.
* @return Metodo com a Quantidade de anagramas presentes na palavra
* @exception InvalidStringNumberException Se o parâmetro não
* representar uma String.
 */
    public static int getAnagramasQuantity(String palavra){
        HashMap<String, Integer> listSubstrings = getAllSubstrings(palavra);
        if(!(palavra.length() != palavra.chars().distinct().count())) return 0;
        else return contaAnagramas(listSubstrings);
    }
}