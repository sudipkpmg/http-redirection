package com.sudip;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.annotations.QuarkusMain;

// useful entry point to have for testing in IDE

@QuarkusMain
public class Main {

    public static void main(String ... args) {
        Quarkus.run(args);
    }

}