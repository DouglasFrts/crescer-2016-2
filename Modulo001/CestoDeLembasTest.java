import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class CestoDeLembasTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class CestoDeLembasTest
{
    @Test
    public void dividirCestoComUmPao(){
        //Arrange
        CestoDeLembas cesto = new CestoDeLembas(1);
        //Act e Assert
        assertFalse(cesto.podeDividirEmPares());
    }
    
    @Test
    public void dividirCestoComDoisPaes(){
        //Arrange
        CestoDeLembas cesto = new CestoDeLembas(2);
        //Act e Assert
        assertFalse(cesto.podeDividirEmPares());
    }
    
    @Test
    public void dividirCestoComSeisPaes(){
        //Arrange
        CestoDeLembas cesto = new CestoDeLembas(6);
        //Act e Assert
        assertTrue(cesto.podeDividirEmPares());
    }
    
    @Test
    public void dividirCestoCom101Paes(){
        //Arrange
        CestoDeLembas cesto = new CestoDeLembas(101);
        //Act e Assert
        assertFalse(cesto.podeDividirEmPares());
    }
}
