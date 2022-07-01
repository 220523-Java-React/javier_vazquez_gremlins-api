package com.gremlins;

import io.javalin.Javalin;

public class Driver {
    public static void main(String[] args) {
        Javalin app = Javalin.create().start(8080);

        app.get("/", ctx -> {ctx.result("Welcome to the Gremlins API");});
    }
}
