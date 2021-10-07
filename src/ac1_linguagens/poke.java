
package ac1_linguagens;

public class poke {
    //Atributos encapsulados
    private String nome;
    private String tipo;
    private int level;
    private int vida = 50;
    private int ataque = 50;
    private int defesa = 50;   
    
    //Construtor
    public poke(String nome, String tipo, int level) {
        this.nome = nome;
        this.tipo = tipo;
        this.level = level;
        atributos();
        bonus();
        print_poke();
    }

    //Metodos
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }
            
        public void atributos(){
        //calcula vida/ataque/defesa dos pokemons
            switch(this.tipo){
                case "Fogo":
                    this.vida = vida+0;
                    this.ataque = ataque+50;
                    this.defesa = defesa-25;
                break;
                
                case "Agua":
                    this.vida = vida+25;
                    this.ataque = ataque+25;
                    this.defesa = defesa+0;
                break;
                
                case "Terra":
                    this.vida = vida+50;
                    this.ataque = ataque-25;
                    this.defesa = defesa+25;
                break;
            }
        }
        public void bonus(){
        //calcula bonus baseado nos atributos
            this.vida = vida + (level / 2);
            this.ataque = ataque + (level / 3);
            this.defesa = defesa + (level / 4);
        }
        public void print_poke(){
        //imprime infos dos pokemons
            System.out.println("Nome: " + nome + " | " +
                               "Tipo: " + tipo + " | " +
                               "Level: " + level + " | " +
                               "Vida: " + vida + " | " +
                               "Ataque: " + ataque + " | " +
                               "Defesa: " + defesa + " | "
                                                        );
            }
}
