/*
 * Decompiled with CFR 0.152.
 */
package b.s;

import b.e.bb;
import b.g.l;
import b.i;
import b.o.e.f;
import b.pc;
import b.r.b;
import b.r.d.b.g;
import b.r.d.b.j;
import b.r.d.b.o;
import b.s.eb;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
final class e$_c$1
extends j
implements f {
    Object \u00f4\u00f4\u00d2000;
    Object returnwhilesuper;
    Object \u00d5\u00f4\u00d2000;
    int newwhilesuper;
    int o\u00f4\u00d2000;
    int O\u00f4\u00d2000;
    int \u00d4\u00f4\u00d2000;
    private /* synthetic */ Object ifwhilesuper;
    final /* synthetic */ int \u00d8\u00f4\u00d2000;
    final /* synthetic */ int privatedosuper;
    final /* synthetic */ Iterator \u00f8\u00d8\u00d2000;
    final /* synthetic */ boolean \u00f5\u00f4\u00d2000;
    final /* synthetic */ boolean \u00d3\u00f4\u00d2000;

    e$_c$1(int n2, int n3, Iterator iterator, boolean bl, boolean bl2, b b2) {
        this.\u00d8\u00f4\u00d2000 = n2;
        this.privatedosuper = n3;
        this.\u00f8\u00d8\u00d2000 = iterator;
        this.\u00f5\u00f4\u00d2000 = bl;
        this.\u00d3\u00f4\u00d2000 = bl2;
        super(2, b2);
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public final Object \u00d800000(Object var1_1) {
        var2_2 = (l)this.ifwhilesuper;
        var8_3 = b.r.c.b.\u00d200000();
        switch (this.\u00d4\u00f4\u00d2000) {
            case 0: {
                pc.o00000(var1_1);
                var3_4 = bb.Object(this.\u00d8\u00f4\u00d2000, 1024);
                var4_5 = this.privatedosuper - this.\u00d8\u00f4\u00d2000;
                if (var4_5 < 0) break;
                var5_6 = new ArrayList<Object>(var3_4);
                var6_8 = 0;
                var7_10 = this.\u00f8\u00d8\u00d2000;
lbl12:
                // 4 sources

                while (var7_10.hasNext()) {
                    var1_1 = var7_10.next();
                    if (var6_8 > 0) {
                        --var6_8;
                        continue;
                    }
                    var5_6.add(var1_1);
                    if (var5_6.size() != this.\u00d8\u00f4\u00d2000) continue;
                    this.ifwhilesuper = var2_2;
                    this.\u00f4\u00f4\u00d2000 = var5_6;
                    this.returnwhilesuper = var7_10;
                    this.\u00d5\u00f4\u00d2000 = g.o00000(var1_1);
                    this.newwhilesuper = var3_4;
                    this.o\u00f4\u00d2000 = var4_5;
                    this.O\u00f4\u00d2000 = var6_8;
                    this.\u00d4\u00f4\u00d2000 = 1;
                    if (var2_2.o00000((Object)var5_6, (b)this) == var8_3) {
                        return var8_3;
                    }
                    ** GOTO lbl40
                }
                break;
            }
            case 1: {
                var4_5 = this.o\u00f4\u00d2000;
                var3_4 = this.newwhilesuper;
                var7_10 = (Iterator)this.returnwhilesuper;
                var5_6 = (ArrayList<Object>)this.\u00f4\u00f4\u00d2000;
                pc.o00000(var1_1);
lbl40:
                // 2 sources

                if (this.\u00f5\u00f4\u00d2000) {
                    var5_6.clear();
                } else {
                    var5_6 = new ArrayList<Object>(this.\u00d8\u00f4\u00d2000);
                }
                var6_8 = var4_5;
                ** GOTO lbl12
            }
        }
        if (((Collection)var5_6).isEmpty() == false && (this.\u00d3\u00f4\u00d2000 || var5_6.size() == this.\u00d8\u00f4\u00d2000)) {
            this.ifwhilesuper = g.o00000(var2_2);
            this.\u00f4\u00f4\u00d2000 = g.o00000(var5_6);
            this.returnwhilesuper = null;
            this.\u00d5\u00f4\u00d2000 = null;
            this.newwhilesuper = var3_4;
            this.o\u00f4\u00d2000 = var4_5;
            this.O\u00f4\u00d2000 = var6_8;
            this.\u00d4\u00f4\u00d2000 = 2;
            if (var2_2.o00000((Object)var5_6, (b)this) == var8_3) {
                return var8_3;
            }
        }
        ** GOTO lbl132
        {
            case 2: {
                (ArrayList)this.\u00f4\u00f4\u00d2000;
                pc.o00000(var1_1);
                ** GOTO lbl132
            }
        }
        var5_7 = new eb(var3_4);
        var6_9 = this.\u00f8\u00d8\u00d2000;
lbl68:
        // 4 sources

        while (var6_9.hasNext()) {
            var7_11 = var6_9.next();
            var5_7.o00000(var7_11);
            if (!var5_7.new()) continue;
            if (var5_7.size() < this.\u00d8\u00f4\u00d2000) {
                var5_7 = var5_7.Stringsuper(this.\u00d8\u00f4\u00d2000);
                continue;
            }
            this.ifwhilesuper = var2_2;
            this.\u00f4\u00f4\u00d2000 = var5_7;
            this.returnwhilesuper = var6_9;
            this.\u00d5\u00f4\u00d2000 = g.o00000(var7_11);
            this.newwhilesuper = var3_4;
            this.o\u00f4\u00d2000 = var4_5;
            this.\u00d4\u00f4\u00d2000 = 3;
            if (var2_2.o00000((Object)(this.\u00f5\u00f4\u00d2000 != false ? (List)var5_7 : (List)new ArrayList<E>(var5_7)), (b)this) == var8_3) {
                return var8_3;
            }
            ** GOTO lbl93
        }
        {
            break;
            case 3: {
                var4_5 = this.o\u00f4\u00d2000;
                var3_4 = this.newwhilesuper;
                var6_9 = (Iterator)this.returnwhilesuper;
                var5_7 = (eb)this.\u00f4\u00f4\u00d2000;
                pc.o00000(var1_1);
lbl93:
                // 2 sources

                var5_7.\u00f5O0000(this.privatedosuper);
                ** GOTO lbl68
            }
        }
        if (!this.\u00d3\u00f4\u00d2000) ** GOTO lbl132
lbl96:
        // 2 sources

        while (var5_7.size() > this.privatedosuper) {
            this.ifwhilesuper = var2_2;
            this.\u00f4\u00f4\u00d2000 = var5_7;
            this.returnwhilesuper = null;
            this.\u00d5\u00f4\u00d2000 = null;
            this.newwhilesuper = var3_4;
            this.o\u00f4\u00d2000 = var4_5;
            this.\u00d4\u00f4\u00d2000 = 4;
            if (var2_2.o00000((Object)(this.\u00f5\u00f4\u00d2000 != false ? (List)var5_7 : (List)new ArrayList<E>(var5_7)), (b)this) == var8_3) {
                return var8_3;
            }
            ** GOTO lbl113
        }
        {
            break;
            case 4: {
                var4_5 = this.o\u00f4\u00d2000;
                var3_4 = this.newwhilesuper;
                var5_7 = (eb)this.\u00f4\u00f4\u00d2000;
                pc.o00000(var1_1);
lbl113:
                // 2 sources

                var5_7.\u00f5O0000(this.privatedosuper);
                ** GOTO lbl96
            }
        }
        if (((Collection)var5_7).isEmpty() == false) {
            this.ifwhilesuper = g.o00000(var2_2);
            this.\u00f4\u00f4\u00d2000 = g.o00000(var5_7);
            this.returnwhilesuper = null;
            this.\u00d5\u00f4\u00d2000 = null;
            this.newwhilesuper = var3_4;
            this.o\u00f4\u00d2000 = var4_5;
            this.\u00d4\u00f4\u00d2000 = 5;
            if (var2_2.o00000((Object)var5_7, (b)this) == var8_3) {
                return var8_3;
            }
        }
        ** GOTO lbl132
        {
            case 5: {
                (eb)this.\u00f4\u00f4\u00d2000;
                pc.o00000(var1_1);
lbl132:
                // 5 sources

                return i.o00000;
            }
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override
    public final b new(Object object, b b2) {
        b2 = new e$_c$1(this.\u00d8\u00f4\u00d2000, this.privatedosuper, this.\u00f8\u00d8\u00d2000, this.\u00f5\u00f4\u00d2000, this.\u00d3\u00f4\u00d2000, b2);
        v0.ifwhilesuper = object;
        return b2;
    }

    public final Object \u00f800000(l l2, b b2) {
        return ((e$_c$1)((o)this).new(l2, b2)).\u00d800000(i.o00000);
    }
}

