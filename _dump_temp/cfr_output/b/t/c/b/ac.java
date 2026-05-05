/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b;

import b.o.d.fc;
import b.qb;
import b.s.mc;
import b.t.bb;
import b.t.c.b.c.j;
import b.t.c.b.db;
import b.t.c.b.db$_c;
import b.t.c.b.gc;
import b.t.c.b.nd;
import b.t.u;
import b.xc;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class ac {
    private final nd String;
    private final String o00000;
    private final String \u00d500000;
    private final List \u00d600000;
    private final List \u00f500000;
    private final List \u00d800000;
    private final List \u00d200000;
    private final boolean null;
    private final db \u00d300000;

    public ac(nd object, String string, String string2, List list, List list2, List list3, List list4, boolean bl, db db2) {
        this.String = object;
        this.o00000 = string;
        this.\u00d500000 = string2;
        this.\u00d600000 = list;
        this.\u00f500000 = list2;
        this.\u00d800000 = list3;
        this.\u00d200000 = list4;
        this.null = bl;
        this.\u00d300000 = db2;
        if (!(this.String != nd.o00000 || this.\u00f500000.isEmpty() && this.\u00d600000.isEmpty() && this.\u00d800000.isEmpty())) {
            object = "Inconsistent combination of EquatableCallableSignature values. kind: " + (Object)((Object)this.String) + ", kotlinParameterTypes.isEmpty(): " + this.\u00f500000.isEmpty() + ",typeParameters.isEmpty(): " + this.\u00d600000.isEmpty() + ", javaParameterTypesIfFunction.isEmpty(): " + this.\u00d800000.isEmpty() + ".For member: '" + this.o00000 + '\'';
            throw new IllegalStateException(object.toString());
        }
        if (!(this.\u00d800000.size() == this.\u00d200000.size())) {
            object = "javaParameterTypesIfFunction.size (" + this.\u00d800000.size() + ") and javaGenericParameterTypesIfFunction.size (" + this.\u00d200000.size() + ") must be equal. For member: '" + this.o00000 + '\'';
            throw new IllegalStateException(object.toString());
        }
    }

    public final ac o00000(db db2) {
        return new ac(this.String, this.o00000, this.\u00d500000, this.\u00d600000, this.\u00f500000, this.\u00d800000, this.\u00d200000, this.null, db2);
    }

    public final int hashCode() {
        if (fc.o00000((Object)this.\u00d300000, (Object)db$_c.o00000) && this.String == nd.\u00d500000) {
            Object[] objectArray = new Object[4];
            Object[] objectArray2 = objectArray;
            objectArray[0] = this.String;
            objectArray2[1] = this.\u00f500000.size();
            objectArray2[2] = this.null;
            String string = this.\u00d500000;
            if (string == null) {
                string = "";
            }
            objectArray2[3] = string;
            return Arrays.hashCode(objectArray2);
        }
        Object[] objectArray = new Object[4];
        Object[] objectArray3 = objectArray;
        objectArray[0] = this.String;
        objectArray3[1] = this.\u00f500000.size();
        objectArray3[2] = this.null;
        objectArray3[3] = this.o00000;
        return Arrays.hashCode(objectArray3);
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof ac)) {
            return false;
        }
        if (!fc.o00000((Object)this.\u00d300000, (Object)((ac)object).\u00d300000)) {
            String string = "Equality modes must be the same for member '" + this.o00000 + "'. Please recreate signatures on inheritance";
            throw new IllegalStateException(string.toString());
        }
        if (this.String != ((ac)object).String) {
            return false;
        }
        if (this.null != ((ac)object).null) {
            return false;
        }
        if (this.\u00f500000.size() != ((ac)object).\u00f500000.size()) {
            return false;
        }
        if (fc.o00000((Object)this.\u00d300000, (Object)db$_c.o00000) && this.String == nd.\u00d500000) {
            if (!fc.o00000((Object)this.\u00d500000, (Object)((ac)object).\u00d500000)) {
                return false;
            }
            if (this.\u00d800000.size() != ((ac)object).\u00d800000.size()) {
                return false;
            }
            if (!(this.\u00d800000.size() == this.\u00f500000.size())) {
                String string = "javaParameterTypesIfFunction.size (" + this.\u00d800000.size() + ") and kotlinParameterTypes.size (" + this.\u00f500000.size() + ") must be equal for member '" + this.o00000 + '\'';
                throw new IllegalStateException(string.toString());
            }
            int n2 = ((Collection)this.\u00d800000).size();
            for (int i2 = 0; i2 < n2; ++i2) {
                Type type = (Type)this.\u00d200000.get(i2);
                Object object2 = (Class)this.\u00d800000.get(i2);
                Type type2 = (Type)((ac)object).\u00d200000.get(i2);
                Object object3 = (Class)((ac)object).\u00d800000.get(i2);
                TypeVariable typeVariable = type instanceof TypeVariable ? (TypeVariable)type : null;
                boolean bl = (typeVariable != null ? typeVariable.getGenericDeclaration() : null) instanceof Class;
                TypeVariable typeVariable2 = type2 instanceof TypeVariable ? (TypeVariable)type2 : null;
                boolean bl2 = (typeVariable2 != null ? typeVariable2.getGenericDeclaration() : null) instanceof Class;
                if (bl || bl2) {
                    if (((Class)object2).isPrimitive() != ((Class)object3).isPrimitive()) {
                        return false;
                    }
                    object2 = gc.o00000((u)this.\u00f500000.get(i2), this.o00000);
                    if (gc.\u00d200000((u)object2, (u)(object3 = gc.o00000((u)((ac)object).\u00f500000.get(i2), ((ac)object).o00000)))) continue;
                    return false;
                }
                if (fc.o00000(object2, object3)) continue;
                return false;
            }
        } else {
            Object object4;
            Iterator iterator;
            int n3;
            if (!fc.o00000((Object)this.o00000, (Object)((ac)object).o00000)) {
                return false;
            }
            j j2 = gc.o00000(this.\u00d600000, ((ac)object).\u00d600000);
            if (j2 == null) {
                return false;
            }
            j j3 = j2;
            int n4 = ((Collection)this.\u00d600000).size();
            for (n3 = 0; n3 < n4; ++n3) {
                boolean bl;
                iterator = (bb)this.\u00d600000.get(n3);
                object4 = (bb)((ac)object).\u00d600000.get(n3);
                if (iterator.\u00f4\u00d4o000().size() != object4.\u00f4\u00d4o000().size()) {
                    return false;
                }
                Object object5 = iterator.\u00f4\u00d4o000();
                iterator = object5;
                Collection collection = new ArrayList(mc.o00000((Iterable)object5, 10));
                iterator = iterator.iterator();
                while (iterator.hasNext()) {
                    object5 = iterator.next();
                    object5 = (u)object5;
                    Collection collection2 = collection;
                    u u2 = j.o00000(j3, (u)object5, null, 2, null).o00000();
                    if (u2 == null) {
                        gc.o00000(this.o00000);
                        throw new xc();
                    }
                    collection2.add(u2);
                }
                object5 = mc.\u00d300000((Iterable)gc.o00000((List)collection, this.o00000), (Iterable)gc.o00000(object4.\u00f4\u00d4o000(), ((ac)object).o00000));
                if (!(object5 instanceof Collection) || !((Collection)object5).isEmpty()) {
                    iterator = object5.iterator();
                    while (iterator.hasNext()) {
                        object4 = (qb)iterator.next();
                        if (gc.\u00d200000((u)((qb)object4).new(), (u)((qb)object4).o00000())) continue;
                        bl = false;
                        break;
                    }
                } else {
                    bl = true;
                }
                if (bl) continue;
                return false;
            }
            n4 = ((Collection)this.\u00f500000).size();
            for (n3 = 0; n3 < n4; ++n3) {
                if (j.o00000(j3, (u)this.\u00f500000.get(n3), null, 2, null).o00000() == null) {
                    gc.o00000(this.o00000);
                    throw new xc();
                }
                object4 = (u)((ac)object).\u00f500000.get(n3);
                if (gc.\u00d200000((u)((Object)iterator), (u)object4)) continue;
                return false;
            }
        }
        return true;
    }

    public final String toString() {
        return "EquatableCallableSignature(kind=" + (Object)((Object)this.String) + ", name=" + this.o00000 + ", jvmNameIfFunction=" + this.\u00d500000 + ", typeParameters=" + this.\u00d600000 + ", kotlinParameterTypes=" + this.\u00f500000 + ", javaParameterTypesIfFunction=" + this.\u00d800000 + ", javaGenericParameterTypesIfFunction=" + this.\u00d200000 + ", isStatic=" + this.null + ", equalityMode=" + this.\u00d300000 + ')';
    }
}

