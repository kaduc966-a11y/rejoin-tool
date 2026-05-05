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
import b.r.d.b.j;
import b.r.d.b.o;
import b.s.mc;
import java.util.Iterator;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
final class p$_d$1
extends j
implements b.o.e.f {
    Object o\u00f5\u00d2000;
    Object O\u00f5\u00d2000;
    int \u00d3\u00f5\u00d2000;
    int \u00f8\u00f4\u00d2000;
    private /* synthetic */ Object whilewhilesuper;
    final /* synthetic */ n \u00d4\u00f5\u00d2000;
    final /* synthetic */ e \u00d5\u00f5\u00d2000;

    p$_d$1(n n2, e e2, b b2) {
        this.\u00d4\u00f5\u00d2000 = n2;
        this.\u00d5\u00f5\u00d2000 = e2;
        super(2, b2);
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public final Object \u00d800000(Object var1_1) {
        var2_3 = (l)this.whilewhilesuper;
        var6_4 = b.r.c.b.\u00d200000();
        switch (this.\u00f8\u00f4\u00d2000) {
            case 0: {
                pc.o00000(var1_1);
                var3_5 = this.\u00d4\u00f5\u00d2000.o00000();
                if (!var3_5.hasNext()) break;
                var4_6 = var3_5.next();
                this.whilewhilesuper = var2_3;
                this.o\u00f5\u00d2000 = var3_5;
                this.O\u00f5\u00d2000 = var4_6;
                this.\u00f8\u00f4\u00d2000 = 1;
                if (var2_3.o00000(var4_6, (b)this) == var6_4) {
                    return var6_4;
                }
                ** GOTO lbl20
            }
            case 1: {
                var4_6 = this.O\u00f5\u00d2000;
                var3_5 = (Iterator)this.o\u00f5\u00d2000;
                pc.o00000(var1_1);
lbl20:
                // 2 sources

                var5_7 = 1;
lbl21:
                // 3 sources

                while (var3_5.hasNext()) {
                    if ((var1_2 = var5_7++) < 0) {
                        mc.\u00d800000();
                    }
                    var4_6 = this.\u00d5\u00f5\u00d2000.o00000(f.o00000(var1_2), var4_6, var3_5.next());
                    this.whilewhilesuper = var2_3;
                    this.o\u00f5\u00d2000 = var3_5;
                    this.O\u00f5\u00d2000 = var4_6;
                    this.\u00d3\u00f5\u00d2000 = var5_7;
                    this.\u00f8\u00f4\u00d2000 = 2;
                    if (var2_3.o00000(var4_6, (b)this) != var6_4) continue;
                    return var6_4;
                }
                break;
            }
            case 2: {
                var5_7 = this.\u00d3\u00f5\u00d2000;
                var4_6 = this.O\u00f5\u00d2000;
                var3_5 = (Iterator)this.o\u00f5\u00d2000;
                pc.o00000(var1_1);
                ** GOTO lbl21
            }
        }
        return i.o00000;
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override
    public final b new(Object object, b b2) {
        b2 = new p$_d$1(this.\u00d4\u00f5\u00d2000, this.\u00d5\u00f5\u00d2000, b2);
        v0.whilewhilesuper = object;
        return b2;
    }

    public final Object OO0000(l l2, b b2) {
        return ((p$_d$1)((o)this).new(l2, b2)).\u00d800000(i.o00000);
    }
}

