/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.n.c;

import b.t.c.b.b.n.c.fb$1;
import b.t.c.b.b.n.c.fb$2;
import b.t.c.b.b.n.c.fb$3;
import b.t.c.b.b.o.e.b.l;
import b.t.c.b.b.o.n;
import b.t.c.b.b.q.ac;
import b.t.c.b.b.q.c.b$_b;
import b.t.c.b.b.q.c.b$_c;
import b.t.c.b.b.q.c.b$_d;
import b.t.c.b.b.q.eb;
import b.t.c.b.b.q.lc;
import b.t.c.b.b.q.s;
import b.t.c.b.b.q.ub;
import b.t.c.b.b.q.wb;
import java.util.HashMap;
import java.util.Map;

public class fb {
    public static final s String = new fb$1(b$_c.\u00d300000);
    public static final s \u00d200000 = new fb$2(b$_b.while);
    public static final s o00000 = new fb$3(b$_d.\u00d400000);
    private static final Map \u00d300000 = new HashMap();

    private static boolean o00000(l l2, ub ub2, wb wb2) {
        if (ub2 == null) {
            fb.o00000(0);
        }
        if (wb2 == null) {
            fb.o00000(1);
        }
        if (fb.o00000(n.super(ub2), wb2)) {
            return true;
        }
        return eb.\u00d600000.o00000(l2, ub2, wb2, false);
    }

    private static boolean o00000(wb wb2, wb wb3) {
        if (wb2 == null) {
            fb.o00000(2);
        }
        if (wb3 == null) {
            fb.o00000(3);
        }
        wb2 = (lc)n.super(wb2, lc.class, false);
        return (wb3 = (lc)n.super(wb3, lc.class, false)) != null && wb2 != null && wb2.OOO000().equals(wb3.OOO000());
    }

    private static void o00000(s s2) {
        \u00d300000.put(s2.\u00d400000(), s2);
    }

    public static s o00000(ac ac2) {
        s s2;
        if (ac2 == null) {
            fb.o00000(4);
        }
        if ((s2 = (s)\u00d300000.get(ac2)) == null) {
            s s3 = eb.super(ac2);
            if (s3 == null) {
                fb.o00000(5);
            }
            return s3;
        }
        s s4 = s2;
        if (s4 == null) {
            fb.o00000(6);
        }
        return s4;
    }

    static /* synthetic */ boolean \u00d200000(wb wb2, wb wb3) {
        return fb.o00000(wb2, wb3);
    }

    static /* synthetic */ boolean \u00d200000(l l2, ub ub2, wb wb2) {
        return fb.o00000(l2, ub2, wb2);
    }

    static {
        fb.o00000(String);
        fb.o00000(\u00d200000);
        fb.o00000(o00000);
    }

    private static /* synthetic */ void o00000(int n2) {
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
            case 5: 
            case 6: {
                string = "@NotNull method %s.%s must not return null";
            }
        }
        switch (n2) {
            default: {
                n3 = 3;
                break;
            }
            case 5: 
            case 6: {
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
            case 1: {
                objectArray2 = objectArray3;
                objectArray3[0] = "from";
                break;
            }
            case 2: {
                objectArray2 = objectArray3;
                objectArray3[0] = "first";
                break;
            }
            case 3: {
                objectArray2 = objectArray3;
                objectArray3[0] = "second";
                break;
            }
            case 4: {
                objectArray2 = objectArray3;
                objectArray3[0] = "visibility";
                break;
            }
            case 5: 
            case 6: {
                objectArray2 = objectArray3;
                objectArray3[0] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities";
            }
        }
        switch (n2) {
            default: {
                objectArray = objectArray2;
                objectArray2[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities";
                break;
            }
            case 5: 
            case 6: {
                objectArray = objectArray2;
                objectArray2[1] = "toDescriptorVisibility";
            }
        }
        switch (n2) {
            default: {
                objectArray = objectArray;
                objectArray[2] = "isVisibleForProtectedAndPackage";
                break;
            }
            case 2: 
            case 3: {
                objectArray = objectArray;
                objectArray[2] = "areInSamePackage";
                break;
            }
            case 4: {
                objectArray = objectArray;
                objectArray[2] = "toDescriptorVisibility";
            }
            case 5: 
            case 6: 
        }
        String string2 = java.lang.String.format(string, objectArray);
        switch (n2) {
            default: {
                runtimeException = new IllegalArgumentException(string2);
                break;
            }
            case 5: 
            case 6: {
                runtimeException = new IllegalStateException(string2);
            }
        }
        throw runtimeException;
    }
}

