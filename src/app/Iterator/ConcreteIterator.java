package app.Iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by k on 2017/12/14.
 */
class ConcreteIterator implements Iterator{
    private List list = new ArrayList();
    private int cursor =0;
    public ConcreteIterator(List list){
        this.list = list;
    }
    @Override
    public boolean hasNext() {
        if(cursor==list.size()){
            return false;
        }
        return true;
    }
    @Override
    public Object next() {
        Object obj = null;
        if(this.hasNext()){
            obj = this.list.get(cursor++);
        }
        return obj;
    }
}
