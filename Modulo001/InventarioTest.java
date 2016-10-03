import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class InventarioTest
{
    @Test
    public void adicionarItemNoInventário(){
        Inventario inventario = new Inventario();
        inventario.adicionarItem(new Item("Espada Z",1));
        Item itemObtido = inventario.getItens().get(0);
        //assertEquals("Espada Z",itemObtido.getDescricao());
        //assertEquals(1, itemObtido.getQuantidade());
        assertTrue(inventario.getItens().contains(itemObtido));
    }
    
    @Test
    public void getDescricoesItensComVariosItens(){
        Inventario inventario = new Inventario();
        inventario.adicionarItem(new Item("Adaga",14));
        inventario.adicionarItem(new Item("Escudo",2));
        inventario.adicionarItem(new Item("Bracelete",56));
        assertEquals("Adaga,Escudo,Bracelete",inventario.getDescricoesItens());
    }
    
    @Test
    public void getDescricoesItensComUmItem(){
        Inventario inventario = new Inventario();
        inventario.adicionarItem(new Item("Adaga",14));
        assertEquals("Adaga",inventario.getDescricoesItens());
    }
    
    @Test
    public void getDescricoesItensSemItem(){
        Inventario inventario = new Inventario();
        assertEquals("",inventario.getDescricoesItens());
    }
    
    @Test 
    public void aumentar1000UnidadesDosItens() { 
        Inventario inventario = criarInventarioCom3Itens(); 
        inventario.aumentarUnidadesDosItens(1000); 
        assertEquals(1002, inventario.getItens().get(0).getQuantidade()); 
        assertEquals(1045, inventario.getItens().get(1).getQuantidade()); 
        assertEquals(1003, inventario.getItens().get(2).getQuantidade()); 
    } 
     
    @Test 
    public void aumentar1UnidadeDosItens() { 
        Inventario inventario = criarInventarioCom3Itens(); 
        inventario.aumentarUnidadesDosItens(1); 
        assertEquals(3, inventario.getItens().get(0).getQuantidade()); 
        assertEquals(46, inventario.getItens().get(1).getQuantidade()); 
        assertEquals(4, inventario.getItens().get(2).getQuantidade()); 
    } 
     
    @Test 
    public void aumentar0UnidadeDosItens() { 
        Inventario inventario = criarInventarioCom3Itens(); 
        inventario.aumentarUnidadesDosItens(0); 
        assertEquals(2, inventario.getItens().get(0).getQuantidade()); 
        assertEquals(45, inventario.getItens().get(1).getQuantidade()); 
        assertEquals(3, inventario.getItens().get(2).getQuantidade()); 
    } 
     
    @Test 
    public void aumentarUnidadeSemItens() { 
        Inventario inventario = new Inventario(); 
        inventario.aumentarUnidadesDosItens(1000); 
        assertEquals(0, inventario.getItens().size()); 
    } 
 
    
    @Test 
    public void itemComMaiorQuantidadeCom3Itens() { 
        Inventario inventario = criarInventarioCom3Itens(); 
        Item item = inventario.getItemComMaiorQuantidade(); 
        assertEquals("Poção polissuco", item.getDescricao()); 
        assertEquals(45, item.getQuantidade()); 
    } 
     
    @Test 
    public void itemComMaiorQuantidadeCom3ItensDeQuantidadesIguais() { 
        Inventario inventario = new Inventario(); 
        inventario.adicionarItem(new Item("Espada de aço", 2)); 
        inventario.adicionarItem(new Item("Poção polissuco", 2)); 
        inventario.adicionarItem(new Item("Lucky egg", 2)); 
        Item item = inventario.getItemComMaiorQuantidade(); 
        assertEquals("Espada de aço", item.getDescricao()); 
        assertEquals(2, item.getQuantidade()); 
    } 
     
    @Test 
    public void itemComMaiorQuantidadeComInventarioVazio() { 
        Inventario inventario = new Inventario(); 
        Item item = inventario.getItemComMaiorQuantidade(); 
        assertNull(item); 
    
    }
    
    @Test 
    public void OrdenarInventarioPorQuantidade() { 
        Inventario inventario = criarInventarioCom3Itens(); 
        inventario.ordenarItens();
        assertEquals(2, inventario.getItens().get(0).getQuantidade()); 
        assertEquals(3, inventario.getItens().get(1).getQuantidade()); 
        assertEquals(45, inventario.getItens().get(2).getQuantidade());
    }
    
    @Test 
    public void aumentarUnidadesProporcionalComInventarioVazio() { 
        Inventario inventario = new Inventario(); 
        inventario.aumentarUnidadesProporcionalQuantidadePorItem(); 
        assertTrue(inventario.getItens().isEmpty()); 
    } 
 
    @Test 
    public void aumentarUnidadesProporcionalComApenasUmItem() { 
        Inventario inventario = new Inventario(); 
        inventario.adicionarItem(new Item("Espada", 1)); 
        inventario.aumentarUnidadesProporcionalQuantidadePorItem(); 
        assertEquals(1001, inventario.getItens().get(0).getQuantidade()); 
    } 
 
    @Test 
    public void aumentarUnidadesProporcionalComApenasDoisItens() { 
        Inventario inventario = new Inventario(); 
        inventario.adicionarItem(new Item("Balas .44", 2)); 
        inventario.adicionarItem(new Item("Balas .12", 3)); 
        inventario.aumentarUnidadesProporcionalQuantidadePorItem(); 
        assertEquals(3002, inventario.getItens().get(0).getQuantidade()); 
        assertEquals(6003, inventario.getItens().get(1).getQuantidade()); 
    }
    
    private Inventario criarInventarioCom3Itens() { 
        Inventario inventario = new Inventario(); 
        inventario.adicionarItem(new Item("Espada de aço", 2)); 
        inventario.adicionarItem(new Item("Poção polissuco", 45)); 
        inventario.adicionarItem(new Item("Lucky egg", 3)); 
        return inventario; 
    }    
}
