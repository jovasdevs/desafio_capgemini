import br.com.jovas.Anagrama;
import br.com.jovas.Escada;
import br.com.jovas.Senha;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class AplicacaoTeste {
    //Quando não há letras repetidas na palavra, retornar 0
    @Test
    public void countAnagramsReturnZero(){
        int testResult = Anagrama.getAnagramasQuantity("ola");

        assertEquals(0, testResult);
    }

    //Caso 1: contador
    @Test
    public void countAnagramsOneCase(){
        int testResult = Anagrama.getAnagramasQuantity("ovo");

        assertEquals(2, testResult);
    }

    //Caso 2: contador
    @Test
    public void countAnagramsTwoCase(){
        int testResult = Anagrama.getAnagramasQuantity("ifailuhkqq");

        assertEquals(3, testResult);
    }

    //Teste de parâmetros para a senha forte e o tamanho mínimo: 6 caracteres
    @Test
    public void requiredCharactersMinSix(){
        String senha = "Ya3";
        int countCharacters = Senha.validaSenha(senha);

        assertTrue(countCharacters + senha.length() >= 6);
    }

    //Caso 1: parâmetros para senha forte
    @Test
    public void requiredCharactersCase(){
        String senha = "Ya3";
        int countCharacters = Senha.validaSenha(senha);

        assertEquals(3, countCharacters);
    }

    //A cada interação no loop: (n) + 1, irá representar a altura do triângulo
    @Test
    public void countLoop(){
        int n = 6;
        assertEquals(Escada.escada(n), n + 1);
    }

}
