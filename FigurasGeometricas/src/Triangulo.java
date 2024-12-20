public class Triangulo implements FiguraGeometrica {
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }

    public void mostrarDatos() {
        System.out.println("Triángulo: Base = " + base + ", Altura = " + altura);
        System.out.println("Área = " + calcularArea());
    }
}
