package I.right;

public interface Aves {
    public void setLocalizacao(double longitude, double latitude);
    public void renderizar();
}

interface AvesQueVoam extends Aves {
    public void setAltitude(double altitude);
}

class Papagaio implements AvesQueVoam {
    @Override
    public void setLocalizacao(double longitude, double latitude) {}
    @Override
    public void setAltitude(double altitude) {}
    @Override
    public void renderizar() {}
}

class Pinguim implements Aves {
    @Override
    public void setLocalizacao(double longitude, double latitude) {}
    @Override
    public void renderizar() {}
}
