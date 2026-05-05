/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.l.c.b;

import b.e.bb;
import b.q.f;
import b.qd;
import b.s.l;
import b.s.mc;
import b.s.y;
import b.t.c.b.b.l.c.b$_b$_b;
import b.t.c.b.b.l.c.b$_b$_b$_b;
import b.t.c.b.b.l.c.b.h$_b;
import b.t.c.b.b.l.c.b.h$_c;
import b.t.c.b.b.l.d.e;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class h
implements e {
    public static final h$_c \u00f500000 = new h$_c(null);
    private final String[] \u00d300000;
    private final Set \u00f400000;
    private final List \u00d500000;
    private static final String \u00d400000;
    private static final List return;
    private static final Map \u00d800000;

    public h(String[] stringArray, Set set, List list) {
        this.\u00d300000 = stringArray;
        this.\u00f400000 = set;
        this.\u00d500000 = list;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public String new(int var1_1) {
        block13: {
            block12: {
                var2_3 = (b$_b$_b)this.\u00d500000.get(var1_1);
                if (!var2_3.\u00d4o0000()) break block12;
                v0 = var2_3.Objectsuper();
                break block13;
            }
            if (!var2_3.floatsuper()) ** GOTO lbl-1000
            var3_4 = ((Collection)h.return).size();
            var4_8 = var2_3.\u00d3o0000();
            v1 = var4_8 >= 0 ? var4_8 < var3_4 : false;
            if (v1) {
                v0 = (String)h.return.get(var2_3.\u00d3o0000());
            } else lbl-1000:
            // 2 sources

            {
                v0 = var1_2 = this.\u00d300000[var1_1];
            }
        }
        if (var2_3.\u00f4O0000() >= 2) {
            var3_5 = var2_3.\u00f6O0000();
            var4_9 = (Integer)var3_5.get(0);
            var3_5 = (Integer)var3_5.get(1);
            if (0 <= var4_9 && var4_9 <= var3_5.intValue() && var3_5.intValue() <= var1_2.length()) {
                var4_8 = var4_9;
                var3_4 = var3_5.intValue();
                var1_2 = var1_2.substring(var4_8, var3_4);
            }
        }
        if (var2_3.\u00d6O0000() >= 2) {
            var3_6 = var2_3.\u00f8O0000();
            var4_10 = (Integer)var3_6.get(0);
            var3_6 = (Integer)var3_6.get(1);
            var1_2 = f.super(var1_2, (char)var4_10.intValue(), (char)var3_6.intValue(), false, 4, null);
        }
        if ((v2 = var2_3.\u00d4O0000()) == null) {
            v2 = b$_b$_b$_b.\u00f4\u00f40000;
        }
        switch (h$_b.super[v2.ordinal()]) {
            case 1: {
                break;
            }
            case 2: {
                var1_2 = f.super(var1_2, '$', '.', false, 4, null);
                break;
            }
            case 3: {
                if (var1_2.length() >= 2) {
                    var3_7 = var1_2;
                    var4_11 = var1_2.length() - 1;
                    var1_2 = var3_7.substring(1, var4_11);
                }
                var1_2 = f.super(var1_2, '$', '.', false, 4, null);
                break;
            }
            default: {
                throw new qd();
            }
        }
        return var1_2;
    }

    @Override
    public String \u00d300000(int n2) {
        return this.new(n2);
    }

    @Override
    public boolean o00000(int n2) {
        return this.\u00f400000.contains(n2);
    }

    static {
        Object[] objectArray = new Character[6];
        Object object = objectArray;
        objectArray[0] = Character.valueOf('k');
        object[1] = Character.valueOf('o');
        object[2] = Character.valueOf('t');
        object[3] = Character.valueOf('l');
        object[4] = Character.valueOf('i');
        object[5] = Character.valueOf('n');
        \u00d400000 = mc.o00000(mc.new((Object[])object), "", null, null, 0, null, null, 62, null);
        String[] stringArray = new String[44];
        object = stringArray;
        stringArray[0] = \u00d400000 + "/Any";
        object[1] = \u00d400000 + "/Nothing";
        object[2] = \u00d400000 + "/Unit";
        object[3] = \u00d400000 + "/Throwable";
        object[4] = \u00d400000 + "/Number";
        object[5] = \u00d400000 + "/Byte";
        object[6] = \u00d400000 + "/Double";
        object[7] = \u00d400000 + "/Float";
        object[8] = \u00d400000 + "/Int";
        object[9] = \u00d400000 + "/Long";
        object[10] = \u00d400000 + "/Short";
        object[11] = \u00d400000 + "/Boolean";
        object[12] = \u00d400000 + "/Char";
        object[13] = \u00d400000 + "/CharSequence";
        object[14] = \u00d400000 + "/String";
        object[15] = \u00d400000 + "/Comparable";
        object[16] = \u00d400000 + "/Enum";
        object[17] = \u00d400000 + "/Array";
        object[18] = \u00d400000 + "/ByteArray";
        object[19] = \u00d400000 + "/DoubleArray";
        object[20] = \u00d400000 + "/FloatArray";
        object[21] = \u00d400000 + "/IntArray";
        object[22] = \u00d400000 + "/LongArray";
        object[23] = \u00d400000 + "/ShortArray";
        object[24] = \u00d400000 + "/BooleanArray";
        object[25] = \u00d400000 + "/CharArray";
        object[26] = \u00d400000 + "/Cloneable";
        object[27] = \u00d400000 + "/Annotation";
        object[28] = \u00d400000 + "/collections/Iterable";
        object[29] = \u00d400000 + "/collections/MutableIterable";
        object[30] = \u00d400000 + "/collections/Collection";
        object[31] = \u00d400000 + "/collections/MutableCollection";
        object[32] = \u00d400000 + "/collections/List";
        object[33] = \u00d400000 + "/collections/MutableList";
        object[34] = \u00d400000 + "/collections/Set";
        object[35] = \u00d400000 + "/collections/MutableSet";
        object[36] = \u00d400000 + "/collections/Map";
        object[37] = \u00d400000 + "/collections/MutableMap";
        object[38] = \u00d400000 + "/collections/Map.Entry";
        object[39] = \u00d400000 + "/collections/MutableMap.MutableEntry";
        object[40] = \u00d400000 + "/collections/Iterator";
        object[41] = \u00d400000 + "/collections/MutableIterator";
        object[42] = \u00d400000 + "/collections/ListIterator";
        object[43] = \u00d400000 + "/collections/MutableListIterator";
        return = mc.new((Object[])object);
        object = mc.O\u00d20000(return);
        int n2 = bb.\u00d200000(y.\u00d200000(mc.o00000((Iterable)object, 10)), 16);
        Map map = new LinkedHashMap(n2);
        object = object.iterator();
        while (object.hasNext()) {
            Object object2 = object.next();
            Object object3 = (l)object2;
            Map map2 = map;
            object3 = (l)object2;
            object2 = (String)((l)object3).String();
            object3 = ((l)object3).o00000();
            map2.put(object2, object3);
        }
        \u00d800000 = map;
    }
}

