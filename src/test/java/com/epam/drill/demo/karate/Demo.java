package com.epam.drill.demo.karate;

import com.intuit.karate.junit5.Karate;

public class Demo {

    @Karate.Test
    public Karate pathTest() {
        return Karate.run().relativeTo(getClass());
    }

}
