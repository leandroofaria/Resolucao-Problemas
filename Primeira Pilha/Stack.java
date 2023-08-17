public class Stack<T> implements Interface<T> {

    public int top;
    public T[] data;

    public Stack(int size) {
        this.top = -1;
        data = (T[]) new Object[size];
    }

    @Override
    public void add(T item) {
        if (!isFUll()) {
            data[++top] = item;
        } else {System.out.println("A pilha está cheia!");}
    }

    @Override
    public T remove() {
        if (!isEmpty()) {
            T item = data[top];
            data[top--] = null;
            return item;
        } else {System.out.println("A pilha está vazia!");}
    }

    @Override
    public void clear() {
    }

    @Override
    public boolean isFUll() {
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    
}
