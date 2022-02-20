package br.com.jovas;
/**
 * Classe utilitária relacionada a validação com parâmetros de senha forte
 * @author Jovas
 * @version 1.0.0
 */

public class Senha {
    /**
     * Método que recebe uma String(senha)
     * e retorna a quantidade de parâmetros
     * para tornar a senha forte.
     *
     * @param senha Senha digitada.
     * @return Contador com a quantidade de parâmetros necessários.
     * @throws InvalidStringNumberException Se algum parâmetro não
     * representar uma String.
     */
    public static int validaSenha(String senha) {
        int minCharacters = 6;
        int specialChar = 0;
        int digito = 0;
        int upperCase = 0;
        int lowerCase = 0;
        int validacao = 0;
        char[] verify = {'!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '-', '+'};
        if (senha.replaceAll("\\s+", "").isEmpty()) {
            return minCharacters;
        } else {
            for (int i = 0; i < senha.length(); i++) {
                char character = senha.charAt(i);
                for (char c : verify) {
                    if (character == c) {
                        specialChar++;
                    }
                }
                if (Character.isDigit(character)) {
                    digito++;
                }
                if (Character.isUpperCase(character)) {
                    upperCase++;
                }
                if (Character.isLowerCase(character)) {
                    lowerCase++;
                }
            }
            if (digito == 0)
                validacao++;
            if (specialChar == 0)
                validacao++;
            if (upperCase == 0)
                validacao++;
            if (lowerCase == 0)
                validacao++;
            if (senha.length() < minCharacters) {
                int differenceToMin = minCharacters - (senha.length() + validacao);
                if (senha.length() + validacao <= minCharacters)
                    return validacao + differenceToMin;
            }
        }
        return validacao;
    }
}
