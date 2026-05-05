/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.l;

import b.t.c.b.b.l.b$_g;
import b.t.c.b.b.l.b$_ib;
import b.t.c.b.b.p.ab;
import b.t.c.b.b.p.d$_f;
import b.t.c.b.b.p.g;
import b.t.c.b.b.p.s;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class b$_g$_b
extends d$_f
implements b$_ib {
    private int \u00f5\u00d30000;
    private List newObject = Collections.emptyList();

    private b$_g$_b() {
        this.\u00d8\u00d60000();
    }

    private void \u00d8\u00d60000() {
    }

    private static b$_g$_b O\u00d80000() {
        return new b$_g$_b();
    }

    public final b$_g$_b \u00f8\u00d60000() {
        return b$_g$_b.O\u00d80000().super(this.\u00f6\u00d60000());
    }

    public final b$_g \u00f4\u00d60000() {
        return b$_g.\u00d4\u00d80000();
    }

    public final b$_g Objectclass() {
        b$_g b$_g = this.\u00f6\u00d60000();
        if (!b$_g.\u00d200000()) {
            throw b$_g$_b.super(b$_g);
        }
        return b$_g;
    }

    public final b$_g \u00f6\u00d60000() {
        b$_g b$_g = new b$_g(this, null);
        if ((this.\u00f5\u00d30000 & 1) == 1) {
            this.newObject = Collections.unmodifiableList(this.newObject);
            this.\u00f5\u00d30000 &= 0xFFFFFFFE;
        }
        b$_g.super(b$_g, this.newObject);
        return b$_g;
    }

    public final b$_g$_b super(b$_g b$_g) {
        if (b$_g == b$_g.\u00d4\u00d80000()) {
            return this;
        }
        if (!b$_g.\u00d200000(b$_g).isEmpty()) {
            if (this.newObject.isEmpty()) {
                this.newObject = b$_g.\u00d200000(b$_g);
                this.\u00f5\u00d30000 &= 0xFFFFFFFE;
            } else {
                this.voidclass();
                this.newObject.addAll(b$_g.\u00d200000(b$_g));
            }
        }
        b$_g$_b b$_g$_b = this;
        b$_g$_b.super(b$_g$_b.class().o00000(b$_g.\u00d300000(b$_g)));
        return this;
    }

    @Override
    public final boolean \u00d200000() {
        return true;
    }

    public final b$_g$_b \u00d600000(ab object, s s2) throws IOException {
        b$_g b$_g = null;
        try {
            b$_g = (b$_g)b$_g.\u00d3\u00d40000.o00000((ab)object, s2);
        }
        catch (g g2) {
            object = g2;
            b$_g = (b$_g)g2.o00000();
            throw object;
        }
        finally {
            if (b$_g != null) {
                this.super(b$_g);
            }
        }
        return this;
    }

    private void voidclass() {
        if ((this.\u00f5\u00d30000 & 1) != 1) {
            this.newObject = new ArrayList(this.newObject);
            this.\u00f5\u00d30000 |= 1;
        }
    }

    static /* synthetic */ b$_g$_b \u00d2\u00d80000() {
        return b$_g$_b.O\u00d80000();
    }
}

