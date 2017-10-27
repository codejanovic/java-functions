package io.github.codejanovic.functions.provide;

public interface ProvideFunction2<R, P1, P2> {
    R instance(P1 param1, P2 param2);
}
