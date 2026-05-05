/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.q.b;

import b.o.e.h;
import b.t.c.b.b.h.kc;
import b.t.c.b.b.h.nc;
import b.t.c.b.b.h.rc;
import b.t.c.b.b.h.w;
import b.t.c.b.b.o.d;
import b.t.c.b.b.o.e.b.k;
import b.t.c.b.b.q.ab;
import b.t.c.b.b.q.b;
import b.t.c.b.b.q.b$_b;
import b.t.c.b.b.q.b.f;
import b.t.c.b.b.q.b.i$1;
import b.t.c.b.b.q.b.i$2;
import b.t.c.b.b.q.b.i$_b;
import b.t.c.b.b.q.b.ib;
import b.t.c.b.b.q.b.ib$_b;
import b.t.c.b.b.q.b.kb;
import b.t.c.b.b.q.e.j;
import b.t.c.b.b.q.e.o;
import b.t.c.b.b.q.eb;
import b.t.c.b.b.q.g;
import b.t.c.b.b.q.hc$_b;
import b.t.c.b.b.q.ic;
import b.t.c.b.b.q.ic$_b;
import b.t.c.b.b.q.jc;
import b.t.c.b.b.q.mc;
import b.t.c.b.b.q.qc;
import b.t.c.b.b.q.s;
import b.t.c.b.b.q.wb;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public abstract class i
extends kb
implements ic {
    private List O0\u00d6000;
    private List \u00f4O\u00d6000;
    private rc \u00d50\u00d6000;
    private List StringvoidObject;
    private mc \u00d40\u00d6000;
    private mc \u00f8O\u00d6000;
    private ab privatevoidObject;
    private s forvoidObject;
    private boolean \u00d30\u00d6000;
    private boolean \u00f5O\u00d6000;
    private boolean oO\u00d6000;
    private boolean \u00d3O\u00d6000;
    private boolean \u00f80\u00d6000;
    private boolean nullvoidObject;
    private boolean o0\u00d6000;
    private boolean \u00d8O\u00d6000;
    private boolean \u00f50\u00d6000;
    private boolean thisvoidObject;
    private boolean \u00f40\u00d6000;
    private boolean \u00d5O\u00d6000;
    private Collection Oo\u00d6000;
    private volatile h OO\u00d6000;
    private final ic \u00d4O\u00d6000;
    private final hc$_b \u00d80\u00d6000;
    private ic \u00f8\u00f8\u00d5000;
    protected Map whilereturnObject;

    protected i(wb wb2, ic ic2, o o2, b.t.c.b.b.d.f f2, hc$_b hc$_b, g g2) {
        if (wb2 == null) {
            i.\u00d8\u00d40000(0);
        }
        if (o2 == null) {
            i.\u00d8\u00d40000(1);
        }
        if (f2 == null) {
            i.\u00d8\u00d40000(2);
        }
        if (hc$_b == null) {
            i.\u00d8\u00d40000(3);
        }
        if (g2 == null) {
            i.\u00d8\u00d40000(4);
        }
        super(wb2, o2, f2, g2);
        this.forvoidObject = eb.OO0000;
        this.\u00d30\u00d6000 = false;
        this.\u00f5O\u00d6000 = false;
        this.oO\u00d6000 = false;
        this.\u00d3O\u00d6000 = false;
        this.\u00f80\u00d6000 = false;
        this.nullvoidObject = false;
        this.o0\u00d6000 = false;
        this.\u00d8O\u00d6000 = false;
        this.\u00f50\u00d6000 = false;
        this.thisvoidObject = false;
        this.\u00f40\u00d6000 = true;
        this.\u00d5O\u00d6000 = false;
        this.Oo\u00d6000 = null;
        this.OO\u00d6000 = null;
        this.\u00f8\u00f8\u00d5000 = null;
        this.whilereturnObject = null;
        this.\u00d4O\u00d6000 = ic2 == null ? this : ic2;
        this.\u00d80\u00d6000 = hc$_b;
    }

    public i o00000(mc mc2, mc nb2, List list, List list2, List list3, rc rc2, ab ab2, s s2) {
        int n2;
        if (list == null) {
            i.\u00d8\u00d40000(5);
        }
        if (list2 == null) {
            i.\u00d8\u00d40000(6);
        }
        if (list3 == null) {
            i.\u00d8\u00d40000(7);
        }
        if (s2 == null) {
            i.\u00d8\u00d40000(8);
        }
        this.O0\u00d6000 = b.s.mc.\u00f5O0000((Iterable)list2);
        this.\u00f4O\u00d6000 = b.s.mc.\u00f5O0000((Iterable)list3);
        this.\u00d50\u00d6000 = rc2;
        this.privatevoidObject = ab2;
        this.forvoidObject = s2;
        this.\u00d40\u00d6000 = mc2;
        this.\u00f8O\u00d6000 = nb2;
        this.StringvoidObject = list;
        for (n2 = 0; n2 < list2.size(); ++n2) {
            nb2 = (b.t.c.b.b.q.i)list2.get(n2);
            if (nb2.privateObjectsuper() == n2) continue;
            throw new IllegalStateException(nb2 + " index is " + nb2.privateObjectsuper() + " but position is " + n2);
        }
        for (n2 = 0; n2 < list3.size(); ++n2) {
            nb2 = (jc)list3.get(n2);
            if (nb2.whilenullsuper() == n2 + 0) continue;
            throw new IllegalStateException(nb2 + "index is " + nb2.whilenullsuper() + " but position is " + n2);
        }
        return this;
    }

    public void new(s s2) {
        if (s2 == null) {
            i.\u00d8\u00d40000(10);
        }
        this.forvoidObject = s2;
    }

    public void OO0000(boolean bl) {
        this.\u00d30\u00d6000 = bl;
    }

    public void while(boolean bl) {
        this.\u00f5O\u00d6000 = bl;
    }

    public void \u00f5O0000(boolean bl) {
        this.oO\u00d6000 = bl;
    }

    public void \u00d8O0000(boolean bl) {
        this.\u00d3O\u00d6000 = bl;
    }

    public void \u00d4O0000(boolean bl) {
        this.\u00f80\u00d6000 = bl;
    }

    public void \u00d3O0000(boolean bl) {
        this.nullvoidObject = bl;
    }

    public void \u00f8O0000(boolean bl) {
        this.o0\u00d6000 = bl;
    }

    private void \u00f4O0000(boolean bl) {
        this.\u00d8O\u00d6000 = bl;
    }

    private void oO0000(boolean bl) {
        this.\u00f50\u00d6000 = bl;
    }

    public void Stringsuper(boolean bl) {
        this.thisvoidObject = bl;
    }

    public void while(rc rc2) {
        if (rc2 == null) {
            i.\u00d8\u00d40000(11);
        }
        this.\u00d50\u00d6000 = rc2;
    }

    public void thissuper(boolean bl) {
        this.\u00f40\u00d6000 = bl;
    }

    public void \u00d5O0000(boolean bl) {
        this.\u00d5O\u00d6000 = bl;
    }

    @Override
    public List \u00d4\u00f4o000() {
        List list = this.StringvoidObject;
        if (list == null) {
            i.\u00d8\u00d40000(13);
        }
        return list;
    }

    @Override
    public mc nullclasssuper() {
        return this.\u00d40\u00d6000;
    }

    @Override
    public mc Stringclasssuper() {
        return this.\u00f8O\u00d6000;
    }

    @Override
    public Collection \u00d5\u00f4o000() {
        this.\u00d5\u00f6o000();
        Collection<Object> collection = this.Oo\u00d6000 != null ? this.Oo\u00d6000 : Collections.emptyList();
        if (collection == null) {
            i.\u00d8\u00d40000(14);
        }
        return collection;
    }

    private void \u00d5\u00f6o000() {
        h h2 = this.OO\u00d6000;
        if (h2 != null) {
            this.Oo\u00d6000 = (Collection)h2.newreturn();
            this.OO\u00d6000 = null;
        }
    }

    @Override
    public ab \u00f40O000() {
        ab ab2 = this.privatevoidObject;
        if (ab2 == null) {
            i.\u00d8\u00d40000(15);
        }
        return ab2;
    }

    @Override
    public s \u00d50O000() {
        s s2 = this.forvoidObject;
        if (s2 == null) {
            i.\u00d8\u00d40000(16);
        }
        return s2;
    }

    @Override
    public boolean \u00d3\u00f5o000() {
        if (this.\u00d30\u00d6000) {
            return true;
        }
        Iterator iterator = this.\u00f5\u00f5o000().\u00d5\u00f4o000().iterator();
        while (iterator.hasNext()) {
            if (!((ic)iterator.next()).\u00d3\u00f5o000()) continue;
            return true;
        }
        return false;
    }

    @Override
    public boolean \u00f4\u00f5o000() {
        if (this.\u00f5O\u00d6000) {
            return true;
        }
        Iterator iterator = this.\u00f5\u00f5o000().\u00d5\u00f4o000().iterator();
        while (iterator.hasNext()) {
            if (!((ic)iterator.next()).\u00f4\u00f5o000()) continue;
            return true;
        }
        return false;
    }

    @Override
    public boolean \u00f50O000() {
        return this.oO\u00d6000;
    }

    @Override
    public boolean \u00f8\u00f5o000() {
        return this.\u00d3O\u00d6000;
    }

    @Override
    public boolean newreturnsuper() {
        return this.\u00f80\u00d6000;
    }

    @Override
    public boolean \u00d5\u00f5o000() {
        return this.thisvoidObject;
    }

    @Override
    public boolean \u00d80O000() {
        return this.nullvoidObject;
    }

    @Override
    public boolean thisint() {
        return this.o0\u00d6000;
    }

    @Override
    public Object o00000(b$_b b$_b) {
        if (this.whilereturnObject == null) {
            return null;
        }
        return this.whilereturnObject.get(b$_b);
    }

    @Override
    public boolean \u00d4\u00f5o000() {
        return this.\u00d8O\u00d6000;
    }

    @Override
    public void o00000(Collection object) {
        if (object == null) {
            i.\u00d8\u00d40000(17);
        }
        this.Oo\u00d6000 = object;
        object = this.Oo\u00d6000.iterator();
        while (object.hasNext()) {
            if (!((ic)object.next()).returnreturnsuper()) continue;
            this.\u00f50\u00d6000 = true;
            return;
        }
    }

    @Override
    public List \u00f8\u00d8o000() {
        List list = this.O0\u00d6000;
        if (list == null) {
            throw new IllegalStateException("typeParameters == null for ".concat(String.valueOf(this)));
        }
        List list2 = list;
        if (list2 == null) {
            i.\u00d8\u00d40000(18);
        }
        return list2;
    }

    @Override
    public List \u00f5\u00d8o000() {
        List list = this.\u00f4O\u00d6000;
        if (list == null) {
            i.\u00d8\u00d40000(19);
        }
        return list;
    }

    public boolean thisvoidsuper() {
        return this.\u00f40\u00d6000;
    }

    @Override
    public boolean o\u00f4o000() {
        return this.\u00d5O\u00d6000;
    }

    @Override
    public rc \u00d3\u00f4o000() {
        return this.\u00d50\u00d6000;
    }

    @Override
    public ic \u00f5\u00f5o000() {
        ic ic2 = this.\u00d4O\u00d6000 == this ? this : this.\u00d4O\u00d6000.\u00f5\u00f5o000();
        if (ic2 == null) {
            i.\u00d8\u00d40000(20);
        }
        return ic2;
    }

    @Override
    public hc$_b O\u00f5o000() {
        hc$_b hc$_b = this.\u00d80\u00d6000;
        if (hc$_b == null) {
            i.\u00d8\u00d40000(21);
        }
        return hc$_b;
    }

    @Override
    public ic \u00d300000(kc kc2) {
        if (kc2 == null) {
            i.\u00d8\u00d40000(22);
        }
        if (kc2.o00000()) {
            return this;
        }
        return this.\u00d400000(kc2).new(this.\u00f5\u00f5o000()).\u00d800000().\u00d400000(true).\u00d500000();
    }

    @Override
    public boolean returnreturnsuper() {
        return this.\u00f50\u00d6000;
    }

    @Override
    public ic$_b ifreturnsuper() {
        i$_b i$_b = this.\u00d400000(kc.\u00d200000);
        if (i$_b == null) {
            i.\u00d8\u00d40000(23);
        }
        return i$_b;
    }

    protected i$_b \u00d400000(kc kc2) {
        if (kc2 == null) {
            i.\u00d8\u00d40000(24);
        }
        return new i$_b(this, kc2.new(), this.\u00d8\u00f80000(), this.\u00f40O000(), this.\u00d50O000(), this.O\u00f5o000(), this.\u00f5\u00d8o000(), this.\u00d4\u00f4o000(), this.nullclasssuper(), this.\u00d3\u00f4o000(), null);
    }

    public ic o00000(i$_b i$_b) {
        Object object;
        Object object2;
        rc rc2;
        Object object32;
        if (i$_b == null) {
            i.\u00d8\u00d40000(25);
        }
        Object object4 = new boolean[1];
        Object object5 = i$_b.o00000(i$_b) != null ? j.o00000(this.\u00d4\u00f80000(), i$_b.o00000(i$_b)) : this.\u00d4\u00f80000();
        object5 = this.o00000(i$_b.\u00d5O0000, i$_b.float, i$_b.\u00d600000, i$_b.Oo0000, (o)object5, this.o00000(i$_b.\u00f600000, i$_b.float));
        Object object6 = i$_b.new(i$_b) == null ? this.\u00f8\u00d8o000() : i$_b.new(i$_b);
        object4[0] = object4[0] | !object6.isEmpty();
        Object object7 = new ArrayList(object6.size());
        if ((object6 = nc.o00000((List)object6, i$_b.\u00f4O0000, (wb)object5, object7, (boolean[])object4)) == null) {
            return null;
        }
        ArrayList<mc> arrayList = new ArrayList<mc>();
        if (!i$_b.\u00d200000.isEmpty()) {
            int n2 = 0;
            for (Object object32 : i$_b.\u00d200000) {
                rc2 = ((kc)object6).o00000(object32.forclasssuper(), w.o00000);
                if (rc2 == null) {
                    return null;
                }
                object2 = d.o00000((b)object5, rc2, ((b.t.c.b.b.o.e.b.i)object32.\u00f4O\u00d2000()).Object(), object32.\u00d4\u00f80000(), n2++);
                arrayList.add((mc)object2);
                object4[0] = object4[0] | rc2 != object32.forclasssuper();
            }
        }
        f f2 = null;
        if (i$_b.\u00d2O0000 != null) {
            object = ((kc)object6).o00000(i$_b.\u00d2O0000.forclasssuper(), w.o00000);
            if (object == null) {
                return null;
            }
            f2 = new f((wb)object5, new k((b)object5, (rc)object, i$_b.\u00d2O0000.\u00f4O\u00d2000()), i$_b.\u00d2O0000.\u00d4\u00f80000());
            object4[0] = object4[0] | object != i$_b.\u00d2O0000.forclasssuper();
        }
        object = null;
        if (i$_b.classsuper != null) {
            object = i$_b.classsuper.if((kc)object6);
            if (object == null) {
                return null;
            }
            object4[0] = object4[0] | object != i$_b.classsuper;
        }
        if ((object32 = i.o00000((ic)object5, i$_b.\u00f400000, (kc)object6, i$_b.\u00d6O0000, i$_b.\u00f600000, (boolean[])object4)) == null) {
            return null;
        }
        rc2 = ((kc)object6).o00000(i$_b.\u00f6O0000, w.return);
        if (rc2 == null) {
            return null;
        }
        object4[0] = object4[0] | rc2 != i$_b.\u00f6O0000;
        if (!object4[0] && i$_b.\u00d400000) {
            return this;
        }
        ((i)object5).o00000(f2, (mc)object, arrayList, (List)object7, (List)object32, rc2, i$_b.\u00f500000, i$_b.public);
        ((i)object5).OO0000(this.\u00d30\u00d6000);
        ((i)object5).while(this.\u00f5O\u00d6000);
        ((i)object5).\u00f5O0000(this.oO\u00d6000);
        ((i)object5).\u00d8O0000(this.\u00d3O\u00d6000);
        ((i)object5).\u00d4O0000(this.\u00f80\u00d6000);
        ((i)object5).Stringsuper(this.thisvoidObject);
        ((i)object5).\u00d3O0000(this.nullvoidObject);
        ((i)object5).\u00f8O0000(this.o0\u00d6000);
        ((i)object5).thissuper(this.\u00f40\u00d6000);
        super.\u00f4O0000(i$_b.\u00d500000(i$_b));
        super.oO0000(i$_b.return(i$_b));
        ((i)object5).\u00d5O0000(i$_b.\u00d400000(i$_b) != null ? i$_b.\u00d400000(i$_b) : this.\u00d5O\u00d6000);
        if (!i$_b.\u00d300000(i$_b).isEmpty() || this.whilereturnObject != null) {
            object2 = i$_b.\u00d300000(i$_b);
            if (this.whilereturnObject != null) {
                object4 = this.whilereturnObject.entrySet().iterator();
                while (object4.hasNext()) {
                    object7 = (Map.Entry)object4.next();
                    if (object2.containsKey(object7.getKey())) continue;
                    object2.put(object7.getKey(), object7.getValue());
                }
            }
            ((i)object5).whilereturnObject = object2.size() == 1 ? Collections.singletonMap(object2.keySet().iterator().next(), object2.values().iterator().next()) : object2;
        }
        if (i$_b.supersuper || this.\u00d8\u00f5o000() != null) {
            object4 = (this.\u00d8\u00f5o000() != null ? this.\u00d8\u00f5o000() : this).\u00d300000((kc)object6);
            super.\u00d800000((ic)object4);
        }
        if (i$_b.oO0000 && !this.\u00f5\u00f5o000().\u00d5\u00f4o000().isEmpty()) {
            if (i$_b.\u00f4O0000.o00000()) {
                object2 = this.OO\u00d6000;
                if (object2 != null) {
                    ((i)object5).OO\u00d6000 = object2;
                } else {
                    ((i)object5).o00000(this.\u00d5\u00f4o000());
                }
            } else {
                ((i)object5).OO\u00d6000 = new i$1(this, (kc)object6);
            }
        }
        return object5;
    }

    public ic \u00d300000(wb wb2, ab ab2, s s2, hc$_b hc$_b, boolean bl) {
        ic ic2 = this.ifreturnsuper().o00000(wb2).o00000(ab2).o00000(s2).o00000(hc$_b).o00000(bl).\u00d500000();
        if (ic2 == null) {
            i.\u00d8\u00d40000(26);
        }
        return ic2;
    }

    protected abstract i o00000(wb var1, ic var2, hc$_b var3, b.t.c.b.b.d.f var4, o var5, g var6);

    private g o00000(boolean bl, ic ic2) {
        g g2 = bl ? (ic2 != null ? ic2 : this.\u00f5\u00f5o000()).\u00f4\u00f80000() : g.o00000;
        if (g2 == null) {
            i.\u00d8\u00d40000(27);
        }
        return g2;
    }

    @Override
    public Object o00000(qc qc2, Object object) {
        return qc2.super(this, object);
    }

    public static List o00000(ic ic2, List list, kc kc2) {
        if (list == null) {
            i.\u00d8\u00d40000(28);
        }
        if (kc2 == null) {
            i.\u00d8\u00d40000(29);
        }
        return i.o00000(ic2, list, kc2, false, false, null);
    }

    public static List o00000(ic ic2, List object, kc kc2, boolean bl, boolean bl2, boolean[] blArray) {
        if (object == null) {
            i.\u00d8\u00d40000(30);
        }
        if (kc2 == null) {
            i.\u00d8\u00d40000(31);
        }
        ArrayList<ib> arrayList = new ArrayList<ib>(object.size());
        object = object.iterator();
        while (object.hasNext()) {
            rc rc2;
            jc jc2 = (jc)object.next();
            rc rc3 = kc2.o00000(jc2.forclasssuper(), w.o00000);
            Object object2 = jc2.\u00d5O\u00d2000();
            rc rc4 = rc2 = object2 == null ? null : kc2.o00000((rc)object2, w.o00000);
            if (rc3 == null) {
                return null;
            }
            if ((rc3 != jc2.forclasssuper() || object2 != rc2) && blArray != null) {
                blArray[0] = true;
            }
            object2 = null;
            if (jc2 instanceof ib$_b) {
                object2 = ((ib$_b)jc2).\u00d8O\u00d2000();
                object2 = new i$2((List)object2);
            }
            arrayList.add(ib.o00000(ic2, bl ? null : jc2, jc2.whilenullsuper(), jc2.\u00d4\u00f80000(), jc2.\u00d5\u00f80000(), rc3, jc2.\u00f80\u00d2000(), jc2.\u00d3O\u00d2000(), jc2.\u00d4O\u00d2000(), rc2, bl2 ? jc2.\u00f4\u00f80000() : g.o00000, (h)object2));
        }
        return arrayList;
    }

    @Override
    public ic \u00d8\u00f5o000() {
        return this.\u00f8\u00f8\u00d5000;
    }

    private void \u00d800000(ic ic2) {
        this.\u00f8\u00f8\u00d5000 = ic2;
    }

    public void o00000(b$_b b$_b, Object object) {
        if (this.whilereturnObject == null) {
            this.whilereturnObject = new LinkedHashMap();
        }
        this.whilereturnObject.put(b$_b, object);
    }

    static /* synthetic */ mc o00000(i i2) {
        return i2.\u00f8O\u00d6000;
    }

    private static /* synthetic */ void \u00d8\u00d40000(int n2) {
        RuntimeException runtimeException;
        Object[] objectArray;
        Object[] objectArray2;
        int n3;
        String string;
        switch (n2) {
            default: {
                string = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
            }
            case 9: 
            case 13: 
            case 14: 
            case 15: 
            case 16: 
            case 18: 
            case 19: 
            case 20: 
            case 21: 
            case 23: 
            case 26: 
            case 27: {
                string = "@NotNull method %s.%s must not return null";
            }
        }
        switch (n2) {
            default: {
                n3 = 3;
                break;
            }
            case 9: 
            case 13: 
            case 14: 
            case 15: 
            case 16: 
            case 18: 
            case 19: 
            case 20: 
            case 21: 
            case 23: 
            case 26: 
            case 27: {
                n3 = 2;
            }
        }
        Object[] objectArray3 = new Object[n3];
        switch (n2) {
            default: {
                objectArray2 = objectArray3;
                objectArray3[0] = "containingDeclaration";
                break;
            }
            case 1: {
                objectArray2 = objectArray3;
                objectArray3[0] = "annotations";
                break;
            }
            case 2: {
                objectArray2 = objectArray3;
                objectArray3[0] = "name";
                break;
            }
            case 3: {
                objectArray2 = objectArray3;
                objectArray3[0] = "kind";
                break;
            }
            case 4: {
                objectArray2 = objectArray3;
                objectArray3[0] = "source";
                break;
            }
            case 5: {
                objectArray2 = objectArray3;
                objectArray3[0] = "contextReceiverParameters";
                break;
            }
            case 6: {
                objectArray2 = objectArray3;
                objectArray3[0] = "typeParameters";
                break;
            }
            case 7: 
            case 28: 
            case 30: {
                objectArray2 = objectArray3;
                objectArray3[0] = "unsubstitutedValueParameters";
                break;
            }
            case 8: 
            case 10: {
                objectArray2 = objectArray3;
                objectArray3[0] = "visibility";
                break;
            }
            case 9: 
            case 13: 
            case 14: 
            case 15: 
            case 16: 
            case 18: 
            case 19: 
            case 20: 
            case 21: 
            case 23: 
            case 26: 
            case 27: {
                objectArray2 = objectArray3;
                objectArray3[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl";
                break;
            }
            case 11: {
                objectArray2 = objectArray3;
                objectArray3[0] = "unsubstitutedReturnType";
                break;
            }
            case 12: {
                objectArray2 = objectArray3;
                objectArray3[0] = "extensionReceiverParameter";
                break;
            }
            case 17: {
                objectArray2 = objectArray3;
                objectArray3[0] = "overriddenDescriptors";
                break;
            }
            case 22: {
                objectArray2 = objectArray3;
                objectArray3[0] = "originalSubstitutor";
                break;
            }
            case 24: 
            case 29: 
            case 31: {
                objectArray2 = objectArray3;
                objectArray3[0] = "substitutor";
                break;
            }
            case 25: {
                objectArray2 = objectArray3;
                objectArray3[0] = "configuration";
            }
        }
        switch (n2) {
            default: {
                objectArray = objectArray2;
                objectArray2[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl";
                break;
            }
            case 9: {
                objectArray = objectArray2;
                objectArray2[1] = "initialize";
                break;
            }
            case 13: {
                objectArray = objectArray2;
                objectArray2[1] = "getContextReceiverParameters";
                break;
            }
            case 14: {
                objectArray = objectArray2;
                objectArray2[1] = "getOverriddenDescriptors";
                break;
            }
            case 15: {
                objectArray = objectArray2;
                objectArray2[1] = "getModality";
                break;
            }
            case 16: {
                objectArray = objectArray2;
                objectArray2[1] = "getVisibility";
                break;
            }
            case 18: {
                objectArray = objectArray2;
                objectArray2[1] = "getTypeParameters";
                break;
            }
            case 19: {
                objectArray = objectArray2;
                objectArray2[1] = "getValueParameters";
                break;
            }
            case 20: {
                objectArray = objectArray2;
                objectArray2[1] = "getOriginal";
                break;
            }
            case 21: {
                objectArray = objectArray2;
                objectArray2[1] = "getKind";
                break;
            }
            case 23: {
                objectArray = objectArray2;
                objectArray2[1] = "newCopyBuilder";
                break;
            }
            case 26: {
                objectArray = objectArray2;
                objectArray2[1] = "copy";
                break;
            }
            case 27: {
                objectArray = objectArray2;
                objectArray2[1] = "getSourceToUseForCopy";
            }
        }
        switch (n2) {
            default: {
                objectArray = objectArray;
                objectArray[2] = "<init>";
                break;
            }
            case 5: 
            case 6: 
            case 7: 
            case 8: {
                objectArray = objectArray;
                objectArray[2] = "initialize";
                break;
            }
            case 9: 
            case 13: 
            case 14: 
            case 15: 
            case 16: 
            case 18: 
            case 19: 
            case 20: 
            case 21: 
            case 23: 
            case 26: 
            case 27: {
                break;
            }
            case 10: {
                objectArray = objectArray;
                objectArray[2] = "setVisibility";
                break;
            }
            case 11: {
                objectArray = objectArray;
                objectArray[2] = "setReturnType";
                break;
            }
            case 12: {
                objectArray = objectArray;
                objectArray[2] = "setExtensionReceiverParameter";
                break;
            }
            case 17: {
                objectArray = objectArray;
                objectArray[2] = "setOverriddenDescriptors";
                break;
            }
            case 22: {
                objectArray = objectArray;
                objectArray[2] = "substitute";
                break;
            }
            case 24: {
                objectArray = objectArray;
                objectArray[2] = "newCopyBuilder";
                break;
            }
            case 25: {
                objectArray = objectArray;
                objectArray[2] = "doSubstitute";
                break;
            }
            case 28: 
            case 29: 
            case 30: 
            case 31: {
                objectArray = objectArray;
                objectArray[2] = "getSubstitutedValueParameters";
            }
        }
        String string2 = String.format(string, objectArray);
        switch (n2) {
            default: {
                runtimeException = new IllegalArgumentException(string2);
                break;
            }
            case 9: 
            case 13: 
            case 14: 
            case 15: 
            case 16: 
            case 18: 
            case 19: 
            case 20: 
            case 21: 
            case 23: 
            case 26: 
            case 27: {
                runtimeException = new IllegalStateException(string2);
            }
        }
        throw runtimeException;
    }
}

