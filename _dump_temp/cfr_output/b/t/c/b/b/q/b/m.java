/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.q.b;

import b.t.c.b.b.d.f;
import b.t.c.b.b.h.hb;
import b.t.c.b.b.h.rc;
import b.t.c.b.b.h.w;
import b.t.c.b.b.i.l;
import b.t.c.b.b.o.f.b;
import b.t.c.b.b.o.n;
import b.t.c.b.b.q.b.gb;
import b.t.c.b.b.q.e.o;
import b.t.c.b.b.q.g;
import b.t.c.b.b.q.i;
import b.t.c.b.b.q.r;
import b.t.c.b.b.q.r$_b;
import b.t.c.b.b.q.wb;
import java.util.ArrayList;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class m
extends gb {
    private final b.o.e.g O\u00f5\u00d5000;
    private final List whileStringObject;
    private boolean o\u00f5\u00d5000;

    public static i o00000(wb wb2, o object, boolean bl, w w2, f f2, int n2, l l2) {
        if (wb2 == null) {
            m.O\u00d40000(0);
        }
        if (object == null) {
            m.O\u00d40000(1);
        }
        if (w2 == null) {
            m.O\u00d40000(2);
        }
        if (f2 == null) {
            m.O\u00d40000(3);
        }
        if (l2 == null) {
            m.O\u00d40000(4);
        }
        object = m.o00000(wb2, (o)object, bl, w2, f2, n2, g.o00000, l2);
        ((m)object).\u00f500000(b.null(wb2).\u00f5O0000());
        ((m)object).O\u00d6o000();
        Object object2 = object;
        if (object2 == null) {
            m.O\u00d40000(5);
        }
        return object2;
    }

    public static m o00000(wb wb2, o o2, boolean bl, w w2, f f2, int n2, g g2, l l2) {
        if (wb2 == null) {
            m.O\u00d40000(6);
        }
        if (o2 == null) {
            m.O\u00d40000(7);
        }
        if (w2 == null) {
            m.O\u00d40000(8);
        }
        if (f2 == null) {
            m.O\u00d40000(9);
        }
        if (g2 == null) {
            m.O\u00d40000(10);
        }
        if (l2 == null) {
            m.O\u00d40000(11);
        }
        return m.o00000(wb2, o2, bl, w2, f2, n2, g2, null, r$_b.o00000, l2);
    }

    public static m o00000(wb wb2, o o2, boolean bl, w w2, f f2, int n2, g g2, b.o.e.g g3, r r2, l l2) {
        if (wb2 == null) {
            m.O\u00d40000(12);
        }
        if (o2 == null) {
            m.O\u00d40000(13);
        }
        if (w2 == null) {
            m.O\u00d40000(14);
        }
        if (f2 == null) {
            m.O\u00d40000(15);
        }
        if (g2 == null) {
            m.O\u00d40000(16);
        }
        if (r2 == null) {
            m.O\u00d40000(17);
        }
        if (l2 == null) {
            m.O\u00d40000(18);
        }
        return new m(wb2, o2, bl, w2, f2, n2, g2, g3, r2, l2);
    }

    private m(wb wb2, o o2, boolean bl, w w2, f f2, int n2, g g2, b.o.e.g g3, r r2, l l2) {
        if (wb2 == null) {
            m.O\u00d40000(19);
        }
        if (o2 == null) {
            m.O\u00d40000(20);
        }
        if (w2 == null) {
            m.O\u00d40000(21);
        }
        if (f2 == null) {
            m.O\u00d40000(22);
        }
        if (g2 == null) {
            m.O\u00d40000(23);
        }
        if (r2 == null) {
            m.O\u00d40000(24);
        }
        if (l2 == null) {
            m.O\u00d40000(25);
        }
        super(l2, wb2, o2, f2, w2, bl, n2, g2, r2);
        this.whileStringObject = new ArrayList(1);
        this.o\u00f5\u00d5000 = false;
        this.O\u00f5\u00d5000 = g3;
    }

    private void \u00d3\u00d6o000() {
        if (!this.o\u00f5\u00d5000) {
            throw new IllegalStateException("Type parameter descriptor is not initialized: " + this.o\u00d6o000());
        }
    }

    private void newStringsuper() {
        if (this.o\u00f5\u00d5000) {
            throw new IllegalStateException("Type parameter descriptor is already initialized: " + this.o\u00d6o000());
        }
    }

    private String o\u00d6o000() {
        return this.\u00d5\u00f80000() + " declared in " + n.\u00d8O0000(this.\u00d8\u00f80000());
    }

    public void O\u00d6o000() {
        this.newStringsuper();
        this.o\u00f5\u00d5000 = true;
    }

    public boolean \u00d4\u00d6o000() {
        return this.o\u00f5\u00d5000;
    }

    public void \u00f500000(rc rc2) {
        if (rc2 == null) {
            m.O\u00d40000(26);
        }
        this.newStringsuper();
        this.if(rc2);
    }

    private void if(rc rc2) {
        if (hb.super(rc2)) {
            return;
        }
        this.whileStringObject.add(rc2);
    }

    @Override
    protected void \u00f400000(rc rc2) {
        if (rc2 == null) {
            m.O\u00d40000(27);
        }
        if (this.O\u00f5\u00d5000 == null) {
            return;
        }
        this.O\u00f5\u00d5000.\u00f800000(rc2);
    }

    @Override
    protected List \u00f8\u00d5o000() {
        this.\u00d3\u00d6o000();
        List list = this.whileStringObject;
        if (list == null) {
            m.O\u00d40000(28);
        }
        return list;
    }

    private static /* synthetic */ void O\u00d40000(int n2) {
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
            case 5: 
            case 28: {
                string = "@NotNull method %s.%s must not return null";
            }
        }
        switch (n2) {
            default: {
                n3 = 3;
                break;
            }
            case 5: 
            case 28: {
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
            case 1: 
            case 7: 
            case 13: 
            case 20: {
                objectArray2 = objectArray3;
                objectArray3[0] = "annotations";
                break;
            }
            case 2: 
            case 8: 
            case 14: 
            case 21: {
                objectArray2 = objectArray3;
                objectArray3[0] = "variance";
                break;
            }
            case 3: 
            case 9: 
            case 15: 
            case 22: {
                objectArray2 = objectArray3;
                objectArray3[0] = "name";
                break;
            }
            case 4: 
            case 11: 
            case 18: 
            case 25: {
                objectArray2 = objectArray3;
                objectArray3[0] = "storageManager";
                break;
            }
            case 5: 
            case 28: {
                objectArray2 = objectArray3;
                objectArray3[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/TypeParameterDescriptorImpl";
                break;
            }
            case 10: 
            case 16: 
            case 23: {
                objectArray2 = objectArray3;
                objectArray3[0] = "source";
                break;
            }
            case 17: {
                objectArray2 = objectArray3;
                objectArray3[0] = "supertypeLoopsResolver";
                break;
            }
            case 24: {
                objectArray2 = objectArray3;
                objectArray3[0] = "supertypeLoopsChecker";
                break;
            }
            case 26: {
                objectArray2 = objectArray3;
                objectArray3[0] = "bound";
                break;
            }
            case 27: {
                objectArray2 = objectArray3;
                objectArray3[0] = "type";
            }
        }
        switch (n2) {
            default: {
                objectArray = objectArray2;
                objectArray2[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/TypeParameterDescriptorImpl";
                break;
            }
            case 5: {
                objectArray = objectArray2;
                objectArray2[1] = "createWithDefaultBound";
                break;
            }
            case 28: {
                objectArray = objectArray2;
                objectArray2[1] = "resolveUpperBounds";
            }
        }
        switch (n2) {
            default: {
                objectArray = objectArray;
                objectArray[2] = "createWithDefaultBound";
                break;
            }
            case 5: 
            case 28: {
                break;
            }
            case 6: 
            case 7: 
            case 8: 
            case 9: 
            case 10: 
            case 11: 
            case 12: 
            case 13: 
            case 14: 
            case 15: 
            case 16: 
            case 17: 
            case 18: {
                objectArray = objectArray;
                objectArray[2] = "createForFurtherModification";
                break;
            }
            case 19: 
            case 20: 
            case 21: 
            case 22: 
            case 23: 
            case 24: 
            case 25: {
                objectArray = objectArray;
                objectArray[2] = "<init>";
                break;
            }
            case 26: {
                objectArray = objectArray;
                objectArray[2] = "addUpperBound";
                break;
            }
            case 27: {
                objectArray = objectArray;
                objectArray[2] = "reportSupertypeLoopError";
            }
        }
        String string2 = String.format(string, objectArray);
        switch (n2) {
            default: {
                runtimeException = new IllegalArgumentException(string2);
                break;
            }
            case 5: 
            case 28: {
                runtimeException = new IllegalStateException(string2);
            }
        }
        throw runtimeException;
    }
}

