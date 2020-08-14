package hashSet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> testList = Arrays.asList(1, 2, 3);
        CompositionHashSet1 set = new CompositionHashSet1(new HashSet<List>());
        set.addAll(testList);
        System.out.println(set.getAddCount());
    }

}
