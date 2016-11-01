public class CestoDeLembas
{
    private int numeroPaes;
    
    public CestoDeLembas(int numeroPaes){
        this.numeroPaes=numeroPaes;
    }
    
    public boolean podeDividirEmPares(){
        return numeroPaes>2 && numeroPaes %2 == 0 && numeroPaes <=100;
        
       /* boolean maiorQueDois  = false;
        if(this.numeroPaes>2)
            maiorQueDois = true;
            
        if(maiorQueDois){
            boolean ehPar = this.numeroPaes %2==0;
            if(ehPar){
                   if(this.numeroPaes <=100)
                        return true;
            }
           
        }
        
        return false;*/
        
    }
}
