package com.gremlins.controller;

import com.gremlins.model.Gremlin;
import com.gremlins.service.GremlinService;
import io.javalin.http.Handler;

public class GremlinController {

    GremlinService gremlinService;

    public GremlinController() {
        gremlinService = new GremlinService();
    };

    public Handler getAllGremlins = ctx -> {

        ctx.json(gremlinService.getAllGremlins());
    };

    public Handler createNewGremlin = ctx -> {

        Gremlin gremlin = ctx.bodyAsClass(Gremlin.class);

        boolean gremlinCreated = gremlinService.createNewGremlin(gremlin);

        if (gremlinCreated) {
            ctx.result("Gremlin created. Yay!!!").status(201);
        }
        else {
            ctx.result("Error: Gremlin not created").status(400);
        }
    };
};
