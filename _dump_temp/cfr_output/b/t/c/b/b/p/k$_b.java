/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.p;

import b.t.c.b.b.p.ab;
import b.t.c.b.b.p.q;
import b.t.c.b.b.p.s;
import b.t.c.b.b.p.v;
import b.t.c.b.b.p.v$_b;
import b.t.c.b.b.p.w;
import java.io.IOException;
import java.util.Collection;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public abstract class k$_b
implements v$_b {
    public abstract k$_b \u00d400000();

    public abstract k$_b \u00d200000(ab var1, s var2) throws IOException;

    protected static w super(v v2) {
        return new w(v2);
    }

    public static void super(Iterable object, Collection collection) {
        if (object instanceof q) {
            k$_b.super(((q)object).super());
            collection.addAll((Collection)object);
            return;
        }
        if (object instanceof Collection) {
            k$_b.super((Iterable)object);
            collection.addAll((Collection)object);
            return;
        }
        object = object.iterator();
        while (object.hasNext()) {
            Object e2 = object.next();
            if (e2 == null) {
                throw new NullPointerException();
            }
            collection.add(e2);
        }
    }

    private static void super(Iterable object) {
        object = object.iterator();
        while (object.hasNext()) {
            if (object.next() != null) continue;
            throw new NullPointerException();
        }
    }
}

