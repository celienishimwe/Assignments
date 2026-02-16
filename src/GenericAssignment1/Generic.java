package GenericAssignment1;

import java.util.Objects;

public class Generic <k,v>{
    private k key;

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Generic<?, ?> generic)) return false;
        return Objects.equals(key, generic.key) && Objects.equals(value, generic.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, value);
    }

    private v value;

    public Generic(k key,v value){
        if (key == null){
            throw new IllegalArgumentException("Key cannot be null");
        }
        this.key = key;
        this.value = value;
    }


    public k getKey() {
        return key;
    }

    public void setKey(k key) {
        this.key = key;
    }

    public v getValue() {
        return value;
    }

    public void setValue(v value) {
        this.value = value;
    }
    public static <K, V> Generic<K ,V> create(K key, V value){
        return new Generic<K,V>(key,value);
    }
    @Override
    public String toString() {
        return "Generic{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }
}
