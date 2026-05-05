/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b;

import b.o.d.fc;
import b.t.c.b.b.f.b.b.h;
import b.t.c.b.b.f.b.b.j;
import b.t.c.b.b.l.b$_n;
import b.t.c.b.b.l.c.b;
import b.t.c.b.b.l.c.b$_i;
import b.t.c.b.b.l.c.b.d$_b;
import b.t.c.b.b.l.d.d;
import b.t.c.b.b.l.d.e;
import b.t.c.b.b.l.d.g;
import b.t.c.b.b.n.b.r;
import b.t.c.b.b.q.eb;
import b.t.c.b.b.q.lc;
import b.t.c.b.b.q.pb;
import b.t.c.b.lb;
import b.t.c.b.mb;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class mb$_d
extends mb {
    private final pb \u00f400000;
    private final b$_n \u00d800000;
    private final b$_i \u00d300000;
    private final e class;
    private final d \u00d600000;
    private final String \u00d400000;

    public mb$_d(pb object, b$_n object2, b$_i b$_i, e e2, d d2) {
        super(null);
        String string;
        this.\u00f400000 = object;
        this.\u00d800000 = object2;
        this.\u00d300000 = b$_i;
        this.class = e2;
        this.\u00d600000 = d2;
        if (this.\u00d300000.\u00d6\u00d60000()) {
            string = this.class.new(this.\u00d300000.\u00d4\u00d60000().\u00f8\u00d20000()) + this.class.new(this.\u00d300000.\u00d4\u00d60000().classnew());
        } else {
            d$_b d$_b = b.t.c.b.b.l.c.b.e.super(b.t.c.b.b.l.c.b.e.\u00d200000, this.\u00d800000, this.class, this.\u00d600000, false, 8, null);
            if (d$_b == null) {
                throw new lb("No field signature for property: " + this.\u00f400000);
            }
            object = d$_b;
            object2 = d$_b.\u00d800000();
            object = ((d$_b)object).\u00d500000();
            string = b.t.c.b.b.n.c.b.\u00d400000((String)object2) + this.class() + "()" + (String)object;
        }
        this.\u00d400000 = string;
    }

    public final pb \u00d800000() {
        return this.\u00f400000;
    }

    public final b$_n \u00d400000() {
        return this.\u00d800000;
    }

    public final b$_i \u00d600000() {
        return this.\u00d300000;
    }

    public final e int() {
        return this.class;
    }

    public final d \u00f400000() {
        return this.\u00d600000;
    }

    private final String class() {
        Object object = this.\u00f400000.\u00d8\u00f80000();
        if (fc.o00000((Object)this.\u00f400000.\u00d50O000(), (Object)eb.\u00f500000) && object instanceof h) {
            int n2;
            e e2;
            Object object2 = (Integer)g.super(((h)object).thisfloatsuper(), b.\u00f800000);
            if (object2 == null || (object2 = (e2 = this.class).new(n2 = ((Number)(object = object2)).intValue())) == null) {
                object2 = "main";
            }
            object = object2;
            return "$" + b.t.c.b.b.d.b.super((String)object);
        }
        if (fc.o00000((Object)this.\u00f400000.\u00d50O000(), (Object)eb.oO0000) && object instanceof lc && (object = ((j)this.\u00f400000).\u00d5\u00d8o000()) instanceof r && ((r)object).\u00f400000() != null) {
            return "$" + ((r)object).\u00d800000().\u00d400000();
        }
        return "";
    }

    @Override
    public final String super() {
        return this.\u00d400000;
    }
}

