package es.upm.miw.pd.decorator;

import upm.jbb.IO;

public class Componente1 extends Componente {

    @Override
    public void view() {
        IO.out.print("Concreto");
    }
}
