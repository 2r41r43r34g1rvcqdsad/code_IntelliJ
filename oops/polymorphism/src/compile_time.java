public class compile_time {
    // it is also known as the static ploymorphism
    // it is achieved by the method overlaoding
    // method signature is (name + parameter)
    // occures during compilelation.

    // here is a simple example of by crating a calcuator
    int add(int a , int b){
        return a+b;

    }
    int add( int a , int b, int c){
        return a+b+c;
    }
}
