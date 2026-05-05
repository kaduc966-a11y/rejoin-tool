/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.q.b;

import b.t.c.b.b.d.f;
import b.t.c.b.b.h.bc;
import b.t.c.b.b.h.ib;
import b.t.c.b.b.h.rc;
import b.t.c.b.b.h.w;
import b.t.c.b.b.i.l;
import b.t.c.b.b.q.b.gb$1;
import b.t.c.b.b.q.b.gb$2;
import b.t.c.b.b.q.b.gb$_b;
import b.t.c.b.b.q.b.kb;
import b.t.c.b.b.q.e.o;
import b.t.c.b.b.q.g;
import b.t.c.b.b.q.i;
import b.t.c.b.b.q.qc;
import b.t.c.b.b.q.r;
import b.t.c.b.b.q.wb;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public abstract class gb
extends kb
implements i {
    private final w \u00d8\u00f4\u00d5000;
    private final boolean \u00f5\u00f4\u00d5000;
    private final int returnStringObject;
    private final b.t.c.b.b.i.f \u00f8\u00f4\u00d5000;
    private final b.t.c.b.b.i.f ifStringObject;
    private final l \u00f4\u00f4\u00d5000;

    protected gb(l l2, wb wb2, o o2, f f2, w w2, boolean bl, int n2, g g2, r r2) {
        if (l2 == null) {
            gb.\u00f8\u00d30000(0);
        }
        if (wb2 == null) {
            gb.\u00f8\u00d30000(1);
        }
        if (o2 == null) {
            gb.\u00f8\u00d30000(2);
        }
        if (f2 == null) {
            gb.\u00f8\u00d30000(3);
        }
        if (w2 == null) {
            gb.\u00f8\u00d30000(4);
        }
        if (g2 == null) {
            gb.\u00f8\u00d30000(5);
        }
        if (r2 == null) {
            gb.\u00f8\u00d30000(6);
        }
        super(wb2, o2, f2, g2);
        this.\u00d8\u00f4\u00d5000 = w2;
        this.\u00f5\u00f4\u00d5000 = bl;
        this.returnStringObject = n2;
        this.\u00f8\u00f4\u00d5000 = l2.o00000(new gb$1(this, l2, r2));
        this.ifStringObject = l2.o00000(new gb$2(this, f2));
        this.\u00f4\u00f4\u00d5000 = l2;
    }

    protected abstract void \u00f400000(rc var1);

    protected abstract List \u00f8\u00d5o000();

    @Override
    public w \u00d4\u00d5o000() {
        w w2 = this.\u00d8\u00f4\u00d5000;
        if (w2 == null) {
            gb.\u00f8\u00d30000(7);
        }
        return w2;
    }

    @Override
    public boolean \u00f4\u00d5o000() {
        return this.\u00f5\u00f4\u00d5000;
    }

    @Override
    public int privateObjectsuper() {
        return this.returnStringObject;
    }

    @Override
    public boolean \u00d5\u00d5o000() {
        return false;
    }

    @Override
    public List \u00d8\u00d5o000() {
        List list = ((gb$_b)this.\u00d3OO000()).\u00d3oO000();
        if (list == null) {
            gb.\u00f8\u00d30000(8);
        }
        return list;
    }

    @Override
    public final bc \u00d3OO000() {
        bc bc2 = (bc)this.\u00f8\u00f4\u00d5000.newreturn();
        if (bc2 == null) {
            gb.\u00f8\u00d30000(9);
        }
        return bc2;
    }

    @Override
    public ib nullint() {
        ib ib2 = (ib)this.ifStringObject.newreturn();
        if (ib2 == null) {
            gb.\u00f8\u00d30000(10);
        }
        return ib2;
    }

    @Override
    public i forObjectsuper() {
        i i2 = (i)super.oOO000();
        if (i2 == null) {
            gb.\u00f8\u00d30000(11);
        }
        return i2;
    }

    protected List if(List list) {
        if (list == null) {
            gb.\u00f8\u00d30000(12);
        }
        List list2 = list;
        if (list2 == null) {
            gb.\u00f8\u00d30000(13);
        }
        return list2;
    }

    @Override
    public Object o00000(qc qc2, Object object) {
        return qc2.super(this, object);
    }

    @Override
    public l \u00f5\u00d5o000() {
        l l2 = this.\u00f4\u00f4\u00d5000;
        if (l2 == null) {
            gb.\u00f8\u00d30000(14);
        }
        return l2;
    }

    private static /* synthetic */ void \u00f8\u00d30000(int n2) {
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
            case 7: 
            case 8: 
            case 9: 
            case 10: 
            case 11: 
            case 13: 
            case 14: {
                string = "@NotNull method %s.%s must not return null";
            }
        }
        switch (n2) {
            default: {
                n3 = 3;
                break;
            }
            case 7: 
            case 8: 
            case 9: 
            case 10: 
            case 11: 
            case 13: 
            case 14: {
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
            case 1: {
                objectArray2 = objectArray3;
                objectArray3[0] = "containingDeclaration";
                break;
            }
            case 2: {
                objectArray2 = objectArray3;
                objectArray3[0] = "annotations";
                break;
            }
            case 3: {
                objectArray2 = objectArray3;
                objectArray3[0] = "name";
                break;
            }
            case 4: {
                objectArray2 = objectArray3;
                objectArray3[0] = "variance";
                break;
            }
            case 5: {
                objectArray2 = objectArray3;
                objectArray3[0] = "source";
                break;
            }
            case 6: {
                objectArray2 = objectArray3;
                objectArray3[0] = "supertypeLoopChecker";
                break;
            }
            case 7: 
            case 8: 
            case 9: 
            case 10: 
            case 11: 
            case 13: 
            case 14: {
                objectArray2 = objectArray3;
                objectArray3[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
                break;
            }
            case 12: {
                objectArray2 = objectArray3;
                objectArray3[0] = "bounds";
            }
        }
        switch (n2) {
            default: {
                objectArray = objectArray2;
                objectArray2[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
                break;
            }
            case 7: {
                objectArray = objectArray2;
                objectArray2[1] = "getVariance";
                break;
            }
            case 8: {
                objectArray = objectArray2;
                objectArray2[1] = "getUpperBounds";
                break;
            }
            case 9: {
                objectArray = objectArray2;
                objectArray2[1] = "getTypeConstructor";
                break;
            }
            case 10: {
                objectArray = objectArray2;
                objectArray2[1] = "getDefaultType";
                break;
            }
            case 11: {
                objectArray = objectArray2;
                objectArray2[1] = "getOriginal";
                break;
            }
            case 13: {
                objectArray = objectArray2;
                objectArray2[1] = "processBoundsWithoutCycles";
                break;
            }
            case 14: {
                objectArray = objectArray2;
                objectArray2[1] = "getStorageManager";
            }
        }
        switch (n2) {
            default: {
                objectArray = objectArray;
                objectArray[2] = "<init>";
                break;
            }
            case 7: 
            case 8: 
            case 9: 
            case 10: 
            case 11: 
            case 13: 
            case 14: {
                break;
            }
            case 12: {
                objectArray = objectArray;
                objectArray[2] = "processBoundsWithoutCycles";
            }
        }
        String string2 = String.format(string, objectArray);
        switch (n2) {
            default: {
                runtimeException = new IllegalArgumentException(string2);
                break;
            }
            case 7: 
            case 8: 
            case 9: 
            case 10: 
            case 11: 
            case 13: 
            case 14: {
                runtimeException = new IllegalStateException(string2);
            }
        }
        throw runtimeException;
    }
}

