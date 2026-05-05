/*
 * Decompiled with CFR 0.152.
 */
package b.q;

import b.e.bb;
import b.e.m;
import b.o.d.fc;
import b.o.e.g;
import b.q.b$_b$1$1;
import b.q.e;
import b.q.jb;
import b.q.n;
import b.s.mc;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;

public final class b {
    private static final int o00000(Iterable object) {
        int n2 = 0;
        object = object.iterator();
        while (object.hasNext()) {
            Object e2 = object.next();
            n2 |= ((jb)e2).\u00d200000();
        }
        return n2;
    }

    private static final /* synthetic */ Set o00000(int n2) {
        fc.o00000(4, "T");
        EnumSet<Enum> enumSet = EnumSet.allOf(Enum.class);
        Iterable iterable = enumSet;
        fc.\u00d300000();
        mc.new(iterable, (g)new b$_b$1$1(n2));
        return Collections.unmodifiableSet((Set)enumSet);
    }

    private static final e o00000(Matcher matcher, int n2, CharSequence charSequence) {
        if (!matcher.find(n2)) {
            return null;
        }
        return new n(matcher, charSequence);
    }

    private static final e \u00d200000(Matcher matcher, CharSequence charSequence) {
        if (!matcher.matches()) {
            return null;
        }
        return new n(matcher, charSequence);
    }

    private static final m o00000(MatchResult matchResult) {
        return bb.\u00d400000(matchResult.start(), matchResult.end());
    }

    private static final m o00000(MatchResult matchResult, int n2) {
        return bb.\u00d400000(matchResult.start(n2), matchResult.end(n2));
    }

    public static final /* synthetic */ int \u00d200000(Iterable iterable) {
        return b.o00000(iterable);
    }

    public static final /* synthetic */ e \u00d200000(Matcher matcher, int n2, CharSequence charSequence) {
        return b.o00000(matcher, n2, charSequence);
    }

    public static final /* synthetic */ e o00000(Matcher matcher, CharSequence charSequence) {
        return b.\u00d200000(matcher, charSequence);
    }

    public static final /* synthetic */ m \u00d200000(MatchResult matchResult) {
        return b.o00000(matchResult);
    }

    public static final /* synthetic */ m \u00d200000(MatchResult matchResult, int n2) {
        return b.o00000(matchResult, n2);
    }
}

