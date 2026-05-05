/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b;

import b.dc;
import b.o.d.fc;
import b.o.d.sb$_e;
import b.qd;
import b.r;
import b.s.mc;
import b.s.y;
import b.t.bb;
import b.t.c.b.b.c.c.c;
import b.t.c.b.b.c.c.d;
import b.t.c.b.b.c.c.i;
import b.t.c.b.b.c.cb;
import b.t.c.b.b.c.db;
import b.t.c.b.b.c.hb;
import b.t.c.b.b.c.kb;
import b.t.c.b.b.c.kb$_b;
import b.t.c.b.b.c.kb$_c;
import b.t.c.b.b.c.kb$_d;
import b.t.c.b.b.c.q;
import b.t.c.b.b.c.s;
import b.t.c.b.b.c.u;
import b.t.c.b.b.c.x;
import b.t.c.b.b.c.x$_d;
import b.t.c.b.b.c.x$_g;
import b.t.c.b.b.c.x$_k;
import b.t.c.b.b.c.x$_l;
import b.t.c.b.b.c.x$_p;
import b.t.c.b.b.c.x$_t;
import b.t.c.b.b.c.z;
import b.t.c.b.b.n.c.b;
import b.t.c.b.b.q.d.b.e;
import b.t.c.b.bc;
import b.t.c.b.c.n;
import b.t.c.b.cd;
import b.t.c.b.eb;
import b.t.c.b.ec;
import b.t.c.b.fb;
import b.t.c.b.g;
import b.t.c.b.h;
import b.t.c.b.hd;
import b.t.c.b.jc;
import b.t.c.b.lb;
import b.t.c.b.m;
import b.t.c.b.ob;
import b.t.c.b.p$_b$0;
import b.t.c.b.p$_b$1;
import b.t.c.b.p$_b$2;
import b.t.c.b.p$_b$3;
import b.t.c.b.p$_b$4;
import b.t.c.b.p$_b$5;
import b.t.c.b.p$_c;
import b.t.c.b.qc;
import b.t.c.b.rb;
import b.t.c.b.sb;
import b.t.c.b.t;
import b.t.c.f;
import b.t.j;
import b.t.k;
import b.t.l;
import b.t.v;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class p {
    public static final b.t.c.b.b.d.d super(String string) {
        boolean bl = b.q.f.\u00d300000(string, ".", false, 2, null);
        string = bl ? string.substring(1) : string;
        return new b.t.c.b.b.d.d(new b.t.c.b.b.d.k(b.q.f.super(b.q.f.\u00d300000(string, '/', ""), '/', '.', false, 4, null)), new b.t.c.b.b.d.k(b.q.f.\u00d400000(string, '/', null, 2, null)), bl);
    }

    public static final String \u00d200000(String string) {
        if (!(!b.q.f.\u00d300000(string, ".", false, 2, null))) {
            string = "Local class is not supported: ".concat(String.valueOf(string));
            throw new IllegalArgumentException(string.toString());
        }
        return b.q.f.\u00d400000(b.q.f.\u00d400000(string, '/', null, 2, null), '.', null, 2, null);
    }

    public static final b.t.z super(ClassLoader classLoader, String string) {
        Class clazz = hd.super(classLoader, p.super(string), 0, 2, null);
        if (clazz != null) {
            return b.o.r.o00000(clazz);
        }
        return null;
    }

    public static final b.t.u super(db db2, ClassLoader classLoader, cd cd2, b.o.e.h h2) {
        b.t.c.b.c.h h3;
        Object object;
        sb$_e sb$_e = new sb$_e();
        Object object2 = sb$_e;
        Object object3 = h2;
        Iterator iterator = cd2;
        Object object4 = classLoader;
        object2 = b.g.c.\u00d6o0000(b.g.c.\u00d800000(b.g.c.\u00d6\u00d20000(b.g.c.o00000((Object)db2, (b.o.e.g)p$_b$0.O\u00d5\u00d5000), p$_b$1.\u00f8\u00d4\u00d5000), new p$_b$2((ClassLoader)object4, (cd)((Object)iterator), (b.o.e.h)object3, (sb$_e)object2)));
        object3 = p.super(db2.new(), classLoader, cd2, (List)object2);
        Object object5 = object2;
        object2 = c.super(db2);
        boolean bl = b.t.c.b.b.c.b.o00000(db2);
        Object object6 = object5;
        Object object7 = object3;
        sb$_e sb$_e2 = sb$_e;
        iterator = object2;
        object2 = new ArrayList(mc.o00000((Iterable)object2, 10));
        iterator = iterator.iterator();
        while (iterator.hasNext()) {
            object4 = iterator.next();
            object4 = (z)object4;
            object = object2;
            object.add(p.super((z)object4, classLoader));
        }
        object = (List)object2;
        Object object8 = object7;
        Object object9 = object6;
        db db3 = db2.\u00d500000();
        object2 = db2.new();
        kb$_c kb$_c = object2 instanceof kb$_c ? (kb$_c)object2 : null;
        object2 = h2;
        object3 = p.super(db2.new(), (v)object3);
        boolean bl2 = b.t.c.b.b.c.b.\u00d200000(db2);
        boolean bl3 = fc.o00000((Object)(kb$_c != null ? kb$_c.o00000() : null), (Object)"kotlin/Nothing");
        boolean bl4 = b.t.c.b.b.c.b.Object(db2);
        object7 = db3 != null ? p.super(db3, classLoader, cd2, null, 4, null) : null;
        object6 = object;
        object = object9;
        Object object10 = object8;
        sb$_e2.o00000 = new b.t.c.b.c.h((v)object10, (List)object, bl, (List)object6, (b.t.u)object7, bl4, bl3, bl2, (b.t.z)object3, (b.o.e.h)object2);
        if (b.t.c.b.b.c.b.\u00d200000(db2)) {
            b.t.c.b.c.h h4;
            if (sb$_e.o00000 == null) {
                fc.return("");
                h4 = null;
            } else {
                h4 = (b.t.c.b.c.h)sb$_e.o00000;
            }
            b.t.c.b.c.h h5 = p.super(h4, h2);
            if (h5 == null) {
                b.t.c.b.c.h h6;
                StringBuilder stringBuilder = new StringBuilder("Invalid suspend function type: ");
                if (sb$_e.o00000 == null) {
                    fc.return("");
                    h6 = null;
                } else {
                    h6 = (b.t.c.b.c.h)sb$_e.o00000;
                }
                throw new lb(stringBuilder.append(h6).toString());
            }
            sb$_e.o00000 = h5;
        }
        q q2 = db2.\u00d300000();
        if (q2 != null) {
            q q3 = q2;
            if (fc.o00000((Object)q2.super(), (Object)"kotlin.jvm.PlatformType")) {
                b.t.c.b.c.h h7;
                if (sb$_e.o00000 == null) {
                    fc.return("");
                    h7 = null;
                } else {
                    h7 = (b.t.c.b.c.h)sb$_e.o00000;
                }
                return b.t.c.b.c.e.o\u00d6\u00d8000.o00000(h7, (b.t.c.b.c.h)p.super(q3.\u00d200000(), classLoader, cd2, null, 4, null), c.\u00d200000(db2), h2);
            }
        }
        if (sb$_e.o00000 == null) {
            fc.return("");
            h3 = null;
        } else {
            h3 = (b.t.c.b.c.h)sb$_e.o00000;
        }
        return h3;
    }

    public static /* synthetic */ b.t.u super(db db2, ClassLoader classLoader, cd cd2, b.o.e.h h2, int n2, Object object) {
        if ((n2 & 4) != 0) {
            h2 = null;
        }
        return p.super(db2, classLoader, cd2, h2);
    }

    private static final b.t.c.b.c.h super(b.t.c.b.c.h h2, b.o.e.h h3) {
        if (!((n)h2).\u00d5\u00d8\u00d2000()) {
            String string = "Not a suspend function type: ".concat(String.valueOf(h2));
            throw new IllegalArgumentException(string.toString());
        }
        Object object = (b.t.q)mc.\u00f400000(h2.\u00f5\u00f60000(), h2.\u00f5\u00f60000().size() - 2);
        if (object == null || (object = ((b.t.q)object).o00000()) == null) {
            return null;
        }
        Object object2 = object;
        if (!fc.o00000((Object)object.privatevoid(), (Object)b.o.d.z.\u00d200000(b.r.b.class))) {
            return null;
        }
        Object object3 = (b.t.q)mc.\u00d8O0000(object2.\u00f5\u00f60000());
        if (object3 == null || (object3 = ((b.t.q)object3).o00000()) == null) {
            return null;
        }
        object2 = object3;
        return new b.t.c.b.c.h(h2.privatevoid(), mc.\u00d500000((Collection)mc.if(h2.\u00f5\u00f60000(), 2), (Object)b.t.q.\u00d400000.\u00d200000((b.t.u)object2)), h2.\u00f4\u00f60000(), h2.\u00d8\u00f50000(), ((n)h2).nulldosuper(), ((n)h2).privatedosuper(), ((n)h2).fordosuper(), true, ((n)h2).\u00f4\u00d8\u00d2000(), h3);
    }

    public static final b.o.e.h \u00d300000(b.o.e.h h2, int n2) {
        int n3 = n2;
        b.o.e.h h3 = h2;
        return new p$_b$3(h3, n3);
    }

    private static final v super(kb kb2, ClassLoader classLoader, cd cd2, List list) {
        kb kb3 = kb2;
        if (kb3 instanceof kb$_c) {
            b.t.z z2;
            if (fc.o00000((Object)((kb$_c)kb2).o00000(), (Object)"kotlin/Array")) {
                b.t.u u2 = ((b.t.q)mc.\u00d5O0000(list)).o00000();
                if (u2 == null) {
                    u2 = b.t.c.b.u.\u00d500000.void();
                }
                z2 = b.o.r.o00000(hd.super(b.o.r.\u00d300000(f.super(u2))));
            } else {
                z2 = p.super(classLoader, ((kb$_c)kb2).o00000());
                if (z2 == null) {
                    throw new lb("Class not found: " + ((kb$_c)kb2).o00000());
                }
            }
            return z2;
        }
        if (kb3 instanceof kb$_d) {
            return new ob(p.super(((kb$_d)kb2).\u00d200000()).\u00f400000());
        }
        if (kb3 instanceof kb$_b) {
            bb bb2 = cd2.o00000(((kb$_b)kb2).\u00d300000());
            if (bb2 != null) {
                return bb2;
            }
            kb2 = (kb$_b)kb2;
            return new ec(((kb$_b)kb2).\u00d300000());
        }
        throw new qd();
    }

    private static final b.t.q super(s s2, ClassLoader classLoader, cd cd2, b.o.e.h h2) {
        if (fc.o00000((Object)s2, (Object)s.o00000)) {
            return b.t.q.\u00d400000.o00000();
        }
        hb hb2 = s2.\u00d400000();
        db db2 = s2.\u00d200000();
        return new b.t.q(hb2 != null ? p.super(hb2) : null, db2 != null ? p.super(db2, classLoader, cd2, h2) : null);
    }

    public static final l super(hb hb2) {
        switch (p$_c.\u00d200000[hb2.ordinal()]) {
            case 1: {
                return l.new;
            }
            case 2: {
                return l.o00000;
            }
            case 3: {
                return l.\u00d500000;
            }
        }
        throw new qd();
    }

    private static final b.t.c.b.c.m super(kb object, v v2) {
        Object object2 = object instanceof kb$_c ? (kb$_c)object : null;
        if (object2 == null || (object2 = ((kb$_c)object2).o00000()) == null || (object2 = p.super((String)object2)) == null) {
            return null;
        }
        object = object2;
        if (!b.t.c.b.b.b.c.f.\u00f500000.o00000((b.t.c.b.b.d.d)object)) {
            return null;
        }
        return b.t.c.b.c.k.o00000(((b.t.c.b.b.d.d)object).\u00f400000(), (b.t.z)v2);
    }

    public static final Annotation super(z z2, ClassLoader classLoader) {
        Class clazz = hd.super(classLoader, p.super(z2.new()), 0, 2, null);
        if (clazz == null) {
            throw new lb("Annotation class not found: " + z2.new());
        }
        Map map = z2.o00000();
        Class clazz2 = clazz;
        Map map2 = map;
        map = new LinkedHashMap(y.\u00d200000(map.size()));
        for (Object object : (Iterable)map2.entrySet()) {
            Object object2 = (Map.Entry)object;
            Map map3 = map;
            object = (Map.Entry)object;
            Object k2 = object2.getKey();
            object2 = (String)object.getKey();
            object = p.super((x)object.getValue(), z2.new(), (String)object2, classLoader);
            map3.put(k2, object);
        }
        return (Annotation)b.t.c.b.d.j.o00000(clazz2, map, null, 4, null);
    }

    private static final Object super(x x2, String object, String object2, ClassLoader classLoader) {
        Object object3;
        Object object4;
        block30: {
            Object object5;
            int n2;
            Iterator iterator;
            Object object6;
            Object object7;
            block34: {
                block33: {
                    Iterator iterator2;
                    block28: {
                        Object object8;
                        block32: {
                            block31: {
                                object4 = x2;
                                if (object4 instanceof x$_t) {
                                    return p.super(((x$_t)x2).\u00d800000(), classLoader);
                                }
                                if (object4 instanceof x$_l) {
                                    Object object9 = p.super(classLoader, ((x$_l)x2).\u00d600000());
                                    if (object9 == null || (object9 = b.o.r.\u00d300000((b.t.z)object9)) == null) {
                                        throw new lb("Unresolved class: " + ((x$_l)x2).\u00d600000());
                                    }
                                    object = object9;
                                    int n3 = ((x$_l)x2).\u00d500000();
                                    for (int i2 = 0; i2 < n3; ++i2) {
                                        object = hd.super((Class)object);
                                    }
                                    return object;
                                }
                                if (!(object4 instanceof x$_g)) break block30;
                                object8 = p.super(classLoader, (String)object);
                                if (object8 == null) break block31;
                                object4 = object8;
                                if ((object8 = b.o.r.\u00d300000((b.t.z)object8).isAnnotation() ? object4 : null) != null) break block32;
                            }
                            throw new lb("Not an annotation class: ".concat(String.valueOf(object)));
                        }
                        object7 = (k)mc.\u00d3o0000(object8.returnfor());
                        if (object7 == null || (object7 = object7.\u00d8\u00d5O000()) == null) break block33;
                        object6 = (Iterable)object7;
                        iterator = null;
                        n2 = 0;
                        object4 = object6.iterator();
                        while (object4.hasNext()) {
                            object5 = object4.next();
                            if (!fc.o00000((Object)((b.t.p)object5).O\u00f60000(), object2)) continue;
                            if (n2 != 0) {
                                iterator2 = null;
                                break block28;
                            }
                            iterator = (Iterator)object5;
                            n2 = 1;
                        }
                        iterator2 = n2 == 0 ? null : iterator;
                    }
                    if ((object7 = (b.t.p)((Object)iterator2)) != null && (object7 = object7.\u00f8\u00f50000()) != null) break block34;
                }
                throw new lb("No parameter " + object2 + " found in annotation constructor of " + (String)object);
            }
            object2 = object7;
            Object object10 = object7.privatevoid();
            Object object11 = object10 instanceof b.t.z ? (b.t.z)object10 : null;
            if (object11 == null || (object11 = b.o.r.\u00d300000((b.t.z)object11)) == null) {
                throw new lb("Array parameter type is not a class: ".concat(String.valueOf(object2)));
            }
            object2 = object11;
            object6 = object10 = Array.newInstance(fc.o00000(((Class)object11).getComponentType(), b.t.z.class) ? Class.class : ((Class)object2).getComponentType(), ((x$_g)x2).\u00d300000().size());
            iterator = ((Iterable)((x$_g)x2).\u00d300000()).iterator();
            n2 = 0;
            while (iterator.hasNext()) {
                int n4 = n2++;
                object5 = (x)iterator.next();
                Array.set(object6, n4, p.super(object5, (String)object, null, classLoader));
            }
            return object10;
        }
        if (object4 instanceof x$_d) {
            Object object12;
            block29: {
                Class clazz = hd.super(classLoader, p.super(((x$_d)x2).o00000()), 0, 2, null);
                if (clazz == null) {
                    throw new lb("Unresolved enum class: " + ((x$_d)x2).o00000());
                }
                object2 = clazz.getEnumConstants();
                object4 = null;
                boolean bl = false;
                for (Object t2 : object2) {
                    if (!fc.o00000((Object)((Enum)t2).name(), (Object)((x$_d)x2).\u00d200000())) continue;
                    if (bl) {
                        object12 = null;
                        break block29;
                    }
                    object4 = t2;
                    bl = true;
                }
                object12 = object3 = !bl ? null : object4;
            }
            if (object12 == null) {
                throw new lb("Unresolved enum entry: " + ((x$_d)x2).o00000() + '.' + ((x$_d)x2).\u00d200000());
            }
        } else if (object4 instanceof x$_k) {
            object3 = hd.super(classLoader, p.super(((x$_k)x2).String()), 0, 2, null);
            if (object3 == null) {
                throw new lb("Unresolved class: " + ((x$_k)x2).String());
            }
        } else {
            if (object4 instanceof x$_p) {
                return ((x$_p)x2).null();
            }
            throw new qd();
        }
        return object3;
    }

    public static final j super(cb cb2) {
        switch (p$_c.super[cb2.ordinal()]) {
            case 1: {
                return j.\u00d400000;
            }
            case 2: {
                return j.return;
            }
            case 3: {
                return j.o00000;
            }
            case 4: {
                return j.\u00d500000;
            }
            case 5: {
                return j.return;
            }
            case 6: {
                return null;
            }
        }
        throw new qd();
    }

    public static final String \u00d200000(b.t.c.b.b.c.e e2, h h2) {
        Object object = c.\u00d400000(e2);
        if (object == null || (object = ((i)object).toString()) == null) {
            d d2 = c.super(e2);
            if (d2 != null) {
                d d3 = d2;
                return b.\u00d400000(((i)d3).\u00d200000()) + p.\u00d300000(e2, h2) + "()" + ((i)d3).o00000();
            }
            object = null;
        }
        return object;
    }

    private static final String \u00d300000(b.t.c.b.b.c.e object, h h2) {
        if (b.t.c.b.b.c.b.\u00d400000((b.t.c.b.b.c.e)object) == cb.\u00d600000 && h2 instanceof b.t.c.b.r) {
            String string = ((b.t.c.b.r)h2).forsupersuper();
            if (string == null) {
                string = "main";
            }
            object = string;
            return "$" + b.t.c.b.b.d.b.super((String)object);
        }
        if (b.t.c.b.b.c.b.\u00d400000((b.t.c.b.b.c.e)object) == cb.\u00f500000 && h2 instanceof jc && ((jc)h2).O\u00d3o000()) {
            return "$" + ((jc)h2).iffor().getSimpleName();
        }
        return "";
    }

    public static final g super(b.t.c.b.b.c.e e2, h h2) {
        int n2 = !((Collection)e2.class()).isEmpty() ? -1 : (e2.\u00f400000() != null ? 1 : 0);
        String string = p.\u00d200000(e2, h2);
        if (string == null) {
            throw new lb("No field or getter signature for property: " + e2.\u00f800000());
        }
        String string2 = string;
        Object object = b.o.d.x.\u00d40\u00d2000;
        if (!b.t.c.b.b.c.b.\u00d600000(e2)) {
            switch (n2) {
                default: {
                    return new t(h2, string2, object, e2);
                }
                case 0: {
                    return new fb(h2, string2, object, e2);
                }
                case 1: 
            }
            return new eb(h2, string2, object, e2);
        }
        switch (n2) {
            default: {
                return new b.t.c.b.hb(h2, string2, object, e2);
            }
            case 0: {
                return new sb(h2, string2, object, e2);
            }
            case 1: 
        }
        return new rb(h2, string2, object, e2);
    }

    public static final qc super(u u2, h h2) {
        Object object = c.super(u2);
        if (object == null || (object = ((i)object).toString()) == null) {
            throw new lb("No signature for function: " + u2.\u00f500000());
        }
        Object object2 = object;
        return new m(h2, (String)object2, b.o.d.x.\u00d40\u00d2000, u2);
    }

    public static final qc super(b.t.c.b.b.c.i i2, h h2) {
        Object object = c.super(i2);
        if (object == null || (object = ((i)object).toString()) == null) {
            throw new lb("No signature for constructor (" + i2.\u00d400000().size() + " parameters, declared in " + h2 + ')');
        }
        Object object2 = object;
        return new bc(h2, (String)object2, b.o.d.x.\u00d40\u00d2000, i2);
    }

    private static final n \u00d200000(sb$_e sb$_e) {
        b.t.c.b.c.h h2;
        if (sb$_e.o00000 == null) {
            fc.return("");
            h2 = null;
        } else {
            h2 = (b.t.c.b.c.h)sb$_e.o00000;
        }
        return h2;
    }

    private static final db super(db db2) {
        return db2.\u00d800000();
    }

    private static final Iterable \u00d200000(db db2) {
        return db2.o00000();
    }

    private static final b.t.q super(ClassLoader object, cd cd2, b.o.e.h h2, sb$_e sb$_e, int n2, s s2) {
        b.o.e.h h3;
        if (h2 == null) {
            h3 = null;
        } else {
            object = sb$_e;
            h3 = p.\u00d300000(new p$_b$4((sb$_e)object), n2);
        }
        return p.super(s2, (ClassLoader)object, cd2, h3);
    }

    private static final List super(dc dc2) {
        return (List)dc2.\u00d200000();
    }

    private static final List super(n n2) {
        return e.o00000(n2.\u00d3\u00f80000());
    }

    private static final Type super(b.o.e.h object, int n2) {
        Object object2 = object = (n)object.newreturn();
        object2 = r.o00000(b.lb.\u00d400000, (b.o.e.h)new p$_b$5((n)object2));
        Type type = ((n)object).\u00d3\u00f80000();
        if (type instanceof Class) {
            return ((Class)type).isArray() ? ((Class)type).getComponentType() : Object.class;
        }
        if (type instanceof GenericArrayType) {
            if (n2 != 0) {
                throw new lb("Array type has been queried for a non-0th argument: ".concat(String.valueOf(object)));
            }
            return ((GenericArrayType)type).getGenericComponentType();
        }
        if (type instanceof ParameterizedType) {
            object = (Type)p.super((dc)object2).get(n2);
            if (!(object instanceof WildcardType)) {
                return object;
            }
            Type type2 = (Type)b.s.z.\u00d6o0000(((WildcardType)object).getLowerBounds());
            if (type2 == null) {
                type2 = (Type)b.s.z.\u00f8O0000(((WildcardType)object).getUpperBounds());
            }
            return type2;
        }
        throw new lb("Non-generic type has been queried for arguments: ".concat(String.valueOf(object)));
    }

    static /* synthetic */ db \u00d400000(db db2) {
        return p.super(db2);
    }

    static /* synthetic */ Iterable \u00d300000(db db2) {
        return p.\u00d200000(db2);
    }

    static /* synthetic */ b.t.q \u00d200000(ClassLoader classLoader, cd cd2, b.o.e.h h2, sb$_e sb$_e, int n2, s s2) {
        return p.super(classLoader, cd2, h2, sb$_e, n2, s2);
    }

    static /* synthetic */ Type \u00d200000(b.o.e.h h2, int n2) {
        return p.super(h2, n2);
    }

    static /* synthetic */ n super(sb$_e sb$_e) {
        return p.\u00d200000(sb$_e);
    }

    static /* synthetic */ List \u00d200000(n n2) {
        return p.super(n2);
    }
}

