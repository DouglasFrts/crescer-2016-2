import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ElfoNoturnoTest
{
    @Test 
    public void atirarFlechaGanhando3DeXpEPerdendo5DeVida() { 
        ElfoNoturno elfoNoturno = new ElfoNoturno("Night Legolas"); 
        elfoNoturno.atirarFlecha(new Dwarf("Joe Doein", new DataTerceiraEra(1,1,1))); 
        assertEquals(3, elfoNoturno.getExperiencia(), 0.);
        assertEquals(95, elfoNoturno.getVida(), 0.);
    } 
 
    @Test 
    public void atirarDuasFlechasGanhando6DeXpEPerdendo9Ponto75DeVida() { 
        ElfoNoturno elfoNoturno = new ElfoNoturno("Night Legolas"); 
        elfoNoturno.atirarFlecha(new Dwarf("Joe Doein", new DataTerceiraEra(1,1,1))); 
        elfoNoturno.atirarFlecha(new Dwarf("Joe Doein", new DataTerceiraEra(1,1,1))); 
        assertEquals(6, elfoNoturno.getExperiencia(), 0.);
        assertEquals(90.25, elfoNoturno.getVida(), 0.);
    } 
 
    @Test 
    public void atirarTresFlechasGanhando3DeXpEPerdendo14DeVida() { 
        ElfoNoturno elfoNoturno = new ElfoNoturno("Night Legolas"); 
        elfoNoturno.atirarFlecha(new Dwarf("Joe Doein", new DataTerceiraEra(1,1,1))); 
        elfoNoturno.atirarFlecha(new Dwarf("Joe Doein", new DataTerceiraEra(1,1,1))); 
        elfoNoturno.atirarFlecha(new Dwarf("Joe Doein", new DataTerceiraEra(1,1,1))); 
        assertEquals(9, elfoNoturno.getExperiencia(), 0.);
        assertEquals(85.7375, elfoNoturno.getVida(), 0.);
        
    }

}
