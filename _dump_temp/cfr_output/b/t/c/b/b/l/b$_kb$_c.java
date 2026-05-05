/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.l;

import b.t.c.b.b.l.b$_kb;
import b.t.c.b.b.l.b$_kb$_b;
import b.t.c.b.b.l.b$_nb;
import b.t.c.b.b.l.b$_r;
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
public final class b$_kb$_c
extends d$_f
implements b$_r {
    private int \u00d5oO000;
    private int \u00f8OO000;
    private int \u00f6OO000;
    private b$_kb$_b thisif = b$_kb$_b.Stringclass;
    private b$_nb Stringif = b$_nb.\u00d2o\u00d4000();
    private int \u00d3oO000;
    private List \u00d2oO000 = Collections.emptyList();
    private List ooO000 = Collections.emptyList();

    private b$_kb$_c() {
        this.\u00d2\u00f6O000();
    }

    private void \u00d2\u00f6O000() {
    }

    private static b$_kb$_c intprivate() {
        return new b$_kb$_c();
    }

    public final b$_kb$_c \u00d8\u00f6O000() {
        return b$_kb$_c.intprivate().\u00d200000(this.\u00d6\u00f6O000());
    }

    public final b$_kb \u00d4\u00f6O000() {
        return b$_kb.\u00d20o000();
    }

    public final b$_kb \u00f4\u00f6O000() {
        b$_kb b$_kb = this.\u00d6\u00f6O000();
        if (!b$_kb.\u00d200000()) {
            throw b$_kb$_c.super(b$_kb);
        }
        return b$_kb;
    }

    public final b$_kb \u00d6\u00f6O000() {
        b$_kb b$_kb = new b$_kb(this, null);
        int n2 = this.\u00d5oO000;
        int n3 = 0;
        if ((n2 & 1) == 1) {
            n3 = 1;
        }
        b$_kb.\u00d400000(b$_kb, this.\u00f8OO000);
        if ((n2 & 2) == 2) {
            n3 |= 2;
        }
        b$_kb.\u00d300000(b$_kb, this.\u00f6OO000);
        if ((n2 & 4) == 4) {
            n3 |= 4;
        }
        b$_kb.super(b$_kb, this.thisif);
        if ((n2 & 8) == 8) {
            n3 |= 8;
        }
        b$_kb.super(b$_kb, this.Stringif);
        if ((n2 & 0x10) == 16) {
            n3 |= 0x10;
        }
        b$_kb.\u00d200000(b$_kb, this.\u00d3oO000);
        if ((this.\u00d5oO000 & 0x20) == 32) {
            this.\u00d2oO000 = Collections.unmodifiableList(this.\u00d2oO000);
            this.\u00d5oO000 &= 0xFFFFFFDF;
        }
        b$_kb.\u00d200000(b$_kb, this.\u00d2oO000);
        if ((this.\u00d5oO000 & 0x40) == 64) {
            this.ooO000 = Collections.unmodifiableList(this.ooO000);
            this.\u00d5oO000 &= 0xFFFFFFBF;
        }
        b$_kb.super(b$_kb, this.ooO000);
        b$_kb.super(b$_kb, n3);
        return b$_kb;
    }

    public final b$_kb$_c \u00d200000(b$_kb b$_kb) {
        if (b$_kb == b$_kb.\u00d20o000()) {
            return this;
        }
        if (b$_kb.\u00d6\u00f8O000()) {
            this.\u00d6o0000(b$_kb.interfaceprivate());
        }
        if (b$_kb.floatinterface()) {
            this.floatsuper(b$_kb.\u00d40o000());
        }
        if (b$_kb.O0o000()) {
            this.super(b$_kb.\u00f4\u00f8O000());
        }
        if (b$_kb.voidinterface()) {
            this.super(b$_kb.\u00f6\u00f8O000());
        }
        if (b$_kb.\u00d3\u00f8O000()) {
            this.\u00d3o0000(b$_kb.Objectinterface());
        }
        if (!b$_kb.class(b$_kb).isEmpty()) {
            if (this.\u00d2oO000.isEmpty()) {
                this.\u00d2oO000 = b$_kb.class(b$_kb);
                this.\u00d5oO000 &= 0xFFFFFFDF;
            } else {
                this.\u00d3\u00f6O000();
                this.\u00d2oO000.addAll(b$_kb.class(b$_kb));
            }
        }
        if (!b$_kb.\u00d400000(b$_kb).isEmpty()) {
            if (this.ooO000.isEmpty()) {
                this.ooO000 = b$_kb.\u00d400000(b$_kb);
                this.\u00d5oO000 &= 0xFFFFFFBF;
            } else {
                this.O\u00f8O000();
                this.ooO000.addAll(b$_kb.\u00d400000(b$_kb));
            }
        }
        b$_kb$_c b$_kb$_c = this;
        b$_kb$_c.super(b$_kb$_c.class().o00000(b$_kb.\u00d600000(b$_kb)));
        return this;
    }

    @Override
    public final boolean \u00d200000() {
        int n2;
        if (this.doprivate() && !this.\u00f6\u00f6O000().\u00d200000()) {
            return false;
        }
        for (n2 = 0; n2 < this.superprivate(); ++n2) {
            if (this.\u00d4o0000(n2).\u00d200000()) continue;
            return false;
        }
        for (n2 = 0; n2 < this.\u00f8\u00f6O000(); ++n2) {
            if (this.\u00d2o0000(n2).\u00d200000()) continue;
            return false;
        }
        return true;
    }

    public final b$_kb$_c \u00d3O0000(ab object, s s2) throws IOException {
        b$_kb b$_kb = null;
        try {
            b$_kb = (b$_kb)b$_kb.\u00d6oO000.o00000((ab)object, s2);
        }
        catch (g g2) {
            object = g2;
            b$_kb = (b$_kb)g2.o00000();
            throw object;
        }
        finally {
            if (b$_kb != null) {
                this.\u00d200000(b$_kb);
            }
        }
        return this;
    }

    public final b$_kb$_c \u00d6o0000(int n2) {
        this.\u00d5oO000 |= 1;
        this.\u00f8OO000 = n2;
        return this;
    }

    public final b$_kb$_c floatsuper(int n2) {
        this.\u00d5oO000 |= 2;
        this.\u00f6OO000 = n2;
        return this;
    }

    public final b$_kb$_c super(b$_kb$_b b$_kb$_b) {
        if (b$_kb$_b == null) {
            throw new NullPointerException();
        }
        this.\u00d5oO000 |= 4;
        this.thisif = b$_kb$_b;
        return this;
    }

    public final boolean doprivate() {
        return (this.\u00d5oO000 & 8) == 8;
    }

    public final b$_nb \u00f6\u00f6O000() {
        return this.Stringif;
    }

    public final b$_kb$_c super(b$_nb b$_nb) {
        this.Stringif = (this.\u00d5oO000 & 8) == 8 && this.Stringif != b$_nb.\u00d2o\u00d4000() ? b$_nb.Objectsuper(this.Stringif).\u00d3O0000(b$_nb).\u00f60\u00d4000() : b$_nb;
        this.\u00d5oO000 |= 8;
        return this;
    }

    public final b$_kb$_c \u00d3o0000(int n2) {
        this.\u00d5oO000 |= 0x10;
        this.\u00d3oO000 = n2;
        return this;
    }

    private void \u00d3\u00f6O000() {
        if ((this.\u00d5oO000 & 0x20) != 32) {
            this.\u00d2oO000 = new ArrayList(this.\u00d2oO000);
            this.\u00d5oO000 |= 0x20;
        }
    }

    public final int superprivate() {
        return this.\u00d2oO000.size();
    }

    public final b$_kb \u00d4o0000(int n2) {
        return (b$_kb)this.\u00d2oO000.get(n2);
    }

    private void O\u00f8O000() {
        if ((this.\u00d5oO000 & 0x40) != 64) {
            this.ooO000 = new ArrayList(this.ooO000);
            this.\u00d5oO000 |= 0x40;
        }
    }

    public final int \u00f8\u00f6O000() {
        return this.ooO000.size();
    }

    public final b$_kb \u00d2o0000(int n2) {
        return (b$_kb)this.ooO000.get(n2);
    }

    static /* synthetic */ b$_kb$_c classprivate() {
        return b$_kb$_c.intprivate();
    }
}

