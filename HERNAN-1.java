public class HERNAN {
    public static void main(String[] args) {
        double numeros[] = {21.3,21.9,20.5,15.8,12.2,20.5,19.7,26.8,18.4,22.3,18.5,17.3,15.1,22.8,8.3,18, 19.6,17.9,24.6,23.9,15.8,12.3,11,26.4,13.4,16.2,22.7,22.7,13.4,23,11.2,19.1};

        double total = numeros.length;
        double mayor = numeros[0];
        double menor = numeros[0];
        for (int i = 0; i < total; i++) {
            System.out.print("\t " + numeros[i]);
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
            // mostrar tabla
            if (i > 0 && (i+1) % 6 == 0) {
                System.out.print("\n");
            }
        }
        double rango = mayor - menor;
        double intervalo = (double) Math.ceil(1 + (Math.log(total) / Math.log(2)));
        double amplitud = (double) rango / intervalo;

        System.out.print("\n");
        System.out.println("Datos: " + total);
        System.out.println("Mayor: " + mayor);
        System.out.println("Menor: " + menor);
        System.out.println("Rango: " + rango);
        System.out.println("Intervalo: " + intervalo);
        System.out.println("Amplitud: " + amplitud);
    }
}
