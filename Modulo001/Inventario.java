import java.util.ArrayList;

public class Inventario
{
  ArrayList <Item> mochila = new ArrayList<>();
  
  public void adicionarItem(Item item)
  {
      mochila.add(item);
  }
  
  public void removerItem(Item item)
  {
    mochila.remove(item);
  }
}
