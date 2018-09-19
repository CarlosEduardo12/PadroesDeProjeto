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
public class Calca  extends Roupa{

    private boolean frio;
    
    public Calca(){
    }

    public Calca(int tamnho, boolean frio) {
        super(tamnho);
        this.frio = frio;
    }

    public boolean isFrio() {
        return frio;
    }

    public void setFrio(boolean frio) {
        this.frio = frio;
    }
    
    public void exibirInfo() {
		System.out.println("Calça{" + "Para Frio=" + frio + '}' + " de tamanho " + super.getTamnho());
    }
    
}
