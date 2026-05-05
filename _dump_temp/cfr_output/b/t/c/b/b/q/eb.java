/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.q;

import b.t.c.b.b.g.t;
import b.t.c.b.b.g.t$_b;
import b.t.c.b.b.m.e;
import b.t.c.b.b.o.e.b.l;
import b.t.c.b.b.o.n;
import b.t.c.b.b.q.ac;
import b.t.c.b.b.q.b.q;
import b.t.c.b.b.q.d$_b;
import b.t.c.b.b.q.d$_c;
import b.t.c.b.b.q.d$_d;
import b.t.c.b.b.q.d$_e;
import b.t.c.b.b.q.d$_f;
import b.t.c.b.b.q.d$_g;
import b.t.c.b.b.q.d$_h;
import b.t.c.b.b.q.d$_i;
import b.t.c.b.b.q.d$_j;
import b.t.c.b.b.q.eb$1;
import b.t.c.b.b.q.eb$10;
import b.t.c.b.b.q.eb$11;
import b.t.c.b.b.q.eb$12;
import b.t.c.b.b.q.eb$2;
import b.t.c.b.b.q.eb$3;
import b.t.c.b.b.q.eb$4;
import b.t.c.b.b.q.eb$5;
import b.t.c.b.b.q.eb$6;
import b.t.c.b.b.q.eb$7;
import b.t.c.b.b.q.eb$8;
import b.t.c.b.b.q.eb$9;
import b.t.c.b.b.q.s;
import b.t.c.b.b.q.ub;
import b.t.c.b.b.q.wb;
import b.t.c.b.b.q.yb;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.ServiceLoader;
import java.util.Set;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class eb {
    public static final s oO0000 = new eb$1(d$_i.OO0000);
    public static final s \u00f600000 = new eb$2(d$_d.\u00d800000);
    public static final s \u00d600000 = new eb$3(d$_b.\u00d500000);
    public static final s \u00f500000 = new eb$4(d$_c.return);
    public static final s \u00d200000 = new eb$5(d$_f.\u00f500000);
    public static final s \u00d500000 = new eb$6(d$_e.\u00f400000);
    public static final s \u00d2O0000 = new eb$7(d$_h.\u00f800000);
    public static final s \u00d5O0000 = new eb$8(d$_g.if);
    public static final s OO0000 = new eb$9(d$_j.oO0000);
    public static final Set \u00f400000 = Collections.unmodifiableSet(b.s.ub.\u00d300000(oO0000, \u00f600000, \u00f500000, \u00d500000));
    private static final Map \u00d4O0000;
    public static final s o00000;
    private static final l float;
    public static final l \u00d400000;
    public static final l void;
    private static final t public;
    private static final Map Object;

    public static boolean super(ub ub2, wb wb2, boolean bl) {
        if (ub2 == null) {
            eb.super(2);
        }
        if (wb2 == null) {
            eb.super(3);
        }
        return eb.super(\u00d400000, ub2, wb2, bl) == null;
    }

    public static boolean super(wb wb2, wb object) {
        if (wb2 == null) {
            eb.super(6);
        }
        if (object == null) {
            eb.super(7);
        }
        if ((object = n.super((wb)object)) != yb.o00000) {
            return object.equals(n.super(wb2));
        }
        return false;
    }

    public static ub super(l object, ub ub2, wb wb2, boolean bl) {
        if (ub2 == null) {
            eb.super(8);
        }
        if (wb2 == null) {
            eb.super(9);
        }
        ub ub3 = (ub)ub2.returnnull();
        while (ub3 != null && ub3.\u00d50O000() != \u00d500000) {
            if (!ub3.\u00d50O000().o00000((l)object, ub3, wb2, bl)) {
                return ub3;
            }
            ub3 = (ub)n.super((wb)ub3, ub.class);
        }
        if (ub2 instanceof q && (object = eb.super((l)object, ((q)ub2).\u00d80\u00d2000(), wb2, bl)) != null) {
            return object;
        }
        return null;
    }

    public static Integer super(s object, s s2) {
        Integer n2;
        if (object == null) {
            eb.super(12);
        }
        if (s2 == null) {
            eb.super(13);
        }
        if ((n2 = ((s)object).o00000(s2)) != null) {
            return n2;
        }
        if ((object = s2.o00000((s)object)) != null) {
            return -((Integer)object).intValue();
        }
        return null;
    }

    public static boolean super(s s2) {
        if (s2 == null) {
            eb.super(14);
        }
        return s2 == oO0000 || s2 == \u00f600000;
    }

    private static void \u00d200000(s s2) {
        Object.put(s2.\u00d400000(), s2);
    }

    public static s super(ac ac2) {
        s s2;
        if (ac2 == null) {
            eb.super(15);
        }
        if ((s2 = (s)Object.get(ac2)) == null) {
            throw new IllegalArgumentException("Inapplicable visibility: ".concat(String.valueOf(ac2)));
        }
        s s3 = s2;
        if (s3 == null) {
            eb.super(16);
        }
        return s3;
    }

    static /* synthetic */ l \u00d200000() {
        return float;
    }

    static /* synthetic */ t super() {
        return public;
    }

    static {
        Object object = e.new(4);
        object.put(\u00f600000, 0);
        object.put(oO0000, 0);
        object.put(\u00f500000, 1);
        object.put(\u00d600000, 1);
        object.put(\u00d200000, 2);
        \u00d4O0000 = Collections.unmodifiableMap(object);
        o00000 = \u00d200000;
        float = new eb$10();
        \u00d400000 = new eb$11();
        void = new eb$12();
        object = ServiceLoader.load(t.class, t.class.getClassLoader()).iterator();
        public = object.hasNext() ? (t)object.next() : t$_b.o00000;
        Object = new HashMap();
        eb.\u00d200000(oO0000);
        eb.\u00d200000(\u00f600000);
        eb.\u00d200000(\u00d600000);
        eb.\u00d200000(\u00f500000);
        eb.\u00d200000(\u00d200000);
        eb.\u00d200000(\u00d500000);
        eb.\u00d200000(\u00d2O0000);
        eb.\u00d200000(\u00d5O0000);
        eb.\u00d200000(OO0000);
    }

    private static /* synthetic */ void super(int n2) {
        RuntimeException runtimeException;
        Object[] objectArray;
        Object[] objectArray2;
        int n3;
        String string;
        switch (n2) {
            default: {
                string = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
            }
            case 16: {
                string = "@NotNull method %s.%s must not return null";
            }
        }
        switch (n2) {
            default: {
                n3 = 3;
                break;
            }
            case 16: {
                n3 = 2;
            }
        }
        Object[] objectArray3 = new Object[n3];
        switch (n2) {
            default: {
                objectArray2 = objectArray3;
                objectArray3[0] = "what";
                break;
            }
            case 1: 
            case 3: 
            case 5: 
            case 7: 
            case 9: {
                objectArray2 = objectArray3;
                objectArray3[0] = "from";
                break;
            }
            case 10: 
            case 12: {
                objectArray2 = objectArray3;
                objectArray3[0] = "first";
                break;
            }
            case 11: 
            case 13: {
                objectArray2 = objectArray3;
                objectArray3[0] = "second";
                break;
            }
            case 14: 
            case 15: {
                objectArray2 = objectArray3;
                objectArray3[0] = "visibility";
                break;
            }
            case 16: {
                objectArray2 = objectArray3;
                objectArray3[0] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities";
            }
        }
        switch (n2) {
            default: {
                objectArray = objectArray2;
                objectArray2[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities";
                break;
            }
            case 16: {
                objectArray = objectArray2;
                objectArray2[1] = "toDescriptorVisibility";
            }
        }
        switch (n2) {
            default: {
                objectArray = objectArray;
                objectArray[2] = "isVisible";
                break;
            }
            case 2: 
            case 3: {
                objectArray = objectArray;
                objectArray[2] = "isVisibleIgnoringReceiver";
                break;
            }
            case 4: 
            case 5: {
                objectArray = objectArray;
                objectArray[2] = "isVisibleWithAnyReceiver";
                break;
            }
            case 6: 
            case 7: {
                objectArray = objectArray;
                objectArray[2] = "inSameFile";
                break;
            }
            case 8: 
            case 9: {
                objectArray = objectArray;
                objectArray[2] = "findInvisibleMember";
                break;
            }
            case 10: 
            case 11: {
                objectArray = objectArray;
                objectArray[2] = "compareLocal";
                break;
            }
            case 12: 
            case 13: {
                objectArray = objectArray;
                objectArray[2] = "compare";
                break;
            }
            case 14: {
                objectArray = objectArray;
                objectArray[2] = "isPrivate";
                break;
            }
            case 15: {
                objectArray = objectArray;
                objectArray[2] = "toDescriptorVisibility";
            }
            case 16: 
        }
        String string2 = String.format(string, objectArray);
        switch (n2) {
            default: {
                runtimeException = new IllegalArgumentException(string2);
                break;
            }
            case 16: {
                runtimeException = new IllegalStateException(string2);
            }
        }
        throw runtimeException;
    }
}

