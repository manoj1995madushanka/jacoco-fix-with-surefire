package com.example.testnginit;

import org.springframework.stereotype.Component;

@Component
public class Addition {

    public int add(int x, int y){
        return x+y;
    }
}
