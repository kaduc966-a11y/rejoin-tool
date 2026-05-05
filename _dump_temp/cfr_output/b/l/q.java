/*
 * Decompiled with CFR 0.152.
 */
package b.l;

import b.g.n;
import b.l.q$_b$1;
import java.io.BufferedReader;
import java.util.Iterator;

final class q
implements n {
    private final BufferedReader \u00d8\u00d30000;

    public q(BufferedReader bufferedReader) {
        this.\u00d8\u00d30000 = bufferedReader;
    }

    @Override
    public final Iterator o00000() {
        return new q$_b$1(this);
    }

    public static final /* synthetic */ BufferedReader o00000(q q2) {
        return q2.\u00d8\u00d30000;
    }
}

