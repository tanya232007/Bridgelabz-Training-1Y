package generics;

public class Box2<T> {

    private T value;
    public T getValue()
    {
        return value;
    }
    public void setvalue()
    {
        this.value=value;
    }


    public void setValue(T value) {
        this.value = value;

    }
}
