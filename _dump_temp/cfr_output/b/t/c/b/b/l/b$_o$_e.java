/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.l;

import b.t.c.b.b.l.b$_o$_e$1;
import b.t.c.b.b.p.t$_b;
import b.t.c.b.b.p.t$_c;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public enum b$_o$_e implements t$_c
{
    \u00f4\u00d20000(0, 0),
    \u00d8\u00d20000(1, 1),
    ifnew(2, 2);

    private static t$_b \u00d5\u00d20000;
    private final int \u00f5\u00d20000;

    @Override
    public final int super() {
        return this.\u00f5\u00d20000;
    }

    public static b$_o$_e \u00d800000(int n2) {
        switch (n2) {
            case 0: {
                return \u00f4\u00d20000;
            }
            case 1: {
                return \u00d8\u00d20000;
            }
            case 2: {
                return ifnew;
            }
        }
        return null;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private b$_o$_e() {
        void var4_-1;
        this.\u00f5\u00d20000 = var4_-1;
    }

    static {
        \u00d5\u00d20000 = new b$_o$_e$1();
    }
}

