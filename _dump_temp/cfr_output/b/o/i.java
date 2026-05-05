/*
 * Decompiled with CFR 0.152.
 */
package b.o;

public class i
extends Error {
    public i() {
        super("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
    }

    public i(String string) {
        super(string);
    }

    public i(String string, Throwable throwable) {
        super(string, throwable);
    }

    public i(Throwable throwable) {
        super(throwable);
    }
}

