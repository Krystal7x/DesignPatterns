package app.Iterator;

/**
 * Created by tt on 2017/12/14.
 */
interface Aggregate {
    public void add(Object obj);
    public void remove(Object obj);
    public Iterator iterator();
}
