/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.q.b;

import b.t.c.b.b.d.f;
import b.t.c.b.b.h.rc;
import b.t.c.b.b.q.ab;
import b.t.c.b.b.q.b.i;
import b.t.c.b.b.q.e.o;
import b.t.c.b.b.q.g;
import b.t.c.b.b.q.hc$_b;
import b.t.c.b.b.q.ic;
import b.t.c.b.b.q.ic$_b;
import b.t.c.b.b.q.mc;
import b.t.c.b.b.q.qb;
import b.t.c.b.b.q.s;
import b.t.c.b.b.q.wb;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class t
extends i
implements qb {
    public t(wb wb2, qb qb2, o o2, f f2, hc$_b hc$_b, g g2) {
        if (wb2 == null) {
            t.\u00f5\u00d40000(0);
        }
        if (o2 == null) {
            t.\u00f5\u00d40000(1);
        }
        if (f2 == null) {
            t.\u00f5\u00d40000(2);
        }
        if (hc$_b == null) {
            t.\u00f5\u00d40000(3);
        }
        if (g2 == null) {
            t.\u00f5\u00d40000(4);
        }
        super(wb2, qb2, o2, f2, hc$_b, g2);
    }

    public static t o00000(wb wb2, o o2, f f2, hc$_b hc$_b, g g2) {
        if (wb2 == null) {
            t.\u00f5\u00d40000(5);
        }
        if (o2 == null) {
            t.\u00f5\u00d40000(6);
        }
        if (f2 == null) {
            t.\u00f5\u00d40000(7);
        }
        if (hc$_b == null) {
            t.\u00f5\u00d40000(8);
        }
        if (g2 == null) {
            t.\u00f5\u00d40000(9);
        }
        return new t(wb2, null, o2, f2, hc$_b, g2);
    }

    public t new(mc mc2, mc mc3, List list, List list2, List list3, rc rc2, ab ab2, s s2) {
        if (list == null) {
            t.\u00f5\u00d40000(14);
        }
        if (list2 == null) {
            t.\u00f5\u00d40000(15);
        }
        if (list3 == null) {
            t.\u00f5\u00d40000(16);
        }
        if (s2 == null) {
            t.\u00f5\u00d40000(17);
        }
        t t2 = this.o00000(mc2, mc3, list, list2, list3, rc2, ab2, s2, null);
        if (t2 == null) {
            t.\u00f5\u00d40000(18);
        }
        return t2;
    }

    public t o00000(mc mc2, mc mc3, List list, List list2, List list3, rc rc2, ab ab2, s s2, Map map) {
        if (list == null) {
            t.\u00f5\u00d40000(19);
        }
        if (list2 == null) {
            t.\u00f5\u00d40000(20);
        }
        if (list3 == null) {
            t.\u00f5\u00d40000(21);
        }
        if (s2 == null) {
            t.\u00f5\u00d40000(22);
        }
        super.o00000(mc2, mc3, list, list2, list3, rc2, ab2, s2);
        if (map != null && !map.isEmpty()) {
            this.whilereturnObject = new LinkedHashMap(map);
        }
        return this;
    }

    public qb \u00d4\u00f8o000() {
        qb qb2 = (qb)super.\u00f5\u00f5o000();
        if (qb2 == null) {
            t.\u00f5\u00d40000(24);
        }
        return qb2;
    }

    @Override
    protected i o00000(wb wb2, ic ic2, hc$_b hc$_b, f f2, o o2, g g2) {
        if (wb2 == null) {
            t.\u00f5\u00d40000(25);
        }
        if (hc$_b == null) {
            t.\u00f5\u00d40000(26);
        }
        if (o2 == null) {
            t.\u00f5\u00d40000(27);
        }
        if (g2 == null) {
            t.\u00f5\u00d40000(28);
        }
        return new t(wb2, (qb)ic2, o2, f2 != null ? f2 : this.\u00d5\u00f80000(), hc$_b, g2);
    }

    public qb \u00d500000(wb wb2, ab ab2, s s2, hc$_b hc$_b, boolean bl) {
        qb qb2 = (qb)super.\u00d300000(wb2, ab2, s2, hc$_b, bl);
        if (qb2 == null) {
            t.\u00f5\u00d40000(29);
        }
        return qb2;
    }

    @Override
    public ic$_b ifreturnsuper() {
        ic$_b ic$_b = super.ifreturnsuper();
        if (ic$_b == null) {
            t.\u00f5\u00d40000(30);
        }
        return ic$_b;
    }

    private static /* synthetic */ void \u00f5\u00d40000(int n2) {
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
            case 13: 
            case 18: 
            case 23: 
            case 24: 
            case 29: 
            case 30: {
                string = "@NotNull method %s.%s must not return null";
            }
        }
        switch (n2) {
            default: {
                n3 = 3;
                break;
            }
            case 13: 
            case 18: 
            case 23: 
            case 24: 
            case 29: 
            case 30: {
                n3 = 2;
            }
        }
        Object[] objectArray3 = new Object[n3];
        switch (n2) {
            default: {
                objectArray2 = objectArray3;
                objectArray3[0] = "containingDeclaration";
                break;
            }
            case 1: 
            case 6: 
            case 27: {
                objectArray2 = objectArray3;
                objectArray3[0] = "annotations";
                break;
            }
            case 2: 
            case 7: {
                objectArray2 = objectArray3;
                objectArray3[0] = "name";
                break;
            }
            case 3: 
            case 8: 
            case 26: {
                objectArray2 = objectArray3;
                objectArray3[0] = "kind";
                break;
            }
            case 4: 
            case 9: 
            case 28: {
                objectArray2 = objectArray3;
                objectArray3[0] = "source";
                break;
            }
            case 10: 
            case 15: 
            case 20: {
                objectArray2 = objectArray3;
                objectArray3[0] = "typeParameters";
                break;
            }
            case 11: 
            case 16: 
            case 21: {
                objectArray2 = objectArray3;
                objectArray3[0] = "unsubstitutedValueParameters";
                break;
            }
            case 12: 
            case 17: 
            case 22: {
                objectArray2 = objectArray3;
                objectArray3[0] = "visibility";
                break;
            }
            case 13: 
            case 18: 
            case 23: 
            case 24: 
            case 29: 
            case 30: {
                objectArray2 = objectArray3;
                objectArray3[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/SimpleFunctionDescriptorImpl";
                break;
            }
            case 14: 
            case 19: {
                objectArray2 = objectArray3;
                objectArray3[0] = "contextReceiverParameters";
                break;
            }
            case 25: {
                objectArray2 = objectArray3;
                objectArray3[0] = "newOwner";
            }
        }
        switch (n2) {
            default: {
                objectArray = objectArray2;
                objectArray2[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/SimpleFunctionDescriptorImpl";
                break;
            }
            case 13: 
            case 18: 
            case 23: {
                objectArray = objectArray2;
                objectArray2[1] = "initialize";
                break;
            }
            case 24: {
                objectArray = objectArray2;
                objectArray2[1] = "getOriginal";
                break;
            }
            case 29: {
                objectArray = objectArray2;
                objectArray2[1] = "copy";
                break;
            }
            case 30: {
                objectArray = objectArray2;
                objectArray2[1] = "newCopyBuilder";
            }
        }
        switch (n2) {
            default: {
                objectArray = objectArray;
                objectArray[2] = "<init>";
                break;
            }
            case 5: 
            case 6: 
            case 7: 
            case 8: 
            case 9: {
                objectArray = objectArray;
                objectArray[2] = "create";
                break;
            }
            case 10: 
            case 11: 
            case 12: 
            case 14: 
            case 15: 
            case 16: 
            case 17: 
            case 19: 
            case 20: 
            case 21: 
            case 22: {
                objectArray = objectArray;
                objectArray[2] = "initialize";
                break;
            }
            case 13: 
            case 18: 
            case 23: 
            case 24: 
            case 29: 
            case 30: {
                break;
            }
            case 25: 
            case 26: 
            case 27: 
            case 28: {
                objectArray = objectArray;
                objectArray[2] = "createSubstitutedCopy";
            }
        }
        String string2 = String.format(string, objectArray);
        switch (n2) {
            default: {
                runtimeException = new IllegalArgumentException(string2);
                break;
            }
            case 13: 
            case 18: 
            case 23: 
            case 24: 
            case 29: 
            case 30: {
                runtimeException = new IllegalStateException(string2);
            }
        }
        throw runtimeException;
    }
}

