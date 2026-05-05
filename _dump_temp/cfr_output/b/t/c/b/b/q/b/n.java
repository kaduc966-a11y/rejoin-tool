/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.q.b;

import b.t.c.b.b.d.j;
import b.t.c.b.b.h.kc;
import b.t.c.b.b.h.rc;
import b.t.c.b.b.h.w;
import b.t.c.b.b.o.e.b.h;
import b.t.c.b.b.q.b$_b;
import b.t.c.b.b.q.b.f;
import b.t.c.b.b.q.b.p;
import b.t.c.b.b.q.e.o;
import b.t.c.b.b.q.eb;
import b.t.c.b.b.q.g;
import b.t.c.b.b.q.ib;
import b.t.c.b.b.q.mc;
import b.t.c.b.b.q.qc;
import b.t.c.b.b.q.s;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public abstract class n
extends p
implements mc {
    public n(o o2) {
        if (o2 == null) {
            n.\u00d3\u00d50000(0);
        }
        super(o2, j.do);
    }

    public n(o o2, b.t.c.b.b.d.f f2) {
        if (o2 == null) {
            n.\u00d3\u00d50000(1);
        }
        if (f2 == null) {
            n.\u00d3\u00d50000(2);
        }
        super(o2, f2);
    }

    @Override
    public mc if(kc object) {
        if (object == null) {
            n.\u00d3\u00d50000(3);
        }
        if (((kc)object).o00000()) {
            return this;
        }
        object = this.\u00d8\u00f80000() instanceof ib ? ((kc)object).o00000(this.forclasssuper(), w.return) : ((kc)object).o00000(this.forclasssuper(), w.\u00d400000);
        if (object == null) {
            return null;
        }
        if (object == this.forclasssuper()) {
            return this;
        }
        return new f(this.\u00d8\u00f80000(), new h((rc)object), this.\u00d4\u00f80000());
    }

    @Override
    public Object o00000(qc qc2, Object object) {
        return qc2.super(this, object);
    }

    @Override
    public List \u00d4\u00f4o000() {
        List list = Collections.emptyList();
        if (list == null) {
            n.\u00d3\u00d50000(4);
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
    public List \u00f8\u00d8o000() {
        List list = Collections.emptyList();
        if (list == null) {
            n.\u00d3\u00d50000(5);
        }
        return list;
    }

    @Override
    public rc \u00d3\u00f4o000() {
        return this.forclasssuper();
    }

    @Override
    public rc forclasssuper() {
        rc rc2 = this.\u00f4O\u00d2000().o00000();
        if (rc2 == null) {
            n.\u00d3\u00d50000(6);
        }
        return rc2;
    }

    @Override
    public List \u00f5\u00d8o000() {
        List list = Collections.emptyList();
        if (list == null) {
            n.\u00d3\u00d50000(7);
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
            n.\u00d3\u00d50000(8);
        }
        return set;
    }

    @Override
    public s \u00d50O000() {
        s s2 = eb.\u00d500000;
        if (s2 == null) {
            n.\u00d3\u00d50000(9);
        }
        return s2;
    }

    public b.t.c.b.b.q.n \u00f5O\u00d2000() {
        return this;
    }

    @Override
    public g \u00f4\u00f80000() {
        g g2 = g.o00000;
        if (g2 == null) {
            n.\u00d3\u00d50000(11);
        }
        return g2;
    }

    @Override
    public Object o00000(b$_b b$_b) {
        return null;
    }

    private static /* synthetic */ void \u00d3\u00d50000(int n2) {
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
            case 10: 
            case 11: {
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
            case 10: 
            case 11: {
                n3 = 2;
            }
        }
        Object[] objectArray3 = new Object[n3];
        switch (n2) {
            default: {
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
                objectArray3[0] = "substitutor";
                break;
            }
            case 4: 
            case 5: 
            case 6: 
            case 7: 
            case 8: 
            case 9: 
            case 10: 
            case 11: {
                objectArray2 = objectArray3;
                objectArray3[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractReceiverParameterDescriptor";
            }
        }
        switch (n2) {
            default: {
                objectArray = objectArray2;
                objectArray2[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractReceiverParameterDescriptor";
                break;
            }
            case 4: {
                objectArray = objectArray2;
                objectArray2[1] = "getContextReceiverParameters";
                break;
            }
            case 5: {
                objectArray = objectArray2;
                objectArray2[1] = "getTypeParameters";
                break;
            }
            case 6: {
                objectArray = objectArray2;
                objectArray2[1] = "getType";
                break;
            }
            case 7: {
                objectArray = objectArray2;
                objectArray2[1] = "getValueParameters";
                break;
            }
            case 8: {
                objectArray = objectArray2;
                objectArray2[1] = "getOverriddenDescriptors";
                break;
            }
            case 9: {
                objectArray = objectArray2;
                objectArray2[1] = "getVisibility";
                break;
            }
            case 10: {
                objectArray = objectArray2;
                objectArray2[1] = "getOriginal";
                break;
            }
            case 11: {
                objectArray = objectArray2;
                objectArray2[1] = "getSource";
            }
        }
        switch (n2) {
            default: {
                objectArray = objectArray;
                objectArray[2] = "<init>";
                break;
            }
            case 3: {
                objectArray = objectArray;
                objectArray[2] = "substitute";
            }
            case 4: 
            case 5: 
            case 6: 
            case 7: 
            case 8: 
            case 9: 
            case 10: 
            case 11: 
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
            case 10: 
            case 11: {
                runtimeException = new IllegalStateException(string2);
            }
        }
        throw runtimeException;
    }
}

