public class CalculoDescuento {

    // Método que calcula el descuento aplicando un porcentaje específico
    public static double calcularDescuento(double montoTotal, double porcentajeDescuento) {
        return montoTotal * (porcentajeDescuento / 100);
    }

    // Método sobrecargado que aplica un descuento por defecto del 10%
    public static double calcularDescuento(double montoTotal) {
        return calcularDescuento(montoTotal, 10); // 10% por defecto
    }

    public static void main(String[] args) {
        // Ejemplo de monto de compra
        double montoCompra1 = 200.0;
        double montoCompra2 = 350.0;

        // Uso del método sobrecargado (descuento por defecto 10%)
        double descuento1 = calcularDescuento(montoCompra1);
        double total1 = montoCompra1 - descuento1;

        System.out.println("Compra 1:");
        System.out.println("Monto total: $" + montoCompra1);
        System.out.println("Descuento aplicado (10%): $" + descuento1);
        System.out.println("Monto final a pagar: $" + total1);
        System.out.println("-----------------------------");

        // Uso del método con porcentaje explícito (ej. 15%)
        double porcentajeDescuento2 = 15.0;
        double descuento2 = calcularDescuento(montoCompra2, porcentajeDescuento2);
        double total2 = montoCompra2 - descuento2;

        System.out.println("Compra 2:");
        System.out.println("Monto total: $" + montoCompra2);
        System.out.println("Descuento aplicado (" + porcentajeDescuento2 + "%): $" + descuento2);
        System.out.println("Monto final a pagar: $" + total2);
    }
}