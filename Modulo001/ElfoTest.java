import static org.junit.Assert.*; 
import org.junit.After; 
import org.junit.Before; 
import org.junit.Test; 
 
public class ElfoTest 
{ 
    @Test 
    public void elfoNasceComNome() { 
        //Arrange 
        String nomeEsperado = "Bruce Wayne"; 
        //Act 
        Elfo bruceWayne = new Elfo(nomeEsperado); 
        //Assert 
        assertEquals(nomeEsperado, bruceWayne.getNome()); 
    } 
     
    @Test 
    public void elfoNasceComArco(){ 
        //Arrange 
        Item arco = new Item("Arco",1); 
        //Act 
        Elfo elfoDoTeste = new Elfo("Legolas"); 
        //Assert 
        assertEquals("Arco", elfoDoTeste.getArco().getDescricao()); 
        assertEquals(1, elfoDoTeste.getArco().getQuantidade()); 
    } 

    @Test
    public void elfoNasceCom42Flechas(){ 
        //Arrange 
        Item arco = new Item("Flechas",42); 
        //Act 
        Elfo elfoDoTeste = new Elfo("Legolas"); 
        //Assert 
        assertEquals("Flechas", elfoDoTeste.getFlecha().getDescricao()); 
        assertEquals(42, elfoDoTeste.getFlecha().getQuantidade()); 
    }
    
    @Test
    public void elfoAtiraUmaFlecha(){
        //Arrange
        Elfo legolas = new Elfo("Elfo");
        //Act
        legolas.atirarFlecha(new Dwarf());
        //Assert
        assertEquals(41,legolas.getFlecha().getQuantidade());
        assertEquals(1,legolas.getExperiencia());
    }
    
    @Test
    public void elfoAtiraDuasFlechas(){
        //Arrange
        Elfo legolas = new Elfo("Elfo");
        //Act
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        //Assert
        assertEquals(40,legolas.getFlecha().getQuantidade());
        assertEquals(2,legolas.getExperiencia());
    }
    
    @Test
    public void elfoAtira42Flechas(){
        //Arrange
        Elfo legolas = new Elfo("Elfo");
        //Act       
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        //Assert
        assertEquals(0,legolas.getFlecha().getQuantidade());
        assertEquals(42,legolas.getExperiencia());
    }
    @Test
    public void elfoAtira43Flechas(){
        //Arrange
        Elfo legolas = new Elfo("Elfo");
        //Act       
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        //Assert
        assertEquals(0,legolas.getFlecha().getQuantidade());
        assertEquals(42,legolas.getExperiencia());
    }
    @Test
    public void elfoNaoAtiraFlecha(){
        //Arrange
        Elfo legolas = new Elfo("Elfo");
        //Act
        //Assert
        assertEquals(42,legolas.getFlecha().getQuantidade());
        assertEquals(0,legolas.getExperiencia());
    }
    
    @Test
    public void elfoAtiraFlechaDwarf(){
        //Arrange
        Elfo elfo = new Elfo("Elfo");
        Dwarf balin = new Dwarf();
        elfo.atirarFlecha(balin);
        assertEquals(100, balin.getVida());
    }
    
    @Test
    public void elfoAtiraDuasFlechaEmUmDwarf(){
        //Arrange
        Elfo elfo = new Elfo("Elfo");
        Dwarf balin = new Dwarf();
        elfo.atirarFlecha(balin);
        elfo.atirarFlecha(balin);
        assertEquals(90, balin.getVida());
    }
    
    @Test
    public void elfoAtiraUmaFlechaEmCadaDwarf(){
        //Arrange
        Elfo elfo = new Elfo("Elfo");
        Dwarf balin = new Dwarf();
        Dwarf dwarf = new Dwarf();
        elfo.atirarFlecha(balin);
        elfo.atirarFlecha(dwarf);
        assertEquals(100, balin.getVida());
        assertEquals(100, dwarf.getVida());
    }
    
    @Test
    public void elfoToString(){
        Elfo elfo = new Elfo("Legolas");
        assertEquals("Legolas possui 42 flechas e 0 níveis de experiencia.", elfo.toString());
    }
    
    @Test
    public void elfoToStringComInformacoesIniciais(){
        Elfo elfo = new Elfo("Legolas");
        assertEquals("Legolas possui 42 flechas e 0 níveis de experiencia.", elfo.toString());
    }
    @Test
    public void elfoAtiraFlechaEToString(){
        Elfo elfo = new Elfo("Legolas");
        elfo.atirarFlecha(new Dwarf());
        assertEquals("Legolas possui 41 flechas e 1 nível de experiencia.", elfo.toString());
    }
    
    @Test
    public void elfoAtiraDuasFlechasEToString(){
        Elfo elfo = new Elfo("Legolas");
        elfo.atirarFlecha(new Dwarf());
        elfo.atirarFlecha(new Dwarf());
        assertEquals("Legolas possui 40 flechas e 2 níveis de experiencia.", elfo.toString());
    }
    
    @Test
    public void elfoAtira41FlechasEToString(){
        Elfo legolas = new Elfo("Legolas");
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        assertEquals("Legolas possui 1 flecha e 41 níveis de experiencia.", legolas.toString());
    }
    
    @Test
    public void criarElfoInformandoFlechas(){
        Elfo elrond = new Elfo("Elrond", 56);
        assertEquals(56,elrond.getFlecha().getQuantidade());
    }
    
    @Test
    public void criarElfoInformandoFlechasNegativas(){
        Elfo elrond = new Elfo("Elrond", -56);
        assertEquals(42,elrond.getFlecha().getQuantidade());
    }
    
    @Test
    public void criarElfoInformandoFlechasZeradas(){
        Elfo elrond = new Elfo("Elrond", 0);
        assertEquals(0,elrond.getFlecha().getQuantidade());
    }
} 
