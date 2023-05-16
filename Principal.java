public class Principal {
    public static void main(String[] args) {
        
        Circulo circulo = new Circulo();
        circulo.setRaio(10);
        System.out.println(circulo.calcularArea());

        Quadrado quadrado = new Quadrado();
        quadrado.setLado1(6);
        quadrado.setLado2(6);
        System.out.println(quadrado.calcularArea());

        Triangulo triangulo = new Triangulo();
        triangulo.setBase(4);
        triangulo.setAltura(8);
        System.out.println(triangulo.calcularArea());
    }
    
}
