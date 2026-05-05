/*
 * Decompiled with CFR 0.152.
 */
package b;

import b.m;
import b.o.e.h;

class x {
    private static final void o00000(boolean bl) {
        if (m.new && !bl) {
            String string = "Assertion failed";
            throw new AssertionError((Object)string);
        }
    }

    private static final void o00000(boolean bl, h h2) {
        if (m.new && !bl) {
            Object object = h2.newreturn();
            throw new AssertionError(object);
        }
    }
}

