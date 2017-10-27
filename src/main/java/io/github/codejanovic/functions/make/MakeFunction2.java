package io.github.codejanovic.functions.make;

public interface MakeFunction2<R, P1, P2> {
    R newInstance(P1 param1, P2 param2);
}
