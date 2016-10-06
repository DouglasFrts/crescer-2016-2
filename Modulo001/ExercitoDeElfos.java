//Estudar em casa copiado da correção de exercicios
import java.util.ArrayList; 
 
public class ExercitoDeElfos { 
    private ArrayList<Elfo> contingente; 
 
    public ExercitoDeElfos() { 
        contingente = new ArrayList<>(); 
    } 
     
    public Elfo[] getContingente() { 
        return contingente.toArray(new Elfo[contingente.size()]); 
    } 
 
    public void alistar(Elfo elfo) { 
 
        //String nomeClasse = elfo.getClass().getName(); 
        //Class clazz = elfo.getClass(); 
        boolean podeAlistar =  
            //nomeClasse.equals("ElfoVerde") || nomeClasse.equals("ElfoNoturno"); 
            //clazz == ElfoVerde.class || clazz == ElfoNoturno.class; 
            elfo instanceof ElfoVerde || elfo instanceof ElfoNoturno; 
         
        if (podeAlistar) { 
            contingente.add(elfo); 
        } 
    } 
     
    /** 
     * Busca um elfo no contingente de acordo com seu nome 
     *  
     * @param String nome Nome do elfo a ser procurado. Ex: "Legolas" 
     * @return Elfo Objeto Elfo completo que foi encontrado. Caso não encontre, retorna nulo. Caso tenha conflito de nomes, retorna o primeiro. 
     */ 
    public Elfo buscar(String nome) { 
         
        // Java 8: contingente.filter(elfo -> nome.equals(elfo.getNome()))[0]; 
        // C# 3: contingente.FirstOrDefault(elfo => elfo.Nome == nome); 
        // ES 2015 / ES6: contingente.filter(elfo => nome == elfo.nome)[0]; 
        // JS 5: contingente.filter(function(elfo) { return elfo.nome == nome })[0]; 
        // Ruby: contingente.filter_by { |x| x.nome == nome } 
         
        for (Elfo elfo : contingente) { 
            if (nome.equals(elfo.getNome())) { 
                return elfo; 
            } 
        } 
        return null; 
    } 
}