/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.l.c;

import b.t.c.b.b.l.c.b$_b$_b$_b$1;
import b.t.c.b.b.p.t$_b;
import b.t.c.b.b.p.t$_c;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public enum b$_b$_b$_b implements t$_c
{
    \u00f4\u00f40000(0, 0),
    returnreturn(1, 1),
    \u00d4\u00f40000(2, 2);

    private static t$_b \u00d3\u00f40000;
    private final int \u00d8\u00f40000;

    @Override
    public final int super() {
        return this.\u00d8\u00f40000;
    }

    public static b$_b$_b$_b \u00d4O0000(int n2) {
        switch (n2) {
            case 0: {
                return \u00f4\u00f40000;
            }
            case 1: {
                return returnreturn;
            }
            case 2: {
                return \u00d4\u00f40000;
            }
        }
        return null;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private b$_b$_b$_b() {
        void var4_-1;
        this.\u00d8\u00f40000 = var4_-1;
    }

    static {
        \u00d3\u00f40000 = new b$_b$_b$_b$1();
    }
}

