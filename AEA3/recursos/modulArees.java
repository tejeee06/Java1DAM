package AEA3.recursos;

public class modulArees {
    public double area = 0;

    public double calcularCuadrat(double a) {
        return area = Math.pow(a, 2);
    }

    public double calcularRectangle(double a, double b) {
        return area = a * b;
    }

    public double calcularTriangle(double a, double b) {
        return area = a * b / 2;
    }

    public double calcularTrapezi(double a, double b, double c) {
        
        return area = (a + b) * c / 2;
    }

    public double rombe(double a, double b) {
        return area = a * b;
    }

    public double cercle(double a) {
        double pi = Math.PI;
        return area = a * pi;
    }
}
