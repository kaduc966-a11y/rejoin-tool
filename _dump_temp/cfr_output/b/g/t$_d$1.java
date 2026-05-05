/*
 * Decompiled with CFR 0.152.
 */
package b.g;

import b.g.l;
import b.g.n;
import b.i;
import b.o.e.f;
import b.o.e.h;
import b.pc;
import b.r.b;
import b.r.d.b.g;
import b.r.d.b.j;
import b.r.d.b.o;
import java.util.Iterator;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
final class t$_d$1
extends j
implements f {
    Object \u00d4\u00d3\u00d2000;
    int whileifsuper;
    private /* synthetic */ Object \u00d5\u00d3\u00d2000;
    final /* synthetic */ n \u00d3\u00d3\u00d2000;
    final /* synthetic */ h o\u00d3\u00d2000;

    t$_d$1(n n2, h h2, b b2) {
        this.\u00d3\u00d3\u00d2000 = n2;
        this.o\u00d3\u00d2000 = h2;
        super(2, b2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final Object \u00d800000(Object object) {
        l l2 = (l)this.\u00d5\u00d3\u00d2000;
        Object object2 = b.r.c.b.\u00d200000();
        switch (this.whileifsuper) {
            case 0: {
                pc.o00000(object);
                object = this.\u00d3\u00d3\u00d2000.o00000();
                if (!object.hasNext()) break;
                this.\u00d5\u00d3\u00d2000 = g.o00000(l2);
                this.\u00d4\u00d3\u00d2000 = g.o00000(object);
                this.whileifsuper = 1;
                if (l2.o00000((Iterator)object, (b)this) != object2) return i.o00000;
                return object2;
            }
            case 1: {
                Iterator cfr_ignored_0 = (Iterator)this.\u00d4\u00d3\u00d2000;
                pc.o00000(object);
                return i.o00000;
            }
        }
        this.\u00d5\u00d3\u00d2000 = g.o00000(l2);
        this.\u00d4\u00d3\u00d2000 = g.o00000(object);
        this.whileifsuper = 2;
        if (l2.o00000((n)this.o\u00d3\u00d2000.newreturn(), (b)this) != object2) return i.o00000;
        return object2;
        {
            case 2: {
                Iterator cfr_ignored_1 = (Iterator)this.\u00d4\u00d3\u00d2000;
                pc.o00000(object);
                return i.o00000;
            }
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override
    public final b new(Object object, b b2) {
        b2 = new t$_d$1(this.\u00d3\u00d3\u00d2000, this.o\u00d3\u00d2000, b2);
        v0.\u00d5\u00d3\u00d2000 = object;
        return b2;
    }

    public final Object \u00d500000(l l2, b b2) {
        return ((t$_d$1)((o)this).new(l2, b2)).\u00d800000(i.o00000);
    }
}

