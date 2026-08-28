public class CalculadoraVenta {
    private double subtotal;
    private double totalFinal;


    public double calcularTotalFinal() {
        // Operacion esperada para el RF1
        this.totalFinal = this.subtotal * 1.19;
        return this.totalFinal;
    }
}