/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.l;

import b.t.c.b.b.l.b$_m$_b$1;
import b.t.c.b.b.p.t$_b;
import b.t.c.b.b.p.t$_c;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public enum b$_m$_b implements t$_c
{
    \u00d5O0000(0, 0),
    \u00d8O0000(1, 1),
    \u00f5O0000(2, 2);

    private static t$_b thissuper;
    private final int Stringsuper;

    @Override
    public final int super() {
        return this.Stringsuper;
    }

    public static b$_m$_b \u00d300000(int n2) {
        switch (n2) {
            case 0: {
                return \u00d5O0000;
            }
            case 1: {
                return \u00d8O0000;
            }
            case 2: {
                return \u00f5O0000;
            }
        }
        return null;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private b$_m$_b() {
        void var4_-1;
        this.Stringsuper = var4_-1;
    }

    static {
        thissuper = new b$_m$_b$1();
    }
}

