/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.l.c.b;

import b.m.w;
import b.q.f;
import b.s.mc;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class i {
    public static final i \u00d200000 = new i();
    private static final String o00000;
    private static final Map Object;

    private i() {
    }

    public static final String super(String string) {
        String string2 = (String)Object.get(string);
        if (string2 == null) {
            string2 = "L" + f.super(string, '.', '$', false, 4, null) + ';';
        }
        return string2;
    }

    private static final void super(Map map, String string, String string2) {
        map.put(o00000 + '/' + string, "L" + string2 + ';');
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
        o00000 = mc.o00000(mc.new(object), "", null, null, 0, null, null, 62, null);
        object = new LinkedHashMap();
        Map map = object;
        Object[] objectArray2 = new String[16];
        Object[] objectArray3 = objectArray2;
        objectArray2[0] = "Boolean";
        objectArray3[1] = "Z";
        objectArray3[2] = "Char";
        objectArray3[3] = "C";
        objectArray3[4] = "Byte";
        objectArray3[5] = "B";
        objectArray3[6] = "Short";
        objectArray3[7] = "S";
        objectArray3[8] = "Int";
        objectArray3[9] = "I";
        objectArray3[10] = "Float";
        objectArray3[11] = "F";
        objectArray3[12] = "Long";
        objectArray3[13] = "J";
        objectArray3[14] = "Double";
        objectArray3[15] = "D";
        List list = mc.new(objectArray3);
        int n2 = ((Collection)list).size() + -1;
        int n3 = 0;
        if ((n2 = w.\u00d200000(0, n2, 2)) >= 0) {
            while (true) {
                map.put(o00000 + '/' + (String)list.get(n3), list.get(n3 + 1));
                map.put(o00000 + '/' + (String)list.get(n3) + "Array", "[" + (String)list.get(n3 + 1));
                if (n3 == n2) break;
                n3 += 2;
            }
        }
        map.put(o00000 + "/Unit", "V");
        i.super(map, "Any", "java/lang/Object");
        i.super(map, "Nothing", "java/lang/Void");
        i.super(map, "Annotation", "java/lang/annotation/Annotation");
        Object[] objectArray4 = new String[7];
        Object object22 = objectArray4;
        objectArray4[0] = "String";
        object22[1] = "CharSequence";
        object22[2] = "Throwable";
        object22[3] = "Cloneable";
        object22[4] = "Number";
        object22[5] = "Comparable";
        object22[6] = "Enum";
        for (Object object22 : mc.new(object22)) {
            i.super(map, (String)object22, "java/lang/".concat(String.valueOf(object22)));
        }
        String[] stringArray = new String[6];
        object22 = stringArray;
        stringArray[0] = "Iterator";
        object22[1] = "Collection";
        object22[2] = "List";
        object22[3] = "Set";
        object22[4] = "Map";
        object22[5] = "ListIterator";
        for (Object object22 : mc.new(object22)) {
            i.super(map, "collections/".concat(String.valueOf(object22)), "java/util/".concat(String.valueOf(object22)));
            i.super(map, "collections/Mutable".concat(String.valueOf(object22)), "java/util/".concat(String.valueOf(object22)));
        }
        i.super(map, "collections/Iterable", "java/lang/Iterable");
        i.super(map, "collections/MutableIterable", "java/lang/Iterable");
        i.super(map, "collections/Map.Entry", "java/util/Map$Entry");
        i.super(map, "collections/MutableMap.MutableEntry", "java/util/Map$Entry");
        for (int i2 = 0; i2 < 23; ++i2) {
            i.super(map, "Function".concat(String.valueOf(i2)), o00000 + "/jvm/functions/Function" + i2);
            i.super(map, "reflect/KFunction".concat(String.valueOf(i2)), o00000 + "/reflect/KFunction");
        }
        String[] stringArray2 = new String[9];
        object22 = stringArray2;
        stringArray2[0] = "Char";
        object22[1] = "Byte";
        object22[2] = "Short";
        object22[3] = "Int";
        object22[4] = "Float";
        object22[5] = "Long";
        object22[6] = "Double";
        object22[7] = "String";
        object22[8] = "Enum";
        for (Object object22 : mc.new(object22)) {
            i.super(map, (String)object22 + ".Companion", o00000 + "/jvm/internal/" + (String)object22 + "CompanionObject");
        }
        Object = object;
    }
}

