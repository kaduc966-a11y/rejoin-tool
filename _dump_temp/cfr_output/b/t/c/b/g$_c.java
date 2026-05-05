/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b;

import b.s.mc;
import b.s.z;
import b.t.c.b.b.c.cb;
import b.t.c.b.b.c.l;
import b.t.c.b.b.c.n;
import b.t.c.b.d;
import b.t.c.b.d.b;
import b.t.c.b.g;
import b.t.c.b.h;
import b.t.c.b.hd;
import b.t.c.b.lc;
import b.t.c.b.p;
import b.t.j;
import b.t.k;
import b.t.m$_b;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.List;

public abstract class g$_c
extends d
implements k,
m$_b {
    public abstract g Stringpublic();

    public abstract n \u00f8\u00f4O000();

    @Override
    public h o\u00d8O000() {
        return this.Stringpublic().o\u00d8O000();
    }

    @Override
    public b \u00d3\u00d8O000() {
        return null;
    }

    @Override
    public Object O\u00d8O000() {
        return this.Stringpublic().O\u00d8O000();
    }

    @Override
    public List O\u00d4O000() {
        return this.Stringpublic().O\u00d4O000();
    }

    @Override
    public l \u00d4\u00d8O000() {
        Object object = this.\u00f8\u00f4O000();
        if (object == null || (object = b.t.c.b.b.c.b.\u00d200000(object)) == null) {
            object = ((d)this.Stringpublic()).\u00d4\u00d8O000();
        }
        return object;
    }

    @Override
    public j \u00f8\u00d5O000() {
        Object object = this.\u00f8\u00f4O000();
        if (object == null || (object = b.t.c.b.b.c.b.Object(object)) == null || (object = p.super((cb)((Object)object))) == null) {
            object = this.Stringpublic().\u00f8\u00d5O000();
        }
        return object;
    }

    @Override
    public boolean \u00d8\u00d8O000() {
        n n2 = this.\u00f8\u00f4O000();
        if (n2 != null) {
            return b.t.c.b.b.c.b.o00000(n2);
        }
        return false;
    }

    @Override
    public boolean \u00f4\u00d8O000() {
        n n2 = this.\u00f8\u00f4O000();
        if (n2 != null) {
            return b.t.c.b.b.c.b.\u00d400000(n2);
        }
        return false;
    }

    @Override
    public boolean \u00d5\u00d8O000() {
        return false;
    }

    @Override
    public boolean returnwhile() {
        return false;
    }

    @Override
    public boolean \u00f4\u00d5O000() {
        return false;
    }

    @Override
    public List \u00d8\u00f50000() {
        List list;
        if (lc.o00000(this.Stringpublic())) {
            return mc.\u00d500000();
        }
        Member member = this.privatedo().Object();
        Object[] objectArray = member instanceof Method ? (Object[])member : null;
        if ((objectArray != null && (objectArray = objectArray.getAnnotations()) != null ? z.thisnew(objectArray) : (list = null)) == null) {
            list = mc.\u00d500000();
        }
        return hd.super(list);
    }
}

