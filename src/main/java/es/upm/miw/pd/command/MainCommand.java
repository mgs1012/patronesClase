package es.upm.miw.pd.command;

import upm.jbb.IO;

public final class MainCommand {
    private Invocador invocador;

    public MainCommand() {
        Receptor receptor = new Receptor();
        this.invocador= new Invocador();
        this.invocador.anadir(new OrdenConcreta1(receptor));
        this.invocador.anadir(new OrdenConcreta2(receptor));
    }

    public void invocador() {
        String llave = (String) IO.in.select(this.invocador.llaves());
        this.invocador.invocar(llave);
    }

    public static void main(String[] args) {
        IO.in.addController(new MainCommand());
    }

}
