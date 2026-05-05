/*
 * Decompiled with CFR 0.152.
 */
package b.s;

import b.s.f;
import b.s.tc;
import b.s.tc$_c$1$_b$1;
import java.util.Iterator;

public final class tc$_c$1
extends f {
    final /* synthetic */ tc \u00d300000;

    tc$_c$1(tc tc2) {
        this.\u00d300000 = tc2;
    }

    @Override
    public final boolean contains(Object object) {
        return this.\u00d300000.containsKey(object);
    }

    @Override
    public final Iterator iterator() {
        Iterator iterator = this.\u00d300000.entrySet().iterator();
        return new tc$_c$1$_b$1(iterator);
    }

    @Override
    public final int o00000() {
        return this.\u00d300000.size();
    }
}

