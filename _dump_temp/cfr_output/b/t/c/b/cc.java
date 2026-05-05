/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b;

import b.dc;
import b.lb;
import b.o.e.h;
import b.q.f;
import b.r;
import b.t.c.b.b.c.b;
import b.t.c.b.b.c.fb;
import b.t.c.b.cc$_b$0;
import b.t.c.b.cc$_b$1;
import b.t.c.b.cd;
import b.t.c.b.d;
import b.t.c.b.g;
import b.t.c.b.jc;
import b.t.c.b.kb;
import b.t.c.b.md;
import b.t.c.b.p;
import b.t.p$_b;
import b.t.u;
import java.lang.reflect.Type;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class cc
extends kb {
    private final d forObjectsuper;
    private final fb privateObjectsuper;
    private final int \u00f4\u00d5o000;
    private final p$_b \u00f5\u00d5o000;
    private final String \u00d8\u00d5o000;
    private final dc \u00f8\u00d5o000;

    public cc(d object, fb object2, int n2, p$_b p$_b, cd cd2) {
        this.forObjectsuper = object;
        this.privateObjectsuper = object2;
        this.\u00f4\u00d5o000 = n2;
        this.\u00f5\u00d5o000 = p$_b;
        cc cc2 = this;
        object2 = object = cc2.privateObjectsuper.Object();
        cc cc3 = cc2;
        boolean bl = f.\u00d300000((String)object2, "<", false, 2, null);
        cc3.\u00d8\u00d5o000 = !bl ? object : null;
        object = cd2;
        cc cc4 = this;
        this.\u00f8\u00d5o000 = r.o00000(lb.\u00d400000, (h)new cc$_b$0(cc4, (cd)object));
    }

    public final d \u00d8\u00f60000() {
        return this.forObjectsuper;
    }

    @Override
    public final int o\u00f60000() {
        return this.\u00f4\u00d5o000;
    }

    @Override
    public final p$_b \u00f5\u00f50000() {
        return this.\u00f5\u00d5o000;
    }

    @Override
    public final String O\u00f60000() {
        return this.\u00d8\u00d5o000;
    }

    @Override
    public final u \u00f8\u00f50000() {
        return (u)this.\u00f8\u00d5o000.\u00d200000();
    }

    @Override
    public final boolean Stringvoid() {
        if (!(this.\u00d8\u00f60000() instanceof g || this.\u00d8\u00f60000().o\u00d8O000() instanceof jc || md.o00000(this.\u00d8\u00f60000()))) {
            String string = "Only constructors and top-level callables are supported for now: " + this.\u00d8\u00f60000();
            throw new IllegalArgumentException(string.toString());
        }
        return b.o00000(this.privateObjectsuper);
    }

    @Override
    public final boolean nullvoid() {
        return b.o00000(this.privateObjectsuper);
    }

    @Override
    public final boolean \u00f4\u00f50000() {
        return this.privateObjectsuper.\u00d400000() != null;
    }

    private static final Type o00000(cc object) {
        if (!(((cc)object).\u00d8\u00f60000().o\u00d8O000() instanceof jc || md.o00000(((cc)object).\u00d8\u00f60000()))) {
            object = "Only constructors and top-level callables are supported for now: " + ((cc)object).\u00d8\u00f60000();
            throw new IllegalArgumentException(object.toString());
        }
        return (Type)((cc)object).\u00d8\u00f60000().privatedo().\u00d200000().get(((cc)object).o\u00f60000());
    }

    private static final u o00000(cc cc2, cd cd2) {
        return p.super(cc2.privateObjectsuper.\u00d200000(), cc2.\u00d8\u00f60000().o\u00d8O000().iffor().getClassLoader(), cd2, (h)new cc$_b$1(cc2));
    }

    static /* synthetic */ u new(cc cc2, cd cd2) {
        return cc.o00000(cc2, cd2);
    }

    static /* synthetic */ Type new(cc cc2) {
        return cc.o00000(cc2);
    }
}

