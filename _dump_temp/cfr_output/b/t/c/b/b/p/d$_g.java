/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.p;

import b.t.c.b.b.p.d$_b;
import b.t.c.b.b.p.d$_c;
import b.t.c.b.b.p.d$_d;
import b.t.c.b.b.p.d$_f;
import b.t.c.b.b.p.z;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public abstract class d$_g
extends d$_f
implements d$_d {
    private z ifdo = z.\u00d400000();
    private boolean \u00d5\u00d6O000;

    private void \u00d3\u00d6o000() {
        if (!this.\u00d5\u00d6O000) {
            this.ifdo = this.ifdo.\u00d800000();
            this.\u00d5\u00d6O000 = true;
        }
    }

    private z \u00d2\u00d6o000() {
        this.ifdo.new();
        this.\u00d5\u00d6O000 = false;
        return this.ifdo;
    }

    private void super(d$_b d$_b) {
        if (d$_b.o00000() != this.\u00d600000()) {
            throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
        }
    }

    public d$_g \u00d4\u00d6o000() {
        throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
    }

    public final d$_g \u00d200000(d$_b d$_b, Object object) {
        this.super(d$_b);
        this.\u00d3\u00d6o000();
        this.ifdo.new(d$_b.\u00d500000, d$_b.o00000(object));
        return this;
    }

    public final d$_g super(d$_b d$_b, Object object) {
        this.super(d$_b);
        this.\u00d3\u00d6o000();
        this.ifdo.\u00d300000(d$_b.\u00d500000, d$_b.\u00d400000(object));
        return this;
    }

    protected boolean classStringsuper() {
        return this.ifdo.return();
    }

    protected final void super(d$_c d$_c) {
        this.\u00d3\u00d6o000();
        this.ifdo.o00000(d$_c.\u00d200000(d$_c));
    }

    static /* synthetic */ z super(d$_g d$_g) {
        return d$_g.\u00d2\u00d6o000();
    }
}

