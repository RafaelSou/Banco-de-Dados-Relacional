package br.com.abc.br.com.abc.javacore.ZZCjdbc.db;
import java.util.Random;

/**
 *
 * @author Rafael
 */
public class GRandom {
    private Random random = new Random();

    /**
     * Gera uma String Aleatória de valores 1 e 0.
     *
     * @param x Numero de bits desejados
     */
    public String RandomString(int x){
        String result = new String();

        for(int indice = 0; indice < x; indice++){
            result += random.nextInt(2);
        }
        return result;
    }

    /**
     * Usa o metodo RandomString e Converte o resultado para inteiro.
     *
     * @param x Numero de bits desejados
     */
    public int RandomInt(int x){
        int result = Integer.parseInt(this.RandomString(x));
        return result;
    }
}