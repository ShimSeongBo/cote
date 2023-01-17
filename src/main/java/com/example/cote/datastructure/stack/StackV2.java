package com.example.cote.datastructure.stack;


import java.util.*;

public class StackV2 {

    // TODO: 저장 공간 (만 있어도 되나...?) 정모르겠으면 2)자바 Stack 들어가서 구경해보기 근데 진짜진짜 모르겠으면 그 때 3)수도(psuedo)코드 찾아보고 하기 (자바 코드로는 찾지 마셈 ㅋ)


    List stackV2SavingSystem = new LinkedList();

    public static void main(String[] args) {
        List stackV2SavingSystemInPSVM = new LinkedList();
        Stack stack = new Stack();

        stackV2SavingSystemInPSVM.add(1);
        stackV2SavingSystemInPSVM.add(2);
        stackV2SavingSystemInPSVM.add(3);

        stackV2SavingSystemInPSVM.set(0, 0);

        System.out.println(stackV2SavingSystemInPSVM.get(0));

    }

    public void push(int element) {
        // TODO: 먼저 들어온게 나중에 나가도록 넣는다.

        if (stackV2SavingSystem.isEmpty()) {
            stackV2SavingSystem.add(element);
        } else {
            stackV2SavingSystem.set(0, element);
        }
    }

    public int pop() {
        // TODO: 선입후출

        if ((int)stackV2SavingSystem.get(0) == 0) {
            throw new NoSuchElementException();
        }
        int pop = (int) stackV2SavingSystem.get(0);
        stackV2SavingSystem.remove(0);

        return pop;
    }

    public int size() {
        // TODO: Stack에 들어있는 element 수
        // -> size 메서드를 구현하는 것 이라면, 0번째부터 ~ 카운팅하여, 세는걸 구현하라는 건가..?

        int stackSize = 0;

//       while (stackV2SavingSystem.isEmpty()) {
//           stackSize++;
//       }

        return stackSize;
    }

    public int peek() {
        // TODO: 가장 나중에 삽입된 엘레멘트값 가져오기

        if ((stackV2SavingSystem.size() - 1) == -1) {
            throw new NoSuchElementException();
        }

        int stackLastNode = stackV2SavingSystem.size() - 1;

        return (int) stackV2SavingSystem.get(stackLastNode);
    }
}
