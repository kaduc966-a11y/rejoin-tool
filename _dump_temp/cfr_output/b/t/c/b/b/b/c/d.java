/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.b.c;

import b.o.d.fc;
import b.s.mc;
import b.s.ub;
import b.t.c.b.b.b.c.f;
import b.t.c.b.b.b.d$_b;
import b.t.c.b.b.d.e;
import b.t.c.b.b.n.b.o;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class d {
    public static final d \u00d500000 = new d();
    private static final Set o00000;
    private static final Set \u00d200000;
    private static final Set \u00d400000;
    private static final Set \u00d600000;
    private static final Set void;
    private static final Set Object;
    private static final Set \u00f400000;

    private d() {
    }

    public final Set \u00d500000() {
        return o00000;
    }

    public final Set \u00d400000() {
        return \u00d200000;
    }

    private final Set \u00d200000() {
        o o2 = o.o00000;
        b.t.c.b.b.o.h.e[] eArray = new b.t.c.b.b.o.h.e[2];
        Object object = eArray;
        eArray[0] = b.t.c.b.b.o.h.e.int;
        object[1] = b.t.c.b.b.o.h.e.class;
        object = mc.new((Object[])object);
        Collection collection = new LinkedHashSet();
        object = object.iterator();
        while (object.hasNext()) {
            Object object2 = (b.t.c.b.b.o.h.e)((Object)object.next());
            String[] stringArray = new String[1];
            String[] stringArray2 = stringArray;
            stringArray[0] = object2.\u00d300000() + "Value()" + object2.\u00d400000();
            object2 = o2.\u00d300000(object2.o00000().\u00d400000().\u00d400000(), stringArray2);
            mc.new(collection, (Iterable)object2);
        }
        return (LinkedHashSet)collection;
    }

    public final Set void() {
        return \u00d400000;
    }

    public final Set \u00f400000() {
        return \u00d600000;
    }

    public final Set Object() {
        return void;
    }

    public final Set \u00d600000() {
        return Object;
    }

    public final Set \u00f500000() {
        return \u00f400000;
    }

    private final Set o00000() {
        o o2 = o.o00000;
        b.t.c.b.b.o.h.e[] eArray = new b.t.c.b.b.o.h.e[8];
        Object object = eArray;
        eArray[0] = b.t.c.b.b.o.h.e.int;
        object[1] = b.t.c.b.b.o.h.e.\u00d600000;
        object[2] = b.t.c.b.b.o.h.e.interface;
        object[3] = b.t.c.b.b.o.h.e.\u00f600000;
        object[4] = b.t.c.b.b.o.h.e.\u00d600000;
        object[5] = b.t.c.b.b.o.h.e.\u00d300000;
        object[6] = b.t.c.b.b.o.h.e.super;
        object[7] = b.t.c.b.b.o.h.e.do;
        object = mc.new((Object[])object);
        Collection collection = new LinkedHashSet();
        object = object.iterator();
        while (object.hasNext()) {
            Object object2 = (String[])object.next();
            String string = object2.o00000().\u00d400000().\u00d400000();
            String[] stringArray = new String[1];
            object2 = stringArray;
            stringArray[0] = "Ljava/lang/String;";
            String[] stringArray2 = o2.super((String)object2);
            object2 = o2.\u00d300000(string, Arrays.copyOf(stringArray2, stringArray2.length));
            mc.new(collection, (Iterable)object2);
        }
        return (LinkedHashSet)collection;
    }

    public final boolean o00000(e clazz) {
        if (this.\u00d200000((e)((Object)clazz))) {
            return true;
        }
        b.t.c.b.b.d.d d2 = f.\u00f500000.o00000((e)((Object)clazz));
        if (d2 == null) {
            return false;
        }
        clazz = d2;
        try {
            clazz = Class.forName(((b.t.c.b.b.d.d)((Object)clazz)).\u00f400000().super());
        }
        catch (ClassNotFoundException classNotFoundException) {
            return false;
        }
        return Serializable.class.isAssignableFrom(clazz);
    }

    public final boolean \u00d200000(e e2) {
        return fc.o00000((Object)e2, (Object)d$_b.ifString) || b.t.c.b.b.b.d.o00000(e2);
    }

    static {
        String[] stringArray = new String[2];
        Object object = stringArray;
        stringArray[0] = "toArray()[Ljava/lang/Object;";
        object[1] = "toArray([Ljava/lang/Object;)[Ljava/lang/Object;";
        o00000 = ub.\u00d200000(o.o00000.super("Collection", (String[])object), (Object)"java/lang/annotation/Annotation.annotationType()Ljava/lang/Class;");
        object = o.o00000;
        String[] stringArray2 = new String[2];
        String[] stringArray3 = stringArray2;
        stringArray2[0] = "sort(Ljava/util/Comparator;)V";
        stringArray3[1] = "reversed()Ljava/util/List;";
        Set set = ub.super(\u00d500000.\u00d200000(), ((o)object).super("List", stringArray3));
        String[] stringArray4 = new String[48];
        stringArray3 = stringArray4;
        stringArray4[0] = "codePointAt(I)I";
        stringArray3[1] = "codePointBefore(I)I";
        stringArray3[2] = "codePointCount(II)I";
        stringArray3[3] = "compareToIgnoreCase(Ljava/lang/String;)I";
        stringArray3[4] = "concat(Ljava/lang/String;)Ljava/lang/String;";
        stringArray3[5] = "contains(Ljava/lang/CharSequence;)Z";
        stringArray3[6] = "contentEquals(Ljava/lang/CharSequence;)Z";
        stringArray3[7] = "contentEquals(Ljava/lang/StringBuffer;)Z";
        stringArray3[8] = "endsWith(Ljava/lang/String;)Z";
        stringArray3[9] = "equalsIgnoreCase(Ljava/lang/String;)Z";
        stringArray3[10] = "getBytes()[B";
        stringArray3[11] = "getBytes(II[BI)V";
        stringArray3[12] = "getBytes(Ljava/lang/String;)[B";
        stringArray3[13] = "getBytes(Ljava/nio/charset/Charset;)[B";
        stringArray3[14] = "getChars(II[CI)V";
        stringArray3[15] = "indexOf(I)I";
        stringArray3[16] = "indexOf(II)I";
        stringArray3[17] = "indexOf(Ljava/lang/String;)I";
        stringArray3[18] = "indexOf(Ljava/lang/String;I)I";
        stringArray3[19] = "intern()Ljava/lang/String;";
        stringArray3[20] = "isEmpty()Z";
        stringArray3[21] = "lastIndexOf(I)I";
        stringArray3[22] = "lastIndexOf(II)I";
        stringArray3[23] = "lastIndexOf(Ljava/lang/String;)I";
        stringArray3[24] = "lastIndexOf(Ljava/lang/String;I)I";
        stringArray3[25] = "matches(Ljava/lang/String;)Z";
        stringArray3[26] = "offsetByCodePoints(II)I";
        stringArray3[27] = "regionMatches(ILjava/lang/String;II)Z";
        stringArray3[28] = "regionMatches(ZILjava/lang/String;II)Z";
        stringArray3[29] = "replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;";
        stringArray3[30] = "replace(CC)Ljava/lang/String;";
        stringArray3[31] = "replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;";
        stringArray3[32] = "replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;";
        stringArray3[33] = "split(Ljava/lang/String;I)[Ljava/lang/String;";
        stringArray3[34] = "split(Ljava/lang/String;)[Ljava/lang/String;";
        stringArray3[35] = "startsWith(Ljava/lang/String;I)Z";
        stringArray3[36] = "startsWith(Ljava/lang/String;)Z";
        stringArray3[37] = "substring(II)Ljava/lang/String;";
        stringArray3[38] = "substring(I)Ljava/lang/String;";
        stringArray3[39] = "toCharArray()[C";
        stringArray3[40] = "toLowerCase()Ljava/lang/String;";
        stringArray3[41] = "toLowerCase(Ljava/util/Locale;)Ljava/lang/String;";
        stringArray3[42] = "toUpperCase()Ljava/lang/String;";
        stringArray3[43] = "toUpperCase(Ljava/util/Locale;)Ljava/lang/String;";
        stringArray3[44] = "trim()Ljava/lang/String;";
        stringArray3[45] = "isBlank()Z";
        stringArray3[46] = "lines()Ljava/util/stream/Stream;";
        stringArray3[47] = "repeat(I)Ljava/lang/String;";
        Set set2 = ub.super(set, ((o)object).\u00d300000("String", stringArray3));
        String[] stringArray5 = new String[2];
        stringArray3 = stringArray5;
        stringArray5[0] = "isInfinite()Z";
        stringArray3[1] = "isNaN()Z";
        Set set3 = ub.super(set2, ((o)object).\u00d300000("Double", stringArray3));
        String[] stringArray6 = new String[2];
        stringArray3 = stringArray6;
        stringArray6[0] = "isInfinite()Z";
        stringArray3[1] = "isNaN()Z";
        Set set4 = ub.super(set3, ((o)object).\u00d300000("Float", stringArray3));
        String[] stringArray7 = new String[2];
        stringArray3 = stringArray7;
        stringArray7[0] = "getDeclaringClass()Ljava/lang/Class;";
        stringArray3[1] = "finalize()V";
        Set set5 = ub.super(set4, ((o)object).\u00d300000("Enum", stringArray3));
        String[] stringArray8 = new String[1];
        stringArray3 = stringArray8;
        stringArray8[0] = "isEmpty()Z";
        \u00d200000 = ub.super(set5, ((o)object).\u00d300000("CharSequence", stringArray3));
        String[] stringArray9 = new String[2];
        stringArray3 = stringArray9;
        stringArray9[0] = "getFirst()Ljava/lang/Object;";
        stringArray3[1] = "getLast()Ljava/lang/Object;";
        \u00d400000 = o.o00000.super("List", stringArray3);
        object = o.o00000;
        String[] stringArray10 = new String[2];
        stringArray3 = stringArray10;
        stringArray10[0] = "codePoints()Ljava/util/stream/IntStream;";
        stringArray3[1] = "chars()Ljava/util/stream/IntStream;";
        Set set6 = ((o)object).\u00d300000("CharSequence", stringArray3);
        String[] stringArray11 = new String[1];
        stringArray3 = stringArray11;
        stringArray11[0] = "forEachRemaining(Ljava/util/function/Consumer;)V";
        Set set7 = ub.super(set6, ((o)object).super("Iterator", stringArray3));
        String[] stringArray12 = new String[2];
        stringArray3 = stringArray12;
        stringArray12[0] = "forEach(Ljava/util/function/Consumer;)V";
        stringArray3[1] = "spliterator()Ljava/util/Spliterator;";
        Set set8 = ub.super(set7, ((o)object).\u00d300000("Iterable", stringArray3));
        String[] stringArray13 = new String[10];
        stringArray3 = stringArray13;
        stringArray13[0] = "setStackTrace([Ljava/lang/StackTraceElement;)V";
        stringArray3[1] = "fillInStackTrace()Ljava/lang/Throwable;";
        stringArray3[2] = "getLocalizedMessage()Ljava/lang/String;";
        stringArray3[3] = "printStackTrace()V";
        stringArray3[4] = "printStackTrace(Ljava/io/PrintStream;)V";
        stringArray3[5] = "printStackTrace(Ljava/io/PrintWriter;)V";
        stringArray3[6] = "getStackTrace()[Ljava/lang/StackTraceElement;";
        stringArray3[7] = "initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;";
        stringArray3[8] = "getSuppressed()[Ljava/lang/Throwable;";
        stringArray3[9] = "addSuppressed(Ljava/lang/Throwable;)V";
        Set set9 = ub.super(set8, ((o)object).\u00d300000("Throwable", stringArray3));
        String[] stringArray14 = new String[4];
        stringArray3 = stringArray14;
        stringArray14[0] = "spliterator()Ljava/util/Spliterator;";
        stringArray3[1] = "parallelStream()Ljava/util/stream/Stream;";
        stringArray3[2] = "stream()Ljava/util/stream/Stream;";
        stringArray3[3] = "removeIf(Ljava/util/function/Predicate;)Z";
        Set set10 = ub.super(set9, ((o)object).super("Collection", stringArray3));
        String[] stringArray15 = new String[5];
        stringArray3 = stringArray15;
        stringArray15[0] = "replaceAll(Ljava/util/function/UnaryOperator;)V";
        stringArray3[1] = "addFirst(Ljava/lang/Object;)V";
        stringArray3[2] = "addLast(Ljava/lang/Object;)V";
        stringArray3[3] = "removeFirst()Ljava/lang/Object;";
        stringArray3[4] = "removeLast()Ljava/lang/Object;";
        Set set11 = ub.super(set10, ((o)object).super("List", stringArray3));
        String[] stringArray16 = new String[10];
        stringArray3 = stringArray16;
        stringArray16[0] = "getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;";
        stringArray3[1] = "forEach(Ljava/util/function/BiConsumer;)V";
        stringArray3[2] = "replaceAll(Ljava/util/function/BiFunction;)V";
        stringArray3[3] = "merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;";
        stringArray3[4] = "computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;";
        stringArray3[5] = "putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;";
        stringArray3[6] = "replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z";
        stringArray3[7] = "replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;";
        stringArray3[8] = "computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;";
        stringArray3[9] = "compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;";
        \u00d600000 = ub.super(set11, ((o)object).super("Map", stringArray3));
        object = o.o00000;
        String[] stringArray17 = new String[1];
        stringArray3 = stringArray17;
        stringArray17[0] = "removeIf(Ljava/util/function/Predicate;)Z";
        Set set12 = ((o)object).super("Collection", stringArray3);
        String[] stringArray18 = new String[6];
        stringArray3 = stringArray18;
        stringArray18[0] = "replaceAll(Ljava/util/function/UnaryOperator;)V";
        stringArray3[1] = "sort(Ljava/util/Comparator;)V";
        stringArray3[2] = "addFirst(Ljava/lang/Object;)V";
        stringArray3[3] = "addLast(Ljava/lang/Object;)V";
        stringArray3[4] = "removeFirst()Ljava/lang/Object;";
        stringArray3[5] = "removeLast()Ljava/lang/Object;";
        Set set13 = ub.super(set12, ((o)object).super("List", stringArray3));
        String[] stringArray19 = new String[9];
        stringArray3 = stringArray19;
        stringArray19[0] = "computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;";
        stringArray3[1] = "computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;";
        stringArray3[2] = "compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;";
        stringArray3[3] = "merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;";
        stringArray3[4] = "putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;";
        stringArray3[5] = "remove(Ljava/lang/Object;Ljava/lang/Object;)Z";
        stringArray3[6] = "replaceAll(Ljava/util/function/BiFunction;)V";
        stringArray3[7] = "replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;";
        stringArray3[8] = "replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z";
        void = ub.super(set13, ((o)object).super("Map", stringArray3));
        object = o.o00000;
        String[] stringArray20 = new String[1];
        stringArray3 = stringArray20;
        stringArray20[0] = "D";
        String[] stringArray21 = ((o)object).super(stringArray3);
        String[] stringArray22 = new String[11];
        stringArray3 = stringArray22;
        stringArray22[0] = "[C";
        stringArray3[1] = "[CII";
        stringArray3[2] = "[III";
        stringArray3[3] = "[BIILjava/lang/String;";
        stringArray3[4] = "[BIILjava/nio/charset/Charset;";
        stringArray3[5] = "[BLjava/lang/String;";
        stringArray3[6] = "[BLjava/nio/charset/Charset;";
        stringArray3[7] = "[BII";
        stringArray3[8] = "[B";
        stringArray3[9] = "Ljava/lang/StringBuffer;";
        stringArray3[10] = "Ljava/lang/StringBuilder;";
        String[] stringArray23 = ((o)object).super(stringArray3);
        Object = ub.super(ub.super(\u00d500000.o00000(), ((o)object).\u00d300000("Float", Arrays.copyOf(stringArray21, stringArray21.length))), ((o)object).\u00d300000("String", Arrays.copyOf(stringArray23, stringArray23.length)));
        object = o.o00000;
        String[] stringArray24 = new String[1];
        stringArray3 = stringArray24;
        stringArray24[0] = "Ljava/lang/String;Ljava/lang/Throwable;ZZ";
        String[] stringArray25 = ((o)object).super(stringArray3);
        \u00f400000 = ((o)object).\u00d300000("Throwable", Arrays.copyOf(stringArray25, stringArray25.length));
    }
}

