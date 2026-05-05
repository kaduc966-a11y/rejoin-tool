/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b;

import b.o.d.fc;
import b.qb;
import b.r.b;
import b.s.mc;
import b.s.ub;
import b.t.c.b.f;
import b.t.c.b.hd;
import b.t.c.b.vc;
import b.t.c.b.zb;
import b.t.db;
import b.t.p;
import b.t.z;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public final class gd {
    public static final Type o00000(vc object) {
        if (object.\u00f4\u00d5O000() && fc.o00000((Object)((object = (object = mc.\u00f4O0000(object.privatedo().\u00d200000())) instanceof ParameterizedType ? (ParameterizedType)object : null) != null ? object.getRawType() : null), b.class)) {
            Object[] objectArray = (object = b.s.z.\u00f6O0000(object.getActualTypeArguments())) instanceof WildcardType ? (Object[])object : null;
            if (objectArray != null && (objectArray = objectArray.getLowerBounds()) != null) {
                return (Type)b.s.z.\u00f8O0000(objectArray);
            }
            return null;
        }
        return null;
    }

    public static final f o00000(vc object, String string) {
        zb zb2 = hd.super(string);
        boolean bl = fc.o00000(mc.\u00f4O0000(zb2.new()), (Object)"Lkotlin/jvm/internal/DefaultConstructorMarker;");
        int n2 = b.t.b.f.\u00d600000((db)object).size() + (bl ? 1 : 0);
        Set set = new LinkedHashSet();
        List list = new ArrayList();
        list.addAll(mc.return((Iterable)zb2.new(), zb2.new().size() - n2));
        for (Object object2 : (Iterable)mc.\u00d300000((Iterable)b.t.b.f.\u00d600000((db)object), (Iterable)mc.\u00f500000(zb2.new(), n2))) {
            p p2 = (p)((qb)object2).\u00d400000();
            object2 = (String)((qb)object2).\u00d300000();
            if (hd.super(p2)) {
                set.add(list.size());
                list.add(hd.class((z)p2.\u00f8\u00f50000().privatevoid()));
                continue;
            }
            list.add(object2);
        }
        if (bl) {
            list.add("Lkotlin/jvm/internal/DefaultConstructorMarker;");
        }
        if (set.isEmpty()) {
            return new f(string, ub.\u00d300000());
        }
        object = mc.o00000(list, "", "(", ")", 0, null, null, 56, null) + zb2.o00000();
        return new f((String)object, set);
    }
}

