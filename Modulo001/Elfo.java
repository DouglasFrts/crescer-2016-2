public class Elfo {
    private String nome;
    private Item arco;
    private Item flecha;
    private int experiencia;
    private Status status;

    public Elfo(String n) {
        this(n,42);//chamando construtor de baixo.
    }
    
    public Elfo(String nome, int quantidadeDeFlechas) {
        this.nome = nome;
        arco = new Item("Arco", 1);
        flecha = new Item("Flechas", quantidadeDeFlechas >=0 ? quantidadeDeFlechas : 42);
        status = Status.VIVO;
    }
    

    public void setNome(String n) {
        nome = n;
    }

    public String getNome() {
        return nome;
    }

    public void atirarFlecha(Dwarf dwarf) {
        boolean temFlecha = flecha.getQuantidade()>0;
        if(temFlecha){
            flecha.setQuantidade(flecha.getQuantidade() - 1);
            experiencia++;
            dwarf.perderVida();
        }
    }

    /*public void atirarFlechaRefactory() {
        experiencia++;
        flecha.setQuantidade(flecha.getQuantidade()-1);
    }*/
    
    public Item getArco(){
        return arco;
    }
    
    public Item getFlecha(){
        return flecha;
    }
    public int getExperiencia(){
        return experiencia;
    }
    
    public Status getStatus(){
        return status;
    }
    
    public String toString(){
        boolean flechaNoSingular = this.flecha.getQuantidade() == 1;
        boolean experienciaNoSingular = this.experiencia == 1;
        return String.format("%s possui %d %s e %d %s de experiencia.", this.nome, this.flecha.getQuantidade(),
            flechaNoSingular ? "flecha" : "flechas",  this.experiencia, experienciaNoSingular ? "nível" : "níveis");
       // return this.nome + " possui " + this.flecha.getQuantidade() + " flechas e " + this.experiencia + " níveis de experiência.";
    }
    
}


