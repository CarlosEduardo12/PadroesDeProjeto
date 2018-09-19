/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prova01Questão05;

/**
 *
 * @author carlo
 */
public class ConfeccaoMain {
    
    public static void main(String[] args) {
        Roupa calca, camisa;  
        FabricaConfeccao fabrica = new FabricaConfeccao();
        calca = fabrica.fabricarRoupa(34, true);
        
        FabricaCostureira maquina = new FabricaCostureira();
        
        camisa = maquina.fabricarRoupa(36, false);
        
        calca.exibirInfo();
        camisa.exibirInfo();
        
        
        
    }



}
