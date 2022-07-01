package com.gremlins.model;

import java.util.Objects;

public class Gremlin {

    private Integer gremlinId;
    private String name;
    private Integer age;
    private String color;
    private Boolean isEvil;

    public Gremlin(){};

    public Gremlin(String name, Integer age, String color, Boolean isEvil) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.isEvil = isEvil;
    };

    public Integer getGremlinId() {
        return gremlinId;
    };

    public Gremlin setGremlinId(Integer gremlinId) {
        this.gremlinId = gremlinId;
        return this;
    };

    public String getName() {
        return name;
    };

    public Gremlin setName(String name) {
        this.name = name;
        return this;
    };

    public Integer getAge() {
        return age;
    };

    public Gremlin setAge(Integer age) {
        this.age = age;
        return this;
    };

    public String getColor() {
        return color;
    };

    public Gremlin setColor(String color) {
        this.color = color;
        return this;
    };

    public Boolean getEvil() {
        return isEvil;
    };

    public Gremlin setEvil(Boolean evil) {
        isEvil = evil;
        return this;
    };

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Gremlin gremlin = (Gremlin) o;
        return Objects.equals(gremlinId, gremlin.gremlinId) && Objects.equals(name, gremlin.name) && Objects.equals(age, gremlin.age) && Objects.equals(color, gremlin.color) && Objects.equals(isEvil, gremlin.isEvil);
    };

    @Override
    public int hashCode() {
        return Objects.hash(gremlinId, name, age, color, isEvil);
    };

    @Override
    public String toString() {
        return "Gremlin{" +
                "gremlin_id=" + gremlinId +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", isEvil=" + isEvil +
                '}';
    };
};
