/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.l;

import b.t.c.b.b.l.b$_cb;
import b.t.c.b.b.l.b$_g;
import b.t.c.b.b.l.b$_i;
import b.t.c.b.b.l.b$_j;
import b.t.c.b.b.l.b$_mb;
import b.t.c.b.b.l.b$_n;
import b.t.c.b.b.l.b$_z;
import b.t.c.b.b.p.ab;
import b.t.c.b.b.p.d$_g;
import b.t.c.b.b.p.g;
import b.t.c.b.b.p.s;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class b$_i$_b
extends d$_g
implements b$_cb {
    private int Stringnewsuper;
    private List thisnewsuper = Collections.emptyList();
    private List \u00d3\u00d3o000 = Collections.emptyList();
    private List \u00d2\u00d3o000 = Collections.emptyList();
    private b$_mb \u00f8\u00d2o000 = b$_mb.\u00d4oo000();
    private b$_g o\u00d3o000 = b$_g.\u00d4\u00d80000();

    private b$_i$_b() {
        this.\u00d6\u00f4\u00d2000();
    }

    private void \u00d6\u00f4\u00d2000() {
    }

    private static b$_i$_b \u00d8\u00f4\u00d2000() {
        return new b$_i$_b();
    }

    public final b$_i$_b \u00d6\u00f5\u00d2000() {
        return b$_i$_b.\u00d8\u00f4\u00d2000().\u00d200000(this.interfacewhilesuper());
    }

    public final b$_i \u00d8\u00f5\u00d2000() {
        return b$_i.voidpublicsuper();
    }

    public final b$_i \u00d4\u00f5\u00d2000() {
        b$_i b$_i = this.interfacewhilesuper();
        if (!b$_i.\u00d200000()) {
            throw b$_i$_b.super(b$_i);
        }
        return b$_i;
    }

    public final b$_i interfacewhilesuper() {
        b$_i b$_i = new b$_i(this, null);
        int n2 = this.Stringnewsuper;
        int n3 = 0;
        if ((this.Stringnewsuper & 1) == 1) {
            this.thisnewsuper = Collections.unmodifiableList(this.thisnewsuper);
            this.Stringnewsuper &= 0xFFFFFFFE;
        }
        b$_i.super(b$_i, this.thisnewsuper);
        if ((this.Stringnewsuper & 2) == 2) {
            this.\u00d3\u00d3o000 = Collections.unmodifiableList(this.\u00d3\u00d3o000);
            this.Stringnewsuper &= 0xFFFFFFFD;
        }
        b$_i.\u00d300000(b$_i, this.\u00d3\u00d3o000);
        if ((this.Stringnewsuper & 4) == 4) {
            this.\u00d2\u00d3o000 = Collections.unmodifiableList(this.\u00d2\u00d3o000);
            this.Stringnewsuper &= 0xFFFFFFFB;
        }
        b$_i.\u00d200000(b$_i, this.\u00d2\u00d3o000);
        if ((n2 & 8) == 8) {
            n3 = 1;
        }
        b$_i.super(b$_i, this.\u00f8\u00d2o000);
        if ((n2 & 0x10) == 16) {
            n3 |= 2;
        }
        b$_i.super(b$_i, this.o\u00d3o000);
        b$_i.super(b$_i, n3);
        return b$_i;
    }

    public final b$_i$_b \u00d200000(b$_i b$_i) {
        if (b$_i == b$_i.voidpublicsuper()) {
            return this;
        }
        if (!b$_i.class(b$_i).isEmpty()) {
            if (this.thisnewsuper.isEmpty()) {
                this.thisnewsuper = b$_i.class(b$_i);
                this.Stringnewsuper &= 0xFFFFFFFE;
            } else {
                this.\u00f6\u00f4\u00d2000();
                this.thisnewsuper.addAll(b$_i.class(b$_i));
            }
        }
        if (!b$_i.\u00d600000(b$_i).isEmpty()) {
            if (this.\u00d3\u00d3o000.isEmpty()) {
                this.\u00d3\u00d3o000 = b$_i.\u00d600000(b$_i);
                this.Stringnewsuper &= 0xFFFFFFFD;
            } else {
                this.dowhilesuper();
                this.\u00d3\u00d3o000.addAll(b$_i.\u00d600000(b$_i));
            }
        }
        if (!b$_i.\u00d400000(b$_i).isEmpty()) {
            if (this.\u00d2\u00d3o000.isEmpty()) {
                this.\u00d2\u00d3o000 = b$_i.\u00d400000(b$_i);
                this.Stringnewsuper &= 0xFFFFFFFB;
            } else {
                this.\u00f8\u00f4\u00d2000();
                this.\u00d2\u00d3o000.addAll(b$_i.\u00d400000(b$_i));
            }
        }
        if (b$_i.floatpublicsuper()) {
            this.\u00d600000(b$_i.O\u00f6\u00d2000());
        }
        if (b$_i.\u00f6\u00f6\u00d2000()) {
            this.\u00d600000(b$_i.\u00f4\u00f5\u00d2000());
        }
        this.super(b$_i);
        b$_i$_b b$_i$_b = this;
        b$_i$_b.super(b$_i$_b.class().o00000(b$_i.\u00d800000(b$_i)));
        return this;
    }

    @Override
    public final boolean \u00d200000() {
        int n2;
        for (n2 = 0; n2 < this.classwhilesuper(); ++n2) {
            if (this.\u00f6\u00d50000(n2).\u00d200000()) continue;
            return false;
        }
        for (n2 = 0; n2 < this.intwhilesuper(); ++n2) {
            if (this.\u00f8\u00d50000(n2).\u00d200000()) continue;
            return false;
        }
        for (n2 = 0; n2 < this.O\u00f5\u00d2000(); ++n2) {
            if (this.intString(n2).\u00d200000()) continue;
            return false;
        }
        if (this.\u00d2\u00f5\u00d2000() && !this.\u00d3\u00f5\u00d2000().\u00d200000()) {
            return false;
        }
        return this.classStringsuper();
    }

    public final b$_i$_b Oo0000(ab object, s s2) throws IOException {
        b$_i b$_i = null;
        try {
            b$_i = (b$_i)b$_i.\u00d5\u00d3o000.o00000((ab)object, s2);
        }
        catch (g g2) {
            object = g2;
            b$_i = (b$_i)g2.o00000();
            throw object;
        }
        finally {
            if (b$_i != null) {
                this.\u00d200000(b$_i);
            }
        }
        return this;
    }

    private void \u00f6\u00f4\u00d2000() {
        if ((this.Stringnewsuper & 1) != 1) {
            this.thisnewsuper = new ArrayList(this.thisnewsuper);
            this.Stringnewsuper |= 1;
        }
    }

    public final int classwhilesuper() {
        return this.thisnewsuper.size();
    }

    public final b$_z \u00f6\u00d50000(int n2) {
        return (b$_z)this.thisnewsuper.get(n2);
    }

    private void dowhilesuper() {
        if ((this.Stringnewsuper & 2) != 2) {
            this.\u00d3\u00d3o000 = new ArrayList(this.\u00d3\u00d3o000);
            this.Stringnewsuper |= 2;
        }
    }

    public final int intwhilesuper() {
        return this.\u00d3\u00d3o000.size();
    }

    public final b$_n \u00f8\u00d50000(int n2) {
        return (b$_n)this.\u00d3\u00d3o000.get(n2);
    }

    private void \u00f8\u00f4\u00d2000() {
        if ((this.Stringnewsuper & 4) != 4) {
            this.\u00d2\u00d3o000 = new ArrayList(this.\u00d2\u00d3o000);
            this.Stringnewsuper |= 4;
        }
    }

    public final int O\u00f5\u00d2000() {
        return this.\u00d2\u00d3o000.size();
    }

    public final b$_j intString(int n2) {
        return (b$_j)this.\u00d2\u00d3o000.get(n2);
    }

    public final boolean \u00d2\u00f5\u00d2000() {
        return (this.Stringnewsuper & 8) == 8;
    }

    public final b$_mb \u00d3\u00f5\u00d2000() {
        return this.\u00f8\u00d2o000;
    }

    public final b$_i$_b \u00d600000(b$_mb b$_mb) {
        this.\u00f8\u00d2o000 = (this.Stringnewsuper & 8) == 8 && this.\u00f8\u00d2o000 != b$_mb.\u00d4oo000() ? b$_mb.\u00d400000(this.\u00f8\u00d2o000).super(b$_mb).\u00d6Oo000() : b$_mb;
        this.Stringnewsuper |= 8;
        return this;
    }

    public final b$_i$_b \u00d600000(b$_g b$_g) {
        this.o\u00d3o000 = (this.Stringnewsuper & 0x10) == 16 && this.o\u00d3o000 != b$_g.\u00d4\u00d80000() ? b$_g.\u00d400000(this.o\u00d3o000).super(b$_g).\u00f6\u00d60000() : b$_g;
        this.Stringnewsuper |= 0x10;
        return this;
    }

    static /* synthetic */ b$_i$_b \u00f4\u00f4\u00d2000() {
        return b$_i$_b.\u00d8\u00f4\u00d2000();
    }
}

