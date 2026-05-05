/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.d;

import b.s.mc;
import b.t.c.b.d.b;
import b.xc;
import java.lang.reflect.Type;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class c
implements b {
    public static final c o00000 = new c();

    private c() {
    }

    public final Void \u00d500000() {
        return null;
    }

    @Override
    public final List \u00d200000() {
        return mc.\u00d500000();
    }

    @Override
    public final Type \u00d400000() {
        this.\u00d600000();
        throw new xc();
    }

    @Override
    public final Object o00000(Object[] objectArray) {
        this.\u00d600000();
        throw new xc();
    }

    private final Void \u00d600000() {
        throw new UnsupportedOperationException("call/callBy are not supported for this declaration.");
    }

    @Override
    public final boolean o00000() {
        return this.void();
    }

    public final boolean void() {
        return false;
    }
}

