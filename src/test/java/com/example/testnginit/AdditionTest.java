package com.example.testnginit;


//import mockit.Capturing;
import org.springframework.beans.factory.annotation.Autowired;

import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertNotNull;

public class AdditionTest extends BaseManagerTest {

    @Autowired
    private  Addition addition;

   /* @Capturing
    private AddService addService;*/


    @Test
    public void testAddition(){
        assertEquals(5,addition.add(3,2));
    }



}