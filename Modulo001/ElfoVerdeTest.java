import static org.junit.Assert.*; 
import org.junit.After; 
import org.junit.Before; 
import org.junit.Test; 
 
public class ElfoVerdeTest 
{ 
     
    @Test
    public void ElfoVerdeAtiraUmaFlecha(){
        //Arrange
        ElfoVerde legolas = new ElfoVerde("ElfoVerde");
        //Act
        legolas.atirarFlecha(new Dwarf());
        //Assert
        assertEquals(41,legolas.getFlecha().getQuantidade());
        assertEquals(2,legolas.getExperiencia());
    }
    
    @Test
    public void ElfoVerdeAtiraDuasFlechas(){
        //Arrange
        ElfoVerde legolas = new ElfoVerde("ElfoVerde");
        //Act
        for(int i = 0;i < 2;i++)
        legolas.atirarFlecha(new Dwarf());
        //legolas.atirarFlecha(new Dwarf());
        //Assert
        assertEquals(40,legolas.getFlecha().getQuantidade());
        assertEquals(4,legolas.getExperiencia());
    }
    
    @Test
    public void ElfoVerdeAtira42Flechas(){
        //Arrange
        ElfoVerde legolas = new ElfoVerde("ElfoVerde");
        //Act
        for(int i = 0;i<42;i++)
            legolas.atirarFlecha(new Dwarf());
        
        //Assert
        assertEquals(0,legolas.getFlecha().getQuantidade());
        assertEquals(84,legolas.getExperiencia());
    }
    
    @Test
    public void ElfoVerdeNaoAtiraFlecha(){
        //Arrange
        ElfoVerde legolas = new ElfoVerde("ElfoVerde");
        //Act
        //Assert
        assertEquals(42,legolas.getFlecha().getQuantidade());
        assertEquals(0,legolas.getExperiencia());
    }
    
    
    
    
    
    @Test
    public void ElfoVerdeAtiraDuasFlechasEToString(){
        ElfoVerde ElfoVerde = new ElfoVerde("Legolas");
        ElfoVerde.atirarFlecha(new Dwarf());
        ElfoVerde.atirarFlecha(new Dwarf());
        assertEquals("Legolas possui 40 flechas e 4 níveis de experiencia.", ElfoVerde.toString());
    }
    
    @Test
    public void ElfoVerdeAtira41FlechasEToString(){
        ElfoVerde legolas = new ElfoVerde("Legolas");
        for(int i = 0;i<41;i++)
            legolas.atirarFlecha(new Dwarf());
        
        assertEquals("Legolas possui 1 flecha e 82 níveis de experiencia.", legolas.toString());
    }
    
    @Test 
    public void elfoVerdeAdicionaEspadaValiriana() { 
        ElfoVerde sortudo = new ElfoVerde("Sortudo"); 
        Item espada = new Item("Espada de aço valiriano", 1); 
        sortudo.adicionarItem(espada); 
        assertEquals(3, sortudo.getInventario().getItens().size()); 
        assertEquals(espada, sortudo.getInventario().getItens().get(2)); 
    } 
 
    @Test 
    public void elfoVerdeAdicionaItemComDescricaoInvalida() { 
        ElfoVerde sortudo = new ElfoVerde("Mugless"); 
        sortudo.adicionarItem(new Item("Caneca", 1)); 
        assertEquals(2, sortudo.getInventario().getItens().size()); 
    } 
 
    @Test 
    public void elfoVerdeAdicionaArcoEFlechaVidroENulo() { 
        ElfoVerde sortudo = new ElfoVerde("Celeborn"); 
        Item arcoEFlecha = new Item("Arco e Flecha de Vidro", 1); 
        sortudo.adicionarItem(arcoEFlecha); 
        sortudo.adicionarItem(null); 
        assertEquals(3, sortudo.getInventario().getItens().size()); 
        assertEquals(arcoEFlecha, sortudo.getInventario().getItens().get(2)); 
    } 
 
    @Test 
    public void elfoVerdeAdicionaArcoEFlechaVidroEDescricaoNula() { 
        ElfoVerde sortudo = new ElfoVerde("Celeborn"); 
        Item arcoEFlecha = new Item("Arco e Flecha de Vidro", 1); 
        Item descricaoNula = new Item(null, 1); 
        sortudo.adicionarItem(arcoEFlecha); 
        sortudo.adicionarItem(descricaoNula); 
        assertEquals(3, sortudo.getInventario().getItens().size()); 
        assertEquals(arcoEFlecha, sortudo.getInventario().getItens().get(2)); 
    }
    
  
} 
