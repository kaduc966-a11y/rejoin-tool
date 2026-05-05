/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.l.d;

import b.o.d.w;
import b.t.c.b.b.l.d.b$_b;

public final class b$_b$_b {
    private b$_b$_b() {
    }

    public final b$_b o00000(Integer n2, Integer n3) {
        if (n3 != null) {
            return new b$_b((int)(n3 & 0xFF), n3 >> 8 & 0xFF, n3 >> 16 & 0xFF);
        }
        if (n2 != null) {
            return new b$_b(n2 & 7, n2 >> 3 & 0xF, n2 >> 7 & 0x7F);
        }
        return b$_b.new;
    }

    public /* synthetic */ b$_b$_b(w w2) {
        this();
    }
}

