/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b;

import b.s.mc;
import b.t.b;
import b.t.c.b.b.c.c.e;
import b.t.c.b.b.c.c.i;
import b.t.c.b.b.c.gb;
import b.t.c.b.d.c;
import b.t.c.b.d.d;
import b.t.c.b.d.g;
import b.t.c.b.d.g$_b;
import b.t.c.b.d.g$_c;
import b.t.c.b.d.h;
import b.t.c.b.d.h$_d$_b;
import b.t.c.b.d.h$_d$_c;
import b.t.c.b.d.h$_d$_d;
import b.t.c.b.d.h$_d$_e;
import b.t.c.b.d.h$_d$_f;
import b.t.c.b.d.h$_e;
import b.t.c.b.d.h$_e$_b;
import b.t.c.b.d.h$_e$_c;
import b.t.c.b.d.h$_e$_d;
import b.t.c.b.d.h$_e$_e;
import b.t.c.b.d.h$_e$_f;
import b.t.c.b.d.h$_h;
import b.t.c.b.d.h$_h$_b;
import b.t.c.b.d.h$_h$_c;
import b.t.c.b.d.h$_h$_d;
import b.t.c.b.d.h$_h$_e;
import b.t.c.b.d.h$_h$_f;
import b.t.c.b.d.h$_h$_g;
import b.t.c.b.hd;
import b.t.c.b.jc;
import b.t.c.b.lb;
import b.t.c.b.lc;
import b.t.c.b.md;
import b.t.c.b.r;
import b.t.j;
import b.t.p;
import b.t.z;
import java.lang.reflect.Field;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class fc {
    public static final Object super(b.t.c.b.g$_c g$_c) {
        return md.\u00d400000(g$_c.Stringpublic());
    }

    /*
     * Enabled aggressive block sorting
     */
    public static final b.t.c.b.d.b super(b.t.c.b.g$_c g$_c, boolean bl) {
        h h2;
        b.t.c.b.d.b b2;
        Object object;
        b.t.c.b.g g2 = g$_c.Stringpublic();
        if (lc.o00000(g2)) {
            return c.o00000;
        }
        Object object2 = g2.O\u00f8O000();
        b.t.c.b.b.c.c.g g3 = bl ? b.t.c.b.b.c.c.c.\u00d400000((b.t.c.b.b.c.e)object2) : b.t.c.b.b.c.c.c.\u00d300000((b.t.c.b.b.c.e)object2);
        if (g3 != null) {
            object2 = g3;
            object = g2.o\u00d8O000().\u00d400000(((i)object2).\u00d200000(), ((i)object2).o00000());
        } else {
            object = object2 = null;
        }
        if (object == null) {
            if (d.o00000(g2) && g2.\u00f8\u00d5O000() == j.\u00d400000) {
                Class clazz = d.new(((p)mc.\u00d5O0000(g2.\u00d8\u00d5O000())).\u00f8\u00f50000());
                GenericDeclaration genericDeclaration = clazz;
                if (clazz == null) throw new lb("Underlying property of inline class " + g2 + " should have a field");
                if ((genericDeclaration = d.new(genericDeclaration, g2)) == null) {
                    throw new lb("Underlying property of inline class " + g2 + " should have a field");
                }
                object2 = genericDeclaration;
                b2 = md.\u00d300000(g$_c) ? (g)new g$_b((Method)object2, fc.super(g$_c)) : (g)new g$_c((Method)object2);
                return d.o00000(b2, g$_c, false, mc.\u00d500000());
            }
            Field field = g2.\u00f4\u00f6O000();
            if (field == null) {
                throw new lb("No accessors or field is found for property ".concat(String.valueOf(g2)));
            }
            object2 = field;
            h2 = fc.super(g2, bl, g$_c, (Field)object2);
        } else {
            if (!Modifier.isStatic(((Method)object2).getModifiers())) {
                b2 = md.\u00d300000(g$_c) ? (h$_h)new h$_h$_e((Method)object2, fc.super(g$_c)) : (h$_h)new h$_h$_c((Method)object2);
                return d.o00000(b2, g$_c, false, mc.\u00d500000());
            }
            if (fc.\u00d200000(g$_c)) {
                b2 = md.\u00d300000(g$_c) ? (h$_h)new h$_h$_g((Method)object2) : (h$_h)new h$_h$_d((Method)object2);
                return d.o00000(b2, g$_c, false, mc.\u00d500000());
            }
            h2 = md.\u00d300000(g$_c) ? (h$_h)new h$_h$_b((Method)object2, false, fc.super(g$_c)) : (h$_h)new h$_h$_f((Method)object2);
        }
        b2 = h2;
        return d.o00000(b2, g$_c, false, mc.\u00d500000());
    }

    private static final boolean super(b.t.c.b.g g2) {
        b b2 = g2.o\u00d8O000();
        if (!(b2 instanceof r) || ((r)b2).\u00f4\u00d2o000() != gb.\u00f400000) {
            return false;
        }
        r r2 = (b2 = b.o.r.o00000(b.o.r.\u00d300000((z)b2).getEnclosingClass())) instanceof r ? (r)b2 : null;
        if (r2 == null) {
            return false;
        }
        b2 = r2;
        if (r2.\u00f4\u00d2o000() == gb.void || ((r)b2).\u00f4\u00d2o000() == gb.o00000) {
            return e.\u00d200000(g2.O\u00f8O000());
        }
        return true;
    }

    private static final boolean \u00d200000(b.t.c.b.g$_c object) {
        if (!(((b.t.c.b.g$_c)object).o\u00d8O000() instanceof jc)) {
            object = "Only top-level properties are supported for now: ".concat(String.valueOf(object));
            throw new IllegalArgumentException(object.toString());
        }
        return false;
    }

    private static final boolean \u00d200000(b.t.c.b.g g2) {
        return !hd.super(g2.\u00d5\u00d5O000());
    }

    private static final h super(b.t.c.b.g g2, boolean bl, b.t.c.b.g$_c g$_c, Field field) {
        if (fc.super(g2) || !Modifier.isStatic(field.getModifiers())) {
            if (bl) {
                return md.\u00d300000(g$_c) ? (h$_e)new h$_e$_d(field, fc.super(g$_c)) : (h$_e)new h$_e$_b(field);
            }
            if (md.\u00d300000(g$_c)) {
                return new h$_d$_d(field, fc.\u00d200000(g2), fc.super(g$_c));
            }
            return new h$_d$_b(field, fc.\u00d200000(g2));
        }
        if (fc.\u00d200000(g$_c)) {
            if (bl) {
                return md.\u00d300000(g$_c) ? (h$_e)new h$_e$_f(field) : (h$_e)new h$_e$_c(field);
            }
            if (md.\u00d300000(g$_c)) {
                return new h$_d$_f(field, fc.\u00d200000(g2));
            }
            return new h$_d$_c(field, fc.\u00d200000(g2));
        }
        if (bl) {
            return new h$_e$_e(field);
        }
        return new h$_d$_e(field, fc.\u00d200000(g2));
    }
}

