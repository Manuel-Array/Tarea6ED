package tarea6ed;

/**
 * Clase que aplica descuentos a productos según la cantidad comprada.
 */
public class Tarea6EDClase {
    
    private static final int MINIMO_PARA_REBAJA = 3;
    private static final double PRECIO_ESTANDAR = 0.95;
    private static final double PRECIO_REDUCIDO = 0.8;
    private static final int DESCUENTO_EXTRA = 5;
       
    /**
     * Aplica un descuento al precio del producto dependiendo de la cantidad.
     * @param precioProducto Precio unitario original del producto
     * @param numProductos Número total de productos comprados
     */
    public void aplicarDescuento(double precioProducto, int numProductos){
    double total;
    if(numProductos>MINIMO_PARA_REBAJA)
        precioProducto-=DESCUENTO_EXTRA;
            if (numProductos!=0){
            total = precioProducto*PRECIO_REDUCIDO;
            imprimirTotal(total);
        }else {
            total = precioProducto*PRECIO_ESTANDAR;
            imprimirTotal(total);
        }   

    }

    /**
     * Imprime el total a pagar en pantalla.
     * @param total Cantidad final tras aplicar el descuento
     */
    private void imprimirTotal(double total) {
        System.out.println("El total a pagar es:"+total);
        System.out.println("Enviado");
    }
}