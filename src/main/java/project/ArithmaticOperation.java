package project;

public class ArithmaticOperation {
    public Integer add(Integer a , Integer b){
        return a+b;
    }
    public Integer subtract(Integer a, Integer b){
        return a-b;
    }
    public static void main(String[] args) {
        ArithmaticOperation addition =new ArithmaticOperation();
        addition.add(29,10);
    }
}
