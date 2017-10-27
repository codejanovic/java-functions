package io.github.codejanovic.functions.map;

public interface MapFunction2<From1, From2, To> {
    To map(From1 from1, From2 from2);
}
