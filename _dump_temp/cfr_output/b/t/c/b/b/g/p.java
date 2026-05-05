/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.g;

import b.o.e.g;
import b.t.c.b.b.b.c;
import b.t.c.b.b.d.f;
import b.t.c.b.b.g.d;
import b.t.c.b.b.g.e$_b;
import b.t.c.b.b.g.e$_c;
import b.t.c.b.b.g.e$_d;
import b.t.c.b.b.g.e$_e;
import b.t.c.b.b.g.h;
import b.t.c.b.b.g.k;
import b.t.c.b.b.g.l$_b;
import b.t.c.b.b.g.l$_c;
import b.t.c.b.b.g.l$_d;
import b.t.c.b.b.g.m;
import b.t.c.b.b.g.o$_b;
import b.t.c.b.b.g.o$_c;
import b.t.c.b.b.g.p$_b$0;
import b.t.c.b.b.g.p$_b$1;
import b.t.c.b.b.g.p$_b$2;
import b.t.c.b.b.g.s;
import b.t.c.b.b.g.u;
import b.t.c.b.b.h.rc;
import b.t.c.b.b.o.e.b.j;
import b.t.c.b.b.o.f.b;
import b.t.c.b.b.q.ib;
import b.t.c.b.b.q.ic;
import b.t.c.b.b.q.jc;
import b.t.c.b.b.q.kb;
import b.t.c.b.b.q.mc;
import b.t.c.b.b.q.pc;
import b.t.c.b.b.q.wb;
import b.t.c.b.b.q.x;
import java.util.Collection;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class p
extends s {
    public static final p \u00d200000 = new p();
    private static final List super;

    private p() {
    }

    @Override
    public final List o00000() {
        return super;
    }

    private final boolean o00000(ic i2, mc object) {
        if (!((object = object.\u00f4O\u00d2000()) instanceof j)) {
            return false;
        }
        if (!(object = ((j)object).\u00d200000()).\u00d80O000()) {
            return false;
        }
        b.t.c.b.b.d.d d2 = b.o00000((kb)object);
        if (d2 == null) {
            return false;
        }
        b.t.c.b.b.d.d d3 = d2;
        b.t.c.b.b.q.h h2 = (object = pc.new(b.\u00d500000((wb)object), d3)) instanceof b.t.c.b.b.q.h ? (b.t.c.b.b.q.h)object : null;
        if (h2 == null) {
            return false;
        }
        object = h2;
        if ((i2 = i2.\u00d3\u00f4o000()) != null) {
            return b.t.c.b.b.h.b.b.super((rc)i2, object.ifStringsuper());
        }
        return false;
    }

    private static final boolean o00000(wb wb2) {
        return wb2 instanceof ib && c.\u00d200000((ib)wb2);
    }

    private static final String \u00d400000(ic b2) {
        boolean bl;
        jc jc2 = (jc)b.s.mc.\u00f4O0000(b2.\u00f5\u00d8o000());
        if (jc2 != null) {
            b2 = jc2;
            bl = !b.o00000(jc2) && b2.\u00d5O\u00d2000() == null;
        } else {
            bl = false;
        }
        boolean bl2 = bl;
        if (!bl2) {
            return "last parameter should not have a default value or be a vararg";
        }
        return null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static final String \u00d300000(ic object) {
        if (p.o00000(object.\u00d8\u00f80000())) return null;
        Object object2 = object.\u00d5\u00f4o000();
        if (!((Collection)object2).isEmpty()) {
            object2 = object2.iterator();
            while (object2.hasNext()) {
                if (!p.o00000(((ic)object2.next()).\u00d8\u00f80000())) continue;
                return null;
            }
        }
        boolean bl = false;
        if (bl) return null;
        if (x.o00000((ic)object)) {
            return null;
        }
        boolean bl2 = false;
        if (bl2) return null;
        object2 = new StringBuilder();
        StringBuilder stringBuilder = object2;
        ((StringBuilder)object2).append("must override ''equals()'' in Any");
        if (!b.t.c.b.b.o.b.new(object.\u00d8\u00f80000())) return ((StringBuilder)object2).toString();
        object = b.t.c.b.b.k.b.\u00d300000.super(b.t.c.b.b.h.b.b.\u00d600000((rc)((ib)object.\u00d8\u00f80000()).nullint()));
        stringBuilder.append(" or define ''equals(other: " + (String)object + "): Boolean''");
        return ((StringBuilder)object2).toString();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static final String return(ic ic2) {
        mc mc2 = ic2.Stringclasssuper();
        if (mc2 == null) {
            mc2 = ic2.nullclasssuper();
        }
        mc mc3 = mc2;
        if (mc3 == null) return "receiver must be a supertype of the return type";
        rc rc2 = ic2.\u00d3\u00f4o000();
        if (rc2 != null ? b.t.c.b.b.h.b.b.super(rc2, mc3.forclasssuper()) : false) return null;
        if (!\u00d200000.o00000(ic2, mc3)) return "receiver must be a supertype of the return type";
        return null;
    }

    static {
        Object[] objectArray = new m[19];
        Object[] objectArray2 = objectArray;
        d[] dArray = new d[2];
        Object[] objectArray3 = dArray;
        dArray[0] = o$_b.\u00d3O0000;
        objectArray3[1] = new e$_c(1);
        objectArray[0] = new m(h.\u00d2o0000, (d[])objectArray3, null, 4, null);
        d[] dArray2 = new d[2];
        objectArray3 = dArray2;
        dArray2[0] = o$_b.\u00d3O0000;
        objectArray3[1] = new e$_c(2);
        objectArray2[1] = new m(h.\u00d5\u00d40000, (d[])objectArray3, (g)p$_b$0.forvoidnew);
        d[] dArray3 = new d[4];
        objectArray3 = dArray3;
        dArray3[0] = o$_b.\u00d3O0000;
        objectArray3[1] = k.\u00d800000;
        objectArray3[2] = new e$_c(2);
        objectArray3[3] = u.\u00d6O0000;
        objectArray2[2] = new m(h.\u00d4\u00d30000, (d[])objectArray3, null, 4, null);
        d[] dArray4 = new d[4];
        objectArray3 = dArray4;
        dArray4[0] = o$_b.\u00d3O0000;
        objectArray3[1] = k.\u00d800000;
        objectArray3[2] = new e$_c(3);
        objectArray3[3] = u.\u00d6O0000;
        objectArray2[3] = new m(h.\u00f5\u00d30000, (d[])objectArray3, null, 4, null);
        d[] dArray5 = new d[4];
        objectArray3 = dArray5;
        dArray5[0] = o$_b.\u00d3O0000;
        objectArray3[1] = k.\u00d800000;
        objectArray3[2] = new e$_d(2);
        objectArray3[3] = u.\u00d6O0000;
        objectArray2[4] = new m(h.\u00d600000, (d[])objectArray3, null, 4, null);
        d[] dArray6 = new d[1];
        objectArray3 = dArray6;
        dArray6[0] = o$_b.\u00d3O0000;
        objectArray2[5] = new m(h.supersuper, (d[])objectArray3, null, 4, null);
        d[] dArray7 = new d[4];
        objectArray3 = dArray7;
        dArray7[0] = o$_b.\u00d3O0000;
        objectArray3[1] = e$_e.\u00d500000;
        objectArray3[2] = k.\u00d800000;
        objectArray3[3] = l$_d.oO0000;
        objectArray2[6] = new m(h.\u00f6\u00d20000, (d[])objectArray3, null, 4, null);
        d[] dArray8 = new d[2];
        objectArray3 = dArray8;
        dArray8[0] = o$_b.\u00d3O0000;
        objectArray3[1] = e$_b.\u00d200000;
        objectArray2[7] = new m(h.\u00d4o0000, (d[])objectArray3, null, 4, null);
        d[] dArray9 = new d[2];
        objectArray3 = dArray9;
        dArray9[0] = o$_b.\u00d3O0000;
        objectArray3[1] = e$_b.\u00d200000;
        objectArray2[8] = new m(h.\u00f5o0000, (d[])objectArray3, null, 4, null);
        d[] dArray10 = new d[3];
        objectArray3 = dArray10;
        dArray10[0] = o$_b.\u00d3O0000;
        objectArray3[1] = e$_b.\u00d200000;
        objectArray3[2] = l$_d.oO0000;
        objectArray2[9] = new m(h.\u00d400000, (d[])objectArray3, null, 4, null);
        d[] dArray11 = new d[3];
        objectArray3 = dArray11;
        dArray11[0] = o$_b.\u00d3O0000;
        objectArray3[1] = e$_e.\u00d500000;
        objectArray3[2] = k.\u00d800000;
        objectArray2[10] = new m(h.\u00d2\u00d20000, (d[])objectArray3, null, 4, null);
        d[] dArray12 = new d[3];
        objectArray3 = dArray12;
        dArray12[0] = o$_b.\u00d3O0000;
        objectArray3[1] = e$_e.\u00d500000;
        objectArray3[2] = k.\u00d800000;
        objectArray2[11] = new m(h.publicnew, (d[])objectArray3, null, 4, null);
        d[] dArray13 = new d[1];
        objectArray3 = dArray13;
        dArray13[0] = o$_c.private;
        objectArray2[12] = new m(h.\u00f500000, (d[])objectArray3, (g)p$_b$1.\u00d50\u00d4000);
        d[] dArray14 = new d[4];
        objectArray3 = dArray14;
        dArray14[0] = o$_b.\u00d3O0000;
        objectArray3[1] = l$_b.\u00f800000;
        objectArray3[2] = e$_e.\u00d500000;
        objectArray3[3] = k.\u00d800000;
        objectArray2[13] = new m(h.\u00d4\u00d40000, (d[])objectArray3, null, 4, null);
        d[] dArray15 = new d[3];
        objectArray3 = dArray15;
        dArray15[0] = o$_b.\u00d3O0000;
        objectArray3[1] = e$_e.\u00d500000;
        objectArray3[2] = k.\u00d800000;
        objectArray2[14] = new m(h.\u00d4O0000, (d[])objectArray3, null, 4, null);
        d[] dArray16 = new d[2];
        objectArray3 = dArray16;
        dArray16[0] = o$_b.\u00d3O0000;
        objectArray3[1] = e$_b.\u00d200000;
        objectArray2[15] = new m(h.O\u00d20000, (d[])objectArray3, null, 4, null);
        f[] fArray = new f[2];
        objectArray3 = fArray;
        fArray[0] = h.intsuper;
        objectArray3[1] = h.\u00f6\u00d30000;
        Collection collection = b.s.mc.new(objectArray3);
        d[] dArray17 = new d[1];
        objectArray3 = dArray17;
        dArray17[0] = o$_b.\u00d3O0000;
        objectArray2[16] = new m(collection, (d[])objectArray3, (g)p$_b$2.\u00d40\u00d4000);
        d[] dArray18 = new d[4];
        objectArray3 = dArray18;
        dArray18[0] = o$_b.\u00d3O0000;
        objectArray3[1] = l$_c.for;
        objectArray3[2] = e$_e.\u00d500000;
        objectArray3[3] = k.\u00d800000;
        objectArray2[17] = new m(h.classsuper, (d[])objectArray3, null, 4, null);
        d[] dArray19 = new d[2];
        objectArray3 = dArray19;
        dArray19[0] = o$_b.\u00d3O0000;
        objectArray3[1] = e$_b.\u00d200000;
        objectArray2[18] = new m(h.Oo0000, (d[])objectArray3, null, 4, null);
        super = b.s.mc.new(objectArray2);
    }

    static /* synthetic */ String \u00d800000(ic ic2) {
        return p.\u00d400000(ic2);
    }

    static /* synthetic */ String \u00d500000(ic ic2) {
        return p.\u00d300000(ic2);
    }

    static /* synthetic */ String new(ic ic2) {
        return p.return(ic2);
    }
}

