/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package caso1santiago;

import javax.swing.JOptionPane;

/**
 *
 * @author compr
 */
public class CASO1SANTIAGO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Vendedor vendedor = new Vendedor (
                "119200575",
                "Santiago Jimenez",
                "Code:SC-112",
                "Sucursal-Heredia",
                true
        );
        
        String nombreCliente=JOptionPane.showInputDialog("Ingrese el nombre del cliente");
        String cedulaCliente=JOptionPane.showInputDialog("Ingrese la cedula del cliente");
        String codigoFactura=JOptionPane.showInputDialog("Ingrese el codigo de factura");
        double monto = Double.parseDouble(JOptionPane.showInputDialog("Digite de cuanto fue su monton"));
        int productoElectrico = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el monto de productos electricos adquiridos"));
        int productoAutomotriz = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el monto de productos automotriz adquiridos"));
        int productoConstruccion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el monto de productos para construccion"));
        
        Factura factura = new Factura (nombreCliente, cedulaCliente,codigoFactura,monto,productoElectrico, productoAutomotriz, productoConstruccion);
        //calcular comision
        double comision = factura.calcularComision();
        //muestro resultados
        //System.out.println("La factura esta a nombre del cliente: "+nombreCliente);
        //System.out.println("La cedula del cliente es: "+cedulaCliente);
        //System.out.println("El codigo de la factura es: "+codigoFactura);
        //System.out.println("MONTO TOTAL: "+monto);
        //System.out.println("Cantidad de productos electricos: "+productoElectrico);
        //System.out.println("Cantidad de productos automotriz: "+productoAutomotriz);
        //System.out.println("Cantidad de productos de construccion: "+productoConstruccion);
        //System.out.println("COMISIONES: "+comision);
        
        JOptionPane.showMessageDialog(null, "La factura esta a nombre del cliente"+nombreCliente+" La cedula del cliente: "+cedulaCliente+
                " Codigo de factura "+codigoFactura+" MONTO TOTAL: "+monto+ " CANTIDAD DE PRODUCTOS ELECTRICOS: "+productoElectrico+" CANTIDAD DE PRODUCTOS AUTOMOTRIZ: "
        +productoAutomotriz+"CANTIDAD DE PRODUCTOS DE CONSTRUCCION: "+productoConstruccion+" COMISIONES: "+comision+".");
    
        
    }
    
}
