/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.o;

import b.t.c.b.b.b.c;
import b.t.c.b.b.b.i;
import b.t.c.b.b.d.e;
import b.t.c.b.b.d.j;
import b.t.c.b.b.d.k;
import b.t.c.b.b.h.e.f;
import b.t.c.b.b.h.hb;
import b.t.c.b.b.h.o;
import b.t.c.b.b.h.rc;
import b.t.c.b.b.o.f.b;
import b.t.c.b.b.q.ab;
import b.t.c.b.b.q.bc;
import b.t.c.b.b.q.cc;
import b.t.c.b.b.q.eb;
import b.t.c.b.b.q.ec;
import b.t.c.b.b.q.hc;
import b.t.c.b.b.q.hc$_b;
import b.t.c.b.b.q.ib;
import b.t.c.b.b.q.kb;
import b.t.c.b.b.q.lc;
import b.t.c.b.b.q.mc;
import b.t.c.b.b.q.q;
import b.t.c.b.b.q.s;
import b.t.c.b.b.q.ub;
import b.t.c.b.b.q.v;
import b.t.c.b.b.q.wb;
import b.t.c.b.b.q.yb;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class n {
    public static final k o00000 = new k("b.o.t");

    private n() {
    }

    public static mc \u00d800000(wb wb2) {
        if (wb2 == null) {
            n.super(0);
        }
        if (wb2 instanceof ib) {
            return ((ib)wb2).\u00f5o\u00d2000();
        }
        return null;
    }

    public static boolean \u00d300000(wb wb2) {
        if (wb2 == null) {
            n.super(1);
        }
        while (wb2 != null) {
            if (n.OO0000(wb2) || n.class(wb2)) {
                return true;
            }
            wb2 = wb2.\u00d8\u00f80000();
        }
        return false;
    }

    public static boolean class(wb wb2) {
        return wb2 instanceof ub && ((ub)wb2).\u00d50O000() == eb.\u00d500000;
    }

    public static e \u00d8O0000(wb wb2) {
        k k2;
        if (wb2 == null) {
            n.super(2);
        }
        if ((k2 = n.\u00d6O0000(wb2)) != null) {
            return k2.\u00d800000();
        }
        return n.\u00d400000(wb2);
    }

    public static k \u00f600000(wb wb2) {
        k k2;
        if (wb2 == null) {
            n.super(3);
        }
        k k3 = (k2 = n.\u00d6O0000(wb2)) != null ? k2 : n.\u00d400000(wb2).super();
        if (k3 == null) {
            n.super(4);
        }
        return k3;
    }

    private static k \u00d6O0000(wb wb2) {
        if (wb2 == null) {
            n.super(5);
        }
        if (wb2 instanceof bc || b.t.c.b.b.h.d.k.o00000(wb2)) {
            return k.\u00d200000;
        }
        if (wb2 instanceof cc) {
            return ((cc)wb2).O0O000();
        }
        if (wb2 instanceof lc) {
            return ((lc)wb2).OOO000();
        }
        return null;
    }

    private static e \u00d400000(wb wb2) {
        if (wb2 == null) {
            n.super(6);
        }
        wb wb3 = wb2.\u00d8\u00f80000();
        assert (wb3 != null) : "Not package/module descriptor doesn't have containing declaration: ".concat(String.valueOf(wb2));
        e e2 = n.\u00d8O0000(wb3).super(wb2.\u00d5\u00f80000());
        if (e2 == null) {
            n.super(7);
        }
        return e2;
    }

    public static boolean \u00d3O0000(wb wb2) {
        return wb2 != null && wb2.\u00d8\u00f80000() instanceof lc;
    }

    public static boolean super(wb wb2, wb wb3) {
        if (wb2 == null) {
            n.super(16);
        }
        if (wb3 == null) {
            n.super(17);
        }
        return n.\u00f800000(wb2).equals(n.\u00f800000(wb3));
    }

    public static wb super(wb wb2, Class clazz) {
        if (clazz == null) {
            n.super(18);
        }
        return n.super(wb2, clazz, true);
    }

    public static wb super(wb wb2, Class clazz, boolean bl) {
        if (clazz == null) {
            n.super(19);
        }
        if (wb2 == null) {
            return null;
        }
        if (bl) {
            wb2 = wb2.\u00d8\u00f80000();
        }
        while (wb2 != null) {
            if (clazz.isInstance(wb2)) {
                return wb2;
            }
            wb2 = wb2.\u00d8\u00f80000();
        }
        return null;
    }

    public static bc \u00d200000(rc i2) {
        if (i2 == null) {
            n.super(20);
        }
        if ((i2 = i2.thisdosuper().\u00f4OO000()) == null) {
            return null;
        }
        return n.do((wb)i2);
    }

    public static bc \u00f800000(wb wb2) {
        if (wb2 == null) {
            n.super(21);
        }
        bc bc2 = n.do(wb2);
        assert (bc2 != null) : "Descriptor without a containing module: ".concat(String.valueOf(wb2));
        bc bc3 = bc2;
        if (bc3 == null) {
            n.super(22);
        }
        return bc3;
    }

    public static bc do(wb wb2) {
        if (wb2 == null) {
            n.super(23);
        }
        while (wb2 != null) {
            if (wb2 instanceof bc) {
                return (bc)wb2;
            }
            if (wb2 instanceof cc) {
                return ((cc)wb2).ifnull();
            }
            wb2 = wb2.\u00d8\u00f80000();
        }
        return null;
    }

    public static boolean super(ib object, ib ib2) {
        if (object == null) {
            n.super(26);
        }
        if (ib2 == null) {
            n.super(27);
        }
        object = object.\u00d3OO000().\u00d5OO000().iterator();
        while (object.hasNext()) {
            if (!n.super((rc)object.next(), (wb)ib2.\u00f4o\u00d2000())) continue;
            return true;
        }
        return false;
    }

    public static boolean \u00d200000(ib ib2, ib ib3) {
        if (ib2 == null) {
            n.super(28);
        }
        if (ib3 == null) {
            n.super(29);
        }
        return n.\u00d200000(ib2.nullint(), (wb)ib3.\u00f4o\u00d2000());
    }

    private static boolean super(rc i2, wb wb2) {
        if (i2 == null) {
            n.super(30);
        }
        if (wb2 == null) {
            n.super(31);
        }
        return (i2 = ((rc)i2).thisdosuper().\u00f4OO000()) != null && (i2 = i2.returnnull()) instanceof kb && wb2 instanceof kb && ((kb)wb2).\u00d3OO000().equals(((kb)i2).\u00d3OO000());
    }

    public static boolean \u00d200000(rc object, wb wb2) {
        if (object == null) {
            n.super(32);
        }
        if (wb2 == null) {
            n.super(33);
        }
        if (n.super((rc)object, wb2)) {
            return true;
        }
        object = ((rc)object).thisdosuper().\u00d5OO000().iterator();
        while (object.hasNext()) {
            if (!n.\u00d200000((rc)object.next(), wb2)) continue;
            return true;
        }
        return false;
    }

    public static boolean \u00d2O0000(wb wb2) {
        return n.super(wb2, ec.\u00d200000) && ((ib)wb2).\u00d5o\u00d2000();
    }

    public static boolean \u00d600000(wb wb2) {
        return (n.super(wb2, ec.int) || n.super(wb2, ec.\u00d600000)) && ((ib)wb2).\u00f40O000() == ab.super;
    }

    public static boolean OO0000(wb wb2) {
        if (wb2 == null) {
            n.super(34);
        }
        return n.int(wb2) && wb2.\u00d5\u00f80000().equals(j.\u00d4O0000);
    }

    public static boolean \u00f4O0000(wb wb2) {
        if (wb2 == null) {
            n.super(36);
        }
        return n.super(wb2, ec.\u00d400000);
    }

    public static boolean \u00f400000(wb wb2) {
        return n.super(wb2, ec.\u00f400000);
    }

    public static boolean \u00d200000(wb wb2) {
        return n.super(wb2, ec.super);
    }

    public static boolean \u00d4O0000(wb wb2) {
        return n.super(wb2, ec.\u00d600000);
    }

    public static boolean int(wb wb2) {
        return n.super(wb2, ec.int);
    }

    public static boolean interface(wb wb2) {
        return n.int(wb2) || n.\u00f400000(wb2);
    }

    private static boolean super(wb wb2, ec ec2) {
        if (ec2 == null) {
            n.super(37);
        }
        return wb2 instanceof ib && ((ib)wb2).privateintsuper() == ec2;
    }

    public static ib super(ib object) {
        if (object == null) {
            n.super(44);
        }
        object = object.\u00d3OO000().\u00d5OO000().iterator();
        while (object.hasNext()) {
            ib ib2 = n.super((rc)object.next());
            if (ib2.privateintsuper() == ec.\u00d600000) continue;
            return ib2;
        }
        return null;
    }

    public static ib super(rc rc2) {
        if (rc2 == null) {
            n.super(45);
        }
        return n.super(rc2.thisdosuper());
    }

    public static ib super(b.t.c.b.b.h.bc bc2) {
        if (bc2 == null) {
            n.super(46);
        }
        kb kb2 = bc2.\u00f4OO000();
        assert (kb2 instanceof ib) : "Classifier descriptor of a type should be of type ClassDescriptor: ".concat(String.valueOf(bc2));
        ib ib2 = (ib)kb2;
        if (ib2 == null) {
            n.super(47);
        }
        return ib2;
    }

    public static s super(ib ib2, boolean bl) {
        ec ec2;
        if (ib2 == null) {
            n.super(48);
        }
        if ((ec2 = ib2.privateintsuper()) == ec.\u00f400000 || ec2.super()) {
            s s2 = eb.oO0000;
            if (s2 == null) {
                n.super(49);
            }
            return s2;
        }
        if (n.\u00d600000(ib2)) {
            if (bl) {
                s s3 = eb.\u00d600000;
                if (s3 == null) {
                    n.super(50);
                }
                return s3;
            }
            s s4 = eb.oO0000;
            if (s4 == null) {
                n.super(51);
            }
            return s4;
        }
        if (n.OO0000(ib2)) {
            s s5 = eb.o00000;
            if (s5 == null) {
                n.super(52);
            }
            return s5;
        }
        assert (ec2 == ec.int || ec2 == ec.\u00d600000 || ec2 == ec.super);
        s s6 = eb.\u00d200000;
        if (s6 == null) {
            n.super(53);
        }
        return s6;
    }

    public static hc super(hc hc2) {
        if (hc2 == null) {
            n.super(58);
        }
        while (hc2.O\u00f5o000() == hc$_b.o00000) {
            Collection collection = hc2.\u00d5\u00f4o000();
            if (collection.isEmpty()) {
                throw new IllegalStateException("Fake override should have at least one overridden descriptor: ".concat(String.valueOf(hc2)));
            }
            hc2 = (hc)collection.iterator().next();
        }
        hc hc3 = hc2;
        if (hc3 == null) {
            n.super(59);
        }
        return hc3;
    }

    public static ub super(ub ub2) {
        if (ub2 == null) {
            n.super(63);
        }
        if (ub2 instanceof hc) {
            return n.super((hc)ub2);
        }
        ub ub3 = ub2;
        if (ub3 == null) {
            n.super(64);
        }
        return ub3;
    }

    public static boolean super(v object, rc rc2) {
        block8: {
            block7: {
                if (object == null) {
                    n.super(65);
                }
                if (rc2 == null) {
                    n.super(66);
                }
                if (object.\u00f4\u00f4o000() || hb.super(rc2)) {
                    return false;
                }
                if (o.\u00d400000(rc2)) {
                    return true;
                }
                object = b.null((wb)object);
                if (c.\u00d500000(rc2) || f.o00000.\u00d200000(((c)object).\u00d600000(), rc2) || f.o00000.\u00d200000(((c)object).\u00d200000().nullint(), rc2) || f.o00000.\u00d200000(((c)object).oO0000(), rc2)) break block7;
                if (!i.o00000(rc2)) break block8;
            }
            return true;
        }
        return false;
    }

    public static Set super(b.t.c.b.b.q.b b2) {
        if (b2 == null) {
            n.super(70);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        n.super(b2.O\u00f4o000(), linkedHashSet);
        return linkedHashSet;
    }

    private static void super(b.t.c.b.b.q.b object, Set set) {
        if (object == null) {
            n.super(72);
        }
        if (set == null) {
            n.super(73);
        }
        if (set.contains(object)) {
            return;
        }
        object = object.O\u00f4o000().\u00d5\u00f4o000().iterator();
        while (object.hasNext()) {
            b.t.c.b.b.q.b b2 = ((b.t.c.b.b.q.b)object.next()).O\u00f4o000();
            n.super(b2, set);
            set.add(b2);
        }
    }

    public static yb super(wb wb2) {
        if (wb2 == null) {
            n.super(81);
        }
        if (wb2 instanceof b.t.c.b.b.q.e) {
            wb2 = ((b.t.c.b.b.q.e)wb2).O\u00f6o000();
        }
        if (wb2 instanceof q) {
            yb yb2 = ((q)wb2).\u00f4\u00f80000().super();
            if (yb2 == null) {
                n.super(82);
            }
            return yb2;
        }
        yb yb3 = yb.o00000;
        if (yb3 == null) {
            n.super(83);
        }
        return yb3;
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
            case 4: 
            case 7: 
            case 9: 
            case 10: 
            case 12: 
            case 22: 
            case 40: 
            case 42: 
            case 43: 
            case 47: 
            case 49: 
            case 50: 
            case 51: 
            case 52: 
            case 53: 
            case 59: 
            case 61: 
            case 62: 
            case 64: 
            case 71: 
            case 75: 
            case 82: 
            case 83: 
            case 85: 
            case 88: 
            case 93: 
            case 95: {
                string = "@NotNull method %s.%s must not return null";
            }
        }
        switch (n2) {
            default: {
                n3 = 3;
                break;
            }
            case 4: 
            case 7: 
            case 9: 
            case 10: 
            case 12: 
            case 22: 
            case 40: 
            case 42: 
            case 43: 
            case 47: 
            case 49: 
            case 50: 
            case 51: 
            case 52: 
            case 53: 
            case 59: 
            case 61: 
            case 62: 
            case 64: 
            case 71: 
            case 75: 
            case 82: 
            case 83: 
            case 85: 
            case 88: 
            case 93: 
            case 95: {
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
            case 2: 
            case 3: 
            case 5: 
            case 6: 
            case 8: 
            case 11: 
            case 13: 
            case 14: 
            case 15: 
            case 21: 
            case 23: 
            case 24: 
            case 34: 
            case 35: 
            case 36: 
            case 57: 
            case 58: 
            case 60: 
            case 63: 
            case 81: 
            case 94: {
                objectArray2 = objectArray3;
                objectArray3[0] = "descriptor";
                break;
            }
            case 4: 
            case 7: 
            case 9: 
            case 10: 
            case 12: 
            case 22: 
            case 40: 
            case 42: 
            case 43: 
            case 47: 
            case 49: 
            case 50: 
            case 51: 
            case 52: 
            case 53: 
            case 59: 
            case 61: 
            case 62: 
            case 64: 
            case 71: 
            case 75: 
            case 82: 
            case 83: 
            case 85: 
            case 88: 
            case 93: 
            case 95: {
                objectArray2 = objectArray3;
                objectArray3[0] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorUtils";
                break;
            }
            case 16: {
                objectArray2 = objectArray3;
                objectArray3[0] = "first";
                break;
            }
            case 17: {
                objectArray2 = objectArray3;
                objectArray3[0] = "second";
                break;
            }
            case 18: 
            case 19: {
                objectArray2 = objectArray3;
                objectArray3[0] = "aClass";
                break;
            }
            case 20: {
                objectArray2 = objectArray3;
                objectArray3[0] = "kotlinType";
                break;
            }
            case 25: {
                objectArray2 = objectArray3;
                objectArray3[0] = "declarationDescriptor";
                break;
            }
            case 26: 
            case 28: {
                objectArray2 = objectArray3;
                objectArray3[0] = "subClass";
                break;
            }
            case 27: 
            case 29: 
            case 33: {
                objectArray2 = objectArray3;
                objectArray3[0] = "superClass";
                break;
            }
            case 30: 
            case 32: 
            case 45: 
            case 66: {
                objectArray2 = objectArray3;
                objectArray3[0] = "type";
                break;
            }
            case 31: {
                objectArray2 = objectArray3;
                objectArray3[0] = "other";
                break;
            }
            case 37: {
                objectArray2 = objectArray3;
                objectArray3[0] = "classKind";
                break;
            }
            case 38: 
            case 39: 
            case 41: 
            case 44: 
            case 48: 
            case 54: 
            case 67: 
            case 68: 
            case 69: 
            case 76: 
            case 77: {
                objectArray2 = objectArray3;
                objectArray3[0] = "classDescriptor";
                break;
            }
            case 46: {
                objectArray2 = objectArray3;
                objectArray3[0] = "typeConstructor";
                break;
            }
            case 55: {
                objectArray2 = objectArray3;
                objectArray3[0] = "innerClassName";
                break;
            }
            case 56: {
                objectArray2 = objectArray3;
                objectArray3[0] = "location";
                break;
            }
            case 65: {
                objectArray2 = objectArray3;
                objectArray3[0] = "variable";
                break;
            }
            case 70: {
                objectArray2 = objectArray3;
                objectArray3[0] = "f";
                break;
            }
            case 72: {
                objectArray2 = objectArray3;
                objectArray3[0] = "current";
                break;
            }
            case 73: {
                objectArray2 = objectArray3;
                objectArray3[0] = "result";
                break;
            }
            case 74: {
                objectArray2 = objectArray3;
                objectArray3[0] = "memberDescriptor";
                break;
            }
            case 78: 
            case 79: 
            case 80: {
                objectArray2 = objectArray3;
                objectArray3[0] = "annotated";
                break;
            }
            case 84: 
            case 86: 
            case 89: 
            case 91: {
                objectArray2 = objectArray3;
                objectArray3[0] = "scope";
                break;
            }
            case 87: 
            case 90: 
            case 92: {
                objectArray2 = objectArray3;
                objectArray3[0] = "name";
            }
        }
        switch (n2) {
            default: {
                objectArray = objectArray2;
                objectArray2[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorUtils";
                break;
            }
            case 4: {
                objectArray = objectArray2;
                objectArray2[1] = "getFqNameSafe";
                break;
            }
            case 7: {
                objectArray = objectArray2;
                objectArray2[1] = "getFqNameUnsafe";
                break;
            }
            case 9: 
            case 10: {
                objectArray = objectArray2;
                objectArray2[1] = "getFqNameFromTopLevelClass";
                break;
            }
            case 12: {
                objectArray = objectArray2;
                objectArray2[1] = "getClassIdForNonLocalClass";
                break;
            }
            case 22: {
                objectArray = objectArray2;
                objectArray2[1] = "getContainingModule";
                break;
            }
            case 40: {
                objectArray = objectArray2;
                objectArray2[1] = "getSuperclassDescriptors";
                break;
            }
            case 42: 
            case 43: {
                objectArray = objectArray2;
                objectArray2[1] = "getSuperClassType";
                break;
            }
            case 47: {
                objectArray = objectArray2;
                objectArray2[1] = "getClassDescriptorForTypeConstructor";
                break;
            }
            case 49: 
            case 50: 
            case 51: 
            case 52: 
            case 53: {
                objectArray = objectArray2;
                objectArray2[1] = "getDefaultConstructorVisibility";
                break;
            }
            case 59: {
                objectArray = objectArray2;
                objectArray2[1] = "unwrapFakeOverride";
                break;
            }
            case 61: 
            case 62: {
                objectArray = objectArray2;
                objectArray2[1] = "unwrapSubstitutionOverride";
                break;
            }
            case 64: {
                objectArray = objectArray2;
                objectArray2[1] = "unwrapFakeOverrideToAnyDeclaration";
                break;
            }
            case 71: {
                objectArray = objectArray2;
                objectArray2[1] = "getAllOverriddenDescriptors";
                break;
            }
            case 75: {
                objectArray = objectArray2;
                objectArray2[1] = "getAllOverriddenDeclarations";
                break;
            }
            case 82: 
            case 83: {
                objectArray = objectArray2;
                objectArray2[1] = "getContainingSourceFile";
                break;
            }
            case 85: {
                objectArray = objectArray2;
                objectArray2[1] = "getAllDescriptors";
                break;
            }
            case 88: {
                objectArray = objectArray2;
                objectArray2[1] = "getFunctionByName";
                break;
            }
            case 93: {
                objectArray = objectArray2;
                objectArray2[1] = "getPropertyByName";
                break;
            }
            case 95: {
                objectArray = objectArray2;
                objectArray2[1] = "getDirectMember";
            }
        }
        switch (n2) {
            default: {
                objectArray = objectArray;
                objectArray[2] = "getDispatchReceiverParameterIfNeeded";
                break;
            }
            case 1: {
                objectArray = objectArray;
                objectArray[2] = "isLocal";
                break;
            }
            case 2: {
                objectArray = objectArray;
                objectArray[2] = "getFqName";
                break;
            }
            case 3: {
                objectArray = objectArray;
                objectArray[2] = "getFqNameSafe";
                break;
            }
            case 4: 
            case 7: 
            case 9: 
            case 10: 
            case 12: 
            case 22: 
            case 40: 
            case 42: 
            case 43: 
            case 47: 
            case 49: 
            case 50: 
            case 51: 
            case 52: 
            case 53: 
            case 59: 
            case 61: 
            case 62: 
            case 64: 
            case 71: 
            case 75: 
            case 82: 
            case 83: 
            case 85: 
            case 88: 
            case 93: 
            case 95: {
                break;
            }
            case 5: {
                objectArray = objectArray;
                objectArray[2] = "getFqNameSafeIfPossible";
                break;
            }
            case 6: {
                objectArray = objectArray;
                objectArray[2] = "getFqNameUnsafe";
                break;
            }
            case 8: {
                objectArray = objectArray;
                objectArray[2] = "getFqNameFromTopLevelClass";
                break;
            }
            case 11: {
                objectArray = objectArray;
                objectArray[2] = "getClassIdForNonLocalClass";
                break;
            }
            case 13: {
                objectArray = objectArray;
                objectArray[2] = "isExtension";
                break;
            }
            case 14: {
                objectArray = objectArray;
                objectArray[2] = "isOverride";
                break;
            }
            case 15: {
                objectArray = objectArray;
                objectArray[2] = "isStaticDeclaration";
                break;
            }
            case 16: 
            case 17: {
                objectArray = objectArray;
                objectArray[2] = "areInSameModule";
                break;
            }
            case 18: 
            case 19: {
                objectArray = objectArray;
                objectArray[2] = "getParentOfType";
                break;
            }
            case 20: 
            case 23: {
                objectArray = objectArray;
                objectArray[2] = "getContainingModuleOrNull";
                break;
            }
            case 21: {
                objectArray = objectArray;
                objectArray[2] = "getContainingModule";
                break;
            }
            case 24: {
                objectArray = objectArray;
                objectArray[2] = "getContainingClass";
                break;
            }
            case 25: {
                objectArray = objectArray;
                objectArray[2] = "isAncestor";
                break;
            }
            case 26: 
            case 27: {
                objectArray = objectArray;
                objectArray[2] = "isDirectSubclass";
                break;
            }
            case 28: 
            case 29: {
                objectArray = objectArray;
                objectArray[2] = "isSubclass";
                break;
            }
            case 30: 
            case 31: {
                objectArray = objectArray;
                objectArray[2] = "isSameClass";
                break;
            }
            case 32: 
            case 33: {
                objectArray = objectArray;
                objectArray[2] = "isSubtypeOfClass";
                break;
            }
            case 34: {
                objectArray = objectArray;
                objectArray[2] = "isAnonymousObject";
                break;
            }
            case 35: {
                objectArray = objectArray;
                objectArray[2] = "isAnonymousFunction";
                break;
            }
            case 36: {
                objectArray = objectArray;
                objectArray[2] = "isEnumEntry";
                break;
            }
            case 37: {
                objectArray = objectArray;
                objectArray[2] = "isKindOf";
                break;
            }
            case 38: {
                objectArray = objectArray;
                objectArray[2] = "hasAbstractMembers";
                break;
            }
            case 39: {
                objectArray = objectArray;
                objectArray[2] = "getSuperclassDescriptors";
                break;
            }
            case 41: {
                objectArray = objectArray;
                objectArray[2] = "getSuperClassType";
                break;
            }
            case 44: {
                objectArray = objectArray;
                objectArray[2] = "getSuperClassDescriptor";
                break;
            }
            case 45: {
                objectArray = objectArray;
                objectArray[2] = "getClassDescriptorForType";
                break;
            }
            case 46: {
                objectArray = objectArray;
                objectArray[2] = "getClassDescriptorForTypeConstructor";
                break;
            }
            case 48: {
                objectArray = objectArray;
                objectArray[2] = "getDefaultConstructorVisibility";
                break;
            }
            case 54: 
            case 55: 
            case 56: {
                objectArray = objectArray;
                objectArray[2] = "getInnerClassByName";
                break;
            }
            case 57: {
                objectArray = objectArray;
                objectArray[2] = "isStaticNestedClass";
                break;
            }
            case 58: {
                objectArray = objectArray;
                objectArray[2] = "unwrapFakeOverride";
                break;
            }
            case 60: {
                objectArray = objectArray;
                objectArray[2] = "unwrapSubstitutionOverride";
                break;
            }
            case 63: {
                objectArray = objectArray;
                objectArray[2] = "unwrapFakeOverrideToAnyDeclaration";
                break;
            }
            case 65: 
            case 66: {
                objectArray = objectArray;
                objectArray[2] = "shouldRecordInitializerForProperty";
                break;
            }
            case 67: {
                objectArray = objectArray;
                objectArray[2] = "classCanHaveAbstractFakeOverride";
                break;
            }
            case 68: {
                objectArray = objectArray;
                objectArray[2] = "classCanHaveAbstractDeclaration";
                break;
            }
            case 69: {
                objectArray = objectArray;
                objectArray[2] = "classCanHaveOpenMembers";
                break;
            }
            case 70: {
                objectArray = objectArray;
                objectArray[2] = "getAllOverriddenDescriptors";
                break;
            }
            case 72: 
            case 73: {
                objectArray = objectArray;
                objectArray[2] = "collectAllOverriddenDescriptors";
                break;
            }
            case 74: {
                objectArray = objectArray;
                objectArray[2] = "getAllOverriddenDeclarations";
                break;
            }
            case 76: {
                objectArray = objectArray;
                objectArray[2] = "isSingletonOrAnonymousObject";
                break;
            }
            case 77: {
                objectArray = objectArray;
                objectArray[2] = "canHaveDeclaredConstructors";
                break;
            }
            case 78: {
                objectArray = objectArray;
                objectArray[2] = "getJvmName";
                break;
            }
            case 79: {
                objectArray = objectArray;
                objectArray[2] = "findJvmNameAnnotation";
                break;
            }
            case 80: {
                objectArray = objectArray;
                objectArray[2] = "hasJvmNameAnnotation";
                break;
            }
            case 81: {
                objectArray = objectArray;
                objectArray[2] = "getContainingSourceFile";
                break;
            }
            case 84: {
                objectArray = objectArray;
                objectArray[2] = "getAllDescriptors";
                break;
            }
            case 86: 
            case 87: {
                objectArray = objectArray;
                objectArray[2] = "getFunctionByName";
                break;
            }
            case 89: 
            case 90: {
                objectArray = objectArray;
                objectArray[2] = "getFunctionByNameOrNull";
                break;
            }
            case 91: 
            case 92: {
                objectArray = objectArray;
                objectArray[2] = "getPropertyByName";
                break;
            }
            case 94: {
                objectArray = objectArray;
                objectArray[2] = "getDirectMember";
            }
        }
        String string2 = String.format(string, objectArray);
        switch (n2) {
            default: {
                runtimeException = new IllegalArgumentException(string2);
                break;
            }
            case 4: 
            case 7: 
            case 9: 
            case 10: 
            case 12: 
            case 22: 
            case 40: 
            case 42: 
            case 43: 
            case 47: 
            case 49: 
            case 50: 
            case 51: 
            case 52: 
            case 53: 
            case 59: 
            case 61: 
            case 62: 
            case 64: 
            case 71: 
            case 75: 
            case 82: 
            case 83: 
            case 85: 
            case 88: 
            case 93: 
            case 95: {
                runtimeException = new IllegalStateException(string2);
            }
        }
        throw runtimeException;
    }
}

