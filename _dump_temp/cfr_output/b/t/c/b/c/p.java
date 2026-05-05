/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.c;

import b.o.d.fc;
import b.s.mc;
import b.t.c.b.b.h.c.ab;
import b.t.c.b.c.d;
import b.t.c.b.c.n;
import b.t.c.b.c.p$1;
import b.t.c.b.lb;
import b.t.u;
import b.t.v;
import b.t.z;
import java.util.List;

public final class p
extends n
implements ab {
    private final u StringclassString;
    private final d o\u00f8\u00d8000;
    private final boolean \u00f8\u00f6\u00d8000;
    private final v O\u00f8\u00d8000;

    public p(u u2, d d2, boolean bl) {
        super(p$1.\u00d3\u00f5\u00d3000);
        this.StringclassString = u2;
        this.o\u00f8\u00d8000 = d2;
        this.\u00f8\u00f6\u00d8000 = bl;
    }

    public final u Stringpublicsuper() {
        return this.StringclassString;
    }

    public final d \u00f5\u00f5\u00d2000() {
        return this.o\u00f8\u00d8000;
    }

    @Override
    public final boolean \u00f4\u00f60000() {
        return this.\u00f8\u00f6\u00d8000;
    }

    @Override
    public final v privatevoid() {
        return this.O\u00f8\u00d8000;
    }

    @Override
    public final List \u00f5\u00f60000() {
        return mc.\u00d500000();
    }

    @Override
    public final List \u00d8\u00f50000() {
        return mc.\u00d500000();
    }

    @Override
    public final n \u00d3o0000(boolean bl) {
        if (bl == this.\u00f4\u00f60000()) {
            return this;
        }
        return new p(this.StringclassString, this.o\u00f8\u00d8000, bl);
    }

    @Override
    public final n nullsuper(boolean bl) {
        if (!bl) {
            return this;
        }
        throw new lb("Definitely not null captured type is not supported yet: ".concat(String.valueOf(this)));
    }

    @Override
    public final boolean privatedosuper() {
        return false;
    }

    @Override
    public final u nulldosuper() {
        return null;
    }

    @Override
    public final boolean fordosuper() {
        return false;
    }

    @Override
    public final boolean \u00d5\u00d8\u00d2000() {
        return false;
    }

    @Override
    public final boolean \u00d3\u00d8\u00d2000() {
        return false;
    }

    @Override
    public final z \u00f4\u00d8\u00d2000() {
        return null;
    }

    @Override
    public final n \u00d8\u00d8\u00d2000() {
        return null;
    }

    @Override
    public final n \u00d4\u00d8\u00d2000() {
        return null;
    }

    @Override
    public final boolean equals(Object object) {
        return object instanceof p && fc.o00000((Object)this.StringclassString, (Object)((p)object).StringclassString) && fc.o00000((Object)this.o\u00f8\u00d8000, (Object)((p)object).o\u00f8\u00d8000) && this.\u00f4\u00f60000() == ((p)object).\u00f4\u00f60000();
    }

    @Override
    public final int hashCode() {
        u u2 = this.StringclassString;
        return ((u2 != null ? u2.hashCode() : 0) * 31 + this.o\u00f8\u00d8000.hashCode()) * 31 + Boolean.hashCode(this.\u00f4\u00f60000());
    }

    @Override
    public final String toString() {
        return this.o\u00f8\u00d8000.toString();
    }
}

