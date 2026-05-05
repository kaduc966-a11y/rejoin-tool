/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.q.b;

import b.t.c.b.b.h.d.c;
import b.t.c.b.b.h.d.k;
import b.t.c.b.b.h.rc;
import b.t.c.b.b.h.xb;
import b.t.c.b.b.i.l;
import b.t.c.b.b.o.f.b;
import b.t.c.b.b.o.q;
import b.t.c.b.b.q.b.gb;
import b.t.c.b.b.q.i;
import b.t.c.b.b.q.kb;
import b.t.c.b.b.q.r;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

class gb$_b
extends xb {
    private final r O\u00f5o000;
    final /* synthetic */ gb \u00f8\u00f4o000;

    public gb$_b(gb gb2, l l2, r r2) {
        if (l2 == null) {
            gb$_b.O\u00d30000(0);
        }
        this.\u00f8\u00f4o000 = gb2;
        super(l2);
        this.O\u00f5o000 = r2;
    }

    @Override
    public Collection newif() {
        List list = this.\u00f8\u00f4o000.\u00f8\u00d5o000();
        if (list == null) {
            gb$_b.O\u00d30000(1);
        }
        return list;
    }

    @Override
    public List \u00f5OO000() {
        List list = Collections.emptyList();
        if (list == null) {
            gb$_b.O\u00d30000(2);
        }
        return list;
    }

    @Override
    public boolean \u00d8OO000() {
        return true;
    }

    @Override
    public kb \u00f4OO000() {
        gb gb2 = this.\u00f8\u00f4o000;
        if (gb2 == null) {
            gb$_b.O\u00d30000(3);
        }
        return gb2;
    }

    @Override
    public b.t.c.b.b.b.c forint() {
        b.t.c.b.b.b.c c2 = b.null(this.\u00f8\u00f4o000);
        if (c2 == null) {
            gb$_b.O\u00d30000(4);
        }
        return c2;
    }

    public String toString() {
        return this.\u00f8\u00f4o000.\u00d5\u00f80000().toString();
    }

    @Override
    public r returnif() {
        r r2 = this.O\u00f5o000;
        if (r2 == null) {
            gb$_b.O\u00d30000(5);
        }
        return r2;
    }

    @Override
    public void o00000(rc rc2) {
        if (rc2 == null) {
            gb$_b.O\u00d30000(6);
        }
        this.\u00f8\u00f4o000.\u00f400000(rc2);
    }

    @Override
    public List o00000(List list) {
        if (list == null) {
            gb$_b.O\u00d30000(7);
        }
        List list2 = this.\u00f8\u00f4o000.if(list);
        if (list2 == null) {
            gb$_b.O\u00d30000(8);
        }
        return list2;
    }

    @Override
    public rc \u00d4oO000() {
        return k.new(c.\u00f8\u00d20000, new String[0]);
    }

    @Override
    public boolean o00000(kb kb2) {
        if (kb2 == null) {
            gb$_b.O\u00d30000(9);
        }
        return kb2 instanceof i && q.o00000.o00000(this.\u00f8\u00f4o000, (i)kb2, true);
    }

    private static /* synthetic */ void O\u00d30000(int n2) {
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
            case 1: 
            case 2: 
            case 3: 
            case 4: 
            case 5: 
            case 8: {
                string = "@NotNull method %s.%s must not return null";
            }
        }
        switch (n2) {
            default: {
                n3 = 3;
                break;
            }
            case 1: 
            case 2: 
            case 3: 
            case 4: 
            case 5: 
            case 8: {
                n3 = 2;
            }
        }
        Object[] objectArray3 = new Object[n3];
        switch (n2) {
            default: {
                objectArray2 = objectArray3;
                objectArray3[0] = "storageManager";
                break;
            }
            case 1: 
            case 2: 
            case 3: 
            case 4: 
            case 5: 
            case 8: {
                objectArray2 = objectArray3;
                objectArray3[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor";
                break;
            }
            case 6: {
                objectArray2 = objectArray3;
                objectArray3[0] = "type";
                break;
            }
            case 7: {
                objectArray2 = objectArray3;
                objectArray3[0] = "supertypes";
                break;
            }
            case 9: {
                objectArray2 = objectArray3;
                objectArray3[0] = "classifier";
            }
        }
        switch (n2) {
            default: {
                objectArray = objectArray2;
                objectArray2[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor";
                break;
            }
            case 1: {
                objectArray = objectArray2;
                objectArray2[1] = "computeSupertypes";
                break;
            }
            case 2: {
                objectArray = objectArray2;
                objectArray2[1] = "getParameters";
                break;
            }
            case 3: {
                objectArray = objectArray2;
                objectArray2[1] = "getDeclarationDescriptor";
                break;
            }
            case 4: {
                objectArray = objectArray2;
                objectArray2[1] = "getBuiltIns";
                break;
            }
            case 5: {
                objectArray = objectArray2;
                objectArray2[1] = "getSupertypeLoopChecker";
                break;
            }
            case 8: {
                objectArray = objectArray2;
                objectArray2[1] = "processSupertypesWithoutCycles";
            }
        }
        switch (n2) {
            default: {
                objectArray = objectArray;
                objectArray[2] = "<init>";
                break;
            }
            case 1: 
            case 2: 
            case 3: 
            case 4: 
            case 5: 
            case 8: {
                break;
            }
            case 6: {
                objectArray = objectArray;
                objectArray[2] = "reportSupertypeLoopError";
                break;
            }
            case 7: {
                objectArray = objectArray;
                objectArray[2] = "processSupertypesWithoutCycles";
                break;
            }
            case 9: {
                objectArray = objectArray;
                objectArray[2] = "isSameClassifier";
            }
        }
        String string2 = String.format(string, objectArray);
        switch (n2) {
            default: {
                runtimeException = new IllegalArgumentException(string2);
                break;
            }
            case 1: 
            case 2: 
            case 3: 
            case 4: 
            case 5: 
            case 8: {
                runtimeException = new IllegalStateException(string2);
            }
        }
        throw runtimeException;
    }
}

