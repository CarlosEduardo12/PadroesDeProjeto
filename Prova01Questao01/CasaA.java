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
public class CasaA  extends CasaBuilder {

    @Override
    public void sala() {
        casa.pisos = "Piso de madeira";
        casa.tomdasSala = 3;
        
    }

    @Override
    public void banheiro() {
        casa.tomadasBanheiro = 2;
        casa.bide = false;
        casa.qtdBanheiro = 1;
        
    }

    @Override
    public void cozinha() {
        casa.pisoCima = false;
        casa.tomadasCozinha = 4;
    }

    @Override
    public void quarto() {
        casa.tomadasQuarto = 3;
        casa.embutido = false;
        casa.qtdQuarto = 1;
    }

    @Override
    public void quintal() {
        casa.temQuintal = false;
    }

    @Override
    public void jardim() {
        casa.temJardim = false;
    }
    
}
