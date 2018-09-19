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
public class Camisa extends Roupa {
    
    private boolean mangaFrio;
    
    public Camisa(){}

    public Camisa(int tamnho, boolean mangaFrio) {
        super(tamnho);
        this.mangaFrio = mangaFrio; 
    }

    public boolean isMangaFrio() {
        return mangaFrio;
    }

    public void setMangaFrio(boolean mangaFrio) {
        this.mangaFrio = mangaFrio;
    }
    
    public void exibirInfo() {
		System.out.println("Camisa{" + "Manga Curta= " + mangaFrio + '}'+" de tamanho " + super.getTamnho());
    }
    
}
