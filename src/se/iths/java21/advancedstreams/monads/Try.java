package se.iths.java21.advancedstreams.monads;

import java.security.cert.TrustAnchor;
import java.util.Objects;
import java.util.function.Function;
import java.util.function.Supplier;

class Success<T> extends Try<T> {
    private final T value;

    public Success(T value) {
        this.value = value;
    }

    @Override
    public T get() throws Throwable {
        return value;
    }

    @Override
    public T orElse(T value) {
        return this.value;
    }

    @Override
    public String toString() {
        return "Success{" +
                "value=" + value +
                '}';
    }
}

class Failure<T> extends Try<T> {
    private final Throwable e;

    public Failure(Throwable e) {
        this.e = e;
    }

    @Override
    public T get() throws Throwable {
        throw e;
    }

    @Override
    public T orElse(T value) {
        return value;
    }

    @Override
    public String toString() {
        return "Failure{" +
                "e=" + e +
                '}';
    }
}

public abstract class Try<T> {

    public abstract T get() throws Throwable;

    public abstract T orElse(T value);

    public static <U> Try<U> ofThrowable(Supplier<U> f) {
        Objects.requireNonNull(f);
        try {
            return Try.successful(f.get());
        } catch (Throwable e) {
            return Try.failure(e);
        }
    }

    public static <T, R> Function<T, Try<R>> of(CheckedFunction<T, R> function) {
        Objects.requireNonNull(function, "function is null");
        return t ->{
            try {
                return new Success<R>(function.apply(t));
            } catch (Throwable e) {
                return new Failure<R>(e);
            }
        };
    }

    public static <U> Success<U> successful(U u) {
        return new Success<>(u);
    }

    public static <U> Failure<U> failure(Throwable e) {
        return new Failure<>(e);
    }
}
