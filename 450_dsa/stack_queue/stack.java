package stack_queue;

import java.lang.reflect.Array;

/**
 * Innerstack
 */


class Innerstack {
    Integer pt;
    int[] st;

    Innerstack(){
        pt = 0;
        st = new int[100];
    }

    public void push(int val){
        if(pt>=100){
            System.out.println("Stack is Full");
        }
        else{
            st[pt]=val;
            System.out.println("Value pushed:"+st[pt]);
            pt++;
        }
    }
    public void pop(){
        if(pt<1){
            System.out.println("Stack is Empty");
        }
        else{
            // st[pt]=val;
            pt--;
            System.out.println("Value is popped");
        }
    }
    public boolean empty(int val){
        if(pt==0){
            // System.out.println("Stack is Full");
            return true;
        }
        else{
            // st[pt]=val;
            // pt++;
            return false;
        }
    }
}
public class stack {

    public static void main(String[] args) {
        Innerstack s1= new Innerstack();
        s1.push(1);
        s1.pop();
        s1.pop();
        
    }
}
