public class Dwarf extends Personagem
{
    private int vida;
    private DataTerceiraEra dataNascimento;
    

    // java type initializer 
    // vai ser replicado para cada construtor 
    { 
        vida = 110; 
    } 
    
    public Dwarf() { 
        this(null, new DataTerceiraEra(1,1,1)); 
    } 
 
    public Dwarf(String nome, DataTerceiraEra dataNascimento) { 
        super(nome); 
        this.dataNascimento = dataNascimento;
    }
    
    
    public void perderVida(){
        double numero = this.getNumeroSorte(); 
        if (numero < 0) { 
            this.experiencia += 2; 
        }  
        if (numero > 100 && getVida()>0) { 
            vida -= 10; 
        } 
        if(getVida() == 0)
            status = Status.MORTO;
    }
    
    public int getVida()
    {
        return vida;
    }
    
    
 
    
    
    
    public DataTerceiraEra getDataNascimento() { 
        return this.dataNascimento; 
    } 
    
    public double getNumeroSorte()
    {
        double resultado = 101;
        if (dataNascimento.ehBissexto() && this.vida >= 80 && this.vida <= 90) { 
            resultado *= -33.0; 
        } 
 
        if (!dataNascimento.ehBissexto() && ("Seixas".equals(this.nome) || "Meireles".equals(this.nome))) { 
            resultado = resultado * 33 % 100; 
        } 

        
        return resultado;
    }
    
    public void adicionarItem(Item item){
        this.inventario.adicionarItem(item);
    }
    
    public void perderItem(Item item){
        this.inventario.removerItem(item);
    }
    
    public void tentarSorte() { 
        boolean temSorte = getNumeroSorte() == -3333; 
        if (temSorte) { 
            this.inventario.aumentarUnidadesDosItens(1000); 
        } 
    }
    
    
}
