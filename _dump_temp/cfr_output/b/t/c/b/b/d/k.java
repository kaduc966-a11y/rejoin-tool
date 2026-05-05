/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.d;

import b.o.d.fc;
import b.t.c.b.b.d.e;
import b.t.c.b.b.d.f;
import b.t.c.b.b.d.k$_b;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class k {
    public static final k$_b \u00d400000 = new k$_b(null);
    private final e Object;
    private transient k o00000;
    public static final k \u00d200000 = new k("");

    public k(String string) {
        this.Object = new e(string, this);
    }

    public k(e e2) {
        this.Object = e2;
    }

    private k(e e2, k k2) {
        this.Object = e2;
        this.o00000 = k2;
    }

    public final String super() {
        return this.Object.\u00d300000();
    }

    public final e \u00d800000() {
        return this.Object;
    }

    public final boolean \u00d600000() {
        return this.Object.int();
    }

    public final k \u00d300000() {
        k k2;
        k k3 = this.o00000;
        if (k3 != null) {
            return k3;
        }
        if (!(!this.\u00d600000())) {
            String string = "root";
            throw new IllegalStateException(string.toString());
        }
        this.o00000 = k2 = (k3 = new k(this.Object.\u00d200000()));
        return k3;
    }

    public final k \u00d200000(f f2) {
        return new k(this.Object.super(f2), this);
    }

    public final f \u00d400000() {
        return this.Object.class();
    }

    public final f \u00d200000() {
        return this.Object.\u00d400000();
    }

    public final List class() {
        return this.Object.\u00d600000();
    }

    public final boolean super(f f2) {
        return this.Object.\u00d200000(f2);
    }

    public final String toString() {
        return this.Object.toString();
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof k)) {
            return false;
        }
        return fc.o00000((Object)this.Object, (Object)((k)object).Object);
    }

    public final int hashCode() {
        return this.Object.hashCode();
    }
}

