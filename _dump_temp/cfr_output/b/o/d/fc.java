/*
 * Decompiled with CFR 0.152.
 */
package b.o.d;

import b.ec;
import b.n;
import java.util.Arrays;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class fc {
    private fc() {
    }

    public static String o00000(String string, Object object) {
        return string + object;
    }

    public static void o00000(Object object) {
        if (object == null) {
            fc.\u00d500000();
        }
    }

    public static void o00000(Object object, String string) {
        if (object == null) {
            fc.\u00d800000(string);
        }
    }

    public static void \u00d800000() {
        throw (n)fc.o00000(new n());
    }

    public static void oO0000(String string) {
        throw (n)fc.o00000(new n(string));
    }

    public static void \u00d500000() {
        throw (NullPointerException)fc.o00000(new NullPointerException());
    }

    public static void \u00d800000(String string) {
        throw (NullPointerException)fc.o00000(new NullPointerException(string));
    }

    public static void \u00d300000(String string) {
        throw (ec)fc.o00000(new ec(string));
    }

    public static void return(String string) {
        fc.\u00d300000("lateinit property " + string + " has not been initialized");
    }

    public static void new() {
        throw (AssertionError)((Object)fc.o00000((Throwable)((Object)new AssertionError())));
    }

    public static void new(String string) {
        throw (AssertionError)((Object)fc.o00000((Throwable)((Object)new AssertionError((Object)string))));
    }

    public static void \u00d400000() {
        throw (IllegalArgumentException)fc.o00000(new IllegalArgumentException());
    }

    public static void OO0000(String string) {
        throw (IllegalArgumentException)fc.o00000(new IllegalArgumentException(string));
    }

    public static void o00000() {
        throw (IllegalStateException)fc.o00000(new IllegalStateException());
    }

    public static void \u00d400000(String string) {
        throw (IllegalStateException)fc.o00000(new IllegalStateException(string));
    }

    public static void \u00d400000(Object object, String string) {
        if (object == null) {
            throw (IllegalStateException)fc.o00000(new IllegalStateException(string + " must not be null"));
        }
    }

    public static void new(Object object, String string) {
        if (object == null) {
            throw (NullPointerException)fc.o00000(new NullPointerException(string + " must not be null"));
        }
    }

    public static void o00000(Object object, String string, String string2) {
        if (object == null) {
            throw (IllegalStateException)fc.o00000(new IllegalStateException("Method specified as non-null returned null: " + string + "." + string2));
        }
    }

    public static void \u00d500000(Object object, String string) {
        if (object == null) {
            throw (IllegalStateException)fc.o00000(new IllegalStateException(string));
        }
    }

    public static void new(Object object, String string, String string2) {
        if (object == null) {
            throw (IllegalStateException)fc.o00000(new IllegalStateException("Field specified as non-null is null: " + string + "." + string2));
        }
    }

    public static void \u00d800000(Object object, String string) {
        if (object == null) {
            throw (IllegalStateException)fc.o00000(new IllegalStateException(string));
        }
    }

    public static void return(Object object, String string) {
        if (object == null) {
            fc.\u00f400000(string);
        }
    }

    public static void \u00d300000(Object object, String string) {
        if (object == null) {
            fc.o00000(string);
        }
    }

    private static void \u00f400000(String string) {
        throw (IllegalArgumentException)fc.o00000(new IllegalArgumentException(fc.if(string)));
    }

    private static void o00000(String string) {
        throw (NullPointerException)fc.o00000(new NullPointerException(fc.if(string)));
    }

    private static String if(String string) {
        Object object = Thread.currentThread().getStackTrace();
        String string2 = fc.class.getName();
        int n2 = 0;
        while (!object[n2].getClassName().equals(string2)) {
            ++n2;
        }
        while (object[n2].getClassName().equals(string2)) {
            ++n2;
        }
        object = object[n2];
        string2 = ((StackTraceElement)object).getClassName();
        object = ((StackTraceElement)object).getMethodName();
        return "Parameter specified as non-null is null: method " + string2 + "." + (String)object + ", parameter " + string;
    }

    public static int o00000(long l2, long l3) {
        if (l2 < l3) {
            return -1;
        }
        if (l2 == l3) {
            return 0;
        }
        return 1;
    }

    public static int o00000(int n2, int n3) {
        if (n2 < n3) {
            return -1;
        }
        if (n2 == n3) {
            return 0;
        }
        return 1;
    }

    public static boolean o00000(Object object, Object object2) {
        if (object == null) {
            return object2 == null;
        }
        return object.equals(object2);
    }

    public static boolean o00000(Double d2, Double d3) {
        if (d2 == null) {
            return d3 == null;
        }
        return d3 != null && d2.doubleValue() == d3.doubleValue();
    }

    public static boolean o00000(Double d2, double d3) {
        return d2 != null && d2 == d3;
    }

    public static boolean o00000(double d2, Double d3) {
        return d3 != null && d2 == d3;
    }

    public static boolean o00000(Float f2, Float f3) {
        if (f2 == null) {
            return f3 == null;
        }
        return f3 != null && f2.floatValue() == f3.floatValue();
    }

    public static boolean o00000(Float f2, float f3) {
        return f2 != null && f2.floatValue() == f3;
    }

    public static boolean o00000(float f2, Float f3) {
        return f3 != null && f2 == f3.floatValue();
    }

    public static void return() {
        fc.\u00f800000("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    public static void \u00f800000(String string) {
        throw new UnsupportedOperationException(string);
    }

    public static void o00000(int n2, String string) {
        fc.return();
    }

    public static void o00000(int n2, String string, String string2) {
        fc.\u00f800000(string2);
    }

    public static void \u00d300000() {
        fc.return();
    }

    public static void \u00f500000(String string) {
        fc.\u00f800000(string);
    }

    public static void \u00d500000(String string) throws ClassNotFoundException {
        string = string.replace('/', '.');
        try {
            Class.forName(string);
            return;
        }
        catch (ClassNotFoundException classNotFoundException) {
            throw (ClassNotFoundException)fc.o00000(new ClassNotFoundException("Class " + string + " is not found. Please update the Kotlin runtime to the latest version", classNotFoundException));
        }
    }

    public static void o00000(String string, String string2) throws ClassNotFoundException {
        string = string.replace('/', '.');
        try {
            Class.forName(string);
            return;
        }
        catch (ClassNotFoundException classNotFoundException) {
            throw (ClassNotFoundException)fc.o00000(new ClassNotFoundException("Class " + string + " is not found: this code requires the Kotlin runtime of version at least " + string2, classNotFoundException));
        }
    }

    private static Throwable o00000(Throwable throwable) {
        return fc.o00000(throwable, fc.class.getName());
    }

    static Throwable o00000(Throwable throwable, String string) {
        StackTraceElement[] stackTraceElementArray = throwable.getStackTrace();
        int n2 = stackTraceElementArray.length;
        int n3 = -1;
        for (int i2 = 0; i2 < n2; ++i2) {
            if (!string.equals(stackTraceElementArray[i2].getClassName())) continue;
            n3 = i2;
        }
        StackTraceElement[] stackTraceElementArray2 = Arrays.copyOfRange(stackTraceElementArray, n3 + 1, n2);
        throwable.setStackTrace(stackTraceElementArray2);
        return throwable;
    }
}

