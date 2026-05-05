/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.q.b;

import b.t.c.b.b.d.f;
import b.t.c.b.b.d.j;
import b.t.c.b.b.h.rc;
import b.t.c.b.b.o.f.b;
import b.t.c.b.b.q.ab;
import b.t.c.b.b.q.b.ib;
import b.t.c.b.b.q.b.y;
import b.t.c.b.b.q.e;
import b.t.c.b.b.q.e.o;
import b.t.c.b.b.q.g;
import b.t.c.b.b.q.hc$_b;
import b.t.c.b.b.q.jc;
import b.t.c.b.b.q.pb;
import b.t.c.b.b.q.qc;
import b.t.c.b.b.q.s;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class d
extends y
implements e {
    private jc \u00f4\u00f8\u00d5000;
    private final e \u00d8\u00f8\u00d5000;

    public d(pb pb2, o o2, ab ab2, s s2, boolean bl, boolean bl2, boolean bl3, hc$_b hc$_b, e e2, g g2) {
        if (pb2 == null) {
            d.\u00d5\u00d40000(0);
        }
        if (o2 == null) {
            d.\u00d5\u00d40000(1);
        }
        if (ab2 == null) {
            d.\u00d5\u00d40000(2);
        }
        if (s2 == null) {
            d.\u00d5\u00d40000(3);
        }
        if (hc$_b == null) {
            d.\u00d5\u00d40000(4);
        }
        if (g2 == null) {
            d.\u00d5\u00d40000(5);
        }
        super(ab2, s2, pb2, o2, f.\u00d400000("<set-" + pb2.\u00d5\u00f80000() + ">"), bl, bl2, bl3, hc$_b, g2);
        this.\u00d8\u00f8\u00d5000 = e2 != null ? e2 : this;
    }

    public void new(jc jc2) {
        if (jc2 == null) {
            d.\u00d5\u00d40000(6);
        }
        assert (this.\u00f4\u00f8\u00d5000 == null);
        this.\u00f4\u00f8\u00d5000 = jc2;
    }

    public static ib o00000(e e2, rc rc2, o o2) {
        if (e2 == null) {
            d.\u00d5\u00d40000(7);
        }
        if (rc2 == null) {
            d.\u00d5\u00d40000(8);
        }
        if (o2 == null) {
            d.\u00d5\u00d40000(9);
        }
        return new ib(e2, null, 0, o2, j.interface, rc2, false, false, false, null, g.o00000);
    }

    @Override
    public Collection \u00d5\u00f4o000() {
        Collection collection = super.if(false);
        if (collection == null) {
            d.\u00d5\u00d40000(10);
        }
        return collection;
    }

    @Override
    public List \u00f5\u00d8o000() {
        if (this.\u00f4\u00f8\u00d5000 == null) {
            throw new IllegalStateException();
        }
        List<jc> list = Collections.singletonList(this.\u00f4\u00f8\u00d5000);
        if (list == null) {
            d.\u00d5\u00d40000(11);
        }
        return list;
    }

    @Override
    public rc \u00d3\u00f4o000() {
        b.t.c.b.b.h.ib ib2 = b.null(this).returnsuper();
        if (ib2 == null) {
            d.\u00d5\u00d40000(12);
        }
        return ib2;
    }

    @Override
    public Object o00000(qc qc2, Object object) {
        return qc2.super(this, object);
    }

    public e \u00d3\u00f6o000() {
        e e2 = this.\u00d8\u00f8\u00d5000;
        if (e2 == null) {
            d.\u00d5\u00d40000(13);
        }
        return e2;
    }

    private static /* synthetic */ void \u00d5\u00d40000(int n2) {
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
            case 10: 
            case 11: 
            case 12: 
            case 13: {
                string = "@NotNull method %s.%s must not return null";
            }
        }
        switch (n2) {
            default: {
                n3 = 3;
                break;
            }
            case 10: 
            case 11: 
            case 12: 
            case 13: {
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
            case 1: 
            case 9: {
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
            case 6: {
                objectArray2 = objectArray3;
                objectArray3[0] = "parameter";
                break;
            }
            case 7: {
                objectArray2 = objectArray3;
                objectArray3[0] = "setterDescriptor";
                break;
            }
            case 8: {
                objectArray2 = objectArray3;
                objectArray3[0] = "type";
                break;
            }
            case 10: 
            case 11: 
            case 12: 
            case 13: {
                objectArray2 = objectArray3;
                objectArray3[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertySetterDescriptorImpl";
            }
        }
        switch (n2) {
            default: {
                objectArray = objectArray2;
                objectArray2[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertySetterDescriptorImpl";
                break;
            }
            case 10: {
                objectArray = objectArray2;
                objectArray2[1] = "getOverriddenDescriptors";
                break;
            }
            case 11: {
                objectArray = objectArray2;
                objectArray2[1] = "getValueParameters";
                break;
            }
            case 12: {
                objectArray = objectArray2;
                objectArray2[1] = "getReturnType";
                break;
            }
            case 13: {
                objectArray = objectArray2;
                objectArray2[1] = "getOriginal";
            }
        }
        switch (n2) {
            default: {
                objectArray = objectArray;
                objectArray[2] = "<init>";
                break;
            }
            case 6: {
                objectArray = objectArray;
                objectArray[2] = "initialize";
                break;
            }
            case 7: 
            case 8: 
            case 9: {
                objectArray = objectArray;
                objectArray[2] = "createSetterParameter";
            }
            case 10: 
            case 11: 
            case 12: 
            case 13: 
        }
        String string2 = String.format(string, objectArray);
        switch (n2) {
            default: {
                runtimeException = new IllegalArgumentException(string2);
                break;
            }
            case 10: 
            case 11: 
            case 12: 
            case 13: {
                runtimeException = new IllegalStateException(string2);
            }
        }
        throw runtimeException;
    }
}

