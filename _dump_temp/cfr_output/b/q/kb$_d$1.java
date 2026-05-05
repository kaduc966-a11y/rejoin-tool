/*
 * Decompiled with CFR 0.152.
 */
package b.q;

import b.g.l;
import b.i;
import b.o.e.f;
import b.pc;
import b.q.kb;
import b.r.b;
import b.r.d.b.g;
import b.r.d.b.j;
import b.r.d.b.o;
import java.util.regex.Matcher;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
final class kb$_d$1
extends j
implements f {
    Object \u00d4\u00d8\u00d2000;
    int \u00d8\u00d8\u00d2000;
    int fordosuper;
    int \u00d3\u00d8\u00d2000;
    private /* synthetic */ Object \u00d5\u00d8\u00d2000;
    final /* synthetic */ kb nulldosuper;
    final /* synthetic */ CharSequence \u00f5\u00d8\u00d2000;
    final /* synthetic */ int \u00f4\u00d8\u00d2000;

    kb$_d$1(kb kb2, CharSequence charSequence, int n2, b b2) {
        this.nulldosuper = kb2;
        this.\u00f5\u00d8\u00d2000 = charSequence;
        this.\u00f4\u00d8\u00d2000 = n2;
        super(2, b2);
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public final Object \u00d800000(Object var1_1) {
        var2_3 = (l)this.\u00d5\u00d8\u00d2000;
        var5_4 = b.r.c.b.\u00d200000();
        switch (this.\u00d3\u00d8\u00d2000) {
            case 0: {
                pc.o00000(var1_1);
                var3_5 = kb.super(this.nulldosuper).matcher(this.\u00f5\u00d8\u00d2000);
                if (this.\u00f4\u00d8\u00d2000 != 1 && var3_5.find()) break;
                this.\u00d5\u00d8\u00d2000 = g.o00000(var2_3);
                this.\u00d4\u00d8\u00d2000 = g.o00000(var3_5);
                this.\u00d3\u00d8\u00d2000 = 1;
                if (var2_3.o00000(this.\u00f5\u00d8\u00d2000.toString(), (b)this) == var5_4) {
                    return var5_4;
                }
                ** GOTO lbl18
            }
            case 1: {
                (Matcher)this.\u00d4\u00d8\u00d2000;
                pc.o00000(var1_1);
lbl18:
                // 2 sources

                return i.o00000;
            }
        }
        var1_2 = 0;
        var4_6 = 0;
        while (true) {
            this.\u00d5\u00d8\u00d2000 = var2_3;
            this.\u00d4\u00d8\u00d2000 = var3_5;
            this.\u00d8\u00d8\u00d2000 = var1_2;
            this.fordosuper = var4_6;
            this.\u00d3\u00d8\u00d2000 = 2;
            if (var2_3.o00000(this.\u00f5\u00d8\u00d2000.subSequence(var1_2, var3_5.start()).toString(), (b)this) == var5_4) {
                return var5_4;
            }
            ** GOTO lbl35
            break;
        }
        {
            case 2: {
                var4_6 = this.fordosuper;
                var3_5 = (Matcher)this.\u00d4\u00d8\u00d2000;
                pc.o00000(var1_1);
lbl35:
                // 2 sources

                var1_2 = var3_5.end();
                if (++var4_6 != this.\u00f4\u00d8\u00d2000 - 1 && var3_5.find()) ** continue;
                v0 = this.\u00f5\u00d8\u00d2000;
                this.\u00d5\u00d8\u00d2000 = g.o00000(var2_3);
                this.\u00d4\u00d8\u00d2000 = g.o00000(var3_5);
                this.\u00d8\u00d8\u00d2000 = var1_2;
                this.fordosuper = var4_6;
                this.\u00d3\u00d8\u00d2000 = 3;
                if (var2_3.o00000(v0.subSequence(var1_2, v0.length()).toString(), (b)this) == var5_4) {
                    return var5_4;
                }
                ** GOTO lbl52
            }
            case 3: {
                (Matcher)this.\u00d4\u00d8\u00d2000;
                pc.o00000(var1_1);
lbl52:
                // 2 sources

                return i.o00000;
            }
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override
    public final b new(Object object, b b2) {
        b2 = new kb$_d$1(this.nulldosuper, this.\u00f5\u00d8\u00d2000, this.\u00f4\u00d8\u00d2000, b2);
        v0.\u00d5\u00d8\u00d2000 = object;
        return b2;
    }

    public final Object if(l l2, b b2) {
        return ((kb$_d$1)((o)this).new(l2, b2)).\u00d800000(i.o00000);
    }
}

