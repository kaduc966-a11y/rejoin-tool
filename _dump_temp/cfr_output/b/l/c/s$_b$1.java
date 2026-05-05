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
import java.util.Iterator;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
final class s$_b$1
extends j
implements f {
    Object O\u00d6\u00d2000;
    Object ifforsuper;
    Object \u00f4\u00d5\u00d2000;
    Object returnforsuper;
    Object \u00d5\u00d5\u00d2000;
    Object \u00d4\u00d5\u00d2000;
    Object \u00d3\u00d5\u00d2000;
    Object newforsuper;
    Object o\u00d5\u00d2000;
    Object \u00f8\u00d5\u00d2000;
    Object \u00f5\u00d5\u00d2000;
    int \u00f8\u00d4\u00d2000;
    int \u00d8\u00d5\u00d2000;
    private /* synthetic */ Object o\u00d6\u00d2000;
    final /* synthetic */ s O\u00d5\u00d2000;

    s$_b$1(s s2, b.r.b b2) {
        this.O\u00d5\u00d2000 = s2;
        super(2, b2);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public final Object \u00d800000(Object var1_1) {
        block19: {
            var2_2 = (l)this.o\u00d6\u00d2000;
            var15_3 = b.r.c.b.\u00d200000();
            block0 : switch (this.\u00d8\u00d5\u00d2000) {
                case 0: {
                    pc.o00000(var1_1);
                    var3_4 = new db();
                    var4_5 = new q(s.\u00d200000(this.O\u00d5\u00d2000));
                    var5_6 = new k(s.String(this.O\u00d5\u00d2000), b.o00000(s.String(this.O\u00d5\u00d2000), s.o00000(this.O\u00d5\u00d2000)), null);
                    var6_7 = this.O\u00d5\u00d2000;
                    var1_1 = var2_2;
                    var7_8 = var5_6;
                    var8_9 = var4_5;
                    var10_10 = var7_8.String();
                    if (var7_8.\u00d300000() != null) {
                        r.new((Path)var10_10);
                    }
                    var11_11 = var10_10;
                    v0 = s.o00000((s)var6_7);
                    var9_12 = Arrays.copyOf(v0, v0.length);
                    if (!Files.isDirectory((Path)var11_11, Arrays.copyOf(var9_12, ((LinkOption[])var9_12).length))) break;
                    if (b.new(var7_8)) {
                        throw new FileSystemLoopException(var10_10.toString());
                    }
                    if (s.\u00d300000((s)var6_7)) {
                        this.o\u00d6\u00d2000 = var2_2;
                        this.O\u00d6\u00d2000 = var3_4;
                        this.ifforsuper = var4_5;
                        this.\u00f4\u00d5\u00d2000 = var5_6;
                        this.returnforsuper = var6_7;
                        this.\u00d5\u00d5\u00d2000 = g.o00000(var1_1);
                        this.\u00d4\u00d5\u00d2000 = var7_8;
                        this.\u00d3\u00d5\u00d2000 = var8_9;
                        this.newforsuper = var10_10;
                        this.\u00f8\u00d4\u00d2000 = 0;
                        this.\u00d8\u00d5\u00d2000 = 1;
                        if (var1_1.o00000(var10_10, (b.r.b)this) == var15_3) {
                            return var15_3;
                        }
                    }
                    ** GOTO lbl49
                }
                case 1: {
                    var10_10 = (Path)this.newforsuper;
                    var8_9 = (q)this.\u00d3\u00d5\u00d2000;
                    var7_8 = (k)this.\u00d4\u00d5\u00d2000;
                    (l)this.\u00d5\u00d5\u00d2000;
                    var6_7 = (s)this.returnforsuper;
                    var5_6 = (k)this.\u00f4\u00d5\u00d2000;
                    var4_5 = (q)this.ifforsuper;
                    var3_4 = (db)this.O\u00d6\u00d2000;
                    pc.o00000(var1_1);
lbl49:
                    // 2 sources

                    var11_11 = var10_10;
                    v1 = s.o00000((s)var6_7);
                    var9_12 = Arrays.copyOf(v1, v1.length);
                    if (Files.isDirectory((Path)var11_11, Arrays.copyOf(var9_12, ((LinkOption[])var9_12).length))) {
                        var12_13 = var8_9.o00000(var7_8);
                        var5_6.o00000(var12_13.iterator());
                        var3_4.addLast(var5_6);
                    }
                    ** GOTO lbl93
                }
            }
            var11_11 = var10_10;
            v2 = new LinkOption[1];
            var9_12 = v2;
            v2[0] = LinkOption.NOFOLLOW_LINKS;
            v3 = var9_12;
            if (Files.exists((Path)var11_11, Arrays.copyOf(v3, ((LinkOption[])v3).length))) {
                this.o\u00d6\u00d2000 = var2_2;
                this.O\u00d6\u00d2000 = var3_4;
                this.ifforsuper = var4_5;
                this.\u00f4\u00d5\u00d2000 = g.o00000(var5_6);
                this.returnforsuper = g.o00000(var6_7);
                this.\u00d5\u00d5\u00d2000 = g.o00000(var1_1);
                this.\u00d4\u00d5\u00d2000 = g.o00000(var7_8);
                this.\u00d3\u00d5\u00d2000 = g.o00000(var8_9);
                this.newforsuper = g.o00000(var10_10);
                this.\u00f8\u00d4\u00d2000 = 0;
                this.\u00d8\u00d5\u00d2000 = 2;
                if (var1_1.o00000(var10_10, (b.r.b)this) == var15_3) {
                    return var15_3;
                }
            }
            ** GOTO lbl93
            {
                case 2: {
                    (Path)this.newforsuper;
                    (q)this.\u00d3\u00d5\u00d2000;
                    (k)this.\u00d4\u00d5\u00d2000;
                    (l)this.\u00d5\u00d5\u00d2000;
                    (s)this.returnforsuper;
                    var5_6 = (k)this.\u00f4\u00d5\u00d2000;
                    var4_5 = (q)this.ifforsuper;
                    var3_4 = (db)this.O\u00d6\u00d2000;
                    pc.o00000(var1_1);
lbl93:
                    // 9 sources

                    while (((Collection)var3_4).isEmpty() == false) {
                        var6_7 = (k)var3_4.o\u00d2\u00d3000();
                        var1_1 = var6_7.\u00d200000();
                        if (!var1_1.hasNext()) break block0;
                        var7_8 = (k)var1_1.next();
                        var8_9 = this.O\u00d5\u00d2000;
                        var9_12 = var2_2;
                        var10_10 = var7_8;
                        var11_11 = var4_5;
                        var12_13 = var10_10.String();
                        if (var10_10.\u00d300000() != null) {
                            r.new(var12_13);
                        }
                        var13_14 /* !! */  = var12_13;
                        v4 = s.o00000((s)var8_9);
                        var14_15 = Arrays.copyOf(v4, v4.length);
                        if (!Files.isDirectory(var13_14 /* !! */ , Arrays.copyOf(var14_15, var14_15.length))) break block0;
                        if (b.new((k)var10_10)) {
                            throw new FileSystemLoopException(var12_13.toString());
                        }
                        if (s.\u00d300000((s)var8_9)) {
                            this.o\u00d6\u00d2000 = var2_2;
                            this.O\u00d6\u00d2000 = var3_4;
                            this.ifforsuper = var4_5;
                            this.\u00f4\u00d5\u00d2000 = g.o00000(var5_6);
                            this.returnforsuper = g.o00000(var6_7);
                            this.\u00d5\u00d5\u00d2000 = g.o00000(var1_1);
                            this.\u00d4\u00d5\u00d2000 = var7_8;
                            this.\u00d3\u00d5\u00d2000 = var8_9;
                            this.newforsuper = g.o00000(var9_12);
                            this.o\u00d5\u00d2000 = var10_10;
                            this.\u00f8\u00d5\u00d2000 = var11_11;
                            this.\u00f5\u00d5\u00d2000 = var12_13;
                            this.\u00f8\u00d4\u00d2000 = 0;
                            this.\u00d8\u00d5\u00d2000 = 3;
                            if (var9_12.o00000((Object)var12_13, (b.r.b)this) == var15_3) {
                                return var15_3;
                            }
                        }
                        ** GOTO lbl147
                    }
                    break block19;
                }
                case 3: {
                    var12_13 = (Path)this.\u00f5\u00d5\u00d2000;
                    var11_11 = (q)this.\u00f8\u00d5\u00d2000;
                    var10_10 = (k)this.o\u00d5\u00d2000;
                    (l)this.newforsuper;
                    var8_9 = (s)this.\u00d3\u00d5\u00d2000;
                    var7_8 = (k)this.\u00d4\u00d5\u00d2000;
                    (Iterator)this.\u00d5\u00d5\u00d2000;
                    (k)this.returnforsuper;
                    var5_6 = (k)this.\u00f4\u00d5\u00d2000;
                    var4_5 = (q)this.ifforsuper;
                    var3_4 = (db)this.O\u00d6\u00d2000;
                    pc.o00000(var1_1);
lbl147:
                    // 2 sources

                    var13_14 /* !! */  = var12_13;
                    v5 = s.o00000((s)var8_9);
                    var14_15 = Arrays.copyOf(v5, v5.length);
                    if (!Files.isDirectory(var13_14 /* !! */ , Arrays.copyOf(var14_15, var14_15.length))) ** GOTO lbl93
                    var1_1 = var11_11.o00000((k)var10_10);
                    var7_8.o00000(var1_1.iterator());
                    var3_4.addLast(var7_8);
                    ** GOTO lbl93
                }
            }
            var13_14 /* !! */  = var12_13;
            v6 = new LinkOption[1];
            var14_15 = v6;
            v6[0] = LinkOption.NOFOLLOW_LINKS;
            if (!Files.exists(var13_14 /* !! */ , Arrays.copyOf(var14_15, var14_15.length))) ** GOTO lbl93
            this.o\u00d6\u00d2000 = var2_2;
            this.O\u00d6\u00d2000 = var3_4;
            this.ifforsuper = var4_5;
            this.\u00f4\u00d5\u00d2000 = g.o00000(var5_6);
            this.returnforsuper = g.o00000(var6_7);
            this.\u00d5\u00d5\u00d2000 = g.o00000(var1_1);
            this.\u00d4\u00d5\u00d2000 = g.o00000(var7_8);
            this.\u00d3\u00d5\u00d2000 = g.o00000(var8_9);
            this.newforsuper = g.o00000(var9_12);
            this.o\u00d5\u00d2000 = g.o00000(var10_10);
            this.\u00f8\u00d5\u00d2000 = g.o00000(var11_11);
            this.\u00f5\u00d5\u00d2000 = g.o00000(var12_13);
            this.\u00f8\u00d4\u00d2000 = 0;
            this.\u00d8\u00d5\u00d2000 = 4;
            if (var9_12.o00000((Object)var12_13, (b.r.b)this) != var15_3) ** GOTO lbl93
            return var15_3;
            {
                case 4: {
                    (Path)this.\u00f5\u00d5\u00d2000;
                    (q)this.\u00f8\u00d5\u00d2000;
                    (k)this.o\u00d5\u00d2000;
                    (l)this.newforsuper;
                    (s)this.\u00d3\u00d5\u00d2000;
                    (k)this.\u00d4\u00d5\u00d2000;
                    (Iterator)this.\u00d5\u00d5\u00d2000;
                    (k)this.returnforsuper;
                    var5_6 = (k)this.\u00f4\u00d5\u00d2000;
                    var4_5 = (q)this.ifforsuper;
                    var3_4 = (db)this.O\u00d6\u00d2000;
                    pc.o00000(var1_1);
                    ** GOTO lbl93
                }
            }
            var3_4.removeLast();
            ** GOTO lbl93
        }
        return i.o00000;
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override
    public final b.r.b new(Object object, b.r.b b2) {
        b2 = new s$_b$1(this.O\u00d5\u00d2000, b2);
        v0.o\u00d6\u00d2000 = object;
        return b2;
    }

    public final Object \u00f400000(l l2, b.r.b b2) {
        return ((s$_b$1)((o)this).new(l2, b2)).\u00d800000(i.o00000);
    }
}

