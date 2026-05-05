/*
 * Decompiled with CFR 0.152.
 */
package b.i;

import b.i.k;
import b.i.s;
import b.i.t;
import b.i.v;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class s$_b
implements s {
    private final String \u00d400000;
    private final CharSequence \u00d300000;

    public s$_b(String string, CharSequence charSequence) {
        this.\u00d400000 = string;
        this.\u00d300000 = charSequence;
    }

    public final String return() {
        return this.\u00d400000;
    }

    public final CharSequence \u00d500000() {
        return this.\u00d300000;
    }

    @Override
    public final v new() {
        throw new t(this.\u00d400000 + " when parsing an Instant from \"" + k.\u00d200000(this.\u00d300000, 64) + '\"');
    }

    @Override
    public final v o00000() {
        return null;
    }
}

