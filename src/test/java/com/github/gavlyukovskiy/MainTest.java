package com.github.gavlyukovskiy;

class MainTest {
    public static void main(String[] args) {
        // error: [NullAway] returning @Nullable expression from method with @NonNull return type
        Main.withFunction(x -> null);
    }
}