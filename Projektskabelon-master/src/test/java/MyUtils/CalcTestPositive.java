package MyUtils;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalcTestPositive {

    //Arrange
    int stolper = 0;
    int spær = 0;

    //Act
    @Test
    //Forventer positive test
    public void stolperWithoutToolshed() {
        stolper = Calc.calcStolper(690, 0, false);
        //Sætter et korrekt expected så vi kan se om metoden kører som den skal
        int expectedStolper = 4;
        //Sammenligner metodens return og expected for at få et resultat
        assertEquals(stolper, expectedStolper);
    }

    //Act
    //Forventer positive test
    @Test
    public void stolperWithToolshed() {
        stolper = Calc.calcStolper(690, 150, true);
        //Sætter et korrekt expected så vi kan se om metoden kører som den skal
        int expectedStolper = 8;
        //Sammenligner metodens return og expected for at få et resultat
        assertEquals(stolper, expectedStolper);
    }

    //Act
    //Forventer positive test
    @Test
    public void spærTilRem(){
        spær = Calc.spærTilRem(690, 750);
        //Sætter et korrekt expected så vi kan se om metoden kører som den skal
        int expectedSpær = 13;
        //Sammenligner metodens return og expected for at få et resultat
        assertEquals(spær,expectedSpær);
    }

}
