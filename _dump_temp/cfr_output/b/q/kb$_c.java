/*
 * Decompiled with CFR 0.152.
 */
package b.q;

import b.q.kb;
import b.q.kb$_c$_b;
import java.io.Serializable;
import java.util.regex.Pattern;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
final class kb$_c
implements Serializable {
    public static final kb$_c$_b \u00d400000 = new kb$_c$_b(null);
    private final String \u00d200000;
    private final int super;
    private static final long \u00d300000 = 0L;

    public kb$_c(String string, int n2) {
        this.\u00d200000 = string;
        this.super = n2;
    }

    public final String \u00d300000() {
        return this.\u00d200000;
    }

    public final int new() {
        return this.super;
    }

    private final Object o00000() {
        return new kb(Pattern.compile(this.\u00d200000, this.super));
    }
}

