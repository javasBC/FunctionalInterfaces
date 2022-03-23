package lambdas;

import java.util.function.Supplier;

public class RandomGenerator implements Supplier<Double> {
    @Override
    public Double get() {
        return Math.random();
    }
}
