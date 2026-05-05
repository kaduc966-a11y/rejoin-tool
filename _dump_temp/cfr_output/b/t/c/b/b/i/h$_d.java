/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.i;

import b.t.c.b.b.i.h;
import b.t.c.b.b.i.h$_g;
import b.t.c.b.b.i.m;

abstract class h$_d
extends h$_g {
    private volatile m \u00f4\u00d8O000;

    public h$_d(h h2, b.o.e.h h3) {
        if (h2 == null) {
            h$_d.o\u00d20000(0);
        }
        if (h3 == null) {
            h$_d.o\u00d20000(1);
        }
        super(h2, h3);
        this.\u00f4\u00d8O000 = null;
    }

    @Override
    public Object newreturn() {
        m m2 = this.\u00f4\u00d8O000;
        if (m2 != null && m2.new()) {
            return m2.o00000();
        }
        return super.newreturn();
    }

    @Override
    protected final void \u00f400000(Object object) {
        this.\u00f4\u00d8O000 = new m(object);
        try {
            this.\u00f500000(object);
            return;
        }
        finally {
            this.\u00f4\u00d8O000 = null;
        }
    }

    protected abstract void \u00f500000(Object var1);

    private static /* synthetic */ void o\u00d20000(int n2) {
        Object[] objectArray;
        Object[] objectArray2 = new Object[3];
        switch (n2) {
            default: {
                objectArray = objectArray2;
                objectArray2[0] = "storageManager";
                break;
            }
            case 1: {
                objectArray = objectArray2;
                objectArray2[0] = "computable";
            }
        }
        objectArray[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValueWithPostCompute";
        objectArray[2] = "<init>";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objectArray));
    }
}

