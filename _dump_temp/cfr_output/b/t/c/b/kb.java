/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b;

import b.dc;
import b.lb;
import b.o.d.fc;
import b.o.e.h;
import b.r;
import b.s.mc;
import b.s.z;
import b.t.c.b.dd;
import b.t.c.b.hd;
import b.t.c.b.kb$_b$0;
import b.t.c.b.o;
import b.t.c.b.wc;
import b.t.p;
import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public abstract class kb
implements p {
    private final dc \u00f4\u00d4o000;

    public kb() {
        kb kb2 = this;
        this.\u00f4\u00d4o000 = r.o00000(lb.\u00d400000, (h)new kb$_b$0(kb2));
    }

    public abstract o \u00d3\u00f60000();

    public abstract boolean nullvoid();

    @Override
    public List \u00d8\u00f50000() {
        return (List)this.\u00f4\u00d4o000.\u00d200000();
    }

    public final boolean equals(Object object) {
        return object instanceof kb && fc.o00000((Object)this.\u00d3\u00f60000(), (Object)((kb)object).\u00d3\u00f60000()) && this.o\u00f60000() == ((kb)object).o\u00f60000();
    }

    public final int hashCode() {
        return this.\u00d3\u00f60000().hashCode() * 31 + Integer.hashCode(this.o\u00f60000());
    }

    public final String toString() {
        return dd.o00000.class(this);
    }

    private static final List new(kb object) {
        Member member = (object = b.t.c.b.dc.o00000((kb)object)) != null ? ((wc)object).o00000() : null;
        return hd.super(member instanceof Method ? z.thisnew(((Method)member).getParameterAnnotations()[((wc)object).\u00d200000()]) : (member instanceof Constructor ? z.thisnew(((Constructor)member).getParameterAnnotations()[((wc)object).\u00d200000()]) : mc.\u00d500000()));
    }

    static /* synthetic */ List o00000(kb kb2) {
        return kb.new(kb2);
    }
}

