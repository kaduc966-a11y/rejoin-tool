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
final class p$_f$2
extends j
implements f {
    Object \u00f8O\u00d2000;
    Object Stringintsuper;
    Object \u00f4O\u00d2000;
    int \u00f5O\u00d2000;
    private /* synthetic */ Object Oo\u00d2000;
    final /* synthetic */ n oo\u00d2000;
    final /* synthetic */ f \u00d8O\u00d2000;

    p$_f$2(n n2, f f2, b b2) {
        this.oo\u00d2000 = n2;
        this.\u00d8O\u00d2000 = f2;
        super(2, b2);
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public final Object \u00d800000(Object var1_1) {
        var2_2 = (l)this.Oo\u00d2000;
        var5_3 = b.r.c.b.\u00d200000();
        switch (this.\u00f5O\u00d2000) {
            case 0: {
                pc.o00000(var1_1);
                var3_4 = this.oo\u00d2000.o00000();
                if (!var3_4.hasNext()) {
                    return i.o00000;
                }
                var1_1 = var3_4.next();
lbl10:
                // 2 sources

                while (var3_4.hasNext()) {
                    var4_5 = var3_4.next();
                    this.Oo\u00d2000 = var2_2;
                    this.\u00f8O\u00d2000 = var3_4;
                    this.Stringintsuper = g.o00000(var1_1);
                    this.\u00f4O\u00d2000 = var4_5;
                    this.\u00f5O\u00d2000 = 1;
                    if (var2_2.o00000(this.\u00d8O\u00d2000.o00000(var1_1, var4_5), (b)this) == var5_3) {
                        return var5_3;
                    }
                    ** GOTO lbl26
                }
                break;
            }
            case 1: {
                var4_5 = this.\u00f4O\u00d2000;
                var3_4 = (Iterator)this.\u00f8O\u00d2000;
                pc.o00000(var1_1);
lbl26:
                // 2 sources

                var1_1 = var4_5;
                ** GOTO lbl10
            }
        }
        return i.o00000;
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override
    public final b new(Object object, b b2) {
        b2 = new p$_f$2(this.oo\u00d2000, this.\u00d8O\u00d2000, b2);
        v0.Oo\u00d2000 = object;
        return b2;
    }

    public final Object o00000(l l2, b b2) {
        return ((p$_f$2)((o)this).new(l2, b2)).\u00d800000(i.o00000);
    }
}

