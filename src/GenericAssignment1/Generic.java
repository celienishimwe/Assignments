package GenericAssignment1;

public class Generic <k,v>{
    private k key;
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


    @Override
    public String toString() {
        return "Generic{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }
}
