/*
 * Decompiled with CFR 0.152.
 */
package b.j;

import b.j.d;
import b.t.m;

final class g
implements d {
    private Object \u00d500000;

    @Override
    public final Object o00000(Object object, m m2) {
        Object object2 = this.\u00d500000;
        if (object2 == null) {
            throw new IllegalStateException("Property " + m2.\u00f5\u00d5O000() + " should be initialized before get.");
        }
        return object2;
    }

    @Override
    public final void o00000(Object object, m m2, Object object2) {
        this.\u00d500000 = object2;
    }

    public final String toString() {
        return "NotNullProperty(" + (this.\u00d500000 != null ? "value=" + this.\u00d500000 : "value not initialized yet") + ')';
    }
}

