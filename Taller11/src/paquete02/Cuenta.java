/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;
import java.util.List;
/**
 *
 * @author denis
 */
public class Cuenta {
    private String nombreCliente;
    private List<Menu> menus;
    private double valorTotal;
    private double valorSubtotal;
    private double valorIva;

    public Cuenta(String nombreClie, List<Menu> men, double valorIv) {
        nombreCliente = nombreClie;
        menus = men;
        valorIva = valorIv;
    }

    public String obtenerNombreCliente() {
        return nombreCliente;
    }

    public void establecerNombreCliente(String n) {
        nombreCliente = n;
    }

    public List<Menu> obtenerMenus() {
        return menus;
    }

    public void establecerMenus(List<Menu> n) {
        menus = n;
    }

    public double obtenerValorTotal() {
        return valorTotal;
    }

    public void calcularValorTotal() {
        double opereacion = (valorSubtotal * valorIva)/100;
        valorTotal = valorSubtotal + opereacion;
    }

    public double obtnerValorSubtotal() {
        return valorSubtotal;
    }

    public void calcularValorSubtotal() {
        double suma = 0;
        for (int i = 0; i < menus.size(); i++) {
            suma += menus.get(i).obtenerValorMenu();
        }
        
        valorSubtotal = suma;
    }

    public double obtnerValorIva() {
        return valorIva;
    }

    public void establecerValorIva(double n) {
        valorIva = n;
    }

    @Override
    public String toString() {
        String m = String.format("Factura\n"
                + "Cliente: %s", 
                nombreCliente);
        
        for (int i = 0; i < menus.size(); i++) {
            m = String.format("%s%s",
                    m,
                    menus.get(i));
        }
        
        m = String.format("%sSubtotal: $%.2f\n"
                + "IVA: %.2f\n"
                + "Total a Pagar: $%.3f\n",
                m,
                valorSubtotal,
                valorIva,
                valorTotal);
        
        return m;
    }
    
    
}

