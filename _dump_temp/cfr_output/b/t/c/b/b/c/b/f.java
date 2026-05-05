/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.c.b;

import b.t.c.b.b.c.b.j;
import b.t.m;
import b.t.s;

public final class f {
    private final s Object;
    private final j \u00d200000;
    private final int o00000;

    public f(s object, j j2) {
        this.Object = object;
        this.\u00d200000 = j2;
        if (!(this.\u00d200000.\u00d200000() == 1 && this.\u00d200000.super() == 1)) {
            object = "BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but " + this.\u00d200000 + " was passed";
            throw new IllegalArgumentException(object.toString());
        }
        this.o00000 = 1 << this.\u00d200000.\u00d300000();
    }

    public final boolean o00000(Object object, m m2) {
        return this.\u00d200000.super(((Number)this.Object.\u00d3O0000(object)).intValue());
    }

    public final void o00000(Object object, m m2, boolean bl) {
        int n2 = bl ? ((Number)this.Object.\u00d3O0000(object)).intValue() | this.o00000 : ((Number)this.Object.\u00d3O0000(object)).intValue() & ~this.o00000;
        this.Object.return(object, n2);
    }
}

