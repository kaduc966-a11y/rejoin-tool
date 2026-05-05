/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.n.b;

import b.o.d.fc;
import b.o.d.w;
import b.t.c.b.b.n.b.t$_b;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class t {
    public static final t$_b new = new t$_b(null);
    private final String o00000;

    private t(String string) {
        this.o00000 = string;
    }

    public final String super() {
        return this.o00000;
    }

    public final String toString() {
        return "MemberSignature(signature=" + this.o00000 + ')';
    }

    public final int hashCode() {
        return this.o00000.hashCode();
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof t)) {
            return false;
        }
        object = (t)object;
        return fc.o00000((Object)this.o00000, (Object)((t)object).o00000);
    }

    public /* synthetic */ t(String string, w w2) {
        this(string);
    }
}

