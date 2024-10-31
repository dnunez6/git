/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package caso1santiago;

/**
 *
 * @author compr
 */
public class Factura {
    
     private String nombreCliente;
    private String cedulaCliente;
    private String codigoFactura;
    private double monto;
    private int productoElectrico;
    private int productoAutomotriz;
    private int productoConstruccion;
//constructor
    public Factura(String nombreCliente, String cedulaCliente, String codigoFactura, double monto, int productoElectrico, int productoAutomotriz, int productoConstruccion) {
        this.nombreCliente = nombreCliente;
        this.cedulaCliente = cedulaCliente;
        this.codigoFactura = codigoFactura;
        this.monto = monto;
        this.productoElectrico = productoElectrico;
        this.productoAutomotriz = productoAutomotriz;//
        this.productoConstruccion = productoConstruccion;
    }
    //getter and setter
    public double calcularComision(){
        double comision=0;
        if (productoElectrico >0&& productoAutomotriz>0 && productoConstruccion>0){
            comision=+monto*0.10;//bono de 10%
            
        }else if (productoElectrico>=3){
            comision=+monto*0.04;//bono de 4% por 
        }
        if (productoAutomotriz>=4){
            comision=+monto*0.04;//bono de 4% por aquirir productos automotrices mayores a 4
        }
        if (productoConstruccion>0){
            comision=+monto*0.08;// se aplica el bono de 8% de compra
        }
        if (monto>50000){
            comision=+monto*0.5;
            
            
        }
        return comision;
    }
    
    //aqui agregar getter and setter en caso de ser necesario
    
}
