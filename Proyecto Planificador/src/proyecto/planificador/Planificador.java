/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.planificador;

import java.util.ArrayList;

/**
 *
 * @author Leslie Morales y Maria Gomez
 */
public class Planificador {

    ArrayList<Proceso> lt = new ArrayList();

    public ArrayList<Proceso> getLt() {
        return lt;
    }

    public void setLt(ArrayList<Proceso> lt) {
        this.lt = lt;
    }

    /**
     * @param args the command line arguments
     */
    public void main(String[] args) {
    }

    public void llenar(Proceso a) {
        lt.add(a);
        ordenar();
    }

    public void ordenar() {
        lt.sort((x, y) -> x.compareTo(y));
    }

//    public void ordenar2() {
//        lt.sort((x, y) -> x.compareTo2(y));
//    }

    public void fifo() {

        int cont1 = 0;//contador de tiempo de llegada de cpu
        int cont2 = lt.get(0).getTllegada();//contador de tiempo de llegada de cpu con valor inicial de tiempo de llegada en la posicion 0

        for (int i = 0; i < lt.size(); i++) {
            cont1 = +lt.get(i).getTcpu();
            //condicionales para el tiempo de comienzo

            if (i == 0) { // el primer proceso
                lt.get(i).setTcomienzo(lt.get(0).getTllegada());
            } 
            else {//los procesos intermedios
                cont2 += lt.get(lt.size() - 1).getTcpu();
                lt.get(i).setTcomienzo(lt.get(i - 1).getTfin());
            }
            //tiempo de finalización
            lt.get(i).setTfin(cont1);
            //tiempo de espera
            lt.get(i).setTespera(lt.get(i).getTcomienzo() - lt.get(i).getTllegada());

        }//END FOR

    }

//    public void sjf() {
//        ArrayList<Proceso> lt2 = lt;
//        int tiempoCpu = buscarPrimero().getTcpu();
//        int anterior = 0;
//        for (int i = 0; i < lt2.size(); i++) {
//            if (lt2.get(i).getTllegada() == 0) {
//                lt2.get(i).setTcomienzo(anterior);
//                lt2.get(i).setTfin(anterior + lt2.get(i).getTcpu());
//                lt2.get(i).setTespera(lt2.get(i).getTcomienzo() - lt2.get(i).getTllegada());
//                anterior = lt2.get(i).getTfin();
//                lt2.get(i).setLlego(true);
//                tiempoCpu = lt2.get(i).getTcpu();
//            } else {
//                Proceso p = buscarMenor(tiempoCpu);
//                p.setTcomienzo(anterior);
//                p.setTfin(anterior + p.getTcpu());
//                p.setTespera(p.getTcomienzo() - p.getTllegada());
//                anterior = p.getTfin();
//                p.setLlego(true);
//                tiempoCpu += p.getTcpu();
//                lt2.get(lt2.indexOf(p)).copiar(p);
//            }
//        }
//        lt = lt2;
//
//    }
//
//    public Proceso buscarMenor(int b) {
//        Proceso p = new Proceso();
//        int anterior = 99;
//        for (Proceso i : lt) {
//            if (i.isLlego() == true && i.getTcpu() < b && i.getTllegada() <= b) {
//                if (i.getTcpu() < anterior) {
//                    p = i;
//                    anterior = i.getTcpu();
//                }
//            }
//        }
//        return p;
//
//    }
//
//    public Proceso buscarPrimero() {
//        int menro = 99;
//        Proceso p = new Proceso();
//        for (int i = 0; i < lt.size(); i++) {
//            if (lt.get(i).getTcpu() < menro) {
//                p = lt.get(i);
//            }
//        }
//        return p;
   //}

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

}
