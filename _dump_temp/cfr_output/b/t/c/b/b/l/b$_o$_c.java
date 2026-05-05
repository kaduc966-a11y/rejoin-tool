/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.l;

import b.t.c.b.b.l.b$_o$_c$1;
import b.t.c.b.b.p.t$_b;
import b.t.c.b.b.p.t$_c;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public enum b$_o$_c implements t$_c
{
    \u00d4\u00d20000(0, 0),
    o\u00d20000(1, 1),
    newnew(2, 2);

    private static t$_b \u00f8o0000;
    private final int \u00d3\u00d20000;

    @Override
    public final int super() {
        return this.\u00d3\u00d20000;
    }

    public static b$_o$_c \u00d600000(int n2) {
        switch (n2) {
            case 0: {
                return \u00d4\u00d20000;
            }
            case 1: {
                return o\u00d20000;
            }
            case 2: {
                return newnew;
            }
        }
        return null;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private b$_o$_c() {
        void var4_-1;
        this.\u00d3\u00d20000 = var4_-1;
    }

    static {
        \u00f8o0000 = new b$_o$_c$1();
    }
}

