/*
 * Decompiled with CFR 0.152.
 */
package b.s;

import b.s.tc;
import b.s.tc$_b$1$_b$1;
import b.s.vc;
import java.util.Iterator;

public final class tc$_b$1
extends vc {
    final /* synthetic */ tc \u00d400000;

    tc$_b$1(tc tc2) {
        this.\u00d400000 = tc2;
    }

    @Override
    public final boolean contains(Object object) {
        return this.\u00d400000.containsValue(object);
    }

    @Override
    public final Iterator iterator() {
        Iterator iterator = this.\u00d400000.entrySet().iterator();
        return new tc$_b$1$_b$1(iterator);
    }

    @Override
    public final int o00000() {
        return this.\u00d400000.size();
    }
}

