/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.n.c;

import b.o.d.fc;
import b.q.f;
import b.t.c.b.b.d.d;
import b.t.c.b.b.d.d$_b;
import b.t.c.b.b.d.k;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class b {
    public static final b class = new b();
    public static final k \u00d300000 = new k("b.o.n");
    public static final d \u00d200000 = d.String.o00000(\u00d300000);
    private static final d super = d.String.o00000(new k("b.t.c.b.q"));
    private static final d \u00d400000 = d$_b.o00000(d.String, "kotlin/jvm/internal/RepeatableContainer", false, 2, null);

    private b() {
    }

    public final d o00000() {
        return \u00d400000;
    }

    public static final boolean \u00d300000(String string) {
        return f.\u00d300000(string, "get", false, 2, null) || f.\u00d300000(string, "is", false, 2, null);
    }

    public static final boolean new(String string) {
        return f.\u00d300000(string, "set", false, 2, null);
    }

    public static final String \u00d400000(String string) {
        if (b.\u00d500000(string)) {
            return string;
        }
        return "get" + b.t.c.b.b.g.c.b.o00000(string);
    }

    public static final String o00000(String string) {
        return "set" + (b.\u00d500000(string) ? string.substring(2) : b.t.c.b.b.g.c.b.o00000(string));
    }

    public static final boolean \u00d500000(String string) {
        if (!f.\u00d300000(string, "is", false, 2, null)) {
            return false;
        }
        if (string.length() == 2) {
            return false;
        }
        char c2 = string.charAt(2);
        return fc.o00000(97, c2) > 0 || fc.o00000((int)c2, 122) > 0;
    }
}

