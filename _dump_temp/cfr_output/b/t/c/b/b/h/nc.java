/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.h;

import b.t.c.b.b.h.b.b;
import b.t.c.b.b.h.bc;
import b.t.c.b.b.h.h;
import b.t.c.b.b.h.kc;
import b.t.c.b.b.h.lb;
import b.t.c.b.b.h.lc;
import b.t.c.b.b.h.rc;
import b.t.c.b.b.h.w;
import b.t.c.b.b.q.b.gb;
import b.t.c.b.b.q.b.m;
import b.t.c.b.b.q.g;
import b.t.c.b.b.q.i;
import b.t.c.b.b.q.wb;
import java.util.HashMap;
import java.util.List;

public class nc {
    public static kc o00000(List object, h h2, wb wb2, List list) {
        if (object == null) {
            nc.o00000(0);
        }
        if (h2 == null) {
            nc.o00000(1);
        }
        if (wb2 == null) {
            nc.o00000(2);
        }
        if (list == null) {
            nc.o00000(3);
        }
        if ((object = nc.o00000((List)object, h2, wb2, list, null)) == null) {
            throw new AssertionError((Object)"Substitution failed");
        }
        Object object2 = object;
        if (object2 == null) {
            nc.o00000(4);
        }
        return object2;
    }

    public static kc o00000(List object, h iterator, wb wb2, List object22, boolean[] blArray) {
        Object object3;
        Object object4;
        if (object == null) {
            nc.o00000(5);
        }
        if (iterator == null) {
            nc.o00000(6);
        }
        if (wb2 == null) {
            nc.o00000(7);
        }
        if (object22 == null) {
            nc.o00000(8);
        }
        Object object5 = new HashMap<bc, lc>();
        HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
        int n2 = 0;
        Object object6 = object.iterator();
        while (object6.hasNext()) {
            object4 = (i)object6.next();
            object3 = m.o00000(wb2, object4.\u00d4\u00f80000(), object4.\u00f4\u00d5o000(), object4.\u00d4\u00d5o000(), object4.\u00d5\u00f80000(), n2++, g.o00000, object4.\u00f5\u00d5o000());
            object5.put(object4.\u00d3OO000(), new lc(((gb)object3).nullint()));
            hashMap.put(object4, object3);
            object22.add(object3);
        }
        object6 = lb.o00000(object5);
        object4 = kc.o00000((h)((Object)iterator), (h)object6);
        object3 = kc.o00000(((h)((Object)iterator)).\u00d300000(), (h)object6);
        object = object.iterator();
        while (object.hasNext()) {
            iterator = (i)object.next();
            wb2 = (m)hashMap.get(iterator);
            for (Object object22 : iterator.\u00d8\u00d5o000()) {
                object5 = ((rc)object22).thisdosuper().\u00f4OO000();
                object5 = ((kc)(object5 instanceof i && b.super((i)object5) ? object4 : object3)).o00000((rc)object22, w.return);
                if (object5 == null) {
                    return null;
                }
                if (object5 != object22 && blArray != null) {
                    blArray[0] = true;
                }
                ((m)wb2).\u00f500000((rc)object5);
            }
            ((m)wb2).O\u00d6o000();
        }
        return object4;
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
            case 4: {
                string = "@NotNull method %s.%s must not return null";
            }
        }
        switch (n2) {
            default: {
                n3 = 3;
                break;
            }
            case 4: {
                n3 = 2;
            }
        }
        Object[] objectArray3 = new Object[n3];
        switch (n2) {
            default: {
                objectArray2 = objectArray3;
                objectArray3[0] = "typeParameters";
                break;
            }
            case 1: 
            case 6: {
                objectArray2 = objectArray3;
                objectArray3[0] = "originalSubstitution";
                break;
            }
            case 2: 
            case 7: {
                objectArray2 = objectArray3;
                objectArray3[0] = "newContainingDeclaration";
                break;
            }
            case 3: 
            case 8: {
                objectArray2 = objectArray3;
                objectArray3[0] = "result";
                break;
            }
            case 4: {
                objectArray2 = objectArray3;
                objectArray3[0] = "kotlin/reflect/jvm/internal/impl/types/DescriptorSubstitutor";
            }
        }
        switch (n2) {
            default: {
                objectArray = objectArray2;
                objectArray2[1] = "kotlin/reflect/jvm/internal/impl/types/DescriptorSubstitutor";
                break;
            }
            case 4: {
                objectArray = objectArray2;
                objectArray2[1] = "substituteTypeParameters";
            }
        }
        switch (n2) {
            default: {
                objectArray = objectArray;
                objectArray[2] = "substituteTypeParameters";
            }
            case 4: 
        }
        String string2 = String.format(string, objectArray);
        switch (n2) {
            default: {
                runtimeException = new IllegalArgumentException(string2);
                break;
            }
            case 4: {
                runtimeException = new IllegalStateException(string2);
            }
        }
        throw runtimeException;
    }
}

