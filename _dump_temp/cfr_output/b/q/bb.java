/*
 * Decompiled with CFR 0.152.
 */
package b.q;

import b.g.c;
import b.o.e.g;
import b.q.f;
import b.q.h;
import b.q.z;
import b.s.mc;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class bb
extends z {
    public static final String \u00d400000(String string, String string2) {
        return f.super(string, "", string2);
    }

    public static /* synthetic */ String \u00d200000(String string, String string2, int n2, Object object) {
        if ((n2 & 1) != 0) {
            string2 = "|";
        }
        return f.\u00d400000(string, string2);
    }

    public static final String super(String string, String object, String string2) {
        if (!(!f.\u00f800000(string2))) {
            String string3 = "marginPrefix must be non-blank string.";
            throw new IllegalArgumentException(string3.toString());
        }
        List list = f.\u00f600000(string);
        Object object2 = list;
        int n2 = string.length() + ((String)object).length() * list.size();
        object = bb.\u00d200000((String)object);
        int n3 = mc.\u00d300000((List)object2);
        object2 = (Iterable)object2;
        Collection collection = new ArrayList();
        int n4 = 0;
        object2 = object2.iterator();
        while (object2.hasNext()) {
            String string4;
            int n5;
            Object object3 = object2.next();
            if ((n5 = n4++) < 0) {
                mc.\u00d800000();
            }
            object3 = (String)object3;
            if ((n5 == 0 || n5 == n3) && f.\u00f800000((CharSequence)object3)) {
                string4 = null;
            } else {
                String string5;
                int n6;
                int n7;
                CharSequence charSequence;
                Object object4;
                block9: {
                    object4 = object3;
                    charSequence = (CharSequence)object4;
                    int n8 = charSequence.length();
                    for (n7 = 0; n7 < n8; ++n7) {
                        if (!(!h.for(charSequence.charAt(n7)))) continue;
                        n6 = n7;
                        break block9;
                    }
                    n6 = n7 = -1;
                }
                if (n6 != -1 && f.super(object4, string2, n7, false, 4, null)) {
                    charSequence = object4;
                    int n9 = n7 + string2.length();
                    string5 = ((String)charSequence).substring(n9);
                } else {
                    string5 = string4 = null;
                }
                if (string5 == null || (string4 = (String)object.\u00f800000(string4)) == null) {
                    string4 = (String)object3;
                }
            }
            if (string4 == null) continue;
            object3 = string4;
            collection.add(object3);
        }
        return ((StringBuilder)mc.o00000((List)collection, new StringBuilder(n2), "\n", null, null, 0, null, null, 124, null)).toString();
    }

    public static /* synthetic */ String super(String string, String string2, String string3, int n2, Object object) {
        if ((n2 & 1) != 0) {
            string2 = "";
        }
        if ((n2 & 2) != 0) {
            string3 = "|";
        }
        return f.super(string, string2, string3);
    }

    public static final String \u00d400000(String string) {
        return f.class(string, "");
    }

    public static final String class(String object, String iterator) {
        Object object2;
        Object object3;
        List list = f.\u00f600000((CharSequence)object);
        Iterator iterator2 = list;
        Collection collection = new ArrayList();
        iterator2 = iterator2.iterator();
        while (iterator2.hasNext()) {
            object3 = iterator2.next();
            if (!(!f.\u00f800000((String)object3))) continue;
            collection.add(object3);
        }
        Iterable iterable = (List)collection;
        iterator2 = iterable;
        collection = new ArrayList(mc.o00000(iterable, 10));
        iterator2 = iterator2.iterator();
        while (iterator2.hasNext()) {
            object3 = iterator2.next();
            object2 = (String)object3;
            object3 = collection;
            object3.add(bb.\u00d300000((String)object2));
        }
        Integer n2 = (Integer)mc.\u00d8\u00d20000((List)collection);
        int n3 = n2 != null ? n2 : 0;
        object3 = list;
        int n4 = ((String)object).length() + ((String)((Object)iterator)).length() * list.size();
        object = bb.\u00d200000((String)((Object)iterator));
        int n5 = mc.\u00d300000(object3);
        object3 = (Iterable)object3;
        object2 = new ArrayList();
        iterator = object3;
        int n6 = 0;
        iterator = iterator.iterator();
        while (iterator.hasNext()) {
            Object object4;
            int n7;
            object3 = iterator.next();
            if ((n7 = n6++) < 0) {
                mc.\u00d800000();
            }
            object3 = (String)object3;
            if ((n7 == 0 || n7 == n5) && f.\u00f800000((CharSequence)object3)) {
                object4 = null;
            } else {
                object4 = f.\u00d6O0000(object3, n3);
                if (object4 == null || (object4 = (String)object.\u00f800000(object4)) == null) {
                    object4 = object3;
                }
            }
            if (object4 == null) continue;
            object3 = object4;
            object2.add(object3);
        }
        return ((StringBuilder)mc.o00000((List)object2, new StringBuilder(n4), "\n", null, null, 0, null, null, 124, null)).toString();
    }

    public static /* synthetic */ String super(String string, String string2, int n2, Object object) {
        if ((n2 & 1) != 0) {
            string2 = "";
        }
        return f.class(string, string2);
    }

    public static final String \u00d300000(String string, String string2) {
        return c.o00000(c.\u00f5\u00d30000(f.\u00d800000(string), arg_0 -> bb.\u00d200000(string2, arg_0)), "\n", null, null, 0, null, null, 62, null);
    }

    public static /* synthetic */ String \u00d300000(String string, String string2, int n2, Object object) {
        if ((n2 & 1) != 0) {
            string2 = "    ";
        }
        return f.\u00d300000(string, string2);
    }

    private static final int \u00d300000(String string) {
        int n2;
        int n3;
        block2: {
            CharSequence charSequence = string;
            int n4 = charSequence.length();
            for (int i2 = 0; i2 < n4; ++i2) {
                if (!(!h.for(charSequence.charAt(i2)))) continue;
                n3 = i2;
                break block2;
            }
            n3 = n2 = -1;
        }
        if (n3 == -1) {
            return string.length();
        }
        return n2;
    }

    private static final g \u00d200000(String string) {
        if (((CharSequence)string).length() == 0) {
            return bb::super;
        }
        return arg_0 -> bb.super(string, arg_0);
    }

    private static final String super(List object, int n2, g g2, g g3) {
        int n3 = mc.\u00d300000((List)object);
        object = (Iterable)object;
        Collection collection = new ArrayList();
        int n4 = 0;
        object = object.iterator();
        while (object.hasNext()) {
            String string;
            int n5;
            Object object2 = object.next();
            if ((n5 = n4++) < 0) {
                mc.\u00d800000();
            }
            object2 = (String)object2;
            if ((n5 == 0 || n5 == n3) && f.\u00f800000((CharSequence)object2)) {
                string = null;
            } else {
                string = (String)g3.\u00f800000(object2);
                if (string == null || (string = (String)g2.\u00f800000(string)) == null) {
                    string = object2;
                }
            }
            if (string == null) continue;
            object2 = string;
            collection.add(object2);
        }
        return ((StringBuilder)mc.o00000((List)collection, new StringBuilder(n2), "\n", null, null, 0, null, null, 124, null)).toString();
    }

    private static final String \u00d200000(String string, String string2) {
        if (f.\u00f800000(string2)) {
            if (string2.length() < string.length()) {
                return string;
            }
            return string2;
        }
        return string + string2;
    }

    private static final String super(String string) {
        return string;
    }

    private static final String super(String string, String string2) {
        return string + string2;
    }
}

