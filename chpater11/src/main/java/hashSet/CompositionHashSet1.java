package hashSet;

import java.util.Collection;
import java.util.HashSet;

public class CompositionHashSet1<E> {
    private int addCount = 0;
    private HashSet<E> set;

    public CompositionHashSet1(final HashSet<E> set) {
        this.set = set;
    }

    public boolean add(E e) {
        addCount++;
        return set.add(e);
    }

    public boolean addAll(Collection<? extends E> c) {
        addCount += c.size();
        return set.addAll(c);
    }

    public int getAddCount() {
        return addCount;
    }
}
