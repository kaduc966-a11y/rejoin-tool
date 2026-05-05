/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.h.d;

import b.m;
import b.s.mc;
import b.s.ub;
import b.t.c.b.b.h.bc;
import b.t.c.b.b.h.d.b;
import b.t.c.b.b.h.d.c;
import b.t.c.b.b.h.d.d;
import b.t.c.b.b.h.d.e;
import b.t.c.b.b.h.d.f;
import b.t.c.b.b.h.d.h;
import b.t.c.b.b.h.d.i;
import b.t.c.b.b.h.d.j;
import b.t.c.b.b.h.d.l;
import b.t.c.b.b.h.rc;
import b.t.c.b.b.q.pb;
import b.t.c.b.b.q.wb;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class k {
    public static final k \u00d400000 = new k();
    private static final b.t.c.b.b.q.bc Object = i.\u00f5\u00d3\u00d8000;
    private static final f o00000;
    private static final rc \u00d200000;
    private static final rc \u00d500000;
    private static final pb void;
    private static final Set \u00d600000;

    private k() {
    }

    public final b.t.c.b.b.q.bc \u00d400000() {
        return Object;
    }

    public final f new() {
        return o00000;
    }

    public final rc o00000() {
        return \u00d200000;
    }

    public final rc \u00d300000() {
        return \u00d500000;
    }

    public final Set \u00d500000() {
        return \u00d600000;
    }

    public static final b o00000(d d2, String ... stringArray) {
        return k.o00000(d2, false, Arrays.copyOf(stringArray, stringArray.length));
    }

    public static final b o00000(d d2, boolean bl, String ... stringArray) {
        if (bl) {
            return new j(d2, Arrays.copyOf(stringArray, stringArray.length));
        }
        return new b(d2, Arrays.copyOf(stringArray, stringArray.length));
    }

    public static final e new(c c2, String ... stringArray) {
        return \u00d400000.o00000(c2, mc.\u00d500000(), Arrays.copyOf(stringArray, stringArray.length));
    }

    public final e o00000(c c2, bc bc2, String ... stringArray) {
        return this.o00000(c2, mc.\u00d500000(), bc2, Arrays.copyOf(stringArray, stringArray.length));
    }

    public final e o00000(c c2, List list, String ... stringArray) {
        return this.o00000(c2, list, this.o00000(c2, Arrays.copyOf(stringArray, stringArray.length)), Arrays.copyOf(stringArray, stringArray.length));
    }

    public final e o00000(c c2, List list, bc bc2, String ... stringArray) {
        String[] stringArray2 = new String[1];
        String[] stringArray3 = stringArray2;
        stringArray2[0] = bc2.toString();
        return new e(bc2, (b.t.c.b.b.o.e.f)k.o00000(d.int, stringArray3), c2, list, false, Arrays.copyOf(stringArray, stringArray.length));
    }

    public final b.t.c.b.b.h.d.m o00000(c c2, String ... stringArray) {
        return new b.t.c.b.b.h.d.m(c2, Arrays.copyOf(stringArray, stringArray.length));
    }

    public static final boolean o00000(wb wb2) {
        return wb2 != null && (\u00d400000.new(wb2) || \u00d400000.new(wb2.\u00d8\u00f80000()) || wb2 == Object);
    }

    private final boolean new(wb wb2) {
        return wb2 instanceof f;
    }

    public static final boolean o00000(rc object) {
        if (object == null) {
            return false;
        }
        return (object = ((rc)object).thisdosuper()) instanceof b.t.c.b.b.h.d.m && ((b.t.c.b.b.h.d.m)object).privateint() == c.\u00d5\u00d50000;
    }

    public final String new(rc object) {
        boolean bl = b.t.c.b.b.h.b.b.\u00d300000((rc)object);
        if (m.new && !bl) {
            object = "Assertion failed";
            throw new AssertionError(object);
        }
        return ((b.t.c.b.b.h.d.m)((rc)object).thisdosuper()).\u00f5\u00d20000(0);
    }

    static {
        String string = h.null.\u00d200000();
        Object[] objectArray = new Object[1];
        Object[] objectArray2 = objectArray;
        objectArray[0] = "unknown class";
        o00000 = new f(b.t.c.b.b.d.f.\u00d400000(String.format(string, Arrays.copyOf(objectArray2, objectArray2.length))));
        \u00d200000 = k.new(c.\u00d800000, new String[0]);
        \u00d500000 = k.new(c.ifObject, new String[0]);
        void = new l();
        \u00d600000 = ub.super((Object)void);
    }
}

