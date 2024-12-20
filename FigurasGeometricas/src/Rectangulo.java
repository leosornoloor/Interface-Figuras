public class Rectangulo implements FiguraGeometrica {
    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }

    public void mostrarDatos() {
        System.out.println("Rectángulo: Base = " + base + ", Altura = " + altura);
        System.out.println("Área = " + calcularArea());
    }
}
