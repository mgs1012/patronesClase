package es.uom.miw.pd.Observer.Persona;

import java.util.HashSet;
import java.util.Set;

public class ObservablePersona {
    private final Set<ObservadorPersona> lista = new HashSet<ObservadorPersona>();

    public void aniadir(ObservadorPersona observador) {
        this.lista.add(observador);
    }

    public void quitar(ObservadorPersona observador) {
        this.lista.remove(observador);
    }

    public void notificar() {
        for (ObservadorPersona observador : lista) {
            observador.actualizar();
        }
    }
}