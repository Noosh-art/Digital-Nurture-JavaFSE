import java.lang.reflect.*;

public class ReflectionExample {

    public void hello() {

        System.out.println(
                "Hello Reflection"
        );

    }

    public static void main(String[] args)
            throws Exception {

        Class<?> cls =
                Class.forName(
                        "ReflectionExample"
                );

        Object obj =
                cls.getDeclaredConstructor()
                        .newInstance();

        Method method =
                cls.getMethod(
                        "hello"
                );

        method.invoke(obj);

    }
}