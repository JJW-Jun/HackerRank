package demo.algorithm;

class Stack {
    int stack[];
    int top;

    public Stack(int n) {
        stack = new int[n];
        top = -1;
    }

    public void push(int item) {
        if (top >= stack.length - 1) {
            //top가 배열의 크기보다 크면 stack이 full상태입니다.
            System.out.println("Stack Overflow");
            return;
        } else {
            // stack이 full상태가 아니라면
            top = top + 1;
            stack[top] = item;
        }
    }

    public int pop() {
        if (top <= -1) { // top이 =-1 이라면 이는 Stack이 공백을 의미한다.
            System.out.println("Stack Empty");
            return 99;
        } else { // Stack이 공백이라니라면 배열의 top 인덱스값을 출력하고 top을 감소시킨다.
            return stack[top--];
        }
    }

    public boolean isEmpty() {
        if (top <= -1) {
            // top이 =-1 이라면 이는 Stack이 공백을 의미한다.
            return true;
        } else {
            // Stack이 공백이라니라면 배열의 top 인덱스값을 출력하고 top을 감소시킨다.
            return false;
        }
    }
}


