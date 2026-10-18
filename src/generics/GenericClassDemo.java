package generics;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public class GenericClassDemo<T> {
    T typeObject;

    private GenericClassDemo(T typeObject) {
        this.typeObject = typeObject;
    }

    public void set(T typeObject) {
        this.typeObject = typeObject;
    }

    public T get(T typeObject) {
        return this.typeObject;
    }
}

class MapMethodDemo{


    public <K, V> List<V> getMap(List<Map<K, V>> mapList, K key, V value) {
        //do logical operations and return it.
        List<V> list = new ArrayList<>();
        for (Map<K, V> map : mapList) {
            V mapValue = map.get(key);
            list.add(mapValue);

        }
        return list;
    }
}