
public class Main {
    public static void main(String[] args) {
//        определите переменную listener типа OnTaskDoneListener через лямбда-выражение:
        OnTaskDoneListener listener = System.out::println;
        OnTaskErrorListener errorListener = System.out::println;

//        Далее создайте экземпляр класса Worker и передайте в конструктор класса listener:
        Worker worker = new Worker(listener, errorListener);
        worker.start();
    }
}