/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.l;

import b.t.c.b.b.l.b$_v$1;
import b.t.c.b.b.p.t$_b;
import b.t.c.b.b.p.t$_c;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public enum b$_v implements t$_c
{
    \u00d4\u00d40000(0, 0),
    O\u00d40000(1, 1),
    forObject(2, 2),
    nullObject(3, 3);

    private static t$_b o\u00d40000;
    private final int \u00d5\u00d40000;

    @Override
    public final int super() {
        return this.\u00d5\u00d40000;
    }

    public static b$_v \u00f600000(int n2) {
        switch (n2) {
            case 0: {
                return \u00d4\u00d40000;
            }
            case 1: {
                return O\u00d40000;
            }
            case 2: {
                return forObject;
            }
            case 3: {
                return nullObject;
            }
        }
        return null;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private b$_v() {
        void var4_-1;
        this.\u00d5\u00d40000 = var4_-1;
    }

    static {
        o\u00d40000 = new b$_v$1();
    }
}

