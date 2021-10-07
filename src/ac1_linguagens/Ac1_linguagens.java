
package ac1_linguagens;

public class Ac1_linguagens {

    public static void main(String[] args) {
       
        //obj pokemons  
        poke poke1 = new poke("Mudkip","Agua",10);
        poke poke2 = new poke("Torchic","Fogo",10);  
        poke poke3 = new poke("Treecko","Terra",10);
        
        int vidapoke1 = poke1.getVida();
        int vidapoke2 = poke2.getVida();
        
        if(vidapoke1 > vidapoke2){
            System.out.println(poke1.getNome()+ " venceu!");
        }
        else if(vidapoke1 == vidapoke2){
            System.out.println("empatou!");
        }
        else {
            System.out.println(poke2.getNome()+ " venceu!");
        }
    }
}
