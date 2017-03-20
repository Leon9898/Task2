import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by Leon Kostyushko on 20.03.2017.
 */
public class LinkedSet<T> implements Set<T> {

   private Node node;

    public LinkedSet(){

    }

    @Override
    public int size() {
       int counter = 0;
       while(node.Next != null) {
           counter++;
           size();
       }

       return counter;
    }

    @Override
    public boolean isEmpty() {
        return  node.Next == null;
    }

    @Override
    public boolean contains(Object o) {
        return true;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public boolean add(T t) {
        Node<T> addedNode = new Node<T>(t);
        if(node == null) {
            node = addedNode;
            return true;
        } else {
            node = node.Next;
            return add(t);
        }
    }

    @Override
    public boolean remove(Object o) {   //need to finish
        for(int i = 0; i < size(); i++){
            if(node.equals(o)) {
                node = node.Next;

            }
        }
        return true;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }
}
