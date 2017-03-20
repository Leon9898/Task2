/**
 * Created by Leon Kostyushko on 20.03.2017.
 */
public class Node<T> {
    public T value;
    public Node Next;

    public Node(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Node getNext() {
        return Next;
    }

}
