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
public class FabricaCostureira implements FabricaDeRoupa<Roupa>{    
    
    @Override
    public Roupa fabricarRoupa(int x,boolean y) {
        return new Calca(x, y);
        
    }
    }
    

