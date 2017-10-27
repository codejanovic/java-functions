package io.github.codejanovic.functions.provide;

public interface ProvideFunction3<R, P1, P2, P3> {
    R instance(P1 param1, P2 param2, P3 param3);
}
