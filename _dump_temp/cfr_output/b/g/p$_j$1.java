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
import b.r.d.b.j;
import b.r.d.b.o;
import java.util.Iterator;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
final class p$_j$1
extends j
implements f {
    Object \u00d4o\u00d2000;
    Object \u00d3o\u00d2000;
    int nullintsuper;
    private /* synthetic */ Object \u00d5o\u00d2000;
    final /* synthetic */ n forintsuper;
    final /* synthetic */ f \u00d8o\u00d2000;

    p$_j$1(n n2, f f2, b b2) {
        this.forintsuper = n2;
        this.\u00d8o\u00d2000 = f2;
        super(2, b2);
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public final Object \u00d800000(Object var1_1) {
        var2_2 = (l)this.\u00d5o\u00d2000;
        var5_3 = b.r.c.b.\u00d200000();
        switch (this.nullintsuper) {
            case 0: {
                pc.o00000(var1_1);
                var3_4 = this.forintsuper.o00000();
                if (!var3_4.hasNext()) break;
                var4_5 = var3_4.next();
                this.\u00d5o\u00d2000 = var2_2;
                this.\u00d4o\u00d2000 = var3_4;
                this.\u00d3o\u00d2000 = var4_5;
                this.nullintsuper = 1;
                if (var2_2.o00000(var4_5, (b)this) == var5_3) {
                    return var5_3;
                }
                ** GOTO lbl20
            }
            case 1: {
                var4_5 = this.\u00d3o\u00d2000;
                var3_4 = (Iterator)this.\u00d4o\u00d2000;
                pc.o00000(var1_1);
lbl20:
                // 4 sources

                while (var3_4.hasNext()) {
                    var4_5 = this.\u00d8o\u00d2000.o00000(var4_5, var3_4.next());
                    this.\u00d5o\u00d2000 = var2_2;
                    this.\u00d4o\u00d2000 = var3_4;
                    this.\u00d3o\u00d2000 = var4_5;
                    this.nullintsuper = 2;
                    if (var2_2.o00000(var4_5, (b)this) != var5_3) continue;
                    return var5_3;
                }
                break;
            }
            case 2: {
                var4_5 = this.\u00d3o\u00d2000;
                var3_4 = (Iterator)this.\u00d4o\u00d2000;
                pc.o00000(var1_1);
                ** GOTO lbl20
            }
        }
        return i.o00000;
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override
    public final b new(Object object, b b2) {
        b2 = new p$_j$1(this.forintsuper, this.\u00d8o\u00d2000, b2);
        v0.\u00d5o\u00d2000 = object;
        return b2;
    }

    public final Object new(l l2, b b2) {
        return ((p$_j$1)((o)this).new(l2, b2)).\u00d800000(i.o00000);
    }
}

