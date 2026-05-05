/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.d;

import b.o.d.w;
import b.q.f;
import b.t.c.b.b.d.d;
import b.t.c.b.b.d.k;

public final class d$_b {
    private d$_b() {
    }

    public final d o00000(k k2) {
        return new d(k2.\u00d300000(), k2.\u00d400000());
    }

    public final d o00000(String string, boolean bl) {
        String string2;
        int n2 = f.super((CharSequence)string, '`', 0, false, 6, null);
        if ((n2 = f.\u00d200000((CharSequence)string, "/", n2 == -1 ? string.length() : n2, false, 4, null)) == -1) {
            string2 = "";
            string = f.super(string, "`", "", false, 4, null);
        } else {
            string2 = f.super(string.substring(0, n2), '/', '.', false, 4, null);
            string = f.super(string.substring(n2 + 1), "`", "", false, 4, null);
        }
        return new d(new k(string2), new k(string), bl);
    }

    public static /* synthetic */ d o00000(d$_b d$_b, String string, boolean bl, int n2, Object object) {
        if ((n2 & 2) != 0) {
            bl = false;
        }
        return d$_b.o00000(string, bl);
    }

    public /* synthetic */ d$_b(w w2) {
        this();
    }
}

