/*
 * Decompiled with CFR 0.152.
 */
package b.g;

import b.g.c;
import b.g.n;
import b.s.mc;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public final class p$_b$1
implements n {
    final /* synthetic */ n Oo0000;
    final /* synthetic */ Comparator \u00f8O0000;

    p$_b$1(n n2, Comparator comparator) {
        this.Oo0000 = n2;
        this.\u00f8O0000 = comparator;
    }

    @Override
    public final Iterator o00000() {
        List list = c.whilesuper(this.Oo0000);
        mc.o00000(list, this.\u00f8O0000);
        return list.iterator();
    }
}

