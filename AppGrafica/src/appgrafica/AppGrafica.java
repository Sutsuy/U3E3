/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appgrafica;
import java.util.*;
/**
 *
 * @author sause
 */
public class AppGrafica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
     Scanner leer=new Scanner (System.in);
        
        boolean continuar=true;
        
        int opc;
        String palabra;
        PilaDinamica pila=new PilaDinamica();
        
        while(continuar){
        System.out.println("MENU");
        System.out.println("1.- Insertar");
        System.out.println("2.- Eliminar ");
        System.out.println("3.- Mostrar ");
        System.out.println("4.- Salir ");
        System.out.println("Elige una opcion--> ");
        opc=leer.nextInt();
        
        
        
        switch (opc)
        {
            case 1:
                System.out.println("Ingresando 10 números aleatorios."); 
                int n1 [] = new int[10];
                
                for(int i =0;i<n1.length;i++){
                    n1[i] = (int)(Math.random() * (50 - 500) + 500);
                    pila.Empujar(""+n1[i]);
                }
                /*for(int j = 0; j < n1.length; j++){
                    System.out.println(n1[j]);
                }*/
                
               
                break;
                
            case 2:
                
                pila.SacarPila();
               
             break;
             
            case 3:
                pila.mostrarPila();
                
            break;
                
            case 4:
               continuar= false;
              
               break;
                
            default:
                {
                    System.out.println("Opcio´n incorrecta.....Vuelve a intentarlo");                                                  
            
                }
                
                
            
            
            
        }
        
        
        
        
        
    }
    
    }
    }
    

