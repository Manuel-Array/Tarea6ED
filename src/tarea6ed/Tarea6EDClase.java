package tarea6ed;

public class Tarea6EDClase {
    
    private static final int MINIMO_PARA_REBAJA = 3;
    private static final double PRECIO_ESTANDAR = 0.95;
    private static final double PRECIO_REDUCIDO = 0.8;
    private static final int DESCUENTO_EXTRA = 5;
    
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

    private void imprimirTotal(double total) {
        System.out.println("El total a pagar es:"+total);
        System.out.println("Enviado");
    }
}

// y ahora hago un commit!