package abc.spring.pet_clinic.sevices.map;

import abc.spring.pet_clinic.model.BaseEntity;
import java.util.*;

public class AbstractMapService<T extends BaseEntity,ID extends Long> {

    protected Map<Long, T> map = new HashMap<>();

    Set<T> findAll(){
        return new HashSet<>(map.values());
    }

    T findById(Long id){
        return map.get(id);
    }

    T save(T object){
        if(object!=null){
            if(object.getId() == null){
                object.setId(getNextId());
            }
            map.put(object.getId(), object);
        } else{
            throw new RuntimeException("Object cannot be null");
        }
        return object;
    }

    void deleteById(Long id){
        map.remove(id);
    }

    void delete(T object){
        map.entrySet().removeIf(entry -> entry.getValue().equals(object));
    }

    public Long getNextId(){
        Long nextId;
        try{
            nextId = Collections.max(map.keySet())+1;
        } catch (NoSuchElementException e){
            nextId = 1L;
        }
        return nextId;
    }
}
