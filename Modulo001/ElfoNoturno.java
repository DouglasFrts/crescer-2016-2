import java.util.*; 
 
public class ElfoNoturno extends Elfo { 
 
    public ElfoNoturno(String nome) { 
        super(nome); 
    } 
 
    public void atirarFlecha(Dwarf dwarf) { 
        super.atirarFlecha(dwarf); 
        this.experiencia+=2;
        double vidaAPerder = this.vida*0.05;
        this.vida-=vidaAPerder;
       
    } 
 
     
}