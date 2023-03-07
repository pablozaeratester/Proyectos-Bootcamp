public class Main {
    public static void main(String[] args) {

        int numeroIF = 3;
        if (numeroIF < 0) {
            System.out.println(" El numeroIF " + numeroIF + " es negativo ");
        } else if (numeroIF > 0) {
            System.out.println(" El numeroIF " + numeroIF + " es positivo ");
        } else {
            System.out.println(" El numeroIF es 0 ");
        }

        int numeroWhile = 0;
        while (numeroWhile < 3) {
            System.out.println(" El numeroWhile es " + numeroWhile);
            numeroWhile++;
        }
        do {
            System.out.println(" El numeroDoWhile es " + numeroWhile);
            numeroWhile--;
        } while (numeroWhile > 3);

        int numeroFor = 0;
        for (; numeroFor <= 3; numeroFor++) {
            System.out.println(" Este es el numeroFor= " + numeroFor);
        }
        String estacion = "Canada";
        switch (estacion) {
            case "Invierno":
                System.out.println("Es invierno");
                break;
            case "Verano":
                System.out.println("Es verano");
                break;
            case "Primavera":
                System.out.println("Es primavera");
                break;
            case "Otoño":
                System.out.println("Es otoño");
                break;
            default:
                System.out.println(estacion + " no es una estación ");
        }
    }
}