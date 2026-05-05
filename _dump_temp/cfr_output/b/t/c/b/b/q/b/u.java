/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.q.b;

import b.t.c.b.b.d.f;
import b.t.c.b.b.h.w;
import b.t.c.b.b.i.l;
import b.t.c.b.b.q.b.gb;
import b.t.c.b.b.q.e.o;
import b.t.c.b.b.q.g;
import b.t.c.b.b.q.r;
import b.t.c.b.b.q.wb;

public abstract class u
extends gb {
    public u(l l2, wb wb2, o o2, f f2, w w2, boolean bl, int n2, g g2, r r2) {
        if (l2 == null) {
            u.o\u00d40000(0);
        }
        if (wb2 == null) {
            u.o\u00d40000(1);
        }
        if (o2 == null) {
            u.o\u00d40000(2);
        }
        if (f2 == null) {
            u.o\u00d40000(3);
        }
        if (w2 == null) {
            u.o\u00d40000(4);
        }
        if (g2 == null) {
            u.o\u00d40000(5);
        }
        if (r2 == null) {
            u.o\u00d40000(6);
        }
        super(l2, wb2, o2, f2, w2, bl, n2, g2, r2);
    }

    @Override
    public String toString() {
        return String.format("%s%s%s", this.\u00f4\u00d5o000() ? "reified " : "", this.\u00d4\u00d5o000() == w.\u00d400000 ? "" : (Object)((Object)this.\u00d4\u00d5o000()) + " ", this.\u00d5\u00f80000());
    }

    private static /* synthetic */ void o\u00d40000(int n2) {
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
                objectArray2[0] = "containingDeclaration";
                break;
            }
            case 2: {
                objectArray = objectArray2;
                objectArray2[0] = "annotations";
                break;
            }
            case 3: {
                objectArray = objectArray2;
                objectArray2[0] = "name";
                break;
            }
            case 4: {
                objectArray = objectArray2;
                objectArray2[0] = "variance";
                break;
            }
            case 5: {
                objectArray = objectArray2;
                objectArray2[0] = "source";
                break;
            }
            case 6: {
                objectArray = objectArray2;
                objectArray2[0] = "supertypeLoopChecker";
            }
        }
        objectArray[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractLazyTypeParameterDescriptor";
        objectArray[2] = "<init>";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objectArray));
    }
}

