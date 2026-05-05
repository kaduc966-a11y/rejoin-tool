/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.l;

import b.t.c.b.b.l.b$_ab;
import b.t.c.b.b.l.b$_lb;
import b.t.c.b.b.l.b$_o;
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
public final class b$_ab$_b
extends d$_f
implements b$_lb {
    private int Stringreturn;
    private List \u00d3\u00f40000 = Collections.emptyList();

    private b$_ab$_b() {
        this.\u00f8OO000();
    }

    private void \u00f8OO000() {
    }

    private static b$_ab$_b \u00d3oO000() {
        return new b$_ab$_b();
    }

    public final b$_ab$_b OoO000() {
        return b$_ab$_b.\u00d3oO000().super(this.\u00d2oO000());
    }

    public final b$_ab \u00d4oO000() {
        return b$_ab.intif();
    }

    public final b$_ab classif() {
        b$_ab b$_ab = this.\u00d2oO000();
        if (!b$_ab.\u00d200000()) {
            throw b$_ab$_b.super(b$_ab);
        }
        return b$_ab;
    }

    public final b$_ab \u00d2oO000() {
        b$_ab b$_ab = new b$_ab(this, null);
        if ((this.Stringreturn & 1) == 1) {
            this.\u00d3\u00f40000 = Collections.unmodifiableList(this.\u00d3\u00f40000);
            this.Stringreturn &= 0xFFFFFFFE;
        }
        b$_ab.super(b$_ab, this.\u00d3\u00f40000);
        return b$_ab;
    }

    public final b$_ab$_b super(b$_ab b$_ab) {
        if (b$_ab == b$_ab.intif()) {
            return this;
        }
        if (!b$_ab.\u00d400000(b$_ab).isEmpty()) {
            if (this.\u00d3\u00f40000.isEmpty()) {
                this.\u00d3\u00f40000 = b$_ab.\u00d400000(b$_ab);
                this.Stringreturn &= 0xFFFFFFFE;
            } else {
                this.\u00d6oO000();
                this.\u00d3\u00f40000.addAll(b$_ab.\u00d400000(b$_ab));
            }
        }
        b$_ab$_b b$_ab$_b = this;
        b$_ab$_b.super(b$_ab$_b.class().o00000(b$_ab.\u00d200000(b$_ab)));
        return this;
    }

    @Override
    public final boolean \u00d200000() {
        for (int i2 = 0; i2 < this.\u00f6OO000(); ++i2) {
            if (this.OO0000(i2).\u00d200000()) continue;
            return false;
        }
        return true;
    }

    public final b$_ab$_b \u00f600000(ab object, s s2) throws IOException {
        b$_ab b$_ab = null;
        try {
            b$_ab = (b$_ab)b$_ab.\u00f6\u00f40000.o00000((ab)object, s2);
        }
        catch (g g2) {
            object = g2;
            b$_ab = (b$_ab)g2.o00000();
            throw object;
        }
        finally {
            if (b$_ab != null) {
                this.super(b$_ab);
            }
        }
        return this;
    }

    private void \u00d6oO000() {
        if ((this.Stringreturn & 1) != 1) {
            this.\u00d3\u00f40000 = new ArrayList(this.\u00d3\u00f40000);
            this.Stringreturn |= 1;
        }
    }

    public final int \u00f6OO000() {
        return this.\u00d3\u00f40000.size();
    }

    public final b$_o OO0000(int n2) {
        return (b$_o)this.\u00d3\u00f40000.get(n2);
    }

    static /* synthetic */ b$_ab$_b superif() {
        return b$_ab$_b.\u00d3oO000();
    }
}

