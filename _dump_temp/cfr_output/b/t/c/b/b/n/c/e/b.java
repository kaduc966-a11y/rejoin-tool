/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.n.c.e;

import b.qb;
import b.t.c.b.b.d.f;
import b.t.c.b.b.g.p;
import b.t.c.b.b.h.rc;
import b.t.c.b.b.n.c.e.b$1;
import b.t.c.b.b.n.c.e.b$2;
import b.t.c.b.b.n.c.e.b$_b;
import b.t.c.b.b.n.c.e.d;
import b.t.c.b.b.n.c.e.i;
import b.t.c.b.b.q.ab;
import b.t.c.b.b.q.b.t;
import b.t.c.b.b.q.e.o;
import b.t.c.b.b.q.g;
import b.t.c.b.b.q.hc$_b;
import b.t.c.b.b.q.ic;
import b.t.c.b.b.q.mc;
import b.t.c.b.b.q.s;
import b.t.c.b.b.q.wb;
import java.util.List;
import java.util.Map;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class b
extends t
implements d {
    public static final b.t.c.b.b.q.b$_b \u00d3\u00d2\u00d6000 = new b$1();
    public static final b.t.c.b.b.q.b$_b \u00d5\u00d2\u00d6000 = new b$2();
    private b$_b whilenullObject;
    private final boolean \u00d4\u00d2\u00d6000;

    protected b(wb wb2, b.t.c.b.b.q.qb qb2, o o2, f f2, hc$_b hc$_b, g g2, boolean bl) {
        if (wb2 == null) {
            b.privateObject(0);
        }
        if (o2 == null) {
            b.privateObject(1);
        }
        if (f2 == null) {
            b.privateObject(2);
        }
        if (hc$_b == null) {
            b.privateObject(3);
        }
        if (g2 == null) {
            b.privateObject(4);
        }
        super(wb2, qb2, o2, f2, hc$_b, g2);
        this.whilenullObject = null;
        this.\u00d4\u00d2\u00d6000 = bl;
    }

    public static b o00000(wb wb2, o o2, f f2, g g2, boolean bl) {
        if (wb2 == null) {
            b.privateObject(5);
        }
        if (o2 == null) {
            b.privateObject(6);
        }
        if (f2 == null) {
            b.privateObject(7);
        }
        if (g2 == null) {
            b.privateObject(8);
        }
        return new b(wb2, null, o2, f2, hc$_b.\u00d400000, g2, bl);
    }

    @Override
    public t o00000(mc b2, mc mc2, List list, List list2, List list3, rc rc2, ab ab2, s s2, Map map) {
        if (list == null) {
            b.privateObject(9);
        }
        if (list2 == null) {
            b.privateObject(10);
        }
        if (list3 == null) {
            b.privateObject(11);
        }
        if (s2 == null) {
            b.privateObject(12);
        }
        b2 = super.o00000((mc)b2, mc2, list, list2, list3, rc2, ab2, s2, map);
        this.OO0000(p.\u00d200000.o00000((ic)b2).o00000());
        b.t.c.b.b.q.b b3 = b2;
        if (b3 == null) {
            b.privateObject(13);
        }
        return b3;
    }

    @Override
    public boolean thisvoidsuper() {
        assert (this.whilenullObject != null) : "Parameter names status was not set: ".concat(String.valueOf(this));
        return this.whilenullObject.o00000;
    }

    @Override
    public boolean o\u00f4o000() {
        assert (this.whilenullObject != null) : "Parameter names status was not set: ".concat(String.valueOf(this));
        return this.whilenullObject.\u00d200000;
    }

    public void o00000(boolean bl, boolean bl2) {
        this.whilenullObject = b$_b.o00000(bl, bl2);
    }

    protected b \u00d400000(wb wb2, ic ic2, hc$_b hc$_b, f f2, o o2, g g2) {
        if (wb2 == null) {
            b.privateObject(14);
        }
        if (hc$_b == null) {
            b.privateObject(15);
        }
        if (o2 == null) {
            b.privateObject(16);
        }
        if (g2 == null) {
            b.privateObject(17);
        }
        wb2 = new b(wb2, (b.t.c.b.b.q.qb)ic2, o2, f2 != null ? f2 : this.\u00d5\u00f80000(), hc$_b, g2, this.\u00d4\u00d2\u00d6000);
        ((b)wb2).o00000(((b.t.c.b.b.q.b.i)this).thisvoidsuper(), ((b.t.c.b.b.q.b.i)this).o\u00f4o000());
        return wb2;
    }

    public b new(rc i2, List list, rc rc2, qb qb2) {
        if (list == null) {
            b.privateObject(19);
        }
        if (rc2 == null) {
            b.privateObject(20);
        }
        list = i.super(list, this.\u00f5\u00d8o000(), this);
        i2 = i2 == null ? null : b.t.c.b.b.o.d.o00000(this, (rc)i2, o.\u00d8o\u00f6000.o00000());
        i2 = (b)((b.t.c.b.b.q.b.i)this).ifreturnsuper().o00000(list).o00000(rc2).new((mc)i2).\u00d400000().new().\u00d500000();
        assert (i2 != null) : "null after substitution while enhancing ".concat(String.valueOf(this));
        if (qb2 != null) {
            ((b.t.c.b.b.q.b.i)i2).o00000((b.t.c.b.b.q.b$_b)qb2.new(), qb2.o00000());
        }
        b.t.c.b.b.q.e.i i3 = i2;
        if (i3 == null) {
            b.privateObject(21);
        }
        return i3;
    }

    private static /* synthetic */ void privateObject(int n2) {
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
            case 21: {
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
            case 21: {
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
            case 16: {
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
            case 15: {
                objectArray2 = objectArray3;
                objectArray3[0] = "kind";
                break;
            }
            case 4: 
            case 8: 
            case 17: {
                objectArray2 = objectArray3;
                objectArray3[0] = "source";
                break;
            }
            case 9: {
                objectArray2 = objectArray3;
                objectArray3[0] = "contextReceiverParameters";
                break;
            }
            case 10: {
                objectArray2 = objectArray3;
                objectArray3[0] = "typeParameters";
                break;
            }
            case 11: {
                objectArray2 = objectArray3;
                objectArray3[0] = "unsubstitutedValueParameters";
                break;
            }
            case 12: {
                objectArray2 = objectArray3;
                objectArray3[0] = "visibility";
                break;
            }
            case 13: 
            case 18: 
            case 21: {
                objectArray2 = objectArray3;
                objectArray3[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor";
                break;
            }
            case 14: {
                objectArray2 = objectArray3;
                objectArray3[0] = "newOwner";
                break;
            }
            case 19: {
                objectArray2 = objectArray3;
                objectArray3[0] = "enhancedValueParameterTypes";
                break;
            }
            case 20: {
                objectArray2 = objectArray3;
                objectArray3[0] = "enhancedReturnType";
            }
        }
        switch (n2) {
            default: {
                objectArray = objectArray2;
                objectArray2[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor";
                break;
            }
            case 13: {
                objectArray = objectArray2;
                objectArray2[1] = "initialize";
                break;
            }
            case 18: {
                objectArray = objectArray2;
                objectArray2[1] = "createSubstitutedCopy";
                break;
            }
            case 21: {
                objectArray = objectArray2;
                objectArray2[1] = "enhance";
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
            case 8: {
                objectArray = objectArray;
                objectArray[2] = "createJavaMethod";
                break;
            }
            case 9: 
            case 10: 
            case 11: 
            case 12: {
                objectArray = objectArray;
                objectArray[2] = "initialize";
                break;
            }
            case 13: 
            case 18: 
            case 21: {
                break;
            }
            case 14: 
            case 15: 
            case 16: 
            case 17: {
                objectArray = objectArray;
                objectArray[2] = "createSubstitutedCopy";
                break;
            }
            case 19: 
            case 20: {
                objectArray = objectArray;
                objectArray[2] = "enhance";
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
            case 21: {
                runtimeException = new IllegalStateException(string2);
            }
        }
        throw runtimeException;
    }
}

