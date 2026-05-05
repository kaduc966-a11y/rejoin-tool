/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.h;

import b.t.c.b.b.b.c;
import b.t.c.b.b.h.rc;
import b.t.c.b.b.h.xb;
import b.t.c.b.b.i.l;
import b.t.c.b.b.m.d;
import b.t.c.b.b.o.f.b;
import b.t.c.b.b.q.ib;
import b.t.c.b.b.q.kb;
import b.t.c.b.b.q.wb;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public abstract class p
extends xb {
    public p(l l2) {
        if (l2 == null) {
            p.ifnew(0);
        }
        super(l2);
    }

    public abstract ib \u00d8oO000();

    @Override
    public c forint() {
        c c2 = b.null(this.\u00d8oO000());
        if (c2 == null) {
            p.ifnew(1);
        }
        return c2;
    }

    @Override
    protected boolean o00000(kb kb2) {
        if (kb2 == null) {
            p.ifnew(2);
        }
        if (kb2 instanceof ib) {
            p p2 = this;
            if (p2.o00000(p2.\u00d8oO000(), kb2)) {
                return true;
            }
        }
        return false;
    }

    @Override
    protected Collection \u00d800000(boolean bl) {
        wb wb2 = this.\u00d8oO000().\u00d8\u00f80000();
        if (!(wb2 instanceof ib)) {
            List list = Collections.emptyList();
            if (list == null) {
                p.ifnew(3);
            }
            return list;
        }
        d d2 = new d();
        wb2 = (ib)wb2;
        d2.add(wb2.nullint());
        wb2 = wb2.forintsuper();
        if (bl && wb2 != null) {
            d2.add(wb2.nullint());
        }
        return d2;
    }

    @Override
    protected rc \u00d4oO000() {
        if (c.o00000(this.\u00d8oO000())) {
            return null;
        }
        return this.forint().oO0000();
    }

    private static /* synthetic */ void ifnew(int n2) {
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
            case 3: 
            case 4: {
                string = "@NotNull method %s.%s must not return null";
            }
        }
        switch (n2) {
            default: {
                n3 = 3;
                break;
            }
            case 1: 
            case 3: 
            case 4: {
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
            case 3: 
            case 4: {
                objectArray2 = objectArray3;
                objectArray3[0] = "kotlin/reflect/jvm/internal/impl/types/AbstractClassTypeConstructor";
                break;
            }
            case 2: {
                objectArray2 = objectArray3;
                objectArray3[0] = "classifier";
            }
        }
        switch (n2) {
            default: {
                objectArray = objectArray2;
                objectArray2[1] = "kotlin/reflect/jvm/internal/impl/types/AbstractClassTypeConstructor";
                break;
            }
            case 1: {
                objectArray = objectArray2;
                objectArray2[1] = "getBuiltIns";
                break;
            }
            case 3: 
            case 4: {
                objectArray = objectArray2;
                objectArray2[1] = "getAdditionalNeighboursInSupertypeGraph";
            }
        }
        switch (n2) {
            default: {
                objectArray = objectArray;
                objectArray[2] = "<init>";
                break;
            }
            case 1: 
            case 3: 
            case 4: {
                break;
            }
            case 2: {
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
            case 3: 
            case 4: {
                runtimeException = new IllegalStateException(string2);
            }
        }
        throw runtimeException;
    }
}

