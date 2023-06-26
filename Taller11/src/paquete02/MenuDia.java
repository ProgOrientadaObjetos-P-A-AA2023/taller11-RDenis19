/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

/**
 *
 * @author denis
 */
public class MenuDia extends Menu {

    private double valorPostre;
    private double valorBebida;

    public MenuDia(double valorPos, double valorBe,
            String nombrePla, double valorIni) {
        super(nombrePla, valorIni);
        valorPostre = valorPos;
        valorBebida = valorBe;
    }

    public void establecerValorPostre(double n) {
        valorPostre = n;
    }

    public void establecerValorBebida(double n) {
        valorBebida = n;
    }

    public double obtenerValorPostre() {
        return valorPostre;
    }

    public double obtenerValorBebida() {
        return valorBebida;
    }

    @Override
    public void calcularValorMenu() {
        valorMenu = valorIni + valorBebida + valorPostre;
    }

    @Override
    public String toString() {
        String m = String.format("==========Menu del Dia==========\n"
                + "  *Plato: %s\n"
                + "  *Valor Inicial del menu: $%.2f\n"
                + "  *Valor del postre: $%.2f\n"
                + "  *Valor bebida: $%.2f\n"
                + "  *Valor del Menu: $%.2f\n\n",
                nombrePlato,
                valorIni,
                valorPostre,
                valorBebida,
                valorMenu);
        return m;
    }

}
