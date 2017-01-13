/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciolinkenlist;

import javax.swing.JOptionPane;

/**
 *
 * @author EP.SISTEMAS
 */
class Computadora {
    
    private String mac;
    private String procesador;
    private int memoria;
    private int hdd;

    public Computadora(String mac, String procesador, int memoria, int hdd) {
        this.mac = mac;
        this.procesador = procesador;
        this.memoria = memoria;
        this.hdd = hdd;
    }
    
    public void verComputadora(){
        JOptionPane.showMessageDialog(null,"MAC: "+mac+"\n Procesador: "+procesador+" "
                + "\n Memoria RAM: "+memoria+"\n Disco Duro: "+hdd+"GB");
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    public int getHdd() {
        return hdd;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }
    
    
    
}
