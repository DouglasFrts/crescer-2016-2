

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;


public class DwarfTest
{
    @Test
    public void dwarfNasceVivo(){
        Dwarf gimli = new Dwarf();
        assertEquals(Status.VIVO, gimli.getStatus());
    }
    
    @Test
    public void dwarfPerdeVidaUmaVez(){
        Dwarf gimli = new Dwarf();
        gimli.perderVida();
        assertEquals(100, gimli.getVida());
    }
    
    @Test
    public void dwarfPerdeVidaDuasVezes(){
        Dwarf gimli = new Dwarf();
        gimli.perderVida();
        gimli.perderVida();
        assertEquals(90, gimli.getVida());
    }
    
    @Test
    public void dwarfPerdeVidaVinteVezes(){
        Dwarf gimli = new Dwarf();
        gimli.perderVida();
        gimli.perderVida();
        gimli.perderVida();
        gimli.perderVida();
        gimli.perderVida();
        gimli.perderVida();
        gimli.perderVida();
        gimli.perderVida();
        gimli.perderVida();
        gimli.perderVida();
        gimli.perderVida();
        gimli.perderVida();
        gimli.perderVida();
        gimli.perderVida();
        gimli.perderVida();
        gimli.perderVida();
        gimli.perderVida();
        gimli.perderVida();
        gimli.perderVida();
        gimli.perderVida();
        assertEquals(0, gimli.getVida());
    }
    
    @Test 
    public void dwarfCriadoInformandoNomeENascimento() { 
        Dwarf gimli = new Dwarf("Gimli", new DataTerceiraEra(12, 11, 1900)); 
        assertEquals("Gimli", gimli.getNome()); 
        assertEquals(12, gimli.getDataNascimento().getDia()); 
        assertEquals(11, gimli.getDataNascimento().getMes()); 
        assertEquals(1900, gimli.getDataNascimento().getAno()); 
    } 
     
    @Test 
    public void dwarfCriadoSemInformarNomeENascimento() { 
        Dwarf gimli = new Dwarf(); 
        assertNull(gimli.getNome()); 
        assertEquals(1, gimli.getDataNascimento().getDia()); 
        assertEquals(1, gimli.getDataNascimento().getMes()); 
        assertEquals(1, gimli.getDataNascimento().getAno()); 
    }
    
    @Test 
    public void gerarNumeroAnoBissextoVidaEntre80e90() { 
        // Arrange 
        Dwarf bernardin = new Dwarf("Bernardin", new DataTerceiraEra(01, 01, 2016)); 
        bernardin.perderVida(); 
        bernardin.perderVida(); 
        bernardin.perderVida(); 
        // Act 
        double resultado = bernardin.getNumeroSorte(); 
        // Assert 
        assertEquals(-3333.0, resultado, .0); 
    } 
 
    @Test 
    public void gerarNumeroAnoNaoBissextoNomeSeixas() { 
        // Arrange 
        Dwarf seixas = new Dwarf("Seixas", new DataTerceiraEra(01, 01, 2015)); 
        // Act 
        double resultado = seixas.getNumeroSorte(); 
        // Assert 
        assertEquals(33.0, resultado, .0); 
    } 
 
    @Test 
    public void gerarNumeroAnoNaoBissextoNomeMeireles() { 
        // Arrange 
        Dwarf seixas = new Dwarf("Meireles", new DataTerceiraEra(01, 01, 2015)); 
        // Act 
        double resultado = seixas.getNumeroSorte(); 
        // Assert 
        assertEquals(33.0, resultado, .0); 
    } 
 
    @Test 
    public void gerarNumeroSemEntrarNasCondicoes() { 
        // Arrange 
        Dwarf balin = new Dwarf("Balin", new DataTerceiraEra(1, 1, 2015)); 
        // Act 
        double resultado = balin.getNumeroSorte(); 
        // Assert 
        assertEquals(101.0, resultado, .0);
    }
    
    @Test
    public void ZerarVidaEMudarStatus(){
        Dwarf balin = new Dwarf("Balin", new DataTerceiraEra(1, 1, 2015));
        balin.perderVida();
        balin.perderVida();
        balin.perderVida();
        balin.perderVida();
        balin.perderVida();
        balin.perderVida();
        balin.perderVida();
        balin.perderVida();
        balin.perderVida();
        balin.perderVida();
        balin.perderVida();
        balin.perderVida();
        assertEquals(0,(balin.getVida()));
        assertEquals(Status.MORTO,(balin.getStatus()));
        
    
   }
   @Test
    public void adicionarItemNoInventário(){
        Dwarf dwarf = new Dwarf();
        dwarf.adicionarItem(new Item("Espada Z",1));
        Item itemObtido = dwarf.getInventario().getItens().get(0);
        //assertEquals("Espada Z",itemObtido.getDescricao());
        //assertEquals(1, itemObtido.getQuantidade());
        assertTrue(dwarf.getInventario().getItens().contains(itemObtido));
    }
    
