public class PatternMatchingSwitch {

    static void check(Object obj) {

        if(obj instanceof Integer)
            System.out.println(
                    "Integer"
            );

        else if(obj instanceof String)
            System.out.println(
                    "String"
            );

        else if(obj instanceof Double)
            System.out.println(
                    "Double"
            );

        else
            System.out.println(
                    "Unknown"
            );
    }

    public static void main(String[] args) {

        check(10);
        check("Hello");
        check(5.5);

    }
}