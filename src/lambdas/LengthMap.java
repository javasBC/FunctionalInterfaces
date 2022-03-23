package lambdas;

import java.util.function.DoubleUnaryOperator;
import java.util.function.Function;

public class LengthMap implements Function<String,Integer> {
    @Override
    public Integer apply(String s) {
        return s.length();
    }
}
