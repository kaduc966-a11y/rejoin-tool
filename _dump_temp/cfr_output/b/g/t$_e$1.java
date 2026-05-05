/*
 * Decompiled with CFR 0.152.
 */
package b.g;

import b.g.c;
import b.g.l;
import b.g.n;
import b.i;
import b.o.e.f;
import b.pc;
import b.r.b;
import b.r.d.b.g;
import b.r.d.b.j;
import b.r.d.b.o;
import b.s.mc;
import java.util.Collection;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
final class t$_e$1
extends j
implements f {
    Object \u00f5\u00d3\u00d2000;
    Object \u00f4\u00d3\u00d2000;
    Object thisfloatsuper;
    int \u00f8\u00d3\u00d2000;
    int \u00d8\u00d3\u00d2000;
    private /* synthetic */ Object Stringfloatsuper;
    final /* synthetic */ n o\u00d4\u00d2000;
    final /* synthetic */ b.b.f O\u00d4\u00d2000;

    t$_e$1(n n2, b.b.f f2, b b2) {
        this.o\u00d4\u00d2000 = n2;
        this.O\u00d4\u00d2000 = f2;
        super(2, b2);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final Object \u00d800000(Object object) {
        List list;
        l l2 = (l)this.Stringfloatsuper;
        Object object2 = b.r.c.b.\u00d200000();
        switch (this.\u00d8\u00d3\u00d2000) {
            case 0: {
                pc.o00000(object);
                list = c.whilesuper(this.o\u00d4\u00d2000);
                break;
            }
            case 1: {
                list = (List)this.\u00f5\u00d3\u00d2000;
                pc.o00000(object);
                break;
            }
            default: {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
        while (!((Collection)list).isEmpty()) {
            int n2 = this.O\u00d4\u00d2000.o00000(list.size());
            Object object3 = mc.if(list);
            Object object4 = n2 < list.size() ? list.set(n2, object3) : object3;
            this.Stringfloatsuper = l2;
            this.\u00f5\u00d3\u00d2000 = list;
            this.\u00f4\u00d3\u00d2000 = g.o00000(object3);
            this.thisfloatsuper = g.o00000(object4);
            this.\u00f8\u00d3\u00d2000 = n2;
            this.\u00d8\u00d3\u00d2000 = 1;
            if (l2.o00000(object4, (b)this) != object2) continue;
            return object2;
        }
        return i.o00000;
    }

    @Override
    public final b new(Object object, b b2) {
        b2 = new t$_e$1(this.o\u00d4\u00d2000, this.O\u00d4\u00d2000, b2);
        v0.Stringfloatsuper = object;
        return b2;
    }

    public final Object return(l l2, b b2) {
        return ((t$_e$1)((o)this).new(l2, b2)).\u00d800000(i.o00000);
    }
}

