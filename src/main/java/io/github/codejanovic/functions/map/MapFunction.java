package io.github.codejanovic.functions.map;

public interface MapFunction<From, To> {
    To map(From from);
}
