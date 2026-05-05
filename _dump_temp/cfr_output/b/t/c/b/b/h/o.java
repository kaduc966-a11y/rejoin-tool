/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.h;

import b.o.e.g;
import b.s.mc;
import b.s.tb;
import b.t.c.b.b.h.bc;
import b.t.c.b.b.h.d.c;
import b.t.c.b.b.h.d.e;
import b.t.c.b.b.h.d.k;
import b.t.c.b.b.h.e.i;
import b.t.c.b.b.h.f;
import b.t.c.b.b.h.hc;
import b.t.c.b.b.h.ib;
import b.t.c.b.b.h.kc;
import b.t.c.b.b.h.l;
import b.t.c.b.b.h.lc;
import b.t.c.b.b.h.m;
import b.t.c.b.b.h.o$_b;
import b.t.c.b.b.h.ob;
import b.t.c.b.b.h.oc;
import b.t.c.b.b.h.pc;
import b.t.c.b.b.h.q;
import b.t.c.b.b.h.rc;
import b.t.c.b.b.h.s;
import b.t.c.b.b.h.sb;
import b.t.c.b.b.h.t;
import b.t.c.b.b.h.tc;
import b.t.c.b.b.h.w;
import b.t.c.b.b.h.wb;
import b.t.c.b.b.h.zb;
import b.t.c.b.b.q.kb;
import java.util.ArrayList;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class o {
    public static final ib \u00d200000 = k.new(c.\u00d300000, new String[0]);
    public static final ib o00000 = k.new(c.\u00d5o0000, new String[0]);
    public static final ib \u00d400000 = new o$_b("NO_EXPECTED_TYPE");
    public static final ib Object = new o$_b("UNIT_EXPECTED_TYPE");

    public static boolean o00000(rc rc2) {
        if (rc2 == null) {
            o.o00000(0);
        }
        return rc2 == \u00d400000 || rc2 == Object;
    }

    public static boolean \u00d500000(rc rc2) {
        return rc2 != null && rc2.thisdosuper() == \u00d200000.thisdosuper();
    }

    public static rc \u00f400000(rc rc2) {
        if (rc2 == null) {
            o.o00000(1);
        }
        return o.o00000(rc2, true);
    }

    public static rc void(rc rc2) {
        if (rc2 == null) {
            o.o00000(2);
        }
        return o.o00000(rc2, false);
    }

    public static rc o00000(rc rc2, boolean bl) {
        if (rc2 == null) {
            o.o00000(3);
        }
        l l2 = rc2.\u00d8\u00d6\u00d2000().oo0000(bl);
        if (l2 == null) {
            o.o00000(4);
        }
        return l2;
    }

    public static ib o00000(ib ib2, boolean bl) {
        if (ib2 == null) {
            o.o00000(5);
        }
        if (bl) {
            ib ib3 = ib2.\u00d4o0000(true);
            if (ib3 == null) {
                o.o00000(6);
            }
            return ib3;
        }
        ib ib4 = ib2;
        if (ib4 == null) {
            o.o00000(7);
        }
        return ib4;
    }

    public static rc \u00d200000(rc rc2, boolean bl) {
        if (rc2 == null) {
            o.o00000(8);
        }
        if (bl) {
            return o.\u00f400000(rc2);
        }
        rc rc3 = rc2;
        if (rc3 == null) {
            o.o00000(9);
        }
        return rc3;
    }

    public static ib o00000(kb kb2, b.t.c.b.b.o.e.f f2, g g2) {
        if (k.o00000(kb2)) {
            e e2 = k.new(c.\u00d6o0000, kb2.toString());
            if (e2 == null) {
                o.o00000(11);
            }
            return e2;
        }
        return o.o00000(kb2.\u00d3OO000(), f2, g2);
    }

    public static ib o00000(bc bc2, b.t.c.b.b.o.e.f f2, g g2) {
        if (bc2 == null) {
            o.o00000(12);
        }
        if (f2 == null) {
            o.o00000(13);
        }
        if (g2 == null) {
            o.o00000(14);
        }
        List list = o.o00000(bc2.\u00f5OO000());
        ib ib2 = oc.o00000(zb.ifreturnclass.Object(), bc2, list, false, f2, g2);
        if (ib2 == null) {
            o.o00000(15);
        }
        return ib2;
    }

    public static List o00000(List object) {
        if (object == null) {
            o.o00000(16);
        }
        ArrayList<lc> arrayList = new ArrayList<lc>(object.size());
        object = object.iterator();
        while (object.hasNext()) {
            b.t.c.b.b.q.i i2 = (b.t.c.b.b.q.i)object.next();
            arrayList.add(new lc(i2.nullint()));
        }
        List list = mc.\u00f5O0000(arrayList);
        if (list == null) {
            o.o00000(17);
        }
        return list;
    }

    public static List \u00d200000(rc rc2) {
        if (rc2 == null) {
            o.o00000(18);
        }
        kc kc2 = kc.o00000(rc2);
        Object object = rc2.thisdosuper().\u00d5OO000();
        ArrayList<rc> arrayList = new ArrayList<rc>(object.size());
        object = object.iterator();
        while (object.hasNext()) {
            rc rc3 = (rc)object.next();
            if ((rc3 = o.o00000(rc2, rc3, kc2)) == null) continue;
            arrayList.add(rc3);
        }
        return arrayList;
    }

    public static rc o00000(rc rc2, rc rc3, kc kc2) {
        if (rc2 == null) {
            o.o00000(20);
        }
        if (rc3 == null) {
            o.o00000(21);
        }
        if (kc2 == null) {
            o.o00000(22);
        }
        if ((rc3 = kc2.o00000(rc3, w.\u00d400000)) != null) {
            return o.\u00d200000(rc3, rc2.\u00f5\u00d6\u00d2000());
        }
        return null;
    }

    public static boolean \u00d600000(rc iterator) {
        if (iterator == null) {
            o.o00000(27);
        }
        if (((rc)((Object)iterator)).\u00f5\u00d6\u00d2000()) {
            return true;
        }
        if (q.\u00d400000((rc)((Object)iterator)) && o.\u00d600000(q.new((rc)((Object)iterator)).\u00d8\u00f4\u00d2000())) {
            return true;
        }
        if (s.\u00d200000((rc)((Object)iterator))) {
            return false;
        }
        if (o.\u00f500000((rc)((Object)iterator))) {
            return o.Object((rc)((Object)iterator));
        }
        if (iterator instanceof wb) {
            return (iterator = ((wb)((Object)iterator)).newwhilesuper().\u00f8OO000()) == null || o.Object(iterator.nullint());
        }
        if ((iterator = ((rc)((Object)iterator)).thisdosuper()) instanceof pc) {
            iterator = iterator.\u00d5OO000().iterator();
            while (iterator.hasNext()) {
                if (!o.\u00d600000((rc)iterator.next())) continue;
                return true;
            }
        }
        return false;
    }

    public static boolean \u00d400000(rc rc2) {
        if (rc2 == null) {
            o.o00000(28);
        }
        if (rc2.\u00f5\u00d6\u00d2000()) {
            return true;
        }
        return q.\u00d400000(rc2) && o.\u00d400000(q.new(rc2).\u00d8\u00f4\u00d2000());
    }

    public static boolean Object(rc object) {
        if (object == null) {
            o.o00000(29);
        }
        if (((rc)object).thisdosuper().\u00f4OO000() instanceof b.t.c.b.b.q.ib) {
            return false;
        }
        object = o.\u00d200000((rc)object).iterator();
        while (object.hasNext()) {
            if (!o.\u00d600000((rc)object.next())) continue;
            return true;
        }
        return false;
    }

    public static b.t.c.b.b.q.ib float(rc i2) {
        if (i2 == null) {
            o.o00000(30);
        }
        if ((i2 = i2.thisdosuper().\u00f4OO000()) instanceof b.t.c.b.b.q.ib) {
            return (b.t.c.b.b.q.ib)i2;
        }
        return null;
    }

    public static boolean o00000(rc rc2, g g2) {
        if (g2 == null) {
            o.o00000(43);
        }
        return o.o00000(rc2, g2, null);
    }

    private static boolean o00000(rc object, g g2, b.t.c.b.b.m.c c2) {
        if (g2 == null) {
            o.o00000(44);
        }
        if (object == null) {
            return false;
        }
        Object object22 = ((rc)object).\u00d8\u00d6\u00d2000();
        if (o.o00000((rc)object)) {
            return (Boolean)g2.\u00f800000(object22);
        }
        if (c2 != null && c2.contains(object)) {
            return false;
        }
        if (((Boolean)g2.\u00f800000(object22)).booleanValue()) {
            return true;
        }
        if (c2 == null) {
            c2 = b.t.c.b.b.m.c.Oo\u00d3000();
        }
        ((tb)c2).add(object);
        f f2 = object22 instanceof f ? (f)object22 : null;
        if (f2 != null && (o.o00000((rc)f2.\u00f4\u00f4\u00d2000(), g2, c2) || o.o00000((rc)f2.\u00d8\u00f4\u00d2000(), g2, c2))) {
            return true;
        }
        if (object22 instanceof sb && o.o00000((rc)((sb)object22).\u00d3\u00f5\u00d2000(), g2, c2)) {
            return true;
        }
        object22 = ((rc)object).thisdosuper();
        if (object22 instanceof pc) {
            object22 = ((pc)object22).\u00d5OO000().iterator();
            while (object22.hasNext()) {
                if (!o.o00000((rc)object22.next(), g2, c2)) continue;
                return true;
            }
            return false;
        }
        for (Object object22 : ((rc)object).\u00d4\u00d6\u00d2000()) {
            if (object22.super() || !o.o00000(object22.\u00d300000(), g2, c2)) continue;
            return true;
        }
        return false;
    }

    public static hc o00000(b.t.c.b.b.q.i i2) {
        if (i2 == null) {
            o.o00000(45);
        }
        return new ob(i2);
    }

    public static hc o00000(b.t.c.b.b.q.i i2, m m2) {
        if (i2 == null) {
            o.o00000(46);
        }
        if (m2.Object() == t.o00000) {
            return new lc(tc.o00000(i2));
        }
        return new ob(i2);
    }

    public static boolean \u00f500000(rc rc2) {
        if (rc2 == null) {
            o.o00000(60);
        }
        return o.\u00f600000(rc2) != null || rc2.thisdosuper() instanceof i;
    }

    public static b.t.c.b.b.q.i \u00f600000(rc rc2) {
        if (rc2 == null) {
            o.o00000(63);
        }
        if (rc2.thisdosuper().\u00f4OO000() instanceof b.t.c.b.b.q.i) {
            return (b.t.c.b.b.q.i)rc2.thisdosuper().\u00f4OO000();
        }
        return null;
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
            case 4: 
            case 6: 
            case 7: 
            case 9: 
            case 11: 
            case 15: 
            case 17: 
            case 19: 
            case 26: 
            case 35: 
            case 48: 
            case 53: 
            case 56: 
            case 57: 
            case 58: 
            case 59: {
                string = "@NotNull method %s.%s must not return null";
            }
        }
        switch (n2) {
            default: {
                n3 = 3;
                break;
            }
            case 4: 
            case 6: 
            case 7: 
            case 9: 
            case 11: 
            case 15: 
            case 17: 
            case 19: 
            case 26: 
            case 35: 
            case 48: 
            case 53: 
            case 56: 
            case 57: 
            case 58: 
            case 59: {
                n3 = 2;
            }
        }
        Object[] objectArray3 = new Object[n3];
        switch (n2) {
            default: {
                objectArray2 = objectArray3;
                objectArray3[0] = "type";
                break;
            }
            case 4: 
            case 6: 
            case 7: 
            case 9: 
            case 11: 
            case 15: 
            case 17: 
            case 19: 
            case 26: 
            case 35: 
            case 48: 
            case 53: 
            case 56: 
            case 57: 
            case 58: 
            case 59: {
                objectArray2 = objectArray3;
                objectArray3[0] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils";
                break;
            }
            case 12: {
                objectArray2 = objectArray3;
                objectArray3[0] = "typeConstructor";
                break;
            }
            case 13: {
                objectArray2 = objectArray3;
                objectArray3[0] = "unsubstitutedMemberScope";
                break;
            }
            case 14: {
                objectArray2 = objectArray3;
                objectArray3[0] = "refinedTypeFactory";
                break;
            }
            case 16: {
                objectArray2 = objectArray3;
                objectArray3[0] = "parameters";
                break;
            }
            case 20: {
                objectArray2 = objectArray3;
                objectArray3[0] = "subType";
                break;
            }
            case 21: {
                objectArray2 = objectArray3;
                objectArray3[0] = "superType";
                break;
            }
            case 22: {
                objectArray2 = objectArray3;
                objectArray3[0] = "substitutor";
                break;
            }
            case 24: {
                objectArray2 = objectArray3;
                objectArray3[0] = "result";
                break;
            }
            case 31: 
            case 33: {
                objectArray2 = objectArray3;
                objectArray3[0] = "clazz";
                break;
            }
            case 32: {
                objectArray2 = objectArray3;
                objectArray3[0] = "typeArguments";
                break;
            }
            case 34: {
                objectArray2 = objectArray3;
                objectArray3[0] = "projections";
                break;
            }
            case 36: {
                objectArray2 = objectArray3;
                objectArray3[0] = "a";
                break;
            }
            case 37: {
                objectArray2 = objectArray3;
                objectArray3[0] = "b";
                break;
            }
            case 39: {
                objectArray2 = objectArray3;
                objectArray3[0] = "typeParameters";
                break;
            }
            case 41: {
                objectArray2 = objectArray3;
                objectArray3[0] = "typeParameterConstructors";
                break;
            }
            case 42: {
                objectArray2 = objectArray3;
                objectArray3[0] = "specialType";
                break;
            }
            case 43: 
            case 44: {
                objectArray2 = objectArray3;
                objectArray3[0] = "isSpecialType";
                break;
            }
            case 45: 
            case 46: {
                objectArray2 = objectArray3;
                objectArray3[0] = "parameterDescriptor";
                break;
            }
            case 47: 
            case 51: {
                objectArray2 = objectArray3;
                objectArray3[0] = "numberValueTypeConstructor";
                break;
            }
            case 49: 
            case 50: {
                objectArray2 = objectArray3;
                objectArray3[0] = "supertypes";
                break;
            }
            case 52: 
            case 55: {
                objectArray2 = objectArray3;
                objectArray3[0] = "expectedType";
                break;
            }
            case 54: {
                objectArray2 = objectArray3;
                objectArray3[0] = "literalTypeConstructor";
            }
        }
        switch (n2) {
            default: {
                objectArray = objectArray2;
                objectArray2[1] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils";
                break;
            }
            case 4: {
                objectArray = objectArray2;
                objectArray2[1] = "makeNullableAsSpecified";
                break;
            }
            case 6: 
            case 7: 
            case 9: {
                objectArray = objectArray2;
                objectArray2[1] = "makeNullableIfNeeded";
                break;
            }
            case 11: 
            case 15: {
                objectArray = objectArray2;
                objectArray2[1] = "makeUnsubstitutedType";
                break;
            }
            case 17: {
                objectArray = objectArray2;
                objectArray2[1] = "getDefaultTypeProjections";
                break;
            }
            case 19: {
                objectArray = objectArray2;
                objectArray2[1] = "getImmediateSupertypes";
                break;
            }
            case 26: {
                objectArray = objectArray2;
                objectArray2[1] = "getAllSupertypes";
                break;
            }
            case 35: {
                objectArray = objectArray2;
                objectArray2[1] = "substituteProjectionsForParameters";
                break;
            }
            case 48: {
                objectArray = objectArray2;
                objectArray2[1] = "getDefaultPrimitiveNumberType";
                break;
            }
            case 53: 
            case 56: 
            case 57: 
            case 58: 
            case 59: {
                objectArray = objectArray2;
                objectArray2[1] = "getPrimitiveNumberType";
            }
        }
        switch (n2) {
            default: {
                objectArray = objectArray;
                objectArray[2] = "noExpectedType";
                break;
            }
            case 1: {
                objectArray = objectArray;
                objectArray[2] = "makeNullable";
                break;
            }
            case 2: {
                objectArray = objectArray;
                objectArray[2] = "makeNotNullable";
                break;
            }
            case 3: {
                objectArray = objectArray;
                objectArray[2] = "makeNullableAsSpecified";
                break;
            }
            case 4: 
            case 6: 
            case 7: 
            case 9: 
            case 11: 
            case 15: 
            case 17: 
            case 19: 
            case 26: 
            case 35: 
            case 48: 
            case 53: 
            case 56: 
            case 57: 
            case 58: 
            case 59: {
                break;
            }
            case 5: 
            case 8: {
                objectArray = objectArray;
                objectArray[2] = "makeNullableIfNeeded";
                break;
            }
            case 10: {
                objectArray = objectArray;
                objectArray[2] = "canHaveSubtypes";
                break;
            }
            case 12: 
            case 13: 
            case 14: {
                objectArray = objectArray;
                objectArray[2] = "makeUnsubstitutedType";
                break;
            }
            case 16: {
                objectArray = objectArray;
                objectArray[2] = "getDefaultTypeProjections";
                break;
            }
            case 18: {
                objectArray = objectArray;
                objectArray[2] = "getImmediateSupertypes";
                break;
            }
            case 20: 
            case 21: 
            case 22: {
                objectArray = objectArray;
                objectArray[2] = "createSubstitutedSupertype";
                break;
            }
            case 23: 
            case 24: {
                objectArray = objectArray;
                objectArray[2] = "collectAllSupertypes";
                break;
            }
            case 25: {
                objectArray = objectArray;
                objectArray[2] = "getAllSupertypes";
                break;
            }
            case 27: {
                objectArray = objectArray;
                objectArray[2] = "isNullableType";
                break;
            }
            case 28: {
                objectArray = objectArray;
                objectArray[2] = "acceptsNullable";
                break;
            }
            case 29: {
                objectArray = objectArray;
                objectArray[2] = "hasNullableSuperType";
                break;
            }
            case 30: {
                objectArray = objectArray;
                objectArray[2] = "getClassDescriptor";
                break;
            }
            case 31: 
            case 32: {
                objectArray = objectArray;
                objectArray[2] = "substituteParameters";
                break;
            }
            case 33: 
            case 34: {
                objectArray = objectArray;
                objectArray[2] = "substituteProjectionsForParameters";
                break;
            }
            case 36: 
            case 37: {
                objectArray = objectArray;
                objectArray[2] = "equalTypes";
                break;
            }
            case 38: 
            case 39: {
                objectArray = objectArray;
                objectArray[2] = "dependsOnTypeParameters";
                break;
            }
            case 40: 
            case 41: {
                objectArray = objectArray;
                objectArray[2] = "dependsOnTypeConstructors";
                break;
            }
            case 42: 
            case 43: 
            case 44: {
                objectArray = objectArray;
                objectArray[2] = "contains";
                break;
            }
            case 45: 
            case 46: {
                objectArray = objectArray;
                objectArray[2] = "makeStarProjection";
                break;
            }
            case 47: 
            case 49: {
                objectArray = objectArray;
                objectArray[2] = "getDefaultPrimitiveNumberType";
                break;
            }
            case 50: {
                objectArray = objectArray;
                objectArray[2] = "findByFqName";
                break;
            }
            case 51: 
            case 52: 
            case 54: 
            case 55: {
                objectArray = objectArray;
                objectArray[2] = "getPrimitiveNumberType";
                break;
            }
            case 60: {
                objectArray = objectArray;
                objectArray[2] = "isTypeParameter";
                break;
            }
            case 61: {
                objectArray = objectArray;
                objectArray[2] = "isReifiedTypeParameter";
                break;
            }
            case 62: {
                objectArray = objectArray;
                objectArray[2] = "isNonReifiedTypeParameter";
                break;
            }
            case 63: {
                objectArray = objectArray;
                objectArray[2] = "getTypeParameterDescriptorOrNull";
            }
        }
        String string2 = String.format(string, objectArray);
        switch (n2) {
            default: {
                runtimeException = new IllegalArgumentException(string2);
                break;
            }
            case 4: 
            case 6: 
            case 7: 
            case 9: 
            case 11: 
            case 15: 
            case 17: 
            case 19: 
            case 26: 
            case 35: 
            case 48: 
            case 53: 
            case 56: 
            case 57: 
            case 58: 
            case 59: {
                runtimeException = new IllegalStateException(string2);
            }
        }
        throw runtimeException;
    }
}

