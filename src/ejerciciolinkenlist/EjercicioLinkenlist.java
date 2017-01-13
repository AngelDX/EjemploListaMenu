/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciolinkenlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author EP.SISTEMAS
 */
public class EjercicioLinkenlist {
    public static List<Computadora> lista=new LinkedList<Computadora>();
    public static List<Computadora> listaord=new ArrayList<Computadora>();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic her
        lista.add(new Computadora("0X0045F23","Core i7",8,1000));
        lista.add(new Computadora("0X0334534","Core i5",4,500));
        lista.add(new Computadora("0X0045F23","Core i3",2,200));
        
        int opt=0;
        do{
            opt=Integer.parseInt(JOptionPane.showInputDialog("----MENU----\n"
                    + "1 - Agregar Computadora\n"
                    + "2 - Eliminar Computadora\n"
                    + "3 - Mostrar Lista\n"
                    + "4 - Salir"));
            switch(opt){
                case 1: agregar();break;
                case 2: eliminar();break;
                case 3: mostrar();break;
                case 4: opt=0;break;
                default: JOptionPane.showMessageDialog(null,"La opcion no existe");
            }
        }while(opt!=0);
    }

    private static void mostrar() {
        //insercion();
        for(int i=0;i<lista.size();i++){
            lista.get(i).verComputadora();
        }
        System.out.println("------------------------------------");
        
    }
    
     private static void mostrarOrdenado() {
        insercion();
        for(int i=0;i<listaord.size();i++){
            listaord.get(i).verComputadora();
        }
        System.out.println("------------------------------------");
        
    }

    private static void agregar() {
        String mac=JOptionPane.showInputDialog("Ingrese la MAC");
        String micro=JOptionPane.showInputDialog("Ingrese el Microprocesador");
        int ram=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la RAM"));
        int hd=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Disco Duro"));
        lista.add(new Computadora(mac,micro,ram,hd));
        mostrarOrdenado();
    }

    private static void eliminar() {
      int elemento=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el elemento a eliminar"));
      lista.remove(elemento);
      mostrar();
    }
    
    
    
     private static void insercion(){
        //Crear un array con las memorias ram
        int arreglo[]=new int[lista.size()];
        for(int i=0;i<lista.size();i++){
            arreglo[i]=lista.get(i).getMemoria();
        }
         
        for(int x=1;x<arreglo.length;x++){
            int aux=arreglo[x];
            int y=x-1;
        while((y>=0)&&(aux<arreglo[y])){
            arreglo[y+1]=arreglo[y];
            y--;
        }
        arreglo[y+1]=aux;
        }
        
        for(int i=0;i<arreglo.length;i++){
            int pos=buscar(arreglo[i]);
            if(pos!=-1){
                listaord.add(lista.get(pos));
            }
        }
        
     }
     
     public static int buscar(int elem){
         for(int i=0;i<lista.size();i++){
            if(elem==lista.get(i).getMemoria()){
                return i;
            }
        }
        return -1;
     }
    
}
