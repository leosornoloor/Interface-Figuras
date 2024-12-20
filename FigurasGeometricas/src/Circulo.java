public class Circulo implements FiguraGeometrica {
    private double radio;
    private final double PI = 3.1416;

    // Constructor
    public Circulo(double radio) {
        this.radio = radio;
    }

    // Implementación del método calcularArea
    @Override
    public double calcularArea() {
        return PI * Math.pow(radio, 2);
    }

    // Método para mostrar los datos
    public void mostrarDatos() {
        System.out.println("Círculo: Radio = " + radio);
        System.out.println("Área = " + calcularArea());
    }
}
