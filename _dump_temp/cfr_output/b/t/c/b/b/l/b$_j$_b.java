/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.l;

import b.t.c.b.b.l.b$_b;
import b.t.c.b.b.l.b$_db;
import b.t.c.b.b.l.b$_j;
import b.t.c.b.b.l.b$_nb;
import b.t.c.b.b.l.b$_x;
import b.t.c.b.b.l.b$_y;
import b.t.c.b.b.p.ab;
import b.t.c.b.b.p.d$_c;
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
public final class b$_j$_b
extends d$_g
implements b$_x {
    private int privatenewsuper;
    private int \u00d2\u00d5o000 = 6;
    private int \u00f8\u00d4o000;
    private List \u00f6\u00d4o000 = Collections.emptyList();
    private b$_nb \u00d6\u00d4o000 = b$_nb.\u00d2o\u00d4000();
    private int \u00f5\u00d4o000;
    private b$_nb o\u00d5o000 = b$_nb.\u00d2o\u00d4000();
    private int returnObjectsuper;
    private List newObjectsuper = Collections.emptyList();
    private List \u00d5\u00d4o000 = Collections.emptyList();
    private List \u00d8\u00d4o000 = Collections.emptyList();

    private b$_j$_b() {
        this.\u00d20\u00d3000();
    }

    private void \u00d20\u00d3000() {
    }

    private static b$_j$_b \u00d30\u00d3000() {
        return new b$_j$_b();
    }

    public final b$_j$_b \u00f8\u00f8\u00d2000() {
        return b$_j$_b.\u00d30\u00d3000().super(this.O0\u00d3000());
    }

    public final b$_j superprivatesuper() {
        return b$_j.\u00d2o\u00d3000();
    }

    public final b$_j \u00f6\u00f8\u00d2000() {
        b$_j b$_j = this.O0\u00d3000();
        if (!b$_j.\u00d200000()) {
            throw b$_j$_b.super(b$_j);
        }
        return b$_j;
    }

    public final b$_j O0\u00d3000() {
        b$_j b$_j = new b$_j(this, null);
        int n2 = this.privatenewsuper;
        int n3 = 0;
        if ((n2 & 1) == 1) {
            n3 = 1;
        }
        b$_j.\u00d200000(b$_j, this.\u00d2\u00d5o000);
        if ((n2 & 2) == 2) {
            n3 |= 2;
        }
        b$_j.\u00d400000(b$_j, this.\u00f8\u00d4o000);
        if ((this.privatenewsuper & 4) == 4) {
            this.\u00f6\u00d4o000 = Collections.unmodifiableList(this.\u00f6\u00d4o000);
            this.privatenewsuper &= 0xFFFFFFFB;
        }
        b$_j.super(b$_j, this.\u00f6\u00d4o000);
        if ((n2 & 8) == 8) {
            n3 |= 4;
        }
        b$_j.\u00d200000(b$_j, this.\u00d6\u00d4o000);
        if ((n2 & 0x10) == 16) {
            n3 |= 8;
        }
        b$_j.class(b$_j, this.\u00f5\u00d4o000);
        if ((n2 & 0x20) == 32) {
            n3 |= 0x10;
        }
        b$_j.super(b$_j, this.o\u00d5o000);
        if ((n2 & 0x40) == 64) {
            n3 |= 0x20;
        }
        b$_j.super(b$_j, this.returnObjectsuper);
        if ((this.privatenewsuper & 0x80) == 128) {
            this.newObjectsuper = Collections.unmodifiableList(this.newObjectsuper);
            this.privatenewsuper &= 0xFFFFFF7F;
        }
        b$_j.\u00d400000(b$_j, this.newObjectsuper);
        if ((this.privatenewsuper & 0x100) == 256) {
            this.\u00d5\u00d4o000 = Collections.unmodifiableList(this.\u00d5\u00d4o000);
            this.privatenewsuper &= 0xFFFFFEFF;
        }
        b$_j.\u00d300000(b$_j, this.\u00d5\u00d4o000);
        if ((this.privatenewsuper & 0x200) == 512) {
            this.\u00d8\u00d4o000 = Collections.unmodifiableList(this.\u00d8\u00d4o000);
            this.privatenewsuper &= 0xFFFFFDFF;
        }
        b$_j.\u00d200000(b$_j, this.\u00d8\u00d4o000);
        b$_j.\u00d300000(b$_j, n3);
        return b$_j;
    }

    public final b$_j$_b super(b$_j b$_j) {
        if (b$_j == b$_j.\u00d2o\u00d3000()) {
            return this;
        }
        if (b$_j.\u00d6O\u00d3000()) {
            this.\u00d6\u00d60000(b$_j.floatinterfacesuper());
        }
        if (b$_j.classthisnew()) {
            this.\u00d4\u00d60000(b$_j.\u00f8O\u00d3000());
        }
        if (!b$_j.\u00d300000(b$_j).isEmpty()) {
            if (this.\u00f6\u00d4o000.isEmpty()) {
                this.\u00f6\u00d4o000 = b$_j.\u00d300000(b$_j);
                this.privatenewsuper &= 0xFFFFFFFB;
            } else {
                this.\u00d8\u00f8\u00d2000();
                this.\u00f6\u00d4o000.addAll(b$_j.\u00d300000(b$_j));
            }
        }
        if (b$_j.\u00d8O\u00d3000()) {
            this.int(b$_j.OO\u00d3000());
        }
        if (b$_j.\u00f6O\u00d3000()) {
            this.Objectclass(b$_j.\u00d3o\u00d3000());
        }
        if (b$_j.\u00f80\u00d3000()) {
            this.\u00f600000(b$_j.\u00d6o\u00d3000());
        }
        if (b$_j.\u00d2O\u00d3000()) {
            this.interfaceString(b$_j.\u00d4O\u00d3000());
        }
        if (!b$_j.\u00d800000(b$_j).isEmpty()) {
            if (this.newObjectsuper.isEmpty()) {
                this.newObjectsuper = b$_j.\u00d800000(b$_j);
                this.privatenewsuper &= 0xFFFFFF7F;
            } else {
                this.\u00d60\u00d3000();
                this.newObjectsuper.addAll(b$_j.\u00d800000(b$_j));
            }
        }
        if (!b$_j.\u00d400000(b$_j).isEmpty()) {
            if (this.\u00d5\u00d4o000.isEmpty()) {
                this.\u00d5\u00d4o000 = b$_j.\u00d400000(b$_j);
                this.privatenewsuper &= 0xFFFFFEFF;
            } else {
                this.\u00d6\u00f8\u00d2000();
                this.\u00d5\u00d4o000.addAll(b$_j.\u00d400000(b$_j));
            }
        }
        if (!b$_j.\u00d200000(b$_j).isEmpty()) {
            if (this.\u00d8\u00d4o000.isEmpty()) {
                this.\u00d8\u00d4o000 = b$_j.\u00d200000(b$_j);
                this.privatenewsuper &= 0xFFFFFDFF;
            } else {
                this.O\u00f8\u00d2000();
                this.\u00d8\u00d4o000.addAll(b$_j.\u00d200000(b$_j));
            }
        }
        this.super((d$_c)b$_j);
        b$_j$_b b$_j$_b = this;
        b$_j$_b.super(b$_j$_b.class().o00000(b$_j.class(b$_j)));
        return this;
    }

    @Override
    public final boolean \u00d200000() {
        int n2;
        if (!this.\u00d40\u00d3000()) {
            return false;
        }
        for (n2 = 0; n2 < this.\u00d3\u00f8\u00d2000(); ++n2) {
            if (this.\u00f4\u00d60000(n2).\u00d200000()) continue;
            return false;
        }
        if (this.\u00f4\u00f8\u00d2000() && !this.classprivatesuper().\u00d200000()) {
            return false;
        }
        if (this.\u00d4\u00f8\u00d2000() && !this.interfaceprivatesuper().\u00d200000()) {
            return false;
        }
        for (n2 = 0; n2 < this.doprivatesuper(); ++n2) {
            if (this.\u00d8\u00d60000(n2).\u00d200000()) continue;
            return false;
        }
        for (n2 = 0; n2 < this.intprivatesuper(); ++n2) {
            if (this.\u00d3\u00d60000(n2).\u00d200000()) continue;
            return false;
        }
        return this.classStringsuper();
    }

    public final b$_j$_b voidsuper(ab object, s s2) throws IOException {
        b$_j b$_j = null;
        try {
            b$_j = (b$_j)b$_j.\u00d3\u00d5o000.o00000((ab)object, s2);
        }
        catch (g g2) {
            object = g2;
            b$_j = (b$_j)g2.o00000();
            throw object;
        }
        finally {
            if (b$_j != null) {
                this.super(b$_j);
            }
        }
        return this;
    }

    public final b$_j$_b \u00d6\u00d60000(int n2) {
        this.privatenewsuper |= 1;
        this.\u00d2\u00d5o000 = n2;
        return this;
    }

    public final boolean \u00d40\u00d3000() {
        return (this.privatenewsuper & 2) == 2;
    }

    public final b$_j$_b \u00d4\u00d60000(int n2) {
        this.privatenewsuper |= 2;
        this.\u00f8\u00d4o000 = n2;
        return this;
    }

    private void \u00d8\u00f8\u00d2000() {
        if ((this.privatenewsuper & 4) != 4) {
            this.\u00f6\u00d4o000 = new ArrayList(this.\u00f6\u00d4o000);
            this.privatenewsuper |= 4;
        }
    }

    public final int \u00d3\u00f8\u00d2000() {
        return this.\u00f6\u00d4o000.size();
    }

    public final b$_b \u00f4\u00d60000(int n2) {
        return (b$_b)this.\u00f6\u00d4o000.get(n2);
    }

    public final boolean \u00f4\u00f8\u00d2000() {
        return (this.privatenewsuper & 8) == 8;
    }

    public final b$_nb classprivatesuper() {
        return this.\u00d6\u00d4o000;
    }

    public final b$_j$_b int(b$_nb b$_nb) {
        this.\u00d6\u00d4o000 = (this.privatenewsuper & 8) == 8 && this.\u00d6\u00d4o000 != b$_nb.\u00d2o\u00d4000() ? b$_nb.Objectsuper(this.\u00d6\u00d4o000).\u00d3O0000(b$_nb).\u00f60\u00d4000() : b$_nb;
        this.privatenewsuper |= 8;
        return this;
    }

    public final b$_j$_b Objectclass(int n2) {
        this.privatenewsuper |= 0x10;
        this.\u00f5\u00d4o000 = n2;
        return this;
    }

    public final boolean \u00d4\u00f8\u00d2000() {
        return (this.privatenewsuper & 0x20) == 32;
    }

    public final b$_nb interfaceprivatesuper() {
        return this.o\u00d5o000;
    }

    public final b$_j$_b \u00f600000(b$_nb b$_nb) {
        this.o\u00d5o000 = (this.privatenewsuper & 0x20) == 32 && this.o\u00d5o000 != b$_nb.\u00d2o\u00d4000() ? b$_nb.Objectsuper(this.o\u00d5o000).\u00d3O0000(b$_nb).\u00f60\u00d4000() : b$_nb;
        this.privatenewsuper |= 0x20;
        return this;
    }

    public final b$_j$_b interfaceString(int n2) {
        this.privatenewsuper |= 0x40;
        this.returnObjectsuper = n2;
        return this;
    }

    private void \u00d60\u00d3000() {
        if ((this.privatenewsuper & 0x80) != 128) {
            this.newObjectsuper = new ArrayList(this.newObjectsuper);
            this.privatenewsuper |= 0x80;
        }
    }

    public final int doprivatesuper() {
        return this.newObjectsuper.size();
    }

    public final b$_db \u00d8\u00d60000(int n2) {
        return (b$_db)this.newObjectsuper.get(n2);
    }

    private void \u00d6\u00f8\u00d2000() {
        if ((this.privatenewsuper & 0x100) != 256) {
            this.\u00d5\u00d4o000 = new ArrayList(this.\u00d5\u00d4o000);
            this.privatenewsuper |= 0x100;
        }
    }

    private void O\u00f8\u00d2000() {
        if ((this.privatenewsuper & 0x200) != 512) {
            this.\u00d8\u00d4o000 = new ArrayList(this.\u00d8\u00d4o000);
            this.privatenewsuper |= 0x200;
        }
    }

    public final int intprivatesuper() {
        return this.\u00d8\u00d4o000.size();
    }

    public final b$_y \u00d3\u00d60000(int n2) {
        return (b$_y)this.\u00d8\u00d4o000.get(n2);
    }

    static /* synthetic */ b$_j$_b \u00d2\u00f8\u00d2000() {
        return b$_j$_b.\u00d30\u00d3000();
    }
}

