/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.l;

import b.t.c.b.b.l.b$_q$1;
import b.t.c.b.b.p.t$_b;
import b.t.c.b.b.p.t$_c;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public enum b$_q implements t$_c
{
    \u00d4\u00d30000(0, 0),
    whilenew(1, 1),
    o\u00d30000(2, 2);

    private static t$_b \u00f8\u00d20000;
    private final int \u00d3\u00d30000;

    @Override
    public final int super() {
        return this.\u00d3\u00d30000;
    }

    public static b$_q \u00f400000(int n2) {
        switch (n2) {
            case 0: {
                return \u00d4\u00d30000;
            }
            case 1: {
                return whilenew;
            }
            case 2: {
                return o\u00d30000;
            }
        }
        return null;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private b$_q() {
        void var4_-1;
        this.\u00d3\u00d30000 = var4_-1;
    }

    static {
        \u00f8\u00d20000 = new b$_q$1();
    }
}

