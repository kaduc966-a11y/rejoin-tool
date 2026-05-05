/*
 * Decompiled with CFR 0.152.
 */
package b.g;

import b.g.l;
import b.g.n;
import b.i;
import b.o.e.f;
import b.pc;
import b.r.b;
import b.r.d.b.g;
import b.r.d.b.j;
import b.r.d.b.o;
import java.util.Iterator;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
final class p$_k$1
extends j
implements f {
    Object o\u00d2\u00d2000;
    Object O\u00d2\u00d2000;
    Object privateintsuper;
    int \u00f8o\u00d2000;
    private /* synthetic */ Object newifsuper;
    final /* synthetic */ Object \u00f5o\u00d2000;
    final /* synthetic */ n \u00f4o\u00d2000;
    final /* synthetic */ f \u00d3\u00d2\u00d2000;

    p$_k$1(Object object, n n2, f f2, b b2) {
        this.\u00f5o\u00d2000 = object;
        this.\u00f4o\u00d2000 = n2;
        this.\u00d3\u00d2\u00d2000 = f2;
        super(2, b2);
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public final Object \u00d800000(Object var1_1) {
        var2_2 = (l)this.newifsuper;
        var5_3 = b.r.c.b.\u00d200000();
        switch (this.\u00f8o\u00d2000) {
            case 0: {
                pc.o00000(var1_1);
                this.newifsuper = var2_2;
                this.\u00f8o\u00d2000 = 1;
                if (var2_2.o00000(this.\u00f5o\u00d2000, (b)this) == var5_3) {
                    return var5_3;
                }
                ** GOTO lbl13
            }
            case 1: {
                pc.o00000(var1_1);
lbl13:
                // 2 sources

                var3_4 = this.\u00f5o\u00d2000;
                var4_5 = this.\u00f4o\u00d2000.o00000();
lbl15:
                // 3 sources

                while (var4_5.hasNext()) {
                    var1_1 = var4_5.next();
                    var3_4 = this.\u00d3\u00d2\u00d2000.o00000(var3_4, var1_1);
                    this.newifsuper = var2_2;
                    this.o\u00d2\u00d2000 = var3_4;
                    this.O\u00d2\u00d2000 = var4_5;
                    this.privateintsuper = g.o00000(var1_1);
                    this.\u00f8o\u00d2000 = 2;
                    if (var2_2.o00000(var3_4, (b)this) != var5_3) continue;
                    return var5_3;
                }
                break;
            }
            case 2: {
                var4_5 = (Iterator)this.O\u00d2\u00d2000;
                var3_4 = this.o\u00d2\u00d2000;
                pc.o00000(var1_1);
                ** GOTO lbl15
            }
        }
        return i.o00000;
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override
    public final b new(Object object, b b2) {
        b2 = new p$_k$1(this.\u00f5o\u00d2000, this.\u00f4o\u00d2000, this.\u00d3\u00d2\u00d2000, b2);
        v0.newifsuper = object;
        return b2;
    }

    public final Object \u00d300000(l l2, b b2) {
        return ((p$_k$1)((o)this).new(l2, b2)).\u00d800000(i.o00000);
    }
}

