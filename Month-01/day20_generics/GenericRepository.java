package day20_generics;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class GenericRepository<T extends Identifiable<ID>, ID> {
    private List<T> storage = new ArrayList<>();

    public void save(T entity) {
        if (entity != null) {
            storage.add(entity);
        }
    }

    public Optional<T> findById(ID id) {
        return storage.stream()
                .filter(item -> item.getId().equals(id))
                .findFirst();
    }

    public List<T> findAll() {
        return new ArrayList<>(storage);
    }

    public void saveAll(List<? extends T> entities) {
        for (T entity : entities) {
            save(entity);
        }
    }

}
