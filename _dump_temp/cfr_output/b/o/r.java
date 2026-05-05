/*
 * Decompiled with CFR 0.152.
 */
package b.o;

import b.o.d.fc;
import b.o.d.y;
import b.o.d.z;
import java.lang.annotation.Annotation;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class r {
    public static final Class \u00d300000(b.t.z z2) {
        return ((y)((Object)z2)).iffor();
    }

    public static /* synthetic */ void o00000(b.t.z z2) {
    }

    public static final Class \u00d400000(b.t.z object) {
        block32: {
            if (((Class)(object = ((y)object).iffor())).isPrimitive()) {
                return object;
            }
            if ((object = ((Class)object).getName()) == null) break block32;
            int n2 = -1;
            switch (((String)object).hashCode()) {
                case -527879800: {
                    if (((String)object).equals("java.lang.Float")) {
                        n2 = 1;
                    }
                    break;
                }
                case 399092968: {
                    if (((String)object).equals("java.lang.Void")) {
                        n2 = 2;
                    }
                    break;
                }
                case 155276373: {
                    if (((String)object).equals("java.lang.Character")) {
                        n2 = 3;
                    }
                    break;
                }
                case 398795216: {
                    if (((String)object).equals("java.lang.Long")) {
                        n2 = 4;
                    }
                    break;
                }
                case 761287205: {
                    if (((String)object).equals("java.lang.Double")) {
                        n2 = 5;
                    }
                    break;
                }
                case -515992664: {
                    if (((String)object).equals("java.lang.Short")) {
                        n2 = 6;
                    }
                    break;
                }
                case 344809556: {
                    if (((String)object).equals("java.lang.Boolean")) {
                        n2 = 7;
                    }
                    break;
                }
                case 398507100: {
                    if (((String)object).equals("java.lang.Byte")) {
                        n2 = 8;
                    }
                    break;
                }
                case -2056817302: {
                    if (((String)object).equals("java.lang.Integer")) {
                        n2 = 9;
                    }
                    break;
                }
            }
            switch (n2) {
                case 7: {
                    return Boolean.TYPE;
                }
                case 3: {
                    return Character.TYPE;
                }
                case 8: {
                    return Byte.TYPE;
                }
                case 6: {
                    return Short.TYPE;
                }
                case 9: {
                    return Integer.TYPE;
                }
                case 1: {
                    return Float.TYPE;
                }
                case 4: {
                    return Long.TYPE;
                }
                case 5: {
                    return Double.TYPE;
                }
                case 2: {
                    return Void.TYPE;
                }
            }
        }
        return null;
    }

    public static final Class new(b.t.z object) {
        block32: {
            if (!((Class)(object = ((y)object).iffor())).isPrimitive()) {
                return object;
            }
            String string = ((Class)object).getName();
            if (string == null) break block32;
            int n2 = -1;
            switch (string.hashCode()) {
                case 64711720: {
                    if (string.equals("boolean")) {
                        n2 = 1;
                    }
                    break;
                }
                case 3625364: {
                    if (string.equals("void")) {
                        n2 = 2;
                    }
                    break;
                }
                case 3039496: {
                    if (string.equals("byte")) {
                        n2 = 3;
                    }
                    break;
                }
                case -1325958191: {
                    if (string.equals("double")) {
                        n2 = 4;
                    }
                    break;
                }
                case 3052374: {
                    if (string.equals("char")) {
                        n2 = 5;
                    }
                    break;
                }
                case 109413500: {
                    if (string.equals("short")) {
                        n2 = 6;
                    }
                    break;
                }
                case 97526364: {
                    if (string.equals("float")) {
                        n2 = 7;
                    }
                    break;
                }
                case 104431: {
                    if (string.equals("int")) {
                        n2 = 8;
                    }
                    break;
                }
                case 3327612: {
                    if (string.equals("long")) {
                        n2 = 9;
                    }
                    break;
                }
            }
            switch (n2) {
                case 1: {
                    return Boolean.class;
                }
                case 5: {
                    return Character.class;
                }
                case 3: {
                    return Byte.class;
                }
                case 6: {
                    return Short.class;
                }
                case 8: {
                    return Integer.class;
                }
                case 7: {
                    return Float.class;
                }
                case 9: {
                    return Long.class;
                }
                case 4: {
                    return Double.class;
                }
                case 2: {
                    return Void.class;
                }
            }
        }
        return object;
    }

    public static final b.t.z o00000(Class clazz) {
        return z.\u00d200000(clazz);
    }

    public static final Class o00000(Object object) {
        return object.getClass();
    }

    public static final Class return(b.t.z z2) {
        return ((Object)z2).getClass();
    }

    public static /* synthetic */ void \u00d500000(b.t.z z2) {
    }

    public static final /* synthetic */ boolean o00000(Object[] objectArray) {
        fc.o00000(4, "T");
        return Object.class.isAssignableFrom(objectArray.getClass().getComponentType());
    }

    public static final b.t.z o00000(Annotation annotation) {
        return r.o00000(annotation.annotationType());
    }

    private static final Class new(Enum enum_) {
        return enum_.getDeclaringClass();
    }

    public static /* synthetic */ void o00000(Enum enum_) {
    }
}

