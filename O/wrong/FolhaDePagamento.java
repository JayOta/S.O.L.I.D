package O.wrong;

class ContratoClt {
    
    public void salario() {}
}

class Estagio {
    
    public void bolsaAuxilio() {}
}

public class FolhaDePagamento {
    protected double saldo;

    public void calcular(Object contrato) {
        if(contrato instanceof ContratoClt) {
            this.saldo = contrato.salario();
        } else if(contrato instanceof Estagio) {
            this.saldo = contrato.bolsaAuxilio();
        }
    }
}
