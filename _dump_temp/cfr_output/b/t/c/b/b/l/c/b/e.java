/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.l.c.b;

import b.qb;
import b.s.mc;
import b.t.c.b.b.l.b$_c;
import b.t.c.b.b.l.b$_d;
import b.t.c.b.b.l.b$_f;
import b.t.c.b.b.l.b$_i;
import b.t.c.b.b.l.b$_n;
import b.t.c.b.b.l.b$_nb;
import b.t.c.b.b.l.b$_z;
import b.t.c.b.b.l.c;
import b.t.c.b.b.l.c.b;
import b.t.c.b.b.l.c.b$_b;
import b.t.c.b.b.l.c.b$_h;
import b.t.c.b.b.l.c.b.d$_b;
import b.t.c.b.b.l.c.b.d$_c;
import b.t.c.b.b.l.c.b.f;
import b.t.c.b.b.l.c.b.i;
import b.t.c.b.b.l.c.b.j;
import b.t.c.b.b.l.d.d;
import b.t.c.b.b.l.d.g;
import b.t.c.b.b.l.d.k;
import b.t.c.b.b.p.s;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class e {
    public static final e \u00d200000;
    private static final s super;

    private e() {
    }

    public final s super() {
        return super;
    }

    public static final qb \u00d300000(String[] stringArray, String[] stringArray2) {
        return e.\u00d200000(b.t.c.b.b.l.c.b.c.\u00d300000(stringArray), stringArray2);
    }

    public static final qb \u00d200000(byte[] object, String[] stringArray) {
        object = new ByteArrayInputStream((byte[])object);
        return new qb(\u00d200000.super((InputStream)object, stringArray), b$_d.super((InputStream)object, super));
    }

    public static final qb super(String[] stringArray, String[] stringArray2) {
        return e.super(b.t.c.b.b.l.c.b.c.\u00d300000(stringArray), stringArray2);
    }

    public static final qb super(byte[] object, String[] stringArray) {
        object = new ByteArrayInputStream((byte[])object);
        return new qb(\u00d200000.super((InputStream)object, stringArray), b$_i.\u00d300000((InputStream)object, super));
    }

    public static final qb \u00d200000(String[] object, String[] stringArray) {
        object = new ByteArrayInputStream(b.t.c.b.b.l.c.b.c.\u00d300000(object));
        return new qb(\u00d200000.super((InputStream)object, stringArray), b$_z.class((InputStream)object, super));
    }

    private final j super(InputStream inputStream, String[] stringArray) {
        return new j(b$_b.\u00d600000(inputStream, super), stringArray);
    }

    public final d$_c super(b$_z object, b.t.c.b.b.l.d.e e2, d d2) {
        String string;
        int n2;
        Object object2 = (b.t.c.b.b.l.c.b$_f)g.super((b.t.c.b.b.p.d$_c)object, b.null);
        int n3 = n2 = object2 != null && ((b.t.c.b.b.l.c.b$_f)object2).\u00d2\u00d30000() ? ((b.t.c.b.b.l.c.b$_f)object2).\u00f8\u00d20000() : ((b$_z)object).\u00d6\u00f8\u00d3000();
        if (object2 != null && ((b.t.c.b.b.l.c.b$_f)object2).\u00d6\u00d20000()) {
            string = e2.new(((b.t.c.b.b.l.c.b$_f)object2).classnew());
        } else {
            b$_c b$_c;
            Object object3;
            object2 = ((b$_z)object).classreturnnew();
            Object object4 = mc.new((Object)k.\u00d200000((b$_z)object, d2));
            Object object5 = object2;
            object2 = new ArrayList(mc.o00000((Iterable)object2, 10));
            object5 = object5.iterator();
            while (object5.hasNext()) {
                object3 = object5.next();
                b$_c = (b$_c)object3;
                object3 = object2;
                object3.add((b$_nb)k.\u00d200000(b$_c, d2));
            }
            object2 = object5 = (Iterable)mc.return((Collection)object4, (Iterable)((List)object2));
            object5 = new ArrayList(mc.o00000((Iterable)object5, 10));
            object3 = object2.iterator();
            while (object3.hasNext()) {
                b$_c = object3.next();
                object2 = (b$_nb)((Object)b$_c);
                object4 = object5;
                String string2 = \u00d200000.super((b$_nb)object2, e2);
                if (string2 == null) {
                    return null;
                }
                object4.add(string2);
            }
            object2 = (List)object5;
            String string3 = this.super(k.o00000((b$_z)object, d2), e2);
            if (string3 == null) {
                return null;
            }
            object5 = string3;
            string = mc.o00000((Iterable)object2, "", "(", ")", 0, null, null, 56, null) + (String)object5;
        }
        object = string;
        return new d$_c(e2.new(n2), (String)object);
    }

    public final d$_c super(b$_f object, b.t.c.b.b.l.d.e e2, d d2) {
        String string;
        String string2;
        Object object2 = (b.t.c.b.b.l.c.b$_f)g.super((b.t.c.b.b.p.d$_c)object, b.\u00d800000);
        String string3 = string2 = object2 != null && ((b.t.c.b.b.l.c.b$_f)object2).\u00d2\u00d30000() ? e2.new(((b.t.c.b.b.l.c.b$_f)object2).\u00f8\u00d20000()) : "<init>";
        if (object2 != null && ((b.t.c.b.b.l.c.b$_f)object2).\u00d6\u00d20000()) {
            string = e2.new(((b.t.c.b.b.l.c.b$_f)object2).classnew());
        } else {
            object = ((b$_f)object).floatdosuper();
            object2 = object;
            object = new ArrayList(mc.o00000((Iterable)object, 10));
            object2 = object2.iterator();
            while (object2.hasNext()) {
                Object object3 = object2.next();
                object3 = (b$_c)object3;
                Object object4 = object;
                String string4 = \u00d200000.super(k.\u00d200000(object3, d2), e2);
                if (string4 == null) {
                    return null;
                }
                object4.add(string4);
            }
            string = mc.o00000((List)object, "", "(", ")V", 0, null, null, 56, null);
        }
        object = string;
        return new d$_c(string2, (String)object);
    }

    public final d$_b super(b$_n object, b.t.c.b.b.l.d.e e2, d d2, boolean bl) {
        String string;
        int n2;
        b.t.c.b.b.l.c.b$_i b$_i = (b.t.c.b.b.l.c.b$_i)g.super((b.t.c.b.b.p.d$_c)object, b.o00000);
        if (b$_i == null) {
            return null;
        }
        b.t.c.b.b.p.d d3 = b$_i;
        d3 = b$_i.\u00d6\u00d50000() ? ((b.t.c.b.b.l.c.b$_i)d3).doString() : null;
        if (d3 == null && bl) {
            return null;
        }
        int n3 = n2 = d3 != null && ((b$_h)d3).\u00d8\u00d40000() ? ((b$_h)d3).\u00d4\u00d40000() : ((b$_n)object).\u00d8\u00d5\u00d3000();
        if (d3 != null && ((b$_h)d3).O\u00d40000()) {
            string = e2.new(((b$_h)d3).\u00f8\u00d30000());
        } else {
            string = this.super(k.o00000((b$_n)object, d2), e2);
            if (string == null) {
                return null;
            }
        }
        object = string;
        return new d$_b(e2.new(n2), (String)object);
    }

    public static /* synthetic */ d$_b super(e e2, b$_n b$_n, b.t.c.b.b.l.d.e e3, d d2, boolean bl, int n2, Object object) {
        if ((n2 & 8) != 0) {
            bl = true;
        }
        return e2.super(b$_n, e3, d2, bl);
    }

    private final String super(b$_nb b$_nb, b.t.c.b.b.l.d.e e2) {
        if (b$_nb.donullnew()) {
            return i.super(e2.\u00d300000(b$_nb.Objectintnew()));
        }
        return null;
    }

    public static final boolean super(b$_n b$_n) {
        return f.\u00d300000.\u00d300000().\u00d200000(((Number)b$_n.\u00d300000(b.\u00d300000)).intValue());
    }

    static {
        s s2;
        \u00d200000 = new e();
        s s3 = s2 = s.\u00d200000();
        b.o00000(s2);
        c.o00000(s3);
        super = s2;
    }
}

