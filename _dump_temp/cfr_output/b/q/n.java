/*
 * Decompiled with CFR 0.152.
 */
package b.q;

import b.e.m;
import b.q.b;
import b.q.e;
import b.q.n$_b$1;
import b.q.n$_c$1;
import b.q.u;
import java.util.List;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
final class n
implements e {
    private final Matcher \u00d400000;
    private final CharSequence Object;
    private final u \u00d200000;
    private List o00000;

    public n(Matcher matcher, CharSequence charSequence) {
        this.\u00d400000 = matcher;
        this.Object = charSequence;
        this.\u00d200000 = new n$_b$1(this);
    }

    private final MatchResult \u00d800000() {
        return this.\u00d400000;
    }

    @Override
    public final m \u00d300000() {
        return b.\u00d200000(this.\u00d800000());
    }

    @Override
    public final String super() {
        return this.\u00d800000().group();
    }

    @Override
    public final u class() {
        return this.\u00d200000;
    }

    @Override
    public final List \u00d600000() {
        if (this.o00000 == null) {
            this.o00000 = new n$_c$1(this);
        }
        return this.o00000;
    }

    @Override
    public final e \u00d400000() {
        int n2 = this.\u00d800000().end() + (this.\u00d800000().end() == this.\u00d800000().start() ? 1 : 0);
        if (n2 <= this.Object.length()) {
            return b.\u00d200000(this.\u00d400000.pattern().matcher(this.Object), n2, this.Object);
        }
        return null;
    }

    public static final /* synthetic */ MatchResult super(n n2) {
        return n2.\u00d800000();
    }
}

