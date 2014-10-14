package es.upm.miw.pd.doo.polymorphism.inheritance.lackOf;

public class Subtraction extends MathOperations {
    private final int operator1, operator2;

    public Subtraction(final int operator1, final int operator2) {
        this.operator1 = operator1;
        this.operator2 = operator2;
    }

    public int calcularOperacion() {
        return this.operator1 - this.operator2;
    }

    @Override
    public String toString() {
        return "[" + operator1 + "-" + operator2 + "]";
    }

}
