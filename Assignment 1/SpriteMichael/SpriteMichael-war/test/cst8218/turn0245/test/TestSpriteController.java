/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cst8218.turn0245.test;

import cst8218.turn0245.entity.Sprite;
import cst8218.turn0245.view.SpriteController;
import cst8218.turn0245.view.SpriteController.SpriteControllerConverter;
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
public class TestSpriteController {
    public TestSpriteController() {
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
    public void testGetSelected() {
        SpriteController spriteControl = new SpriteController();
        Sprite newSprite = new Sprite();
        Sprite currentSprite = spriteControl.getSelected();
        
        assertEquals(newSprite, currentSprite);
    }
    
    @Test
    public void testPrepareCreate() {
        SpriteController spriteControl = new SpriteController();
        String expectedPage = "Create";
        String actualPage = spriteControl.prepareCreate();
        
        assertEquals(expectedPage, actualPage);
    }
}
