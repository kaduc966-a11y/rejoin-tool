/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.n.b.b;

import b.s.mc;
import b.s.z;
import b.t.c.b.b.n.b.b.c$_b;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class c {
    private final c$_b new;
    private final b.t.c.b.b.l.d.c \u00d500000;
    private final String[] \u00d300000;
    private final String[] return;
    private final String[] \u00f400000;
    private final String \u00d800000;
    private final int \u00f500000;
    private final String o00000;
    private final byte[] \u00d400000;

    public c(c$_b c$_b, b.t.c.b.b.l.d.c c2, String[] stringArray, String[] stringArray2, String[] stringArray3, String string, int n2, String string2, byte[] byArray) {
        this.new = c$_b;
        this.\u00d500000 = c2;
        this.\u00d300000 = stringArray;
        this.return = stringArray2;
        this.\u00f400000 = stringArray3;
        this.\u00d800000 = string;
        this.\u00f500000 = n2;
        this.o00000 = string2;
        this.\u00d400000 = byArray;
    }

    public final c$_b \u00d600000() {
        return this.new;
    }

    public final b.t.c.b.b.l.d.c o00000() {
        return this.\u00d500000;
    }

    public final String[] String() {
        return this.\u00d300000;
    }

    public final String[] \u00d500000() {
        return this.return;
    }

    public final String[] null() {
        return this.\u00f400000;
    }

    public final String \u00d300000() {
        String string = this.\u00d800000;
        if (this.new == c$_b.\u00d200000) {
            return string;
        }
        return null;
    }

    public final List \u00f500000() {
        Object[] objectArray = this.\u00d300000;
        Object object = this.new == c$_b.float ? objectArray : null;
        List list = object != null ? z.\u00d500000(object) : null;
        if (list == null) {
            list = mc.\u00d500000();
        }
        return list;
    }

    public final boolean \u00d800000() {
        c c2 = this;
        if (c2.o00000(c2.\u00f500000, 16)) {
            c c3 = this;
            if (!c3.o00000(c3.\u00f500000, 32)) {
                return true;
            }
        }
        return false;
    }

    public final boolean \u00d200000() {
        c c2 = this;
        return c2.o00000(c2.\u00f500000, 2);
    }

    public final String toString() {
        return (Object)((Object)this.new) + " version=" + this.\u00d500000;
    }

    private final boolean o00000(int n2, int n3) {
        return (n2 & n3) != 0;
    }
}

