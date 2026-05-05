/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.k;

import b.o.d.fc;
import b.o.e.g;
import b.o.e.h;
import b.t.c.b.b.d.e;
import b.t.c.b.b.d.f;
import b.t.c.b.b.k.c$_b$0;
import b.t.c.b.b.k.n;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class c {
    public static final String super(f f2, boolean bl) {
        String string;
        String string2 = string = bl ? f2.\u00d200000() : f2.\u00d400000();
        if (!(bl && f2.super() || !c.super(string))) {
            return "`".concat(String.valueOf(string)) + '`';
        }
        return string;
    }

    public static /* synthetic */ String super(f f2, boolean bl, int n2, Object object) {
        if ((n2 & 1) != 0) {
            bl = false;
        }
        return c.super(f2, bl);
    }

    private static final boolean super(String string) {
        block5: {
            block4: {
                boolean bl;
                block3: {
                    if (n.super.contains(string)) break block4;
                    CharSequence charSequence = string;
                    for (int i2 = 0; i2 < charSequence.length(); ++i2) {
                        char c2 = charSequence.charAt(i2);
                        if (!(!Character.isLetterOrDigit(c2) && c2 != '_')) continue;
                        bl = true;
                        break block3;
                    }
                    bl = false;
                }
                if (!bl && !(((CharSequence)string).length() == 0) && Character.isJavaIdentifierStart(string.codePointAt(0))) break block5;
            }
            return true;
        }
        return false;
    }

    public static final String super(e e2) {
        return c.super(e2.\u00d600000());
    }

    public static final String super(List object) {
        StringBuilder stringBuilder;
        StringBuilder stringBuilder2 = stringBuilder = new StringBuilder();
        object = object.iterator();
        while (object.hasNext()) {
            f f2 = (f)object.next();
            if (stringBuilder2.length() > 0) {
                stringBuilder2.append(".");
            }
            stringBuilder2.append(c.super(f2, false, 1, null));
        }
        return stringBuilder.toString();
    }

    public static final String super(String string, String string2, h object, h h2, g g2) {
        object = (String)object.newreturn();
        String string3 = "Mutable";
        string3 = c.super(string, (String)object + string3, string2, (String)object, (String)object + '(' + string3 + ')');
        if (string3 != null) {
            return string3;
        }
        if ((object = c.super(string, (String)object + "MutableMap.MutableEntry", string2, (String)object + "Map.Entry", (String)object + "(Mutable)Map.(Mutable)Entry")) != null) {
            return object;
        }
        object = (String)h2.newreturn();
        if ((string = c.super(string, (String)object + (String)g2.\u00f800000("Array<"), string2, (String)object + (String)g2.\u00f800000("Array<out "), (String)object + (String)g2.\u00f800000("Array<(out) "))) != null) {
            return string;
        }
        return null;
    }

    public static /* synthetic */ String super(String string, String string2, h h2, h h3, g g2, int n2, Object object) {
        if ((n2 & 0x10) != 0) {
            g2 = c$_b$0.\u00d5\u00d3\u00d4000;
        }
        return c.super(string, string2, h2, h3, g2);
    }

    public static final String super(String string, String string2, String string3, String string4, String string5) {
        if (b.q.f.\u00d300000(string, string2, false, 2, null) && b.q.f.\u00d300000(string3, string4, false, 2, null)) {
            string = string.substring(string2.length());
            string2 = string3.substring(string4.length());
            string3 = string5 + string;
            if (fc.o00000((Object)string, (Object)string2)) {
                return string3;
            }
            if (c.super(string, string2)) {
                return string3 + '!';
            }
        }
        return null;
    }

    public static final boolean super(String string, String string2) {
        return fc.o00000((Object)string, (Object)b.q.f.super(string2, "?", "", false, 4, null)) || b.q.f.\u00d400000(string2, "?", false, 2, null) && fc.o00000((Object)(string + '?'), (Object)string2) || fc.o00000((Object)("(" + string + ")?"), (Object)string2);
    }

    private static final String \u00d300000(String string) {
        return string;
    }

    static /* synthetic */ String \u00d200000(String string) {
        return c.\u00d300000(string);
    }
}

