/*
 * Decompiled with CFR 0.152.
 */
package b.q;

import b.e.bb;
import b.g.c;
import b.q.b;
import b.q.e;
import b.q.f;
import b.q.g;
import b.q.kb$_b$_b$_b$1;
import b.q.kb$_c;
import b.q.kb$_d$1;
import b.q.kb$_e$2;
import b.q.kb$_f;
import b.q.n;
import b.s.mc;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class kb
implements Serializable {
    public static final kb$_f Object = new kb$_f(null);
    private final Pattern \u00d200000;
    private Set o00000;

    public kb(Pattern pattern) {
        this.\u00d200000 = pattern;
    }

    public kb(String string) {
        this(Pattern.compile(string));
    }

    public kb(String string, g g2) {
        this(Pattern.compile(string, kb$_f.super(Object, g2.\u00d200000())));
    }

    public kb(String string, Set set) {
        this(Pattern.compile(string, kb$_f.super(Object, b.\u00d200000(set))));
    }

    public final String \u00d300000() {
        return this.\u00d200000.pattern();
    }

    public final Set \u00d200000() {
        Set set = this.o00000;
        if (set == null) {
            int n2 = this.\u00d200000.flags();
            Set<g> set2 = EnumSet.allOf(g.class);
            mc.new((Iterable)set2, (b.o.e.g)new kb$_b$_b$_b$1(n2));
            Set set3 = Collections.unmodifiableSet((Set)set2);
            this.o00000 = set2 = set3;
            set = set3;
        }
        return set;
    }

    public final boolean \u00d200000(CharSequence charSequence) {
        return this.\u00d200000.matcher(charSequence).matches();
    }

    public final boolean super(CharSequence charSequence) {
        return this.\u00d200000.matcher(charSequence).find();
    }

    public final e \u00d200000(CharSequence charSequence, int n2) {
        return b.\u00d200000(this.\u00d200000.matcher(charSequence), n2, charSequence);
    }

    public static /* synthetic */ e super(kb kb2, CharSequence charSequence, int n2, int n3, Object object) {
        if ((n3 & 2) != 0) {
            n2 = 0;
        }
        return kb2.\u00d200000(charSequence, n2);
    }

    public final b.g.n \u00d600000(CharSequence charSequence, int n2) {
        if (n2 < 0 || n2 > charSequence.length()) {
            throw new IndexOutOfBoundsException("Start index out of bounds: " + n2 + ", input length: " + charSequence.length());
        }
        return c.o00000(() -> kb.super(this, charSequence, n2), (b.o.e.g)kb$_e$2.\u00f4\u00f4\u00d3000);
    }

    public static /* synthetic */ b.g.n \u00d200000(kb kb2, CharSequence charSequence, int n2, int n3, Object object) {
        if ((n3 & 2) != 0) {
            n2 = 0;
        }
        return kb2.\u00d600000(charSequence, n2);
    }

    public final e \u00d300000(CharSequence charSequence) {
        return b.o00000(this.\u00d200000.matcher(charSequence), charSequence);
    }

    public final e \u00d400000(CharSequence charSequence, int n2) {
        Matcher matcher = this.\u00d200000.matcher(charSequence).useAnchoringBounds(false).useTransparentBounds(true).region(n2, charSequence.length());
        return matcher.lookingAt() ? new n(matcher, charSequence) : null;
    }

    public final boolean class(CharSequence charSequence, int n2) {
        return this.\u00d200000.matcher(charSequence).useAnchoringBounds(false).useTransparentBounds(true).region(n2, charSequence.length()).lookingAt();
    }

    public final String \u00d200000(CharSequence charSequence, String string) {
        return this.\u00d200000.matcher(charSequence).replaceAll(string);
    }

    public final String super(CharSequence charSequence, b.o.e.g g2) {
        e e2 = kb.super(this, charSequence, 0, 2, null);
        if (e2 == null) {
            return ((Object)charSequence).toString();
        }
        e e3 = e2;
        int n2 = 0;
        int n3 = charSequence.length();
        StringBuilder stringBuilder = new StringBuilder(n3);
        do {
            stringBuilder.append(charSequence, n2, (int)e3.\u00d300000().\u00d5o0000());
            stringBuilder.append((CharSequence)g2.\u00f800000(e3));
            n2 = e3.\u00d300000().\u00d3o0000() + 1;
            e3 = e3.\u00d400000();
        } while (n2 < n3 && e3 != null);
        if (n2 < n3) {
            stringBuilder.append(charSequence, n2, n3);
        }
        return stringBuilder.toString();
    }

    public final String super(CharSequence charSequence, String string) {
        return this.\u00d200000.matcher(charSequence).replaceFirst(string);
    }

    public final List super(CharSequence charSequence, int n2) {
        f.super(n2);
        Matcher matcher = this.\u00d200000.matcher(charSequence);
        if (n2 == 1 || !matcher.find()) {
            return mc.o00000(((Object)charSequence).toString());
        }
        ArrayList<String> arrayList = new ArrayList<String>(n2 > 0 ? bb.Object(n2, 10) : 10);
        int n3 = 0;
        --n2;
        do {
            arrayList.add(((Object)charSequence.subSequence(n3, matcher.start())).toString());
            n3 = matcher.end();
        } while ((n2 < 0 || arrayList.size() != n2) && matcher.find());
        arrayList.add(((Object)charSequence.subSequence(n3, charSequence.length())).toString());
        return arrayList;
    }

    public static /* synthetic */ List \u00d400000(kb kb2, CharSequence charSequence, int n2, int n3, Object object) {
        if ((n3 & 2) != 0) {
            n2 = 0;
        }
        return kb2.super(charSequence, n2);
    }

    public final b.g.n \u00d300000(CharSequence charSequence, int n2) {
        f.super(n2);
        return c.o00000(new kb$_d$1(this, charSequence, n2, null));
    }

    public static /* synthetic */ b.g.n \u00d300000(kb kb2, CharSequence charSequence, int n2, int n3, Object object) {
        if ((n3 & 2) != 0) {
            n2 = 0;
        }
        return kb2.\u00d300000(charSequence, n2);
    }

    public final String toString() {
        return this.\u00d200000.toString();
    }

    public final Pattern \u00d400000() {
        return this.\u00d200000;
    }

    private final Object super() {
        return new kb$_c(this.\u00d200000.pattern(), this.\u00d200000.flags());
    }

    private final void super(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private static final e super(kb kb2, CharSequence charSequence, int n2) {
        return kb2.\u00d200000(charSequence, n2);
    }

    public static final /* synthetic */ Pattern super(kb kb2) {
        return kb2.\u00d200000;
    }
}

