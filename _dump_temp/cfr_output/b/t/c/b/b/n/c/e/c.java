/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.n.c.e;

import b.qb;
import b.t.c.b.b.d.f;
import b.t.c.b.b.h.rc;
import b.t.c.b.b.n.c.e.d;
import b.t.c.b.b.n.c.e.i;
import b.t.c.b.b.q.b$_b;
import b.t.c.b.b.q.b.mb;
import b.t.c.b.b.q.e.o;
import b.t.c.b.b.q.g;
import b.t.c.b.b.q.hc$_b;
import b.t.c.b.b.q.ib;
import b.t.c.b.b.q.ic;
import b.t.c.b.b.q.mc;
import b.t.c.b.b.q.wb;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class c
extends mb
implements d {
    private Boolean \u00d4\u00d5\u00d6000;
    private Boolean \u00d3\u00d5\u00d6000;

    protected c(ib ib2, c c2, o o2, boolean bl, hc$_b hc$_b, g g2) {
        if (ib2 == null) {
            c.o\u00d50000(0);
        }
        if (o2 == null) {
            c.o\u00d50000(1);
        }
        if (hc$_b == null) {
            c.o\u00d50000(2);
        }
        if (g2 == null) {
            c.o\u00d50000(3);
        }
        super(ib2, c2, o2, bl, hc$_b, g2);
        this.\u00d4\u00d5\u00d6000 = null;
        this.\u00d3\u00d5\u00d6000 = null;
    }

    public static c new(ib ib2, o o2, boolean bl, g g2) {
        if (ib2 == null) {
            c.o\u00d50000(4);
        }
        if (o2 == null) {
            c.o\u00d50000(5);
        }
        if (g2 == null) {
            c.o\u00d50000(6);
        }
        return new c(ib2, null, o2, bl, hc$_b.\u00d400000, g2);
    }

    @Override
    public boolean thisvoidsuper() {
        assert (this.\u00d4\u00d5\u00d6000 != null) : "hasStableParameterNames was not set: ".concat(String.valueOf(this));
        return this.\u00d4\u00d5\u00d6000;
    }

    @Override
    public void thissuper(boolean bl) {
        this.\u00d4\u00d5\u00d6000 = bl;
    }

    @Override
    public boolean o\u00f4o000() {
        assert (this.\u00d3\u00d5\u00d6000 != null) : "hasSynthesizedParameterNames was not set: ".concat(String.valueOf(this));
        return this.\u00d3\u00d5\u00d6000;
    }

    @Override
    public void \u00d5O0000(boolean bl) {
        this.\u00d3\u00d5\u00d6000 = bl;
    }

    protected c \u00d500000(wb wb2, ic ic2, hc$_b hc$_b, f f2, o o2, g g2) {
        if (wb2 == null) {
            c.o\u00d50000(7);
        }
        if (hc$_b == null) {
            c.o\u00d50000(8);
        }
        if (o2 == null) {
            c.o\u00d50000(9);
        }
        if (g2 == null) {
            c.o\u00d50000(10);
        }
        if (hc$_b != hc$_b.\u00d400000 && hc$_b != hc$_b.\u00d200000) {
            throw new IllegalStateException("Attempt at creating a constructor that is not a declaration: \ncopy from: " + this + "\nnewOwner: " + wb2 + "\nkind: " + (Object)((Object)hc$_b));
        }
        assert (f2 == null) : "Attempt to rename constructor: ".concat(String.valueOf(this));
        wb2 = this.o00000((ib)wb2, (c)ic2, hc$_b, g2, o2);
        ((b.t.c.b.b.q.b.i)wb2).thissuper(((b.t.c.b.b.q.b.i)this).thisvoidsuper());
        ((b.t.c.b.b.q.b.i)wb2).\u00d5O0000(((b.t.c.b.b.q.b.i)this).o\u00f4o000());
        wb wb3 = wb2;
        if (wb3 == null) {
            c.o\u00d50000(11);
        }
        return wb3;
    }

    protected c o00000(ib ib2, c c2, hc$_b hc$_b, g g2, o o2) {
        if (ib2 == null) {
            c.o\u00d50000(12);
        }
        if (hc$_b == null) {
            c.o\u00d50000(13);
        }
        if (g2 == null) {
            c.o\u00d50000(14);
        }
        if (o2 == null) {
            c.o\u00d50000(15);
        }
        return new c(ib2, c2, o2, this.oo\u00d6000, hc$_b, g2);
    }

    public c \u00d300000(rc rc2, List list, rc rc3, qb qb2) {
        if (list == null) {
            c.o\u00d50000(16);
        }
        if (rc3 == null) {
            c.o\u00d50000(17);
        }
        c c2 = this;
        c c3 = c2.\u00d500000(c2.o\u00f8o000(), null, this.O\u00f5o000(), null, this.\u00d4\u00f80000(), this.\u00f4\u00f80000());
        rc2 = rc2 == null ? null : b.t.c.b.b.o.d.o00000(c3, rc2, o.\u00d8o\u00f6000.o00000());
        c3.o00000((mc)((Object)rc2), this.Stringclasssuper(), b.s.mc.\u00d500000(), this.\u00f8\u00d8o000(), i.super(list, this.\u00f5\u00d8o000(), c3), rc3, this.\u00f40O000(), this.\u00d50O000());
        if (qb2 != null) {
            c3.o00000((b$_b)qb2.new(), qb2.o00000());
        }
        c c4 = c3;
        if (c4 == null) {
            c.o\u00d50000(18);
        }
        return c4;
    }

    private static /* synthetic */ void o\u00d50000(int n2) {
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
            case 11: 
            case 18: {
                string = "@NotNull method %s.%s must not return null";
            }
        }
        switch (n2) {
            default: {
                n3 = 3;
                break;
            }
            case 11: 
            case 18: {
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
            case 5: 
            case 9: 
            case 15: {
                objectArray2 = objectArray3;
                objectArray3[0] = "annotations";
                break;
            }
            case 2: 
            case 8: 
            case 13: {
                objectArray2 = objectArray3;
                objectArray3[0] = "kind";
                break;
            }
            case 3: 
            case 6: 
            case 10: {
                objectArray2 = objectArray3;
                objectArray3[0] = "source";
                break;
            }
            case 7: 
            case 12: {
                objectArray2 = objectArray3;
                objectArray3[0] = "newOwner";
                break;
            }
            case 11: 
            case 18: {
                objectArray2 = objectArray3;
                objectArray3[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaClassConstructorDescriptor";
                break;
            }
            case 14: {
                objectArray2 = objectArray3;
                objectArray3[0] = "sourceElement";
                break;
            }
            case 16: {
                objectArray2 = objectArray3;
                objectArray3[0] = "enhancedValueParameterTypes";
                break;
            }
            case 17: {
                objectArray2 = objectArray3;
                objectArray3[0] = "enhancedReturnType";
            }
        }
        switch (n2) {
            default: {
                objectArray = objectArray2;
                objectArray2[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaClassConstructorDescriptor";
                break;
            }
            case 11: {
                objectArray = objectArray2;
                objectArray2[1] = "createSubstitutedCopy";
                break;
            }
            case 18: {
                objectArray = objectArray2;
                objectArray2[1] = "enhance";
            }
        }
        switch (n2) {
            default: {
                objectArray = objectArray;
                objectArray[2] = "<init>";
                break;
            }
            case 4: 
            case 5: 
            case 6: {
                objectArray = objectArray;
                objectArray[2] = "createJavaConstructor";
                break;
            }
            case 7: 
            case 8: 
            case 9: 
            case 10: {
                objectArray = objectArray;
                objectArray[2] = "createSubstitutedCopy";
                break;
            }
            case 11: 
            case 18: {
                break;
            }
            case 12: 
            case 13: 
            case 14: 
            case 15: {
                objectArray = objectArray;
                objectArray[2] = "createDescriptor";
                break;
            }
            case 16: 
            case 17: {
                objectArray = objectArray;
                objectArray[2] = "enhance";
            }
        }
        String string2 = String.format(string, objectArray);
        switch (n2) {
            default: {
                runtimeException = new IllegalArgumentException(string2);
                break;
            }
            case 11: 
            case 18: {
                runtimeException = new IllegalStateException(string2);
            }
        }
        throw runtimeException;
    }
}

