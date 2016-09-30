public class Elfo {
    private String nome;
    private int experiencia;
    private Status status;
    private Inventario inventario;

    public Elfo(String n) {
        this(n,42);//chamando construtor de baixo.
    }
    
    public Elfo(String nome, int quantidadeDeFlechas) {
        this.nome = nome;
        inventario = new Inventario();
        this.inventario.adicionarItem(new Item("Arco", 1));
        this.inventario.adicionarItem(new Item("Flechas", quantidadeDeFlechas >=0 ? quantidadeDeFlechas : 42));
        status = Status.VIVO;

    }
    

    public void setNome(String n) {
        nome = n;
    }

    public String getNome() {
        return nome;
    }

    public void atirarFlecha(Dwarf dwarf) {
        boolean temFlecha = getFlecha().getQuantidade()>0;
        if(temFlecha){
            getFlecha().setQuantidade(getFlecha().getQuantidade() - 1);
            experiencia++;
            dwarf.perderVida();
        }
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
    public int getExperiencia(){
        return experiencia;
    }
    
    public Status getStatus(){
        return status;
    }
    
    public String toString(){
        boolean flechaNoSingular = this.getFlecha().getQuantidade() == 1;
        boolean experienciaNoSingular = this.experiencia == 1;
        return String.format("%s possui %d %s e %d %s de experiencia.", this.nome, this.getFlecha().getQuantidade(),
            flechaNoSingular ? "flecha" : "flechas",  this.experiencia, experienciaNoSingular ? "nível" : "níveis");
       // return this.nome + " possui " + this.flecha.getQuantidade() + " flechas e " + this.experiencia + " níveis de experiência.";
    }
    
}

