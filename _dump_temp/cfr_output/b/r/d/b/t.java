/*
 * Decompiled with CFR 0.152.
 */
package b.r.d.b;

import b.r.b;
import b.r.d.b.o;
import b.r.i;
import b.r.l;

public abstract class t
extends o {
    public t(b object) {
        super((b)object);
        b b2 = object;
        if (b2 != null) {
            if (!(b2.O\u00d80000() == i.o00000)) {
                object = "Coroutines with restricted suspension must have EmptyCoroutineContext";
                throw new IllegalArgumentException(object.toString());
            }
            return;
        }
    }

    @Override
    public l O\u00d80000() {
        return i.o00000;
    }
}

