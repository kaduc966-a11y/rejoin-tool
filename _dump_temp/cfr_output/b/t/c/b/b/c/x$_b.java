/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.c;

import b.dd;
import b.o.d.w;
import b.t.c.b.b.c.x$_p;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class x$_b
extends x$_p {
    private final short \u00f5O0000;

    private x$_b(short s2) {
        super(null);
        this.\u00f5O0000 = s2;
    }

    public final short \u00f5O0000() {
        return this.\u00f5O0000;
    }

    public final int hashCode() {
        return dd.String(this.\u00f5O0000);
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof x$_b)) {
            return false;
        }
        object = (x$_b)object;
        return this.\u00f5O0000 == ((x$_b)object).\u00f5O0000;
    }

    @Override
    public final /* synthetic */ Object null() {
        return dd.\u00d6O0000(this.\u00f5O0000());
    }

    public /* synthetic */ x$_b(short s2, w w2) {
        this(s2);
    }
}

