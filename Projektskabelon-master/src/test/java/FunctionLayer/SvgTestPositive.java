package FunctionLayer;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;


public class SvgTestPositive {

    Svg svg;

    // Arrange:
    @Before
    // Before = denne metode køres altid først. Her initialiserer vi forudsætningen/udgangspunktet for vores @Test
    public void setUp() {
        svg = new Svg(800, 600, "0,0,800,600", 0, 0);
    }


    // Act
    @Test
    // Forventer positiv test
    public void addRectPositive01() {
        svg.addRect(0, 0, 100, 100);
        String expectedRect = "<svg version=\"1.1\" xmlns=\"http://www.w3.org/2000/svg\" xmlns:xlink=\"http://www.w3.org/1999/xlink\" height=\"600\" width=\"800\" x=\"0\" y=\"0\" viewBox=\"0,0,800,600\" preserveAspectRatio=\"xMinYMin\">" +
                "<rect x=\"0\" y=\"0\" height=\"100\" width=\"100\" style=\"stroke:#000000; fill: #ffffff\" /></svg>";
        assertEquals(svg.toString(), expectedRect); // vi forventer en positiv test, da de to strings er ens, grundet de indtastede værdier i addRect()
    }

    // Act
    // Hamcrest testing method, da jeg slipper for at skrive headerTemplate for et Svg objekt i expected.
    @Test
    // Forventer positiv test
    public void addRectPositive02() {
        svg.addRect(0, 0, 100, 100);
        String expectedRect = "<rect x=\"0\" y=\"0\" height=\"100\" width=\"100\" style=\"stroke:#000000; fill: #ffffff\" /></svg>";
        assertThat(svg.toString(), containsString(expectedRect)); // her tjekker vi for om svg.toString(), indeholder vores expectedRect string.
        // assertThat metoden tager 2 parametre, den første er "actual value" og det andet er "matcher" objectet.
    }

    // Act
    // Hamcrest testing method, da jeg slipper for at skrive headerTemplate for et Svg objekt i expected.
    @Test
    // Forventer positiv test
    public void addDashLinePositive() {
        svg.addDashLine(5, 5, 15, 15);
        String expectedDashLine = "<line x1=\"5\" y1=\"5\" x2=\"15\" y2=\"15\" style=\"stroke:#000000; stroke-dasharray: 5 5;\"/>";
        assertThat(svg.toString(), containsString(expectedDashLine));
    }

    // Act
    // Hamcrest testing method, da jeg slipper for at skrive headerTemplate for et Svg objekt i expected.
    @Test
    // Forventer positiv test
    public void addLinePositive() {
        svg.addLine(15, 15, 35, 35);
        String expectedLine = "<line x1=\"15\" y1=\"15\" x2=\"35\" y2=\"35\" style=\"stroke:#000000;\"/>";
        assertThat(svg.toString(), containsString(expectedLine));
    }

    // Act
    // Hamcrest testing method, da jeg slipper for at skrive headerTemplate for et Svg objekt i expected.
    @Test
    // Forventer positiv test
    public void addSvgDrawing() {
        svg.addSvgDrawing(new Svg(800, 600, "0,0,800,600", 0, 0));
        String expectedSvgDrawing = "<svg version=\"1.1\" xmlns=\"http://www.w3.org/2000/svg\" xmlns:xlink=\"http://www.w3.org/1999/xlink\" height=\"600\" width=\"800\" x=\"0\" y=\"0\" viewBox=\"0,0,800,600\" preserveAspectRatio=\"xMinYMin\">";
        assertThat(svg.toString(), containsString(expectedSvgDrawing));
    }


}
