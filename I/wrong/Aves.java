package I.wrong;
// Exemplo de um jogo de animais, e aqui temos algumas aves que serão tratadas como personagens deste jogo
public interface Aves { 
    public void setLocalizacao(double longitude, double latitude);
    public void setAltitude(double altitude);
    public void renderizar();
}

class Papagaio implements Aves {
    @Override
    public void setLocalizacao(double longitude, double latitude) {}
    @Override
    public void setAltitude(double longitude) {}
    @Override
    public void renderizar() {}
}

class Pinguim implements Aves {
    @Override
    public void setLocalizacao(double longitude, double latitude) {}
    @Override
    public void setAltitude(double altitude) {
        // Não faz nada... Pinguins não voam!
    }
    @Override
    public void renderizar() {}
}