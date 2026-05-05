/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.i;

import b.o.e.g;
import b.t.c.b.b.i.h;
import b.t.c.b.b.i.h$_k;
import b.t.c.b.b.i.h$_l;

class h$5
extends h$_k {
    final /* synthetic */ g whilewhile;
    final /* synthetic */ g \u00d3\u00f4O000;
    final /* synthetic */ h o\u00f4O000;

    h$5(h h2, h h3, b.o.e.h h4, g g2, g g3) {
        this.o\u00f4O000 = h2;
        this.whilewhile = g2;
        this.\u00d3\u00f4O000 = g3;
        super(h3, h4);
    }

    @Override
    protected h$_l \u00d400000(boolean bl) {
        if (this.whilewhile == null) {
            h$_l h$_l = super.\u00d400000(bl);
            if (h$_l == null) {
                h$5.\u00d5\u00d20000(0);
            }
            return h$_l;
        }
        h$_l h$_l = h$_l.o00000(this.whilewhile.\u00f800000(bl));
        if (h$_l == null) {
            h$5.\u00d5\u00d20000(1);
        }
        return h$_l;
    }

    @Override
    protected void \u00f500000(Object object) {
        if (object == null) {
            h$5.\u00d5\u00d20000(2);
        }
        this.\u00d3\u00f4O000.\u00f800000(object);
    }

    private static /* synthetic */ void \u00d5\u00d20000(int n2) {
        RuntimeException runtimeException;
        Object[] objectArray;
        Object[] objectArray2;
        int n3;
        String string;
        switch (n2) {
            default: {
                string = "@NotNull method %s.%s must not return null";
                break;
            }
            case 2: {
                string = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            }
        }
        switch (n2) {
            default: {
                n3 = 2;
                break;
            }
            case 2: {
                n3 = 3;
            }
        }
        Object[] objectArray3 = new Object[n3];
        switch (n2) {
            default: {
                objectArray2 = objectArray3;
                objectArray3[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$5";
                break;
            }
            case 2: {
                objectArray2 = objectArray3;
                objectArray3[0] = "value";
            }
        }
        switch (n2) {
            default: {
                objectArray = objectArray2;
                objectArray2[1] = "recursionDetected";
                break;
            }
            case 2: {
                objectArray = objectArray2;
                objectArray2[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$5";
            }
        }
        switch (n2) {
            default: {
                break;
            }
            case 2: {
                objectArray = objectArray;
                objectArray[2] = "doPostCompute";
            }
        }
        String string2 = String.format(string, objectArray);
        switch (n2) {
            default: {
                runtimeException = new IllegalStateException(string2);
                break;
            }
            case 2: {
                runtimeException = new IllegalArgumentException(string2);
            }
        }
        throw runtimeException;
    }
}

