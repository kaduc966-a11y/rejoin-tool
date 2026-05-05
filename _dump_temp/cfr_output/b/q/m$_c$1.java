/*
 * Decompiled with CFR 0.152.
 */
package b.q;

import b.s.ec;

public final class m$_c$1
extends ec {
    private int \u00d30\u00f6000;
    final /* synthetic */ CharSequence nullclassclass;

    m$_c$1(CharSequence charSequence) {
        this.nullclassclass = charSequence;
    }

    @Override
    public final char o\u00d6\u00d3000() {
        int n2 = this.\u00d30\u00f6000;
        this.\u00d30\u00f6000 = n2 + 1;
        return this.nullclassclass.charAt(n2);
    }

    @Override
    public final boolean hasNext() {
        return this.\u00d30\u00f6000 < this.nullclassclass.length();
    }
}

