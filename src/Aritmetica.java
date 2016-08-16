/**
 * Created by JonathanBarros on 8/15/16.
 *
 */
public class Aritmetica {

    static public int somar(int registrador1, int registrador2){
        return registrador1 + registrador2;
    }

    static public int multiplicar(int registrador1, int registrador2){
        return registrador1 * registrador2;
    }

    static public int dividir(int registrador1, int registrador2){
        return registrador2 == 0 ? 0 : registrador1 / registrador2;
    }

    static public int subtrair(int registrador1, int registrador2){
        return registrador1 - registrador2;
    }
}
