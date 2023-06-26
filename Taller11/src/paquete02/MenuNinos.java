/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

/**
 *
 * @author denis
 */
public class MenuNinos extends Menu {

    private double valorHelado;
    private double valorPastel;

    public MenuNinos(double valorH, double valorPas, String nombrePlat,
            double valorI) {
        super(nombrePlat, valorI);
        valorHelado = valorH;
        valorPastel = valorPas;
    }

    public void establecerValorHelado(double n) {
        valorHelado = n;
    }

    public void establecerValorPastel(double n) {
        valorPastel = n;
    }

    public double obtenerValorHelado() {
        return valorHelado;
    }

    public double obtenerValorPastel() {
        return valorPastel;
    }

    @Override
    public void calcularValorMenu() {
        valorMenu = valorIni + valorHelado + valorPastel;
    }

    @Override
    public String toString() {
        String m = String.format("\n==========Menu de Niños==========\n"
                + "  *Plato: %s\n"
                + "  *Valor Inicial del menu: $%.2f\n"
                + "  *Valor porcion de helado: $%.2f\n"
                + "  *Valor porcion de pastel: $%.2f\n"
                + "  *Valor del Menu: $%.2f\n\n",
                nombrePlato,
                valorIni,
                valorHelado,
                valorPastel,
                valorMenu);
        return m;
    }

}
