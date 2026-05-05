/*
 * Decompiled with CFR 0.152.
 */
package b;

import b.dc;
import java.io.Serializable;

public final class b
implements Serializable,
dc {
    private final Object \u00f800000;

    public b(Object object) {
        this.\u00f800000 = object;
    }

    @Override
    public final Object \u00d200000() {
        return this.\u00f800000;
    }

    @Override
    public final boolean o00000() {
        return true;
    }

    public final String toString() {
        return String.valueOf(this.\u00d200000());
    }
}

