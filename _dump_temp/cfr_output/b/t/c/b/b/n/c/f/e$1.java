/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.n.c.f;

import b.o.e.g;
import b.t.c.b.b.f.b.f;
import b.t.c.b.b.n.c.f.e$1$1;
import b.t.c.b.b.o.i;
import b.t.c.b.b.o.u;
import b.t.c.b.b.q.hc;
import b.t.c.b.b.q.hc$_b;
import java.util.Collection;
import java.util.Set;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
final class e$1
extends u {
    final /* synthetic */ f o00000;
    final /* synthetic */ Set \u00d200000;
    final /* synthetic */ boolean Object;

    e$1(f f2, Set set, boolean bl) {
        this.o00000 = f2;
        this.\u00d200000 = set;
        this.Object = bl;
    }

    @Override
    public final void super(hc hc2) {
        if (hc2 == null) {
            e$1.super(0);
        }
        i.o00000(hc2, (g)new e$1$1(this));
        this.\u00d200000.add(hc2);
    }

    @Override
    public final void \u00d300000(hc hc2, hc hc3) {
        if (hc2 == null) {
            e$1.super(1);
        }
        if (hc3 == null) {
            e$1.super(2);
        }
    }

    @Override
    public final void super(hc hc2, Collection collection) {
        if (hc2 == null) {
            e$1.super(3);
        }
        if (collection == null) {
            e$1.super(4);
        }
        if (this.Object && hc2.O\u00f5o000() != hc$_b.o00000) {
            return;
        }
        super.super(hc2, collection);
    }

    private static /* synthetic */ void super(int n2) {
        Object[] objectArray;
        Object[] objectArray2;
        Object[] objectArray3 = new Object[3];
        switch (n2) {
            default: {
                objectArray2 = objectArray3;
                objectArray3[0] = "fakeOverride";
                break;
            }
            case 1: {
                objectArray2 = objectArray3;
                objectArray3[0] = "fromSuper";
                break;
            }
            case 2: {
                objectArray2 = objectArray3;
                objectArray3[0] = "fromCurrent";
                break;
            }
            case 3: {
                objectArray2 = objectArray3;
                objectArray3[0] = "member";
                break;
            }
            case 4: {
                objectArray2 = objectArray3;
                objectArray3[0] = "overridden";
            }
        }
        objectArray2[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils$1";
        switch (n2) {
            default: {
                objectArray = objectArray2;
                objectArray2[2] = "addFakeOverride";
                break;
            }
            case 1: 
            case 2: {
                objectArray = objectArray2;
                objectArray2[2] = "conflict";
                break;
            }
            case 3: 
            case 4: {
                objectArray = objectArray2;
                objectArray2[2] = "setOverriddenDescriptors";
            }
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objectArray));
    }
}

