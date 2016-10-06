public class Elfo extends Personagem{
    
    private static int contadorDeElfos;
    
    Elfo(String n) {
        this(n,42);//chamando construtor de baixo.
    }
    
    public Elfo(String nome, int quantidadeDeFlechas) {
        super(nome);
        this.vida = 100;
        this.inicializarInventario(quantidadeDeFlechas);
        Elfo.contadorDeElfos++;
    }
    
    // ~Elfo() { } 
    // https://docs.oracle.com/javase/7/docs/api/java/lang/Object.html#finalize() 
    protected void finalize() throws Throwable { 
        super.finalize(); 
        Elfo.contadorDeElfos--; 
    } 
     
    public static int getContadorDeElfos() { 
        return Elfo.contadorDeElfos; 
    }
    
    public void atirarFlecha(Dwarf dwarf) {
        atirarFlechas(dwarf, 1);
    }
    
    protected void atirarFlechas(Dwarf dwarf, int xp) {
        boolean temFlecha = getFlecha().getQuantidade()>0;
        if(temFlecha){
            getFlecha().setQuantidade(getFlecha().getQuantidade() - 1);
            this.experiencia+= 1*xp;
            dwarf.perderVida();
        }
    }
    
    protected void inicializarInventario(int quantidadeDeFlechas) {
        this.inventario.adicionarItem(new Item("Arco", 1));
        this.inventario.adicionarItem(new Item("Flechas", quantidadeDeFlechas >= 0 ? quantidadeDeFlechas : 42));
    }
    
    
    /*public void atirarFlechaRefactory() {
        experiencia++;
        flecha.setQuantidade(flecha.getQuantidade()-1);
    }*/
    
    public Item getArco(){
        return this.inventario.getItens().get(0);
    }
    
    public Item getFlecha(){
        return this.inventario.getItens().get(1);

    }
    
    public String toString(){
        boolean flechaNoSingular = this.getFlecha().getQuantidade() == 1;
        boolean experienciaNoSingular = this.experiencia == 1;
        return String.format("%s possui %d %s e %d %s de experiencia.", this.nome, this.getFlecha().getQuantidade(),
            flechaNoSingular ? "flecha" : "flechas",  this.experiencia, experienciaNoSingular ? "nível" : "níveis");
       // return this.nome + " possui " + this.flecha.getQuantidade() + " flechas e " + this.experiencia + " níveis de experiência.";
    }
    
}


