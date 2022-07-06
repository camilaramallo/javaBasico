public class Funciones {
    public static void main(String[] args) {
        System.out.println("__________SUELDO MÁS EL IVA___________");
        double sueldo = 69.600;
        double sueldoIva = getSueldoIva(sueldo);
        System.out.println("Su sueldo mas el iva es de: "+sueldoIva);
    }

    private static double getSueldoIva(double sueldo) {
        return sueldo +1.21;
    }
}
