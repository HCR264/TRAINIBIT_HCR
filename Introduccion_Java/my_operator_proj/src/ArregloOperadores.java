public class ArregloOperadores {
    public static void main(String[] args) {
        int [] arreglo;
        String relacion;
        arreglo = new int[] {4, 6, 64, 5, 28, 52, 7, 7, 41, 9};

        System.out.println("Suma arreglo[0]+arreglo[1]: " + (arreglo[0]+arreglo[1]));
        System.out.println("Resta arreglo[2]-arreglo[3]: " + (arreglo[2]-arreglo[3]));
        System.out.println("Multiplicación arreglo[4]*arreglo[5]: " + (arreglo[4]*arreglo[5]));
        System.out.println("División arreglo[6]/arreglo[7]: " + (arreglo[6]/arreglo[7]));
        System.out.println("Modulo arreglo[8]%arreglo[9]: " + (arreglo[8]%arreglo[9]));
        System.out.println();

        for (int i = 0; i < arreglo.length - 2; i++) {
            relacion = arreglo[i] == arreglo[i+1] ? "igual" : (arreglo[i] > arreglo[i+1] ? "mayor" : "menor");
            System.out.println("El valor " + arreglo[i] + " es " + relacion + " al valor " + arreglo[i+1]);
        }
    }
}
