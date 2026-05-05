/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.l;

import b.t.c.b.b.l.b$_kb$_b$1;
import b.t.c.b.b.p.t$_b;
import b.t.c.b.b.p.t$_c;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public enum b$_kb$_b implements t$_c
{
    Stringclass(0, 0),
    \u00f8\u00d60000(1, 1),
    o\u00d80000(2, 2);

    private static t$_b \u00f4\u00d60000;
    private final int O\u00d80000;

    @Override
    public final int super() {
        return this.O\u00d80000;
    }

    public static b$_kb$_b do(int n2) {
        switch (n2) {
            case 0: {
                return Stringclass;
            }
            case 1: {
                return \u00f8\u00d60000;
            }
            case 2: {
                return o\u00d80000;
            }
        }
        return null;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private b$_kb$_b() {
        void var4_-1;
        this.O\u00d80000 = var4_-1;
    }

    static {
        \u00f4\u00d60000 = new b$_kb$_b$1();
    }
}

