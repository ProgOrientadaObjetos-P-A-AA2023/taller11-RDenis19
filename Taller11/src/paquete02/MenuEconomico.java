/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

/**
 *
 * @author denis
 */
public class MenuEconomico extends Menu {

    private double porcentajeDesc;

    public MenuEconomico(double porcentajeD, String nombrePlat, double valorI) {
        super(nombrePlat, valorI);
        porcentajeDesc = porcentajeD;
    }

    public void establecerPorcentajeDesc(double d) {
        porcentajeDesc = d;
    }

    public double obtenerPorcentajeDesc() {
        return porcentajeDesc;
    }

    @Override
    public void calcularValorMenu() {
        double porcentaje = (valorIni * porcentajeDesc) / 100;
        valorMenu = valorIni - porcentaje;
    }

    @Override
    public String toString() {
        String m = String.format("\n==========Menu Economico==========\n"
                + "  *Plato: %s\n"
                + "  *Valor Inicial del menu: $%.2f\n"
                + "  *Porcentaje de descuento: %.2f\n"
                + "  *Valor del Menu: $%.2f\n\n",
                nombrePlato,
                valorIni,
                porcentajeDesc,
                valorMenu);
        return m;
    }

}
