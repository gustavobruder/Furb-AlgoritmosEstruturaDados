package trabalho1;

public class Subtracao implements OperacaoMatematica {
    public static final String OPERADOR = "-";

    @Override
    public double calcular(double x, double y) {
        return x - y;
    }
}