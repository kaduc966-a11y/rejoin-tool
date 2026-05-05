/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b;

import b.o.d.fc;
import b.t.c.b.b.f.b.b.f;
import b.t.c.b.b.l.b$_c;
import b.t.c.b.b.l.d.e;
import b.t.c.b.b.n.c.e.d;
import b.t.c.b.b.n.c.fb;
import b.t.c.b.b.q.ab;
import b.t.c.b.b.q.b.ib;
import b.t.c.b.b.q.hc;
import b.t.c.b.b.q.i;
import b.t.c.b.b.q.mc;
import b.t.c.b.b.q.n;
import b.t.c.b.b.q.y;
import b.t.c.b.c.c;
import b.t.c.b.c.j;
import b.t.c.b.gb$_b$0;
import b.t.c.b.gb$_b$1;
import b.t.c.b.gb$_b$2;
import b.t.c.b.gb$_b$3;
import b.t.c.b.gb$_b$4;
import b.t.c.b.gb$_b$5;
import b.t.c.b.gb$_b$6;
import b.t.c.b.gb$_b$7;
import b.t.c.b.gb$_b$8;
import b.t.c.b.gb$_c$_b$_b$1;
import b.t.c.b.gc;
import b.t.c.b.hd;
import b.t.c.b.md;
import b.t.c.b.oc;
import b.t.c.b.qb;
import b.t.c.b.ub;
import b.t.c.b.v;
import b.t.c.b.v$_b;
import b.t.c.b.v$_c;
import b.t.p$_b;
import b.t.u;
import b.xc;
import b.yc;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public abstract class gb
extends qb {
    private final oc o\u00f6\u00d2000;
    private final v$_b \u00d3\u00f6\u00d2000;
    private final v$_b \u00d4\u00f6\u00d2000;
    private final v$_b nullpublicsuper;
    private final v$_b O\u00f6\u00d2000;
    private final v$_b \u00d5\u00f6\u00d2000;

    public gb(oc object) {
        this.o\u00f6\u00d2000 = object;
        object = this;
        this.\u00d3\u00f6\u00d2000 = v.super(new gb$_b$0((gb)object));
        object = this;
        this.\u00d4\u00f6\u00d2000 = v.super(new gb$_b$1((gb)object));
        object = this;
        this.nullpublicsuper = v.super(new gb$_b$2((gb)object));
        object = this;
        this.O\u00f6\u00d2000 = v.super(new gb$_b$3((gb)object));
        object = this;
        this.\u00d5\u00f6\u00d2000 = v.super(new gb$_b$4((gb)object));
    }

    public final oc \u00d8\u00f4O000() {
        return this.o\u00f6\u00d2000;
    }

    public abstract hc \u00f4\u00f4O000();

    protected abstract c thispublic();

    public abstract gb o00000(oc var1);

    @Override
    public List \u00d8\u00f50000() {
        return (List)((v$_c)this.\u00d3\u00f6\u00d2000).newreturn();
    }

    @Override
    public List \u00f8\u00d6O000() {
        return (List)((v$_c)this.\u00d4\u00f6\u00d2000).newreturn();
    }

    @Override
    public List \u00d8\u00d5O000() {
        return (List)((v$_c)this.nullpublicsuper).newreturn();
    }

    private final List \u00f500000(boolean n2) {
        List list;
        Object object;
        hc hc2 = this.\u00f4\u00f4O000();
        ArrayList<ub> arrayList = new ArrayList<ub>();
        if (n2 != 0) {
            mc mc2;
            mc mc3 = hd.super(this);
            if (mc3 != null) {
                mc2 = mc3;
                arrayList.add(new ub(this, arrayList.size(), p$_b.\u00d400000, new gb$_b$5(mc2)));
            }
            List list2 = this.o00000(hc2);
            int n3 = 0;
            int n4 = ((Collection)list2).size();
            while (n3 < n4) {
                int n5 = n3++;
                object = list2;
                arrayList.add(new ub(this, arrayList.size(), p$_b.\u00d600000, new gb$_b$6((List)object, n5)));
            }
            mc mc4 = hc2.nullclasssuper();
            if (mc4 != null) {
                mc2 = mc4;
                arrayList.add(new ub(this, arrayList.size(), p$_b.class, new gb$_b$7(mc2)));
            }
        }
        n2 = 0;
        int n6 = ((Collection)hc2.\u00f5\u00d8o000()).size();
        while (n2 < n6) {
            int n7 = n2++;
            object = hc2;
            arrayList.add(new ub(this, arrayList.size(), p$_b.\u00d300000, new gb$_b$8((hc)object, n7)));
        }
        if (md.new(this) && hc2 instanceof d && (list = (List)arrayList).size() > 1) {
            b.s.mc.o00000(list, new gb$_c$_b$_b$1());
        }
        arrayList.trimToSize();
        return arrayList;
    }

    /*
     * Unable to fully structure code
     */
    private final List o00000(hc var1_1) {
        block6: {
            block7: {
                block5: {
                    var2_2 = var1_1;
                    if (!(var2_2 instanceof f)) break block5;
                    v0 = yc.o00000(((f)var1_1).\u00f4\u00d8o000(), ((f)var1_1).forvoidsuper().O\u00f5\u00d3000());
                    break block6;
                }
                if (!(var2_2 instanceof b.t.c.b.b.f.b.b.j)) break block7;
                v0 = yc.o00000(((b.t.c.b.b.f.b.b.j)var1_1).\u00f4\u00d8o000(), ((b.t.c.b.b.f.b.b.j)var1_1).\u00d50\u00d2000().\u00d8\u00d2\u00d3000());
                break block6;
            }
            if (!(var2_2 instanceof y)) ** GOTO lbl-1000
            var2_2 = ((y)var1_1).O\u00f6o000();
            v1 = var2_2 instanceof b.t.c.b.b.f.b.b.j != false ? (b.t.c.b.b.f.b.b.j)var2_2 : null;
            if (v1 != null) {
                var5_3 = v1;
                v0 = yc.o00000(v1.\u00f4\u00d8o000(), var5_3.\u00d50\u00d2000().\u00d8\u00d2\u00d3000());
            } else lbl-1000:
            // 2 sources

            {
                v0 = null;
            }
        }
        if (v0 == null) {
            return b.s.mc.\u00d500000();
        }
        var2_2 = v0;
        var3_4 = (e)v0.\u00d400000();
        var2_2 = (List)var2_2.\u00d300000();
        var4_5 = var1_1.\u00d4\u00f4o000();
        var5_3 = var4_5;
        var4_5 = new ArrayList<E>(b.s.mc.o00000(var4_5, 10));
        var6_6 = 0;
        var5_3 = var5_3.iterator();
        while (var5_3.hasNext()) {
            var7_7 = var5_3.next();
            if ((var8_8 = var6_6++) < 0) {
                b.s.mc.\u00d800000();
            }
            var7_7 = (mc)var7_7;
            var9_9 = var4_5;
            var9_9.add(new ib(var1_1, null, var8_8, var7_7.\u00d4\u00f80000(), b.t.c.b.b.d.f.\u00d200000(var3_4.new(((b$_c)var2_2.get(var8_8)).\u00d2\u00f5o000())), var7_7.forclasssuper(), false, false, false, null, var7_7.\u00f4\u00f80000()));
        }
        return (List)var4_5;
    }

    @Override
    public u \u00d5\u00d5O000() {
        return (u)((v$_c)this.O\u00f6\u00d2000).newreturn();
    }

    @Override
    public List O\u00d4O000() {
        return (List)((v$_c)this.\u00d5\u00f6\u00d2000).newreturn();
    }

    @Override
    public b.t.j \u00f8\u00d5O000() {
        return hd.super(this.\u00f4\u00f4O000().\u00d50O000());
    }

    public final ab \u00d4\u00f4O000() {
        ab ab2 = this.o\u00f6\u00d2000.\u00f400000();
        if (ab2 == null) {
            ab2 = this.\u00f4\u00f4O000().\u00f40O000();
        }
        return ab2;
    }

    public final boolean \u00d5\u00f4O000() {
        return fc.o00000((Object)this.\u00f4\u00f4O000().\u00d50O000(), (Object)fb.String);
    }

    @Override
    public final boolean O\u00d6O000() {
        return this.\u00d4\u00f4O000() == ab.\u00d600000;
    }

    @Override
    public final boolean thisdo() {
        return this.\u00d4\u00f4O000() == ab.class;
    }

    @Override
    public final boolean Stringdo() {
        return this.\u00d4\u00f4O000() == ab.\u00d400000;
    }

    private static final List \u00d500000(gb gb2) {
        return hd.super(gb2.\u00f4\u00f4O000());
    }

    private static final List \u00f400000(gb gb2) {
        return gb2.\u00f500000(true);
    }

    private static final List \u00d800000(gb gb2) {
        if (md.\u00d300000(gb2)) {
            return gb2.\u00f500000(false);
        }
        return gb2.\u00f8\u00d6O000();
    }

    private static final n \u00d400000(mc mc2) {
        return mc2;
    }

    private static final n new(List list, int n2) {
        return (n)list.get(n2);
    }

    private static final n \u00d300000(mc mc2) {
        return mc2;
    }

    private static final n o00000(hc hc2, int n2) {
        return (n)hc2.\u00f5\u00d8o000().get(n2);
    }

    private static final u \u00f500000(gb gb2) {
        c c2 = gb2.thispublic();
        u u2 = j.o00000(gb2.o\u00f6\u00d2000.super(), c2, null, 2, null).o00000();
        if (u2 == null) {
            gc.o00000(gb2.\u00f5\u00d5O000());
            throw new xc();
        }
        return u2;
    }

    private static final List new(gb gb2) {
        Iterable iterable = gb2.\u00f4\u00f4O000().\u00f8\u00d8o000();
        Object object = iterable;
        iterable = new ArrayList(b.s.mc.o00000(iterable, 10));
        object = object.iterator();
        while (object.hasNext()) {
            Object object2 = object.next();
            object2 = (i)object2;
            Iterable iterable2 = iterable;
            iterable2.add(new b.t.c.b.mc(gb2, (i)object2, gb2.o\u00f6\u00d2000.super()));
        }
        return (List)iterable;
    }

    static /* synthetic */ List if(gb gb2) {
        return gb.\u00d500000(gb2);
    }

    static /* synthetic */ List return(gb gb2) {
        return gb.\u00f400000(gb2);
    }

    static /* synthetic */ List \u00d300000(gb gb2) {
        return gb.\u00d800000(gb2);
    }

    static /* synthetic */ u \u00d400000(gb gb2) {
        return gb.\u00f500000(gb2);
    }

    static /* synthetic */ List o00000(gb gb2) {
        return gb.new(gb2);
    }

    static /* synthetic */ n o00000(mc mc2) {
        return gb.\u00d400000(mc2);
    }

    static /* synthetic */ n o00000(List list, int n2) {
        return gb.new(list, n2);
    }

    static /* synthetic */ n new(mc mc2) {
        return gb.\u00d300000(mc2);
    }

    static /* synthetic */ n new(hc hc2, int n2) {
        return gb.o00000(hc2, n2);
    }
}

