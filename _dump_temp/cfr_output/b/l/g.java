/*
 * Decompiled with CFR 0.152.
 */
package b.l;

import b.l.f;
import b.l.m;
import b.s.mc;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

class g {
    private static final int o00000(String string) {
        int n2 = b.q.f.super((CharSequence)string, File.separatorChar, 0, false, 4, null);
        if (n2 == 0) {
            if (string.length() > 1 && string.charAt(1) == File.separatorChar && (n2 = b.q.f.super((CharSequence)string, File.separatorChar, 2, false, 4, null)) >= 0) {
                if ((n2 = b.q.f.super((CharSequence)string, File.separatorChar, n2 + 1, false, 4, null)) >= 0) {
                    return n2 + 1;
                }
                return string.length();
            }
            return 1;
        }
        if (n2 > 0 && string.charAt(n2 - 1) == ':') {
            return ++n2;
        }
        if (n2 == -1 && b.q.f.\u00d200000((CharSequence)string, ':', false, 2, null)) {
            return string.length();
        }
        return 0;
    }

    public static final String \u00d200000(File file) {
        String string = file.getPath();
        int n2 = g.o00000(file.getPath());
        return string.substring(0, n2);
    }

    public static final File o00000(File file) {
        return new File(f.\u00d200000(file));
    }

    public static final boolean String(File file) {
        return g.o00000(file.getPath()) > 0;
    }

    public static final m \u00d300000(File object) {
        List list;
        object = ((File)object).getPath();
        int n2 = g.o00000((String)object);
        String string = ((String)object).substring(0, n2);
        String string2 = ((String)object).substring(n2);
        if (((CharSequence)string2).length() == 0) {
            list = mc.\u00d500000();
        } else {
            char[] cArray = new char[1];
            object = cArray;
            cArray[0] = File.separatorChar;
            Object object2 = object = (Iterable)b.q.f.super((CharSequence)string2, (char[])object, false, 0, 6, null);
            object = new ArrayList(mc.o00000((Iterable)object, 10));
            object2 = object2.iterator();
            while (object2.hasNext()) {
                string2 = object2.next();
                Object object3 = object;
                object3.add(new File(string2));
            }
            list = (List)object;
        }
        object = list;
        return new m(new File(string), (List)object);
    }

    public static final File o00000(File file, int n2, int n3) {
        return f.\u00d300000(file).o00000(n2, n3);
    }
}

