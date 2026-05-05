/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.h;

import b.t.c.b.b.h.p;
import b.t.c.b.b.i.l;
import b.t.c.b.b.o.n;
import b.t.c.b.b.q.ib;
import b.t.c.b.b.q.r;
import b.t.c.b.b.q.r$_b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class g
extends p {
    private final ib \u00f4\u00f4o000;
    private final List forclasssuper;
    private final Collection \u00d8\u00f4o000;

    public g(ib ib2, List list, Collection collection, l l2) {
        if (ib2 == null) {
            g.\u00f8\u00d20000(0);
        }
        if (list == null) {
            g.\u00f8\u00d20000(1);
        }
        if (collection == null) {
            g.\u00f8\u00d20000(2);
        }
        if (l2 == null) {
            g.\u00f8\u00d20000(3);
        }
        super(l2);
        this.\u00f4\u00f4o000 = ib2;
        this.forclasssuper = Collections.unmodifiableList(new ArrayList(list));
        this.\u00d8\u00f4o000 = Collections.unmodifiableCollection(collection);
    }

    @Override
    public List \u00f5OO000() {
        List list = this.forclasssuper;
        if (list == null) {
            g.\u00f8\u00d20000(4);
        }
        return list;
    }

    public String toString() {
        return n.\u00d8O0000(this.\u00f4\u00f4o000).\u00d300000();
    }

    @Override
    public boolean \u00d8OO000() {
        return true;
    }

    @Override
    public ib \u00d8oO000() {
        ib ib2 = this.\u00f4\u00f4o000;
        if (ib2 == null) {
            g.\u00f8\u00d20000(5);
        }
        return ib2;
    }

    @Override
    protected Collection newif() {
        Collection collection = this.\u00d8\u00f4o000;
        if (collection == null) {
            g.\u00f8\u00d20000(6);
        }
        return collection;
    }

    @Override
    protected r returnif() {
        r$_b r$_b = r$_b.o00000;
        if (r$_b == null) {
            g.\u00f8\u00d20000(7);
        }
        return r$_b;
    }

    private static /* synthetic */ void \u00f8\u00d20000(int n2) {
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
            case 5: 
            case 6: 
            case 7: {
                string = "@NotNull method %s.%s must not return null";
            }
        }
        switch (n2) {
            default: {
                n3 = 3;
                break;
            }
            case 4: 
            case 5: 
            case 6: 
            case 7: {
                n3 = 2;
            }
        }
        Object[] objectArray3 = new Object[n3];
        switch (n2) {
            default: {
                objectArray2 = objectArray3;
                objectArray3[0] = "classDescriptor";
                break;
            }
            case 1: {
                objectArray2 = objectArray3;
                objectArray3[0] = "parameters";
                break;
            }
            case 2: {
                objectArray2 = objectArray3;
                objectArray3[0] = "supertypes";
                break;
            }
            case 3: {
                objectArray2 = objectArray3;
                objectArray3[0] = "storageManager";
                break;
            }
            case 4: 
            case 5: 
            case 6: 
            case 7: {
                objectArray2 = objectArray3;
                objectArray3[0] = "kotlin/reflect/jvm/internal/impl/types/ClassTypeConstructorImpl";
            }
        }
        switch (n2) {
            default: {
                objectArray = objectArray2;
                objectArray2[1] = "kotlin/reflect/jvm/internal/impl/types/ClassTypeConstructorImpl";
                break;
            }
            case 4: {
                objectArray = objectArray2;
                objectArray2[1] = "getParameters";
                break;
            }
            case 5: {
                objectArray = objectArray2;
                objectArray2[1] = "getDeclarationDescriptor";
                break;
            }
            case 6: {
                objectArray = objectArray2;
                objectArray2[1] = "computeSupertypes";
                break;
            }
            case 7: {
                objectArray = objectArray2;
                objectArray2[1] = "getSupertypeLoopChecker";
            }
        }
        switch (n2) {
            default: {
                objectArray = objectArray;
                objectArray[2] = "<init>";
            }
            case 4: 
            case 5: 
            case 6: 
            case 7: 
        }
        String string2 = String.format(string, objectArray);
        switch (n2) {
            default: {
                runtimeException = new IllegalArgumentException(string2);
                break;
            }
            case 4: 
            case 5: 
            case 6: 
            case 7: {
                runtimeException = new IllegalStateException(string2);
            }
        }
        throw runtimeException;
    }
}

