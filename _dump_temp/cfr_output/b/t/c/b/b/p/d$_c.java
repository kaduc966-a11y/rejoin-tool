/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.p;

import b.t.c.b.b.p.ab;
import b.t.c.b.b.p.d;
import b.t.c.b.b.p.d$_b;
import b.t.c.b.b.p.d$_c$_b;
import b.t.c.b.b.p.d$_d;
import b.t.c.b.b.p.d$_g;
import b.t.c.b.b.p.h;
import b.t.c.b.b.p.s;
import b.t.c.b.b.p.z;
import java.io.IOException;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public abstract class d$_c
extends d
implements d$_d {
    private final z \u00d6\u00d6O000;

    public d$_c() {
        this.\u00d6\u00d6O000 = z.\u00d500000();
    }

    public d$_c(d$_g d$_g) {
        this.\u00d6\u00d6O000 = d$_g.super(d$_g);
    }

    private void \u00d200000(d$_b d$_b) {
        if (d$_b.o00000() != this.super()) {
            throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
        }
    }

    public final boolean \u00d400000(d$_b d$_b) {
        this.\u00d200000(d$_b);
        return this.\u00d6\u00d6O000.o00000(d$_b.\u00d500000);
    }

    public final int class(d$_b d$_b) {
        this.\u00d200000(d$_b);
        return this.\u00d6\u00d6O000.new(d$_b.\u00d500000);
    }

    public final Object \u00d300000(d$_b d$_b) {
        this.\u00d200000(d$_b);
        Object object = this.\u00d6\u00d6O000.\u00d300000(d$_b.\u00d500000);
        if (object == null) {
            return d$_b.new;
        }
        return d$_b.new(object);
    }

    public final Object super(d$_b d$_b, int n2) {
        this.\u00d200000(d$_b);
        return d$_b.\u00d300000(this.\u00d6\u00d6O000.o00000(d$_b.\u00d500000, n2));
    }

    protected boolean \u00f4\u00d6o000() {
        return this.\u00d6\u00d6O000.return();
    }

    @Override
    protected boolean super(ab ab2, h h2, s s2, int n2) throws IOException {
        return d.\u00d200000(this.\u00d6\u00d6O000, this.super(), ab2, h2, s2, n2);
    }

    @Override
    protected void \u00d2O0000() {
        this.\u00d6\u00d6O000.new();
    }

    protected d$_c$_b \u00d8\u00d6o000() {
        return new d$_c$_b(this, false, null);
    }

    protected int \u00d6\u00d6o000() {
        return this.\u00d6\u00d6O000.o00000();
    }

    static /* synthetic */ z \u00d200000(d$_c d$_c) {
        return d$_c.\u00d6\u00d6O000;
    }
}

