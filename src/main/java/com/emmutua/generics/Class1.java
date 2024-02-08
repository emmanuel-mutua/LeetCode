package com.emmutua.generics;


import java.security.interfaces.DSAKey;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Class1 {
    public static void main(String[] args) {
        PyramidBuilder<PyramidBase<Integer, Integer>, Integer> pyramidBuilder= new PyramidBuilder<>();
        Map<Integer, Integer> myMap= new HashMap<>();
    }
}

class PyramidBase<T,V> {
}
class PyramidBuilder<T, V>{

}