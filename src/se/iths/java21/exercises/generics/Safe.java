package se.iths.java21.exercises.generics;

import org.jetbrains.annotations.NotNull;

public class Safe<T> {
    private T stuff;

    public void store(@NotNull T stuff) {
        if (this.stuff != null)
            throw new IllegalStateException("Already stored something.");
//        if (stuff == null)
//            throw new IllegalArgumentException("Can't store null");
        this.stuff = stuff;
    }

    public T retrieve() {
        if (this.stuff == null)
            throw new IllegalStateException("Safe is empty");
        T temp = this.stuff;
        this.stuff = null;
        return temp;
    }

    public static void main(String[] args) {
        Safe<String> mySafe = new Safe<>();
        mySafe.store("Hej");
        System.out.println(mySafe.retrieve());
        mySafe.store(null);

    }
}
