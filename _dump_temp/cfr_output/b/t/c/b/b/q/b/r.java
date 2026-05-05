/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.q.b;

import b.t.c.b.b.d.f;
import b.t.c.b.b.h.rc;
import b.t.c.b.b.q.ab;
import b.t.c.b.b.q.b.y;
import b.t.c.b.b.q.cb;
import b.t.c.b.b.q.e.o;
import b.t.c.b.b.q.g;
import b.t.c.b.b.q.hc$_b;
import b.t.c.b.b.q.pb;
import b.t.c.b.b.q.qc;
import b.t.c.b.b.q.s;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class r
extends y
implements cb {
    private rc \u00f5\u00f8\u00d5000;
    private final cb ifreturnObject;

    public r(pb pb2, o o2, ab ab2, s s2, boolean bl, boolean bl2, boolean bl3, hc$_b hc$_b, cb cb2, g g2) {
        if (pb2 == null) {
            r.forObject(0);
        }
        if (o2 == null) {
            r.forObject(1);
        }
        if (ab2 == null) {
            r.forObject(2);
        }
        if (s2 == null) {
            r.forObject(3);
        }
        if (hc$_b == null) {
            r.forObject(4);
        }
        if (g2 == null) {
            r.forObject(5);
        }
        super(ab2, s2, pb2, o2, f.\u00d400000("<get-" + pb2.\u00d5\u00f80000() + ">"), bl, bl2, bl3, hc$_b, g2);
        this.ifreturnObject = cb2 != null ? cb2 : this;
    }

    public void oO0000(rc rc2) {
        this.\u00f5\u00f8\u00d5000 = rc2 == null ? this.O\u00f6o000().forclasssuper() : rc2;
    }

    @Override
    public Collection \u00d5\u00f4o000() {
        Collection collection = super.if(true);
        if (collection == null) {
            r.forObject(6);
        }
        return collection;
    }

    @Override
    public List \u00f5\u00d8o000() {
        List list = Collections.emptyList();
        if (list == null) {
            r.forObject(7);
        }
        return list;
    }

    @Override
    public rc \u00d3\u00f4o000() {
        return this.\u00f5\u00f8\u00d5000;
    }

    @Override
    public Object o00000(qc qc2, Object object) {
        return qc2.super(this, object);
    }

    public cb \u00d4\u00f6o000() {
        cb cb2 = this.ifreturnObject;
        if (cb2 == null) {
            r.forObject(8);
        }
        return cb2;
    }

    private static /* synthetic */ void forObject(int n2) {
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
            case 6: 
            case 7: 
            case 8: {
                string = "@NotNull method %s.%s must not return null";
            }
        }
        switch (n2) {
            default: {
                n3 = 3;
                break;
            }
            case 6: 
            case 7: 
            case 8: {
                n3 = 2;
            }
        }
        Object[] objectArray3 = new Object[n3];
        switch (n2) {
            default: {
                objectArray2 = objectArray3;
                objectArray3[0] = "correspondingProperty";
                break;
            }
            case 1: {
                objectArray2 = objectArray3;
                objectArray3[0] = "annotations";
                break;
            }
            case 2: {
                objectArray2 = objectArray3;
                objectArray3[0] = "modality";
                break;
            }
            case 3: {
                objectArray2 = objectArray3;
                objectArray3[0] = "visibility";
                break;
            }
            case 4: {
                objectArray2 = objectArray3;
                objectArray3[0] = "kind";
                break;
            }
            case 5: {
                objectArray2 = objectArray3;
                objectArray3[0] = "source";
                break;
            }
            case 6: 
            case 7: 
            case 8: {
                objectArray2 = objectArray3;
                objectArray3[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyGetterDescriptorImpl";
            }
        }
        switch (n2) {
            default: {
                objectArray = objectArray2;
                objectArray2[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyGetterDescriptorImpl";
                break;
            }
            case 6: {
                objectArray = objectArray2;
                objectArray2[1] = "getOverriddenDescriptors";
                break;
            }
            case 7: {
                objectArray = objectArray2;
                objectArray2[1] = "getValueParameters";
                break;
            }
            case 8: {
                objectArray = objectArray2;
                objectArray2[1] = "getOriginal";
            }
        }
        switch (n2) {
            default: {
                objectArray = objectArray;
                objectArray[2] = "<init>";
            }
            case 6: 
            case 7: 
            case 8: 
        }
        String string2 = String.format(string, objectArray);
        switch (n2) {
            default: {
                runtimeException = new IllegalArgumentException(string2);
                break;
            }
            case 6: 
            case 7: 
            case 8: {
                runtimeException = new IllegalStateException(string2);
            }
        }
        throw runtimeException;
    }
}

