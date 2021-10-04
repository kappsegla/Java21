package se.iths.java21.advancedstreams.monads;

@FunctionalInterface
public interface CheckedConsumer<T> {
    void apply(T t) throws Exception;
}
