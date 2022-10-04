package polynomials;

public class Grid {
    public final double[] x, y;

    public Grid(double begin, double end, int numberOfSteps) {
        x = new double[numberOfSteps];
        y = new double[numberOfSteps];

        double step = (end - begin) / (numberOfSteps - 1);
        x[0] = begin;
        x[numberOfSteps - 1] = end;

        for (int i = 1; i < numberOfSteps - 1; i++) x[i] = x[i - 1] + step;
        for (int i = 0; i < numberOfSteps; i++) y[i] = function(x[i]);
    }

    public static double function(double value) {
        double func = Math.sin(value*value/2);
        return func >= Polynomial.quality ? func : 0;
    }
}