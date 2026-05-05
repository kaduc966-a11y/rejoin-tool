/*
 * Decompiled with CFR 0.152.
 */
package b.q;

import b.o.e.g;
import b.q.f;
import b.s.ab;
import java.util.Iterator;

public final class d$_c$1
implements ab {
    final /* synthetic */ CharSequence \u00d200000;
    final /* synthetic */ g o00000;

    public d$_c$1(CharSequence charSequence, g g2) {
        this.\u00d200000 = charSequence;
        this.o00000 = g2;
    }

    @Override
    public final Iterator o00000() {
        return f.class(this.\u00d200000);
    }

    public final Object o00000(char c2) {
        return this.o00000.\u00f800000(Character.valueOf(c2));
    }

    @Override
    public final /* synthetic */ Object o00000(Object object) {
        return this.o00000(((Character)object).charValue());
    }
}

