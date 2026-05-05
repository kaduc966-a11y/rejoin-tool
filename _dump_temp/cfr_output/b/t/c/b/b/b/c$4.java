/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.b;

import b.o.e.h;
import b.t.c.b.b.b.c;
import b.t.c.b.b.q.b.nb;

class c$4
implements h {
    final /* synthetic */ nb \u00d30O000;
    final /* synthetic */ c whilenull;

    c$4(c c2, nb nb2) {
        this.whilenull = c2;
        this.\u00d30O000 = nb2;
    }

    public Void \u00d3\u00f40000() {
        if (c.o00000(this.whilenull) != null) {
            throw new AssertionError((Object)("Built-ins module is already set: " + c.o00000(this.whilenull) + " (attempting to reset to " + this.\u00d30O000 + ")"));
        }
        c.o00000(this.whilenull, this.\u00d30O000);
        return null;
    }
}

