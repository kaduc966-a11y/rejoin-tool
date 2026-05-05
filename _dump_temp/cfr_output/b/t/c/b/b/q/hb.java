/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.q;

import b.s.y;
import b.t.c.b.b.q.o;
import java.util.List;
import java.util.Map;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class hb
extends o {
    private final List o00000;
    private final Map new;

    public hb(List list) {
        super(null);
        this.o00000 = list;
        this.new = y.o00000(this.o00000());
    }

    public final List o00000() {
        return this.o00000;
    }

    public final String toString() {
        return "MultiFieldValueClassRepresentation(underlyingPropertyNamesToTypes=" + this.o00000() + ')';
    }
}

