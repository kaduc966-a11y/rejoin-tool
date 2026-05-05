/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b;

import b.o.d.fc;
import b.o.r;
import b.qd;
import b.s.mc;
import b.t.bb;
import b.t.c.b.b.b.d$_b;
import b.t.c.b.b.b.g;
import b.t.c.b.b.d.e;
import b.t.c.b.b.d.f;
import b.t.c.b.b.k.c;
import b.t.c.b.c.n;
import b.t.c.b.dd$_b$0;
import b.t.c.b.dd$_b$1;
import b.t.c.b.dd$_b$2;
import b.t.c.b.dd$_b$3;
import b.t.c.b.dd$_b$4;
import b.t.c.b.dd$_b$5;
import b.t.c.b.dd$_b$6;
import b.t.c.b.dd$_c;
import b.t.c.b.kb;
import b.t.c.b.o;
import b.t.c.b.ob;
import b.t.c.d;
import b.t.db;
import b.t.k;
import b.t.m;
import b.t.p;
import b.t.p$_b;
import b.t.q;
import b.t.u;
import b.t.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class dd {
    public static final dd o00000 = new dd();

    private dd() {
    }

    private final StringBuilder super(StringBuilder stringBuilder, p p2) {
        return stringBuilder.append(dd.super(this, p2.\u00f8\u00f50000(), false, 2, null)).append(".");
    }

    private final void \u00d200000(StringBuilder stringBuilder, db object) {
        Object object2 = ((o)object).\u00f8\u00d6O000();
        object = new ArrayList();
        object2 = object2.iterator();
        while (object2.hasNext()) {
            Object e2 = object2.next();
            p p2 = (p)e2;
            if (!(p2.\u00f5\u00f50000() == p$_b.\u00d400000 || p2.\u00f5\u00f50000() == p$_b.class)) continue;
            object.add(e2);
        }
        object = (List)object;
        p p3 = (p)mc.\u00f400000((List)object, 0);
        if (p3 != null) {
            object2 = p3;
            o00000.super(stringBuilder, (p)object2);
        }
        p p4 = (p)mc.\u00f400000((List)object, 1);
        if (p4 != null) {
            object2 = p4;
            o00000.super(stringBuilder.append("("), (p)object2).append(")");
            return;
        }
    }

    private final void super(StringBuilder stringBuilder, db object) {
        if ((object = b.t.b.f.\u00d200000((db)object)).isEmpty()) {
            return;
        }
        mc.o00000((Iterable)object, stringBuilder, null, "context(", ") ", 0, null, dd$_b$0.whilenewObject, 50, null);
    }

    private final void super(StringBuilder stringBuilder, String string) {
        stringBuilder.append(c.super(f.\u00d300000(string), false, 1, null));
    }

    private final String super(db db2) {
        db db3 = db2;
        if (db3 instanceof m) {
            return this.super((m)db2);
        }
        if (db3 instanceof k) {
            return this.super((k)db2);
        }
        throw new IllegalStateException("Illegal callable: ".concat(String.valueOf(db2)).toString());
    }

    public final String super(m m2) {
        StringBuilder stringBuilder;
        StringBuilder stringBuilder2 = stringBuilder = new StringBuilder();
        o00000.super(stringBuilder2, m2);
        stringBuilder2.append(m2 instanceof b.t.g ? "var " : "val ");
        o00000.\u00d200000(stringBuilder2, m2);
        o00000.super(stringBuilder2, m2.\u00f5\u00d5O000());
        stringBuilder2.append(": ");
        stringBuilder2.append(dd.super(o00000, m2.\u00d5\u00d5O000(), false, 2, null));
        return stringBuilder.toString();
    }

    public final String super(k k2) {
        StringBuilder stringBuilder;
        StringBuilder stringBuilder2 = stringBuilder = new StringBuilder();
        o00000.super(stringBuilder2, k2);
        stringBuilder2.append("fun ");
        o00000.\u00d200000(stringBuilder2, k2);
        o00000.super(stringBuilder2, k2.\u00f5\u00d5O000());
        mc.o00000(b.t.b.f.\u00d600000(k2), stringBuilder2, ", ", "(", ")", 0, null, dd$_b$1.o\u00d6\u00d5000, 48, null);
        stringBuilder2.append(": ");
        stringBuilder2.append(dd.super(o00000, k2.\u00d5\u00d5O000(), false, 2, null));
        return stringBuilder.toString();
    }

    public final String \u00d200000(k k2) {
        StringBuilder stringBuilder;
        StringBuilder stringBuilder2 = stringBuilder = new StringBuilder();
        p p2 = b.t.b.f.\u00d300000(k2);
        if (p2 != null) {
            p p3 = p2;
            stringBuilder2.append(dd.super(o00000, p3.\u00f8\u00f50000(), false, 2, null));
            stringBuilder2.append(".");
        }
        mc.o00000(b.t.b.f.\u00d600000(k2), stringBuilder2, ", ", "(", ")", 0, null, dd$_b$2.O\u00d6\u00d5000, 48, null);
        stringBuilder2.append(" -> ");
        stringBuilder2.append(dd.super(o00000, k2.\u00d5\u00d5O000(), false, 2, null));
        return stringBuilder.toString();
    }

    public final String class(p p2) {
        StringBuilder stringBuilder;
        StringBuilder stringBuilder2 = stringBuilder = new StringBuilder();
        switch (dd$_c.o00000[p2.\u00f5\u00f50000().ordinal()]) {
            case 1: {
                stringBuilder2.append("instance parameter");
                break;
            }
            case 2: {
                stringBuilder2.append("context parameter " + p2.O\u00f60000());
                break;
            }
            case 3: {
                stringBuilder2.append("extension receiver parameter");
                break;
            }
            case 4: {
                stringBuilder2.append("parameter #" + p2.o\u00f60000() + ' ' + p2.O\u00f60000());
                break;
            }
            default: {
                throw new qd();
            }
        }
        stringBuilder2.append(" of ");
        stringBuilder2.append(o00000.super(((kb)p2).\u00d3\u00f60000()));
        return stringBuilder.toString();
    }

    public final String super(u u2, boolean bl) {
        Object object;
        while (true) {
            n cfr_ignored_0 = (n)u2;
            if (!((n)u2).\u00d3\u00d8\u00d2000()) break;
            bl = true;
            u2 = ((n)u2).\u00d8\u00d8\u00d2000();
        }
        Object object2 = ((n)u2).\u00d8\u00d8\u00d2000();
        Object object3 = ((n)u2).\u00d4\u00d8\u00d2000();
        if (object2 != null && object3 != null) {
            dd dd2 = this;
            return dd2.super(dd.super(dd2, (u)object2, false, 2, null), dd.super(this, (u)object3, false, 2, null));
        }
        object3 = object2 = new StringBuilder();
        u u3 = ((n)u2).nulldosuper();
        if (u3 != null) {
            object = u3;
            ((StringBuilder)object3).append(object);
            ((StringBuilder)object3).append(" /* = ");
        }
        object = u2.privatevoid();
        if (object instanceof bb) {
            o00000.super((StringBuilder)object3, ((bb)object).\u00f5\u00d4o000());
            if (u2.\u00f4\u00f60000()) {
                ((StringBuilder)object3).append("?");
            } else if (((n)u2).privatedosuper()) {
                ((StringBuilder)object3).append(" & Any");
            }
        } else if (object instanceof z) {
            e e2;
            e e3 = o00000.super((n)u2, (z)object);
            if (e3 == null) {
                e3 = e2 = new e(d.super((z)object));
            }
            if (g.new(e3) && !u2.\u00f5\u00f60000().contains(q.\u00d400000.o00000())) {
                o00000.super((StringBuilder)object3, (n)u2);
            } else {
                o00000.super((StringBuilder)object3, (z)object, e2, u2.\u00f5\u00f60000(), u2.\u00f4\u00f60000(), bl);
            }
        } else if (object instanceof ob) {
            mc.o00000(((ob)object).\u00d3\u00d5o000().class(), (Appendable)object3, ".", null, null, 0, null, dd$_b$3.\u00f8\u00d5\u00d5000, 60, null);
            o00000.super((StringBuilder)object3, u2.\u00f5\u00f60000(), u2.\u00f4\u00f60000(), bl);
        } else {
            ((StringBuilder)object3).append("???");
        }
        if (((n)u2).nulldosuper() != null) {
            ((StringBuilder)object3).append(" */");
        }
        return ((StringBuilder)object2).toString();
    }

    public static /* synthetic */ String super(dd dd2, u u2, boolean bl, int n2, Object object) {
        if ((n2 & 2) != 0) {
            bl = false;
        }
        return dd2.super(u2, bl);
    }

    private final e super(n object, z z2) {
        if (((n)object).fordosuper()) {
            return d$_b.Stringclass;
        }
        z z3 = ((n)object).\u00f4\u00d8\u00d2000();
        if (z3 == null) {
            z3 = z2;
        }
        String string = z3.\u00d8\u00d3O000();
        if (string != null) {
            object = string;
            return new e((String)object);
        }
        return null;
    }

    private final void super(StringBuilder stringBuilder, n n2) {
        if (n2.\u00f4\u00f60000()) {
            stringBuilder.append("(");
        }
        if (n2.\u00d5\u00d8\u00d2000()) {
            stringBuilder.append("suspend ");
        }
        mc.o00000(mc.if(n2.\u00f5\u00f60000(), 1), stringBuilder, null, "(", ") -> ", 0, null, null, 114, null);
        stringBuilder.append(mc.thissuper(n2.\u00f5\u00f60000()));
        if (n2.\u00f4\u00f60000()) {
            stringBuilder.append(")?");
        }
    }

    private final void super(StringBuilder stringBuilder, z z2, e e2, List list, boolean bl, boolean bl2) {
        if (z2.O\u00d4O000().size() < list.size() && r.\u00d300000(z2).getDeclaringClass() != null) {
            this.super(stringBuilder, r.o00000(r.\u00d300000(z2).getDeclaringClass()), e2.\u00d200000(), mc.new((Iterable)list, z2.O\u00d4O000().size()), false, bl2);
            stringBuilder.append(".");
            stringBuilder.append(c.super(e2.class(), false, 1, null));
        } else {
            stringBuilder.append(c.super(e2));
        }
        this.super(stringBuilder, mc.return((Iterable)list, z2.O\u00d4O000().size()), bl, bl2);
    }

    private final void super(StringBuilder stringBuilder, List list, boolean bl, boolean bl2) {
        if (!((Collection)list).isEmpty()) {
            boolean bl3 = bl2;
            mc.o00000(list, stringBuilder, null, "<", ">", 0, null, new dd$_b$4(bl3), 50, null);
        }
        if (bl) {
            stringBuilder.append("?");
        }
    }

    private final String super(String string, String string2) {
        if (fc.o00000((Object)string, (Object)b.q.f.super(string2, "?", "", false, 4, null))) {
            return b.q.f.super(string2, "?", "!", false, 4, null);
        }
        if (b.q.f.\u00d400000(string2, "?", false, 2, null) && fc.o00000((Object)(string + '?'), (Object)string2)) {
            return string + '!';
        }
        if (fc.o00000((Object)("(" + string + ")?"), (Object)string2)) {
            return "(" + string + ")!";
        }
        String string3 = string;
        String string4 = c.super(string, string2, new dd$_b$5(string3), new dd$_b$6(string3 = string), null, 16, null);
        if (string4 == null) {
            string4 = "(" + string + ".." + string2 + ')';
        }
        return string4;
    }

    private static final CharSequence \u00d800000(p p2) {
        StringBuilder stringBuilder = new StringBuilder();
        String string = p2.O\u00f60000();
        if (string == null) {
            string = "_";
        }
        return stringBuilder.append(string).append(": ").append(p2.\u00f8\u00f50000()).toString();
    }

    private static final CharSequence \u00d300000(p p2) {
        return dd.super(o00000, p2.\u00f8\u00f50000(), false, 2, null);
    }

    private static final CharSequence \u00d600000(p p2) {
        return dd.super(o00000, p2.\u00f8\u00f50000(), false, 2, null);
    }

    private static final CharSequence super(f f2) {
        return c.super(f2, false, 1, null);
    }

    private static final CharSequence super(boolean bl, q q2) {
        return (bl ? "(raw) " : "") + q2;
    }

    private static final String \u00d200000(String string) {
        String string2 = b.t.c.b.b.b.d.\u00d8O0000.super() + '.';
        String string3 = string2;
        String string4 = b.q.f.\u00d300000(string, string3, false, 2, null) ? string2 : null;
        if (string4 == null) {
            string4 = "";
        }
        return string4;
    }

    private static final String \u00d400000(String string) {
        String string2 = b.t.c.b.b.b.d.oO0000.super() + '.';
        String string3 = string2;
        String string4 = b.q.f.\u00d300000(string, string3, false, 2, null) ? string2 : null;
        if (string4 == null) {
            string4 = "";
        }
        return string4;
    }

    static /* synthetic */ CharSequence \u00d400000(p p2) {
        return dd.\u00d800000(p2);
    }

    static /* synthetic */ CharSequence \u00d200000(p p2) {
        return dd.\u00d300000(p2);
    }

    static /* synthetic */ CharSequence super(p p2) {
        return dd.\u00d600000(p2);
    }

    static /* synthetic */ CharSequence \u00d200000(f f2) {
        return dd.super(f2);
    }

    static /* synthetic */ CharSequence \u00d200000(boolean bl, q q2) {
        return dd.super(bl, q2);
    }

    static /* synthetic */ String \u00d300000(String string) {
        return dd.\u00d200000(string);
    }

    static /* synthetic */ String super(String string) {
        return dd.\u00d400000(string);
    }
}

