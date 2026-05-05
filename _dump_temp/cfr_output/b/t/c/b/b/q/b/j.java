/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.q.b;

import b.m;
import b.o.d.w;
import b.t.c.b.b.d.f;
import b.t.c.b.b.h.kc;
import b.t.c.b.b.h.rc;
import b.t.c.b.b.i.c;
import b.t.c.b.b.i.l;
import b.t.c.b.b.q.ab;
import b.t.c.b.b.q.b;
import b.t.c.b.b.q.b.i;
import b.t.c.b.b.q.b.j$_b$0;
import b.t.c.b.b.q.b.j$_c;
import b.t.c.b.b.q.b.q;
import b.t.c.b.b.q.e.o;
import b.t.c.b.b.q.g;
import b.t.c.b.b.q.h;
import b.t.c.b.b.q.hc$_b;
import b.t.c.b.b.q.ib;
import b.t.c.b.b.q.ic;
import b.t.c.b.b.q.mc;
import b.t.c.b.b.q.s;
import b.t.c.b.b.q.sb;
import b.t.c.b.b.q.wb;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class j
extends i
implements q {
    public static final j$_c StringfloatObject;
    static final /* synthetic */ b.t.m[] \u00f5\u00d5\u00d6000;
    private final l \u00d8\u00d5\u00d6000;
    private final h \u00f4\u00d5\u00d6000;
    private final c thisfloatObject;
    private sb \u00d5\u00d5\u00d6000;

    private j(l object, h rb2, sb sb2, q q2, o o2, hc$_b hc$_b, g g2) {
        super((wb)((Object)rb2), q2, o2, b.t.c.b.b.d.j.\u00d300000, hc$_b, g2);
        this.\u00d8\u00d5\u00d6000 = object;
        this.\u00f4\u00d5\u00d6000 = rb2;
        j j2 = this;
        j2.\u00f8O0000(j2.\u00f50\u00d2000().thisint());
        object = sb2;
        rb2 = this;
        this.thisfloatObject = this.\u00d8\u00d5\u00d6000.\u00d200000(new j$_b$0((j)rb2, (sb)object));
        this.\u00d5\u00d5\u00d6000 = sb2;
    }

    public final h \u00f50\u00d2000() {
        return this.\u00f4\u00d5\u00d6000;
    }

    @Override
    public final sb \u00d80\u00d2000() {
        return this.\u00d5\u00d5\u00d6000;
    }

    @Override
    public final boolean \u00f4\u00f6o000() {
        return this.\u00d80\u00d2000().\u00f4\u00f6o000();
    }

    public final h \u00f40\u00d2000() {
        return this.\u00f50\u00d2000();
    }

    @Override
    public final ib \u00f5\u00f6o000() {
        return this.\u00d80\u00d2000().\u00f5\u00f6o000();
    }

    @Override
    public final rc \u00d3\u00f4o000() {
        return super.\u00d3\u00f4o000();
    }

    public final q ifnullsuper() {
        return (q)super.\u00f5\u00f5o000();
    }

    public final q \u00f400000(kc object) {
        object = (j)super.\u00d300000((kc)object);
        Object object2 = kc.o00000(((i)object).\u00d3\u00f4o000());
        sb sb2 = this.\u00d80\u00d2000().Stringvoidsuper().return((kc)object2);
        if (sb2 == null) {
            return null;
        }
        ((j)object).\u00d5\u00d5\u00d6000 = object2 = sb2;
        return (q)object;
    }

    public final q \u00d800000(wb wb2, ab ab2, s s2, hc$_b hc$_b, boolean bl) {
        return (q)this.ifreturnsuper().o00000(wb2).o00000(ab2).o00000(s2).o00000(hc$_b).o00000(bl).\u00d500000();
    }

    protected final j return(wb object, ic ic2, hc$_b hc$_b, f f2, o o2, g g2) {
        boolean bl;
        boolean bl2 = bl = hc$_b == hc$_b.\u00d400000 || hc$_b == hc$_b.\u00d200000;
        if (m.new && !bl) {
            object = "Creating a type alias constructor that is not a declaration: \ncopy from: " + this + "\nnewOwner: " + object + "\nkind: " + (Object)((Object)hc$_b);
            throw new AssertionError(object);
        }
        boolean bl3 = bl = f2 == null;
        if (m.new && !bl) {
            object = "Renaming type alias constructor: ".concat(String.valueOf(this));
            throw new AssertionError(object);
        }
        return new j(this.\u00d8\u00d5\u00d6000, this.\u00f50\u00d2000(), this.\u00d80\u00d2000(), this, o2, hc$_b.\u00d400000, g2);
    }

    private static final j new(j j2, sb iterator) {
        Object object;
        j j3;
        b b2 = j3 = new j(j2.\u00d8\u00d5\u00d6000, j2.\u00f50\u00d2000(), (sb)((Object)iterator), j2, iterator.\u00d4\u00f80000(), iterator.O\u00f5o000(), j2.\u00f50\u00d2000().\u00f4\u00f80000());
        kc kc2 = j$_c.super(StringfloatObject, j2.\u00f50\u00d2000());
        if (kc2 == null) {
            return null;
        }
        kc kc3 = kc2;
        j j4 = b2;
        mc mc2 = iterator.Stringclasssuper();
        iterator = iterator.\u00d4\u00f4o000();
        b2 = mc2 != null ? mc2.if(kc3) : null;
        j j5 = j4;
        Iterator iterator2 = iterator;
        iterator = new ArrayList(b.s.mc.o00000((Iterable)((Object)iterator), 10));
        iterator2 = iterator2.iterator();
        while (iterator2.hasNext()) {
            Object object2 = iterator2.next();
            object2 = (mc)object2;
            object = iterator;
            object.add(object2.if(kc3));
        }
        object = (List)((Object)iterator);
        j5.o00000(null, (mc)b2, (List)object, j2.\u00f50\u00d2000().\u00d8\u00d6o000(), j2.\u00f5\u00d8o000(), ((i)j2).\u00d3\u00f4o000(), ab.\u00d600000, j2.\u00f50\u00d2000().\u00d50O000());
        return j3;
    }

    public /* synthetic */ j(l l2, h h2, sb sb2, q q2, o o2, hc$_b hc$_b, g g2, w w2) {
        this(l2, h2, sb2, q2, o2, hc$_b, g2);
    }

    static {
        b.t.m[] mArray = new b.t.m[1];
        b.t.m[] mArray2 = mArray;
        mArray[0] = new b.o.d.ib(j.class, "withDispatchReceiver", "getWithDispatchReceiver()Lorg/jetbrains/kotlin/descriptors/impl/TypeAliasConstructorDescriptor;", 0);
        \u00f5\u00d5\u00d6000 = mArray2;
        StringfloatObject = new j$_c(null);
    }

    static /* synthetic */ j o00000(j j2, sb sb2) {
        return j.new(j2, sb2);
    }
}

