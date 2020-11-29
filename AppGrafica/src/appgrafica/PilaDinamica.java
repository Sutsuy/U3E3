/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appgrafica;

/**
 *
 * @author sause
 */
import java.util.Scanner;
class PilaDinamica {

    NodoPila cima;
    int tamanio;
    
    public boolean EstaVacia()
    {
        return cima==null;
    }
    
    public void Empujar(String elemento){
        NodoPila nodo = new NodoPila(elemento);
       nodo.siguiente=cima;
            cima = nodo;
             tamanio++;
    }
    
    
    public String SacarPila()
    {
        String auxiliar=cima.elemento;
        if(!EstaVacia()){
           
        cima=cima.siguiente;
        tamanio --;
        
        if(EstaVacia()){
            String opc;
            Scanner leer = new Scanner(System.in);
            System.out.println("No se encuentran elementos en la Pila corazon :c:");
            System.out.println("\n¿Deceas ingresar elementos a la pia otra vez?");
            opc = leer.next();
            if(opc.equals("Si") || opc.equals("si")){
                System.out.println("Ingresando 10 números aleatorios."); 
                int n1 [] = new int[10];
                
        
                for(int i =0;i<n1.length;i++){
                    n1[i] = (int)(Math.random() * (50 - 500) + 500);
                    Empujar(""+n1[i]);
                }
            }else{
                System.out.println("Regresate al menu corazóm :* ");
            }
        }
        }   
            
        
        
        return auxiliar; 
        
        }
    
    
    public void mostrarPila(){
        NodoPila recorre = cima;
        
            while(recorre!= null){
                System.out.println(recorre.elemento);
                recorre = recorre.siguiente;
            }
            
        }
        
    
    
}
