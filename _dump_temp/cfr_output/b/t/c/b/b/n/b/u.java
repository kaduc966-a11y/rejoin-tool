/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.n.b;

import b.m;
import b.q.f;
import b.qd;
import b.t.c.b.b.b.j;
import b.t.c.b.b.n.b.g;
import b.t.c.b.b.n.b.u$_b;
import b.t.c.b.b.n.b.z;
import b.t.c.b.b.n.b.z$_b;
import b.t.c.b.b.n.b.z$_c;
import b.t.c.b.b.n.b.z$_d;
import b.t.c.b.b.o.h.b;
import b.t.c.b.b.o.h.e;

final class u
implements g {
    public static final u o00000 = new u();

    private u() {
    }

    public final z o00000(z z2) {
        if (z2 instanceof z$_b && ((z$_b)z2).\u00f800000() != null) {
            return this.String(b.o00000(((z$_b)z2).\u00f800000().o00000()).\u00d200000());
        }
        return z2;
    }

    public final z \u00d300000(String object) {
        boolean bl;
        e[] eArray;
        e[] eArray2;
        char c2;
        block8: {
            char c3 = c2 = ((CharSequence)object).length() > 0 ? (char)'\u0001' : '\u0000';
            if (m.new && c2 == '\u0000') {
                String string = "empty string as JvmType";
                throw new AssertionError((Object)string);
            }
            c2 = object.charAt(0);
            eArray2 = e.values();
            int n2 = eArray2.length;
            for (int i2 = 0; i2 < n2; ++i2) {
                e[] eArray3 = eArray2[i2];
                if (!(eArray3.\u00d400000().charAt(0) == c2)) continue;
                eArray = eArray3;
                break block8;
            }
            eArray = eArray2 = null;
        }
        if (eArray != null) {
            object = eArray2;
            return new z$_b((e)((Object)object));
        }
        switch (c2) {
            case 'V': {
                return new z$_b(null);
            }
            case '[': {
                return new z$_d(this.\u00d300000(object.substring(1)));
            }
        }
        boolean bl2 = bl = c2 == 'L' && f.\u00d200000((CharSequence)object, ';', false, 2, null);
        if (m.new && !bl) {
            object = "Type that is not primitive nor array should be Object, but '" + (String)object + "' was found";
            throw new AssertionError(object);
        }
        return new z$_c(object.substring(1, object.length() - 1));
    }

    public final z \u00d200000(j j2) {
        switch (u$_b.o00000[j2.ordinal()]) {
            case 1: {
                return z.class.\u00f400000();
            }
            case 2: {
                return z.class.\u00d500000();
            }
            case 3: {
                return z.class.o00000();
            }
            case 4: {
                return z.class.\u00d400000();
            }
            case 5: {
                return z.class.\u00d300000();
            }
            case 6: {
                return z.class.\u00d800000();
            }
            case 7: {
                return z.class.return();
            }
            case 8: {
                return z.class.new();
            }
        }
        throw new qd();
    }

    public final z$_c String(String string) {
        return new z$_c(string);
    }

    public final String \u00d200000(z z2) {
        Object object;
        z z3 = z2;
        if (z3 instanceof z$_d) {
            return "[" + this.\u00d200000(((z$_d)z2).\u00f600000());
        }
        if (z3 instanceof z$_b) {
            object = ((z$_b)z2).\u00f800000();
            if (object == null || (object = object.\u00d400000()) == null) {
                return "V";
            }
        } else {
            if (z3 instanceof z$_c) {
                return "L" + ((z$_c)z2).\u00f500000() + ';';
            }
            throw new qd();
        }
        return object;
    }

    public final z \u00d200000() {
        return this.String("java/lang/Class");
    }
}

