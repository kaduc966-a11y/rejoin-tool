/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.q.b;

import b.o.e.h;
import b.t.c.b.b.d.f;
import b.t.c.b.b.h.rc;
import b.t.c.b.b.i.c;
import b.t.c.b.b.o.c.j;
import b.t.c.b.b.q.b.ob;
import b.t.c.b.b.q.e.o;
import b.t.c.b.b.q.g;
import b.t.c.b.b.q.wb;

public abstract class hb
extends ob {
    private final boolean \u00f4\u00f6\u00d5000;
    protected c \u00d8\u00f6\u00d5000;
    protected h \u00f5\u00f6\u00d5000;

    public hb(wb wb2, o o2, f f2, rc rc2, boolean bl, g g2) {
        if (wb2 == null) {
            hb.\u00d3\u00d40000(0);
        }
        if (o2 == null) {
            hb.\u00d3\u00d40000(1);
        }
        if (f2 == null) {
            hb.\u00d3\u00d40000(2);
        }
        if (g2 == null) {
            hb.\u00d3\u00d40000(3);
        }
        super(wb2, o2, f2, rc2, g2);
        this.\u00f4\u00f6\u00d5000 = bl;
    }

    @Override
    public boolean \u00f4\u00f4o000() {
        return this.\u00f4\u00f6\u00d5000;
    }

    @Override
    public j privateclasssuper() {
        if (this.\u00d8\u00f6\u00d5000 != null) {
            return (j)this.\u00d8\u00f6\u00d5000.newreturn();
        }
        return null;
    }

    public void o00000(h h2) {
        if (h2 == null) {
            hb.\u00d3\u00d40000(4);
        }
        assert (!this.\u00f4\u00f4o000()) : "Constant value for variable initializer should be recorded only for final variables: " + this.\u00d5\u00f80000();
        this.o00000(null, h2);
    }

    public void o00000(c c2, h h2) {
        if (h2 == null) {
            hb.\u00d3\u00d40000(5);
        }
        assert (!this.\u00f4\u00f4o000()) : "Constant value for variable initializer should be recorded only for final variables: " + this.\u00d5\u00f80000();
        this.\u00f5\u00f6\u00d5000 = h2;
        this.\u00d8\u00f6\u00d5000 = c2 != null ? c2 : (c)h2.newreturn();
    }

    private static /* synthetic */ void \u00d3\u00d40000(int n2) {
        Object[] objectArray;
        Object[] objectArray2;
        Object[] objectArray3 = new Object[3];
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
            case 5: {
                objectArray2 = objectArray3;
                objectArray3[0] = "compileTimeInitializerFactory";
            }
        }
        objectArray2[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorWithInitializerImpl";
        switch (n2) {
            default: {
                objectArray = objectArray2;
                objectArray2[2] = "<init>";
                break;
            }
            case 4: {
                objectArray = objectArray2;
                objectArray2[2] = "setCompileTimeInitializerFactory";
                break;
            }
            case 5: {
                objectArray = objectArray2;
                objectArray2[2] = "setCompileTimeInitializer";
            }
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objectArray));
    }
}

