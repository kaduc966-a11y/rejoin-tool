/*
 * Decompiled with CFR 0.152.
 */
package b.q.b;

import b.q.t;
import b.q.u;
import b.q.w;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class b {
    public static final t super(u u2, String string) {
        w w2 = u2 instanceof w ? (w)u2 : null;
        if (w2 == null) {
            throw new UnsupportedOperationException("Retrieving groups by name is not supported on this platform.");
        }
        return w2.o00000(string);
    }
}

