package com.mitusov.graph;

import java.util.Objects;

public class Vertex {
    private String name;
    private String id;

    public Vertex(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vertex vertex = (Vertex) o;
        return name.equals(vertex.name) &&
                id.equals(vertex.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }

    @Override
    public String toString() {
        return "Vertex{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
