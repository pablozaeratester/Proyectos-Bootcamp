public class Main {
    public static void main(String[] args) {
        int contador = 10;
        String estacion = "primavera";


        while (contador > 0) {
            System.out.println(contador);
            contador = contador - 1;
        }
        if (contador == 0) {
            System.out.println("Ya he terminado de contar");
        }
if (estacion == "primavera") {
            System.out.println("Es primavera");
        } else if (estacion == "verano") {
    System.out.println("Es verano");
    } else {
    System.out.println("Es otra estación");
        }
    }
}