/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.l;

import b.t.c.b.b.l.b$_m$_d$1;
import b.t.c.b.b.p.t$_b;
import b.t.c.b.b.p.t$_c;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public enum b$_m$_d implements t$_c
{
    \u00d3o0000(0, 0),
    nullsuper(1, 1),
    oo0000(2, 2);

    private static t$_b \u00f8O0000;
    private final int \u00d4o0000;

    @Override
    public final int super() {
        return this.\u00d4o0000;
    }

    public static b$_m$_d \u00d400000(int n2) {
        switch (n2) {
            case 0: {
                return \u00d3o0000;
            }
            case 1: {
                return nullsuper;
            }
            case 2: {
                return oo0000;
            }
        }
        return null;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private b$_m$_d() {
        void var4_-1;
        this.\u00d4o0000 = var4_-1;
    }

    static {
        \u00f8O0000 = new b$_m$_d$1();
    }
}

