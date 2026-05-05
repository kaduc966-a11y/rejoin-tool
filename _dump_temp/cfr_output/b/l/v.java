/*
 * Decompiled with CFR 0.152.
 */
package b.l;

import b.i;
import b.l.b;
import b.l.d;
import b.l.f;
import b.l.h;
import b.l.j;
import b.l.l;
import b.l.m;
import b.l.o;
import b.l.p;
import b.l.t;
import b.o.d.fc;
import b.s.mc;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
class v
extends l {
    public static final File o00000(String object, String string, File file) {
        object = File.createTempFile((String)object, string, file);
        ((File)object).delete();
        if (((File)object).mkdir()) {
            return object;
        }
        throw new IOException("Unable to create temporary directory " + object + '.');
    }

    public static /* synthetic */ File \u00d200000(String string, String string2, File file, int n2, Object object) {
        if ((n2 & 1) != 0) {
            string = "tmp";
        }
        if ((n2 & 2) != 0) {
            string2 = null;
        }
        if ((n2 & 4) != 0) {
            file = null;
        }
        return f.o00000(string, string2, file);
    }

    public static final File \u00d200000(String string, String string2, File file) {
        return File.createTempFile(string, string2, file);
    }

    public static /* synthetic */ File o00000(String string, String string2, File file, int n2, Object object) {
        if ((n2 & 1) != 0) {
            string = "tmp";
        }
        if ((n2 & 2) != 0) {
            string2 = null;
        }
        if ((n2 & 4) != 0) {
            file = null;
        }
        return f.\u00d200000(string, string2, file);
    }

    public static final String oO0000(File file) {
        return b.q.f.super(file.getName(), '.', "");
    }

    public static final String \u00f600000(File file) {
        if (File.separatorChar != '/') {
            return b.q.f.super(file.getPath(), File.separatorChar, '/', false, 4, null);
        }
        return file.getPath();
    }

    public static final String \u00f800000(File file) {
        return b.q.f.\u00d400000(file.getName(), ".", null, 2, null);
    }

    public static final String \u00d300000(File file, File file2) {
        String string = v.\u00d600000(file, file2);
        if (string == null) {
            throw new IllegalArgumentException("this and base files have different roots: " + file + " and " + file2 + '.');
        }
        return string;
    }

    public static final File \u00d800000(File file, File file2) {
        return new File(f.\u00d300000(file, file2));
    }

    public static final File \u00f500000(File object, File file) {
        String string = v.\u00d600000((File)object, file);
        if (string != null) {
            object = string;
            return new File((String)object);
        }
        return object;
    }

    public static final File null(File object, File file) {
        String string = v.\u00d600000((File)object, file);
        if (string != null) {
            object = string;
            return new File((String)object);
        }
        return null;
    }

    private static final String \u00d600000(File object, File object2) {
        int n2;
        object = v.o00000(f.\u00d300000((File)object));
        object2 = v.o00000(f.\u00d300000((File)object2));
        if (!fc.o00000((Object)((m)object).\u00d800000(), (Object)((m)object2).\u00d800000())) {
            return null;
        }
        int n3 = ((m)object2).\u00d500000();
        int n4 = ((m)object).\u00d500000();
        int n5 = Math.min(n4, n3);
        for (n2 = 0; n2 < n5 && fc.o00000(((m)object).String().get(n2), ((m)object2).String().get(n2)); ++n2) {
        }
        StringBuilder stringBuilder = new StringBuilder();
        int n6 = n3 - 1;
        if (n2 <= n6) {
            while (true) {
                if (fc.o00000((Object)((File)((m)object2).String().get(n6)).getName(), (Object)"..")) {
                    return null;
                }
                stringBuilder.append("..");
                if (n6 != n2) {
                    stringBuilder.append(File.separatorChar);
                }
                if (n6 == n2) break;
                --n6;
            }
        }
        if (n2 < n4) {
            if (n2 < n3) {
                stringBuilder.append(File.separatorChar);
            }
            mc.o00000(mc.new((Iterable)((m)object).String(), n2), stringBuilder, File.separator, null, null, 0, null, null, 124, null);
        }
        return stringBuilder.toString();
    }

    public static final File o00000(File object, File serializable, boolean bl, int n2) {
        block15: {
            block14: {
                if (!((File)object).exists()) {
                    throw new t((File)object, null, "The source file doesn't exist.", 2, null);
                }
                if (serializable.exists()) {
                    if (!bl) {
                        throw new p((File)object, (File)serializable, "The destination file already exists.");
                    }
                    if (!serializable.delete()) {
                        throw new p((File)object, (File)serializable, "Tried to overwrite the destination, but failed to delete it.");
                    }
                }
                if (!((File)object).isDirectory()) break block14;
                if (!serializable.mkdirs()) {
                    throw new j((File)object, (File)serializable, "Failed to create target directory.");
                }
                break block15;
            }
            File file = serializable.getParentFile();
            if (file != null) {
                file.mkdirs();
            }
            object = new FileInputStream((File)object);
            Throwable throwable = null;
            try {
                FileInputStream fileInputStream = (FileInputStream)object;
                Closeable closeable = new FileOutputStream((File)serializable);
                Throwable throwable2 = null;
                try {
                    FileOutputStream fileOutputStream = (FileOutputStream)closeable;
                    b.o00000(fileInputStream, fileOutputStream, n2);
                }
                catch (Throwable throwable3) {
                    try {
                        serializable = throwable3;
                        throwable2 = throwable3;
                        throw serializable;
                    }
                    catch (Throwable throwable4) {
                        o.o00000(closeable, throwable2);
                        throw throwable4;
                    }
                }
                o.o00000(closeable, null);
            }
            catch (Throwable throwable5) {
                try {
                    serializable = throwable5;
                    throwable = throwable5;
                    throw serializable;
                }
                catch (Throwable throwable6) {
                    o.o00000((Closeable)object, throwable);
                    throw throwable6;
                }
            }
            o.o00000((Closeable)object, null);
        }
        return serializable;
    }

    public static /* synthetic */ File o00000(File file, File file2, boolean bl, int n2, int n3, Object object) {
        if ((n3 & 2) != 0) {
            bl = false;
        }
        if ((n3 & 4) != 0) {
            n2 = 8192;
        }
        return f.o00000(file, file2, bl, n2);
    }

    public static final boolean o00000(File file, File file2, boolean bl, b.o.e.f f2) {
        if (!file.exists()) {
            return f2.o00000(file, new t(file, null, "The source file doesn't exist.", 2, null)) != h.\u00d400000;
        }
        try {
            Iterator iterator = f.\u00f500000(file).o00000((arg_0, arg_1) -> v.o00000(f2, arg_0, arg_1)).o00000();
            while (iterator.hasNext()) {
                File file3 = (File)iterator.next();
                if (!file3.exists()) {
                    if (f2.o00000(file3, new t(file3, null, "The source file doesn't exist.", 2, null)) != h.\u00d400000) continue;
                    return false;
                }
                Object object = f.\u00d300000(file3, file);
                if (!(!((File)(object = new File(file2, (String)object))).exists() || file3.isDirectory() && ((File)object).isDirectory())) {
                    boolean bl2 = !bl ? true : (((File)object).isDirectory() ? !f.for((File)object) : !((File)object).delete());
                    if (bl2) {
                        if (f2.o00000(object, new p(file3, (File)object, "The destination file already exists.")) != h.\u00d400000) continue;
                        return false;
                    }
                }
                if (file3.isDirectory()) {
                    ((File)object).mkdirs();
                    continue;
                }
                if (f.o00000(file3, (File)object, bl, 0, 4, null).length() == file3.length() || f2.o00000(file3, new IOException("Source file wasn't copied completely, length of destination file differs.")) != h.\u00d400000) continue;
                return false;
            }
            return true;
        }
        catch (d d2) {
            return false;
        }
    }

    public static /* synthetic */ boolean o00000(File file, File file2, boolean bl, b.o.e.f f2, int n2, Object object) {
        if ((n2 & 2) != 0) {
            bl = false;
        }
        if ((n2 & 4) != 0) {
            f2 = v::o00000;
        }
        return f.o00000(file, file2, bl, f2);
    }

    public static final boolean for(File object) {
        object = f.null((File)object);
        boolean bl = true;
        object = object.o00000();
        while (object.hasNext()) {
            Object e2 = object.next();
            File file = (File)e2;
            boolean bl2 = bl;
            bl = (file.delete() || !file.exists()) && bl2;
        }
        return bl;
    }

    public static final boolean o00000(File object, File object2) {
        object = f.\u00d300000((File)object);
        object2 = f.\u00d300000((File)object2);
        if (!fc.o00000((Object)((m)object).\u00d800000(), (Object)((m)object2).\u00d800000())) {
            return false;
        }
        if (((m)object).\u00d500000() < ((m)object2).\u00d500000()) {
            return false;
        }
        return ((Object)((m)object).String().subList(0, ((m)object2).\u00d500000())).equals(((m)object2).String());
    }

    public static final boolean \u00d200000(File file, String string) {
        return f.o00000(file, new File(string));
    }

    public static final boolean \u00d500000(File file, File file2) {
        m m2 = f.\u00d300000(file);
        m m3 = f.\u00d300000(file2);
        if (m3.\u00d600000()) {
            return fc.o00000((Object)file, (Object)file2);
        }
        int n2 = m2.\u00d500000() - m3.\u00d500000();
        if (n2 < 0) {
            return false;
        }
        return ((Object)m2.String().subList(n2, m2.\u00d500000())).equals(m3.String());
    }

    public static final boolean String(File file, String string) {
        return f.\u00d500000(file, new File(string));
    }

    public static final File \u00d2O0000(File object) {
        object = f.\u00d300000((File)object);
        return f.o00000(((m)object).\u00d800000(), mc.o00000(v.o00000(((m)object).String()), File.separator, null, null, 0, null, null, 62, null));
    }

    private static final m o00000(m m2) {
        return new m(m2.\u00d800000(), v.o00000(m2.String()));
    }

    private static final List o00000(List object) {
        List list = new ArrayList(object.size());
        object = object.iterator();
        while (object.hasNext()) {
            File file = (File)object.next();
            String string = file.getName();
            if (fc.o00000((Object)string, (Object)".")) {
                continue;
            }
            if (fc.o00000((Object)string, (Object)"..")) {
                if (!list.isEmpty() && !fc.o00000((Object)((File)mc.thissuper(list)).getName(), (Object)"..")) {
                    List list2 = list;
                    Comparable cfr_ignored_0 = (Comparable)list2.remove(list2.size() - 1);
                    continue;
                }
                Comparable cfr_ignored_1 = Boolean.valueOf(list.add(file));
                continue;
            }
            Boolean.valueOf(list.add(file));
        }
        return list;
    }

    public static final File \u00d200000(File object, File file) {
        if (f.String(file)) {
            return file;
        }
        if (((CharSequence)(object = ((File)object).toString())).length() == 0 || b.q.f.\u00d200000((CharSequence)object, File.separatorChar, false, 2, null)) {
            return new File((String)object + file);
        }
        return new File((String)object + File.separatorChar + file);
    }

    public static final File o00000(File file, String string) {
        return f.\u00d200000(file, new File(string));
    }

    public static final File String(File object, File file) {
        File file2 = ((m)(object = f.\u00d300000((File)object))).\u00d500000() == 0 ? new File("..") : ((m)object).o00000(0, ((m)object).\u00d500000() - 1);
        return f.\u00d200000(f.\u00d200000(((m)object).\u00d800000(), file2), file);
    }

    public static final File \u00d300000(File file, String string) {
        return f.String(file, new File(string));
    }

    private static final h o00000(File file, IOException iOException) {
        throw iOException;
    }

    private static final i o00000(b.o.e.f f2, File file, IOException iOException) {
        if (f2.o00000(file, iOException) == h.\u00d400000) {
            throw new d(file);
        }
        return i.o00000;
    }
}

