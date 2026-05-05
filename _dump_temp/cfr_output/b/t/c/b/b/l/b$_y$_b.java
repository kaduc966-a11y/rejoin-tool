/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.l;

import b.t.c.b.b.l.b$_w;
import b.t.c.b.b.l.b$_y;
import b.t.c.b.b.p.ab;
import b.t.c.b.b.p.b;
import b.t.c.b.b.p.d$_f;
import b.t.c.b.b.p.g;
import b.t.c.b.b.p.s;
import java.io.IOException;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class b$_y$_b
extends d$_f
implements b$_w {
    private int \u00d5\u00d80000;
    private int ifclass;
    private b \u00d6\u00d80000 = b.o00000;

    private b$_y$_b() {
        this.\u00d40O000();
    }

    private void \u00d40O000() {
    }

    private static b$_y$_b \u00d60O000() {
        return new b$_y$_b();
    }

    public final b$_y$_b \u00d30O000() {
        return b$_y$_b.\u00d60O000().super(this.\u00f60O000());
    }

    public final b$_y \u00f40O000() {
        return b$_y.publicint();
    }

    public final b$_y interfacenull() {
        b$_y b$_y = this.\u00f60O000();
        if (!b$_y.\u00d200000()) {
            throw b$_y$_b.super(b$_y);
        }
        return b$_y;
    }

    public final b$_y \u00f60O000() {
        b$_y b$_y = new b$_y(this, null);
        int n2 = this.\u00d5\u00d80000;
        int n3 = 0;
        if ((n2 & 1) == 1) {
            n3 = 1;
        }
        b$_y.\u00d200000(b$_y, this.ifclass);
        if ((n2 & 2) == 2) {
            n3 |= 2;
        }
        b$_y.super(b$_y, this.\u00d6\u00d80000);
        b$_y.super(b$_y, n3);
        return b$_y;
    }

    public final b$_y$_b super(b$_y b$_y) {
        if (b$_y == b$_y.publicint()) {
            return this;
        }
        if (b$_y.\u00d6OO000()) {
            this.\u00f800000(b$_y.voidint());
        }
        if (b$_y.\u00d2OO000()) {
            this.\u00d200000(b$_y.OOO000());
        }
        b$_y$_b b$_y$_b = this;
        b$_y$_b.super(b$_y$_b.class().o00000(b$_y.\u00d200000(b$_y)));
        return this;
    }

    @Override
    public final boolean \u00d200000() {
        if (!this.Objectint()) {
            return false;
        }
        return this.\u00d80O000();
    }

    public final b$_y$_b int(ab object, s s2) throws IOException {
        b$_y b$_y = null;
        try {
            b$_y = (b$_y)b$_y.\u00d2\u00f40000.o00000((ab)object, s2);
        }
        catch (g g2) {
            object = g2;
            b$_y = (b$_y)g2.o00000();
            throw object;
        }
        finally {
            if (b$_y != null) {
                this.super(b$_y);
            }
        }
        return this;
    }

    public final boolean Objectint() {
        return (this.\u00d5\u00d80000 & 1) == 1;
    }

    public final b$_y$_b \u00f800000(int n2) {
        this.\u00d5\u00d80000 |= 1;
        this.ifclass = n2;
        return this;
    }

    public final boolean \u00d80O000() {
        return (this.\u00d5\u00d80000 & 2) == 2;
    }

    public final b$_y$_b \u00d200000(b b2) {
        if (b2 == null) {
            throw new NullPointerException();
        }
        this.\u00d5\u00d80000 |= 2;
        this.\u00d6\u00d80000 = b2;
        return this;
    }

    static /* synthetic */ b$_y$_b \u00f80O000() {
        return b$_y$_b.\u00d60O000();
    }
}

