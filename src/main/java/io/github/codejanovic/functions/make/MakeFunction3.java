package io.github.codejanovic.functions.make;

public interface MakeFunction3<R, P1, P2, P3> {
    R newInstance(P1 param1, P2 param2, P3 param3);
}
