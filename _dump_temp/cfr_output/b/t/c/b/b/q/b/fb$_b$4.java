/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.q.b;

import b.t.c.b.b.o.i;
import b.t.c.b.b.o.u;
import b.t.c.b.b.q.b.fb$_b;
import b.t.c.b.b.q.hc;
import java.util.Set;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
class fb$_b$4
extends u {
    final /* synthetic */ Set \u00d600000;
    final /* synthetic */ fb$_b void;

    fb$_b$4(fb$_b fb$_b, Set set) {
        this.void = fb$_b;
        this.\u00d600000 = set;
    }

    @Override
    public void super(hc hc2) {
        if (hc2 == null) {
            fb$_b$4.\u00d200000(0);
        }
        i.o00000(hc2, null);
        this.\u00d600000.add(hc2);
    }

    @Override
    public void \u00d300000(hc hc2, hc hc3) {
        if (hc2 == null) {
            fb$_b$4.\u00d200000(1);
        }
        if (hc3 == null) {
            fb$_b$4.\u00d200000(2);
        }
    }

    private static /* synthetic */ void \u00d200000(int n2) {
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
            }
        }
        objectArray2[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope$4";
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
            }
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objectArray));
    }
}

