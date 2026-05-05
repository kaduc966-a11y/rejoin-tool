/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.l;

import b.t.c.b.b.l.b$_u$1;
import b.t.c.b.b.p.t$_b;
import b.t.c.b.b.p.t$_c;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public enum b$_u implements t$_c
{
    \u00f8\u00d30000(0, 0),
    StringObject(1, 1),
    \u00f5\u00d30000(2, 2),
    thisObject(3, 3);

    private static t$_b \u00d5\u00d30000;
    private final int \u00f4\u00d30000;

    @Override
    public final int super() {
        return this.\u00f4\u00d30000;
    }

    public static b$_u int(int n2) {
        switch (n2) {
            case 0: {
                return \u00f8\u00d30000;
            }
            case 1: {
                return StringObject;
            }
            case 2: {
                return \u00f5\u00d30000;
            }
            case 3: {
                return thisObject;
            }
        }
        return null;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private b$_u() {
        void var4_-1;
        this.\u00f4\u00d30000 = var4_-1;
    }

    static {
        \u00d5\u00d30000 = new b$_u$1();
    }
}

