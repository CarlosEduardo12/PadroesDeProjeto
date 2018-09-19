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
public class CasaB  extends CasaBuilder {

    @Override
    public void sala() {
        casa.pisos = "Piso de Porcelanato";
        casa.tomdasSala = 4;
        
    }

    @Override
    public void banheiro() {
        casa.tomadasBanheiro = 3;
        casa.bide = false;
        casa.qtdBanheiro = 2;
        
    }

    @Override
    public void cozinha() {
        casa.pisoCima = true;
        casa.tomadasCozinha = 6;
    }

    @Override
    public void quarto() {
        casa.tomadasQuarto = 4;
        casa.embutido = true;
        casa.qtdQuarto = 3;
    }

    @Override
    public void quintal() {
        casa.temQuintal = true;
        casa.areaQuintal = 3.0;
    }

    @Override
    public void jardim() {
        casa.temJardim = false;
    }
    
    
}
