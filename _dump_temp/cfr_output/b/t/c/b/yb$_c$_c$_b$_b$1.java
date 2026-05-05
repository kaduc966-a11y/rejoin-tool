/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b;

import b.y.f;
import java.lang.reflect.Method;
import java.util.Comparator;

public final class yb$_c$_c$_b$_b$1
implements Comparator {
    public final int compare(Object object, Object object2) {
        Comparable comparable = (Comparable)((Object)((Method)object).getName());
        object = (Method)object2;
        object2 = comparable;
        return f.super((Comparable)object2, (Comparable)((Object)((Method)object).getName()));
    }
}

