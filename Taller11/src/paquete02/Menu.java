/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

/**
 *
 * @author denis
 */
public abstract class Menu {

    protected String nombrePlato;
    protected double valorIni;
    protected double valorMenu;

    public Menu(String nomP, double valI) {
        nombrePlato = nomP;
        valorIni = valI;
    }

    public void establecerNombrePlato(String n) {
        nombrePlato = n;
    }

    public void establecerValorInicialMenu(double n) {
        valorIni = n;
    }

    public abstract void calcularValorMenu();

    public String obtenerNombrePlato() {
        return nombrePlato;
    }

    public double obtenerValorInicialMenu() {
        return valorIni;
    }

    public double obtenerValorMenu() {
        return valorMenu;
    }

}
