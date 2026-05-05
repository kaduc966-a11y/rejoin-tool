/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.n.b;

import b.s.mc;
import b.t.c.b.b.n.b.o$_b$0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class o {
    public static final o o00000 = new o();

    private o() {
    }

    public final String \u00d300000(String string) {
        return "java/lang/".concat(String.valueOf(string));
    }

    public final String \u00d800000(String string) {
        return "java/util/".concat(String.valueOf(string));
    }

    public final String class(String string) {
        return "java/util/function/".concat(String.valueOf(string));
    }

    public final String \u00d400000(String string) {
        return "java/util/concurrent/atomic/".concat(String.valueOf(string));
    }

    public final String[] super(String ... object) {
        String[] stringArray = object;
        object = new ArrayList(((String[])object).length);
        for (String string : stringArray) {
            Object object2 = object;
            object2.add("<init>(" + string + ")V");
        }
        return ((Collection)((List)object)).toArray(new String[0]);
    }

    public final Set \u00d300000(String string, String ... stringArray) {
        o o2 = this;
        return o2.\u00d200000(o2.\u00d300000(string), Arrays.copyOf(stringArray, stringArray.length));
    }

    public final Set super(String string, String ... stringArray) {
        o o2 = this;
        return o2.\u00d200000(o2.\u00d800000(string), Arrays.copyOf(stringArray, stringArray.length));
    }

    public final Set \u00d200000(String string, String ... stringArray) {
        Collection collection = new LinkedHashSet();
        for (String string2 : stringArray) {
            Collection collection2 = collection;
            collection2.add(string + '.' + string2);
        }
        return (Set)collection;
    }

    public final String super(String string, String string2) {
        return string + '.' + string2;
    }

    public final String super(String string, List list, String string2) {
        return string + '(' + mc.o00000(list, "", null, null, 0, null, o$_b$0.\u00d5\u00d4\u00d4000, 30, null) + ')' + this.\u00d200000(string2);
    }

    private final String \u00d200000(String string) {
        if (string.length() > 1) {
            return "L" + string + ';';
        }
        return string;
    }

    private static final CharSequence \u00d600000(String string) {
        return o00000.\u00d200000(string);
    }

    static /* synthetic */ CharSequence super(String string) {
        return o.\u00d600000(string);
    }
}

