public class Main {
    public static void main(String[] args) {
        
        Rectangulo rectangulo = new Rectangulo(5, 4);
        Triangulo triangulo = new Triangulo(3, 6);
        Circulo circulo = new Circulo(7);

        rectangulo.mostrarDatos();
        System.out.println();

        triangulo.mostrarDatos();
        System.out.println();

        circulo.mostrarDatos();
    }
}
