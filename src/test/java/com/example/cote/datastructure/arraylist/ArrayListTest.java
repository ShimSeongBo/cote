package com.example.cote.datastructure.arraylist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayListTest {

    @Test
    void case1() {
        ArrayList arrayList = new ArrayList();

        arrayList.addLast(10);
        System.out.println(arrayList);

    }
}