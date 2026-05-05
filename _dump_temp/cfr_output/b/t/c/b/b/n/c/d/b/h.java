/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.n.c.d.b;

import b.m;
import b.o.d.fc;
import b.q.f;
import b.qb;
import b.s.mc;
import b.t.c.b.b.h.ec;
import b.t.c.b.b.h.hc;
import b.t.c.b.b.h.ib;
import b.t.c.b.b.h.rc;
import b.t.c.b.b.h.zb;
import b.t.c.b.b.k.o;
import b.t.c.b.b.n.c.d.b.b;
import b.t.c.b.b.n.c.d.b.h$_b$0;
import b.t.c.b.b.q.kb;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class h
extends b.t.c.b.b.h.f
implements ec {
    private h(ib object, ib ib2, boolean bl) {
        super((ib)object, ib2);
        if (!bl) {
            bl = b.t.c.b.b.h.e.f.o00000.o00000((rc)object, ib2);
            if (m.new && !bl) {
                object = "Lower bound " + object + " of a flexible type must be a subtype of the upper bound " + ib2;
                throw new AssertionError(object);
            }
        }
    }

    public h(ib ib2, ib ib3) {
        this(ib2, ib3, false);
    }

    @Override
    public final ib \u00f5\u00f4\u00d2000() {
        return this.\u00f4\u00f4\u00d2000();
    }

    @Override
    public final b.t.c.b.b.o.e.f \u00f4\u00d6\u00d2000() {
        kb kb2 = ((rc)this).thisdosuper().\u00f4OO000();
        b.t.c.b.b.q.ib ib2 = kb2 instanceof b.t.c.b.b.q.ib ? (b.t.c.b.b.q.ib)kb2 : null;
        if (ib2 == null) {
            throw new IllegalStateException(("Incorrect classifier: " + ((rc)this).thisdosuper().\u00f4OO000()).toString());
        }
        return ib2.o00000(new b(null, 1, null));
    }

    public final h \u00d400000(zb zb2) {
        return new h(this.\u00f4\u00f4\u00d2000().new(zb2), this.\u00d8\u00f4\u00d2000().new(zb2));
    }

    public final h \u00f4o0000(boolean bl) {
        return new h(this.\u00f4\u00f4\u00d2000().\u00d4o0000(bl), this.\u00d8\u00f4\u00d2000().\u00d4o0000(bl));
    }

    @Override
    public final String o00000(b.t.c.b.b.k.b b2, o object) {
        boolean bl;
        String string = b2.super(this.\u00f4\u00f4\u00d2000());
        String string2 = b2.super(this.\u00d8\u00f4\u00d2000());
        if (object.\u00d300000()) {
            return "raw (" + string + ".." + string2 + ')';
        }
        if (this.\u00d8\u00f4\u00d2000().\u00d4\u00d6\u00d2000().isEmpty()) {
            return b2.super(string, string2, b.t.c.b.b.h.b.b.\u00d400000((rc)this));
        }
        object = h.o00000(b2, this.\u00f4\u00f4\u00d2000());
        Object object2 = h.o00000(b2, this.\u00d8\u00f4\u00d2000());
        String string3 = mc.o00000((Iterable)object, ", ", null, null, 0, null, h$_b$0.\u00f8\u00d4\u00d4000, 30, null);
        if (!((object2 = (Iterable)mc.\u00d300000((Iterable)object, (Iterable)object2)) instanceof Collection) || !((Collection)object2).isEmpty()) {
            object = object2.iterator();
            while (object.hasNext()) {
                object2 = (qb)object.next();
                if (h.return((String)((qb)object2).new(), (String)((qb)object2).o00000())) continue;
                bl = false;
                break;
            }
        } else {
            bl = true;
        }
        object = bl ? h.\u00d800000(string2, string3) : string2;
        object2 = h.\u00d800000(string, string3);
        if (fc.o00000(object2, object)) {
            return object2;
        }
        return b2.super((String)object2, (String)object, b.t.c.b.b.h.b.b.\u00d400000((rc)this));
    }

    public final b.t.c.b.b.h.f Oo0000(b.t.c.b.b.h.e.b b2) {
        return new h((ib)b2.\u00d200000(this.\u00f4\u00f4\u00d2000()), (ib)b2.\u00d200000(this.\u00d8\u00f4\u00d2000()), true);
    }

    private static final boolean return(String string, String string2) {
        return fc.o00000((Object)string, (Object)f.\u00d300000(string2, (CharSequence)"out ")) || fc.o00000((Object)string2, (Object)"*");
    }

    private static final List o00000(b.t.c.b.b.k.b b2, rc object) {
        Object object2 = object = (Iterable)((rc)object).\u00d4\u00d6\u00d2000();
        object = new ArrayList(mc.o00000((Iterable)object, 10));
        object2 = object2.iterator();
        while (object2.hasNext()) {
            Object object3 = object2.next();
            object3 = (hc)object3;
            Object object4 = object;
            object4.add(b2.super((hc)object3));
        }
        return (List)object;
    }

    private static final String \u00d800000(String string, String string2) {
        if (!f.\u00d300000((CharSequence)string, '<', false, 2, null)) {
            return string;
        }
        return f.\u00d200000(string, '<', null, 2, null) + '<' + string2 + '>' + f.\u00d400000(string, '>', null, 2, null);
    }

    private static final CharSequence if(String string) {
        return "(raw) ".concat(String.valueOf(string));
    }

    static /* synthetic */ CharSequence \u00f800000(String string) {
        return h.if(string);
    }
}

