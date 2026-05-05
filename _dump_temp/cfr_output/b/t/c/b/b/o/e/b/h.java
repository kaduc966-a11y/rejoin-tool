/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.o.e.b;

import b.t.c.b.b.h.rc;
import b.t.c.b.b.o.e.b.g;
import b.t.c.b.b.o.e.b.l;

public class h
extends g {
    public h(rc rc2) {
        if (rc2 == null) {
            h.\u00d200000(0);
        }
        this(rc2, null);
    }

    private h(rc rc2, l l2) {
        if (rc2 == null) {
            h.\u00d200000(1);
        }
        super(rc2, l2);
    }

    public String toString() {
        return "{Transient} : " + this.o00000();
    }

    private static /* synthetic */ void \u00d200000(int n2) {
        Object[] objectArray;
        Object[] objectArray2;
        Object[] objectArray3 = new Object[3];
        switch (n2) {
            default: {
                objectArray2 = objectArray3;
                objectArray3[0] = "type";
                break;
            }
            case 2: {
                objectArray2 = objectArray3;
                objectArray3[0] = "newType";
            }
        }
        objectArray2[1] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/TransientReceiver";
        switch (n2) {
            default: {
                objectArray = objectArray2;
                objectArray2[2] = "<init>";
                break;
            }
            case 2: {
                objectArray = objectArray2;
                objectArray2[2] = "replaceType";
            }
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objectArray));
    }
}

