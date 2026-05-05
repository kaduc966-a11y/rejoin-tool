/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.b.b;

import b.o.d.fc;
import b.t.c.b.b.b.b.b;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class e$_b {
    private final b super;
    private final int \u00d200000;

    public e$_b(b b2, int n2) {
        this.super = b2;
        this.\u00d200000 = n2;
    }

    public final b \u00d300000() {
        return this.super;
    }

    public final b o00000() {
        return this.super;
    }

    public final int new() {
        return this.\u00d200000;
    }

    public final String toString() {
        return "KindWithArity(kind=" + this.super + ", arity=" + this.\u00d200000 + ')';
    }

    public final int hashCode() {
        return this.super.hashCode() * 31 + Integer.hashCode(this.\u00d200000);
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof e$_b)) {
            return false;
        }
        object = (e$_b)object;
        if (!fc.o00000((Object)this.super, (Object)((e$_b)object).super)) {
            return false;
        }
        return this.\u00d200000 == ((e$_b)object).\u00d200000;
    }
}

