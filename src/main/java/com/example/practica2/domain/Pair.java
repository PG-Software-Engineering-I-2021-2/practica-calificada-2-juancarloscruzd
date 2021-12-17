package com.example.practica2.domain;

public final class Pair<F, S> {
    private final F first;
    private final S second;

    public Pair(F first, S second) {
        this.first  = first;
        this.second = second;
    }

    public F first() {
        return first;
    }

    public S second() {
        return second;
    }
}
