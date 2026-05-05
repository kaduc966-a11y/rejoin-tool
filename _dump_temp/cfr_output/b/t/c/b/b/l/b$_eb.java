/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.l;

import b.t.c.b.b.l.b$_eb$1;
import b.t.c.b.b.p.t$_b;
import b.t.c.b.b.p.t$_c;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public enum b$_eb implements t$_c
{
    \u00d4\u00d60000(0, 0),
    thisclass(1, 1),
    whileString(2, 2),
    \u00f8\u00d50000(3, 3),
    \u00d5\u00d60000(4, 4),
    o\u00d60000(5, 5);

    private static t$_b \u00d3\u00d60000;
    private final int \u00d8\u00d60000;

    @Override
    public final int super() {
        return this.\u00d8\u00d60000;
    }

    public static b$_eb OO0000(int n2) {
        switch (n2) {
            case 0: {
                return \u00d4\u00d60000;
            }
            case 1: {
                return thisclass;
            }
            case 2: {
                return whileString;
            }
            case 3: {
                return \u00f8\u00d50000;
            }
            case 4: {
                return \u00d5\u00d60000;
            }
            case 5: {
                return o\u00d60000;
            }
        }
        return null;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private b$_eb() {
        void var4_-1;
        this.\u00d8\u00d60000 = var4_-1;
    }

    static {
        \u00d3\u00d60000 = new b$_eb$1();
    }
}

