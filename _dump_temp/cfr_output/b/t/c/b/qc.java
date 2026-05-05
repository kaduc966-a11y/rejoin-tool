/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b;

import b.dc;
import b.lb;
import b.o.d.fc;
import b.o.d.zc;
import b.r;
import b.s.mc;
import b.t.c.b.ad;
import b.t.c.b.b.c.c.g;
import b.t.c.b.b.c.db;
import b.t.c.b.bc;
import b.t.c.b.cd;
import b.t.c.b.d.b;
import b.t.c.b.d.d;
import b.t.c.b.d.e;
import b.t.c.b.d.h;
import b.t.c.b.d.h$_b;
import b.t.c.b.d.h$_c;
import b.t.c.b.d.h$_f;
import b.t.c.b.d.h$_g;
import b.t.c.b.d.h$_h$_b;
import b.t.c.b.d.h$_h$_f;
import b.t.c.b.d.k;
import b.t.c.b.d.k$_b;
import b.t.c.b.d.k$_c;
import b.t.c.b.dd;
import b.t.c.b.gd;
import b.t.c.b.hc;
import b.t.c.b.hd;
import b.t.c.b.jc;
import b.t.c.b.md;
import b.t.c.b.o;
import b.t.c.b.qc$_b$0;
import b.t.c.b.qc$_b$1;
import b.t.c.b.qc$_b$2;
import b.t.c.b.qc$_b$3;
import b.t.c.b.vc;
import b.t.c.f;
import b.t.j;
import b.t.p;
import b.t.p$_b;
import b.t.z;
import b.xd;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Constructor;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public abstract class qc
extends b.t.c.b.d
implements b.o.d.g,
hc,
vc {
    private final b.t.c.b.h \u00d3\u00d6\u00d3000;
    private final String nullObjectnew;
    private final Object o\u00d6\u00d3000;
    private final dc O\u00d6\u00d3000;
    private final dc \u00d5\u00d6\u00d3000;
    private final dc \u00d4\u00d6\u00d3000;
    private final dc forObjectnew;

    public qc(b.t.c.b.h object, String string, Object object2) {
        this.\u00d3\u00d6\u00d3000 = object;
        this.nullObjectnew = string;
        this.o\u00d6\u00d3000 = object2;
        object = this;
        this.O\u00d6\u00d3000 = r.o00000(lb.\u00d400000, (b.o.e.h)new qc$_b$0((qc)object));
        object = this;
        this.\u00d5\u00d6\u00d3000 = r.o00000(lb.\u00d400000, (b.o.e.h)new qc$_b$1((qc)object));
        object = this;
        this.\u00d4\u00d6\u00d3000 = r.o00000(lb.\u00d400000, (b.o.e.h)new qc$_b$2((qc)object));
        object = this;
        this.forObjectnew = r.o00000(lb.\u00d400000, (b.o.e.h)new qc$_b$3((qc)object));
    }

    @Override
    public b.t.c.b.h o\u00d8O000() {
        return this.\u00d3\u00d6\u00d3000;
    }

    @Override
    public String \u00d3\u00f4O000() {
        return this.nullObjectnew;
    }

    @Override
    public Object O\u00d8O000() {
        return this.o\u00d6\u00d3000;
    }

    protected abstract List \u00d5oo000();

    protected abstract db whilethissuper();

    protected abstract List \u00d4oo000();

    protected abstract cd Ooo000();

    protected abstract g \u00d3oo000();

    @Override
    public List \u00f8\u00d6O000() {
        return (List)this.O\u00d6\u00d3000.\u00d200000();
    }

    @Override
    public List \u00d8\u00d5O000() {
        return (List)this.\u00d5\u00d6\u00d3000.\u00d200000();
    }

    @Override
    public List O\u00d4O000() {
        return this.Ooo000().o00000();
    }

    @Override
    public List \u00d8\u00f50000() {
        Member member = this.privatedo().Object();
        AnnotatedElement annotatedElement = member instanceof AnnotatedElement ? (AnnotatedElement)((Object)member) : null;
        if (annotatedElement == null) {
            return mc.\u00d500000();
        }
        return hd.super(b.s.z.thisnew(annotatedElement.getAnnotations()));
    }

    @Override
    public int \u00f5\u00d8O000() {
        return e.o00000(this.privatedo());
    }

    @Override
    public Collection o\u00f4O000() {
        if (!(this.o\u00d8O000() instanceof jc)) {
            String string = "Only top-level functions are supported for now: ".concat(String.valueOf(this));
            throw new IllegalArgumentException(string.toString());
        }
        return mc.\u00d500000();
    }

    @Override
    public b privatedo() {
        return (b)this.\u00d4\u00d6\u00d3000.\u00d200000();
    }

    @Override
    public b \u00d3\u00d8O000() {
        return (b)this.forObjectnew.\u00d200000();
    }

    private final boolean o00000(b.t.c.b.h h2) {
        return h2 instanceof b.t.c.b.r && ((b.t.c.b.r)h2).\u00d3\u00d4O000();
    }

    private final boolean \u00d400000(Method object) {
        if (!(this.o\u00d8O000() instanceof jc)) {
            object = "Only top-level functions are supported for now: ".concat(String.valueOf(this));
            throw new IllegalArgumentException(object.toString());
        }
        return false;
    }

    private final b new(Method method, boolean bl) {
        if (md.\u00d300000(this)) {
            return new h$_h$_b(method, bl, this.\u00d400000(method) ? this.O\u00d8O000() : md.\u00d400000(this));
        }
        return new h$_h$_f(method);
    }

    private final h o00000(Constructor constructor, boolean bl) {
        if (!bl && this instanceof bc) {
            qc qc2 = this;
            if (qc2.o00000((bc)qc2)) {
                if (md.\u00d300000(this)) {
                    return new h$_b(constructor, md.\u00d400000(this));
                }
                return new h$_f(constructor);
            }
        }
        if (md.\u00d300000(this)) {
            return new h$_c(constructor, md.\u00d400000(this));
        }
        return new h$_g(constructor);
    }

    private final boolean o00000(bc iterator) {
        if (((bc)((Object)iterator)).\u00f8\u00d5O000() != j.return) {
            boolean bl;
            if (!((iterator = (Iterable)((qc)((Object)iterator)).\u00d8\u00d5O000()) instanceof Collection) || !((Collection)((Object)iterator)).isEmpty()) {
                iterator = iterator.iterator();
                while (iterator.hasNext()) {
                    p p2 = (p)iterator.next();
                    if (!this.o00000(f.super(p2.\u00f8\u00f50000()))) continue;
                    bl = true;
                    break;
                }
            } else {
                bl = false;
            }
            if (bl) {
                return true;
            }
        }
        return false;
    }

    private final boolean o00000(z z2) {
        return z2.\u00d3\u00d4O000() && !fc.o00000((Object)z2, (Object)b.o.d.z.\u00d200000(xd.class));
    }

    public boolean equals(Object object) {
        vc vc2 = hd.\u00d200000(object);
        if (vc2 == null) {
            return false;
        }
        object = vc2;
        return fc.o00000((Object)this.o\u00d8O000(), (Object)object.o\u00d8O000()) && fc.o00000((Object)this.\u00f5\u00d5O000(), (Object)object.\u00f5\u00d5O000()) && fc.o00000((Object)this.\u00d3\u00f4O000(), (Object)object.\u00d3\u00f4O000()) && fc.o00000(this.O\u00d8O000(), object.O\u00d8O000());
    }

    public int hashCode() {
        return (this.o\u00d8O000().hashCode() * 31 + this.\u00f5\u00d5O000().hashCode()) * 31 + this.\u00d3\u00f4O000().hashCode();
    }

    public String toString() {
        return dd.o00000.super(this);
    }

    @Override
    public GenericDeclaration \u00d5\u00f50000() {
        return this.ooo000();
    }

    @Override
    public Object newreturn() {
        return this.thissupersuper();
    }

    @Override
    public Object \u00f800000(Object object) {
        return this.thissuper(object);
    }

    @Override
    public Object o00000(Object object, Object object2) {
        return this.\u00f400000(object, object2);
    }

    @Override
    public Object o00000(Object object, Object object2, Object object3) {
        return this.\u00d500000(object, object2, object3);
    }

    @Override
    public Object o00000(Object object, Object object2, Object object3, Object object4) {
        return this.\u00d300000(object, object2, object3, object4);
    }

    @Override
    public Object o00000(Object object, Object object2, Object object3, Object object4, Object object5) {
        return this.\u00d300000(object, object2, object3, object4, object5);
    }

    @Override
    public Object o00000(Object object, Object object2, Object object3, Object object4, Object object5, Object object6) {
        return this.\u00d300000(object, object2, object3, object4, object5, object6);
    }

    @Override
    public Object o00000(Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7) {
        return this.\u00d300000(object, object2, object3, object4, object5, object6, object7);
    }

    @Override
    public Object o00000(Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8) {
        return this.\u00d300000(object, object2, object3, object4, object5, object6, object7, object8);
    }

    @Override
    public Object o00000(Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9) {
        return this.\u00d300000(object, object2, object3, object4, object5, object6, object7, object8, object9);
    }

    @Override
    public Object o00000(Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9, Object object10) {
        return this.\u00d300000(object, object2, object3, object4, object5, object6, object7, object8, object9, object10);
    }

    @Override
    public Object o00000(Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9, Object object10, Object object11) {
        return this.\u00d300000(object, object2, object3, object4, object5, object6, object7, object8, object9, object10, object11);
    }

    @Override
    public Object o00000(Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9, Object object10, Object object11, Object object12) {
        return this.\u00d300000(object, object2, object3, object4, object5, object6, object7, object8, object9, object10, object11, object12);
    }

    @Override
    public Object o00000(Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9, Object object10, Object object11, Object object12, Object object13) {
        return this.\u00d300000(object, object2, object3, object4, object5, object6, object7, object8, object9, object10, object11, object12, object13);
    }

    @Override
    public Object o00000(Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9, Object object10, Object object11, Object object12, Object object13, Object object14) {
        return this.\u00d300000(object, object2, object3, object4, object5, object6, object7, object8, object9, object10, object11, object12, object13, object14);
    }

    @Override
    public Object o00000(Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9, Object object10, Object object11, Object object12, Object object13, Object object14, Object object15) {
        return this.\u00d300000(object, object2, object3, object4, object5, object6, object7, object8, object9, object10, object11, object12, object13, object14, object15);
    }

    @Override
    public Object o00000(Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9, Object object10, Object object11, Object object12, Object object13, Object object14, Object object15, Object object16) {
        return this.\u00d300000(object, object2, object3, object4, object5, object6, object7, object8, object9, object10, object11, object12, object13, object14, object15, object16);
    }

    @Override
    public Object o00000(Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9, Object object10, Object object11, Object object12, Object object13, Object object14, Object object15, Object object16, Object object17) {
        return this.\u00d300000(object, object2, object3, object4, object5, object6, object7, object8, object9, object10, object11, object12, object13, object14, object15, object16, object17);
    }

    @Override
    public Object o00000(Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9, Object object10, Object object11, Object object12, Object object13, Object object14, Object object15, Object object16, Object object17, Object object18) {
        return this.\u00d300000(object, object2, object3, object4, object5, object6, object7, object8, object9, object10, object11, object12, object13, object14, object15, object16, object17, object18);
    }

    @Override
    public Object o00000(Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9, Object object10, Object object11, Object object12, Object object13, Object object14, Object object15, Object object16, Object object17, Object object18, Object object19) {
        return this.\u00d300000(object, object2, object3, object4, object5, object6, object7, object8, object9, object10, object11, object12, object13, object14, object15, object16, object17, object18, object19);
    }

    @Override
    public Object o00000(Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9, Object object10, Object object11, Object object12, Object object13, Object object14, Object object15, Object object16, Object object17, Object object18, Object object19, Object object20) {
        return this.\u00d300000(object, object2, object3, object4, object5, object6, object7, object8, object9, object10, object11, object12, object13, object14, object15, object16, object17, object18, object19, object20);
    }

    @Override
    public Object o00000(Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9, Object object10, Object object11, Object object12, Object object13, Object object14, Object object15, Object object16, Object object17, Object object18, Object object19, Object object20, Object object21) {
        return this.\u00d300000(object, object2, object3, object4, object5, object6, object7, object8, object9, object10, object11, object12, object13, object14, object15, object16, object17, object18, object19, object20, object21);
    }

    @Override
    public Object o00000(Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9, Object object10, Object object11, Object object12, Object object13, Object object14, Object object15, Object object16, Object object17, Object object18, Object object19, Object object20, Object object21, Object object22) {
        return this.\u00d300000(object, object2, object3, object4, object5, object6, object7, object8, object9, object10, object11, object12, object13, object14, object15, object16, object17, object18, object19, object20, object21, object22);
    }

    private static final List return(qc qc2) {
        return ad.o00000(qc2, qc2.\u00d5oo000(), qc2.whilethissuper(), qc2.\u00d4oo000(), qc2.Ooo000(), true);
    }

    private static final List new(qc qc2) {
        if (md.\u00d300000(qc2)) {
            return ad.o00000(qc2, qc2.\u00d5oo000(), qc2.whilethissuper(), qc2.\u00d4oo000(), qc2.Ooo000(), false);
        }
        return qc2.\u00f8\u00d6O000();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static final b \u00f400000(qc var0) {
        if (!(md.o00000((o)var0) != false || var0.o\u00d8O000() instanceof jc != false)) {
            var1_1 = "Only constructors and top-level functions are supported for now: ".concat(String.valueOf(var0));
            throw new IllegalArgumentException(var1_1.toString());
        }
        var1_2 /* !! */  = var0.\u00d3oo000();
        if (!md.o00000((o)var0)) ** GOTO lbl-1000
        v0 = var0;
        if (!v0.o00000(v0.o\u00d8O000())) {
            if (md.new((o)var0)) {
                var2_3 = var0.\u00d8\u00d5O000();
                var3_5 = var0.o\u00d8O000().iffor();
                var0 = var2_3;
                var1_2 /* !! */  = new ArrayList<E>(mc.o00000((Iterable)var2_3, 10));
                var0 = var0.iterator();
                while (var0.hasNext()) {
                    var2_3 = var0.next();
                    var2_3 = (p)var2_3;
                    var4_6 = var1_2 /* !! */ ;
                    var4_6.add(var2_3.O\u00f60000());
                }
                var0 = k$_b.super;
                var1_2 /* !! */  = k$_c.\u00d400000;
                var2_3 = (List)var1_2 /* !! */ ;
                return new k(var3_5, (List)var2_3, (k$_c)var1_2 /* !! */ , (k$_b)var0, null, 16, null);
            }
            v1 = var0.o\u00d8O000().\u00d500000(var1_2 /* !! */ .o00000());
        } else lbl-1000:
        // 2 sources

        {
            v1 = var0.o\u00d8O000().\u00d400000(var1_2 /* !! */ .\u00d200000(), var1_2 /* !! */ .o00000());
        }
        var1_2 /* !! */  = v1;
        var2_4 = v1;
        if (v1 instanceof Constructor) {
            v2 = var0.o00000((Constructor)var1_2 /* !! */ , false);
        } else if (var2_4 instanceof Method) {
            v2 = var0.new((Method)var1_2 /* !! */ , false);
        } else {
            throw new b.t.c.b.lb("Could not compute caller for function: ".concat(String.valueOf(var0)));
        }
        return d.o00000(v2, (o)var0, false, mc.\u00d500000());
    }

    /*
     * Unable to fully structure code
     */
    private static final b \u00d300000(qc var0) {
        if (!(md.o00000((o)var0) != false || var0.o\u00d8O000() instanceof jc != false)) {
            var2_1 = "Only constructors and top-level functions are supported for now: ".concat(String.valueOf(var0));
            throw new IllegalArgumentException(var2_1.toString());
        }
        var1_3 = var0.\u00d3oo000();
        var2_2 = new ArrayList<E>();
        if (!md.o00000((o)var0)) ** GOTO lbl-1000
        v0 = var0;
        if (!v0.o00000(v0.o\u00d8O000())) {
            if (md.new((o)var0)) {
                var3_5 = var0.\u00d8\u00d5O000();
                var6_7 = var0.o\u00d8O000().iffor();
                var0 = var3_5;
                var1_3 = new ArrayList<E>(mc.o00000((Iterable)var3_5, 10));
                var3_5 = var0.iterator();
                while (var3_5.hasNext()) {
                    var0 = var3_5.next();
                    var0 = (p)var0;
                    var7_9 = var1_3;
                    var7_9.add((String)var0.O\u00f60000());
                }
                var0 = k$_b.super;
                var1_3 = k$_c.super;
                var2_2 = (List)var1_3;
                var3_5 = var6_7;
                return new k((Class)var3_5, var2_2, (k$_c)var1_3, (k$_b)var0, null, 16, null);
            }
            var3_6 = gd.o00000((vc)var0, var0.\u00d3oo000().o00000());
            var2_2.addAll(var3_6.o00000());
            v1 = var0.o\u00d8O000().\u00d800000(var3_6.\u00d200000());
        } else lbl-1000:
        // 2 sources

        {
            var3_6 = gd.o00000((vc)var0, var1_3.o00000());
            var2_2.addAll(var3_6.o00000());
            v2 = var3_6.\u00d200000();
            var3_6 = var0.\u00f8\u00d6O000();
            var7_10 = Modifier.isStatic(var0.privatedo().Object().getModifiers()) == false;
            var6_8 = v2;
            var5_11 = var1_3.\u00d200000();
            var4_12 = var0.o\u00d8O000();
            if (!(var3_6 instanceof Collection) || !((Collection)var3_6).isEmpty()) {
                var1_3 = var3_6.iterator();
                while (var1_3.hasNext()) {
                    if (!(((p)var1_3.next()).\u00f5\u00f50000() == p$_b.class)) continue;
                    v3 = true;
                    break;
                }
            } else {
                v3 = false;
            }
            var1_4 = v3;
            v1 = var4_12.o00000(var5_11, var6_8, var7_10, var1_4);
        }
        var1_3 = v1;
        var3_6 = v1;
        if ((v1 instanceof Constructor != false ? (b)super.o00000((Constructor)var1_3, true) : (var3_6 = var3_6 instanceof Method != false ? super.new((Method)var1_3, var0.privatedo().o00000()) : null)) != null) {
            return d.o00000((b)var3_6, (o)var0, true, var2_2);
        }
        return null;
    }

    static /* synthetic */ List \u00d500000(qc qc2) {
        return qc.return(qc2);
    }

    static /* synthetic */ List \u00d400000(qc qc2) {
        return qc.new(qc2);
    }

    static /* synthetic */ b o00000(qc qc2) {
        return qc.\u00f400000(qc2);
    }

    static /* synthetic */ b \u00d800000(qc qc2) {
        return qc.\u00d300000(qc2);
    }

    public Object thissupersuper() {
        return this.o00000(new Object[0]);
    }

    public Object thissuper(Object object) {
        Object[] objectArray = new Object[1];
        Object[] objectArray2 = objectArray;
        objectArray[0] = object;
        return this.o00000(objectArray2);
    }

    public Object \u00f400000(Object object, Object object2) {
        Object[] objectArray = new Object[2];
        Object[] objectArray2 = objectArray;
        objectArray[0] = object;
        objectArray2[1] = object2;
        return this.o00000(objectArray2);
    }

    public Object \u00d500000(Object object, Object object2, Object object3) {
        Object[] objectArray = new Object[3];
        Object[] objectArray2 = objectArray;
        objectArray[0] = object;
        objectArray2[1] = object2;
        objectArray2[2] = object3;
        return this.o00000(objectArray2);
    }

    public Object \u00d300000(Object object, Object object2, Object object3, Object object4) {
        Object[] objectArray = new Object[4];
        Object[] objectArray2 = objectArray;
        objectArray[0] = object;
        objectArray2[1] = object2;
        objectArray2[2] = object3;
        objectArray2[3] = object4;
        return this.o00000(objectArray2);
    }

    public Object \u00d300000(Object object, Object object2, Object object3, Object object4, Object object5) {
        Object[] objectArray = new Object[5];
        Object[] objectArray2 = objectArray;
        objectArray[0] = object;
        objectArray2[1] = object2;
        objectArray2[2] = object3;
        objectArray2[3] = object4;
        objectArray2[4] = object5;
        return this.o00000(objectArray2);
    }

    public Object \u00d300000(Object object, Object object2, Object object3, Object object4, Object object5, Object object6) {
        Object[] objectArray = new Object[6];
        Object[] objectArray2 = objectArray;
        objectArray[0] = object;
        objectArray2[1] = object2;
        objectArray2[2] = object3;
        objectArray2[3] = object4;
        objectArray2[4] = object5;
        objectArray2[5] = object6;
        return this.o00000(objectArray2);
    }

    public Object \u00d300000(Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7) {
        Object[] objectArray = new Object[7];
        Object[] objectArray2 = objectArray;
        objectArray[0] = object;
        objectArray2[1] = object2;
        objectArray2[2] = object3;
        objectArray2[3] = object4;
        objectArray2[4] = object5;
        objectArray2[5] = object6;
        objectArray2[6] = object7;
        return this.o00000(objectArray2);
    }

    public Object \u00d300000(Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8) {
        Object[] objectArray = new Object[8];
        Object[] objectArray2 = objectArray;
        objectArray[0] = object;
        objectArray2[1] = object2;
        objectArray2[2] = object3;
        objectArray2[3] = object4;
        objectArray2[4] = object5;
        objectArray2[5] = object6;
        objectArray2[6] = object7;
        objectArray2[7] = object8;
        return this.o00000(objectArray2);
    }

    public Object \u00d300000(Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9) {
        Object[] objectArray = new Object[9];
        Object[] objectArray2 = objectArray;
        objectArray[0] = object;
        objectArray2[1] = object2;
        objectArray2[2] = object3;
        objectArray2[3] = object4;
        objectArray2[4] = object5;
        objectArray2[5] = object6;
        objectArray2[6] = object7;
        objectArray2[7] = object8;
        objectArray2[8] = object9;
        return this.o00000(objectArray2);
    }

    public Object \u00d300000(Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9, Object object10) {
        Object[] objectArray = new Object[10];
        Object[] objectArray2 = objectArray;
        objectArray[0] = object;
        objectArray2[1] = object2;
        objectArray2[2] = object3;
        objectArray2[3] = object4;
        objectArray2[4] = object5;
        objectArray2[5] = object6;
        objectArray2[6] = object7;
        objectArray2[7] = object8;
        objectArray2[8] = object9;
        objectArray2[9] = object10;
        return this.o00000(objectArray2);
    }

    public Object \u00d300000(Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9, Object object10, Object object11) {
        Object[] objectArray = new Object[11];
        Object[] objectArray2 = objectArray;
        objectArray[0] = object;
        objectArray2[1] = object2;
        objectArray2[2] = object3;
        objectArray2[3] = object4;
        objectArray2[4] = object5;
        objectArray2[5] = object6;
        objectArray2[6] = object7;
        objectArray2[7] = object8;
        objectArray2[8] = object9;
        objectArray2[9] = object10;
        objectArray2[10] = object11;
        return this.o00000(objectArray2);
    }

    public Object \u00d300000(Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9, Object object10, Object object11, Object object12) {
        Object[] objectArray = new Object[12];
        Object[] objectArray2 = objectArray;
        objectArray[0] = object;
        objectArray2[1] = object2;
        objectArray2[2] = object3;
        objectArray2[3] = object4;
        objectArray2[4] = object5;
        objectArray2[5] = object6;
        objectArray2[6] = object7;
        objectArray2[7] = object8;
        objectArray2[8] = object9;
        objectArray2[9] = object10;
        objectArray2[10] = object11;
        objectArray2[11] = object12;
        return this.o00000(objectArray2);
    }

    public Object \u00d300000(Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9, Object object10, Object object11, Object object12, Object object13) {
        Object[] objectArray = new Object[13];
        Object[] objectArray2 = objectArray;
        objectArray[0] = object;
        objectArray2[1] = object2;
        objectArray2[2] = object3;
        objectArray2[3] = object4;
        objectArray2[4] = object5;
        objectArray2[5] = object6;
        objectArray2[6] = object7;
        objectArray2[7] = object8;
        objectArray2[8] = object9;
        objectArray2[9] = object10;
        objectArray2[10] = object11;
        objectArray2[11] = object12;
        objectArray2[12] = object13;
        return this.o00000(objectArray2);
    }

    public Object \u00d300000(Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9, Object object10, Object object11, Object object12, Object object13, Object object14) {
        Object[] objectArray = new Object[14];
        Object[] objectArray2 = objectArray;
        objectArray[0] = object;
        objectArray2[1] = object2;
        objectArray2[2] = object3;
        objectArray2[3] = object4;
        objectArray2[4] = object5;
        objectArray2[5] = object6;
        objectArray2[6] = object7;
        objectArray2[7] = object8;
        objectArray2[8] = object9;
        objectArray2[9] = object10;
        objectArray2[10] = object11;
        objectArray2[11] = object12;
        objectArray2[12] = object13;
        objectArray2[13] = object14;
        return this.o00000(objectArray2);
    }

    public Object \u00d300000(Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9, Object object10, Object object11, Object object12, Object object13, Object object14, Object object15) {
        Object[] objectArray = new Object[15];
        Object[] objectArray2 = objectArray;
        objectArray[0] = object;
        objectArray2[1] = object2;
        objectArray2[2] = object3;
        objectArray2[3] = object4;
        objectArray2[4] = object5;
        objectArray2[5] = object6;
        objectArray2[6] = object7;
        objectArray2[7] = object8;
        objectArray2[8] = object9;
        objectArray2[9] = object10;
        objectArray2[10] = object11;
        objectArray2[11] = object12;
        objectArray2[12] = object13;
        objectArray2[13] = object14;
        objectArray2[14] = object15;
        return this.o00000(objectArray2);
    }

    public Object \u00d300000(Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9, Object object10, Object object11, Object object12, Object object13, Object object14, Object object15, Object object16) {
        Object[] objectArray = new Object[16];
        Object[] objectArray2 = objectArray;
        objectArray[0] = object;
        objectArray2[1] = object2;
        objectArray2[2] = object3;
        objectArray2[3] = object4;
        objectArray2[4] = object5;
        objectArray2[5] = object6;
        objectArray2[6] = object7;
        objectArray2[7] = object8;
        objectArray2[8] = object9;
        objectArray2[9] = object10;
        objectArray2[10] = object11;
        objectArray2[11] = object12;
        objectArray2[12] = object13;
        objectArray2[13] = object14;
        objectArray2[14] = object15;
        objectArray2[15] = object16;
        return this.o00000(objectArray2);
    }

    public Object \u00d300000(Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9, Object object10, Object object11, Object object12, Object object13, Object object14, Object object15, Object object16, Object object17) {
        Object[] objectArray = new Object[17];
        Object[] objectArray2 = objectArray;
        objectArray[0] = object;
        objectArray2[1] = object2;
        objectArray2[2] = object3;
        objectArray2[3] = object4;
        objectArray2[4] = object5;
        objectArray2[5] = object6;
        objectArray2[6] = object7;
        objectArray2[7] = object8;
        objectArray2[8] = object9;
        objectArray2[9] = object10;
        objectArray2[10] = object11;
        objectArray2[11] = object12;
        objectArray2[12] = object13;
        objectArray2[13] = object14;
        objectArray2[14] = object15;
        objectArray2[15] = object16;
        objectArray2[16] = object17;
        return this.o00000(objectArray2);
    }

    public Object \u00d300000(Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9, Object object10, Object object11, Object object12, Object object13, Object object14, Object object15, Object object16, Object object17, Object object18) {
        Object[] objectArray = new Object[18];
        Object[] objectArray2 = objectArray;
        objectArray[0] = object;
        objectArray2[1] = object2;
        objectArray2[2] = object3;
        objectArray2[3] = object4;
        objectArray2[4] = object5;
        objectArray2[5] = object6;
        objectArray2[6] = object7;
        objectArray2[7] = object8;
        objectArray2[8] = object9;
        objectArray2[9] = object10;
        objectArray2[10] = object11;
        objectArray2[11] = object12;
        objectArray2[12] = object13;
        objectArray2[13] = object14;
        objectArray2[14] = object15;
        objectArray2[15] = object16;
        objectArray2[16] = object17;
        objectArray2[17] = object18;
        return this.o00000(objectArray2);
    }

    public Object \u00d300000(Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9, Object object10, Object object11, Object object12, Object object13, Object object14, Object object15, Object object16, Object object17, Object object18, Object object19) {
        Object[] objectArray = new Object[19];
        Object[] objectArray2 = objectArray;
        objectArray[0] = object;
        objectArray2[1] = object2;
        objectArray2[2] = object3;
        objectArray2[3] = object4;
        objectArray2[4] = object5;
        objectArray2[5] = object6;
        objectArray2[6] = object7;
        objectArray2[7] = object8;
        objectArray2[8] = object9;
        objectArray2[9] = object10;
        objectArray2[10] = object11;
        objectArray2[11] = object12;
        objectArray2[12] = object13;
        objectArray2[13] = object14;
        objectArray2[14] = object15;
        objectArray2[15] = object16;
        objectArray2[16] = object17;
        objectArray2[17] = object18;
        objectArray2[18] = object19;
        return this.o00000(objectArray2);
    }

    public Object \u00d300000(Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9, Object object10, Object object11, Object object12, Object object13, Object object14, Object object15, Object object16, Object object17, Object object18, Object object19, Object object20) {
        Object[] objectArray = new Object[20];
        Object[] objectArray2 = objectArray;
        objectArray[0] = object;
        objectArray2[1] = object2;
        objectArray2[2] = object3;
        objectArray2[3] = object4;
        objectArray2[4] = object5;
        objectArray2[5] = object6;
        objectArray2[6] = object7;
        objectArray2[7] = object8;
        objectArray2[8] = object9;
        objectArray2[9] = object10;
        objectArray2[10] = object11;
        objectArray2[11] = object12;
        objectArray2[12] = object13;
        objectArray2[13] = object14;
        objectArray2[14] = object15;
        objectArray2[15] = object16;
        objectArray2[16] = object17;
        objectArray2[17] = object18;
        objectArray2[18] = object19;
        objectArray2[19] = object20;
        return this.o00000(objectArray2);
    }

    public Object \u00d300000(Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9, Object object10, Object object11, Object object12, Object object13, Object object14, Object object15, Object object16, Object object17, Object object18, Object object19, Object object20, Object object21) {
        Object[] objectArray = new Object[21];
        Object[] objectArray2 = objectArray;
        objectArray[0] = object;
        objectArray2[1] = object2;
        objectArray2[2] = object3;
        objectArray2[3] = object4;
        objectArray2[4] = object5;
        objectArray2[5] = object6;
        objectArray2[6] = object7;
        objectArray2[7] = object8;
        objectArray2[8] = object9;
        objectArray2[9] = object10;
        objectArray2[10] = object11;
        objectArray2[11] = object12;
        objectArray2[12] = object13;
        objectArray2[13] = object14;
        objectArray2[14] = object15;
        objectArray2[15] = object16;
        objectArray2[16] = object17;
        objectArray2[17] = object18;
        objectArray2[18] = object19;
        objectArray2[19] = object20;
        objectArray2[20] = object21;
        return this.o00000(objectArray2);
    }

    public Object \u00d300000(Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9, Object object10, Object object11, Object object12, Object object13, Object object14, Object object15, Object object16, Object object17, Object object18, Object object19, Object object20, Object object21, Object object22) {
        Object[] objectArray = new Object[22];
        Object[] objectArray2 = objectArray;
        objectArray[0] = object;
        objectArray2[1] = object2;
        objectArray2[2] = object3;
        objectArray2[3] = object4;
        objectArray2[4] = object5;
        objectArray2[5] = object6;
        objectArray2[6] = object7;
        objectArray2[7] = object8;
        objectArray2[8] = object9;
        objectArray2[9] = object10;
        objectArray2[10] = object11;
        objectArray2[11] = object12;
        objectArray2[12] = object13;
        objectArray2[13] = object14;
        objectArray2[14] = object15;
        objectArray2[15] = object16;
        objectArray2[16] = object17;
        objectArray2[17] = object18;
        objectArray2[18] = object19;
        objectArray2[19] = object20;
        objectArray2[20] = object21;
        objectArray2[21] = object22;
        return this.o00000(objectArray2);
    }

    public GenericDeclaration ooo000() {
        return zc.o00000(this.o\u00d8O000(), this.\u00d3\u00f4O000());
    }
}

