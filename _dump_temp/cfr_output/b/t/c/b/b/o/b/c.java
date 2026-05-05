/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.o.b;

import b.t.c.b.b.o.b.d;

public abstract class c
implements Comparable {
    public abstract d \u00d200000();

    public abstract boolean o00000();

    public int o00000(c c2) {
        int n2 = this.\u00d200000().compareTo((Enum)c2.\u00d200000());
        if (n2 == 0 && !this.o00000() && c2.o00000()) {
            return 1;
        }
        return n2;
    }
}

