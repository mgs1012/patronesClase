package es.upm.miw.pd.command;

public class OrdenConcreta2 implements Orden {
    private Receptor receptor;

    public OrdenConcreta2(Receptor receptor) {
        this.receptor = receptor;
    }

    @Override
    public String name() {
        return "OrdenConcreta2";
    }

    @Override
    public void ejecutar() {
        this.receptor.accion2();
    }

}
