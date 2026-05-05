/*
 * Decompiled with CFR 0.152.
 */
package b.m.b;

import b.b.f;
import b.e.m;
import b.i.e;
import b.m.b.b$_b;
import b.m.b.b$_c$1;
import b.m.b.b$_c$2;
import b.q.t;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class b
extends b.m.c.b {
    private final boolean new(int n2) {
        return b$_b.o00000 == null || b$_b.o00000 >= n2;
    }

    @Override
    public t o00000(MatchResult matchResult, String string) {
        Matcher matcher = matchResult instanceof Matcher ? (Matcher)matchResult : null;
        if (matcher == null) {
            throw new UnsupportedOperationException("Retrieving groups by name is not supported on this platform.");
        }
        matchResult = matcher;
        m m2 = new m(((Matcher)matchResult).start(string), ((Matcher)matchResult).end(string) - 1);
        if (m2.\u00d5o0000() >= 0) {
            return new t(((Matcher)matchResult).group(string), m2);
        }
        return null;
    }

    @Override
    public f o00000() {
        if (this.new(34)) {
            return new b.b.b.b();
        }
        return super.o00000();
    }

    @Override
    public e new() {
        if (this.new(26)) {
            return new b$_c$1();
        }
        return new b$_c$2();
    }
}

