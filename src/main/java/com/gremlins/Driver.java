package com.gremlins;

import com.gremlins.controller.GremlinController;
import io.javalin.Javalin;

public class Driver {
    public static void main(String[] args) {
        Javalin app = Javalin.create().start(8080);

        GremlinController gremlinController = new GremlinController();

        app.get("/", ctx -> {ctx.result("Welcome to the Gremlins API");});

        app.get("/gremlin", gremlinController.getAllGremlins);
        app.post("/gremlin", gremlinController.createNewGremlin);
    };
};
