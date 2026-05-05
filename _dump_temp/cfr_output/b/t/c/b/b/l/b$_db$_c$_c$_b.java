/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.l;

import b.t.c.b.b.l.b$_db$_c$_c$_b$1;
import b.t.c.b.b.p.t$_b;
import b.t.c.b.b.p.t$_c;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public enum b$_db$_c$_c$_b implements t$_c
{
    returnString(0, 0),
    \u00f4\u00d50000(1, 1),
    ifString(2, 2),
    \u00f4\u00d40000(3, 3),
    \u00f5\u00d40000(4, 4),
    \u00f5\u00d50000(5, 5),
    \u00d4\u00d50000(6, 6),
    \u00f8\u00d40000(7, 7),
    \u00d3\u00d50000(8, 8),
    \u00d8\u00d50000(9, 9),
    \u00d8\u00d40000(10, 10),
    newString(11, 11),
    privateObject(12, 12);

    private static t$_b o\u00d50000;
    private final int \u00d5\u00d50000;

    @Override
    public final int super() {
        return this.\u00d5\u00d50000;
    }

    public static b$_db$_c$_c$_b \u00f800000(int n2) {
        switch (n2) {
            case 0: {
                return returnString;
            }
            case 1: {
                return \u00f4\u00d50000;
            }
            case 2: {
                return ifString;
            }
            case 3: {
                return \u00f4\u00d40000;
            }
            case 4: {
                return \u00f5\u00d40000;
            }
            case 5: {
                return \u00f5\u00d50000;
            }
            case 6: {
                return \u00d4\u00d50000;
            }
            case 7: {
                return \u00f8\u00d40000;
            }
            case 8: {
                return \u00d3\u00d50000;
            }
            case 9: {
                return \u00d8\u00d50000;
            }
            case 10: {
                return \u00d8\u00d40000;
            }
            case 11: {
                return newString;
            }
            case 12: {
                return privateObject;
            }
        }
        return null;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private b$_db$_c$_c$_b() {
        void var4_-1;
        this.\u00d5\u00d50000 = var4_-1;
    }

    static {
        o\u00d50000 = new b$_db$_c$_c$_b$1();
    }
}

