/*
 * Decompiled with CFR 0.152.
 */
package b.l.c;

import b.g.l;
import b.i;
import b.l.c.b;
import b.l.c.k;
import b.l.c.q;
import b.l.c.r;
import b.l.c.s;
import b.o.e.f;
import b.pc;
import b.r.d.b.g;
import b.r.d.b.j;
import b.r.d.b.o;
import b.s.db;
import java.nio.file.FileSystemLoopException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Collection;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
final class s$_c$1
extends j
implements f {
    Object O\u00d8\u00d2000;
    Object \u00f8\u00d6\u00d2000;
    Object Stringdosuper;
    Object \u00f4\u00d6\u00d2000;
    Object \u00d8\u00d6\u00d2000;
    Object thisdosuper;
    Object \u00d5\u00d6\u00d2000;
    Object \u00d4\u00d6\u00d2000;
    int whileforsuper;
    int \u00f5\u00d6\u00d2000;
    private /* synthetic */ Object o\u00d8\u00d2000;
    final /* synthetic */ s \u00d3\u00d6\u00d2000;

    s$_c$1(s s2, b.r.b b2) {
        this.\u00d3\u00d6\u00d2000 = s2;
        super(2, b2);
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public final Object \u00d800000(Object var1_1) {
        var2_2 = (l)this.o\u00d8\u00d2000;
        var12_3 = b.r.c.b.\u00d200000();
        block0 : switch (this.\u00f5\u00d6\u00d2000) {
            case 0: {
                pc.o00000(var1_1);
                var3_4 = new db();
                var4_5 = new q(s.\u00d200000(this.\u00d3\u00d6\u00d2000));
                var3_4.addLast(new k(s.String(this.\u00d3\u00d6\u00d2000), b.o00000(s.String(this.\u00d3\u00d6\u00d2000), s.o00000(this.\u00d3\u00d6\u00d2000)), null));
lbl9:
                // 6 sources

                while (((Collection)var3_4).isEmpty() == false) {
                    var1_1 = (k)var3_4.removeFirst();
                    var5_6 = this.\u00d3\u00d6\u00d2000;
                    var6_7 = var2_2;
                    var7_8 = var1_1;
                    var8_9 = var4_5;
                    var9_10 = var7_8.String();
                    if (var7_8.\u00d300000() != null) {
                        r.new(var9_10);
                    }
                    var10_11 = var9_10;
                    v0 = s.o00000(var5_6);
                    var11_12 = Arrays.copyOf(v0, v0.length);
                    if (!Files.isDirectory(var10_11, Arrays.copyOf(var11_12, var11_12.length))) break block0;
                    if (b.new((k)var7_8)) {
                        throw new FileSystemLoopException(var9_10.toString());
                    }
                    if (s.\u00d300000(var5_6)) {
                        this.o\u00d8\u00d2000 = var2_2;
                        this.O\u00d8\u00d2000 = var3_4;
                        this.\u00f8\u00d6\u00d2000 = var4_5;
                        this.Stringdosuper = g.o00000(var1_1);
                        this.\u00f4\u00d6\u00d2000 = var5_6;
                        this.\u00d8\u00d6\u00d2000 = g.o00000(var6_7);
                        this.thisdosuper = var7_8;
                        this.\u00d5\u00d6\u00d2000 = var8_9;
                        this.\u00d4\u00d6\u00d2000 = var9_10;
                        this.whileforsuper = 0;
                        this.\u00f5\u00d6\u00d2000 = 1;
                        if (var6_7.o00000((Object)var9_10, (b.r.b)this) == var12_3) {
                            return var12_3;
                        }
                    }
                    ** GOTO lbl53
                }
                break;
            }
            case 1: {
                var9_10 = (Path)this.\u00d4\u00d6\u00d2000;
                var8_9 = (q)this.\u00d5\u00d6\u00d2000;
                var7_8 = (k)this.thisdosuper;
                (l)this.\u00d8\u00d6\u00d2000;
                var5_6 = (s)this.\u00f4\u00d6\u00d2000;
                (k)this.Stringdosuper;
                var4_5 = (q)this.\u00f8\u00d6\u00d2000;
                var3_4 = (db)this.O\u00d8\u00d2000;
                pc.o00000(var1_1);
lbl53:
                // 2 sources

                var10_11 = var9_10;
                v1 = s.o00000(var5_6);
                var11_12 = Arrays.copyOf(v1, v1.length);
                if (!Files.isDirectory(var10_11, Arrays.copyOf(var11_12, var11_12.length))) ** GOTO lbl9
                var1_1 = var8_9.o00000((k)var7_8);
                var3_4.addAll((Collection)var1_1);
                ** GOTO lbl9
            }
        }
        var10_11 = var9_10;
        v2 = new LinkOption[1];
        var11_12 = v2;
        v2[0] = LinkOption.NOFOLLOW_LINKS;
        if (!Files.exists(var10_11, Arrays.copyOf(var11_12, var11_12.length))) ** GOTO lbl9
        this.o\u00d8\u00d2000 = var2_2;
        this.O\u00d8\u00d2000 = var3_4;
        this.\u00f8\u00d6\u00d2000 = var4_5;
        this.Stringdosuper = g.o00000(var1_1);
        this.\u00f4\u00d6\u00d2000 = g.o00000(var5_6);
        this.\u00d8\u00d6\u00d2000 = g.o00000(var6_7);
        this.thisdosuper = g.o00000(var7_8);
        this.\u00d5\u00d6\u00d2000 = g.o00000(var8_9);
        this.\u00d4\u00d6\u00d2000 = g.o00000(var9_10);
        this.whileforsuper = 0;
        this.\u00f5\u00d6\u00d2000 = 2;
        if (var6_7.o00000((Object)var9_10, (b.r.b)this) != var12_3) ** GOTO lbl9
        return var12_3;
        {
            case 2: {
                (Path)this.\u00d4\u00d6\u00d2000;
                (q)this.\u00d5\u00d6\u00d2000;
                (k)this.thisdosuper;
                (l)this.\u00d8\u00d6\u00d2000;
                (s)this.\u00f4\u00d6\u00d2000;
                (k)this.Stringdosuper;
                var4_5 = (q)this.\u00f8\u00d6\u00d2000;
                var3_4 = (db)this.O\u00d8\u00d2000;
                pc.o00000(var1_1);
                ** GOTO lbl9
            }
        }
        return i.o00000;
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override
    public final b.r.b new(Object object, b.r.b b2) {
        b2 = new s$_c$1(this.\u00d3\u00d6\u00d2000, b2);
        v0.o\u00d8\u00d2000 = object;
        return b2;
    }

    public final Object \u00f500000(l l2, b.r.b b2) {
        return ((s$_c$1)((o)this).new(l2, b2)).\u00d800000(i.o00000);
    }
}

