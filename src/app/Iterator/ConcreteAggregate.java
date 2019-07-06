package app.Iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by k on 2017/12/14.
 */
class ConcreteAggregate implements Aggregate {
    private List list = new ArrayList();
    @Override
    public void add(Object obj) {
        list.add(obj);
    }
    @Override
    public Iterator iterator() {
        return new ConcreteIterator(list);
    }
    @Override
    public void remove(Object obj) {
        list.remove(obj);
    }
}