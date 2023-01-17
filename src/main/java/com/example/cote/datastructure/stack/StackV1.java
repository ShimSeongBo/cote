package com.example.cote.datastructure.stack;

import java.util.ArrayList;
import java.util.List;

public class StackV1 {

    /**
     * @param element
     * 1. 스택이라는 저장 공간을 만든다.
     * 2. 저장 공간이 채워지면 저장 공간을 늘린다.
     * 3. 어떻게 늘릴까? Default 10 -> 20 (+10) 해준다.
     * 4. 기존 저장 공간의 데이터를 새로운 저장 공간으로 옮긴다.
     * 5. 기존 저장 공간을 삭제한다.
     */
    // TODO: 저장 공간 (만 있어도 되나...? -> 무슨 의미일까? 일단 저장 공간과 추가적으로(?) ) 정모르겠으면 자바 Stack 들어가서 구경해보기 근데 진짜진짜 모르겠으면 그 때 수도(psuedo)코드 찾아보고 하기 (자바 코드로는 찾지 마셈 ㅋ)

    List<Integer> stackSavingSystem = new ArrayList<>(); // List 변수명에 list , List 이런식으로 들어가면 좋지 않다고 본 기억이..ㅎ 근데 뭐라고 지어야 잘 지었다고 소문이날까 ㅎ ESG 생각나서 만들어버림..!
    // 분명히 상웅이는 why? ArrayList 사용했는지 물어보겠지? 일단 내가 아는건 Array/LinkedList 인데, 선형 비선형? ArrayList는 연결되어있고 , LinkedList는 그럴수도 아닐수도 두가지 방향일수도 수정/삭제 용이함.

    public void push(int element) {
        // TODO: 먼저 들어온게 나중에 나가도록 넣는다.
        // 요구사항을 지키려면 1)순차적으로 쌓이고 뒤에 부터 빠져나가게 하거나, 2)앞의 순서로 붙여넣어야하는데..? 그럴려면 LinkedList로 앞에 노드를 붙여서 쌓아야함.

        stackSavingSystem.add(element);

    }

    public int pop() {
        // TODO: 선입후출 -> 순차적으로 쌓이고, 마지막부터 가져오면 됨.

        return stackSavingSystem.remove(stackSavingSystem.size() - 1);
    }

    public int size() {
        // TODO: Stack에 들어있는 element 수
        // element의 수를 구하는것이므로, 사이즈로 가져왔음. 근데 메서드를 구현한건데 이거 맞나..? size를 구하는 메서드를 만들어야 하는듯 한데..

        return stackSavingSystem.size();
    }

    public int peek() {
        // TODO: 가장 나중에 삽입된 엘레멘트값 가져오기

        return stackSavingSystem.get(stackSavingSystem.size());
    }
}
