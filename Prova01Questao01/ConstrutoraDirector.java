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
public class ConstrutoraDirector {
    
    protected CasaBuilder construir;

    public ConstrutoraDirector(CasaBuilder construir) {
        this.construir = construir;
    }
    
    public void construirCasa(){
        construir.sala();
        construir.banheiro();
        construir.cozinha();
        construir.quarto();
        construir.quintal();
    }
    
    public CasaProduct getCasa(){
        return construir.getCasa();
    }
    
}
