/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.q.b;

import b.t.c.b.b.d.f;
import b.t.c.b.b.h.b.b;
import b.t.c.b.b.h.rc;
import b.t.c.b.b.q.b$_b;
import b.t.c.b.b.q.b.kb;
import b.t.c.b.b.q.e.o;
import b.t.c.b.b.q.g;
import b.t.c.b.b.q.mc;
import b.t.c.b.b.q.v;
import b.t.c.b.b.q.wb;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public abstract class ob
extends kb
implements v {
    protected rc \u00d5\u00f6\u00d5000;

    public ob(wb wb2, o o2, f f2, rc rc2, g g2) {
        if (wb2 == null) {
            ob.nullObject(0);
        }
        if (o2 == null) {
            ob.nullObject(1);
        }
        if (f2 == null) {
            ob.nullObject(2);
        }
        if (g2 == null) {
            ob.nullObject(3);
        }
        super(wb2, o2, f2, g2);
        this.\u00d5\u00f6\u00d5000 = rc2;
    }

    @Override
    public rc forclasssuper() {
        rc rc2 = this.\u00d5\u00f6\u00d5000;
        if (rc2 == null) {
            ob.nullObject(4);
        }
        return rc2;
    }

    public void OO0000(rc rc2) {
        assert (this.\u00d5\u00f6\u00d5000 == null || b.OO0000(this.\u00d5\u00f6\u00d5000));
        this.\u00d5\u00f6\u00d5000 = rc2;
    }

    public v \u00f8\u00f4o000() {
        v v2 = (v)super.oOO000();
        if (v2 == null) {
            ob.nullObject(5);
        }
        return v2;
    }

    @Override
    public List \u00f5\u00d8o000() {
        List list = Collections.emptyList();
        if (list == null) {
            ob.nullObject(6);
        }
        return list;
    }

    @Override
    public boolean o\u00f4o000() {
        return false;
    }

    @Override
    public Collection \u00d5\u00f4o000() {
        Set set = Collections.emptySet();
        if (set == null) {
            ob.nullObject(7);
        }
        return set;
    }

    @Override
    public List \u00f8\u00d8o000() {
        List list = Collections.emptyList();
        if (list == null) {
            ob.nullObject(8);
        }
        return list;
    }

    @Override
    public List \u00d4\u00f4o000() {
        List list = Collections.emptyList();
        if (list == null) {
            ob.nullObject(9);
        }
        return list;
    }

    @Override
    public mc nullclasssuper() {
        return null;
    }

    @Override
    public mc Stringclasssuper() {
        return null;
    }

    @Override
    public rc \u00d3\u00f4o000() {
        rc rc2 = this.forclasssuper();
        if (rc2 == null) {
            ob.nullObject(10);
        }
        return rc2;
    }

    @Override
    public boolean \u00f5\u00f4o000() {
        return false;
    }

    @Override
    public Object o00000(b$_b b$_b) {
        return null;
    }

    private static /* synthetic */ void nullObject(int n2) {
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
            case 7: 
            case 8: 
            case 9: 
            case 10: {
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
            case 7: 
            case 8: 
            case 9: 
            case 10: {
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
            case 1: {
                objectArray2 = objectArray3;
                objectArray3[0] = "annotations";
                break;
            }
            case 2: {
                objectArray2 = objectArray3;
                objectArray3[0] = "name";
                break;
            }
            case 3: {
                objectArray2 = objectArray3;
                objectArray3[0] = "source";
                break;
            }
            case 4: 
            case 5: 
            case 6: 
            case 7: 
            case 8: 
            case 9: 
            case 10: {
                objectArray2 = objectArray3;
                objectArray3[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorImpl";
            }
        }
        switch (n2) {
            default: {
                objectArray = objectArray2;
                objectArray2[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorImpl";
                break;
            }
            case 4: {
                objectArray = objectArray2;
                objectArray2[1] = "getType";
                break;
            }
            case 5: {
                objectArray = objectArray2;
                objectArray2[1] = "getOriginal";
                break;
            }
            case 6: {
                objectArray = objectArray2;
                objectArray2[1] = "getValueParameters";
                break;
            }
            case 7: {
                objectArray = objectArray2;
                objectArray2[1] = "getOverriddenDescriptors";
                break;
            }
            case 8: {
                objectArray = objectArray2;
                objectArray2[1] = "getTypeParameters";
                break;
            }
            case 9: {
                objectArray = objectArray2;
                objectArray2[1] = "getContextReceiverParameters";
                break;
            }
            case 10: {
                objectArray = objectArray2;
                objectArray2[1] = "getReturnType";
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
            case 8: 
            case 9: 
            case 10: 
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
            case 7: 
            case 8: 
            case 9: 
            case 10: {
                runtimeException = new IllegalStateException(string2);
            }
        }
        throw runtimeException;
    }
}

