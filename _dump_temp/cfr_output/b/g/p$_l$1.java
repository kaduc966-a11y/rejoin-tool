/*
 * Decompiled with CFR 0.152.
 */
package b.g;

import b.g.l;
import b.g.n;
import b.i;
import b.o.e.e;
import b.pc;
import b.r.b;
import b.r.d.b.f;
import b.r.d.b.g;
import b.r.d.b.j;
import b.r.d.b.o;
import b.s.mc;
import java.util.Iterator;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
final class p$_l$1
extends j
implements b.o.e.f {
    Object \u00f8\u00d2\u00d2000;
    Object ififsuper;
    Object \u00f5\u00d2\u00d2000;
    int returnifsuper;
    int \u00f4\u00d2\u00d2000;
    private /* synthetic */ Object O\u00d3\u00d2000;
    final /* synthetic */ Object \u00d8\u00d2\u00d2000;
    final /* synthetic */ n \u00d5\u00d2\u00d2000;
    final /* synthetic */ e \u00d4\u00d2\u00d2000;

    p$_l$1(Object object, n n2, e e2, b b2) {
        this.\u00d8\u00d2\u00d2000 = object;
        this.\u00d5\u00d2\u00d2000 = n2;
        this.\u00d4\u00d2\u00d2000 = e2;
        super(2, b2);
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public final Object \u00d800000(Object var1_1) {
        var2_2 = (l)this.O\u00d3\u00d2000;
        var7_3 = b.r.c.b.\u00d200000();
        switch (this.\u00f4\u00d2\u00d2000) {
            case 0: {
                pc.o00000(var1_1);
                this.O\u00d3\u00d2000 = var2_2;
                this.\u00f4\u00d2\u00d2000 = 1;
                if (var2_2.o00000(this.\u00d8\u00d2\u00d2000, (b)this) == var7_3) {
                    return var7_3;
                }
                ** GOTO lbl13
            }
            case 1: {
                pc.o00000(var1_1);
lbl13:
                // 2 sources

                var3_4 = 0;
                var4_5 = this.\u00d8\u00d2\u00d2000;
                var5_6 = this.\u00d5\u00d2\u00d2000.o00000();
lbl16:
                // 3 sources

                while (var5_6.hasNext()) {
                    var1_1 = var5_6.next();
                    if ((var6_7 = var3_4++) < 0) {
                        mc.\u00d800000();
                    }
                    var4_5 = this.\u00d4\u00d2\u00d2000.o00000(f.o00000(var6_7), var4_5, var1_1);
                    this.O\u00d3\u00d2000 = var2_2;
                    this.\u00f8\u00d2\u00d2000 = var4_5;
                    this.ififsuper = var5_6;
                    this.\u00f5\u00d2\u00d2000 = g.o00000(var1_1);
                    this.returnifsuper = var3_4;
                    this.\u00f4\u00d2\u00d2000 = 2;
                    if (var2_2.o00000(var4_5, (b)this) != var7_3) continue;
                    return var7_3;
                }
                break;
            }
            case 2: {
                var3_4 = this.returnifsuper;
                var5_6 = (Iterator)this.ififsuper;
                var4_5 = this.\u00f8\u00d2\u00d2000;
                pc.o00000(var1_1);
                ** GOTO lbl16
            }
        }
        return i.o00000;
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override
    public final b new(Object object, b b2) {
        b2 = new p$_l$1(this.\u00d8\u00d2\u00d2000, this.\u00d5\u00d2\u00d2000, this.\u00d4\u00d2\u00d2000, b2);
        v0.O\u00d3\u00d2000 = object;
        return b2;
    }

    public final Object \u00d400000(l l2, b b2) {
        return ((p$_l$1)((o)this).new(l2, b2)).\u00d800000(i.o00000);
    }
}

