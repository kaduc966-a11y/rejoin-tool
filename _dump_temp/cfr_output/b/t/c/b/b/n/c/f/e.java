/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.n.c.f;

import b.t.c.b.b.d.f;
import b.t.c.b.b.n.c.f.e$1;
import b.t.c.b.b.o.i;
import b.t.c.b.b.q.ib;
import b.t.c.b.b.q.jc;
import b.t.c.b.b.q.sb;
import java.util.Collection;
import java.util.LinkedHashSet;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class e {
    public static Collection \u00d200000(f f2, Collection collection, Collection collection2, ib ib2, b.t.c.b.b.f.b.f f3, i i2) {
        if (f2 == null) {
            e.super(0);
        }
        if (collection == null) {
            e.super(1);
        }
        if (collection2 == null) {
            e.super(2);
        }
        if (ib2 == null) {
            e.super(3);
        }
        if (f3 == null) {
            e.super(4);
        }
        if (i2 == null) {
            e.super(5);
        }
        return e.super(f2, collection, collection2, ib2, f3, i2, false);
    }

    public static Collection super(f f2, Collection collection, Collection collection2, ib ib2, b.t.c.b.b.f.b.f f3, i i2) {
        if (f2 == null) {
            e.super(6);
        }
        if (collection == null) {
            e.super(7);
        }
        if (collection2 == null) {
            e.super(8);
        }
        if (ib2 == null) {
            e.super(9);
        }
        if (f3 == null) {
            e.super(10);
        }
        if (i2 == null) {
            e.super(11);
        }
        return e.super(f2, collection, collection2, ib2, f3, i2, true);
    }

    private static Collection super(f f2, Collection collection, Collection collection2, ib ib2, b.t.c.b.b.f.b.f f3, i i2, boolean bl) {
        if (f2 == null) {
            e.super(12);
        }
        if (collection == null) {
            e.super(13);
        }
        if (collection2 == null) {
            e.super(14);
        }
        if (ib2 == null) {
            e.super(15);
        }
        if (f3 == null) {
            e.super(16);
        }
        if (i2 == null) {
            e.super(17);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        i2.o00000(f2, collection, collection2, ib2, new e$1(f3, linkedHashSet, bl));
        return linkedHashSet;
    }

    public static jc super(f f2, ib iterator) {
        if (f2 == null) {
            e.super(19);
        }
        if (iterator == null) {
            e.super(20);
        }
        if ((iterator = iterator.newifsuper()).size() != 1) {
            return null;
        }
        for (jc jc2 : ((sb)iterator.iterator().next()).\u00f5\u00d8o000()) {
            if (!jc2.\u00d5\u00f80000().equals(f2)) continue;
            return jc2;
        }
        return null;
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
            case 18: {
                string = "@NotNull method %s.%s must not return null";
            }
        }
        switch (n2) {
            default: {
                n3 = 3;
                break;
            }
            case 18: {
                n3 = 2;
            }
        }
        Object[] objectArray3 = new Object[n3];
        switch (n2) {
            default: {
                objectArray2 = objectArray3;
                objectArray3[0] = "name";
                break;
            }
            case 1: 
            case 7: 
            case 13: {
                objectArray2 = objectArray3;
                objectArray3[0] = "membersFromSupertypes";
                break;
            }
            case 2: 
            case 8: 
            case 14: {
                objectArray2 = objectArray3;
                objectArray3[0] = "membersFromCurrent";
                break;
            }
            case 3: 
            case 9: 
            case 15: {
                objectArray2 = objectArray3;
                objectArray3[0] = "classDescriptor";
                break;
            }
            case 4: 
            case 10: 
            case 16: {
                objectArray2 = objectArray3;
                objectArray3[0] = "errorReporter";
                break;
            }
            case 5: 
            case 11: 
            case 17: {
                objectArray2 = objectArray3;
                objectArray3[0] = "overridingUtil";
                break;
            }
            case 18: {
                objectArray2 = objectArray3;
                objectArray3[0] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils";
                break;
            }
            case 20: {
                objectArray2 = objectArray3;
                objectArray3[0] = "annotationClass";
            }
        }
        switch (n2) {
            default: {
                objectArray = objectArray2;
                objectArray2[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils";
                break;
            }
            case 18: {
                objectArray = objectArray2;
                objectArray2[1] = "resolveOverrides";
            }
        }
        switch (n2) {
            default: {
                objectArray = objectArray;
                objectArray[2] = "resolveOverridesForNonStaticMembers";
                break;
            }
            case 6: 
            case 7: 
            case 8: 
            case 9: 
            case 10: 
            case 11: {
                objectArray = objectArray;
                objectArray[2] = "resolveOverridesForStaticMembers";
                break;
            }
            case 12: 
            case 13: 
            case 14: 
            case 15: 
            case 16: 
            case 17: {
                objectArray = objectArray;
                objectArray[2] = "resolveOverrides";
                break;
            }
            case 18: {
                break;
            }
            case 19: 
            case 20: {
                objectArray = objectArray;
                objectArray[2] = "getAnnotationParameterByName";
            }
        }
        String string2 = String.format(string, objectArray);
        switch (n2) {
            default: {
                runtimeException = new IllegalArgumentException(string2);
                break;
            }
            case 18: {
                runtimeException = new IllegalStateException(string2);
            }
        }
        throw runtimeException;
    }
}

