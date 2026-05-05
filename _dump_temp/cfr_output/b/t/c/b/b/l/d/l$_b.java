/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.l.d;

import b.t.c.b.b.l.d.l$1;
import b.t.c.b.b.l.d.l$_c;
import b.t.c.b.b.l.d.l$_d;
import b.t.c.b.b.p.t$_c;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public abstract class l$_b {
    public final int new;
    public final int o00000;

    public static l$_b super(l$_b l$_b, t$_c[] t$_cArray) {
        int n2 = l$_b.new + l$_b.o00000;
        return new l$_d(n2, t$_cArray);
    }

    public static l$_c super() {
        return new l$_c(0);
    }

    public static l$_c super(l$_b l$_b) {
        int n2 = l$_b.new + l$_b.o00000;
        return new l$_c(n2);
    }

    private l$_b(int n2, int n3) {
        this.new = n2;
        this.o00000 = n3;
    }

    public abstract Object super(int var1);

    public abstract int super(Object var1);

    /* synthetic */ l$_b(int n2, int n3, l$1 l$1) {
        this(n2, n3);
    }
}

