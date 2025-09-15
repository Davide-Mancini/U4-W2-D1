package entities;

import exceptions.BancaExceptions;

public class ContoOnLine extends ContoCorrente {
    private double maxPrelievo;

    public ContoOnLine(String titolare, double saldo, double maxP) {

        super(titolare, saldo);
        this.maxPrelievo = maxP;
    }

    public void stampaSaldo() {
        System.out.println("Titolare:" + titolare + "Saldo:" + saldo+ " Num movimenti: " + nMovimenti + "- Massimo movimenti: " + maxMovimenti + "- Massimo prelievo possibile:" + maxPrelievo);
    }

    public void preleva(double x) throws BancaExceptions {
        if (x <= maxPrelievo) {
            throw new BancaExceptions("prelievo non disponibile");
        }
            super.preleva(x);
    }
}