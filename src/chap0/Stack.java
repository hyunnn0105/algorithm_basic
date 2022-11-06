package chap0;

import java.util.Arrays;

public class Stack implements StackInterface{


    private int stackSize;
    private int top;
    private char stackArr[];

    public Stack(int stackSize){
        top = -1;
        this.stackSize = stackSize;
        stackArr = new char[stackSize];
    }

    public boolean isEmpty(){
        return (top == -1);
    }

    @Override
    public boolean isFull() {
        return (top == this.stackSize-1);
    }

    @Override
    public void push(char item) {
        if (isFull()){
            System.out.println("full");
        } else {
            stackArr[++top] = item;
            System.out.println(item);
        }
    }

    // 마지막데이터 추출 후 삭제
    @Override
    public char pop() {
        if (isEmpty()){
            System.out.println("empty");
            return 0;
        } else {
            return stackArr[top--];
        }
    }

    @Override
    public char peek() {
        if (isEmpty()){
            System.out.println("peek - empty");
            return 0;
        } else {
            return stackArr[top];
        }
    }

    @Override
    public void clear() {
        if (isEmpty()){

        }else {
            top = -1;
            // 새로운 스택 배열생성
            stackArr = new char[this.stackSize];
        }
    }

    public static void main(String[] args) {
        int stacksize = 5;
        Stack arrstack = new Stack(stacksize);

        arrstack.push('A');
        System.out.println(arrstack.toString());

        arrstack.push('B');
        System.out.println(arrstack.toString());

        arrstack.push('C');
        System.out.println(arrstack.toString());

        arrstack.pop();
        System.out.println(arrstack.toString());

    }
}
