public class Item {
    private String descricao;
    private int quantidade;
    
    public Item(String descricao, int quantidade) {
        this.descricao = descricao;
        this.quantidade = quantidade;
    }
    
    public void setQuantidade(int novaQuantidade) {
        quantidade = novaQuantidade;
    }
    
    public int getQuantidade() {
        return quantidade;
    }
    public String getDescricao(){
        return descricao;
    }
    
    public void aumentarUnidades(int unidades) {
        quantidade += unidades;
    }
    
    public void aumentarProporcionalQuantidade(){
        
        int quantidadeAbsoluta = Math.abs(this.quantidade);
        int resultado = quantidadeAbsoluta * (quantidadeAbsoluta+1)/2;
        this.quantidade += (resultado * 1000); 
    }
    
    @Override 
    public boolean equals(Object obj) { 
        Item outro = (Item)obj; 
        return 
            this.descricao.equals(outro.descricao) && 
            this.quantidade == outro.quantidade; 
    } 
    
}







