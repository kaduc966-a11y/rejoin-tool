/*
 * Decompiled with CFR 0.152.
 */
package b.g;

import b.o.e.g;
import b.s.k;
import java.util.HashSet;
import java.util.Iterator;

final class s
extends k {
    private final Iterator returnnewclass;
    private final g \u00d4\u00d8\u00f5000;
    private final HashSet \u00d5\u00d8\u00f5000;

    public s(Iterator iterator, g g2) {
        this.returnnewclass = iterator;
        this.\u00d4\u00d8\u00f5000 = g2;
        this.\u00d5\u00d8\u00f5000 = new HashSet();
    }

    @Override
    public final void \u00f5\u00d3\u00d3000() {
        while (this.returnnewclass.hasNext()) {
            Object e2 = this.returnnewclass.next();
            Object object = this.\u00d4\u00d8\u00f5000.\u00f800000(e2);
            if (!this.\u00d5\u00d8\u00f5000.add(object)) continue;
            this.\u00f5o0000(e2);
            return;
        }
        this.\u00f4\u00d3\u00d3000();
    }
}

