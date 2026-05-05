/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.o.e;

import b.o.d.w;
import b.o.e.g;
import b.s.mc;
import b.s.ub;
import b.s.z;
import b.t.c.b.b.j.b.e;
import b.t.c.b.b.o.e.b;
import b.t.c.b.b.o.e.f;
import b.t.c.b.b.o.e.j;
import b.t.c.b.b.o.e.m$_b;
import b.t.c.b.b.o.e.n;
import b.t.c.b.b.q.dc;
import b.t.c.b.b.q.k;
import b.t.c.b.b.q.kb;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class m
implements f {
    public static final m$_b o00000 = new m$_b(null);
    private final String \u00d5O0000;
    private final f[] \u00d6O0000;

    private m(String string, f[] fArray) {
        this.\u00d5O0000 = string;
        this.\u00d6O0000 = fArray;
    }

    public final List \u00f600000() {
        return z.thisnew(this.\u00d6O0000);
    }

    @Override
    public final kb \u00d200000(b.t.c.b.b.d.f f2, e e2) {
        f[] fArray = this.\u00d6O0000;
        kb kb2 = null;
        int n2 = fArray.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            kb kb3 = ((b)fArray[i2]).\u00d200000(f2, e2);
            if (kb3 == null) continue;
            if (kb3 instanceof k && ((dc)((Object)kb3)).\u00d80O000()) {
                if (kb2 != null) continue;
                kb2 = kb3;
                continue;
            }
            return kb3;
        }
        return kb2;
    }

    @Override
    public final Collection \u00d400000(b.t.c.b.b.d.f f2, e e2) {
        f[] fArray = this.\u00d6O0000;
        switch (this.\u00d6O0000.length) {
            case 0: {
                return mc.\u00d500000();
            }
            case 1: {
                return fArray[0].\u00d400000(f2, e2);
            }
        }
        Collection collection = null;
        int n2 = fArray.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            collection = b.t.c.b.b.g.b.b.o00000(collection, fArray[i2].\u00d400000(f2, e2));
        }
        Collection collection2 = collection;
        if (collection2 == null) {
            collection2 = ub.\u00d300000();
        }
        return collection2;
    }

    @Override
    public final Collection \u00d300000(b.t.c.b.b.d.f f2, e e2) {
        f[] fArray = this.\u00d6O0000;
        switch (this.\u00d6O0000.length) {
            case 0: {
                return mc.\u00d500000();
            }
            case 1: {
                return fArray[0].\u00d300000(f2, e2);
            }
        }
        Collection collection = null;
        int n2 = fArray.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            collection = b.t.c.b.b.g.b.b.o00000(collection, fArray[i2].\u00d300000(f2, e2));
        }
        Collection collection2 = collection;
        if (collection2 == null) {
            collection2 = ub.\u00d300000();
        }
        return collection2;
    }

    @Override
    public final Collection super(j j2, g g2) {
        f[] fArray = this.\u00d6O0000;
        switch (this.\u00d6O0000.length) {
            case 0: {
                return mc.\u00d500000();
            }
            case 1: {
                return ((b)fArray[0]).super(j2, g2);
            }
        }
        Collection collection = null;
        int n2 = fArray.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            collection = b.t.c.b.b.g.b.b.o00000(collection, ((b)fArray[i2]).super(j2, g2));
        }
        Collection collection2 = collection;
        if (collection2 == null) {
            collection2 = ub.\u00d300000();
        }
        return collection2;
    }

    @Override
    public final Set super() {
        f[] fArray = this.\u00d6O0000;
        Collection collection = new LinkedHashSet();
        int n2 = fArray.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            Iterable iterable = fArray[i2].super();
            mc.new(collection, iterable);
        }
        return (Set)collection;
    }

    @Override
    public final Set \u00d300000() {
        f[] fArray = this.\u00d6O0000;
        Collection collection = new LinkedHashSet();
        int n2 = fArray.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            Iterable iterable = fArray[i2].\u00d300000();
            mc.new(collection, iterable);
        }
        return (Set)collection;
    }

    @Override
    public final Set \u00d200000() {
        return n.o00000(z.private(this.\u00d6O0000));
    }

    @Override
    public final void super(b.t.c.b.b.d.f f2, e e2) {
        f[] fArray = this.\u00d6O0000;
        int n2 = fArray.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            fArray[i2].super(f2, e2);
        }
    }

    public final String toString() {
        return this.\u00d5O0000;
    }

    public static final /* synthetic */ f[] super(m m2) {
        return m2.\u00d6O0000;
    }

    public /* synthetic */ m(String string, f[] fArray, w w2) {
        this(string, fArray);
    }
}

