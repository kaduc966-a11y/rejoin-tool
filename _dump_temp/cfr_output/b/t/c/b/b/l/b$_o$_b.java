/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.l;

import b.t.c.b.b.l.b$_o$_b$1;
import b.t.c.b.b.p.t$_b;
import b.t.c.b.b.p.t$_c;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public enum b$_o$_b implements t$_c
{
    \u00f5o0000(0, 0),
    privatesuper(1, 1),
    \u00d8o0000(2, 2);

    private static t$_b \u00d5o0000;
    private final int \u00f4o0000;

    @Override
    public final int super() {
        return this.\u00f4o0000;
    }

    public static b$_o$_b class(int n2) {
        switch (n2) {
            case 0: {
                return \u00f5o0000;
            }
            case 1: {
                return privatesuper;
            }
            case 2: {
                return \u00d8o0000;
            }
        }
        return null;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private b$_o$_b() {
        void var4_-1;
        this.\u00f4o0000 = var4_-1;
    }

    static {
        \u00d5o0000 = new b$_o$_b$1();
    }
}

