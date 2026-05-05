/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.n.c;

import b.m;
import b.s.mc;
import b.t.c.b.b.n.c.b;
import b.t.c.b.b.n.c.f;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class p {
    public static final b.t.c.b.b.d.f \u00d300000(b.t.c.b.b.d.f f2) {
        b.t.c.b.b.d.f f3 = p.o00000(f2, "get", false, null, 12, null);
        if (f3 == null) {
            f3 = p.o00000(f2, "is", false, null, 8, null);
        }
        return f3;
    }

    public static final b.t.c.b.b.d.f o00000(b.t.c.b.b.d.f f2, boolean bl) {
        return p.o00000(f2, "set", false, bl ? "is" : null, 4, null);
    }

    public static final List o00000(b.t.c.b.b.d.f f2) {
        Object[] objectArray = new b.t.c.b.b.d.f[2];
        Object[] objectArray2 = objectArray;
        objectArray[0] = p.o00000(f2, false);
        objectArray2[1] = p.o00000(f2, true);
        return mc.\u00d500000(objectArray2);
    }

    private static final b.t.c.b.b.d.f o00000(b.t.c.b.b.d.f f2, String string, boolean bl, String string2) {
        if (f2.super()) {
            return null;
        }
        String string3 = f2.\u00d300000();
        if (!b.q.f.\u00d300000(string3, string, false, 2, null)) {
            return null;
        }
        if (string3.length() == string.length()) {
            return null;
        }
        char c2 = string3.charAt(string.length());
        boolean bl2 = 'a' <= c2 ? c2 < '{' : false;
        if (bl2) {
            return null;
        }
        if (string2 != null) {
            if (m.new && !bl) {
                String string4 = "Assertion failed";
                throw new AssertionError((Object)string4);
            }
            return b.t.c.b.b.d.f.\u00d300000(string2 + b.q.f.\u00d300000(string3, (CharSequence)string));
        }
        if (!bl) {
            return f2;
        }
        String string5 = b.t.c.b.b.g.c.b.o00000(b.q.f.\u00d300000(string3, (CharSequence)string), true);
        if (!b.t.c.b.b.d.f.super(string5)) {
            return null;
        }
        return b.t.c.b.b.d.f.\u00d300000(string5);
    }

    static /* synthetic */ b.t.c.b.b.d.f o00000(b.t.c.b.b.d.f f2, String string, boolean bl, String string2, int n2, Object object) {
        if ((n2 & 4) != 0) {
            bl = true;
        }
        if ((n2 & 8) != 0) {
            string2 = null;
        }
        return p.o00000(f2, string, bl, string2);
    }

    public static final List new(b.t.c.b.b.d.f f2) {
        String string = f2.\u00d400000();
        if (b.\u00d300000(string)) {
            return mc.new((Object)p.\u00d300000(f2));
        }
        if (b.new(string)) {
            return p.o00000(f2);
        }
        return f.\u00d600000.o00000(f2);
    }
}

