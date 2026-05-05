/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.n.c.f;

import b.t.c.b.b.d.k;
import b.t.c.b.b.n.c.b.b;
import b.t.c.b.b.n.c.b.t;
import b.t.c.b.b.n.c.b.u;
import b.t.c.b.b.n.c.b.w;
import b.t.c.b.b.n.c.f.c;
import b.t.c.b.b.q.ib;
import b.t.c.b.b.q.pb;
import b.t.c.b.b.q.qb;
import b.t.c.b.b.q.vb;

final class c$1
implements c {
    c$1() {
    }

    @Override
    public final ib o00000(k k2) {
        if (k2 == null) {
            c$1.o00000(0);
        }
        return null;
    }

    @Override
    public final void o00000(w w2, qb qb2) {
        if (w2 == null) {
            c$1.o00000(1);
        }
        if (qb2 == null) {
            c$1.o00000(2);
        }
    }

    @Override
    public final void o00000(u u2, vb vb2) {
        if (u2 == null) {
            c$1.o00000(3);
        }
        if (vb2 == null) {
            c$1.o00000(4);
        }
    }

    @Override
    public final void o00000(t t2, pb pb2) {
        if (t2 == null) {
            c$1.o00000(5);
        }
        if (pb2 == null) {
            c$1.o00000(6);
        }
    }

    @Override
    public final void o00000(b b2, ib ib2) {
        if (b2 == null) {
            c$1.o00000(7);
        }
        if (ib2 == null) {
            c$1.o00000(8);
        }
    }

    private static /* synthetic */ void o00000(int n2) {
        Object[] objectArray;
        Object[] objectArray2;
        Object[] objectArray3 = new Object[3];
        switch (n2) {
            default: {
                objectArray2 = objectArray3;
                objectArray3[0] = "fqName";
                break;
            }
            case 1: {
                objectArray2 = objectArray3;
                objectArray3[0] = "member";
                break;
            }
            case 2: 
            case 4: 
            case 6: 
            case 8: {
                objectArray2 = objectArray3;
                objectArray3[0] = "descriptor";
                break;
            }
            case 3: {
                objectArray2 = objectArray3;
                objectArray3[0] = "element";
                break;
            }
            case 5: {
                objectArray2 = objectArray3;
                objectArray3[0] = "field";
                break;
            }
            case 7: {
                objectArray2 = objectArray3;
                objectArray3[0] = "javaClass";
            }
        }
        objectArray2[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/JavaResolverCache$1";
        switch (n2) {
            default: {
                objectArray = objectArray2;
                objectArray2[2] = "getClassResolvedFromSource";
                break;
            }
            case 1: 
            case 2: {
                objectArray = objectArray2;
                objectArray2[2] = "recordMethod";
                break;
            }
            case 3: 
            case 4: {
                objectArray = objectArray2;
                objectArray2[2] = "recordConstructor";
                break;
            }
            case 5: 
            case 6: {
                objectArray = objectArray2;
                objectArray2[2] = "recordField";
                break;
            }
            case 7: 
            case 8: {
                objectArray = objectArray2;
                objectArray2[2] = "recordClass";
            }
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objectArray));
    }
}

