package O.right;

public interface Remuneravel {
    public void remuneracao();
}
class ContratoClt implements Remuneravel {
    public void remuneracao() {}
}

class ContratoPj implements Remuneravel {
    public void remuneracao() {}
}

class Estagio implements Remuneravel {
    public void remuneracao() {}
}

class FolhaDePagamento {
    protected saldo;

    public void calcular( Remuneravel contrato ) {
        this.saldo = contrato.remuneracao();
    }
}
