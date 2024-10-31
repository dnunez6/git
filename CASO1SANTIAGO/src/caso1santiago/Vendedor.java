/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package caso1santiago;

/**
 *
 * @author compr
 */
public class Vendedor {
    
    private String cedula;
    private String nombre;
    private String codigo;
    private String sucursal;
    private boolean tienecarro;
//atributos
    public Vendedor(String cedula, String nombre, String codigo, String sucursal, boolean tienecarro) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.codigo = codigo;
        this.sucursal = sucursal;
        this.tienecarro = tienecarro;
    }
//getter and setter
    public String getCedula() {
        return cedula;
    }



    public String getNombre() {
        return nombre;
    }

   

    public String getCodigo() {
        return codigo;
    }

  

    public String getSucursal() {
        return sucursal;
    }


//NO REVELANTE solo queria probar boolean
    public boolean isTienecarro() {
        return tienecarro;
    }
    
}
