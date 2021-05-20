package thuc_hanh_1;

import java.util.EmptyStackException;
import java.util.LinkedList;

public class MyGenericStack <T>{
    private LinkedList<T> stack;

    public MyGenericStack() {
        stack = new LinkedList();
    }
    public void push(T element){
        stack.addFirst(element);
    }
    public T pop(){
        if (stack.isEmpty()){
            throw new EmptyStackException();
        }
        return stack.removeFirst();
    }
    public int siZe(){
        return  stack.size();
    }
    public boolean isEmpty() {
        if (stack.size() == 0) {
            return true;
        }
        return false;
    }
    public static void stackOfIntegers(){
        MyGenericStack<Integer> stack= new MyGenericStack<>();
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        System.out.println("Kích thước của ngăn xếp sau các hoạt động đẩy: " + stack.siZe());
        System.out.println("các phần tử pop từ ngăn xếp: " );
        while (!stack.isEmpty()){
            System.out.printf("%d",stack.pop());
        }
        System.out.println(" Size of stack after pop operations : "+ stack.siZe());
    }
    public static void stackOfIStrings() {
        MyGenericStack<String> stack = new MyGenericStack();
        stack.push("Five");
        stack.push("Four");
        stack.push("Three");
        stack.push("Two");
        stack.push("One");
        System.out.println("Kích thước của ngăn xếp sau các hoạt động đẩy " + stack.siZe());
        System.out.printf("các phần tử pop từ ngăn xếp");
        while (!stack.isEmpty()) {
            System.out.printf(" %s", stack.pop());
        }
        System.out.println("\n1.3. Size of stack after pop operations : " + stack.siZe());
    }

}
//git remote add origin https://github.com/letuananh12345/DSA-STACK_QUEUE.git
//git branch -M main
//git push -u origin main