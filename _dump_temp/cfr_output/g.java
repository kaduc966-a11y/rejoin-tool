/*
 * Decompiled with CFR 0.152.
 */
import b.y.f;
import java.util.Comparator;

public final class g
implements Comparator {
    final /* synthetic */ Comparator o00000;

    public g(Comparator comparator) {
        this.o00000 = comparator;
    }

    public final int compare(Object object, Object object2) {
        int n2 = this.o00000.compare(object, object2);
        if (n2 != 0) {
            return n2;
        }
        Comparable comparable = (Comparable)((Object)((String)object));
        object = (String)object2;
        object2 = comparable;
        return f.super((Comparable)object2, (Comparable)object);
    }
}

