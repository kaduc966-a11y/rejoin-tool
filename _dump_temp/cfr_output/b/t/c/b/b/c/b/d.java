/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.c.b;

import b.c.f;
import b.t.c.b.b.c.b.j;
import b.t.c.b.b.l.d.l$_b;
import b.t.c.b.b.p.t$_c;
import b.t.m;
import b.t.s;
import java.util.List;

public final class d {
    private final s String;
    private final l$_b \u00d300000;
    private final f o00000;
    private final List \u00d200000;

    public d(s s2, l$_b l$_b, f f2, List list) {
        this.String = s2;
        this.\u00d300000 = l$_b;
        this.o00000 = f2;
        this.\u00d200000 = list;
    }

    public final Enum o00000(Object object, m m2) {
        return (Enum)this.o00000.get(((t$_c)this.\u00d300000.super(((Number)this.String.\u00d3O0000(object)).intValue())).super());
    }

    public final void o00000(Object object, m m2, Enum enum_) {
        this.String.return(object, ((j)this.\u00d200000.get(enum_.ordinal())).\u00d200000(((Number)this.String.\u00d3O0000(object)).intValue()));
    }
}

