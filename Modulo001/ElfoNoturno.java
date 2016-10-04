import java.util.*; 
 
public class ElfoNoturno extends Elfo { 
 
    public ElfoNoturno(String nome) { 
        super(nome); 
    } 
    
    public ElfoNoturno(String nome, int qtdFlechas) { 
        super(nome, qtdFlechas); 
    }
 
    public void atirarFlecha(Dwarf dwarf) { 
       if(this.status == Status.VIVO){
            super.atirarFlecha(dwarf, 3); 
            double vidaAPerder = this.vida*0.05;
            this.vida-=vidaAPerder;
            this.status = this.vida < 1 ? Status.MORTO : this.status;
        }
    } 
 
     
}