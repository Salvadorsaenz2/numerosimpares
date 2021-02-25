/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numparesimpares66136;

/**
 *
 * @author salva
 */
public class NumParesImpares66136 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int numero = 1;
    int sumapares = 0;
    int sumaimpares = 0;
    
    while (numero <= 100){
       if (numero % 2 == 0){
           sumapares = numero + sumapares;
           
           
       }else{
           sumaimpares = numero + sumaimpares;
       }
       numero++;
    }
        System.out.println( sumaimpares);
        System.out.println( sumapares);
       }
    
    
    
    
    
    
    
    
    
    
}
    

