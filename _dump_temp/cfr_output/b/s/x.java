/*
 * Decompiled with CFR 0.152.
 */
package b.s;

import b.o.e.g;
import b.s.o;
import b.s.x$_b$1;
import b.s.x$_b$2;
import b.s.x$_b$3;
import b.s.x$_b$4;
import b.s.x$_b$5;
import b.s.x$_b$6;
import b.s.x$_b$7;
import b.s.x$_b$8;
import b.s.z;
import b.s.zb;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class x
extends zb {
    private static final Object \u00d200000(Object[] objectArray, int n2) {
        return objectArray[n2];
    }

    private static final byte \u00d200000(byte[] byArray, int n2) {
        return byArray[n2];
    }

    private static final short o00000(short[] sArray, int n2) {
        return sArray[n2];
    }

    private static final int \u00d200000(int[] nArray, int n2) {
        return nArray[n2];
    }

    private static final long \u00d200000(long[] lArray, int n2) {
        return lArray[n2];
    }

    private static final float o00000(float[] fArray, int n2) {
        return fArray[n2];
    }

    private static final double o00000(double[] dArray, int n2) {
        return dArray[n2];
    }

    private static final boolean \u00d200000(boolean[] blArray, int n2) {
        return blArray[n2];
    }

    private static final char o00000(char[] cArray, int n2) {
        return cArray[n2];
    }

    public static final List o00000(Object[] objectArray, Class clazz) {
        return (List)z.o00000(objectArray, new ArrayList(), clazz);
    }

    public static final Collection o00000(Object[] objectArray, Collection collection, Class clazz) {
        for (Object object : objectArray) {
            if (!clazz.isInstance(object)) continue;
            collection.add(object);
        }
        return collection;
    }

    public static final List \u00d500000(Object[] objectArray) {
        return o.o00000(objectArray);
    }

    public static final List \u00d200000(byte[] byArray) {
        return new x$_b$1(byArray);
    }

    public static final List \u00d200000(short[] sArray) {
        return new x$_b$2(sArray);
    }

    public static final List \u00d600000(int[] nArray) {
        return new x$_b$3(nArray);
    }

    public static final List \u00d200000(long[] lArray) {
        return new x$_b$4(lArray);
    }

    public static final List \u00d500000(float[] fArray) {
        return new x$_b$5(fArray);
    }

    public static final List o00000(double[] dArray) {
        return new x$_b$6(dArray);
    }

    public static final List o00000(boolean[] blArray) {
        return new x$_b$7(blArray);
    }

    public static final List String(char[] cArray) {
        return new x$_b$8(cArray);
    }

    public static final int o00000(Object[] objectArray, Object object, Comparator comparator, int n2, int n3) {
        return Arrays.binarySearch(objectArray, n2, n3, object, comparator);
    }

    public static /* synthetic */ int o00000(Object[] objectArray, Object object, Comparator comparator, int n2, int n3, int n4, Object object2) {
        if ((n4 & 4) != 0) {
            n2 = 0;
        }
        if ((n4 & 8) != 0) {
            n3 = objectArray.length;
        }
        return z.o00000(objectArray, object, comparator, n2, n3);
    }

    public static final int \u00d200000(Object[] objectArray, Object object, int n2, int n3) {
        return Arrays.binarySearch(objectArray, n2, n3, object);
    }

    public static /* synthetic */ int \u00d200000(Object[] objectArray, Object object, int n2, int n3, int n4, Object object2) {
        if ((n4 & 2) != 0) {
            n2 = 0;
        }
        if ((n4 & 4) != 0) {
            n3 = objectArray.length;
        }
        return z.\u00d200000(objectArray, object, n2, n3);
    }

    public static final int o00000(byte[] byArray, byte by, int n2, int n3) {
        return Arrays.binarySearch(byArray, n2, n3, by);
    }

    public static /* synthetic */ int \u00d200000(byte[] byArray, byte by, int n2, int n3, int n4, Object object) {
        if ((n4 & 2) != 0) {
            n2 = 0;
        }
        if ((n4 & 4) != 0) {
            n3 = byArray.length;
        }
        return z.o00000(byArray, by, n2, n3);
    }

    public static final int \u00d200000(short[] sArray, short s2, int n2, int n3) {
        return Arrays.binarySearch(sArray, n2, n3, s2);
    }

    public static /* synthetic */ int \u00d200000(short[] sArray, short s2, int n2, int n3, int n4, Object object) {
        if ((n4 & 2) != 0) {
            n2 = 0;
        }
        if ((n4 & 4) != 0) {
            n3 = sArray.length;
        }
        return z.\u00d200000(sArray, s2, n2, n3);
    }

    public static final int \u00d200000(int[] nArray, int n2, int n3, int n4) {
        return Arrays.binarySearch(nArray, n3, n4, n2);
    }

    public static /* synthetic */ int o00000(int[] nArray, int n2, int n3, int n4, int n5, Object object) {
        if ((n5 & 2) != 0) {
            n3 = 0;
        }
        if ((n5 & 4) != 0) {
            n4 = nArray.length;
        }
        return z.\u00d200000(nArray, n2, n3, n4);
    }

    public static final int o00000(long[] lArray, long l2, int n2, int n3) {
        return Arrays.binarySearch(lArray, n2, n3, l2);
    }

    public static /* synthetic */ int o00000(long[] lArray, long l2, int n2, int n3, int n4, Object object) {
        if ((n4 & 2) != 0) {
            n2 = 0;
        }
        if ((n4 & 4) != 0) {
            n3 = lArray.length;
        }
        return z.o00000(lArray, l2, n2, n3);
    }

    public static final int o00000(float[] fArray, float f2, int n2, int n3) {
        return Arrays.binarySearch(fArray, n2, n3, f2);
    }

    public static /* synthetic */ int o00000(float[] fArray, float f2, int n2, int n3, int n4, Object object) {
        if ((n4 & 2) != 0) {
            n2 = 0;
        }
        if ((n4 & 4) != 0) {
            n3 = fArray.length;
        }
        return z.o00000(fArray, f2, n2, n3);
    }

    public static final int \u00d200000(double[] dArray, double d2, int n2, int n3) {
        return Arrays.binarySearch(dArray, n2, n3, d2);
    }

    public static /* synthetic */ int o00000(double[] dArray, double d2, int n2, int n3, int n4, Object object) {
        if ((n4 & 2) != 0) {
            n2 = 0;
        }
        if ((n4 & 4) != 0) {
            n3 = dArray.length;
        }
        return z.\u00d200000(dArray, d2, n2, n3);
    }

    public static final int \u00d200000(char[] cArray, char c2, int n2, int n3) {
        return Arrays.binarySearch(cArray, n2, n3, c2);
    }

    public static /* synthetic */ int \u00d200000(char[] cArray, char c2, int n2, int n3, int n4, Object object) {
        if ((n4 & 2) != 0) {
            n2 = 0;
        }
        if ((n4 & 4) != 0) {
            n3 = cArray.length;
        }
        return z.\u00d200000(cArray, c2, n2, n3);
    }

    private static final boolean \u00d200000(Object[] objectArray, Object[] objectArray2) {
        return z.o00000(objectArray, objectArray2);
    }

    private static final boolean \u00d500000(Object[] objectArray, Object[] objectArray2) {
        return z.o00000(objectArray, objectArray2);
    }

    private static final int \u00f600000(Object[] objectArray) {
        return z.o00000(objectArray);
    }

    private static final int \u00f500000(Object[] objectArray) {
        return z.o00000(objectArray);
    }

    private static final String \u00f800000(Object[] objectArray) {
        return z.String(objectArray);
    }

    private static final String oO0000(Object[] objectArray) {
        return z.String(objectArray);
    }

    private static final boolean \u00d300000(Object[] objectArray, Object[] objectArray2) {
        return Arrays.equals(objectArray, objectArray2);
    }

    private static final boolean \u00d200000(byte[] byArray, byte[] byArray2) {
        return Arrays.equals(byArray, byArray2);
    }

    private static final boolean o00000(short[] sArray, short[] sArray2) {
        return Arrays.equals(sArray, sArray2);
    }

    private static final boolean o00000(int[] nArray, int[] nArray2) {
        return Arrays.equals(nArray, nArray2);
    }

    private static final boolean o00000(long[] lArray, long[] lArray2) {
        return Arrays.equals(lArray, lArray2);
    }

    private static final boolean o00000(float[] fArray, float[] fArray2) {
        return Arrays.equals(fArray, fArray2);
    }

    private static final boolean \u00d200000(double[] dArray, double[] dArray2) {
        return Arrays.equals(dArray, dArray2);
    }

    private static final boolean \u00d200000(boolean[] blArray, boolean[] blArray2) {
        return Arrays.equals(blArray, blArray2);
    }

    private static final boolean o00000(char[] cArray, char[] cArray2) {
        return Arrays.equals(cArray, cArray2);
    }

    private static final int null(Object[] objectArray) {
        return Arrays.hashCode(objectArray);
    }

    private static final int \u00f500000(byte[] byArray) {
        return Arrays.hashCode(byArray);
    }

    private static final int \u00d800000(short[] sArray) {
        return Arrays.hashCode(sArray);
    }

    private static final int \u00d500000(int[] nArray) {
        return Arrays.hashCode(nArray);
    }

    private static final int null(long[] lArray) {
        return Arrays.hashCode(lArray);
    }

    private static final int \u00f500000(float[] fArray) {
        return Arrays.hashCode(fArray);
    }

    private static final int \u00d600000(double[] dArray) {
        return Arrays.hashCode(dArray);
    }

    private static final int \u00d600000(boolean[] blArray) {
        return Arrays.hashCode(blArray);
    }

    private static final int \u00f500000(char[] cArray) {
        return Arrays.hashCode(cArray);
    }

    private static final String for(Object[] objectArray) {
        return Arrays.toString(objectArray);
    }

    private static final String \u00d600000(byte[] byArray) {
        return Arrays.toString(byArray);
    }

    private static final String \u00f500000(short[] sArray) {
        return Arrays.toString(sArray);
    }

    private static final String String(int[] nArray) {
        return Arrays.toString(nArray);
    }

    private static final String \u00d300000(long[] lArray) {
        return Arrays.toString(lArray);
    }

    private static final String String(float[] fArray) {
        return Arrays.toString(fArray);
    }

    private static final String \u00d200000(double[] dArray) {
        return Arrays.toString(dArray);
    }

    private static final String \u00d300000(boolean[] blArray) {
        return Arrays.toString(blArray);
    }

    private static final String o00000(char[] cArray) {
        return Arrays.toString(cArray);
    }

    public static final Object[] o00000(Object[] objectArray, Object[] objectArray2, int n2, int n3, int n4) {
        System.arraycopy(objectArray, n3, objectArray2, n2, n4 - n3);
        return objectArray2;
    }

    public static /* synthetic */ Object[] o00000(Object[] objectArray, Object[] objectArray2, int n2, int n3, int n4, int n5, Object object) {
        if ((n5 & 2) != 0) {
            n2 = 0;
        }
        if ((n5 & 4) != 0) {
            n3 = 0;
        }
        if ((n5 & 8) != 0) {
            n4 = objectArray.length;
        }
        return z.o00000(objectArray, objectArray2, n2, n3, n4);
    }

    public static final byte[] o00000(byte[] byArray, byte[] byArray2, int n2, int n3, int n4) {
        System.arraycopy(byArray, n3, byArray2, n2, n4 - n3);
        return byArray2;
    }

    public static /* synthetic */ byte[] o00000(byte[] byArray, byte[] byArray2, int n2, int n3, int n4, int n5, Object object) {
        if ((n5 & 2) != 0) {
            n2 = 0;
        }
        if ((n5 & 4) != 0) {
            n3 = 0;
        }
        if ((n5 & 8) != 0) {
            n4 = byArray.length;
        }
        return z.o00000(byArray, byArray2, n2, n3, n4);
    }

    public static final short[] o00000(short[] sArray, short[] sArray2, int n2, int n3, int n4) {
        System.arraycopy(sArray, n3, sArray2, n2, n4 - n3);
        return sArray2;
    }

    public static /* synthetic */ short[] o00000(short[] sArray, short[] sArray2, int n2, int n3, int n4, int n5, Object object) {
        if ((n5 & 2) != 0) {
            n2 = 0;
        }
        if ((n5 & 4) != 0) {
            n3 = 0;
        }
        if ((n5 & 8) != 0) {
            n4 = sArray.length;
        }
        return z.o00000(sArray, sArray2, n2, n3, n4);
    }

    public static final int[] o00000(int[] nArray, int[] nArray2, int n2, int n3, int n4) {
        System.arraycopy(nArray, n3, nArray2, n2, n4 - n3);
        return nArray2;
    }

    public static /* synthetic */ int[] o00000(int[] nArray, int[] nArray2, int n2, int n3, int n4, int n5, Object object) {
        if ((n5 & 2) != 0) {
            n2 = 0;
        }
        if ((n5 & 4) != 0) {
            n3 = 0;
        }
        if ((n5 & 8) != 0) {
            n4 = nArray.length;
        }
        return z.o00000(nArray, nArray2, n2, n3, n4);
    }

    public static final long[] o00000(long[] lArray, long[] lArray2, int n2, int n3, int n4) {
        System.arraycopy(lArray, n3, lArray2, n2, n4 - n3);
        return lArray2;
    }

    public static /* synthetic */ long[] o00000(long[] lArray, long[] lArray2, int n2, int n3, int n4, int n5, Object object) {
        if ((n5 & 2) != 0) {
            n2 = 0;
        }
        if ((n5 & 4) != 0) {
            n3 = 0;
        }
        if ((n5 & 8) != 0) {
            n4 = lArray.length;
        }
        return z.o00000(lArray, lArray2, n2, n3, n4);
    }

    public static final float[] o00000(float[] fArray, float[] fArray2, int n2, int n3, int n4) {
        System.arraycopy(fArray, n3, fArray2, n2, n4 - n3);
        return fArray2;
    }

    public static /* synthetic */ float[] o00000(float[] fArray, float[] fArray2, int n2, int n3, int n4, int n5, Object object) {
        if ((n5 & 2) != 0) {
            n2 = 0;
        }
        if ((n5 & 4) != 0) {
            n3 = 0;
        }
        if ((n5 & 8) != 0) {
            n4 = fArray.length;
        }
        return z.o00000(fArray, fArray2, n2, n3, n4);
    }

    public static final double[] o00000(double[] dArray, double[] dArray2, int n2, int n3, int n4) {
        System.arraycopy(dArray, n3, dArray2, n2, n4 - n3);
        return dArray2;
    }

    public static /* synthetic */ double[] o00000(double[] dArray, double[] dArray2, int n2, int n3, int n4, int n5, Object object) {
        if ((n5 & 2) != 0) {
            n2 = 0;
        }
        if ((n5 & 4) != 0) {
            n3 = 0;
        }
        if ((n5 & 8) != 0) {
            n4 = dArray.length;
        }
        return z.o00000(dArray, dArray2, n2, n3, n4);
    }

    public static final boolean[] o00000(boolean[] blArray, boolean[] blArray2, int n2, int n3, int n4) {
        System.arraycopy(blArray, n3, blArray2, n2, n4 - n3);
        return blArray2;
    }

    public static /* synthetic */ boolean[] o00000(boolean[] blArray, boolean[] blArray2, int n2, int n3, int n4, int n5, Object object) {
        if ((n5 & 2) != 0) {
            n2 = 0;
        }
        if ((n5 & 4) != 0) {
            n3 = 0;
        }
        if ((n5 & 8) != 0) {
            n4 = blArray.length;
        }
        return z.o00000(blArray, blArray2, n2, n3, n4);
    }

    public static final char[] o00000(char[] cArray, char[] cArray2, int n2, int n3, int n4) {
        System.arraycopy(cArray, n3, cArray2, n2, n4 - n3);
        return cArray2;
    }

    public static /* synthetic */ char[] o00000(char[] cArray, char[] cArray2, int n2, int n3, int n4, int n5, Object object) {
        if ((n5 & 2) != 0) {
            n2 = 0;
        }
        if ((n5 & 4) != 0) {
            n3 = 0;
        }
        if ((n5 & 8) != 0) {
            n4 = cArray.length;
        }
        return z.o00000(cArray, cArray2, n2, n3, n4);
    }

    private static final Object[] \u00d800000(Object[] objectArray) {
        return Arrays.copyOf(objectArray, objectArray.length);
    }

    private static final byte[] \u00d300000(byte[] byArray) {
        return Arrays.copyOf(byArray, byArray.length);
    }

    private static final short[] o00000(short[] sArray) {
        return Arrays.copyOf(sArray, sArray.length);
    }

    private static final int[] \u00d800000(int[] nArray) {
        return Arrays.copyOf(nArray, nArray.length);
    }

    private static final long[] \u00d500000(long[] lArray) {
        return Arrays.copyOf(lArray, lArray.length);
    }

    private static final float[] o00000(float[] fArray) {
        return Arrays.copyOf(fArray, fArray.length);
    }

    private static final double[] null(double[] dArray) {
        return Arrays.copyOf(dArray, dArray.length);
    }

    private static final boolean[] \u00d200000(boolean[] blArray) {
        return Arrays.copyOf(blArray, blArray.length);
    }

    private static final char[] null(char[] cArray) {
        return Arrays.copyOf(cArray, cArray.length);
    }

    private static final byte[] o00000(byte[] byArray, int n2) {
        return Arrays.copyOf(byArray, n2);
    }

    private static final short[] \u00d200000(short[] sArray, int n2) {
        return Arrays.copyOf(sArray, n2);
    }

    private static final int[] o00000(int[] nArray, int n2) {
        return Arrays.copyOf(nArray, n2);
    }

    private static final long[] o00000(long[] lArray, int n2) {
        return Arrays.copyOf(lArray, n2);
    }

    private static final float[] \u00d200000(float[] fArray, int n2) {
        return Arrays.copyOf(fArray, n2);
    }

    private static final double[] \u00d200000(double[] dArray, int n2) {
        return Arrays.copyOf(dArray, n2);
    }

    private static final boolean[] o00000(boolean[] blArray, int n2) {
        return Arrays.copyOf(blArray, n2);
    }

    private static final char[] \u00d200000(char[] cArray, int n2) {
        return Arrays.copyOf(cArray, n2);
    }

    private static final Object[] \u00d300000(Object[] objectArray, int n2) {
        return Arrays.copyOf(objectArray, n2);
    }

    private static final Object[] \u00d200000(Object[] objectArray, int n2, int n3) {
        return z.\u00d300000(objectArray, n2, n3);
    }

    private static final byte[] o00000(byte[] byArray, int n2, int n3) {
        return z.\u00d300000(byArray, n2, n3);
    }

    private static final short[] \u00d300000(short[] sArray, int n2, int n3) {
        return z.\u00d200000(sArray, n2, n3);
    }

    private static final int[] \u00d300000(int[] nArray, int n2, int n3) {
        return z.o00000(nArray, n2, n3);
    }

    private static final long[] \u00d200000(long[] lArray, int n2, int n3) {
        return z.o00000(lArray, n2, n3);
    }

    private static final float[] \u00d300000(float[] fArray, int n2, int n3) {
        return z.o00000(fArray, n2, n3);
    }

    private static final double[] o00000(double[] dArray, int n2, int n3) {
        return z.\u00d200000(dArray, n2, n3);
    }

    private static final boolean[] \u00d200000(boolean[] blArray, int n2, int n3) {
        return z.o00000(blArray, n2, n3);
    }

    private static final char[] o00000(char[] cArray, int n2, int n3) {
        return z.\u00d200000(cArray, n2, n3);
    }

    public static final Object[] \u00d300000(Object[] objectArray, int n2, int n3) {
        z.o00000(n3, objectArray.length);
        return Arrays.copyOfRange(objectArray, n2, n3);
    }

    public static final byte[] \u00d300000(byte[] byArray, int n2, int n3) {
        z.o00000(n3, byArray.length);
        return Arrays.copyOfRange(byArray, n2, n3);
    }

    public static final short[] \u00d200000(short[] sArray, int n2, int n3) {
        z.o00000(n3, sArray.length);
        return Arrays.copyOfRange(sArray, n2, n3);
    }

    public static final int[] o00000(int[] nArray, int n2, int n3) {
        z.o00000(n3, nArray.length);
        return Arrays.copyOfRange(nArray, n2, n3);
    }

    public static final long[] o00000(long[] lArray, int n2, int n3) {
        z.o00000(n3, lArray.length);
        return Arrays.copyOfRange(lArray, n2, n3);
    }

    public static final float[] o00000(float[] fArray, int n2, int n3) {
        z.o00000(n3, fArray.length);
        return Arrays.copyOfRange(fArray, n2, n3);
    }

    public static final double[] \u00d200000(double[] dArray, int n2, int n3) {
        z.o00000(n3, dArray.length);
        return Arrays.copyOfRange(dArray, n2, n3);
    }

    public static final boolean[] o00000(boolean[] blArray, int n2, int n3) {
        z.o00000(n3, blArray.length);
        return Arrays.copyOfRange(blArray, n2, n3);
    }

    public static final char[] \u00d200000(char[] cArray, int n2, int n3) {
        z.o00000(n3, cArray.length);
        return Arrays.copyOfRange(cArray, n2, n3);
    }

    public static final void o00000(Object[] objectArray, Object object, int n2, int n3) {
        Arrays.fill(objectArray, n2, n3, object);
    }

    public static /* synthetic */ void o00000(Object[] objectArray, Object object, int n2, int n3, int n4, Object object2) {
        if ((n4 & 2) != 0) {
            n2 = 0;
        }
        if ((n4 & 4) != 0) {
            n3 = objectArray.length;
        }
        z.o00000(objectArray, object, n2, n3);
    }

    public static final void \u00d200000(byte[] byArray, byte by, int n2, int n3) {
        Arrays.fill(byArray, n2, n3, by);
    }

    public static /* synthetic */ void o00000(byte[] byArray, byte by, int n2, int n3, int n4, Object object) {
        if ((n4 & 2) != 0) {
            n2 = 0;
        }
        if ((n4 & 4) != 0) {
            n3 = byArray.length;
        }
        z.\u00d200000(byArray, by, n2, n3);
    }

    public static final void o00000(short[] sArray, short s2, int n2, int n3) {
        Arrays.fill(sArray, n2, n3, s2);
    }

    public static /* synthetic */ void o00000(short[] sArray, short s2, int n2, int n3, int n4, Object object) {
        if ((n4 & 2) != 0) {
            n2 = 0;
        }
        if ((n4 & 4) != 0) {
            n3 = sArray.length;
        }
        z.o00000(sArray, s2, n2, n3);
    }

    public static final void o00000(int[] nArray, int n2, int n3, int n4) {
        Arrays.fill(nArray, n3, n4, n2);
    }

    public static /* synthetic */ void \u00d200000(int[] nArray, int n2, int n3, int n4, int n5, Object object) {
        if ((n5 & 2) != 0) {
            n3 = 0;
        }
        if ((n5 & 4) != 0) {
            n4 = nArray.length;
        }
        z.o00000(nArray, n2, n3, n4);
    }

    public static final void \u00d200000(long[] lArray, long l2, int n2, int n3) {
        Arrays.fill(lArray, n2, n3, l2);
    }

    public static /* synthetic */ void \u00d200000(long[] lArray, long l2, int n2, int n3, int n4, Object object) {
        if ((n4 & 2) != 0) {
            n2 = 0;
        }
        if ((n4 & 4) != 0) {
            n3 = lArray.length;
        }
        z.\u00d200000(lArray, l2, n2, n3);
    }

    public static final void \u00d200000(float[] fArray, float f2, int n2, int n3) {
        Arrays.fill(fArray, n2, n3, f2);
    }

    public static /* synthetic */ void \u00d200000(float[] fArray, float f2, int n2, int n3, int n4, Object object) {
        if ((n4 & 2) != 0) {
            n2 = 0;
        }
        if ((n4 & 4) != 0) {
            n3 = fArray.length;
        }
        z.\u00d200000(fArray, f2, n2, n3);
    }

    public static final void o00000(double[] dArray, double d2, int n2, int n3) {
        Arrays.fill(dArray, n2, n3, d2);
    }

    public static /* synthetic */ void \u00d200000(double[] dArray, double d2, int n2, int n3, int n4, Object object) {
        if ((n4 & 2) != 0) {
            n2 = 0;
        }
        if ((n4 & 4) != 0) {
            n3 = dArray.length;
        }
        z.o00000(dArray, d2, n2, n3);
    }

    public static final void o00000(boolean[] blArray, boolean bl, int n2, int n3) {
        Arrays.fill(blArray, n2, n3, bl);
    }

    public static /* synthetic */ void o00000(boolean[] blArray, boolean bl, int n2, int n3, int n4, Object object) {
        if ((n4 & 2) != 0) {
            n2 = 0;
        }
        if ((n4 & 4) != 0) {
            n3 = blArray.length;
        }
        z.o00000(blArray, bl, n2, n3);
    }

    public static final void o00000(char[] cArray, char c2, int n2, int n3) {
        Arrays.fill(cArray, n2, n3, c2);
    }

    public static /* synthetic */ void o00000(char[] cArray, char c2, int n2, int n3, int n4, Object object) {
        if ((n4 & 2) != 0) {
            n2 = 0;
        }
        if ((n4 & 4) != 0) {
            n3 = cArray.length;
        }
        z.o00000(cArray, c2, n2, n3);
    }

    public static final Object[] o00000(Object[] objectArray, Object object) {
        int n2 = objectArray.length;
        Object[] objectArray2 = Arrays.copyOf(objectArray, n2 + 1);
        objectArray = objectArray2;
        objectArray2[n2] = object;
        return objectArray;
    }

    public static final byte[] o00000(byte[] byArray, byte by) {
        int n2 = byArray.length;
        byte[] byArray2 = Arrays.copyOf(byArray, n2 + 1);
        byArray = byArray2;
        byArray2[n2] = by;
        return byArray;
    }

    public static final short[] o00000(short[] sArray, short s2) {
        int n2 = sArray.length;
        short[] sArray2 = Arrays.copyOf(sArray, n2 + 1);
        sArray = sArray2;
        sArray2[n2] = s2;
        return sArray;
    }

    public static final int[] \u00d300000(int[] nArray, int n2) {
        int n3 = nArray.length;
        int[] nArray2 = Arrays.copyOf(nArray, n3 + 1);
        nArray = nArray2;
        nArray2[n3] = n2;
        return nArray;
    }

    public static final long[] o00000(long[] lArray, long l2) {
        int n2 = lArray.length;
        long[] lArray2 = Arrays.copyOf(lArray, n2 + 1);
        lArray = lArray2;
        lArray2[n2] = l2;
        return lArray;
    }

    public static final float[] o00000(float[] fArray, float f2) {
        int n2 = fArray.length;
        float[] fArray2 = Arrays.copyOf(fArray, n2 + 1);
        fArray = fArray2;
        fArray2[n2] = f2;
        return fArray;
    }

    public static final double[] o00000(double[] dArray, double d2) {
        int n2 = dArray.length;
        double[] dArray2 = Arrays.copyOf(dArray, n2 + 1);
        dArray = dArray2;
        dArray2[n2] = d2;
        return dArray;
    }

    public static final boolean[] o00000(boolean[] blArray, boolean bl) {
        int n2 = blArray.length;
        boolean[] blArray2 = Arrays.copyOf(blArray, n2 + 1);
        blArray = blArray2;
        blArray2[n2] = bl;
        return blArray;
    }

    public static final char[] o00000(char[] cArray, char c2) {
        int n2 = cArray.length;
        char[] cArray2 = Arrays.copyOf(cArray, n2 + 1);
        cArray = cArray2;
        cArray2[n2] = c2;
        return cArray;
    }

    public static final Object[] o00000(Object[] objectArray, Collection object) {
        int n2 = objectArray.length;
        objectArray = Arrays.copyOf(objectArray, n2 + object.size());
        object = object.iterator();
        while (object.hasNext()) {
            Object e2 = object.next();
            objectArray[n2++] = e2;
        }
        return objectArray;
    }

    public static final byte[] o00000(byte[] byArray, Collection object) {
        int n2 = byArray.length;
        byArray = Arrays.copyOf(byArray, n2 + object.size());
        object = object.iterator();
        while (object.hasNext()) {
            byte by = ((Number)object.next()).byteValue();
            byArray[n2++] = by;
        }
        return byArray;
    }

    public static final short[] o00000(short[] sArray, Collection object) {
        int n2 = sArray.length;
        sArray = Arrays.copyOf(sArray, n2 + object.size());
        object = object.iterator();
        while (object.hasNext()) {
            short s2 = ((Number)object.next()).shortValue();
            sArray[n2++] = s2;
        }
        return sArray;
    }

    public static final int[] o00000(int[] nArray, Collection object) {
        int n2 = nArray.length;
        nArray = Arrays.copyOf(nArray, n2 + object.size());
        object = object.iterator();
        while (object.hasNext()) {
            int n3 = ((Number)object.next()).intValue();
            nArray[n2++] = n3;
        }
        return nArray;
    }

    public static final long[] o00000(long[] lArray, Collection object) {
        int n2 = lArray.length;
        lArray = Arrays.copyOf(lArray, n2 + object.size());
        object = object.iterator();
        while (object.hasNext()) {
            long l2 = ((Number)object.next()).longValue();
            lArray[n2++] = l2;
        }
        return lArray;
    }

    public static final float[] o00000(float[] fArray, Collection object) {
        int n2 = fArray.length;
        fArray = Arrays.copyOf(fArray, n2 + object.size());
        object = object.iterator();
        while (object.hasNext()) {
            float f2 = ((Number)object.next()).floatValue();
            fArray[n2++] = f2;
        }
        return fArray;
    }

    public static final double[] o00000(double[] dArray, Collection object) {
        int n2 = dArray.length;
        dArray = Arrays.copyOf(dArray, n2 + object.size());
        object = object.iterator();
        while (object.hasNext()) {
            double d2 = ((Number)object.next()).doubleValue();
            dArray[n2++] = d2;
        }
        return dArray;
    }

    public static final boolean[] o00000(boolean[] blArray, Collection object) {
        int n2 = blArray.length;
        blArray = Arrays.copyOf(blArray, n2 + object.size());
        object = object.iterator();
        while (object.hasNext()) {
            boolean bl = (Boolean)object.next();
            blArray[n2++] = bl;
        }
        return blArray;
    }

    public static final char[] o00000(char[] cArray, Collection object) {
        int n2 = cArray.length;
        cArray = Arrays.copyOf(cArray, n2 + object.size());
        object = object.iterator();
        while (object.hasNext()) {
            char c2 = ((Character)object.next()).charValue();
            cArray[n2++] = c2;
        }
        return cArray;
    }

    public static final Object[] String(Object[] objectArray, Object[] objectArray2) {
        int n2 = objectArray.length;
        int n3 = objectArray2.length;
        objectArray = Arrays.copyOf(objectArray, n2 + n3);
        System.arraycopy(objectArray2, 0, objectArray, n2, n3);
        return objectArray;
    }

    public static final byte[] o00000(byte[] byArray, byte[] byArray2) {
        int n2 = byArray.length;
        int n3 = byArray2.length;
        byArray = Arrays.copyOf(byArray, n2 + n3);
        System.arraycopy(byArray2, 0, byArray, n2, n3);
        return byArray;
    }

    public static final short[] \u00d200000(short[] sArray, short[] sArray2) {
        int n2 = sArray.length;
        int n3 = sArray2.length;
        sArray = Arrays.copyOf(sArray, n2 + n3);
        System.arraycopy(sArray2, 0, sArray, n2, n3);
        return sArray;
    }

    public static final int[] \u00d200000(int[] nArray, int[] nArray2) {
        int n2 = nArray.length;
        int n3 = nArray2.length;
        nArray = Arrays.copyOf(nArray, n2 + n3);
        System.arraycopy(nArray2, 0, nArray, n2, n3);
        return nArray;
    }

    public static final long[] \u00d200000(long[] lArray, long[] lArray2) {
        int n2 = lArray.length;
        int n3 = lArray2.length;
        lArray = Arrays.copyOf(lArray, n2 + n3);
        System.arraycopy(lArray2, 0, lArray, n2, n3);
        return lArray;
    }

    public static final float[] \u00d200000(float[] fArray, float[] fArray2) {
        int n2 = fArray.length;
        int n3 = fArray2.length;
        fArray = Arrays.copyOf(fArray, n2 + n3);
        System.arraycopy(fArray2, 0, fArray, n2, n3);
        return fArray;
    }

    public static final double[] o00000(double[] dArray, double[] dArray2) {
        int n2 = dArray.length;
        int n3 = dArray2.length;
        dArray = Arrays.copyOf(dArray, n2 + n3);
        System.arraycopy(dArray2, 0, dArray, n2, n3);
        return dArray;
    }

    public static final boolean[] o00000(boolean[] blArray, boolean[] blArray2) {
        int n2 = blArray.length;
        int n3 = blArray2.length;
        blArray = Arrays.copyOf(blArray, n2 + n3);
        System.arraycopy(blArray2, 0, blArray, n2, n3);
        return blArray;
    }

    public static final char[] \u00d200000(char[] cArray, char[] cArray2) {
        int n2 = cArray.length;
        int n3 = cArray2.length;
        cArray = Arrays.copyOf(cArray, n2 + n3);
        System.arraycopy(cArray2, 0, cArray, n2, n3);
        return cArray;
    }

    private static final Object[] \u00d200000(Object[] objectArray, Object object) {
        return z.o00000(objectArray, object);
    }

    public static final void o00000(int[] nArray) {
        if (nArray.length > 1) {
            Arrays.sort(nArray);
        }
    }

    public static final void \u00d600000(long[] lArray) {
        if (lArray.length > 1) {
            Arrays.sort(lArray);
        }
    }

    public static final void \u00d800000(byte[] byArray) {
        if (byArray.length > 1) {
            Arrays.sort(byArray);
        }
    }

    public static final void \u00d500000(short[] sArray) {
        if (sArray.length > 1) {
            Arrays.sort(sArray);
        }
    }

    public static final void \u00d300000(double[] dArray) {
        if (dArray.length > 1) {
            Arrays.sort(dArray);
        }
    }

    public static final void \u00d600000(float[] fArray) {
        if (fArray.length > 1) {
            Arrays.sort(fArray);
        }
    }

    public static final void \u00d600000(char[] cArray) {
        if (cArray.length > 1) {
            Arrays.sort(cArray);
        }
    }

    private static final void \u00d300000(Comparable[] comparableArray) {
        z.\u00d600000(comparableArray);
    }

    public static final void \u00d600000(Object[] objectArray) {
        if (objectArray.length > 1) {
            Arrays.sort(objectArray);
        }
    }

    public static final void o00000(Comparable[] comparableArray, int n2, int n3) {
        Arrays.sort(comparableArray, n2, n3);
    }

    public static /* synthetic */ void o00000(Comparable[] comparableArray, int n2, int n3, int n4, Object object) {
        if ((n4 & 1) != 0) {
            n2 = 0;
        }
        if ((n4 & 2) != 0) {
            n3 = comparableArray.length;
        }
        z.o00000(comparableArray, n2, n3);
    }

    public static final void \u00d200000(byte[] byArray, int n2, int n3) {
        Arrays.sort(byArray, n2, n3);
    }

    public static /* synthetic */ void o00000(byte[] byArray, int n2, int n3, int n4, Object object) {
        if ((n4 & 1) != 0) {
            n2 = 0;
        }
        if ((n4 & 2) != 0) {
            n3 = byArray.length;
        }
        z.\u00d200000(byArray, n2, n3);
    }

    public static final void o00000(short[] sArray, int n2, int n3) {
        Arrays.sort(sArray, n2, n3);
    }

    public static /* synthetic */ void o00000(short[] sArray, int n2, int n3, int n4, Object object) {
        if ((n4 & 1) != 0) {
            n2 = 0;
        }
        if ((n4 & 2) != 0) {
            n3 = sArray.length;
        }
        z.o00000(sArray, n2, n3);
    }

    public static final void \u00d200000(int[] nArray, int n2, int n3) {
        Arrays.sort(nArray, n2, n3);
    }

    public static /* synthetic */ void o00000(int[] nArray, int n2, int n3, int n4, Object object) {
        if ((n4 & 1) != 0) {
            n2 = 0;
        }
        if ((n4 & 2) != 0) {
            n3 = nArray.length;
        }
        z.\u00d200000(nArray, n2, n3);
    }

    public static final void \u00d300000(long[] lArray, int n2, int n3) {
        Arrays.sort(lArray, n2, n3);
    }

    public static /* synthetic */ void o00000(long[] lArray, int n2, int n3, int n4, Object object) {
        if ((n4 & 1) != 0) {
            n2 = 0;
        }
        if ((n4 & 2) != 0) {
            n3 = lArray.length;
        }
        z.\u00d300000(lArray, n2, n3);
    }

    public static final void \u00d200000(float[] fArray, int n2, int n3) {
        Arrays.sort(fArray, n2, n3);
    }

    public static /* synthetic */ void o00000(float[] fArray, int n2, int n3, int n4, Object object) {
        if ((n4 & 1) != 0) {
            n2 = 0;
        }
        if ((n4 & 2) != 0) {
            n3 = fArray.length;
        }
        z.\u00d200000(fArray, n2, n3);
    }

    public static final void \u00d300000(double[] dArray, int n2, int n3) {
        Arrays.sort(dArray, n2, n3);
    }

    public static /* synthetic */ void o00000(double[] dArray, int n2, int n3, int n4, Object object) {
        if ((n4 & 1) != 0) {
            n2 = 0;
        }
        if ((n4 & 2) != 0) {
            n3 = dArray.length;
        }
        z.\u00d300000(dArray, n2, n3);
    }

    public static final void \u00d300000(char[] cArray, int n2, int n3) {
        Arrays.sort(cArray, n2, n3);
    }

    public static /* synthetic */ void o00000(char[] cArray, int n2, int n3, int n4, Object object) {
        if ((n4 & 1) != 0) {
            n2 = 0;
        }
        if ((n4 & 2) != 0) {
            n3 = cArray.length;
        }
        z.\u00d300000(cArray, n2, n3);
    }

    public static final void o00000(Object[] objectArray, int n2, int n3) {
        Arrays.sort(objectArray, n2, n3);
    }

    public static /* synthetic */ void o00000(Object[] objectArray, int n2, int n3, int n4, Object object) {
        if ((n4 & 1) != 0) {
            n2 = 0;
        }
        if ((n4 & 2) != 0) {
            n3 = objectArray.length;
        }
        z.o00000(objectArray, n2, n3);
    }

    public static final void \u00d200000(Object[] objectArray, Comparator comparator) {
        if (objectArray.length > 1) {
            Arrays.sort(objectArray, comparator);
        }
    }

    public static final void o00000(Object[] objectArray, Comparator comparator, int n2, int n3) {
        Arrays.sort(objectArray, n2, n3, comparator);
    }

    public static /* synthetic */ void o00000(Object[] objectArray, Comparator comparator, int n2, int n3, int n4, Object object) {
        if ((n4 & 2) != 0) {
            n2 = 0;
        }
        if ((n4 & 4) != 0) {
            n3 = objectArray.length;
        }
        z.o00000(objectArray, comparator, n2, n3);
    }

    public static final Byte[] null(byte[] byArray) {
        Byte[] byteArray = new Byte[byArray.length];
        int n2 = byArray.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            byteArray[i2] = byArray[i2];
        }
        return byteArray;
    }

    public static final Short[] String(short[] sArray) {
        Short[] shortArray = new Short[sArray.length];
        int n2 = sArray.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            shortArray[i2] = sArray[i2];
        }
        return shortArray;
    }

    public static final Integer[] \u00f500000(int[] nArray) {
        Integer[] integerArray = new Integer[nArray.length];
        int n2 = nArray.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            integerArray[i2] = nArray[i2];
        }
        return integerArray;
    }

    public static final Long[] \u00f500000(long[] lArray) {
        Long[] longArray = new Long[lArray.length];
        int n2 = lArray.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            longArray[i2] = lArray[i2];
        }
        return longArray;
    }

    public static final Float[] null(float[] fArray) {
        Float[] floatArray = new Float[fArray.length];
        int n2 = fArray.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            floatArray[i2] = Float.valueOf(fArray[i2]);
        }
        return floatArray;
    }

    public static final Double[] \u00d800000(double[] dArray) {
        Double[] doubleArray = new Double[dArray.length];
        int n2 = dArray.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            doubleArray[i2] = dArray[i2];
        }
        return doubleArray;
    }

    public static final Boolean[] String(boolean[] blArray) {
        Boolean[] booleanArray = new Boolean[blArray.length];
        int n2 = blArray.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            booleanArray[i2] = blArray[i2];
        }
        return booleanArray;
    }

    public static final Character[] \u00d800000(char[] cArray) {
        Character[] characterArray = new Character[cArray.length];
        int n2 = cArray.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            characterArray[i2] = Character.valueOf(cArray[i2]);
        }
        return characterArray;
    }

    public static final SortedSet o00000(Comparable[] comparableArray) {
        return (SortedSet)z.\u00d500000((Object[])comparableArray, new TreeSet());
    }

    public static final SortedSet \u00d500000(byte[] byArray) {
        return (SortedSet)z.\u00d200000(byArray, (Collection)new TreeSet());
    }

    public static final SortedSet \u00d300000(short[] sArray) {
        return (SortedSet)z.\u00d200000(sArray, (Collection)new TreeSet());
    }

    public static final SortedSet \u00d300000(int[] nArray) {
        return (SortedSet)z.\u00d300000(nArray, (Collection)new TreeSet());
    }

    public static final SortedSet \u00d800000(long[] lArray) {
        return (SortedSet)z.\u00d200000(lArray, (Collection)new TreeSet());
    }

    public static final SortedSet \u00d200000(float[] fArray) {
        return (SortedSet)z.\u00d300000(fArray, (Collection)new TreeSet());
    }

    public static final SortedSet \u00d500000(double[] dArray) {
        return (SortedSet)z.\u00d200000(dArray, (Collection)new TreeSet());
    }

    public static final SortedSet \u00d500000(boolean[] blArray) {
        return (SortedSet)z.\u00d200000(blArray, (Collection)new TreeSet());
    }

    public static final SortedSet \u00d200000(char[] cArray) {
        return (SortedSet)z.\u00d200000(cArray, (Collection)new TreeSet());
    }

    public static final SortedSet o00000(Object[] objectArray, Comparator comparator) {
        return (SortedSet)z.\u00d500000(objectArray, new TreeSet(comparator));
    }

    public static final /* synthetic */ Double \u00d200000(Double[] doubleArray) {
        return z.String(doubleArray);
    }

    public static final /* synthetic */ Float \u00d200000(Float[] floatArray) {
        return z.\u00d800000(floatArray);
    }

    public static final /* synthetic */ Comparable String(Comparable[] comparableArray) {
        return z.\u00f600000(comparableArray);
    }

    public static final /* synthetic */ Byte String(byte[] byArray) {
        return z.\u00d6\u00d30000(byArray);
    }

    public static final /* synthetic */ Short \u00d600000(short[] sArray) {
        return z.o\u00d30000(sArray);
    }

    public static final /* synthetic */ Integer \u00d200000(int[] nArray) {
        return z.\u00d2o0000(nArray);
    }

    public static final /* synthetic */ Long o00000(long[] lArray) {
        return z.\u00d5o0000(lArray);
    }

    public static final /* synthetic */ Float \u00d300000(float[] fArray) {
        return z.\u00d6O0000(fArray);
    }

    public static final /* synthetic */ Double String(double[] dArray) {
        return z.\u00f8o0000(dArray);
    }

    public static final /* synthetic */ Character \u00d500000(char[] cArray) {
        return z.\u00d5O0000(cArray);
    }

    public static final /* synthetic */ Object \u00d200000(Object[] objectArray, g g2) {
        if (objectArray.length == 0) {
            return null;
        }
        Object object = objectArray[0];
        int n2 = z.\u00f6\u00d20000(objectArray);
        if (n2 != 0) {
            Comparable comparable = (Comparable)g2.\u00f800000(object);
            int n3 = 1;
            if (n2 > 0) {
                while (true) {
                    Object object2;
                    Comparable comparable2;
                    if (comparable.compareTo(comparable2 = (Comparable)g2.\u00f800000(object2 = objectArray[n3])) < 0) {
                        object = object2;
                        comparable = comparable2;
                    }
                    if (n3 == n2) break;
                    ++n3;
                }
            }
        }
        return object;
    }

    public static final /* synthetic */ Byte \u00d200000(byte[] byArray, g g2) {
        if (byArray.length == 0) {
            return null;
        }
        byte by = byArray[0];
        int n2 = z.\u00f6O0000(byArray);
        if (n2 != 0) {
            Comparable comparable = (Comparable)g2.\u00f800000(by);
            int n3 = 1;
            if (n2 > 0) {
                while (true) {
                    byte by2;
                    Comparable comparable2;
                    if (comparable.compareTo(comparable2 = (Comparable)g2.\u00f800000(by2 = byArray[n3])) < 0) {
                        by = by2;
                        comparable = comparable2;
                    }
                    if (n3 == n2) break;
                    ++n3;
                }
            }
        }
        return by;
    }

    public static final /* synthetic */ Short \u00d300000(short[] sArray, g g2) {
        if (sArray.length == 0) {
            return null;
        }
        short s2 = sArray[0];
        int n2 = z.\u00d3\u00d30000(sArray);
        if (n2 != 0) {
            Comparable comparable = (Comparable)g2.\u00f800000(s2);
            int n3 = 1;
            if (n2 > 0) {
                while (true) {
                    short s3;
                    Comparable comparable2;
                    if (comparable.compareTo(comparable2 = (Comparable)g2.\u00f800000(s3 = sArray[n3])) < 0) {
                        s2 = s3;
                        comparable = comparable2;
                    }
                    if (n3 == n2) break;
                    ++n3;
                }
            }
        }
        return s2;
    }

    public static final /* synthetic */ Integer \u00d300000(int[] nArray, g g2) {
        if (nArray.length == 0) {
            return null;
        }
        int n2 = nArray[0];
        int n3 = z.\u00d3O0000(nArray);
        if (n3 != 0) {
            Comparable comparable = (Comparable)g2.\u00f800000(n2);
            int n4 = 1;
            if (n3 > 0) {
                while (true) {
                    int n5;
                    Comparable comparable2;
                    if (comparable.compareTo(comparable2 = (Comparable)g2.\u00f800000(n5 = nArray[n4])) < 0) {
                        n2 = n5;
                        comparable = comparable2;
                    }
                    if (n4 == n3) break;
                    ++n4;
                }
            }
        }
        return n2;
    }

    public static final /* synthetic */ Long \u00d200000(long[] lArray, g g2) {
        if (lArray.length == 0) {
            return null;
        }
        long l2 = lArray[0];
        int n2 = z.nullnew(lArray);
        if (n2 != 0) {
            Comparable comparable = (Comparable)g2.\u00f800000(l2);
            int n3 = 1;
            if (n2 > 0) {
                while (true) {
                    long l3;
                    Comparable comparable2;
                    if (comparable.compareTo(comparable2 = (Comparable)g2.\u00f800000(l3 = lArray[n3])) < 0) {
                        l2 = l3;
                        comparable = comparable2;
                    }
                    if (n3 == n2) break;
                    ++n3;
                }
            }
        }
        return l2;
    }

    public static final /* synthetic */ Float \u00d200000(float[] fArray, g g2) {
        if (fArray.length == 0) {
            return null;
        }
        float f2 = fArray[0];
        int n2 = z.\u00f600000(fArray);
        if (n2 != 0) {
            Comparable comparable = (Comparable)g2.\u00f800000(Float.valueOf(f2));
            int n3 = 1;
            if (n2 > 0) {
                while (true) {
                    float f3;
                    Comparable comparable2;
                    if (comparable.compareTo(comparable2 = (Comparable)g2.\u00f800000(Float.valueOf(f3 = fArray[n3]))) < 0) {
                        f2 = f3;
                        comparable = comparable2;
                    }
                    if (n3 == n2) break;
                    ++n3;
                }
            }
        }
        return Float.valueOf(f2);
    }

    public static final /* synthetic */ Double \u00d200000(double[] dArray, g g2) {
        if (dArray.length == 0) {
            return null;
        }
        double d2 = dArray[0];
        int n2 = z.thisnew(dArray);
        if (n2 != 0) {
            Comparable comparable = (Comparable)g2.\u00f800000(d2);
            int n3 = 1;
            if (n2 > 0) {
                while (true) {
                    double d3;
                    Comparable comparable2;
                    if (comparable.compareTo(comparable2 = (Comparable)g2.\u00f800000(d3 = dArray[n3])) < 0) {
                        d2 = d3;
                        comparable = comparable2;
                    }
                    if (n3 == n2) break;
                    ++n3;
                }
            }
        }
        return d2;
    }

    public static final /* synthetic */ Boolean \u00d300000(boolean[] blArray, g g2) {
        if (blArray.length == 0) {
            return null;
        }
        boolean bl = blArray[0];
        int n2 = z.whilesuper(blArray);
        if (n2 != 0) {
            Comparable comparable = (Comparable)g2.\u00f800000(bl);
            int n3 = 1;
            if (n2 > 0) {
                while (true) {
                    boolean bl2;
                    Comparable comparable2;
                    if (comparable.compareTo(comparable2 = (Comparable)g2.\u00f800000(bl2 = blArray[n3])) < 0) {
                        bl = bl2;
                        comparable = comparable2;
                    }
                    if (n3 == n2) break;
                    ++n3;
                }
            }
        }
        return bl;
    }

    public static final /* synthetic */ Character o00000(char[] cArray, g g2) {
        if (cArray.length == 0) {
            return null;
        }
        char c2 = cArray[0];
        int n2 = z.o\u00d30000(cArray);
        if (n2 != 0) {
            Comparable comparable = (Comparable)g2.\u00f800000(Character.valueOf(c2));
            int n3 = 1;
            if (n2 > 0) {
                while (true) {
                    char c3;
                    Comparable comparable2;
                    if (comparable.compareTo(comparable2 = (Comparable)g2.\u00f800000(Character.valueOf(c3 = cArray[n3]))) < 0) {
                        c2 = c3;
                        comparable = comparable2;
                    }
                    if (n3 == n2) break;
                    ++n3;
                }
            }
        }
        return Character.valueOf(c2);
    }

    public static final /* synthetic */ Object \u00d300000(Object[] objectArray, Comparator comparator) {
        return z.\u00f600000(objectArray, comparator);
    }

    public static final /* synthetic */ Byte o00000(byte[] byArray, Comparator comparator) {
        return z.String(byArray, comparator);
    }

    public static final /* synthetic */ Short o00000(short[] sArray, Comparator comparator) {
        return z.\u00d500000(sArray, comparator);
    }

    public static final /* synthetic */ Integer \u00d200000(int[] nArray, Comparator comparator) {
        return z.String(nArray, comparator);
    }

    public static final /* synthetic */ Long o00000(long[] lArray, Comparator comparator) {
        return z.\u00d800000(lArray, comparator);
    }

    public static final /* synthetic */ Float \u00d200000(float[] fArray, Comparator comparator) {
        return z.\u00d600000(fArray, comparator);
    }

    public static final /* synthetic */ Double \u00d200000(double[] dArray, Comparator comparator) {
        return z.\u00d600000(dArray, comparator);
    }

    public static final /* synthetic */ Boolean \u00d200000(boolean[] blArray, Comparator comparator) {
        return z.\u00d500000(blArray, comparator);
    }

    public static final /* synthetic */ Character \u00d200000(char[] cArray, Comparator comparator) {
        return z.String(cArray, comparator);
    }

    public static final /* synthetic */ Double o00000(Double[] doubleArray) {
        return z.\u00d500000(doubleArray);
    }

    public static final /* synthetic */ Float o00000(Float[] floatArray) {
        return z.\u00d600000(floatArray);
    }

    public static final /* synthetic */ Comparable \u00d200000(Comparable[] comparableArray) {
        return z.\u00d500000(comparableArray);
    }

    public static final /* synthetic */ Byte o00000(byte[] byArray) {
        return z.\u00d6O0000(byArray);
    }

    public static final /* synthetic */ Short null(short[] sArray) {
        return z.\u00d8o0000(sArray);
    }

    public static final /* synthetic */ Integer null(int[] nArray) {
        return z.\u00f5O0000(nArray);
    }

    public static final /* synthetic */ Long String(long[] lArray) {
        return z.\u00d3\u00d20000(lArray);
    }

    public static final /* synthetic */ Float \u00d800000(float[] fArray) {
        return z.\u00f6\u00d20000(fArray);
    }

    public static final /* synthetic */ Double \u00f500000(double[] dArray) {
        return z.\u00d2O0000(dArray);
    }

    public static final /* synthetic */ Character \u00d300000(char[] cArray) {
        return z.\u00d3\u00d20000(cArray);
    }

    public static final /* synthetic */ Object String(Object[] objectArray, g g2) {
        if (objectArray.length == 0) {
            return null;
        }
        Object object = objectArray[0];
        int n2 = z.\u00f6\u00d20000(objectArray);
        if (n2 != 0) {
            Comparable comparable = (Comparable)g2.\u00f800000(object);
            int n3 = 1;
            if (n2 > 0) {
                while (true) {
                    Object object2;
                    Comparable comparable2;
                    if (comparable.compareTo(comparable2 = (Comparable)g2.\u00f800000(object2 = objectArray[n3])) > 0) {
                        object = object2;
                        comparable = comparable2;
                    }
                    if (n3 == n2) break;
                    ++n3;
                }
            }
        }
        return object;
    }

    public static final /* synthetic */ Byte \u00d300000(byte[] byArray, g g2) {
        if (byArray.length == 0) {
            return null;
        }
        byte by = byArray[0];
        int n2 = z.\u00f6O0000(byArray);
        if (n2 != 0) {
            Comparable comparable = (Comparable)g2.\u00f800000(by);
            int n3 = 1;
            if (n2 > 0) {
                while (true) {
                    byte by2;
                    Comparable comparable2;
                    if (comparable.compareTo(comparable2 = (Comparable)g2.\u00f800000(by2 = byArray[n3])) > 0) {
                        by = by2;
                        comparable = comparable2;
                    }
                    if (n3 == n2) break;
                    ++n3;
                }
            }
        }
        return by;
    }

    public static final /* synthetic */ Short o00000(short[] sArray, g g2) {
        if (sArray.length == 0) {
            return null;
        }
        short s2 = sArray[0];
        int n2 = z.\u00d3\u00d30000(sArray);
        if (n2 != 0) {
            Comparable comparable = (Comparable)g2.\u00f800000(s2);
            int n3 = 1;
            if (n2 > 0) {
                while (true) {
                    short s3;
                    Comparable comparable2;
                    if (comparable.compareTo(comparable2 = (Comparable)g2.\u00f800000(s3 = sArray[n3])) > 0) {
                        s2 = s3;
                        comparable = comparable2;
                    }
                    if (n3 == n2) break;
                    ++n3;
                }
            }
        }
        return s2;
    }

    public static final /* synthetic */ Integer \u00d200000(int[] nArray, g g2) {
        if (nArray.length == 0) {
            return null;
        }
        int n2 = nArray[0];
        int n3 = z.\u00d3O0000(nArray);
        if (n3 != 0) {
            Comparable comparable = (Comparable)g2.\u00f800000(n2);
            int n4 = 1;
            if (n3 > 0) {
                while (true) {
                    int n5;
                    Comparable comparable2;
                    if (comparable.compareTo(comparable2 = (Comparable)g2.\u00f800000(n5 = nArray[n4])) > 0) {
                        n2 = n5;
                        comparable = comparable2;
                    }
                    if (n4 == n3) break;
                    ++n4;
                }
            }
        }
        return n2;
    }

    public static final /* synthetic */ Long \u00d300000(long[] lArray, g g2) {
        if (lArray.length == 0) {
            return null;
        }
        long l2 = lArray[0];
        int n2 = z.nullnew(lArray);
        if (n2 != 0) {
            Comparable comparable = (Comparable)g2.\u00f800000(l2);
            int n3 = 1;
            if (n2 > 0) {
                while (true) {
                    long l3;
                    Comparable comparable2;
                    if (comparable.compareTo(comparable2 = (Comparable)g2.\u00f800000(l3 = lArray[n3])) > 0) {
                        l2 = l3;
                        comparable = comparable2;
                    }
                    if (n3 == n2) break;
                    ++n3;
                }
            }
        }
        return l2;
    }

    public static final /* synthetic */ Float \u00d300000(float[] fArray, g g2) {
        if (fArray.length == 0) {
            return null;
        }
        float f2 = fArray[0];
        int n2 = z.\u00f600000(fArray);
        if (n2 != 0) {
            Comparable comparable = (Comparable)g2.\u00f800000(Float.valueOf(f2));
            int n3 = 1;
            if (n2 > 0) {
                while (true) {
                    float f3;
                    Comparable comparable2;
                    if (comparable.compareTo(comparable2 = (Comparable)g2.\u00f800000(Float.valueOf(f3 = fArray[n3]))) > 0) {
                        f2 = f3;
                        comparable = comparable2;
                    }
                    if (n3 == n2) break;
                    ++n3;
                }
            }
        }
        return Float.valueOf(f2);
    }

    public static final /* synthetic */ Double \u00d300000(double[] dArray, g g2) {
        if (dArray.length == 0) {
            return null;
        }
        double d2 = dArray[0];
        int n2 = z.thisnew(dArray);
        if (n2 != 0) {
            Comparable comparable = (Comparable)g2.\u00f800000(d2);
            int n3 = 1;
            if (n2 > 0) {
                while (true) {
                    double d3;
                    Comparable comparable2;
                    if (comparable.compareTo(comparable2 = (Comparable)g2.\u00f800000(d3 = dArray[n3])) > 0) {
                        d2 = d3;
                        comparable = comparable2;
                    }
                    if (n3 == n2) break;
                    ++n3;
                }
            }
        }
        return d2;
    }

    public static final /* synthetic */ Boolean o00000(boolean[] blArray, g g2) {
        if (blArray.length == 0) {
            return null;
        }
        boolean bl = blArray[0];
        int n2 = z.whilesuper(blArray);
        if (n2 != 0) {
            Comparable comparable = (Comparable)g2.\u00f800000(bl);
            int n3 = 1;
            if (n2 > 0) {
                while (true) {
                    boolean bl2;
                    Comparable comparable2;
                    if (comparable.compareTo(comparable2 = (Comparable)g2.\u00f800000(bl2 = blArray[n3])) > 0) {
                        bl = bl2;
                        comparable = comparable2;
                    }
                    if (n3 == n2) break;
                    ++n3;
                }
            }
        }
        return bl;
    }

    public static final /* synthetic */ Character \u00d300000(char[] cArray, g g2) {
        if (cArray.length == 0) {
            return null;
        }
        char c2 = cArray[0];
        int n2 = z.o\u00d30000(cArray);
        if (n2 != 0) {
            Comparable comparable = (Comparable)g2.\u00f800000(Character.valueOf(c2));
            int n3 = 1;
            if (n2 > 0) {
                while (true) {
                    char c3;
                    Comparable comparable2;
                    if (comparable.compareTo(comparable2 = (Comparable)g2.\u00f800000(Character.valueOf(c3 = cArray[n3]))) > 0) {
                        c2 = c3;
                        comparable = comparable2;
                    }
                    if (n3 == n2) break;
                    ++n3;
                }
            }
        }
        return Character.valueOf(c2);
    }

    public static final /* synthetic */ Object String(Object[] objectArray, Comparator comparator) {
        return z.\u00d600000(objectArray, comparator);
    }

    public static final /* synthetic */ Byte \u00d200000(byte[] byArray, Comparator comparator) {
        return z.\u00d300000(byArray, comparator);
    }

    public static final /* synthetic */ Short \u00d200000(short[] sArray, Comparator comparator) {
        return z.\u00d300000(sArray, comparator);
    }

    public static final /* synthetic */ Integer o00000(int[] nArray, Comparator comparator) {
        return z.\u00d300000(nArray, comparator);
    }

    public static final /* synthetic */ Long \u00d200000(long[] lArray, Comparator comparator) {
        return z.\u00d500000(lArray, comparator);
    }

    public static final /* synthetic */ Float o00000(float[] fArray, Comparator comparator) {
        return z.\u00d500000(fArray, comparator);
    }

    public static final /* synthetic */ Double o00000(double[] dArray, Comparator comparator) {
        return z.\u00d300000(dArray, comparator);
    }

    public static final /* synthetic */ Boolean o00000(boolean[] blArray, Comparator comparator) {
        return z.\u00d300000(blArray, comparator);
    }

    public static final /* synthetic */ Character o00000(char[] cArray, Comparator comparator) {
        return z.\u00d800000(cArray, comparator);
    }

    private static final BigDecimal o00000(Object[] objectArray, g g2) {
        BigDecimal bigDecimal = BigDecimal.valueOf(0L);
        for (Object object : objectArray) {
            bigDecimal = bigDecimal.add((BigDecimal)g2.\u00f800000(object));
        }
        return bigDecimal;
    }

    private static final BigDecimal o00000(byte[] byArray, g g2) {
        BigDecimal bigDecimal = BigDecimal.valueOf(0L);
        for (byte by : byArray) {
            bigDecimal = bigDecimal.add((BigDecimal)g2.\u00f800000(by));
        }
        return bigDecimal;
    }

    private static final BigDecimal String(short[] sArray, g g2) {
        BigDecimal bigDecimal = BigDecimal.valueOf(0L);
        for (short s2 : sArray) {
            bigDecimal = bigDecimal.add((BigDecimal)g2.\u00f800000(s2));
        }
        return bigDecimal;
    }

    private static final BigDecimal String(int[] nArray, g g2) {
        BigDecimal bigDecimal = BigDecimal.valueOf(0L);
        for (int n2 : nArray) {
            bigDecimal = bigDecimal.add((BigDecimal)g2.\u00f800000(n2));
        }
        return bigDecimal;
    }

    private static final BigDecimal o00000(long[] lArray, g g2) {
        BigDecimal bigDecimal = BigDecimal.valueOf(0L);
        for (long l2 : lArray) {
            bigDecimal = bigDecimal.add((BigDecimal)g2.\u00f800000(l2));
        }
        return bigDecimal;
    }

    private static final BigDecimal o00000(float[] fArray, g g2) {
        BigDecimal bigDecimal = BigDecimal.valueOf(0L);
        for (float f2 : fArray) {
            bigDecimal = bigDecimal.add((BigDecimal)g2.\u00f800000(Float.valueOf(f2)));
        }
        return bigDecimal;
    }

    private static final BigDecimal o00000(double[] dArray, g g2) {
        BigDecimal bigDecimal = BigDecimal.valueOf(0L);
        for (double d2 : dArray) {
            bigDecimal = bigDecimal.add((BigDecimal)g2.\u00f800000(d2));
        }
        return bigDecimal;
    }

    private static final BigDecimal String(boolean[] blArray, g g2) {
        BigDecimal bigDecimal = BigDecimal.valueOf(0L);
        for (boolean bl : blArray) {
            bigDecimal = bigDecimal.add((BigDecimal)g2.\u00f800000(bl));
        }
        return bigDecimal;
    }

    private static final BigDecimal String(char[] cArray, g g2) {
        BigDecimal bigDecimal = BigDecimal.valueOf(0L);
        for (char c2 : cArray) {
            bigDecimal = bigDecimal.add((BigDecimal)g2.\u00f800000(Character.valueOf(c2)));
        }
        return bigDecimal;
    }

    private static final BigInteger \u00d300000(Object[] objectArray, g g2) {
        BigInteger bigInteger = BigInteger.valueOf(0L);
        for (Object object : objectArray) {
            bigInteger = bigInteger.add((BigInteger)g2.\u00f800000(object));
        }
        return bigInteger;
    }

    private static final BigInteger String(byte[] byArray, g g2) {
        BigInteger bigInteger = BigInteger.valueOf(0L);
        for (byte by : byArray) {
            bigInteger = bigInteger.add((BigInteger)g2.\u00f800000(by));
        }
        return bigInteger;
    }

    private static final BigInteger \u00d200000(short[] sArray, g g2) {
        BigInteger bigInteger = BigInteger.valueOf(0L);
        for (short s2 : sArray) {
            bigInteger = bigInteger.add((BigInteger)g2.\u00f800000(s2));
        }
        return bigInteger;
    }

    private static final BigInteger o00000(int[] nArray, g g2) {
        BigInteger bigInteger = BigInteger.valueOf(0L);
        for (int n2 : nArray) {
            bigInteger = bigInteger.add((BigInteger)g2.\u00f800000(n2));
        }
        return bigInteger;
    }

    private static final BigInteger String(long[] lArray, g g2) {
        BigInteger bigInteger = BigInteger.valueOf(0L);
        for (long l2 : lArray) {
            bigInteger = bigInteger.add((BigInteger)g2.\u00f800000(l2));
        }
        return bigInteger;
    }

    private static final BigInteger String(float[] fArray, g g2) {
        BigInteger bigInteger = BigInteger.valueOf(0L);
        for (float f2 : fArray) {
            bigInteger = bigInteger.add((BigInteger)g2.\u00f800000(Float.valueOf(f2)));
        }
        return bigInteger;
    }

    private static final BigInteger String(double[] dArray, g g2) {
        BigInteger bigInteger = BigInteger.valueOf(0L);
        for (double d2 : dArray) {
            bigInteger = bigInteger.add((BigInteger)g2.\u00f800000(d2));
        }
        return bigInteger;
    }

    private static final BigInteger \u00d200000(boolean[] blArray, g g2) {
        BigInteger bigInteger = BigInteger.valueOf(0L);
        for (boolean bl : blArray) {
            bigInteger = bigInteger.add((BigInteger)g2.\u00f800000(bl));
        }
        return bigInteger;
    }

    private static final BigInteger \u00d200000(char[] cArray, g g2) {
        BigInteger bigInteger = BigInteger.valueOf(0L);
        for (char c2 : cArray) {
            bigInteger = bigInteger.add((BigInteger)g2.\u00f800000(Character.valueOf(c2)));
        }
        return bigInteger;
    }
}

