/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b;

import b.ce;
import b.dc;
import b.i;
import b.lb;
import b.o.d.ib;
import b.r;
import b.s.mc;
import b.t.c.b.b.c.b.k;
import b.t.c.b.b.c.c.b;
import b.t.c.b.b.c.c.b$_d;
import b.t.c.b.b.c.c.b$_e;
import b.t.c.b.b.c.e;
import b.t.c.b.b.c.u;
import b.t.c.b.b.c.y;
import b.t.c.b.b.f.b.b.d;
import b.t.c.b.b.n.b.b.c;
import b.t.c.b.b.o.e.b$_b;
import b.t.c.b.b.o.e.f;
import b.t.c.b.b.o.e.f$_b;
import b.t.c.b.b.o.e.m;
import b.t.c.b.b.q.d.c.n;
import b.t.c.b.b.q.hc;
import b.t.c.b.gb;
import b.t.c.b.h;
import b.t.c.b.h$_c;
import b.t.c.b.jc;
import b.t.c.b.jc$_c$_b$0;
import b.t.c.b.jc$_c$_b$1;
import b.t.c.b.jc$_c$_b$2;
import b.t.c.b.jc$_c$_b$3;
import b.t.c.b.jc$_c$_b$4;
import b.t.c.b.jc$_c$_c$2$_b$1;
import b.t.c.b.p;
import b.t.c.b.v;
import b.t.c.b.v$_b;
import b.t.c.b.zc;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
final class jc$_c
extends h$_c {
    static final /* synthetic */ b.t.m[] \u00d300000;
    private final dc \u00d3o0000;
    private final v$_b \u00d6o0000;
    private final v$_b floatsuper;
    private final dc \u00d2o0000;
    private final v$_b \u00d4o0000;
    final /* synthetic */ jc super;

    public jc$_c(jc object) {
        this.super = object;
        super((h)object);
        object = this;
        Object object2 = this.super;
        this.\u00d3o0000 = r.o00000(lb.\u00d400000, (b.o.e.h)new jc$_c$_b$0((jc)object2, (jc$_c)object));
        object = this.super;
        this.\u00d6o0000 = v.super(new jc$_c$_b$1((jc)object));
        object = this;
        this.floatsuper = v.super(new jc$_c$_b$2((jc$_c)object));
        jc$_c jc$_c = this;
        object = jc$_c.super;
        object2 = jc$_c;
        this.\u00d2o0000 = r.o00000(lb.\u00d400000, (b.o.e.h)new jc$_c$_b$3((jc$_c)object2, (jc)object));
        object = this.super;
        object2 = this;
        this.\u00d4o0000 = v.super(new jc$_c$_b$4((jc$_c)object2, (jc)object));
    }

    public final List \u00d4o0000() {
        return (List)this.\u00d3o0000.\u00d200000();
    }

    public final n \u00d6o0000() {
        return (n)this.\u00d6o0000.\u00f800000(this, \u00d300000[0]);
    }

    public final f \u00d5o0000() {
        return (f)this.floatsuper.\u00f800000(this, \u00d300000[1]);
    }

    public final Class \u00d2o0000() {
        return (Class)this.\u00d2o0000.\u00d200000();
    }

    public final Collection intsuper() {
        return (Collection)this.\u00d4o0000.\u00f800000(this, \u00d300000[2]);
    }

    private static final List \u00d200000(jc object, jc$_c object2) {
        if (zc.new()) {
            Object object3;
            ce ce2 = ((jc)object).iffor().getAnnotation(ce.class);
            if (ce2 != null) {
                object2 = ce2;
                object3 = b.\u00d200000.o00000((ce)object2);
            } else {
                object3 = object2 = null;
            }
            if (object3 instanceof b$_d) {
                return mc.o00000(((b$_d)object2).\u00d200000());
            }
            if (object2 instanceof b.t.c.b.b.c.c.b$_b) {
                return mc.o00000(((b.t.c.b.b.c.c.b$_b)object2).String());
            }
            if (object2 instanceof b$_e) {
                Object object4 = ((b$_e)object2).\u00d300000();
                object2 = new ArrayList();
                object4 = object4.iterator();
                while (object4.hasNext()) {
                    Object object5 = (String)object4.next();
                    object5 = ((jc$_c)jc.\u00d300000((jc)b.t.c.b.n.\u00f400000(((jc)object).iffor().getClassLoader().loadClass(b.q.f.super((String)object5, '/', '.', false, 4, null)))).\u00d200000()).\u00d4o0000();
                    mc.new((Collection)object2, (Iterable)object5);
                }
                return (List)object2;
            }
            return mc.\u00d500000();
        }
        Object object6 = object2 = (Iterable)((object2 = ((jc$_c)object2).\u00d5o0000()) instanceof d ? mc.o00000(object2) : (object2 instanceof m ? ((m)object2).\u00f600000() : mc.\u00d500000()));
        object2 = new ArrayList(mc.o00000((Iterable)object2, 10));
        object6 = object6.iterator();
        while (object6.hasNext()) {
            Object object7 = object6.next();
            object7 = (f)object7;
            object = object2;
            object.add(k.o00000(((d)object7).interface(), ((d)object7).OO0000().\u00f500000(), false, null, 6, null));
        }
        return (List)object2;
    }

    private static final n \u00d200000(jc jc2) {
        return n.\u00d200000.super(jc2.iffor());
    }

    private static final f \u00d200000(jc$_c jc$_c) {
        n n2 = jc$_c.\u00d6o0000();
        if (n2 != null) {
            return jc$_c.o00000().\u00d300000().o00000(n2);
        }
        return f$_b.\u00f6\u00d30000;
    }

    private static final Class \u00d400000(jc$_c object, jc jc2) {
        Object object2 = ((jc$_c)object).\u00d6o0000();
        if ((object2 != null && (object2 = ((n)object2).\u00d200000()) != null ? ((c)object2).\u00d300000() : (object = null)) != null && ((CharSequence)object).length() > 0) {
            return jc2.iffor().getClassLoader().loadClass(b.q.f.super((String)object, '/', '.', false, 4, null));
        }
        return null;
    }

    private static final List o00000(jc$_c iterator, jc object2) {
        if (zc.\u00d300000()) {
            jc$_c$_c$2$_b$1 jc$_c$_c$2$_b$1 = new jc$_c$_c$2$_b$1((jc)object2);
            Iterable iterable = b$_b.o00000(((jc$_c)((Object)iterator)).\u00d5o0000(), null, null, 3, null);
            Collection collection = new ArrayList();
            for (Object object2 : iterable) {
                gb gb2 = object2 instanceof hc ? (gb)object2.o00000(jc$_c$_c$2$_b$1, i.o00000) : null;
                if (gb2 == null) continue;
                object2 = gb2;
                collection.add(object2);
            }
            return mc.\u00f5O0000((Iterable)((List)collection));
        }
        List list = new ArrayList();
        for (y y2 : ((jc$_c)((Object)iterator)).\u00d4o0000()) {
            for (Object object3 : y2.Object()) {
                list.add(p.super((e)object3, (h)object2));
            }
            for (Object object3 : y2.\u00d200000()) {
                list.add(p.super((u)object3, (h)object2));
            }
        }
        return mc.\u00f5O0000((Iterable)list);
    }

    static {
        b.t.m[] mArray = new b.t.m[3];
        b.t.m[] mArray2 = mArray;
        mArray[0] = new ib(jc$_c.class, "kotlinClass", "getKotlinClass()Lorg/jetbrains/kotlin/descriptors/runtime/components/ReflectKotlinClass;", 0);
        mArray2[1] = new ib(jc$_c.class, "scope", "getScope()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;", 0);
        mArray2[2] = new ib(jc$_c.class, "members", "getMembers()Ljava/util/Collection;", 0);
        \u00d300000 = mArray2;
    }

    static /* synthetic */ List o00000(jc jc2, jc$_c jc$_c) {
        return jc$_c.\u00d200000(jc2, jc$_c);
    }

    static /* synthetic */ n o00000(jc jc2) {
        return jc$_c.\u00d200000(jc2);
    }

    static /* synthetic */ f o00000(jc$_c jc$_c) {
        return jc$_c.\u00d200000(jc$_c);
    }

    static /* synthetic */ Class Object(jc$_c jc$_c, jc jc2) {
        return jc$_c.\u00d400000(jc$_c, jc2);
    }

    static /* synthetic */ List \u00d200000(jc$_c jc$_c, jc jc2) {
        return jc$_c.o00000(jc$_c, jc2);
    }
}

