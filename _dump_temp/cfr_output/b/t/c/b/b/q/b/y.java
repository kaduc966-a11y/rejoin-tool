/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.q.b;

import b.t.c.b.b.d.f;
import b.t.c.b.b.h.kc;
import b.t.c.b.b.q.ab;
import b.t.c.b.b.q.b$_b;
import b.t.c.b.b.q.b.kb;
import b.t.c.b.b.q.e.o;
import b.t.c.b.b.q.g;
import b.t.c.b.b.q.hc;
import b.t.c.b.b.q.hc$_b;
import b.t.c.b.b.q.ic;
import b.t.c.b.b.q.ic$_b;
import b.t.c.b.b.q.mc;
import b.t.c.b.b.q.pb;
import b.t.c.b.b.q.s;
import b.t.c.b.b.q.wb;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public abstract class y
extends kb
implements b.t.c.b.b.q.y {
    private boolean newreturnObject;
    private final boolean \u00f8\u00f6\u00d5000;
    private final ab \u00d5\u00f8\u00d5000;
    private final pb \u00d4\u00f8\u00d5000;
    private final boolean o\u00f8\u00d5000;
    private final hc$_b \u00d3\u00f8\u00d5000;
    private s O\u00f8\u00d5000;
    private ic returnreturnObject;

    public y(ab ab2, s s2, pb pb2, o o2, f f2, boolean bl, boolean bl2, boolean bl3, hc$_b hc$_b, g g2) {
        if (ab2 == null) {
            y.\u00d4\u00d40000(0);
        }
        if (s2 == null) {
            y.\u00d4\u00d40000(1);
        }
        if (pb2 == null) {
            y.\u00d4\u00d40000(2);
        }
        if (o2 == null) {
            y.\u00d4\u00d40000(3);
        }
        if (f2 == null) {
            y.\u00d4\u00d40000(4);
        }
        if (g2 == null) {
            y.\u00d4\u00d40000(5);
        }
        super(pb2.\u00d8\u00f80000(), o2, f2, g2);
        this.returnreturnObject = null;
        this.\u00d5\u00f8\u00d5000 = ab2;
        this.O\u00f8\u00d5000 = s2;
        this.\u00d4\u00f8\u00d5000 = pb2;
        this.newreturnObject = bl;
        this.\u00f8\u00f6\u00d5000 = bl2;
        this.o\u00f8\u00d5000 = bl3;
        this.\u00d3\u00f8\u00d5000 = hc$_b;
    }

    @Override
    public boolean o\u00f6o000() {
        return this.newreturnObject;
    }

    public void \u00f800000(boolean bl) {
        this.newreturnObject = bl;
    }

    @Override
    public hc$_b O\u00f5o000() {
        hc$_b hc$_b = this.\u00d3\u00f8\u00d5000;
        if (hc$_b == null) {
            y.\u00d4\u00d40000(6);
        }
        return hc$_b;
    }

    @Override
    public boolean \u00d3\u00f5o000() {
        return false;
    }

    @Override
    public boolean \u00f4\u00f5o000() {
        return false;
    }

    @Override
    public boolean \u00f50O000() {
        return this.\u00f8\u00f6\u00d5000;
    }

    @Override
    public boolean \u00f8\u00f5o000() {
        return this.o\u00f8\u00d5000;
    }

    @Override
    public boolean newreturnsuper() {
        return false;
    }

    @Override
    public boolean \u00d5\u00f5o000() {
        return false;
    }

    @Override
    public boolean \u00d80O000() {
        return false;
    }

    @Override
    public boolean thisint() {
        return false;
    }

    @Override
    public ic \u00d300000(kc kc2) {
        if (kc2 == null) {
            y.\u00d4\u00d40000(7);
        }
        return this;
    }

    @Override
    public List \u00f8\u00d8o000() {
        List list = Collections.emptyList();
        if (list == null) {
            y.\u00d4\u00d40000(9);
        }
        return list;
    }

    @Override
    public boolean o\u00f4o000() {
        return false;
    }

    @Override
    public ab \u00f40O000() {
        ab ab2 = this.\u00d5\u00f8\u00d5000;
        if (ab2 == null) {
            y.\u00d4\u00d40000(10);
        }
        return ab2;
    }

    @Override
    public s \u00d50O000() {
        s s2 = this.O\u00f8\u00d5000;
        if (s2 == null) {
            y.\u00d4\u00d40000(11);
        }
        return s2;
    }

    public void o00000(s s2) {
        this.O\u00f8\u00d5000 = s2;
    }

    @Override
    public pb O\u00f6o000() {
        pb pb2 = this.\u00d4\u00f8\u00d5000;
        if (pb2 == null) {
            y.\u00d4\u00d40000(13);
        }
        return pb2;
    }

    @Override
    public List \u00d4\u00f4o000() {
        List list = this.O\u00f6o000().\u00d4\u00f4o000();
        if (list == null) {
            y.\u00d4\u00d40000(14);
        }
        return list;
    }

    @Override
    public mc nullclasssuper() {
        return this.O\u00f6o000().nullclasssuper();
    }

    @Override
    public mc Stringclasssuper() {
        return this.O\u00f6o000().Stringclasssuper();
    }

    @Override
    public ic$_b ifreturnsuper() {
        throw new UnsupportedOperationException("Accessors must be copied by the corresponding property");
    }

    public b.t.c.b.b.q.y new(wb wb2, ab ab2, s s2, hc$_b hc$_b, boolean bl) {
        throw new UnsupportedOperationException("Accessors must be copied by the corresponding property");
    }

    protected Collection if(boolean bl) {
        ArrayList<pb> arrayList = new ArrayList<pb>(0);
        for (hc hc2 : this.O\u00f6o000().\u00d5\u00f4o000()) {
            hc2 = bl ? hc2.o0\u00d2000() : hc2.\u00f5\u00f8o000();
            if (hc2 == null) continue;
            arrayList.add((pb)hc2);
        }
        return arrayList;
    }

    @Override
    public void o00000(Collection collection) {
        if (collection == null) {
            y.\u00d4\u00d40000(16);
        }
        assert (collection.isEmpty()) : "Overridden accessors should be empty";
    }

    public abstract b.t.c.b.b.q.y whilereturnsuper();

    @Override
    public ic \u00d8\u00f5o000() {
        return this.returnreturnObject;
    }

    public void return(ic ic2) {
        this.returnreturnObject = ic2;
    }

    @Override
    public boolean \u00d4\u00f5o000() {
        return false;
    }

    @Override
    public boolean returnreturnsuper() {
        return false;
    }

    @Override
    public Object o00000(b$_b b$_b) {
        return null;
    }

    private static /* synthetic */ void \u00d4\u00d40000(int n2) {
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
            case 8: 
            case 9: 
            case 10: 
            case 11: 
            case 12: 
            case 13: 
            case 14: 
            case 15: {
                string = "@NotNull method %s.%s must not return null";
            }
        }
        switch (n2) {
            default: {
                n3 = 3;
                break;
            }
            case 6: 
            case 8: 
            case 9: 
            case 10: 
            case 11: 
            case 12: 
            case 13: 
            case 14: 
            case 15: {
                n3 = 2;
            }
        }
        Object[] objectArray3 = new Object[n3];
        switch (n2) {
            default: {
                objectArray2 = objectArray3;
                objectArray3[0] = "modality";
                break;
            }
            case 1: {
                objectArray2 = objectArray3;
                objectArray3[0] = "visibility";
                break;
            }
            case 2: {
                objectArray2 = objectArray3;
                objectArray3[0] = "correspondingProperty";
                break;
            }
            case 3: {
                objectArray2 = objectArray3;
                objectArray3[0] = "annotations";
                break;
            }
            case 4: {
                objectArray2 = objectArray3;
                objectArray3[0] = "name";
                break;
            }
            case 5: {
                objectArray2 = objectArray3;
                objectArray3[0] = "source";
                break;
            }
            case 6: 
            case 8: 
            case 9: 
            case 10: 
            case 11: 
            case 12: 
            case 13: 
            case 14: 
            case 15: {
                objectArray2 = objectArray3;
                objectArray3[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyAccessorDescriptorImpl";
                break;
            }
            case 7: {
                objectArray2 = objectArray3;
                objectArray3[0] = "substitutor";
                break;
            }
            case 16: {
                objectArray2 = objectArray3;
                objectArray3[0] = "overriddenDescriptors";
            }
        }
        switch (n2) {
            default: {
                objectArray = objectArray2;
                objectArray2[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyAccessorDescriptorImpl";
                break;
            }
            case 6: {
                objectArray = objectArray2;
                objectArray2[1] = "getKind";
                break;
            }
            case 8: {
                objectArray = objectArray2;
                objectArray2[1] = "substitute";
                break;
            }
            case 9: {
                objectArray = objectArray2;
                objectArray2[1] = "getTypeParameters";
                break;
            }
            case 10: {
                objectArray = objectArray2;
                objectArray2[1] = "getModality";
                break;
            }
            case 11: {
                objectArray = objectArray2;
                objectArray2[1] = "getVisibility";
                break;
            }
            case 12: {
                objectArray = objectArray2;
                objectArray2[1] = "getCorrespondingVariable";
                break;
            }
            case 13: {
                objectArray = objectArray2;
                objectArray2[1] = "getCorrespondingProperty";
                break;
            }
            case 14: {
                objectArray = objectArray2;
                objectArray2[1] = "getContextReceiverParameters";
                break;
            }
            case 15: {
                objectArray = objectArray2;
                objectArray2[1] = "getOverriddenDescriptors";
            }
        }
        switch (n2) {
            default: {
                objectArray = objectArray;
                objectArray[2] = "<init>";
                break;
            }
            case 6: 
            case 8: 
            case 9: 
            case 10: 
            case 11: 
            case 12: 
            case 13: 
            case 14: 
            case 15: {
                break;
            }
            case 7: {
                objectArray = objectArray;
                objectArray[2] = "substitute";
                break;
            }
            case 16: {
                objectArray = objectArray;
                objectArray[2] = "setOverriddenDescriptors";
            }
        }
        String string2 = String.format(string, objectArray);
        switch (n2) {
            default: {
                runtimeException = new IllegalArgumentException(string2);
                break;
            }
            case 6: 
            case 8: 
            case 9: 
            case 10: 
            case 11: 
            case 12: 
            case 13: 
            case 14: 
            case 15: {
                runtimeException = new IllegalStateException(string2);
            }
        }
        throw runtimeException;
    }
}

