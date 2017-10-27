package io.github.codejanovic.functions.make;

public interface MakeFunction4<R, P1, P2, P3, P4> {
    R newInstance(P1 param1, P2 param2, P3 param3, P4 param4);
}
