package lambdas;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        UseFoo useFoo = new UseFoo();
        Foo foo = p -> p + " from lambda using FunctionalInterface Foo";
        String result = useFoo.add("Message", foo);
        System.out.println(result);

        Function<String, String> fn =
                parameter -> parameter + " from lambda using Function<String, String>";
        result = useFoo.add("Message", fn);
        System.out.println(result);
    }
}
