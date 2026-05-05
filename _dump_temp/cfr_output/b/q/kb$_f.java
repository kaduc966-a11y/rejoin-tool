/*
 * Decompiled with CFR 0.152.
 */
package b.q;

import b.o.d.w;
import b.q.g;
import b.q.kb;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class kb$_f {
    private kb$_f() {
    }

    public final kb \u00d300000(String string) {
        return new kb(string, g.Object);
    }

    public final String \u00d200000(String string) {
        return Pattern.quote(string);
    }

    public final String super(String string) {
        return Matcher.quoteReplacement(string);
    }

    private final int super(int n2) {
        if ((n2 & 2) != 0) {
            return n2 | 0x40;
        }
        return n2;
    }

    public static final /* synthetic */ int super(kb$_f kb$_f, int n2) {
        return kb$_f.super(n2);
    }

    public /* synthetic */ kb$_f(w w2) {
        this();
    }
}