    @Test 
    public void adicionarItemNoInventario() { 
        Dwarf dwarf = new Dwarf(); 
        Item espadaZ = new Item("Espada Z", 1); 
        dwarf.adicionarItem(espadaZ); 
        assertTrue(dwarf.getInventario().getItens().contains(espadaZ)); 
    } 
 
    @Test 
    public void inventarioSemAdicionarItem() { 
        Dwarf dwarf = new Dwarf(); 
        Item espadaZ = new Item("Espada Z", 1); 
        assertFalse(dwarf.getInventario().getItens().contains(espadaZ)); 
    } 
 
    @Test 
    public void adicionarDoisItensNoInventario() { 
        Dwarf dwarf = new Dwarf(); 
        Item espadaZ = new Item("Espada Z", 1); 
        Item botasDeFerro = new Item("Iron Boots", 1); 
        dwarf.adicionarItem(espadaZ); 
        dwarf.adicionarItem(botasDeFerro); 
        assertTrue(dwarf.getInventario().getItens().contains(espadaZ)); 
        assertTrue(dwarf.getInventario().getItens().contains(botasDeFerro)); 
    } 
 
    @Test 
    public void adicionarCincoItensNoInventario() { 
        Dwarf dwarf = new Dwarf(); 
        Item espadaZ = new Item("Espada Z", 1); 
        Item botasDeFerro = new Item("Iron Boots", 1); 
        dwarf.adicionarItem(espadaZ); 
        dwarf.adicionarItem(botasDeFerro); 
        dwarf.adicionarItem(botasDeFerro); 
        dwarf.adicionarItem(botasDeFerro); 
        dwarf.adicionarItem(botasDeFerro); 
        assertTrue(dwarf.getInventario().getItens().contains(espadaZ)); 
        assertTrue(dwarf.getInventario().getItens().contains(botasDeFerro)); 
        assertEquals(5, dwarf.getInventario().getItens().size()); 
    } 
 
    @Test 
    public void adicionarItemNoInventarioEDepoisRemovelo() { 
        Dwarf dwarf = new Dwarf(); 
        Item espadaZ = new Item("Espada Z", 1); 
        dwarf.adicionarItem(espadaZ); 
        dwarf.perderItem(espadaZ); 
        assertFalse(dwarf.getInventario().getItens().contains(espadaZ)); 
    } 
 
    @Test 
    public void adicionarDoisItensNoInventarioERemoverApenasUm() { 
        Dwarf dwarf = new Dwarf(); 
        Item espadaZ = new Item("Espada Z", 1); 
        Item bastaoMagico = new Item("Bastão Mágico", 1); 
        dwarf.adicionarItem(espadaZ); 
        dwarf.adicionarItem(bastaoMagico); 
        dwarf.perderItem(espadaZ); 
        assertFalse(dwarf.getInventario().getItens().contains(espadaZ)); 
        assertTrue(dwarf.getInventario().getItens().contains(bastaoMagico)); 
    } 
 
    @Test 
    public void removerItemSemAdicionaloAntes() { 
        Dwarf dwarf = new Dwarf(); 
        Item espadaZ = new Item("Espada Z", 1); 
        dwarf.perderItem(espadaZ); 
        assertFalse(dwarf.getInventario().getItens().contains(espadaZ)); 
    }
    
    @Test 
    public void aumentar1000Unidades3Itens() { 
        Dwarf dwarf = new Dwarf("Sortudo", new DataTerceiraEra(1, 1, 2016)); 
        dwarf.perderVida(); 
        dwarf.perderVida(); 
        dwarf.perderVida(); 
        dwarf.adicionarItem(new Item("Espada de aço", 2)); 
        dwarf.adicionarItem(new Item("Poção polissuco", 45)); 
        dwarf.adicionarItem(new Item("Lucky egg", 3)); 
        dwarf.tentarSorte(); 
        ArrayList<Item> itens = dwarf.getInventario().getItens(); 
        assertEquals(1002, itens.get(0).getQuantidade()); 
        assertEquals(1045, itens.get(1).getQuantidade()); 
        assertEquals(1003, itens.get(2).getQuantidade()); 
    }
}

