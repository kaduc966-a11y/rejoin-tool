/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.h;

import b.s.mc;
import b.t.c.b.b.h.d.d;
import b.t.c.b.b.h.d.k;
import b.t.c.b.b.h.e.b;
import b.t.c.b.b.h.e.i;
import b.t.c.b.b.h.ib;
import b.t.c.b.b.h.rc;
import b.t.c.b.b.h.wb$_b;
import b.t.c.b.b.h.zb;
import b.t.c.b.b.o.e.f;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public abstract class wb
extends ib {
    public static final wb$_b nullObjectString = new wb$_b(null);
    private final i O\u00f4\u00d8000;
    private final boolean o\u00f4\u00d8000;
    private final f \u00f8\u00d8\u00d8000;

    public wb(i stringArray, boolean bl) {
        this.O\u00f4\u00d8000 = stringArray;
        this.o\u00f4\u00d8000 = bl;
        String[] stringArray2 = new String[1];
        stringArray = stringArray2;
        stringArray2[0] = this.O\u00f4\u00d8000.toString();
        this.\u00f8\u00d8\u00d8000 = k.o00000(d.\u00d200000, stringArray);
    }

    public final i newwhilesuper() {
        return this.O\u00f4\u00d8000;
    }

    @Override
    public boolean \u00f5\u00d6\u00d2000() {
        return this.o\u00f4\u00d8000;
    }

    @Override
    public f \u00f4\u00d6\u00d2000() {
        return this.\u00f8\u00d8\u00d8000;
    }

    @Override
    public List \u00d4\u00d6\u00d2000() {
        return mc.\u00d500000();
    }

    @Override
    public zb \u00d5\u00d6\u00d2000() {
        return zb.ifreturnclass.Object();
    }

    @Override
    public ib new(zb zb2) {
        return this;
    }

    @Override
    public ib \u00d4o0000(boolean bl) {
        if (bl == ((rc)this).\u00f5\u00d6\u00d2000()) {
            return this;
        }
        return this.\u00d5o0000(bl);
    }

    public wb \u00d5O0000(b b2) {
        return this;
    }

    public abstract wb \u00d5o0000(boolean var1);
}

