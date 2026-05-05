/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.l.c;

import b.t.c.b.b.l.c.b$_b;
import b.t.c.b.b.l.c.b$_e;
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
public final class b$_b$_d
extends d$_f
implements b$_e {
    private int \u00d8\u00f4\u00d2000;
    private List \u00d5\u00f4\u00d2000 = Collections.emptyList();
    private List \u00d6\u00f4\u00d2000 = Collections.emptyList();

    private b$_b$_d() {
        this.\u00d6\u00f8\u00d4000();
    }

    private void \u00d6\u00f8\u00d4000() {
    }

    private static b$_b$_d O0\u00d5000() {
        return new b$_b$_d();
    }

    public final b$_b$_d publicpublicnew() {
        return b$_b$_d.O0\u00d5000().class(this.superprivatenew());
    }

    public final b$_b \u00d8\u00f8\u00d4000() {
        return b$_b.\u00d4\u00f8\u00d4000();
    }

    public final b$_b \u00f4\u00f8\u00d4000() {
        b$_b b$_b = this.superprivatenew();
        if (!b$_b.\u00d200000()) {
            throw b$_b$_d.super(b$_b);
        }
        return b$_b;
    }

    public final b$_b superprivatenew() {
        b$_b b$_b = new b$_b(this, null);
        if ((this.\u00d8\u00f4\u00d2000 & 1) == 1) {
            this.\u00d5\u00f4\u00d2000 = Collections.unmodifiableList(this.\u00d5\u00f4\u00d2000);
            this.\u00d8\u00f4\u00d2000 &= 0xFFFFFFFE;
        }
        b$_b.super(b$_b, this.\u00d5\u00f4\u00d2000);
        if ((this.\u00d8\u00f4\u00d2000 & 2) == 2) {
            this.\u00d6\u00f4\u00d2000 = Collections.unmodifiableList(this.\u00d6\u00f4\u00d2000);
            this.\u00d8\u00f4\u00d2000 &= 0xFFFFFFFD;
        }
        b$_b.\u00d200000(b$_b, this.\u00d6\u00f4\u00d2000);
        return b$_b;
    }

    public final b$_b$_d class(b$_b b$_b) {
        if (b$_b == b$_b.\u00d4\u00f8\u00d4000()) {
            return this;
        }
        if (!b$_b.\u00d200000(b$_b).isEmpty()) {
            if (this.\u00d5\u00f4\u00d2000.isEmpty()) {
                this.\u00d5\u00f4\u00d2000 = b$_b.\u00d200000(b$_b);
                this.\u00d8\u00f4\u00d2000 &= 0xFFFFFFFE;
            } else {
                this.\u00d20\u00d5000();
                this.\u00d5\u00f4\u00d2000.addAll(b$_b.\u00d200000(b$_b));
            }
        }
        if (!b$_b.\u00d400000(b$_b).isEmpty()) {
            if (this.\u00d6\u00f4\u00d2000.isEmpty()) {
                this.\u00d6\u00f4\u00d2000 = b$_b.\u00d400000(b$_b);
                this.\u00d8\u00f4\u00d2000 &= 0xFFFFFFFD;
            } else {
                this.\u00f8\u00f8\u00d4000();
                this.\u00d6\u00f4\u00d2000.addAll(b$_b.\u00d400000(b$_b));
            }
        }
        b$_b$_d b$_b$_d = this;
        b$_b$_d.super(b$_b$_d.class().o00000(b$_b.\u00d300000(b$_b)));
        return this;
    }

    @Override
    public final boolean \u00d200000() {
        return true;
    }

    public final b$_b$_d \u00d8o0000(ab object, s s2) throws IOException {
        b$_b b$_b = null;
        try {
            b$_b = (b$_b)b$_b.Stringwhilesuper.o00000((ab)object, s2);
        }
        catch (g g2) {
            object = g2;
            b$_b = (b$_b)g2.o00000();
            throw object;
        }
        finally {
            if (b$_b != null) {
                this.class(b$_b);
            }
        }
        return this;
    }

    private void \u00d20\u00d5000() {
        if ((this.\u00d8\u00f4\u00d2000 & 1) != 1) {
            this.\u00d5\u00f4\u00d2000 = new ArrayList(this.\u00d5\u00f4\u00d2000);
            this.\u00d8\u00f4\u00d2000 |= 1;
        }
    }

    private void \u00f8\u00f8\u00d4000() {
        if ((this.\u00d8\u00f4\u00d2000 & 2) != 2) {
            this.\u00d6\u00f4\u00d2000 = new ArrayList(this.\u00d6\u00f4\u00d2000);
            this.\u00d8\u00f4\u00d2000 |= 2;
        }
    }

    static /* synthetic */ b$_b$_d \u00f6\u00f8\u00d4000() {
        return b$_b$_d.O0\u00d5000();
    }
}

