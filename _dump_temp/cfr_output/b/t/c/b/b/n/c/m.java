/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.n.c;

import b.t.c.b.b.b.h;
import b.t.c.b.b.b.n;
import b.t.c.b.b.n.c.b;
import b.t.c.b.b.q.hc;
import b.t.c.b.b.q.hc$_b;
import b.t.c.b.b.q.ib;
import b.t.c.b.b.q.pb;
import b.t.c.b.b.q.wb;
import b.t.c.b.b.q.zb;

public final class m {
    public static boolean o00000(pb pb2) {
        if (pb2 == null) {
            m.o00000(0);
        }
        if (pb2.O\u00f5o000() == hc$_b.o00000) {
            return false;
        }
        if (m.o00000(pb2.\u00d8\u00f80000())) {
            return true;
        }
        return b.t.c.b.b.o.n.\u00d2O0000(pb2.\u00d8\u00f80000()) && m.o00000((hc)pb2);
    }

    public static boolean o00000(wb wb2) {
        if (wb2 == null) {
            m.o00000(1);
        }
        return b.t.c.b.b.o.n.\u00d2O0000(wb2) && b.t.c.b.b.o.n.interface(wb2.\u00d8\u00f80000()) && !m.o00000((ib)wb2);
    }

    public static boolean o00000(ib ib2) {
        if (ib2 == null) {
            m.o00000(2);
        }
        return n.super(h.\u00d200000, ib2);
    }

    public static boolean o00000(hc hc2) {
        zb zb2;
        if (hc2 == null) {
            m.o00000(3);
        }
        if (hc2 instanceof pb && (zb2 = ((pb)hc2).privatevoidsuper()) != null && zb2.\u00d4\u00f80000().\u00d300000(b.\u00d300000)) {
            return true;
        }
        return hc2.\u00d4\u00f80000().\u00d300000(b.\u00d300000);
    }

    private static /* synthetic */ void o00000(int n2) {
        Object[] objectArray;
        Object[] objectArray2;
        Object[] objectArray3 = new Object[3];
        switch (n2) {
            default: {
                objectArray2 = objectArray3;
                objectArray3[0] = "propertyDescriptor";
                break;
            }
            case 1: 
            case 2: {
                objectArray2 = objectArray3;
                objectArray3[0] = "companionObject";
                break;
            }
            case 3: {
                objectArray2 = objectArray3;
                objectArray3[0] = "memberDescriptor";
            }
        }
        objectArray2[1] = "kotlin/reflect/jvm/internal/impl/load/java/DescriptorsJvmAbiUtil";
        switch (n2) {
            default: {
                objectArray = objectArray2;
                objectArray2[2] = "isPropertyWithBackingFieldInOuterClass";
                break;
            }
            case 1: {
                objectArray = objectArray2;
                objectArray2[2] = "isClassCompanionObjectWithBackingFieldsInOuter";
                break;
            }
            case 2: {
                objectArray = objectArray2;
                objectArray2[2] = "isMappedIntrinsicCompanionObject";
                break;
            }
            case 3: {
                objectArray = objectArray2;
                objectArray2[2] = "hasJvmFieldAnnotation";
            }
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objectArray));
    }
}

