package com.example.testnginit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.support.AnnotationConfigContextLoader;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;

/**
 * This is the base class for testing to load configurations
 */
@ContextConfiguration(classes = {TestAppInitializer.class}, loader = AnnotationConfigContextLoader.class)
public class BaseManagerTest extends AbstractTestNGSpringContextTests {

    public static final Logger LOGGER = LoggerFactory.getLogger(BaseManagerTest.class);

}
