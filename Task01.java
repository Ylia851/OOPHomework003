import java.util.Iterator;
import java.util.random.*;;

public class IterableIterator
Implements Iterable<Integer>{
    private final int N;

    public IterableIterator(int N) {
        this.N = N;
    }

    @Override
    public Iterator<Integer> Iterator() {
        return new Iterator<Integer>() {
            private int counter = 0;

            @Override
            public boolean hasNext() {
                return Math.random(0, N);
            }

            @Override
            public Integer next() {
                return counter++;
            }
        };
    }

}

public static void main(String[] args){
    IterableIterator Iterator = new IterableIterator(1, 10);
    for(Integer integer: Iterator){
        System.out.println(Iterator);
    }
}