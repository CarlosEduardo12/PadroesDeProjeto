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
        
        System.out.println("Sala: com "+ casa.pisos + ", Quantidades de banheiros: " +casa.qtdBanheiro + ((casa.bide==true) ? ", possui bide" : ", Não possui bide\n"+
               "Cozinha: Azulejo até o teto: " + ((casa.pisoCima == true) ? " Sim." : " Não.") + " Quantidades de tomadas " +casa.tomadasCozinha + ".\nQuartos: " +
                casa.qtdQuarto + " Quarto(s), " + " Quantidade de tomadas " + casa.tomadasQuarto + ((casa.embutido == true) ? ". Com guarda roupa embutido" : ". Sem guarda roupa embutido\n" )+
                "Area externa: " +((casa.temJardim == true) ? "Possui jardim com "+casa.jardim + "m²" : " não possui jardim" ) +
                ((casa.temQuintal == true) ? " e um quintal de " + casa.areaQuintal + "m²\n" : " e não possui quintal\n") ));
        
        construtora = new ConstrutoraDirector(new CasaB());
        
        construtora.construirCasa();
        
        casa = construtora.getCasa();
        
        System.out.println("Sala: com "+ casa.pisos + ", Quantidades de banheiros: " +casa.qtdBanheiro + ((casa.bide==true) ? ", possui bide" : ", Não possui bide\n"+
               "Cozinha: Azulejo até o teto: " + ((casa.pisoCima == true) ? " Sim." : " Não.") + " Quantidades de tomadas " +casa.tomadasCozinha + ".\nQuartos: " +
                casa.qtdQuarto + " Quarto(s), " + " Quantidade de tomadas " + casa.tomadasQuarto + ((casa.embutido == true) ? ". Com guarda roupa embutido\n" : ". Sem guarda roupa embutido\n" )+
                "Area externa: " +((casa.temJardim == true) ? "Possui jardim com "+casa.jardim + "m²" : " não possui jardim" ) +
                ((casa.temQuintal == true) ? " e um quintal de " + casa.areaQuintal + "m²\n" : " e não possui quintal\n") ));
        
        construtora = new ConstrutoraDirector(new CasaC());
        
        construtora.construirCasa();
        
        casa = construtora.getCasa();
        
        System.out.println("Sala: com "+ casa.pisos + ", Quantidades de banheiros: " + casa.qtdBanheiro + ((casa.bide==true) ? ", possui bide" : ", Não possui bide\n")+
               "Cozinha: Azulejo até o teto: " + ((casa.pisoCima == true) ? " Sim." : " Não.") + " Quantidades de tomadas " +casa.tomadasCozinha + ".\nQuartos: " +
                casa.qtdQuarto + " Quarto(s), " + " Quantidade de tomadas " + casa.tomadasQuarto + ((casa.embutido == true) ? ". Com guarda roupa embutido\n" : ". Sem guarda roupa embutido\n" )+
                "Area externa: " +((casa.temJardim == true) ? "Possui jardim com "+casa.jardim + "m²" : " não possui jardim" ) +
                ((casa.temQuintal == true) ? " e um quintal de " + casa.areaQuintal + "m²\n" : " e não possui quintal\n") );
        
        
      
    
    }
    
}
