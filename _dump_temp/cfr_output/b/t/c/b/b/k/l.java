/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.k;

import b.dc;
import b.m;
import b.o.d.fc;
import b.qd;
import b.r;
import b.s.ub;
import b.t.c.b.b.b.d$_b;
import b.t.c.b.b.h.hb;
import b.t.c.b.b.h.hc;
import b.t.c.b.b.h.pc;
import b.t.c.b.b.h.rc;
import b.t.c.b.b.h.s;
import b.t.c.b.b.h.vc;
import b.t.c.b.b.h.w;
import b.t.c.b.b.h.x;
import b.t.c.b.b.k.b;
import b.t.c.b.b.k.b$_b;
import b.t.c.b.b.k.c;
import b.t.c.b.b.k.d;
import b.t.c.b.b.k.e;
import b.t.c.b.b.k.f;
import b.t.c.b.b.k.g;
import b.t.c.b.b.k.h;
import b.t.c.b.b.k.i;
import b.t.c.b.b.k.k;
import b.t.c.b.b.k.l$_b;
import b.t.c.b.b.k.l$_c$0;
import b.t.c.b.b.k.l$_c$1;
import b.t.c.b.b.k.l$_c$2;
import b.t.c.b.b.k.l$_c$3;
import b.t.c.b.b.k.l$_c$4;
import b.t.c.b.b.k.l$_c$5;
import b.t.c.b.b.k.l$_c$6;
import b.t.c.b.b.k.l$_c$7;
import b.t.c.b.b.k.l$_d$3;
import b.t.c.b.b.k.l$_e;
import b.t.c.b.b.k.o;
import b.t.c.b.b.o.c.bb;
import b.t.c.b.b.o.c.j;
import b.t.c.b.b.o.c.t;
import b.t.c.b.b.o.c.t$_b;
import b.t.c.b.b.o.c.t$_b$_b;
import b.t.c.b.b.o.c.t$_b$_c;
import b.t.c.b.b.o.n;
import b.t.c.b.b.q.ab;
import b.t.c.b.b.q.bc;
import b.t.c.b.b.q.cb;
import b.t.c.b.b.q.cc;
import b.t.c.b.b.q.eb;
import b.t.c.b.b.q.ec;
import b.t.c.b.b.q.hc$_b;
import b.t.c.b.b.q.ib;
import b.t.c.b.b.q.ic;
import b.t.c.b.b.q.jc;
import b.t.c.b.b.q.kb;
import b.t.c.b.b.q.lc;
import b.t.c.b.b.q.mc;
import b.t.c.b.b.q.pb;
import b.t.c.b.b.q.q;
import b.t.c.b.b.q.sb;
import b.t.c.b.b.q.t$_d;
import b.t.c.b.b.q.v;
import b.t.c.b.b.q.vb;
import b.t.c.b.b.q.wb;
import b.t.c.b.b.q.y;
import b.t.c.b.b.q.z;
import b.t.c.b.b.q.zb;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class l
extends b
implements o {
    private final e floatObject;
    private final dc \u00d6\u00d40000;

    public l(e e2) {
        this.floatObject = e2;
        boolean bl = this.floatObject.\u00d3\u00d30000();
        if (m.new && !bl) {
            String string = "Assertion failed";
            throw new AssertionError((Object)string);
        }
        l l2 = this;
        this.\u00d6\u00d40000 = r.o00000(new l$_c$0(l2));
    }

    public final e \u00d8\u00d30000() {
        return this.floatObject;
    }

    private final l \u00d8\u00d40000() {
        return (l)this.\u00d6\u00d40000.\u00d200000();
    }

    private final String \u00d400000(String string) {
        switch (l$_e.\u00d200000[this.\u00d6\u00d60000().ordinal()]) {
            case 1: {
                return string;
            }
            case 2: {
                if (this.\u00d6\u00d80000()) {
                    return string;
                }
                return "<b>" + string + "</b>";
            }
        }
        throw new qd();
    }

    private final String \u00d300000(String string) {
        switch (l$_e.\u00d200000[this.\u00d6\u00d60000().ordinal()]) {
            case 1: {
                return string;
            }
            case 2: {
                return "<font color=red><b>" + string + "</b></font>";
            }
        }
        throw new qd();
    }

    private final String super(String string) {
        return this.\u00d6\u00d60000().o00000(string);
    }

    private final String O\u00d40000() {
        return this.super("<");
    }

    private final String \u00f6\u00d60000() {
        return this.super(">");
    }

    private final String \u00f6\u00d40000() {
        switch (l$_e.\u00d200000[this.\u00d6\u00d60000().ordinal()]) {
            case 1: {
                return this.super("->");
            }
            case 2: {
                return "&rarr;";
            }
        }
        throw new qd();
    }

    public final String \u00d200000(String string) {
        switch (l$_e.\u00d200000[this.\u00d6\u00d60000().ordinal()]) {
            case 1: {
                return string;
            }
            case 2: {
                return "<i>" + string + "</i>";
            }
        }
        throw new qd();
    }

    @Override
    public final String super(b.t.c.b.b.d.f object, boolean bl) {
        object = this.super(c.super((b.t.c.b.b.d.f)object, false, 1, null));
        if (this.\u00d6\u00d80000() && this.\u00d6\u00d60000() == d.\u00d400000 && bl) {
            return "<b>" + (String)object + "</b>";
        }
        return object;
    }

    private final void super(wb wb2, StringBuilder stringBuilder, boolean bl) {
        stringBuilder.append(((b)this).super(wb2.\u00d5\u00f80000(), bl));
    }

    private final void super(wb wb2, StringBuilder stringBuilder) {
        if (this.classString()) {
            if (this.\u00d2\u00d50000()) {
                stringBuilder.append("companion object");
            }
            this.super(stringBuilder);
            wb wb3 = wb2.\u00d8\u00f80000();
            if (wb3 != null) {
                stringBuilder.append("of ");
                stringBuilder.append(((b)this).super(wb3.\u00d5\u00f80000(), false));
            }
        }
        if (this.\u00f4\u00d30000() || !fc.o00000((Object)wb2.\u00d5\u00f80000(), (Object)b.t.c.b.b.d.j.\u00d600000)) {
            if (!this.\u00d2\u00d50000()) {
                this.super(stringBuilder);
            }
            stringBuilder.append(((b)this).super(wb2.\u00d5\u00f80000(), true));
        }
    }

    @Override
    public final String super(b.t.c.b.b.d.e e2) {
        return this.\u00d200000(e2.\u00d600000());
    }

    private final String \u00d200000(List list) {
        return this.super(c.super(list));
    }

    public final String super(kb kb2) {
        if (b.t.c.b.b.h.d.k.o00000(kb2)) {
            return kb2.\u00d3OO000().toString();
        }
        return this.\u00d3\u00d50000().o00000(kb2, this);
    }

    @Override
    public final String super(rc rc2) {
        StringBuilder stringBuilder;
        StringBuilder stringBuilder2 = stringBuilder = new StringBuilder();
        this.\u00d400000(stringBuilder2, (rc)this.intString().\u00f800000(rc2));
        return stringBuilder.toString();
    }

    private final void \u00d400000(StringBuilder stringBuilder, rc rc2) {
        b.t.c.b.b.h.l l2 = rc2.\u00d8\u00d6\u00d2000();
        l2 = l2 instanceof x ? (x)l2 : null;
        if (l2 != null) {
            if (this.\u00d3\u00d40000()) {
                this.\u00d200000(stringBuilder, ((x)l2).\u00d5\u00f4\u00d2000());
                if (this.\u00d2\u00d60000()) {
                    this.super(stringBuilder, (x)l2);
                    return;
                }
            } else {
                this.\u00d200000(stringBuilder, ((x)l2).\u00d4\u00f4\u00d2000());
                if (this.\u00d4\u00d60000()) {
                    this.\u00d200000(stringBuilder, (x)l2);
                }
            }
            return;
        }
        this.\u00d200000(stringBuilder, rc2);
    }

    private final void super(StringBuilder stringBuilder, x x2) {
        l l2 = this;
        StringBuilder stringBuilder2 = stringBuilder;
        if (l2.\u00d6\u00d60000() == d.\u00d400000) {
            stringBuilder2.append("<font color=\"808080\"><i>");
        }
        stringBuilder2.append(" /* ");
        stringBuilder.append("from: ");
        this.\u00d200000(stringBuilder, x2.\u00d4\u00f4\u00d2000());
        stringBuilder2.append(" */");
        if (l2.\u00d6\u00d60000() == d.\u00d400000) {
            stringBuilder2.append("</i></font>");
        }
    }

    private final void \u00d200000(StringBuilder stringBuilder, x x2) {
        l l2 = this;
        StringBuilder stringBuilder2 = stringBuilder;
        if (l2.\u00d6\u00d60000() == d.\u00d400000) {
            stringBuilder2.append("<font color=\"808080\"><i>");
        }
        stringBuilder2.append(" /* ");
        stringBuilder.append("= ");
        this.\u00d200000(stringBuilder, x2.\u00d5\u00f4\u00d2000());
        stringBuilder2.append(" */");
        if (l2.\u00d6\u00d60000() == d.\u00d400000) {
            stringBuilder2.append("</i></font>");
        }
    }

    private final void \u00d200000(StringBuilder stringBuilder, rc rc2) {
        if (rc2 instanceof b.t.c.b.b.h.c && this.\u00d300000() && !((b.t.c.b.b.h.c)rc2).O\u00d8\u00d2000()) {
            stringBuilder.append("<Not computed yet>");
            return;
        }
        if ((rc2 = rc2.\u00d8\u00d6\u00d2000()) instanceof b.t.c.b.b.h.f) {
            stringBuilder.append(((b.t.c.b.b.h.f)rc2).o00000(this, this));
            return;
        }
        if (rc2 instanceof b.t.c.b.b.h.ib) {
            this.super(stringBuilder, (b.t.c.b.b.h.ib)rc2);
            return;
        }
        throw new qd();
    }

    private final void super(StringBuilder stringBuilder, b.t.c.b.b.h.ib ib2) {
        if (fc.o00000((Object)ib2, (Object)b.t.c.b.b.h.o.o00000) || b.t.c.b.b.h.o.\u00d500000(ib2)) {
            stringBuilder.append("???");
            return;
        }
        if (b.t.c.b.b.h.d.k.o00000(ib2)) {
            if (this.\u00d6\u00d50000()) {
                stringBuilder.append(this.\u00d300000(((b.t.c.b.b.h.d.m)ib2.thisdosuper()).\u00f5\u00d20000(0)));
                return;
            }
            stringBuilder.append("???");
            return;
        }
        if (hb.super(ib2)) {
            this.\u00d300000(stringBuilder, ib2);
            return;
        }
        if (this.class(ib2)) {
            this.super(stringBuilder, (rc)ib2);
            return;
        }
        this.\u00d300000(stringBuilder, ib2);
    }

    private final boolean class(rc iterator) {
        if (b.t.c.b.b.b.g.\u00d400000((rc)((Object)iterator))) {
            boolean bl;
            if (!((iterator = (Iterable)((rc)((Object)iterator)).\u00d4\u00d6\u00d2000()) instanceof Collection) || !((Collection)((Object)iterator)).isEmpty()) {
                iterator = iterator.iterator();
                while (iterator.hasNext()) {
                    if (!((hc)iterator.next()).super()) continue;
                    bl = false;
                    break;
                }
            } else {
                bl = true;
            }
            if (bl) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final String super(String string, String string2, b.t.c.b.b.b.c c2) {
        if (c.super(string, string2)) {
            if (b.q.f.\u00d300000(string2, "(", false, 2, null)) {
                return "(" + string + ")!";
            }
            return string + '!';
        }
        b.t.c.b.b.b.c c3 = c2;
        l l2 = this;
        String string3 = c.super(string, string2, new l$_c$1(l2, c3), new l$_c$2(l2 = this, c3 = c2), new l$_d$3(this));
        if (string3 == null) {
            string3 = "(" + string + ".." + string2 + ')';
        }
        return string3;
    }

    public final String super(List list) {
        StringBuilder stringBuilder;
        if (list.isEmpty()) {
            return "";
        }
        StringBuilder stringBuilder2 = stringBuilder = new StringBuilder();
        stringBuilder.append(this.O\u00d40000());
        this.super(stringBuilder2, list);
        stringBuilder2.append(this.\u00f6\u00d60000());
        return stringBuilder.toString();
    }

    private final void \u00d300000(StringBuilder stringBuilder, rc rc2) {
        b.t.c.b.b.h.ib ib2;
        l.super(this, stringBuilder, (b.t.c.b.b.q.e.i)rc2, null, 2, null);
        b.t.c.b.b.h.sb sb2 = rc2 instanceof b.t.c.b.b.h.sb ? (b.t.c.b.b.h.sb)rc2 : null;
        b.t.c.b.b.h.ib ib3 = ib2 = sb2 != null ? sb2.\u00d3\u00f5\u00d2000() : null;
        if (hb.super(rc2)) {
            if (b.t.c.b.b.h.b.b.\u00d300000(rc2) && this.voidclass()) {
                stringBuilder.append(this.\u00d300000(b.t.c.b.b.h.d.k.\u00d400000.new(rc2)));
            } else {
                if (rc2 instanceof b.t.c.b.b.h.d.e && !this.\u00f4\u00d50000()) {
                    stringBuilder.append(((b.t.c.b.b.h.d.e)rc2).O\u00f4\u00d2000());
                } else {
                    stringBuilder.append(rc2.thisdosuper().toString());
                }
                stringBuilder.append(this.super(rc2.\u00d4\u00d6\u00d2000()));
            }
        } else if (rc2 instanceof vc) {
            stringBuilder.append(((vc)rc2).newwhilesuper().toString());
        } else if (ib2 instanceof vc) {
            stringBuilder.append(((vc)ib2).newwhilesuper().toString());
        } else {
            l.super(this, stringBuilder, rc2, null, 2, null);
        }
        if (rc2.\u00f5\u00d6\u00d2000()) {
            stringBuilder.append("?");
        }
        if (s.\u00d200000(rc2)) {
            stringBuilder.append(" & Any");
        }
    }

    private final void super(StringBuilder stringBuilder, rc rc2, b.t.c.b.b.h.bc bc2) {
        z z2 = b.t.c.b.b.q.f.o00000(rc2);
        if (z2 == null) {
            stringBuilder.append(this.super(bc2));
            stringBuilder.append(this.super(rc2.\u00d4\u00d6\u00d2000()));
            return;
        }
        this.super(stringBuilder, z2);
    }

    static /* synthetic */ void super(l l2, StringBuilder stringBuilder, rc rc2, b.t.c.b.b.h.bc bc2, int n2, Object object) {
        if ((n2 & 2) != 0) {
            bc2 = rc2.thisdosuper();
        }
        l2.super(stringBuilder, rc2, bc2);
    }

    private final void super(StringBuilder stringBuilder, z z2) {
        block3: {
            Object object;
            block2: {
                object = z2.o00000();
                if (object == null) break block2;
                z z3 = object;
                this.super(stringBuilder, z3);
                stringBuilder.append('.');
                object = stringBuilder.append(((b)this).super(z2.\u00d200000().\u00d5\u00f80000(), false));
                if (object != null) break block3;
            }
            object = stringBuilder.append(this.super(z2.\u00d200000().\u00d3OO000()));
        }
        stringBuilder.append(this.super(z2.\u00d300000()));
    }

    public final String super(b.t.c.b.b.h.bc bc2) {
        kb kb2 = bc2.\u00f4OO000();
        if (kb2 instanceof b.t.c.b.b.q.i || kb2 instanceof ib || kb2 instanceof b.t.c.b.b.q.h) {
            return this.super(kb2);
        }
        if (kb2 == null) {
            if (bc2 instanceof pc) {
                return ((pc)bc2).o00000(l$_c$3.\u00f8\u00d3\u00d4000);
            }
            return bc2.toString();
        }
        throw new IllegalStateException(("Unexpected classifier: " + kb2.getClass()).toString());
    }

    @Override
    public final String super(hc hc2) {
        StringBuilder stringBuilder;
        StringBuilder stringBuilder2 = stringBuilder = new StringBuilder();
        this.super(stringBuilder2, b.s.mc.o00000(hc2));
        return stringBuilder.toString();
    }

    private final void super(StringBuilder object, List list) {
        Appendable appendable = (Appendable)object;
        object = this;
        b.s.mc.o00000(list, appendable, ", ", null, null, 0, null, new l$_c$4((l)object), 60, null);
    }

    private final void super(StringBuilder stringBuilder, rc rc2) {
        int n2 = stringBuilder.length();
        l.super(this.\u00d8\u00d40000(), stringBuilder, (b.t.c.b.b.q.e.i)rc2, null, 2, null);
        int n3 = stringBuilder.length() != n2 ? 1 : 0;
        Object object = b.t.c.b.b.b.g.\u00d800000(rc2);
        Object object2 = b.t.c.b.b.b.g.\u00d500000(rc2);
        boolean bl = b.t.c.b.b.b.g.o00000(rc2);
        boolean bl2 = rc2.\u00f5\u00d6\u00d2000();
        boolean bl3 = bl2 || n3 != 0 && object != null;
        if (bl3) {
            if (bl) {
                stringBuilder.insert(n2, '(');
            } else {
                if (n3 != 0) {
                    n2 = b.q.h.for(b.q.f.\u00d8\u00d20000(stringBuilder)) ? 1 : 0;
                    if (m.new && n2 == 0) {
                        String string = "Assertion failed";
                        throw new AssertionError((Object)string);
                    }
                    StringBuilder stringBuilder2 = stringBuilder;
                    if (stringBuilder2.charAt(b.q.f.\u00d400000(stringBuilder2) - 1) != ')') {
                        StringBuilder stringBuilder3 = stringBuilder;
                        stringBuilder3.insert(b.q.f.\u00d400000(stringBuilder3), "()");
                    }
                }
                stringBuilder.append("(");
            }
        }
        this.super(stringBuilder, bl, "suspend");
        if (!((Collection)object2).isEmpty()) {
            stringBuilder.append("context(");
            for (rc rc3 : object2.subList(0, b.s.mc.\u00d300000((List)object2))) {
                this.\u00d400000(stringBuilder, rc3);
                stringBuilder.append(", ");
            }
            this.\u00d400000(stringBuilder, (rc)b.s.mc.thissuper((List)object2));
            stringBuilder.append(") ");
        }
        if (object != null) {
            boolean bl4 = this.class((rc)object) && !((rc)object).\u00f5\u00d6\u00d2000() || this.\u00d600000((rc)object) || object instanceof b.t.c.b.b.h.sb;
            if (bl4) {
                stringBuilder.append("(");
            }
            this.\u00d400000(stringBuilder, (rc)object);
            if (bl4) {
                stringBuilder.append(")");
            }
            stringBuilder.append(".");
        }
        stringBuilder.append("(");
        if (b.t.c.b.b.b.g.\u00d300000(rc2) && rc2.\u00d4\u00d6\u00d2000().size() <= 1) {
            stringBuilder.append("???");
        } else {
            Iterator iterator = ((Iterable)b.t.c.b.b.b.g.return(rc2)).iterator();
            n3 = 0;
            while (iterator.hasNext()) {
                int n4 = n3++;
                object2 = (hc)iterator.next();
                if (n4 > 0) {
                    stringBuilder.append(", ");
                }
                if ((object = this.\u00f4\u00d60000() ? b.t.c.b.b.b.g.OO0000(object2.\u00d300000()) : null) != null) {
                    stringBuilder.append(((b)this).super((b.t.c.b.b.d.f)object, false));
                    stringBuilder.append(": ");
                }
                stringBuilder.append(((b)this).super((hc)object2));
            }
        }
        stringBuilder.append(") ").append(this.\u00f6\u00d40000()).append(" ");
        this.\u00d400000(stringBuilder, b.t.c.b.b.b.g.\u00f800000(rc2));
        if (bl3) {
            stringBuilder.append(")");
        }
        if (bl2) {
            stringBuilder.append("?");
        }
    }

    private final boolean \u00d600000(rc rc2) {
        return b.t.c.b.b.b.g.o00000(rc2) || !rc2.\u00d4\u00f80000().\u00d5\u00f4\u00d3000();
    }

    private final void super(StringBuilder stringBuilder, wb object) {
        if (object instanceof lc || object instanceof cc) {
            return;
        }
        wb wb2 = object.\u00d8\u00f80000();
        if (wb2 != null && !(wb2 instanceof bc)) {
            stringBuilder.append(" ").append(this.\u00d200000("defined in")).append(" ");
            b.t.c.b.b.d.e e2 = n.\u00d8O0000(wb2);
            stringBuilder.append(e2.int() ? "root package" : ((b)this).super(e2));
            if (this.\u00d8\u00d80000() && wb2 instanceof lc && object instanceof q) {
                String string = ((q)object).\u00f4\u00f80000().super().o00000();
                if (string != null) {
                    object = string;
                    stringBuilder.append(" ").append(this.\u00d200000("in file")).append(" ").append((String)object);
                    return;
                }
            }
        }
    }

    private final void super(StringBuilder stringBuilder, b.t.c.b.b.q.e.i object, b.t.c.b.b.q.e.c c2) {
        if (!this.publicObject().contains((Object)k.\u00d5O0000)) {
            return;
        }
        Set set = object instanceof rc ? this.\u00d200000() : this.doString();
        b.o.e.g g2 = this.\u00f8\u00d60000();
        for (b.t.c.b.b.q.e.l l2 : object.\u00d4\u00f80000()) {
            if (b.s.mc.\u00d800000((Iterable)set, l2.\u00d300000()) || this.\u00d200000(l2) || g2 != null && !((Boolean)g2.\u00f800000(l2)).booleanValue()) continue;
            stringBuilder.append(((b)this).super(l2, c2));
            if (this.O\u00d80000()) {
                stringBuilder.append('\n');
                continue;
            }
            stringBuilder.append(" ");
        }
    }

    static /* synthetic */ void super(l l2, StringBuilder stringBuilder, b.t.c.b.b.q.e.i i2, b.t.c.b.b.q.e.c c2, int n2, Object object) {
        if ((n2 & 2) != 0) {
            c2 = null;
        }
        l2.super(stringBuilder, i2, c2);
    }

    private final boolean \u00d200000(b.t.c.b.b.q.e.l l2) {
        return fc.o00000((Object)l2.\u00d300000(), (Object)d$_b.thisObject);
    }

    @Override
    public final String super(b.t.c.b.b.q.e.l object, b.t.c.b.b.q.e.c object2) {
        StringBuilder stringBuilder;
        StringBuilder stringBuilder2 = stringBuilder = new StringBuilder();
        stringBuilder.append('@');
        if (object2 != null) {
            stringBuilder2.append(((b.t.c.b.b.q.e.c)((Object)object2)).new() + ':');
        }
        object2 = object.\u00d400000();
        stringBuilder2.append(((b)this).super((rc)object2));
        if (this.O\u00d60000()) {
            object = this.super((b.t.c.b.b.q.e.l)object);
            if (this.\u00d3\u00d60000() || !((Collection)object).isEmpty()) {
                b.s.mc.o00000((Iterable)object, stringBuilder2, ", ", "(", ")", 0, null, null, 112, null);
            }
        }
        if (this.\u00f4\u00d30000() && (hb.super((rc)object2) || ((rc)object2).thisdosuper().\u00f4OO000() instanceof t$_d)) {
            stringBuilder2.append(" /* annotation class not found */");
        }
        return stringBuilder.toString();
    }

    private final List super(b.t.c.b.b.q.e.l object) {
        Object object2;
        Object object3;
        List list;
        List list2;
        Object object4;
        Iterable iterable;
        Object object52;
        Object object6;
        Object object7 = object.super();
        object = this.interfaceString() ? b.t.c.b.b.o.f.b.o00000((b.t.c.b.b.q.e.l)object) : null;
        if (object != null && (object6 = object.nullintsuper()) != null && (object52 = object6.\u00f5\u00d8o000()) != null) {
            iterable = (Iterable)object52;
            object6 = new ArrayList();
            for (Object object52 : iterable) {
                if (!((jc)object52).\u00f80\u00d2000()) continue;
                object6.add(object52);
            }
            object6 = (List)object6;
            iterable = object6;
            object6 = new ArrayList(b.s.mc.o00000((Iterable)object6, 10));
            for (Object object52 : iterable) {
                object = (jc)object52;
                object4 = object6;
                object4.add(object.\u00d5\u00f80000());
            }
            list2 = (List)object6;
        } else {
            list2 = list = null;
        }
        if (list2 == null) {
            list = b.s.mc.\u00d500000();
        }
        object = list;
        object6 = list;
        object52 = new ArrayList();
        object6 = object6.iterator();
        while (object6.hasNext()) {
            object3 = object6.next();
            object2 = (b.t.c.b.b.d.f)object3;
            if (!(!object7.containsKey(object2))) continue;
            object52.add(object3);
        }
        object6 = object52 = (Iterable)object52;
        object52 = new ArrayList(b.s.mc.o00000((Iterable)object52, 10));
        object6 = object6.iterator();
        while (object6.hasNext()) {
            object3 = object6.next();
            object2 = (b.t.c.b.b.d.f)object3;
            object4 = object52;
            object4.add(((b.t.c.b.b.d.f)object2).\u00d400000() + " = ...");
        }
        object6 = object52;
        object52 = object7 = (Iterable)object7.entrySet();
        iterable = new ArrayList(b.s.mc.o00000((Iterable)object7, 10));
        object3 = object52.iterator();
        while (object3.hasNext()) {
            object2 = object3.next();
            object52 = (Map.Entry)object2;
            object4 = iterable;
            object7 = (b.t.c.b.b.d.f)object52.getKey();
            object52 = (j)object52.getValue();
            object4.add(((b.t.c.b.b.d.f)object7).\u00d400000() + " = " + (!object.contains(object7) ? this.super((j)object52) : "..."));
        }
        object52 = (List)iterable;
        return b.s.mc.\u00d4o0000(b.s.mc.return((Collection)object6, object52));
    }

    private final String super(j iterator) {
        Iterator iterator2 = this.floatObject.Oo0000();
        if (iterator2 != null) {
            return (String)iterator2.\u00f800000(iterator);
        }
        iterator2 = iterator;
        if (iterator2 instanceof b.t.c.b.b.o.c.k) {
            iterator = (Iterable)((b.t.c.b.b.o.c.k)((Object)iterator)).o00000();
            Collection collection = new ArrayList();
            iterator = iterator.iterator();
            while (iterator.hasNext()) {
                iterator2 = (j)iterator.next();
                String string = this.super((j)((Object)iterator2));
                if (string == null) continue;
                iterator2 = string;
                collection.add(iterator2);
            }
            return b.s.mc.o00000((List)collection, ", ", "{", "}", 0, null, null, 56, null);
        }
        if (iterator2 instanceof bb) {
            return b.q.f.\u00d300000(b.super(this, (b.t.c.b.b.q.e.l)((bb)((Object)iterator)).o00000(), null, 2, null), (CharSequence)"@");
        }
        if (iterator2 instanceof t) {
            if ((iterator = (t$_b)((t)((Object)iterator)).o00000()) instanceof t$_b$_c) {
                return ((t$_b$_c)((Object)iterator)).o00000() + "::class";
            }
            if (iterator instanceof t$_b$_b) {
                iterator2 = ((t$_b$_b)((Object)iterator)).\u00d400000().\u00f400000().super();
                int n2 = ((t$_b$_b)((Object)iterator)).new();
                for (int i2 = 0; i2 < n2; ++i2) {
                    iterator2 = "kotlin.Array<" + (String)((Object)iterator2) + '>';
                }
                return (String)((Object)iterator2) + "::class";
            }
            throw new qd();
        }
        return ((j)((Object)iterator)).toString();
    }

    private final boolean super(b.t.c.b.b.q.s s2, StringBuilder stringBuilder) {
        if (!this.publicObject().contains((Object)k.void)) {
            return false;
        }
        if (this.\u00f6\u00d30000()) {
            s2 = s2.o00000();
        }
        if (!this.\u00f8\u00d30000() && fc.o00000((Object)s2, (Object)eb.o00000)) {
            return false;
        }
        stringBuilder.append(this.\u00d400000(s2.new())).append(" ");
        return true;
    }

    private final void super(ab ab2, StringBuilder stringBuilder, ab ab3) {
        if (!this.\u00d8\u00d60000() && ab2 == ab3) {
            return;
        }
        this.super(stringBuilder, this.publicObject().contains((Object)k.supersuper), b.t.c.b.b.g.c.b.\u00d200000(ab2.name()));
    }

    private final ab super(b.t.c.b.b.q.dc dc2) {
        if (dc2 instanceof ib) {
            if (((ib)dc2).privateintsuper() == ec.\u00d600000) {
                return ab.\u00d400000;
            }
            return ab.\u00d600000;
        }
        wb wb2 = dc2.\u00d8\u00f80000();
        ib ib2 = wb2 instanceof ib ? (ib)wb2 : null;
        if (ib2 == null) {
            return ab.\u00d600000;
        }
        wb2 = ib2;
        if (!(dc2 instanceof b.t.c.b.b.q.hc)) {
            return ab.\u00d600000;
        }
        if (!((b.t.c.b.b.q.hc)dc2).\u00d5\u00f4o000().isEmpty() && wb2.\u00f40O000() != ab.\u00d600000) {
            return ab.class;
        }
        if (wb2.privateintsuper() == ec.\u00d600000 && !fc.o00000((Object)((b.t.c.b.b.q.hc)dc2).\u00d50O000(), (Object)eb.oO0000)) {
            if (((b.t.c.b.b.q.hc)dc2).\u00f40O000() == ab.\u00d400000) {
                return ab.\u00d400000;
            }
            return ab.class;
        }
        return ab.\u00d600000;
    }

    private final void \u00d200000(b.t.c.b.b.q.hc hc2, StringBuilder stringBuilder) {
        if (!n.\u00d3O0000(hc2) || hc2.\u00f40O000() != ab.\u00d600000) {
            if (this.\u00d4\u00d50000() == i.\u00d400000 && hc2.\u00f40O000() == ab.class && this.super(hc2)) {
                return;
            }
            this.super(hc2.\u00f40O000(), stringBuilder, this.super((b.t.c.b.b.q.dc)hc2));
        }
    }

    private final void \u00d300000(b.t.c.b.b.q.hc hc2, StringBuilder stringBuilder) {
        if (!this.publicObject().contains((Object)k.o00000)) {
            return;
        }
        if (this.super(hc2) && this.\u00d4\u00d50000() != i.\u00d500000) {
            this.super(stringBuilder, true, "override");
            if (this.\u00f4\u00d30000()) {
                stringBuilder.append("/*").append(hc2.\u00d5\u00f4o000().size()).append("*/ ");
            }
        }
    }

    private final void super(b.t.c.b.b.q.hc hc2, StringBuilder stringBuilder) {
        if (!this.publicObject().contains((Object)k.\u00d200000)) {
            return;
        }
        if (this.\u00f4\u00d30000() && hc2.O\u00f5o000() != hc$_b.\u00d400000) {
            stringBuilder.append("/*").append(b.t.c.b.b.g.c.b.\u00d200000(hc2.O\u00f5o000().name())).append("*/ ");
        }
    }

    private final void super(StringBuilder stringBuilder, boolean bl, String string) {
        if (bl) {
            stringBuilder.append(this.\u00d400000(string));
            stringBuilder.append(" ");
        }
    }

    private final void super(b.t.c.b.b.q.dc dc2, StringBuilder stringBuilder) {
        this.super(stringBuilder, dc2.\u00f50O000(), "external");
        this.super(stringBuilder, this.publicObject().contains((Object)k.Object) && dc2.\u00d80O000(), "expect");
        this.super(stringBuilder, this.publicObject().contains((Object)k.\u00d2O0000) && dc2.thisint(), "actual");
    }

    /*
     * Unable to fully structure code
     */
    private final void \u00d200000(ic var1_1, StringBuilder var2_2) {
        if (!var1_1.\u00d3\u00f5o000()) ** GOTO lbl-1000
        var4_3 = var1_1.\u00d5\u00f4o000();
        if (!((Collection)var4_3).isEmpty()) {
            var3_5 = var4_3.iterator();
            while (var3_5.hasNext()) {
                if (!((ic)var3_5.next()).\u00d3\u00f5o000()) continue;
                v0 = false;
                break;
            }
        } else {
            v0 = true;
        }
        if (v0 || this.floatObject()) {
            v1 = true;
        } else lbl-1000:
        // 2 sources

        {
            v1 = var3_6 = false;
        }
        if (!var1_1.\u00f4\u00f5o000()) ** GOTO lbl-1000
        var4_3 = var1_1.\u00d5\u00f4o000();
        if (!((Collection)var4_3).isEmpty()) {
            var4_3 = var4_3.iterator();
            while (var4_3.hasNext()) {
                if (!((ic)var4_3.next()).\u00f4\u00f5o000()) continue;
                v2 = false;
                break;
            }
        } else {
            v2 = true;
        }
        if (v2 || this.floatObject()) {
            v3 = true;
        } else lbl-1000:
        // 2 sources

        {
            v3 = false;
        }
        var4_4 = v3;
        this.super(var2_2, var1_1.newreturnsuper(), "tailrec");
        this.\u00d300000(var1_1, var2_2);
        this.super(var2_2, var1_1.\u00f8\u00f5o000(), "inline");
        this.super(var2_2, var4_4, "infix");
        this.super(var2_2, var3_6, "operator");
    }

    private final void \u00d300000(ic ic2, StringBuilder stringBuilder) {
        this.super(stringBuilder, ic2.\u00d5\u00f5o000(), "suspend");
    }

    @Override
    public final String super(wb wb2) {
        StringBuilder stringBuilder;
        StringBuilder stringBuilder2 = stringBuilder = new StringBuilder();
        wb2.o00000(new l$_b(this), stringBuilder2);
        if (this.superString()) {
            this.super(stringBuilder2, wb2);
        }
        return stringBuilder.toString();
    }

    private final void super(b.t.c.b.b.q.i object, StringBuilder stringBuilder, boolean bl) {
        if (bl) {
            stringBuilder.append(this.O\u00d40000());
        }
        if (this.\u00f4\u00d30000()) {
            stringBuilder.append("/*").append(object.privateObjectsuper()).append("*/ ");
        }
        this.super(stringBuilder, object.\u00f4\u00d5o000(), "reified");
        String string = object.\u00d4\u00d5o000().\u00d200000();
        this.super(stringBuilder, ((CharSequence)string).length() > 0, string);
        l.super(this, stringBuilder, (b.t.c.b.b.q.e.i)object, null, 2, null);
        this.super((wb)object, stringBuilder, bl);
        int n2 = object.\u00d8\u00d5o000().size();
        if (n2 > 1 && !bl || n2 == 1) {
            rc rc2 = (rc)object.\u00d8\u00d5o000().iterator().next();
            if (!b.t.c.b.b.b.c.\u00f800000(rc2)) {
                stringBuilder.append(" : ").append(((b)this).super(rc2));
            }
        } else if (bl) {
            n2 = 1;
            for (rc rc3 : object.\u00d8\u00d5o000()) {
                if (b.t.c.b.b.b.c.\u00f800000(rc3)) continue;
                if (n2 != 0) {
                    stringBuilder.append(" : ");
                } else {
                    stringBuilder.append(" & ");
                }
                stringBuilder.append(((b)this).super(rc3));
                n2 = 0;
            }
        }
        if (bl) {
            stringBuilder.append(this.\u00f6\u00d60000());
        }
    }

    private final void super(List list, StringBuilder stringBuilder, boolean bl) {
        if (this.ObjectObject()) {
            return;
        }
        if (!((Collection)list).isEmpty()) {
            stringBuilder.append(this.O\u00d40000());
            this.\u00d200000(stringBuilder, list);
            stringBuilder.append(this.\u00f6\u00d60000());
            if (bl) {
                stringBuilder.append(" ");
            }
        }
    }

    private final void \u00d200000(StringBuilder stringBuilder, List object) {
        object = object.iterator();
        while (object.hasNext()) {
            b.t.c.b.b.q.i i2 = (b.t.c.b.b.q.i)object.next();
            this.super(i2, stringBuilder, false);
            if (!object.hasNext()) continue;
            stringBuilder.append(", ");
        }
    }

    private final void super(ic ic2, StringBuilder stringBuilder) {
        if (!this.\u00d2\u00d50000()) {
            if (!this.\u00f4\u00d80000()) {
                this.super(ic2.\u00d4\u00f4o000(), stringBuilder);
                l.super(this, stringBuilder, ic2, null, 2, null);
                this.super(ic2.\u00d50O000(), stringBuilder);
                this.\u00d200000((b.t.c.b.b.q.hc)ic2, stringBuilder);
                if (this.voidObject()) {
                    this.super((b.t.c.b.b.q.dc)ic2, stringBuilder);
                }
                this.\u00d300000((b.t.c.b.b.q.hc)ic2, stringBuilder);
                if (this.voidObject()) {
                    this.\u00d200000(ic2, stringBuilder);
                } else {
                    this.\u00d300000(ic2, stringBuilder);
                }
                this.super((b.t.c.b.b.q.hc)ic2, stringBuilder);
                if (this.\u00f4\u00d30000()) {
                    if (ic2.\u00d4\u00f5o000()) {
                        stringBuilder.append("/*isHiddenToOvercomeSignatureClash*/ ");
                    }
                    if (ic2.returnreturnsuper()) {
                        stringBuilder.append("/*isHiddenForResolutionEverywhereBesideSupercalls*/ ");
                    }
                }
            }
            stringBuilder.append(this.\u00d400000("fun")).append(" ");
            this.super(ic2.\u00f8\u00d8o000(), stringBuilder, true);
            this.super((b.t.c.b.b.q.b)ic2, stringBuilder);
        }
        this.super(ic2, stringBuilder, true);
        this.super((Collection)ic2.\u00f5\u00d8o000(), ic2.o\u00f4o000(), stringBuilder);
        this.\u00d200000((b.t.c.b.b.q.b)ic2, stringBuilder);
        rc rc2 = ic2.\u00d3\u00f4o000();
        if (!(this.\u00f6\u00d50000() || !this.\u00d8\u00d50000() && rc2 != null && b.t.c.b.b.b.c.for(rc2))) {
            rc rc3 = rc2;
            stringBuilder.append(": ").append(rc3 == null ? "[NULL]" : ((b)this).super(rc3));
        }
        this.\u00d200000(ic2.\u00f8\u00d8o000(), stringBuilder);
    }

    private final void \u00d200000(b.t.c.b.b.q.b b2, StringBuilder stringBuilder) {
        if (!this.\u00f8\u00d50000()) {
            return;
        }
        if ((b2 = b2.nullclasssuper()) != null) {
            stringBuilder.append(" on ").append(((b)this).super(b2.forclasssuper()));
        }
    }

    private final String super(rc rc2, boolean bl) {
        String string = ((b)this).super(rc2);
        if (this.class(rc2) && !b.t.c.b.b.h.o.\u00d600000(rc2) || rc2 instanceof b.t.c.b.b.h.sb || bl && !rc2.\u00d4\u00f80000().\u00d5\u00f4\u00d3000()) {
            string = "(" + string + ')';
        }
        return string;
    }

    static /* synthetic */ String super(l l2, rc rc2, boolean bl, int n2, Object object) {
        if ((n2 & 1) != 0) {
            bl = false;
        }
        return l2.super(rc2, bl);
    }

    private final void super(List list, StringBuilder stringBuilder) {
        if (!(!((Collection)list).isEmpty())) {
            return;
        }
        stringBuilder.append("context(");
        Iterator iterator = ((Iterable)list).iterator();
        int n2 = 0;
        while (iterator.hasNext()) {
            int n3 = n2++;
            Object object = (mc)iterator.next();
            object = this.super(object.forclasssuper(), true);
            stringBuilder.append((String)object);
            if (n3 == b.s.mc.\u00d300000(list)) {
                stringBuilder.append(") ");
                continue;
            }
            stringBuilder.append(", ");
        }
    }

    private final void super(b.t.c.b.b.q.b object, StringBuilder stringBuilder) {
        if ((object = object.nullclasssuper()) != null) {
            this.super(stringBuilder, (b.t.c.b.b.q.e.i)object, b.t.c.b.b.q.e.c.\u00d300000);
            object = l.super(this, object.forclasssuper(), false, 1, null);
            stringBuilder.append((String)object).append(".");
        }
    }

    private final void super(vb vb2, StringBuilder stringBuilder) {
        Object object;
        l.super(this, stringBuilder, vb2, null, 2, null);
        boolean bl = (this.floatObject.\u00d3o0000() || vb2.\u00f5\u00f6o000().\u00f40O000() != ab.super) && this.super(vb2.\u00d50O000(), stringBuilder);
        this.super((b.t.c.b.b.q.hc)vb2, stringBuilder);
        bl = this.Objectclass() || !vb2.\u00f4\u00f6o000() || bl;
        if (bl) {
            stringBuilder.append(this.\u00d400000("constructor"));
        }
        Object object2 = vb2.\u00d8\u00f6o000();
        if (this.\u00d4\u00d40000()) {
            if (bl) {
                stringBuilder.append(" ");
            }
            this.super((wb)object2, stringBuilder, true);
            this.super(vb2.\u00f8\u00d8o000(), stringBuilder, false);
        }
        this.super((Collection)vb2.\u00f5\u00d8o000(), vb2.o\u00f4o000(), stringBuilder);
        if (this.\u00d4\u00d80000() && !vb2.\u00f4\u00f6o000() && object2 instanceof ib && (object = ((ib)object2).nullintsuper()) != null) {
            object = object.\u00f5\u00d8o000();
            object2 = new ArrayList();
            object = object.iterator();
            while (object.hasNext()) {
                Object t2 = object.next();
                jc jc2 = (jc)t2;
                if (!(!jc2.\u00f80\u00d2000() && jc2.\u00d5O\u00d2000() == null)) continue;
                object2.add(t2);
            }
            object = (List)object2;
            if (!((Collection)object).isEmpty()) {
                stringBuilder.append(" : ").append(this.\u00d400000("this"));
                stringBuilder.append(b.s.mc.o00000((Iterable)object, ", ", "(", ")", 0, null, l$_c$5.\u00f5\u00d3\u00d4000, 24, null));
            }
        }
        if (this.\u00d4\u00d40000()) {
            this.\u00d200000(vb2.\u00f8\u00d8o000(), stringBuilder);
        }
    }

    private final void \u00d200000(List object, StringBuilder stringBuilder) {
        if (this.ObjectObject()) {
            return;
        }
        ArrayList arrayList = new ArrayList(0);
        object = object.iterator();
        while (object.hasNext()) {
            b.t.c.b.b.q.i i2 = (b.t.c.b.b.q.i)object.next();
            Object object2 = b.s.mc.new((Iterable)i2.\u00d8\u00d5o000(), 1);
            Collection collection = arrayList;
            object2 = object2.iterator();
            while (object2.hasNext()) {
                Object object3 = object2.next();
                object3 = (rc)object3;
                Collection collection2 = collection;
                collection2.add(((b)this).super(i2.\u00d5\u00f80000(), false) + " : " + ((b)this).super((rc)object3));
            }
        }
        if (!((Collection)arrayList).isEmpty()) {
            stringBuilder.append(" ").append(this.\u00d400000("where")).append(" ");
            b.s.mc.o00000(arrayList, stringBuilder, ", ", null, null, 0, null, null, 124, null);
        }
    }

    private final void super(Collection object, boolean bl, StringBuilder stringBuilder) {
        bl = this.int(bl);
        int n2 = object.size();
        this.\u00d2\u00d80000().new(n2, stringBuilder);
        object = ((Iterable)object).iterator();
        int n3 = 0;
        while (object.hasNext()) {
            int n4 = n3++;
            jc jc2 = (jc)object.next();
            this.\u00d2\u00d80000().new(jc2, n4, n2, stringBuilder);
            this.super(jc2, bl, stringBuilder, false);
            this.\u00d2\u00d80000().o00000(jc2, n4, n2, stringBuilder);
        }
        this.\u00d2\u00d80000().o00000(n2, stringBuilder);
    }

    private final boolean int(boolean bl) {
        switch (l$_e.o00000[this.\u00d6\u00d40000().ordinal()]) {
            case 1: {
                return true;
            }
            case 2: {
                return !bl;
            }
            case 3: {
                return false;
            }
        }
        throw new qd();
    }

    /*
     * Unable to fully structure code
     */
    private final void super(jc var1_1, boolean var2_2, StringBuilder var3_3, boolean var4_4) {
        if (var4_4) {
            var3_3.append(this.\u00d400000("value-parameter")).append(" ");
        }
        if (this.\u00f4\u00d30000()) {
            var3_3.append("/*").append(var1_1.whilenullsuper()).append("*/ ");
        }
        l.super(this, var3_3, var1_1, null, 2, null);
        this.super(var3_3, var1_1.\u00d3O\u00d2000(), "crossinline");
        this.super(var3_3, var1_1.\u00d4O\u00d2000(), "noinline");
        if (!this.publicclass()) ** GOTO lbl-1000
        var5_5 = var1_1.OO\u00d2000();
        v0 = var5_5 instanceof sb != false ? (sb)var5_5 : null;
        v1 = v0 != null ? v0.\u00f4\u00f6o000() : false;
        if (v1) {
            v2 = true;
        } else lbl-1000:
        // 2 sources

        {
            v2 = var5_6 = false;
        }
        if (v2) {
            this.super(var3_3, this.\u00d2\u00d40000(), "actual");
        }
        this.super(var1_1, var2_2, var3_3, var4_4, var5_6);
        if (this.floatclass() != null && (this.\u00d300000() != false ? var1_1.\u00f80\u00d2000() : b.t.c.b.b.o.f.b.o00000(var1_1)) != false) {
            var3_3.append(" = " + (String)this.floatclass().\u00f800000(var1_1));
        }
    }

    private final void super(v v2, StringBuilder stringBuilder, boolean bl) {
        if (bl || !(v2 instanceof jc)) {
            stringBuilder.append(this.\u00d400000(v2.\u00f4\u00f4o000() ? "var" : "val")).append(" ");
        }
    }

    static /* synthetic */ void super(l l2, v v2, StringBuilder stringBuilder, boolean bl, int n2, Object object) {
        if ((n2 & 4) != 0) {
            bl = false;
        }
        l2.super(v2, stringBuilder, bl);
    }

    private final void super(v v2, boolean bl, StringBuilder stringBuilder, boolean bl2, boolean bl3) {
        rc rc2 = v2.forclasssuper();
        jc jc2 = v2 instanceof jc ? (jc)v2 : null;
        rc rc3 = jc2 != null ? jc2.\u00d5O\u00d2000() : null;
        rc rc4 = rc3;
        if (rc3 == null) {
            rc4 = rc2;
        }
        rc rc5 = rc4;
        this.super(stringBuilder, rc3 != null, "vararg");
        if (bl3 || bl2 && !this.\u00d2\u00d50000()) {
            this.super(v2, stringBuilder, bl3);
        }
        if (bl) {
            this.super((wb)v2, stringBuilder, bl2);
            stringBuilder.append(": ");
        }
        stringBuilder.append(((b)this).super(rc5));
        this.super(v2, stringBuilder);
        if (this.\u00f4\u00d30000() && rc3 != null) {
            stringBuilder.append(" /*").append(((b)this).super(rc2)).append("*/");
        }
    }

    private final void \u00d200000(pb pb2, StringBuilder stringBuilder) {
        if (!this.\u00d2\u00d50000()) {
            if (!this.\u00f4\u00d80000()) {
                this.super(pb2.\u00d4\u00f4o000(), stringBuilder);
                this.super(pb2, stringBuilder);
                this.super(pb2.\u00d50O000(), stringBuilder);
                this.super(stringBuilder, this.publicObject().contains((Object)k.public) && pb2.\u00f5\u00f4o000(), "const");
                this.super((b.t.c.b.b.q.dc)pb2, stringBuilder);
                this.\u00d200000((b.t.c.b.b.q.hc)pb2, stringBuilder);
                this.\u00d300000(pb2, stringBuilder);
                this.super(stringBuilder, this.publicObject().contains((Object)k.OO0000) && pb2.\u00d8\u00f4o000(), "lateinit");
                this.super((b.t.c.b.b.q.hc)pb2, stringBuilder);
            }
            l.super(this, pb2, stringBuilder, false, 4, null);
            this.super(pb2.\u00f8\u00d8o000(), stringBuilder, true);
            this.super((b.t.c.b.b.q.b)pb2, stringBuilder);
        }
        this.super((wb)pb2, stringBuilder, true);
        stringBuilder.append(": ").append(((b)this).super(pb2.forclasssuper()));
        this.\u00d200000((b.t.c.b.b.q.b)pb2, stringBuilder);
        this.super((v)pb2, stringBuilder);
        this.\u00d200000(pb2.\u00f8\u00d8o000(), stringBuilder);
    }

    private final void super(pb b2, StringBuilder stringBuilder) {
        b.t.c.b.b.q.e.i i2;
        if (!this.publicObject().contains((Object)k.\u00d5O0000)) {
            return;
        }
        l.super(this, stringBuilder, b2, null, 2, null);
        zb zb2 = b2.privatevoidsuper();
        if (zb2 != null) {
            i2 = zb2;
            this.super(stringBuilder, i2, b.t.c.b.b.q.e.c.if);
        }
        zb zb3 = b2.\u00f4\u00f8o000();
        if (zb3 != null) {
            i2 = zb3;
            this.super(stringBuilder, i2, b.t.c.b.b.q.e.c.\u00d500000);
        }
        if (this.\u00d3\u00d80000() == b.t.c.b.b.k.m.\u00d500000) {
            cb cb2 = b2.o0\u00d2000();
            if (cb2 != null) {
                i2 = cb2;
                this.super(stringBuilder, i2, b.t.c.b.b.q.e.c.OO0000);
            }
            b.t.c.b.b.q.e e2 = b2.\u00f5\u00f8o000();
            if (e2 != null) {
                i2 = e2;
                b2 = e2;
                this.super(stringBuilder, b2, b.t.c.b.b.q.e.c.\u00d400000);
                b2 = (jc)b.s.mc.\u00d5O0000(i2.\u00f5\u00d8o000());
                this.super(stringBuilder, b2, b.t.c.b.b.q.e.c.o00000);
                return;
            }
        }
    }

    private final void super(v object, StringBuilder stringBuilder) {
        if (this.\u00f4\u00d40000()) {
            j j2 = object.privateclasssuper();
            if (j2 != null) {
                object = j2;
                if ((object = this.super((j)object)) != null) {
                    stringBuilder.append(" = ").append(this.super((String)object));
                }
                return;
            }
        }
    }

    private final void super(b.t.c.b.b.q.h h2, StringBuilder stringBuilder) {
        l.super(this, stringBuilder, h2, null, 2, null);
        this.super(h2.\u00d50O000(), stringBuilder);
        this.super((b.t.c.b.b.q.dc)h2, stringBuilder);
        stringBuilder.append(this.\u00d400000("typealias")).append(" ");
        this.super(h2, stringBuilder, true);
        this.super(h2.\u00d8\u00d6o000(), stringBuilder, false);
        this.super((b.t.c.b.b.q.k)h2, stringBuilder);
        stringBuilder.append(" = ").append(((b)this).super(h2.\u00f5\u00d6o000()));
    }

    private final void super(b.t.c.b.b.q.k k2, StringBuilder stringBuilder) {
        List list = k2.\u00d8\u00d6o000();
        List list2 = k2.\u00d3OO000().\u00f5OO000();
        if (this.\u00f4\u00d30000() && k2.\u00f4\u00d6o000() && list2.size() > list.size()) {
            stringBuilder.append(" /*captured type parameters: ");
            this.\u00d200000(stringBuilder, list2.subList(list.size(), list2.size()));
            stringBuilder.append("*/");
        }
    }

    private final void super(ib ib2, StringBuilder stringBuilder) {
        sb sb2;
        boolean bl;
        boolean bl2 = bl = ib2.privateintsuper() == ec.\u00d400000;
        if (!this.\u00d2\u00d50000()) {
            this.super(ib2.\u00d4o\u00d2000(), stringBuilder);
            l.super(this, stringBuilder, ib2, null, 2, null);
            if (!bl) {
                this.super(ib2.\u00d50O000(), stringBuilder);
            }
            if (!(ib2.privateintsuper() == ec.\u00d600000 && ib2.\u00f40O000() == ab.\u00d400000 || ib2.privateintsuper().super() && ib2.\u00f40O000() == ab.\u00d600000)) {
                this.super(ib2.\u00f40O000(), stringBuilder, this.super(ib2));
            }
            this.super((b.t.c.b.b.q.dc)ib2, stringBuilder);
            this.super(stringBuilder, this.publicObject().contains((Object)k.\u00f500000) && ib2.\u00f4\u00d6o000(), "inner");
            this.super(stringBuilder, this.publicObject().contains((Object)k.\u00d600000) && ib2.Oo\u00d2000(), "data");
            this.super(stringBuilder, this.publicObject().contains((Object)k.oO0000) && ib2.oo\u00d2000(), "inline");
            this.super(stringBuilder, this.publicObject().contains((Object)k.\u00d500000) && ib2.\u00d8o\u00d2000(), "value");
            this.super(stringBuilder, this.publicObject().contains((Object)k.\u00f4O0000) && ib2.\u00f8o\u00d2000(), "fun");
            this.\u00d200000(ib2, stringBuilder);
        }
        if (!n.\u00d2O0000(ib2)) {
            if (!this.\u00d2\u00d50000()) {
                this.super(stringBuilder);
            }
            this.super(ib2, stringBuilder, true);
        } else {
            this.super((wb)ib2, stringBuilder);
        }
        if (bl) {
            return;
        }
        List list = ib2.\u00d8\u00d6o000();
        this.super(list, stringBuilder, false);
        this.super((b.t.c.b.b.q.k)ib2, stringBuilder);
        if (!ib2.privateintsuper().super() && this.O\u00d50000() && (sb2 = ib2.nullintsuper()) != null) {
            stringBuilder.append(" ");
            l.super(this, stringBuilder, sb2, null, 2, null);
            this.super(sb2.\u00d50O000(), stringBuilder);
            stringBuilder.append(this.\u00d400000("constructor"));
            this.super((Collection)sb2.\u00f5\u00d8o000(), sb2.o\u00f4o000(), stringBuilder);
        }
        this.\u00d300000(ib2, stringBuilder);
        this.\u00d200000(list, stringBuilder);
    }

    private final void \u00d300000(ib object, StringBuilder stringBuilder) {
        if (this.\u00f8\u00d40000()) {
            return;
        }
        if (b.t.c.b.b.b.c.\u00f5O0000(object.nullint())) {
            return;
        }
        if ((object = object.\u00d3OO000().\u00d5OO000()).isEmpty() || object.size() == 1 && b.t.c.b.b.b.c.\u00d3O0000((rc)object.iterator().next())) {
            return;
        }
        this.super(stringBuilder);
        stringBuilder.append(": ");
        Iterable iterable = (Iterable)object;
        object = this;
        b.s.mc.o00000(iterable, stringBuilder, ", ", null, null, 0, null, new l$_c$6((l)object), 60, null);
    }

    private final void \u00d200000(ib ib2, StringBuilder stringBuilder) {
        stringBuilder.append(this.\u00d400000(b.\u00f600000.o00000(ib2)));
    }

    private final void super(cc cc2, StringBuilder stringBuilder) {
        this.super(cc2.O0O000(), "package", stringBuilder);
        if (this.\u00d300000()) {
            stringBuilder.append(" in context of ");
            this.super(cc2.ifnull(), stringBuilder, false);
        }
    }

    private final void super(lc lc2, StringBuilder stringBuilder) {
        this.super(lc2.OOO000(), "package-fragment", stringBuilder);
        if (this.\u00d300000()) {
            stringBuilder.append(" in ");
            this.super(lc2.Stringint(), stringBuilder, false);
        }
    }

    private final void super(b.t.c.b.b.d.k object, String string, StringBuilder stringBuilder) {
        stringBuilder.append(this.\u00d400000(string));
        object = ((b)this).super(((b.t.c.b.b.d.k)object).\u00d800000());
        if (((CharSequence)object).length() > 0) {
            stringBuilder.append(" ");
            stringBuilder.append((String)object);
        }
    }

    private final void super(y y2, StringBuilder stringBuilder) {
        this.super((b.t.c.b.b.q.dc)y2, stringBuilder);
    }

    private final void super(StringBuilder stringBuilder) {
        int n2 = stringBuilder.length();
        if (n2 == 0 || stringBuilder.charAt(n2 - 1) != ' ') {
            stringBuilder.append(' ');
        }
    }

    private final boolean super(b.t.c.b.b.q.hc hc2) {
        return !hc2.\u00d5\u00f4o000().isEmpty();
    }

    public final h \u00d3\u00d50000() {
        return this.floatObject.\u00d6o0000();
    }

    @Override
    public final void super(h h2) {
        this.floatObject.super(h2);
    }

    public final boolean superString() {
        return this.floatObject.\u00d8O0000();
    }

    @Override
    public final void \u00f400000(boolean bl) {
        this.floatObject.\u00f400000(bl);
    }

    public final boolean \u00d8\u00d80000() {
        return this.floatObject.int();
    }

    public final Set publicObject() {
        return this.floatObject.\u00f800000();
    }

    @Override
    public final void super(Set set) {
        this.floatObject.super(set);
    }

    public final boolean \u00d2\u00d50000() {
        return this.floatObject.supernew();
    }

    @Override
    public final void \u00d300000(boolean bl) {
        this.floatObject.\u00d300000(bl);
    }

    public final boolean \u00f4\u00d80000() {
        return this.floatObject.do();
    }

    @Override
    public final boolean \u00d300000() {
        return this.floatObject.\u00d300000();
    }

    @Override
    public final void super(boolean bl) {
        this.floatObject.super(bl);
    }

    public final boolean O\u00d50000() {
        return this.floatObject.\u00d3O0000();
    }

    public final boolean \u00f4\u00d30000() {
        return this.floatObject.class();
    }

    @Override
    public final void \u00d800000(boolean bl) {
        this.floatObject.\u00d800000(bl);
    }

    public final boolean \u00d8\u00d50000() {
        return this.floatObject.\u00f4\u00d20000();
    }

    @Override
    public final boolean super() {
        return this.floatObject.super();
    }

    public final boolean \u00f6\u00d50000() {
        return this.floatObject.\u00d2O0000();
    }

    public final boolean \u00f6\u00d30000() {
        return this.floatObject.\u00f8O0000();
    }

    public final boolean \u00f8\u00d30000() {
        return this.floatObject.\u00d3o0000();
    }

    public final boolean \u00d8\u00d60000() {
        return this.floatObject.O\u00d20000();
    }

    public final boolean \u00d4\u00d80000() {
        return this.floatObject.\u00f4O0000();
    }

    public final boolean publicclass() {
        return this.floatObject.\u00d6\u00d30000();
    }

    public final boolean \u00d2\u00d40000() {
        return this.floatObject.\u00d2\u00d20000();
    }

    public final boolean \u00d6\u00d50000() {
        return this.floatObject.\u00d4\u00d30000();
    }

    public final i \u00d4\u00d50000() {
        return this.floatObject.\u00f8\u00d20000();
    }

    public final b$_b \u00d2\u00d80000() {
        return this.floatObject.\u00d6O0000();
    }

    public final d \u00d6\u00d60000() {
        return this.floatObject.\u00d600000();
    }

    @Override
    public final void super(d d2) {
        this.floatObject.super(d2);
    }

    public final Set doString() {
        return this.floatObject.publicsuper();
    }

    @Override
    public final Set \u00d200000() {
        return this.floatObject.\u00d200000();
    }

    @Override
    public final void \u00d200000(Set set) {
        this.floatObject.\u00d200000(set);
    }

    public final b.o.e.g \u00f8\u00d60000() {
        return this.floatObject.classnew();
    }

    public final boolean O\u00d80000() {
        return this.floatObject.\u00f600000();
    }

    @Override
    public final g \u00d400000() {
        return this.floatObject.\u00d400000();
    }

    @Override
    public final void super(g g2) {
        this.floatObject.super(g2);
    }

    public final boolean O\u00d60000() {
        return this.floatObject.\u00f8o0000();
    }

    public final boolean \u00d3\u00d60000() {
        return this.floatObject.\u00d4o0000();
    }

    public final boolean \u00d6\u00d80000() {
        return this.floatObject.\u00d8\u00d20000();
    }

    public final boolean \u00f4\u00d40000() {
        return this.floatObject.Objectsuper();
    }

    public final f \u00d6\u00d40000() {
        return this.floatObject.\u00d2\u00d30000();
    }

    @Override
    public final void super(f f2) {
        this.floatObject.super(f2);
    }

    public final boolean ObjectObject() {
        return this.floatObject.intnew();
    }

    @Override
    public final void \u00d400000(boolean bl) {
        this.floatObject.\u00d400000(bl);
    }

    public final boolean \u00f8\u00d50000() {
        return this.floatObject.\u00f4o0000();
    }

    @Override
    public final void \u00d200000(boolean bl) {
        this.floatObject.\u00d200000(bl);
    }

    public final boolean classString() {
        return this.floatObject.\u00d3\u00d20000();
    }

    @Override
    public final void class(boolean bl) {
        this.floatObject.class(bl);
    }

    public final boolean \u00f8\u00d40000() {
        return this.floatObject.\u00d4\u00d20000();
    }

    @Override
    public final void \u00d600000(boolean bl) {
        this.floatObject.\u00d600000(bl);
    }

    public final b.o.e.g intString() {
        return this.floatObject.\u00f6o0000();
    }

    public final b.o.e.g floatclass() {
        return this.floatObject.\u00f6\u00d20000();
    }

    public final boolean \u00d4\u00d40000() {
        return this.floatObject.\u00f6O0000();
    }

    public final b.t.c.b.b.k.m \u00d3\u00d80000() {
        return this.floatObject.\u00d800000();
    }

    public final boolean interfaceString() {
        return this.floatObject.floatsuper();
    }

    public final boolean floatObject() {
        return this.floatObject.\u00d6\u00d20000();
    }

    public final boolean Objectclass() {
        return this.floatObject.\u00d8o0000();
    }

    public final boolean \u00d4\u00d60000() {
        return this.floatObject.interfacenew();
    }

    public final boolean \u00d3\u00d40000() {
        return this.floatObject.\u00d4O0000();
    }

    public final boolean \u00d2\u00d60000() {
        return this.floatObject.donew();
    }

    public final boolean voidObject() {
        return this.floatObject.voidsuper();
    }

    public final boolean \u00f4\u00d60000() {
        return this.floatObject.\u00d2o0000();
    }

    public final boolean voidclass() {
        return this.floatObject.interface();
    }

    public final boolean \u00f4\u00d50000() {
        return this.floatObject.OO0000();
    }

    private static final b.i Oo0000(o objectArray) {
        Set set = objectArray.\u00d200000();
        Object[] objectArray2 = new b.t.c.b.b.d.k[2];
        objectArray = objectArray2;
        objectArray2[0] = d$_b.O\u00d80000;
        objectArray[1] = d$_b.whilenew;
        objectArray.\u00d200000(ub.super(set, b.s.mc.new(objectArray)));
        return b.i.o00000;
    }

    private static final l super(l l2) {
        return (l)l2.super(l$_c$7.O\u00d4\u00d4000);
    }

    private static final String \u00d300000(l l2, b.t.c.b.b.b.c c2) {
        return b.q.f.\u00d300000(l2.\u00d3\u00d50000().o00000(c2.\u00d6O0000(), l2), "Collection", null, 2, null);
    }

    private static final String super(l l2, b.t.c.b.b.b.c c2) {
        return b.q.f.\u00d300000(l2.\u00d3\u00d50000().o00000(c2.o00000(), l2), "Array", null, 2, null);
    }

    private static final Object \u00d400000(rc rc2) {
        if (rc2 instanceof vc) {
            return ((vc)rc2).newwhilesuper();
        }
        return rc2;
    }

    private static final CharSequence super(l object, hc hc2) {
        Object object2;
        if (hc2.super()) {
            object2 = "*";
        } else {
            object = ((b)object).super(hc2.\u00d300000());
            object2 = hc2.\u00d200000() == w.\u00d400000 ? object : (Object)((Object)hc2.\u00d200000()) + ' ' + (String)object;
        }
        return (CharSequence)object2;
    }

    private static final CharSequence \u00d400000(jc jc2) {
        return "";
    }

    private static final CharSequence \u00d200000(l l2, rc rc2) {
        return ((b)l2).super(rc2);
    }

    public static final /* synthetic */ String super(l l2, String string) {
        return l2.super(string);
    }

    public static final /* synthetic */ void super(l l2, jc jc2, boolean bl, StringBuilder stringBuilder, boolean bl2) {
        l2.super(jc2, bl, stringBuilder, bl2);
    }

    public static final /* synthetic */ void super(l l2, pb pb2, StringBuilder stringBuilder) {
        l2.\u00d200000(pb2, stringBuilder);
    }

    public static final /* synthetic */ void super(l l2, y y2, StringBuilder stringBuilder) {
        l2.super(y2, stringBuilder);
    }

    public static final /* synthetic */ void super(l l2, ic ic2, StringBuilder stringBuilder) {
        l2.super(ic2, stringBuilder);
    }

    public static final /* synthetic */ void super(l l2, vb vb2, StringBuilder stringBuilder) {
        l2.super(vb2, stringBuilder);
    }

    public static final /* synthetic */ void super(l l2, b.t.c.b.b.q.i i2, StringBuilder stringBuilder, boolean bl) {
        l2.super(i2, stringBuilder, bl);
    }

    public static final /* synthetic */ void super(l l2, lc lc2, StringBuilder stringBuilder) {
        l2.super(lc2, stringBuilder);
    }

    public static final /* synthetic */ void super(l l2, cc cc2, StringBuilder stringBuilder) {
        l2.super(cc2, stringBuilder);
    }

    public static final /* synthetic */ void super(l l2, wb wb2, StringBuilder stringBuilder, boolean bl) {
        l2.super(wb2, stringBuilder, bl);
    }

    public static final /* synthetic */ void super(l l2, ib ib2, StringBuilder stringBuilder) {
        l2.super(ib2, stringBuilder);
    }

    public static final /* synthetic */ void super(l l2, b.t.c.b.b.q.h h2, StringBuilder stringBuilder) {
        l2.super(h2, stringBuilder);
    }

    static /* synthetic */ l \u00d200000(l l2) {
        return l.super(l2);
    }

    static /* synthetic */ String \u00d400000(l l2, b.t.c.b.b.b.c c2) {
        return l.\u00d300000(l2, c2);
    }

    static /* synthetic */ String \u00d200000(l l2, b.t.c.b.b.b.c c2) {
        return l.super(l2, c2);
    }

    static /* synthetic */ Object \u00d800000(rc rc2) {
        return l.\u00d400000(rc2);
    }

    static /* synthetic */ CharSequence \u00d200000(l l2, hc hc2) {
        return l.super(l2, hc2);
    }

    static /* synthetic */ CharSequence \u00d300000(jc jc2) {
        return l.\u00d400000(jc2);
    }

    static /* synthetic */ CharSequence super(l l2, rc rc2) {
        return l.\u00d200000(l2, rc2);
    }

    static /* synthetic */ b.i \u00f8O0000(o o2) {
        return l.Oo0000(o2);
    }
}

