package com._abstract;

public class Person extends Human{

    //구현메서드로 만들어주면 된다
    @Override
    public void hunt() {
        System.out.println("총으로 동물 사냥");
    }

}
