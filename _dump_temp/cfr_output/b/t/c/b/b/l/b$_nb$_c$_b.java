/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.l;

import b.t.c.b.b.l.b$_nb$_c$_b$1;
import b.t.c.b.b.p.t$_b;
import b.t.c.b.b.p.t$_c;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public enum b$_nb$_c$_b implements t$_c
{
    \u00d4\u00d80000(0, 0),
    nullclass(1, 1),
    \u00f4\u00d80000(2, 2),
    \u00d3\u00d80000(3, 3);

    private static t$_b \u00d5\u00d80000;
    private final int \u00d8\u00d80000;

    @Override
    public final int super() {
        return this.\u00d8\u00d80000;
    }

    public static b$_nb$_c$_b \u00d2O0000(int n2) {
        switch (n2) {
            case 0: {
                return \u00d4\u00d80000;
            }
            case 1: {
                return nullclass;
            }
            case 2: {
                return \u00f4\u00d80000;
            }
            case 3: {
                return \u00d3\u00d80000;
            }
        }
        return null;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private b$_nb$_c$_b() {
        void var4_-1;
        this.\u00d8\u00d80000 = var4_-1;
    }

    static {
        \u00d5\u00d80000 = new b$_nb$_c$_b$1();
    }
}

