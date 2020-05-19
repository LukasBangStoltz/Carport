package MyUtils;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalcTestNegative {

    //Arrange
    int stolper = 0;
    int spær = 0;

    //Act
    //Forventer negativ test
    @Test
    public void stloperWithoutToolshed() {
        stolper = Calc.calcStolper(690, 0, false);
        //Sætter et forkert expected så vi kan se om metoden fejler når den skal
        int expectedStolper = 1;
        //Sammenligner metodens return og expected for at få et resultat
        assertEquals(stolper, expectedStolper); //
    }

    //Act
    //Forventer negative test
    @Test
    public void stolperWithToolshed() {
        stolper = Calc.calcStolper(690, 150, true);
        //Sætter et forkert expected så vi kan se om metoden fejler når den skal
        int expectedStolper = 20;
        //Sammenligner metodens return og expected for at få et resultat
        assertEquals(stolper, expectedStolper);
    }

    //Act
    //Forventer negative test
    @Test
    public void spærTilRem(){
        spær = Calc.spærTilRem(690, 750);
        //Sætter et forkert expected så vi kan se om metoden fejler når den skal
        int expectedSpær = 15;
        //Sammenligner metodens return og expected for at få et resultat
        assertEquals(spær,expectedSpær);
    }

}
