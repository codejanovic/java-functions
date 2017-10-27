package io.github.codejanovic.functions.map;

public interface MapFunction3<From1, From2, From3, To> {
    To map(From1 from1, From2 from2, From3 from3);
}
