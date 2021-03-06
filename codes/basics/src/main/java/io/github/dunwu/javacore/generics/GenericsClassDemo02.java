package io.github.dunwu.javacore.generics;

import io.github.dunwu.javacore.generics.entity.MyMap;

/**
 * @author Zhang Peng
 * @date 2019-03-20
 */
public class GenericsClassDemo02 {
    public static void main(String[] args) {
        MyMap<Integer, String> map = new MyMap<>(1, "one");
        System.out.println(map);
    }
}
// Output:
// MyMap{key=1, value=one}
