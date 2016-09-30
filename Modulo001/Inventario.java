import java.util.ArrayList;

public class Inventario
{
  ArrayList <Item> itens = new ArrayList<>();
  
  public void adicionarItem(Item item)
  {
      itens.add(item);
  }
  
  public void removerItem(Item item)
  {
    itens.remove(item);
  }
  
  public ArrayList<Item> getItens(){
      return itens;
  }
  
  public String getDescricoesItens(){
      //"Adaga, escudo, bracelete."
      String resultado = "";
      
      /*for(int i = 0; i<itens.size(); i++){
          
          Item itemAtual = itens.get(i);
          resultado += itemAtual.getDescricao()+ ",";
      }*/
      for(Item itemAtual : itens){
          resultado += itemAtual.getDescricao()+ ",";
      }
      
      return resultado.isEmpty() ? "" :resultado.substring(0,resultado.length()-1);
  }
  
  public void aumentarUnidadesDosItens(int unidades){
      for(Item item : itens){
          
          item.aumentarUnidades(unidades);
        
        }
  }
  
  public Item getItemComMaiorQuantidade() { 
        // maiorAteAgora = 0 
        // percorro todos os itens verificando se existe alguém maior que o até agora 
        // caso existir, atualiza a variável 
        // retorna no final 
        int indice = 0, maiorQtdAteAgora = 0; 
         
        for (int i = 0; i < itens.size(); i++) { 
            int qtdAtual = itens.get(i).getQuantidade(); 
            if (qtdAtual > maiorQtdAteAgora) { 
                maiorQtdAteAgora = qtdAtual; 
                indice = i; 
            } 
        } 
         
        boolean temItens = !itens.isEmpty(); 
        return temItens ? itens.get(indice) : null; 
    } 
  
  
}
