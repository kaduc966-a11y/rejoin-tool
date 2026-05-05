/*
 * Decompiled with CFR 0.152.
 */
import b.o.d.fc;
import b.y.f;
import java.util.Comparator;

public final class b
implements Comparator {
    public final int compare(Object object, Object object2) {
        Comparable comparable = fc.o00000((Object)((String)object), (Object)MainKt.a()) ? (Comparable)Integer.valueOf(0) : (Comparable)Integer.valueOf(1);
        object = (String)object2;
        object2 = comparable;
        return f.super((Comparable)object2, fc.o00000(object, (Object)MainKt.a()) ? (Comparable)Integer.valueOf(0) : (Comparable)Integer.valueOf(1));
    }
}

