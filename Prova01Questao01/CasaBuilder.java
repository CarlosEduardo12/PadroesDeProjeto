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
public abstract class CasaBuilder {
    
    protected CasaProduct casa;

    public CasaBuilder() {
        casa = new CasaProduct();
    }
    
    public abstract void sala();
    public abstract void banheiro();
    public abstract void cozinha();
    public abstract void quarto();
    public abstract void quintal();
    public abstract void jardim();
    
    public CasaProduct getCasa(){
        return casa;
    }
    
    
    
    
}
