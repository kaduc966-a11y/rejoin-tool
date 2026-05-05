/*
 * Decompiled with CFR 0.152.
 */
package b.g;

import b.g.l;
import b.g.n;
import b.i;
import b.o.e.g;
import b.pc;
import b.r.b;
import b.r.d.b.f;
import b.r.d.b.j;
import b.r.d.b.o;
import b.s.mc;
import java.util.Iterator;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
final class t$_f$1
extends j
implements b.o.e.f {
    Object \u00f5\u00d4\u00d2000;
    Object \u00f4\u00d4\u00d2000;
    Object \u00d8\u00d4\u00d2000;
    int \u00d4\u00d4\u00d2000;
    int forfloatsuper;
    private /* synthetic */ Object privatefloatsuper;
    final /* synthetic */ n \u00d5\u00d4\u00d2000;
    final /* synthetic */ b.o.e.f nullfloatsuper;
    final /* synthetic */ g \u00d3\u00d4\u00d2000;

    t$_f$1(n n2, b.o.e.f f2, g g2, b b2) {
        this.\u00d5\u00d4\u00d2000 = n2;
        this.nullfloatsuper = f2;
        this.\u00d3\u00d4\u00d2000 = g2;
        super(2, b2);
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public final Object \u00d800000(Object var1_1) {
        var2_2 = (l)this.privatefloatsuper;
        var6_3 = b.r.c.b.\u00d200000();
        switch (this.forfloatsuper) {
            case 0: {
                pc.o00000(var1_1);
                var3_4 = 0;
                var4_5 = this.\u00d5\u00d4\u00d2000.o00000();
lbl8:
                // 3 sources

                while (var4_5.hasNext()) {
                    var1_1 = var4_5.next();
                    if ((var5_7 = var3_4++) < 0) {
                        mc.\u00d800000();
                    }
                    var5_6 = this.nullfloatsuper.o00000(f.o00000(var5_7), var1_1);
                    this.privatefloatsuper = var2_2;
                    this.\u00f5\u00d4\u00d2000 = var4_5;
                    this.\u00f4\u00d4\u00d2000 = b.r.d.b.g.o00000(var1_1);
                    this.\u00d8\u00d4\u00d2000 = b.r.d.b.g.o00000(var5_6);
                    this.\u00d4\u00d4\u00d2000 = var3_4;
                    this.forfloatsuper = 1;
                    if (var2_2.o00000((Iterator)this.\u00d3\u00d4\u00d2000.\u00f800000(var5_6), (b)this) != var6_3) continue;
                    return var6_3;
                }
                break;
            }
            case 1: {
                var3_4 = this.\u00d4\u00d4\u00d2000;
                var4_5 = (Iterator)this.\u00f5\u00d4\u00d2000;
                pc.o00000(var1_1);
                ** GOTO lbl8
            }
        }
        return i.o00000;
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override
    public final b new(Object object, b b2) {
        b2 = new t$_f$1(this.\u00d5\u00d4\u00d2000, this.nullfloatsuper, this.\u00d3\u00d4\u00d2000, b2);
        v0.privatefloatsuper = object;
        return b2;
    }

    public final Object \u00d800000(l l2, b b2) {
        return ((t$_f$1)((o)this).new(l2, b2)).\u00d800000(i.o00000);
    }
}

