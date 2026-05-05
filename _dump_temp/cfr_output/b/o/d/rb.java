/*
 * Decompiled with CFR 0.152.
 */
package b.o.d;

import b.o.d.c.b;
import b.o.d.c.c;
import b.o.d.c.c$_b;
import b.o.d.c.d;
import b.o.d.c.e;
import b.o.d.c.f;
import b.o.d.c.h;
import b.o.d.c.i;
import b.o.d.fc;
import b.o.d.g;
import b.o.e.j;
import b.o.e.k;
import b.o.e.l;
import b.o.e.m;
import b.o.e.n;
import b.o.e.o;
import b.o.e.q;
import b.o.e.r;
import b.o.e.s;
import b.o.e.t;
import b.o.e.u;
import b.o.e.v;
import b.o.e.w;
import b.o.e.x;
import b.o.e.y;
import b.yb;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class rb {
    private static Throwable o00000(Throwable throwable) {
        return fc.o00000(throwable, rb.class.getName());
    }

    public static void Object(Object object, String string) {
        object = object == null ? "null" : object.getClass().getName();
        rb.o00000((String)object + " cannot be cast to " + string);
    }

    public static void o00000(String string) {
        throw rb.o00000(new ClassCastException(string));
    }

    public static ClassCastException o00000(ClassCastException classCastException) {
        throw (ClassCastException)rb.o00000((Throwable)classCastException);
    }

    public static boolean classsuper(Object object) {
        return object instanceof Iterator && (!(object instanceof b.o.d.c.g) || object instanceof b);
    }

    public static Iterator o00000(Object object) {
        if (object instanceof b.o.d.c.g && !(object instanceof b)) {
            rb.Object(object, "kotlin.collections.MutableIterator");
        }
        return rb.\u00d6O0000(object);
    }

    public static Iterator \u00d600000(Object object, String string) {
        if (object instanceof b.o.d.c.g && !(object instanceof b)) {
            rb.o00000(string);
        }
        return rb.\u00d6O0000(object);
    }

    public static Iterator \u00d6O0000(Object object) {
        try {
            return (Iterator)object;
        }
        catch (ClassCastException classCastException) {
            throw rb.o00000(classCastException);
        }
    }

    public static boolean \u00f4O0000(Object object) {
        return object instanceof ListIterator && (!(object instanceof b.o.d.c.g) || object instanceof i);
    }

    public static ListIterator \u00d200000(Object object) {
        if (object instanceof b.o.d.c.g && !(object instanceof i)) {
            rb.Object(object, "kotlin.collections.MutableListIterator");
        }
        return rb.supersuper(object);
    }

    public static ListIterator void(Object object, String string) {
        if (object instanceof b.o.d.c.g && !(object instanceof i)) {
            rb.o00000(string);
        }
        return rb.supersuper(object);
    }

    public static ListIterator supersuper(Object object) {
        try {
            return (ListIterator)object;
        }
        catch (ClassCastException classCastException) {
            throw rb.o00000(classCastException);
        }
    }

    public static boolean \u00d4O0000(Object object) {
        return object instanceof Iterable && (!(object instanceof b.o.d.c.g) || object instanceof d);
    }

    public static Iterable \u00f6O0000(Object object) {
        if (object instanceof b.o.d.c.g && !(object instanceof d)) {
            rb.Object(object, "kotlin.collections.MutableIterable");
        }
        return rb.oO0000(object);
    }

    public static Iterable \u00d500000(Object object, String string) {
        if (object instanceof b.o.d.c.g && !(object instanceof d)) {
            rb.o00000(string);
        }
        return rb.oO0000(object);
    }

    public static Iterable oO0000(Object object) {
        try {
            return (Iterable)object;
        }
        catch (ClassCastException classCastException) {
            throw rb.o00000(classCastException);
        }
    }

    public static boolean \u00f400000(Object object) {
        return object instanceof Collection && (!(object instanceof b.o.d.c.g) || object instanceof h);
    }

    public static Collection oo0000(Object object) {
        if (object instanceof b.o.d.c.g && !(object instanceof h)) {
            rb.Object(object, "kotlin.collections.MutableCollection");
        }
        return rb.\u00d2O0000(object);
    }

    public static Collection \u00f400000(Object object, String string) {
        if (object instanceof b.o.d.c.g && !(object instanceof h)) {
            rb.o00000(string);
        }
        return rb.\u00d2O0000(object);
    }

    public static Collection \u00d2O0000(Object object) {
        try {
            return (Collection)object;
        }
        catch (ClassCastException classCastException) {
            throw rb.o00000(classCastException);
        }
    }

    public static boolean \u00d400000(Object object) {
        return object instanceof List && (!(object instanceof b.o.d.c.g) || object instanceof f);
    }

    public static List \u00d600000(Object object) {
        if (object instanceof b.o.d.c.g && !(object instanceof f)) {
            rb.Object(object, "kotlin.collections.MutableList");
        }
        return rb.float(object);
    }

    public static List o00000(Object object, String string) {
        if (object instanceof b.o.d.c.g && !(object instanceof f)) {
            rb.o00000(string);
        }
        return rb.float(object);
    }

    public static List float(Object object) {
        try {
            return (List)object;
        }
        catch (ClassCastException classCastException) {
            throw rb.o00000(classCastException);
        }
    }

    public static boolean OO0000(Object object) {
        return object instanceof Set && (!(object instanceof b.o.d.c.g) || object instanceof e);
    }

    public static Set \u00f600000(Object object) {
        if (object instanceof b.o.d.c.g && !(object instanceof e)) {
            rb.Object(object, "kotlin.collections.MutableSet");
        }
        return rb.Oo0000(object);
    }

    public static Set \u00d400000(Object object, String string) {
        if (object instanceof b.o.d.c.g && !(object instanceof e)) {
            rb.o00000(string);
        }
        return rb.Oo0000(object);
    }

    public static Set Oo0000(Object object) {
        try {
            return (Set)object;
        }
        catch (ClassCastException classCastException) {
            throw rb.o00000(classCastException);
        }
    }

    public static boolean \u00f5O0000(Object object) {
        return object instanceof Map && (!(object instanceof b.o.d.c.g) || object instanceof c);
    }

    public static Map Object(Object object) {
        if (object instanceof b.o.d.c.g && !(object instanceof c)) {
            rb.Object(object, "kotlin.collections.MutableMap");
        }
        return rb.\u00d5O0000(object);
    }

    public static Map \u00d200000(Object object, String string) {
        if (object instanceof b.o.d.c.g && !(object instanceof c)) {
            rb.o00000(string);
        }
        return rb.\u00d5O0000(object);
    }

    public static Map \u00d5O0000(Object object) {
        try {
            return (Map)object;
        }
        catch (ClassCastException classCastException) {
            throw rb.o00000(classCastException);
        }
    }

    public static boolean void(Object object) {
        return object instanceof Map.Entry && (!(object instanceof b.o.d.c.g) || object instanceof c$_b);
    }

    public static Map.Entry \u00d500000(Object object) {
        if (object instanceof b.o.d.c.g && !(object instanceof c$_b)) {
            rb.Object(object, "kotlin.collections.MutableMap.MutableEntry");
        }
        return rb.public(object);
    }

    public static Map.Entry \u00f500000(Object object, String string) {
        if (object instanceof b.o.d.c.g && !(object instanceof c$_b)) {
            rb.o00000(string);
        }
        return rb.public(object);
    }

    public static Map.Entry public(Object object) {
        try {
            return (Map.Entry)object;
        }
        catch (ClassCastException classCastException) {
            throw rb.o00000(classCastException);
        }
    }

    public static int \u00f500000(Object object) {
        if (object instanceof g) {
            return ((g)object).\u00f5\u00d8O000();
        }
        if (object instanceof b.o.e.h) {
            return 0;
        }
        if (object instanceof b.o.e.g) {
            return 1;
        }
        if (object instanceof b.o.e.f) {
            return 2;
        }
        if (object instanceof b.o.e.e) {
            return 3;
        }
        if (object instanceof b.o.e.d) {
            return 4;
        }
        if (object instanceof b.o.e.c) {
            return 5;
        }
        if (object instanceof b.o.e.b) {
            return 6;
        }
        if (object instanceof y) {
            return 7;
        }
        if (object instanceof x) {
            return 8;
        }
        if (object instanceof w) {
            return 9;
        }
        if (object instanceof s) {
            return 10;
        }
        if (object instanceof r) {
            return 11;
        }
        if (object instanceof q) {
            return 12;
        }
        if (object instanceof o) {
            return 13;
        }
        if (object instanceof n) {
            return 14;
        }
        if (object instanceof m) {
            return 15;
        }
        if (object instanceof l) {
            return 16;
        }
        if (object instanceof k) {
            return 17;
        }
        if (object instanceof j) {
            return 18;
        }
        if (object instanceof b.o.e.i) {
            return 19;
        }
        if (object instanceof v) {
            return 20;
        }
        if (object instanceof u) {
            return 21;
        }
        if (object instanceof t) {
            return 22;
        }
        return -1;
    }

    public static boolean \u00d200000(Object object, int n2) {
        return object instanceof yb && rb.\u00f500000(object) == n2;
    }

    public static Object o00000(Object object, int n2) {
        if (object != null && !rb.\u00d200000(object, n2)) {
            rb.Object(object, "kotlin.jvm.functions.Function".concat(String.valueOf(n2)));
        }
        return object;
    }

    public static Object o00000(Object object, int n2, String string) {
        if (object != null && !rb.\u00d200000(object, n2)) {
            rb.o00000(string);
        }
        return object;
    }
}

