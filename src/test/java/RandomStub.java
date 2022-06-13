import java.util.Iterator;
import java.util.Random;

public class RandomStub<T> extends Random
{
    private Iterator<T> iterator;
    private Iterator<Double> doubleIterator;


    RandomStub(Iterable<T> values,Iterable<Double> d){
        iterator=values.iterator();
        doubleIterator=d.iterator();
    }



    @Override
    public int nextInt(){
        return (int)iterator.next();
    }

    @Override
    public double nextDouble(){
        return doubleIterator.next();
    }

    @Override
    public int nextInt(int bound){
        return nextInt();
    }
}

