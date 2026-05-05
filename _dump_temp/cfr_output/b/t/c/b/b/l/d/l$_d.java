/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.l.d;

import b.t.c.b.b.l.d.l$_b;
import b.t.c.b.b.p.t$_c;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
class l$_d
extends l$_b {
    private final t$_c[] \u00d300000;

    public l$_d(int n2, t$_c[] t$_cArray) {
        super(n2, l$_d.super(t$_cArray), null);
        this.\u00d300000 = t$_cArray;
    }

    private static int super(Object[] objectArray) {
        int n2;
        if (objectArray == null) {
            l$_d.class(0);
        }
        if ((n2 = objectArray.length - 1) == 0) {
            return 1;
        }
        for (int i2 = 31; i2 >= 0; --i2) {
            if ((n2 & 1 << i2) == 0) continue;
            return i2 + 1;
        }
        throw new IllegalStateException("Empty enum: " + objectArray.getClass());
    }

    public t$_c \u00d400000(int n2) {
        int n3 = (1 << this.o00000) - 1 << this.new;
        n2 = (n2 & n3) >> this.new;
        t$_c[] t$_cArray = this.\u00d300000;
        int n4 = this.\u00d300000.length;
        for (int i2 = 0; i2 < n4; ++i2) {
            t$_c t$_c = t$_cArray[i2];
            if (t$_c.super() != n2) continue;
            return t$_c;
        }
        return null;
    }

    public int super(t$_c t$_c) {
        return t$_c.super() << this.new;
    }

    private static /* synthetic */ void class(int n2) {
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "enumEntries", "kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags$EnumLiteFlagField", "bitWidth"));
    }
}

