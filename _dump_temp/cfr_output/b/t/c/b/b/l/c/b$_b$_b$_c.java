/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.l.c;

import b.t.c.b.b.l.c.b$_b$_b;
import b.t.c.b.b.l.c.b$_b$_b$_b;
import b.t.c.b.b.l.c.b$_b$_c;
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
public final class b$_b$_b$_c
extends d$_f
implements b$_b$_c {
    private int \u00f6\u00f4\u00d2000;
    private int \u00d2\u00f5\u00d2000 = 1;
    private int o\u00f5\u00d2000;
    private Object \u00f8\u00f4\u00d2000 = "";
    private b$_b$_b$_b nullwhilesuper = b$_b$_b$_b.\u00f4\u00f40000;
    private List \u00f5\u00f4\u00d2000 = Collections.emptyList();
    private List forwhilesuper = Collections.emptyList();

    private b$_b$_b$_c() {
        this.\u00d30\u00d5000();
    }

    private void \u00d30\u00d5000() {
    }

    private static b$_b$_b$_c \u00d60\u00d5000() {
        return new b$_b$_b$_c();
    }

    public final b$_b$_b$_c intprivatenew() {
        return b$_b$_b$_c.\u00d60\u00d5000().\u00d600000(this.classprivatenew());
    }

    public final b$_b$_b \u00d40\u00d5000() {
        return b$_b$_b.\u00d6o0000();
    }

    public final b$_b$_b \u00f40\u00d5000() {
        b$_b$_b b$_b$_b = this.classprivatenew();
        if (!b$_b$_b.\u00d200000()) {
            throw b$_b$_b$_c.super(b$_b$_b);
        }
        return b$_b$_b;
    }

    public final b$_b$_b classprivatenew() {
        b$_b$_b b$_b$_b = new b$_b$_b(this, null);
        int n2 = this.\u00f6\u00f4\u00d2000;
        int n3 = 0;
        if ((n2 & 1) == 1) {
            n3 = 1;
        }
        b$_b$_b.super(b$_b$_b, this.\u00d2\u00f5\u00d2000);
        if ((n2 & 2) == 2) {
            n3 |= 2;
        }
        b$_b$_b.\u00d300000(b$_b$_b, this.o\u00f5\u00d2000);
        if ((n2 & 4) == 4) {
            n3 |= 4;
        }
        b$_b$_b.super(b$_b$_b, this.\u00f8\u00f4\u00d2000);
        if ((n2 & 8) == 8) {
            n3 |= 8;
        }
        b$_b$_b.super(b$_b$_b, this.nullwhilesuper);
        if ((this.\u00f6\u00f4\u00d2000 & 0x10) == 16) {
            this.\u00f5\u00f4\u00d2000 = Collections.unmodifiableList(this.\u00f5\u00f4\u00d2000);
            this.\u00f6\u00f4\u00d2000 &= 0xFFFFFFEF;
        }
        b$_b$_b.\u00d200000(b$_b$_b, this.\u00f5\u00f4\u00d2000);
        if ((this.\u00f6\u00f4\u00d2000 & 0x20) == 32) {
            this.forwhilesuper = Collections.unmodifiableList(this.forwhilesuper);
            this.\u00f6\u00f4\u00d2000 &= 0xFFFFFFDF;
        }
        b$_b$_b.super(b$_b$_b, this.forwhilesuper);
        b$_b$_b.\u00d200000(b$_b$_b, n3);
        return b$_b$_b;
    }

    public final b$_b$_b$_c \u00d600000(b$_b$_b b$_b$_b) {
        if (b$_b$_b == b$_b$_b.\u00d6o0000()) {
            return this;
        }
        if (b$_b$_b.Oo0000()) {
            this.Objectint(b$_b$_b.voidsuper());
        }
        if (b$_b$_b.floatsuper()) {
            this.\u00f60O000(b$_b$_b.\u00d3o0000());
        }
        if (b$_b$_b.\u00d4o0000()) {
            this.\u00f6\u00f4\u00d2000 |= 4;
            this.\u00f8\u00f4\u00d2000 = b$_b$_b.super(b$_b$_b);
        }
        if (b$_b$_b.publicsuper()) {
            this.super(b$_b$_b.\u00d4O0000());
        }
        if (!b$_b$_b.\u00d300000(b$_b$_b).isEmpty()) {
            if (this.\u00f5\u00f4\u00d2000.isEmpty()) {
                this.\u00f5\u00f4\u00d2000 = b$_b$_b.\u00d300000(b$_b$_b);
                this.\u00f6\u00f4\u00d2000 &= 0xFFFFFFEF;
            } else {
                this.\u00f60\u00d5000();
                this.\u00f5\u00f4\u00d2000.addAll(b$_b$_b.\u00d300000(b$_b$_b));
            }
        }
        if (!b$_b$_b.class(b$_b$_b).isEmpty()) {
            if (this.forwhilesuper.isEmpty()) {
                this.forwhilesuper = b$_b$_b.class(b$_b$_b);
                this.\u00f6\u00f4\u00d2000 &= 0xFFFFFFDF;
            } else {
                this.\u00f80\u00d5000();
                this.forwhilesuper.addAll(b$_b$_b.class(b$_b$_b));
            }
        }
        b$_b$_b$_c b$_b$_b$_c = this;
        b$_b$_b$_c.super(b$_b$_b$_c.class().o00000(b$_b$_b.\u00d200000(b$_b$_b)));
        return this;
    }

    @Override
    public final boolean \u00d200000() {
        return true;
    }

    public final b$_b$_b$_c \u00f4o0000(ab object, s s2) throws IOException {
        b$_b$_b b$_b$_b = null;
        try {
            b$_b$_b = (b$_b$_b)b$_b$_b.\u00d300000.o00000((ab)object, s2);
        }
        catch (g g2) {
            object = g2;
            b$_b$_b = (b$_b$_b)g2.o00000();
            throw object;
        }
        finally {
            if (b$_b$_b != null) {
                this.\u00d600000(b$_b$_b);
            }
        }
        return this;
    }

    public final b$_b$_b$_c Objectint(int n2) {
        this.\u00f6\u00f4\u00d2000 |= 1;
        this.\u00d2\u00f5\u00d2000 = n2;
        return this;
    }

    public final b$_b$_b$_c \u00f60O000(int n2) {
        this.\u00f6\u00f4\u00d2000 |= 2;
        this.o\u00f5\u00d2000 = n2;
        return this;
    }

    public final b$_b$_b$_c super(b$_b$_b$_b b$_b$_b$_b) {
        if (b$_b$_b$_b == null) {
            throw new NullPointerException();
        }
        this.\u00f6\u00f4\u00d2000 |= 8;
        this.nullwhilesuper = b$_b$_b$_b;
        return this;
    }

    private void \u00f60\u00d5000() {
        if ((this.\u00f6\u00f4\u00d2000 & 0x10) != 16) {
            this.\u00f5\u00f4\u00d2000 = new ArrayList(this.\u00f5\u00f4\u00d2000);
            this.\u00f6\u00f4\u00d2000 |= 0x10;
        }
    }

    private void \u00f80\u00d5000() {
        if ((this.\u00f6\u00f4\u00d2000 & 0x20) != 32) {
            this.forwhilesuper = new ArrayList(this.forwhilesuper);
            this.\u00f6\u00f4\u00d2000 |= 0x20;
        }
    }

    static /* synthetic */ b$_b$_b$_c \u00d80\u00d5000() {
        return b$_b$_b$_c.\u00d60\u00d5000();
    }
}

