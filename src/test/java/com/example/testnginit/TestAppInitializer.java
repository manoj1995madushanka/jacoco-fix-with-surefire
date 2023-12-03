package com.example.testnginit;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Scan the components inorder to run tests
 */
@Configuration
@ComponentScan({"com.example.*"})
public class TestAppInitializer {
}
