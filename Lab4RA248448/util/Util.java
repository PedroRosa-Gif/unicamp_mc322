package Lab4RA248448.util;

import Lab4RA248448.base.Lacaio;

public class Util {

    public static final int MAX_CARDS = 30;
    
    public static void buffar(Lacaio lac, int a) {
        if (a > 0) {
            alteraNomeFortalecido(lac);
            lac.setAtaque(lac.getAtaque() + a);
            lac.setVidaAtual(lac.getVidaAtual() + a);
        }

    }

    public static void buffar(Lacaio lac, int a, int v) {
        if (v > 0 && a > 0) {
            alteraNomeFortalecido(lac);
            lac.setAtaque(lac.getAtaque() + a);
            lac.setVidaAtual(lac.getVidaAtual() + v);
        }
    }

    public static void alteraNomeFortalecido(Lacaio lac) {
        lac.setNome(lac.getNome() + " Buffed");
    }

}
