package lambdas;

import java.util.function.Consumer;

public class forEachCunsomer implements Consumer<Integer> {
    @Override
    public void accept(Integer integer) {
        System.out.println(integer);
    }
}
