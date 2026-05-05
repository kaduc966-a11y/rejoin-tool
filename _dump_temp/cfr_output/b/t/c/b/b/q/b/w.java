/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.q.b;

import b.t.c.b.b.h.h;
import b.t.c.b.b.h.kc;
import b.t.c.b.b.i.l;
import b.t.c.b.b.o.e.e;
import b.t.c.b.b.o.e.f;
import b.t.c.b.b.o.f.b;
import b.t.c.b.b.o.n;
import b.t.c.b.b.q.b.g;
import b.t.c.b.b.q.b.lb;
import b.t.c.b.b.q.b.w$1;
import b.t.c.b.b.q.b.w$2;
import b.t.c.b.b.q.b.w$3;
import b.t.c.b.b.q.ib;
import b.t.c.b.b.q.mc;
import b.t.c.b.b.q.qc;
import java.util.Collections;
import java.util.List;

public abstract class w
extends lb {
    private final b.t.c.b.b.d.f \u00d8\u00f4\u00d6000;
    protected final b.t.c.b.b.i.f \u00f5\u00f4\u00d6000;
    private final b.t.c.b.b.i.f thisdoObject;
    private final b.t.c.b.b.i.f \u00d5\u00f4\u00d6000;

    public w(l l2, b.t.c.b.b.d.f f2) {
        if (l2 == null) {
            w.\u00d8\u00d50000(0);
        }
        if (f2 == null) {
            w.\u00d8\u00d50000(1);
        }
        this.\u00d8\u00f4\u00d6000 = f2;
        this.\u00f5\u00f4\u00d6000 = l2.o00000(new w$1(this));
        this.thisdoObject = l2.o00000(new w$2(this));
        this.\u00d5\u00f4\u00d6000 = l2.o00000(new w$3(this));
    }

    @Override
    public b.t.c.b.b.d.f \u00d5\u00f80000() {
        b.t.c.b.b.d.f f2 = this.\u00d8\u00f4\u00d6000;
        if (f2 == null) {
            w.\u00d8\u00d50000(2);
        }
        return f2;
    }

    @Override
    public ib \u00f4o\u00d2000() {
        return this;
    }

    @Override
    public f \u00d3o\u00d2000() {
        f f2 = (f)this.thisdoObject.newreturn();
        if (f2 == null) {
            w.\u00d8\u00d50000(4);
        }
        return f2;
    }

    @Override
    public mc \u00f5o\u00d2000() {
        mc mc2 = (mc)this.\u00d5\u00f4\u00d6000.newreturn();
        if (mc2 == null) {
            w.\u00d8\u00d50000(5);
        }
        return mc2;
    }

    @Override
    public List \u00d4o\u00d2000() {
        List list = Collections.emptyList();
        if (list == null) {
            w.\u00d8\u00d50000(6);
        }
        return list;
    }

    @Override
    public f o00000(h object, b.t.c.b.b.h.e.b b2) {
        if (object == null) {
            w.\u00d8\u00d50000(10);
        }
        if (b2 == null) {
            w.\u00d8\u00d50000(11);
        }
        if (((h)object).o00000()) {
            f f2 = this.\u00f400000(b2);
            if (f2 == null) {
                w.\u00d8\u00d50000(12);
            }
            return f2;
        }
        object = kc.o00000((h)object);
        return new e(this.\u00f400000(b2), (kc)object);
    }

    @Override
    public f o00000(h h2) {
        if (h2 == null) {
            w.\u00d8\u00d50000(15);
        }
        f f2 = this.o00000(h2, b.\u00d200000(n.\u00f800000(this)));
        if (f2 == null) {
            w.\u00d8\u00d50000(16);
        }
        return f2;
    }

    @Override
    public f o\u00d2\u00d2000() {
        w w2 = this;
        f f2 = w2.\u00f400000(b.\u00d200000(n.\u00f800000(w2)));
        if (f2 == null) {
            w.\u00d8\u00d50000(17);
        }
        return f2;
    }

    public ib oO0000(kc kc2) {
        if (kc2 == null) {
            w.\u00d8\u00d50000(18);
        }
        if (kc2.o00000()) {
            return this;
        }
        return new g(this, kc2);
    }

    @Override
    public b.t.c.b.b.h.ib nullint() {
        b.t.c.b.b.h.ib ib2 = (b.t.c.b.b.h.ib)this.\u00f5\u00f4\u00d6000.newreturn();
        if (ib2 == null) {
            w.\u00d8\u00d50000(20);
        }
        return ib2;
    }

    @Override
    public Object o00000(qc qc2, Object object) {
        return qc2.super(this, object);
    }

    private static /* synthetic */ void \u00d8\u00d50000(int n2) {
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
            case 2: 
            case 3: 
            case 4: 
            case 5: 
            case 6: 
            case 9: 
            case 12: 
            case 14: 
            case 16: 
            case 17: 
            case 19: 
            case 20: {
                string = "@NotNull method %s.%s must not return null";
            }
        }
        switch (n2) {
            default: {
                n3 = 3;
                break;
            }
            case 2: 
            case 3: 
            case 4: 
            case 5: 
            case 6: 
            case 9: 
            case 12: 
            case 14: 
            case 16: 
            case 17: 
            case 19: 
            case 20: {
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
                objectArray3[0] = "name";
                break;
            }
            case 2: 
            case 3: 
            case 4: 
            case 5: 
            case 6: 
            case 9: 
            case 12: 
            case 14: 
            case 16: 
            case 17: 
            case 19: 
            case 20: {
                objectArray2 = objectArray3;
                objectArray3[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
                break;
            }
            case 7: 
            case 13: {
                objectArray2 = objectArray3;
                objectArray3[0] = "typeArguments";
                break;
            }
            case 8: 
            case 11: {
                objectArray2 = objectArray3;
                objectArray3[0] = "kotlinTypeRefiner";
                break;
            }
            case 10: 
            case 15: {
                objectArray2 = objectArray3;
                objectArray3[0] = "typeSubstitution";
                break;
            }
            case 18: {
                objectArray2 = objectArray3;
                objectArray3[0] = "substitutor";
            }
        }
        switch (n2) {
            default: {
                objectArray = objectArray2;
                objectArray2[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
                break;
            }
            case 2: {
                objectArray = objectArray2;
                objectArray2[1] = "getName";
                break;
            }
            case 3: {
                objectArray = objectArray2;
                objectArray2[1] = "getOriginal";
                break;
            }
            case 4: {
                objectArray = objectArray2;
                objectArray2[1] = "getUnsubstitutedInnerClassesScope";
                break;
            }
            case 5: {
                objectArray = objectArray2;
                objectArray2[1] = "getThisAsReceiverParameter";
                break;
            }
            case 6: {
                objectArray = objectArray2;
                objectArray2[1] = "getContextReceivers";
                break;
            }
            case 9: 
            case 12: 
            case 14: 
            case 16: {
                objectArray = objectArray2;
                objectArray2[1] = "getMemberScope";
                break;
            }
            case 17: {
                objectArray = objectArray2;
                objectArray2[1] = "getUnsubstitutedMemberScope";
                break;
            }
            case 19: {
                objectArray = objectArray2;
                objectArray2[1] = "substitute";
                break;
            }
            case 20: {
                objectArray = objectArray2;
                objectArray2[1] = "getDefaultType";
            }
        }
        switch (n2) {
            default: {
                objectArray = objectArray;
                objectArray[2] = "<init>";
                break;
            }
            case 2: 
            case 3: 
            case 4: 
            case 5: 
            case 6: 
            case 9: 
            case 12: 
            case 14: 
            case 16: 
            case 17: 
            case 19: 
            case 20: {
                break;
            }
            case 7: 
            case 8: 
            case 10: 
            case 11: 
            case 13: 
            case 15: {
                objectArray = objectArray;
                objectArray[2] = "getMemberScope";
                break;
            }
            case 18: {
                objectArray = objectArray;
                objectArray[2] = "substitute";
            }
        }
        String string2 = String.format(string, objectArray);
        switch (n2) {
            default: {
                runtimeException = new IllegalArgumentException(string2);
                break;
            }
            case 2: 
            case 3: 
            case 4: 
            case 5: 
            case 6: 
            case 9: 
            case 12: 
            case 14: 
            case 16: 
            case 17: 
            case 19: 
            case 20: {
                runtimeException = new IllegalStateException(string2);
            }
        }
        throw runtimeException;
    }
}

