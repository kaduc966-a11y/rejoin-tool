/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.l.b;

import b.t.c.b.b.p.d$_f;
import b.t.c.b.b.p.v$_b;
import java.util.Arrays;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
final class d {
    private final d$_f \u00d300000;
    private final byte[] o00000;
    private final int new;

    public d(d$_f d$_f) {
        this.\u00d300000 = d$_f;
        this.o00000 = ((v$_b)this.\u00d300000).\u00d300000().OO0000();
        this.new = Arrays.hashCode(this.o00000);
    }

    public final int hashCode() {
        return this.new;
    }

    public final boolean equals(Object object) {
        return object instanceof d && Arrays.equals(this.o00000, ((d)object).o00000);
    }
}

