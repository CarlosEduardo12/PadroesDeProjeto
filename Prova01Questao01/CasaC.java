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
public class CasaC  extends CasaBuilder {

    @Override
    public void sala() {
        casa.pisos = "Piso de Marmore";
        casa.tomdasSala = 6;
        
    }

    @Override
    public void banheiro() {
        casa.tomadasBanheiro = 6;
        casa.bide = true;
        casa.qtdBanheiro = 3;
        
    }

    @Override
    public void cozinha() {
        casa.pisoCima = true;
        casa.tomadasCozinha = 7;
    }

    @Override
    public void quarto() {
        casa.tomadasQuarto = 4;
        casa.embutido = true;
        casa.qtdQuarto = 3;
    }

    @Override
    public void quintal() {
        casa.temQuintal =true; 
        casa.areaQuintal = 5.5;
    }

    @Override
    public void jardim() {
        casa.temJardim = true;
        casa.jardim = 2.5;
    }
    
}
