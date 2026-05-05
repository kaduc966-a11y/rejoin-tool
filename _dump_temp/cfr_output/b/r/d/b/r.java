/*
 * Decompiled with CFR 0.152.
 */
package b.r.d.b;

import b.r.b;
import b.r.d.b.d;
import b.r.d.b.h;
import b.r.d.b.l;
import b.r.d.b.o;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class r {
    private static final int \u00d200000 = 1;
    private static final int super = 2;

    public static final StackTraceElement \u00d500000(o object) {
        h h2 = r.\u00d300000((o)object);
        if (h2 == null) {
            return null;
        }
        h h3 = h2;
        if (h2.\u00d300000() <= 0) {
            return null;
        }
        int n2 = r.new((o)object);
        n2 = n2 < 0 ? -1 : h3.\u00d200000()[n2];
        object = l.\u00d300000.\u00d200000((b)object);
        object = object == null ? h3.\u00d800000() : (String)object + '/' + h3.\u00d800000();
        return new StackTraceElement((String)object, h3.class(), h3.super(), n2);
    }

    private static final h \u00d300000(o o2) {
        return o2.getClass().getAnnotation(h.class);
    }

    private static final int new(o object) {
        int n2;
        if (object instanceof d) {
            return 0;
        }
        try {
            Field field = object.getClass().getDeclaredField("label");
            field.setAccessible(true);
            object = field.get(object);
            Integer n3 = object instanceof Integer ? (Integer)object : null;
            n2 = (n3 != null ? n3 : 0) - 1;
        }
        catch (Exception exception) {
            n2 = -1;
        }
        return n2;
    }

    public static final String[] o00000(o o2) {
        h h2 = r.\u00d300000(o2);
        if (h2 == null) {
            return null;
        }
        h h3 = h2;
        if (h2.\u00d300000() <= 0) {
            return null;
        }
        ArrayList<String> arrayList = new ArrayList<String>();
        int n2 = r.new(o2);
        int[] nArray = h3.\u00d400000();
        int n3 = nArray.length;
        for (int i2 = 0; i2 < n3; ++i2) {
            int n4 = i2;
            if (nArray[i2] != n2) continue;
            arrayList.add(h3.\u00d600000()[n4]);
            arrayList.add(h3.\u00f400000()[n4]);
        }
        return ((Collection)arrayList).toArray(new String[0]);
    }

    public static final int \u00d400000(o o2) {
        h h2 = r.\u00d300000(o2);
        if (h2 == null) {
            return -1;
        }
        h h3 = h2;
        if (h2.\u00d300000() < 2) {
            return -1;
        }
        int n2 = r.new(o2);
        if (n2 < 0) {
            return -1;
        }
        if (n2 >= h3.int().length) {
            return -1;
        }
        return h3.int()[n2];
    }
}

