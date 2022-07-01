package com.gremlins.service;

import com.gremlins.model.Gremlin;
import com.gremlins.repository.GremlinRepository;

import java.util.List;

public class GremlinService {

    GremlinRepository gremlinRepository;

    public GremlinService() {
        gremlinRepository = new GremlinRepository();
    };

    public List<Gremlin> getAllGremlins() {
        return gremlinRepository.getAll();
    };

    public boolean createNewGremlin(Gremlin gremlin) {
        return gremlinRepository.create(gremlin);
    };
};
