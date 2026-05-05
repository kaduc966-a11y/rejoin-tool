/*
 * Decompiled with CFR 0.152.
 */
package b.o.d;

import b.dc;
import b.lb;
import b.o.d.d;
import b.o.d.fc;
import b.o.d.oc;
import b.r;
import b.t.bb;
import java.lang.reflect.GenericDeclaration;

public abstract class jb
implements bb {
    private final Object \u00d4\u00d8\u00d5000;
    private final dc \u00d5\u00d8\u00d5000;

    public jb(Object object) {
        this.\u00d4\u00d8\u00d5000 = object;
        this.\u00d5\u00d8\u00d5000 = r.o00000(lb.\u00d400000, () -> jb.o00000(this));
    }

    public final Object O\u00d5o000() {
        return this.\u00d4\u00d8\u00d5000;
    }

    public final GenericDeclaration \u00f8\u00d4o000() {
        return (GenericDeclaration)this.\u00d5\u00d8\u00d5000.\u00d200000();
    }

    public boolean equals(Object object) {
        return object instanceof jb && fc.o00000((Object)this.\u00f5\u00d4o000(), (Object)((jb)object).\u00f5\u00d4o000()) && fc.o00000(this.\u00d4\u00d8\u00d5000, ((jb)object).\u00d4\u00d8\u00d5000);
    }

    public int hashCode() {
        return this.\u00d4\u00d8\u00d5000.hashCode() * 31 + this.\u00f5\u00d4o000().hashCode();
    }

    public String toString() {
        return oc.privateObjectObject.o00000(this);
    }

    private static final GenericDeclaration o00000(jb object) {
        object = ((jb)object).\u00d4\u00d8\u00d5000;
        d d2 = object instanceof d ? (d)object : null;
        if (d2 != null) {
            return d2.\u00d5\u00f50000();
        }
        return null;
    }
}

