import java.util.ArrayList;
import java.util.NoSuchElementException;

public class myStack<T> implements StackADT<T>{
    
    private ArrayList<T> list;
    
    public myStack(){
        this.list = new ArrayList<>();
    }

    @Override
    public boolean isEmpty(){
        return list == null;
    }

    @Override
    public void clear(){
        while(list.size()>0){
            list.remove(0);
        }
    }
    
    @Override
    public void push(T item) {
        list.add(item);
    
    }

    public ArrayList<T> getList(){
        return this.list;
    }

    @Override
    public T pop() throws NoSuchElementException {
        if(this.isEmpty()){
            throw new NoSuchElementException();
        }
        T last = list.get(list.size()-1); //last element
        list.remove(last);
        return last;
    }

    @Override
    public T top() throws NoSuchElementException {
        if(this.isEmpty()){
            throw new NoSuchElementException();
        }
        return list.get(list.size()-1);
    }

    @Override
    public int size() {
        int count = 0;
        for(T element : list){
            count ++;
        }
        return count;
    }

}



