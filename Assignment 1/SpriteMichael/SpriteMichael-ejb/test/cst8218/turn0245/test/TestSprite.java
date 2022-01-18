/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cst8218.turn0245.test;

import cst8218.turn0245.entity.Sprite;
import java.awt.Color;
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
public class TestSprite {
    
    public TestSprite() {
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
    public void testDefaultSpriteColor() {
        Sprite newSprite = new Sprite();
        Color spriteColor = newSprite.getColor();
        Color defaultColor = Color.BLUE;

        assertEquals(spriteColor, defaultColor);
    }
}
