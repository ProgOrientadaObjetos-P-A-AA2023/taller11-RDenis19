/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

/**
 *
 * @author denis
 */
public class MenuCarta extends Menu {

    private double valorGuarnicion;
    private double valorBebida;
    private double porcentajeAdicional;

    public MenuCarta(double valorG, double valorBe, double porcentajeA,
            String nombreP, double valorI) {
        super(nombreP, valorI);
        valorGuarnicion = valorG;
        valorBebida = valorBe;
        porcentajeAdicional = porcentajeA;
    }
    public void establecerValorGuarnicion(double n) {
        valorGuarnicion = n;
    }

    public void establecerValorBebida(double n) {
        valorBebida = n;
    }

    public void establecerPorcentajeAdd(double n) {
        porcentajeAdicional = n;
    }

    public double obtenerValorGuarnicion() {
        return valorGuarnicion;
    }

    public double obtenerValorBebida() {
        return valorBebida;
    }

    public double obtenerPorcentajeAdd() {
        return porcentajeAdicional;
    }

    @Override
    public void calcularValorMenu() {
        double valorAdi = (valorIni * porcentajeAdicional) / 100;
        valorMenu = valorIni + valorBebida + valorGuarnicion + valorAdi;
    }

    @Override
    public String toString() {
        String m = String.format("\n==========Menu de la Carta:==========\n"
                + "  *Plato: %s\n"
                + "  *Valor Inicial del menu: $%.2f\n"
                + "  *Valor porcion de guarnicion: $%.2f\n"
                + "  *Valor bebida: $%.2f\n"
                + "  *Porcentaje adicional: %.2f\n\n",
                nombrePlato,
                valorIni,
                valorGuarnicion,
                valorBebida,
                porcentajeAdicional,
                valorMenu);
        return m;
    }

}
