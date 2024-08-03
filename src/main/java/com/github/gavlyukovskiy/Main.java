package com.github.gavlyukovskiy;

import org.jspecify.annotations.Nullable;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        // ok
        withFunction(x -> null);
    }

    public static void withFunction(Function<String, @Nullable String> f) {}
}