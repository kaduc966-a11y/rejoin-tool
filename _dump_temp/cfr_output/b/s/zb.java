/*
 * Decompiled with CFR 0.152.
 */
package b.s;

import b.e.bb;
import b.hc;
import b.nc;
import b.o.d.fc;
import b.o.e.h;
import b.qb;
import b.s;
import b.s.b;
import b.s.mc;
import b.s.z;
import b.v;
import b.yc;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class zb
extends b {
    public static final List o00000(Object[][] objectArray) {
        Object[] objectArray2 = (Object[])objectArray;
        long l2 = 0L;
        for (Object object : objectArray2) {
            Object[] objectArray3 = (Object[])object;
            long l3 = l2;
            long l4 = objectArray3.length;
            l2 = l3 + l4;
        }
        long l5 = l2;
        if (l5 == 0L) {
            return mc.\u00d500000();
        }
        if (!(l5 <= Integer.MAX_VALUE)) {
            String string = "Sum of all arrays lengths (" + l5 + ") exceeds maximum list size (2147483647)";
            throw new IllegalArgumentException(string.toString());
        }
        Object[] objectArray4 = new Object[(int)l5];
        int n2 = 0;
        int n3 = ((Object[])objectArray).length;
        for (int i2 = 0; i2 < n3; ++i2) {
            Object[] objectArray5 = objectArray[i2];
            z.o00000(objectArray5, objectArray4, n2, 0, 0, 12, null);
            n2 += objectArray5.length;
        }
        return z.\u00d500000(objectArray4);
    }

    public static final qb o00000(qb[] qbArray) {
        ArrayList<Object> arrayList = new ArrayList<Object>(qbArray.length);
        ArrayList<Object> arrayList2 = new ArrayList<Object>(qbArray.length);
        for (qb qb2 : qbArray) {
            arrayList.add(qb2.new());
            arrayList2.add(qb2.o00000());
        }
        return yc.o00000(arrayList, arrayList2);
    }

    private static final boolean \u00d300000(Object[] objectArray) {
        return objectArray == null || objectArray.length == 0;
    }

    private static final Object o00000(Object[] objectArray, h h2) {
        if (objectArray.length == 0) {
            return h2.newreturn();
        }
        return objectArray;
    }

    public static final boolean o00000(Object[] objectArray, Object[] objectArray2) {
        if (objectArray == objectArray2) {
            return true;
        }
        if (objectArray == null || objectArray2 == null || objectArray.length != objectArray2.length) {
            return false;
        }
        int n2 = objectArray.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            Object object = objectArray[i2];
            Object object2 = objectArray2[i2];
            if (object == object2) continue;
            if (object == null || object2 == null) {
                return false;
            }
            if (!(object instanceof Object[] && object2 instanceof Object[] ? !z.o00000((Object[])object, (Object[])object2) : (object instanceof byte[] && object2 instanceof byte[] ? !Arrays.equals((byte[])object, (byte[])object2) : (object instanceof short[] && object2 instanceof short[] ? !Arrays.equals((short[])object, (short[])object2) : (object instanceof int[] && object2 instanceof int[] ? !Arrays.equals((int[])object, (int[])object2) : (object instanceof long[] && object2 instanceof long[] ? !Arrays.equals((long[])object, (long[])object2) : (object instanceof float[] && object2 instanceof float[] ? !Arrays.equals((float[])object, (float[])object2) : (object instanceof double[] && object2 instanceof double[] ? !Arrays.equals((double[])object, (double[])object2) : (object instanceof char[] && object2 instanceof char[] ? !Arrays.equals((char[])object, (char[])object2) : (object instanceof boolean[] && object2 instanceof boolean[] ? !Arrays.equals((boolean[])object, (boolean[])object2) : (object instanceof s && object2 instanceof s ? !b.s.c.b.super(((s)object).\u00f4\u00f4\u00d3000(), ((s)object2).\u00f4\u00f4\u00d3000()) : (object instanceof hc && object2 instanceof hc ? !b.s.c.b.\u00d300000(((hc)object).forclassnew(), ((hc)object2).forclassnew()) : (object instanceof v && object2 instanceof v ? !b.s.c.b.super(((v)object).nullclassnew(), ((v)object2).nullclassnew()) : (object instanceof nc && object2 instanceof nc ? !b.s.c.b.\u00d300000(((nc)object).privateclassnew(), ((nc)object2).privateclassnew()) : !fc.o00000(object, object2))))))))))))))) continue;
            return false;
        }
        return true;
    }

    public static final String String(Object[] objectArray) {
        StringBuilder stringBuilder;
        if (objectArray == null) {
            return "null";
        }
        int n2 = bb.Object(objectArray.length, 0x19999999) * 5 + 2;
        StringBuilder stringBuilder2 = stringBuilder = new StringBuilder(n2);
        zb.o00000(objectArray, stringBuilder2, new ArrayList());
        return stringBuilder.toString();
    }

    private static final void o00000(Object[] objectArray, StringBuilder stringBuilder, List list) {
        if (list.contains(objectArray)) {
            stringBuilder.append("[...]");
            return;
        }
        list.add(objectArray);
        stringBuilder.append('[');
        int n2 = objectArray.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            Object object;
            if (i2 != 0) {
                stringBuilder.append(", ");
            }
            Object object2 = object = objectArray[i2];
            if (object == null) {
                stringBuilder.append("null");
                continue;
            }
            if (object2 instanceof Object[]) {
                zb.o00000((Object[])object, stringBuilder, list);
                continue;
            }
            if (object2 instanceof byte[]) {
                stringBuilder.append(Arrays.toString((byte[])object));
                continue;
            }
            if (object2 instanceof short[]) {
                stringBuilder.append(Arrays.toString((short[])object));
                continue;
            }
            if (object2 instanceof int[]) {
                stringBuilder.append(Arrays.toString((int[])object));
                continue;
            }
            if (object2 instanceof long[]) {
                stringBuilder.append(Arrays.toString((long[])object));
                continue;
            }
            if (object2 instanceof float[]) {
                stringBuilder.append(Arrays.toString((float[])object));
                continue;
            }
            if (object2 instanceof double[]) {
                stringBuilder.append(Arrays.toString((double[])object));
                continue;
            }
            if (object2 instanceof char[]) {
                stringBuilder.append(Arrays.toString((char[])object));
                continue;
            }
            if (object2 instanceof boolean[]) {
                stringBuilder.append(Arrays.toString((boolean[])object));
                continue;
            }
            if (object2 instanceof s) {
                s s2 = (s)object;
                stringBuilder.append(b.s.c.b.\u00d4\u00d20000((byte[])(s2 != null ? s2.\u00f4\u00f4\u00d3000() : null)));
                continue;
            }
            if (object2 instanceof hc) {
                hc hc2 = (hc)object;
                stringBuilder.append(b.s.c.b.classnew((short[])(hc2 != null ? hc2.forclassnew() : null)));
                continue;
            }
            if (object2 instanceof v) {
                v v2 = (v)object;
                stringBuilder.append(b.s.c.b.\u00f8\u00d20000((int[])(v2 != null ? v2.nullclassnew() : null)));
                continue;
            }
            if (object2 instanceof nc) {
                nc nc2 = (nc)object;
                stringBuilder.append(b.s.c.b.\u00d8o0000((long[])(nc2 != null ? nc2.privateclassnew() : null)));
                continue;
            }
            stringBuilder.append(object.toString());
        }
        stringBuilder.append(']');
        List list2 = list;
        list2.remove(mc.\u00d300000(list2));
    }
}

