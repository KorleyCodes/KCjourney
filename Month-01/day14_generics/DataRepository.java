package day14_generics;

import java.util.List;
import java.util.ArrayList;

public class DataRepository<T> {
    private List<T> items = new ArrayList<>();

    public void save(T item) {
        items.add(item);
    }

    public List<T> getAll() {
        return items;
    }

    public int count() {
        return items.size();
    }
}
