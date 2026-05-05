/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.o;

import b.t.c.b.b.o.n;
import b.t.c.b.b.q.b.mb;
import b.t.c.b.b.q.e.o;
import b.t.c.b.b.q.g;
import b.t.c.b.b.q.hc$_b;
import b.t.c.b.b.q.ib;
import java.util.Collections;

class d$_b
extends mb {
    public d$_b(ib ib2, g g2, boolean bl) {
        if (ib2 == null) {
            d$_b.newString(0);
        }
        if (g2 == null) {
            d$_b.newString(1);
        }
        super(ib2, null, o.\u00d8o\u00f6000.o00000(), true, hc$_b.\u00d400000, g2);
        this.o00000(Collections.emptyList(), n.super(ib2, bl));
    }

    private static /* synthetic */ void newString(int n2) {
        Object[] objectArray;
        Object[] objectArray2 = new Object[3];
        switch (n2) {
            default: {
                objectArray = objectArray2;
                objectArray2[0] = "containingClass";
                break;
            }
            case 1: {
                objectArray = objectArray2;
                objectArray2[0] = "source";
            }
        }
        objectArray[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory$DefaultClassConstructorDescriptor";
        objectArray[2] = "<init>";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objectArray));
    }
}

