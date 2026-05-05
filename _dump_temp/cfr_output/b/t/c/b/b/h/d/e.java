/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.h.d;

import b.o.d.w;
import b.s.mc;
import b.t.c.b.b.h.bc;
import b.t.c.b.b.h.d.c;
import b.t.c.b.b.h.e.b;
import b.t.c.b.b.h.ib;
import b.t.c.b.b.h.rc;
import b.t.c.b.b.h.zb;
import b.t.c.b.b.o.e.f;
import java.util.Arrays;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class e
extends ib {
    private final bc o\u00d8\u00d8000;
    private final f \u00f8\u00d6\u00d8000;
    private final c O\u00d8\u00d8000;
    private final List \u00d4\u00d8\u00d8000;
    private final boolean \u00d3\u00d8\u00d8000;
    private final String[] whilenewString;
    private final String \u00d5\u00d8\u00d8000;

    public e(bc object, f stringArray, c c2, List list, boolean bl, String ... stringArray2) {
        this.o\u00d8\u00d8000 = object;
        this.\u00f8\u00d6\u00d8000 = stringArray;
        this.O\u00d8\u00d8000 = c2;
        this.\u00d4\u00d8\u00d8000 = list;
        this.\u00d3\u00d8\u00d8000 = bl;
        this.whilenewString = stringArray2;
        object = this.O\u00d8\u00d8000.o00000();
        stringArray = Arrays.copyOf(this.whilenewString, this.whilenewString.length);
        this.\u00d5\u00d8\u00d8000 = String.format((String)object, Arrays.copyOf(stringArray, stringArray.length));
    }

    public /* synthetic */ e(bc bc2, f f2, c c2, List list, boolean bl, String[] stringArray, int n2, w w2) {
        if ((n2 & 8) != 0) {
            list = mc.\u00d500000();
        }
        if ((n2 & 0x10) != 0) {
            bl = false;
        }
        this(bc2, f2, c2, list, bl, stringArray);
    }

    @Override
    public final bc thisdosuper() {
        return this.o\u00d8\u00d8000;
    }

    @Override
    public final f \u00f4\u00d6\u00d2000() {
        return this.\u00f8\u00d6\u00d8000;
    }

    public final c o\u00f4\u00d2000() {
        return this.O\u00d8\u00d8000;
    }

    @Override
    public final List \u00d4\u00d6\u00d2000() {
        return this.\u00d4\u00d8\u00d8000;
    }

    @Override
    public final boolean \u00f5\u00d6\u00d2000() {
        return this.\u00d3\u00d8\u00d8000;
    }

    public final String O\u00f4\u00d2000() {
        return this.\u00d5\u00d8\u00d8000;
    }

    @Override
    public final zb \u00d5\u00d6\u00d2000() {
        return zb.ifreturnclass.Object();
    }

    @Override
    public final ib new(zb zb2) {
        return this;
    }

    public final e \u00d3O0000(List list) {
        return new e(((rc)this).thisdosuper(), ((rc)this).\u00f4\u00d6\u00d2000(), this.O\u00d8\u00d8000, list, ((rc)this).\u00f5\u00d6\u00d2000(), Arrays.copyOf(this.whilenewString, this.whilenewString.length));
    }

    @Override
    public final ib \u00d4o0000(boolean bl) {
        return new e(((rc)this).thisdosuper(), ((rc)this).\u00f4\u00d6\u00d2000(), this.O\u00d8\u00d8000, ((rc)this).\u00d4\u00d6\u00d2000(), bl, Arrays.copyOf(this.whilenewString, this.whilenewString.length));
    }

    public final e \u00d3O0000(b b2) {
        return this;
    }
}

