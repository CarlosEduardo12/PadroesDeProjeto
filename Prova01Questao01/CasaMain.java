/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prova01Questao01;

/**
 *
 * @author carlo
 */
public class CasaMain {
     
    public static void main(String[] args) {
    
        ConstrutoraDirector construtora = new ConstrutoraDirector(new CasaA());
        
        construtora.construirCasa();
        
        CasaProduct casa = construtora.getCasa();
        
        System.out.println("Sala com "+ casa.pisos );
        
    
    }
    
}
