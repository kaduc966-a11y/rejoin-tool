/*
 * Decompiled with CFR 0.152.
 */
package b.q;

import b.e.m;
import b.g.c;
import b.m.s;
import b.q.b;
import b.q.n;
import b.q.t;
import b.q.w;
import b.s.mc;
import b.s.vc;
import java.util.Iterator;

public final class n$_b$1
extends vc
implements w {
    final /* synthetic */ n o00000;

    n$_b$1(n n2) {
        this.o00000 = n2;
    }

    @Override
    public final int o00000() {
        return n.super(this.o00000).groupCount() + 1;
    }

    @Override
    public final boolean isEmpty() {
        return false;
    }

    @Override
    public final Iterator iterator() {
        return c.\u00f5\u00d30000(mc.\u00d5o0000(mc.new(this)), arg_0 -> n$_b$1.o00000(this, arg_0)).o00000();
    }

    @Override
    public final t o00000(int n2) {
        m m2 = b.\u00d200000(n.super(this.o00000), n2);
        if (m2.\u00d5o0000() >= 0) {
            return new t(n.super(this.o00000).group(n2), m2);
        }
        return null;
    }

    @Override
    public final t o00000(String string) {
        return s.o00000.o00000(n.super(this.o00000), string);
    }

    private static final t o00000(n$_b$1 n$_b$1, int n2) {
        return n$_b$1.o00000(n2);
    }
}

