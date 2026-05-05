/*
 * Decompiled with CFR 0.152.
 */
package b.t.b;

public final class e
extends Exception {
    public e(IllegalAccessException illegalAccessException) {
        super("Cannot obtain the delegate of a non-accessible property. Use \"isAccessible = true\" to make the property accessible", illegalAccessException);
    }
}

