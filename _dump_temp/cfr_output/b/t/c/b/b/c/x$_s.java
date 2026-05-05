/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.c;

import b.ac;
import b.o.d.w;
import b.t.c.b.b.c.x$_p;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class x$_s
extends x$_p {
    private final int \u00f4O0000;

    private x$_s(int n2) {
        super(null);
        this.\u00f4O0000 = n2;
    }

    public final int newsuper() {
        return this.\u00f4O0000;
    }

    public final int hashCode() {
        return ac.OO0000(this.\u00f4O0000);
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof x$_s)) {
            return false;
        }
        object = (x$_s)object;
        return this.\u00f4O0000 == ((x$_s)object).\u00f4O0000;
    }

    @Override
    public final /* synthetic */ Object null() {
        return ac.return(this.newsuper());
    }

    public /* synthetic */ x$_s(int n2, w w2) {
        this(n2);
    }
}

