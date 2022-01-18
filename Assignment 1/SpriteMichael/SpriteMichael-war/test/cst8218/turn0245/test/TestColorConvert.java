/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cst8218.turn0245.test;

import cst8218.turn0245.view.ColorConvert;
import java.awt.Color;
import javax.faces.component.UIColumn;
import javax.faces.context.FacesContextWrapper;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Michael
 */
public class TestColorConvert {
    public TestColorConvert() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void testColorConvertObject() {
        ColorConvert converter = new ColorConvert();
        Color refColor = new Color(1, 2, 3);
        Color returnedColor = (Color) converter.getAsObject(new FacesContextWrapper() {}, new UIColumn(), "#010203");
         
        assertEquals(refColor, returnedColor);
    }
     
    @Test
    public void testColorConvertString() {
        ColorConvert converter = new ColorConvert();
        Color refColor = new Color(1, 2, 3);
        String stringColor;
        stringColor = converter.getAsString(new FacesContextWrapper() {}, new UIColumn(), refColor);
         
        assertEquals(stringColor, "#010203");
    }
}
