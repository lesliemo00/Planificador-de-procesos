/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.planificador;

/**
 *
 * @author Leslie Morales y Maria Gomez
 */
public class Proceso implements Comparable<Proceso> {

    private String nombre;
    private int tllegada;
    private int tcpu;
    private int tcomienzo;
    private int tfin;
    private int tespera;
    private boolean llego;
    public Proceso() {
        this.llego = false;
    }
    

    public boolean isLlego() {
        return llego;
    }

    public void setLlego(boolean llego) {
        this.llego = llego;
    }

    public Proceso(String nombre, int tllegada, int tcpu) {
        this.nombre = nombre;
        this.tllegada = tllegada;
        this.tcpu = tcpu;
    }

    public Proceso(String nombre, int tllegada, int tcpu, int tcomienzo, int tfin, int tespera, boolean n) {
        this.nombre = nombre;
        this.tllegada = tllegada;
        this.tcpu = tcpu;
        this.tcomienzo = tcomienzo;
        this.tfin = tfin;
        this.tespera = tespera;
        this.llego = n;
    }
    public void copiar (Proceso p){
        this.nombre = p.getNombre();
        this.tllegada = p.getTllegada();
        this.tcpu = p.getTcpu();
        this.tcomienzo = p.getTcomienzo();
        this.tfin = p.getTfin();
        this.tespera = p.getTespera();
        this.llego = p.isLlego();
    
    
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTllegada() {
        return tllegada;
    }

    public void setTllegada(int tllegada) {
        this.tllegada = tllegada;
    }

    public int getTcpu() {
        return tcpu;
    }

    public void setTcpu(int tcpu) {
        this.tcpu = tcpu;
    }

    public int getTcomienzo() {
        return tcomienzo;
    }

    public void setTcomienzo(int tcomienzo) {
        this.tcomienzo = tcomienzo;
    }

    public int getTfin() {
        return tfin;
    }

    public void setTfin(int tfin) {
        this.tfin = tfin;
    }

    public int getTespera() {
        return tespera;
    }

    public void setTespera(int tespera) {
        this.tespera = tespera;
    }

    @Override
    public int compareTo(Proceso t) {
        if (tllegada < t.tllegada) {
            return -1;
        }
        if (tllegada > t.tllegada) {
            return 1;
        }
        return 0;
    }
//    public int compareTo2(Proceso t) {
//        if (tcpu< t.getTcpu()) {
//            return -1;
//        }
//        if (tcpu< t.getTcpu()) {
//            return 1;
//        }
//        return 0;
//    }

}
