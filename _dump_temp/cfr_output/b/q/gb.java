/*
 * Decompiled with CFR 0.152.
 */
package b.q;

import b.g.n;
import b.o.e.f;
import b.q.gb$_b$1;
import java.util.Iterator;

final class gb
implements n {
    private final CharSequence \u00d3\u00d40000;
    private final int \u00d5\u00d40000;
    private final int nullObject;
    private final f \u00d4\u00d40000;

    public gb(CharSequence charSequence, int n2, int n3, f f2) {
        this.\u00d3\u00d40000 = charSequence;
        this.\u00d5\u00d40000 = n2;
        this.nullObject = n3;
        this.\u00d4\u00d40000 = f2;
    }

    @Override
    public final Iterator o00000() {
        return new gb$_b$1(this);
    }

    public static final /* synthetic */ int String(gb gb2) {
        return gb2.\u00d5\u00d40000;
    }

    public static final /* synthetic */ CharSequence \u00d300000(gb gb2) {
        return gb2.\u00d3\u00d40000;
    }

    public static final /* synthetic */ int \u00d200000(gb gb2) {
        return gb2.nullObject;
    }

    public static final /* synthetic */ f o00000(gb gb2) {
        return gb2.\u00d4\u00d40000;
    }
}

