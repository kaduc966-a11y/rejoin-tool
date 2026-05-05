/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.n.c;

import b.o.d.fc;
import b.o.d.w;
import b.t.c.b.b.d.d;
import b.t.c.b.b.n.c.b.b;
import java.util.Arrays;

public final class s$_b {
    private final d \u00d200000;
    private final byte[] o00000;
    private final b Object;

    public s$_b(d d2, byte[] byArray, b b2) {
        this.\u00d200000 = d2;
        this.o00000 = byArray;
        this.Object = b2;
    }

    public /* synthetic */ s$_b(d d2, byte[] byArray, b b2, int n2, w w2) {
        if ((n2 & 2) != 0) {
            byArray = null;
        }
        if ((n2 & 4) != 0) {
            b2 = null;
        }
        this(d2, byArray, b2);
    }

    public final d o00000() {
        return this.\u00d200000;
    }

    public final String toString() {
        return "Request(classId=" + this.\u00d200000 + ", previouslyFoundClassFileContent=" + Arrays.toString(this.o00000) + ", outerClass=" + this.Object + ')';
    }

    public final int hashCode() {
        return (this.\u00d200000.hashCode() * 31 + (this.o00000 == null ? 0 : Arrays.hashCode(this.o00000))) * 31 + (this.Object == null ? 0 : this.Object.hashCode());
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof s$_b)) {
            return false;
        }
        object = (s$_b)object;
        if (!fc.o00000((Object)this.\u00d200000, (Object)((s$_b)object).\u00d200000)) {
            return false;
        }
        if (!fc.o00000((Object)this.o00000, (Object)((s$_b)object).o00000)) {
            return false;
        }
        return fc.o00000((Object)this.Object, (Object)((s$_b)object).Object);
    }
}

