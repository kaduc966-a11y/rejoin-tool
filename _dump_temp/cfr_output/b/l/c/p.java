/*
 * Decompiled with CFR 0.152.
 */
package b.l.c;

import b.g.n;
import b.l.c.d;
import b.l.c.o;
import b.l.c.r;
import b.l.c.s;
import b.l.c.t;
import b.l.c.v;
import b.o.d.fc;
import b.o.d.tc;
import b.o.e.g;
import b.q.f;
import b.s.mc;
import b.s.ub;
import b.xc;
import java.io.Closeable;
import java.io.IOException;
import java.net.URI;
import java.nio.file.CopyOption;
import java.nio.file.DirectoryStream;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.FileStore;
import java.nio.file.FileVisitOption;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.FileAttributeView;
import java.nio.file.attribute.FileTime;
import java.nio.file.attribute.UserPrincipal;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
class p
extends t {
    public static final String \u00d800000(Path path) {
        Path path2 = path.getFileName();
        String string = path2 != null ? ((Object)path2).toString() : null;
        if (string == null) {
            string = "";
        }
        return string;
    }

    public static /* synthetic */ void OO0000(Path path) {
    }

    public static final String oo0000(Path path) {
        Object object = path.getFileName();
        if (object == null || (object = object.toString()) == null || (object = f.\u00d400000((String)object, ".", null, 2, null)) == null) {
            object = "";
        }
        return object;
    }

    public static /* synthetic */ void \u00d3o0000(Path path) {
    }

    public static final String \u00f500000(Path path) {
        Object object = path.getFileName();
        if (object == null || (object = object.toString()) == null || (object = f.super((String)object, '.', "")) == null) {
            object = "";
        }
        return object;
    }

    public static /* synthetic */ void \u00f400000(Path path) {
    }

    private static final String Oo0000(Path path) {
        return ((Object)path).toString();
    }

    public static /* synthetic */ void nullsuper(Path path) {
    }

    public static final String \u00d5O0000(Path path) {
        String string = path.getFileSystem().getSeparator();
        if (!fc.o00000((Object)string, (Object)"/")) {
            return f.super(((Object)path).toString(), string, "/", false, 4, null);
        }
        return ((Object)path).toString();
    }

    public static /* synthetic */ void \u00f5O0000(Path path) {
    }

    private static final String \u00d4O0000(Path path) {
        return r.\u00d5O0000(path);
    }

    public static /* synthetic */ void \u00f4O0000(Path path) {
    }

    private static final Path thissuper(Path path) {
        return path.toAbsolutePath();
    }

    private static final String Stringsuper(Path path) {
        return ((Object)path.toAbsolutePath()).toString();
    }

    public static final Path return(Path path, Path path2) {
        Path path3;
        try {
            path3 = o.new.o00000(path, path2);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw new IllegalArgumentException(illegalArgumentException.getMessage() + "\nthis path: " + path + "\nbase path: " + path2, illegalArgumentException);
        }
        return path3;
    }

    public static final Path \u00d500000(Path path, Path path2) {
        Path path3 = r.\u00d800000(path, path2);
        if (path3 == null) {
            path3 = path;
        }
        return path3;
    }

    public static final Path \u00d800000(Path path, Path path2) {
        try {
            path = o.new.o00000(path, path2);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            path = null;
        }
        return path;
    }

    private static final Path o00000(Path path, Path path2, boolean bl) throws IOException {
        CopyOption[] copyOptionArray;
        CopyOption[] copyOptionArray2;
        if (bl) {
            CopyOption[] copyOptionArray3 = new CopyOption[1];
            copyOptionArray2 = copyOptionArray3;
            copyOptionArray3[0] = StandardCopyOption.REPLACE_EXISTING;
            copyOptionArray = copyOptionArray2;
        } else {
            copyOptionArray = new CopyOption[]{};
        }
        copyOptionArray2 = copyOptionArray;
        return Files.copy(path, path2, Arrays.copyOf(copyOptionArray2, copyOptionArray2.length));
    }

    static /* synthetic */ Path new(Path path, Path path2, boolean bl, int n2, Object copyOptionArray) throws IOException {
        CopyOption[] copyOptionArray2;
        if ((n2 & 2) != 0) {
            bl = false;
        }
        if (bl) {
            CopyOption[] copyOptionArray3 = new CopyOption[1];
            copyOptionArray = copyOptionArray3;
            copyOptionArray3[0] = StandardCopyOption.REPLACE_EXISTING;
            copyOptionArray2 = copyOptionArray;
        } else {
            copyOptionArray2 = new CopyOption[]{};
        }
        CopyOption[] copyOptionArray4 = copyOptionArray2;
        return Files.copy(path, path2, Arrays.copyOf(copyOptionArray4, copyOptionArray4.length));
    }

    private static final Path o00000(Path path, Path path2, CopyOption ... copyOptionArray) throws IOException {
        return Files.copy(path, path2, Arrays.copyOf(copyOptionArray, copyOptionArray.length));
    }

    private static final boolean new(Path path, LinkOption ... linkOptionArray) {
        return Files.exists(path, Arrays.copyOf(linkOptionArray, linkOptionArray.length));
    }

    private static final boolean if(Path path, LinkOption ... linkOptionArray) {
        return Files.notExists(path, Arrays.copyOf(linkOptionArray, linkOptionArray.length));
    }

    private static final boolean \u00f400000(Path path, LinkOption ... linkOptionArray) {
        return Files.isRegularFile(path, Arrays.copyOf(linkOptionArray, linkOptionArray.length));
    }

    private static final boolean \u00d300000(Path path, LinkOption ... linkOptionArray) {
        return Files.isDirectory(path, Arrays.copyOf(linkOptionArray, linkOptionArray.length));
    }

    private static final boolean return(Path path) {
        return Files.isSymbolicLink(path);
    }

    private static final boolean \u00f8O0000(Path path) {
        return Files.isExecutable(path);
    }

    private static final boolean \u00d3O0000(Path path) throws IOException {
        return Files.isHidden(path);
    }

    private static final boolean if(Path path) {
        return Files.isReadable(path);
    }

    private static final boolean \u00d8O0000(Path path) {
        return Files.isWritable(path);
    }

    private static final boolean \u00d300000(Path path, Path path2) throws IOException {
        return Files.isSameFile(path, path2);
    }

    public static final List new(Path object, String object2) throws IOException {
        List list;
        object = Files.newDirectoryStream((Path)object, (String)object2);
        object2 = null;
        try {
            list = mc.\u00f5O0000((DirectoryStream)object);
        }
        catch (Throwable throwable) {
            try {
                Throwable throwable2 = throwable;
                object2 = throwable;
                throw throwable2;
            }
            catch (Throwable throwable3) {
                b.l.o.o00000((Closeable)object, (Throwable)object2);
                throw throwable3;
            }
        }
        b.l.o.o00000((Closeable)object, null);
        return list;
    }

    public static /* synthetic */ List o00000(Path path, String string, int n2, Object object) throws IOException {
        if ((n2 & 1) != 0) {
            string = "*";
        }
        return r.new(path, string);
    }

    private static final Object new(Path object, String object2, g object3) throws IOException {
        Object object4;
        object = Files.newDirectoryStream((Path)object, (String)object2);
        object2 = null;
        try {
            object4 = (DirectoryStream)object;
            object4 = object3.\u00f800000(mc.\u00d5o0000((Iterable)object4));
        }
        catch (Throwable throwable) {
            try {
                object3 = throwable;
                object2 = throwable;
                throw object3;
            }
            catch (Throwable throwable2) {
                tc.Object(1);
                b.l.o.o00000((Closeable)object, (Throwable)object2);
                tc.o00000(1);
                throw throwable2;
            }
        }
        tc.Object(1);
        b.l.o.o00000((Closeable)object, null);
        tc.o00000(1);
        return object4;
    }

    static /* synthetic */ Object new(Path object, String string, g g2, int n2, Object object2) throws IOException {
        if ((n2 & 1) != 0) {
            string = "*";
        }
        Closeable closeable = Files.newDirectoryStream((Path)object, string);
        object2 = null;
        try {
            object = (DirectoryStream)closeable;
            object = g2.\u00f800000(mc.\u00d5o0000((Iterable)object));
        }
        catch (Throwable throwable) {
            try {
                object = throwable;
                object2 = throwable;
                throw object;
            }
            catch (Throwable throwable2) {
                tc.Object(1);
                b.l.o.o00000(closeable, (Throwable)object2);
                tc.o00000(1);
                throw throwable2;
            }
        }
        tc.Object(1);
        b.l.o.o00000(closeable, null);
        tc.o00000(1);
        return object;
    }

    private static final void o00000(Path object, String object2, g object3) throws IOException {
        object = Files.newDirectoryStream((Path)object, (String)object2);
        object2 = null;
        try {
            for (Object t2 : (Iterable)((DirectoryStream)object)) {
                object3.\u00f800000(t2);
            }
        }
        catch (Throwable throwable) {
            try {
                object3 = throwable;
                object2 = throwable;
                throw object3;
            }
            catch (Throwable throwable2) {
                tc.Object(1);
                b.l.o.o00000((Closeable)object, (Throwable)object2);
                tc.o00000(1);
                throw throwable2;
            }
        }
        tc.Object(1);
        b.l.o.o00000((Closeable)object, null);
        tc.o00000(1);
        return;
    }

    static /* synthetic */ void o00000(Path iterator, String string2, g g2, int n2, Object object) throws IOException {
        if ((n2 & 1) != 0) {
            string2 = "*";
        }
        Closeable closeable = Files.newDirectoryStream((Path)((Object)iterator), string2);
        object = null;
        try {
            for (String string2 : (Iterable)((DirectoryStream)closeable)) {
                g2.\u00f800000(string2);
            }
        }
        catch (Throwable throwable) {
            try {
                iterator = throwable;
                object = throwable;
                throw iterator;
            }
            catch (Throwable throwable2) {
                tc.Object(1);
                b.l.o.o00000(closeable, (Throwable)object);
                tc.o00000(1);
                throw throwable2;
            }
        }
        tc.Object(1);
        b.l.o.o00000(closeable, null);
        tc.o00000(1);
        return;
    }

    private static final long \u00d500000(Path path) throws IOException {
        return Files.size(path);
    }

    private static final void \u00d4o0000(Path path) throws IOException {
        Files.delete(path);
    }

    private static final boolean \u00f800000(Path path) throws IOException {
        return Files.deleteIfExists(path);
    }

    private static final Path new(Path path, FileAttribute ... fileAttributeArray) throws IOException {
        return Files.createDirectory(path, Arrays.copyOf(fileAttributeArray, fileAttributeArray.length));
    }

    private static final Path o00000(Path path, FileAttribute ... fileAttributeArray) throws IOException {
        return Files.createDirectories(path, Arrays.copyOf(fileAttributeArray, fileAttributeArray.length));
    }

    public static final Path \u00d400000(Path path, FileAttribute ... fileAttributeArray) throws IOException {
        block4: {
            Path path2 = path.getParent();
            if (path2 != null) {
                LinkOption[] linkOptionArray = new LinkOption[]{};
                if (!Files.isDirectory(path2, Arrays.copyOf(linkOptionArray, linkOptionArray.length))) {
                    try {
                        FileAttribute[] fileAttributeArray2 = Arrays.copyOf(fileAttributeArray, fileAttributeArray.length);
                        Files.createDirectories(path2, Arrays.copyOf(fileAttributeArray2, fileAttributeArray2.length));
                    }
                    catch (FileAlreadyExistsException fileAlreadyExistsException) {
                        LinkOption[] linkOptionArray2 = new LinkOption[]{};
                        if (Files.isDirectory(path2, Arrays.copyOf(linkOptionArray2, linkOptionArray2.length))) break block4;
                        throw fileAlreadyExistsException;
                    }
                }
            }
        }
        return path;
    }

    private static final Path new(Path path, Path path2, CopyOption ... copyOptionArray) throws IOException {
        return Files.move(path, path2, Arrays.copyOf(copyOptionArray, copyOptionArray.length));
    }

    private static final Path new(Path path, Path path2, boolean bl) throws IOException {
        CopyOption[] copyOptionArray;
        CopyOption[] copyOptionArray2;
        if (bl) {
            CopyOption[] copyOptionArray3 = new CopyOption[1];
            copyOptionArray2 = copyOptionArray3;
            copyOptionArray3[0] = StandardCopyOption.REPLACE_EXISTING;
            copyOptionArray = copyOptionArray2;
        } else {
            copyOptionArray = new CopyOption[]{};
        }
        copyOptionArray2 = copyOptionArray;
        return Files.move(path, path2, Arrays.copyOf(copyOptionArray2, copyOptionArray2.length));
    }

    static /* synthetic */ Path o00000(Path path, Path path2, boolean bl, int n2, Object copyOptionArray) throws IOException {
        CopyOption[] copyOptionArray2;
        if ((n2 & 2) != 0) {
            bl = false;
        }
        if (bl) {
            CopyOption[] copyOptionArray3 = new CopyOption[1];
            copyOptionArray = copyOptionArray3;
            copyOptionArray3[0] = StandardCopyOption.REPLACE_EXISTING;
            copyOptionArray2 = copyOptionArray;
        } else {
            copyOptionArray2 = new CopyOption[]{};
        }
        CopyOption[] copyOptionArray4 = copyOptionArray2;
        return Files.move(path, path2, Arrays.copyOf(copyOptionArray4, copyOptionArray4.length));
    }

    private static final FileStore while(Path path) throws IOException {
        return Files.getFileStore(path);
    }

    private static final Object o00000(Path path, String string, LinkOption ... linkOptionArray) throws IOException {
        return Files.getAttribute(path, string, Arrays.copyOf(linkOptionArray, linkOptionArray.length));
    }

    private static final Path o00000(Path path, String string, Object object, LinkOption ... linkOptionArray) throws IOException {
        return Files.setAttribute(path, string, object, Arrays.copyOf(linkOptionArray, linkOptionArray.length));
    }

    private static final /* synthetic */ FileAttributeView \u00d500000(Path path, LinkOption ... linkOptionArray) {
        fc.o00000(4, "V");
        return Files.getFileAttributeView(path, FileAttributeView.class, Arrays.copyOf(linkOptionArray, linkOptionArray.length));
    }

    private static final /* synthetic */ FileAttributeView \u00d400000(Path path, LinkOption ... linkOptionArray) {
        fc.o00000(4, "V");
        FileAttributeView fileAttributeView = Files.getFileAttributeView(path, FileAttributeView.class, Arrays.copyOf(linkOptionArray, linkOptionArray.length));
        if (fileAttributeView != null) {
            return fileAttributeView;
        }
        fc.o00000(4, "V");
        r.o00000(path, FileAttributeView.class);
        throw new xc();
    }

    public static final Void o00000(Path path, Class clazz) {
        throw new UnsupportedOperationException("The desired attribute view type " + clazz + " is not available for the file " + path + '.');
    }

    private static final /* synthetic */ BasicFileAttributes o00000(Path path, LinkOption ... linkOptionArray) throws IOException {
        fc.o00000(4, "A");
        return Files.readAttributes(path, BasicFileAttributes.class, Arrays.copyOf(linkOptionArray, linkOptionArray.length));
    }

    private static final Map new(Path path, String string, LinkOption ... linkOptionArray) throws IOException {
        return Files.readAttributes(path, string, Arrays.copyOf(linkOptionArray, linkOptionArray.length));
    }

    private static final FileTime \u00f500000(Path path, LinkOption ... linkOptionArray) throws IOException {
        return Files.getLastModifiedTime(path, Arrays.copyOf(linkOptionArray, linkOptionArray.length));
    }

    private static final Path o00000(Path path, FileTime fileTime) throws IOException {
        return Files.setLastModifiedTime(path, fileTime);
    }

    private static final UserPrincipal return(Path path, LinkOption ... linkOptionArray) throws IOException {
        return Files.getOwner(path, Arrays.copyOf(linkOptionArray, linkOptionArray.length));
    }

    private static final Path o00000(Path path, UserPrincipal userPrincipal) throws IOException {
        return Files.setOwner(path, userPrincipal);
    }

    private static final Set \u00d800000(Path path, LinkOption ... linkOptionArray) throws IOException {
        return Files.getPosixFilePermissions(path, Arrays.copyOf(linkOptionArray, linkOptionArray.length));
    }

    private static final Path o00000(Path path, Set set) throws IOException {
        return Files.setPosixFilePermissions(path, set);
    }

    private static final Path new(Path path, Path path2) throws IOException {
        return Files.createLink(path, path2);
    }

    private static final Path o00000(Path path, Path path2, FileAttribute ... fileAttributeArray) throws IOException {
        return Files.createSymbolicLink(path, path2, Arrays.copyOf(fileAttributeArray, fileAttributeArray.length));
    }

    private static final Path oO0000(Path path) throws IOException {
        return Files.readSymbolicLink(path);
    }

    private static final Path \u00d300000(Path path, FileAttribute ... fileAttributeArray) throws IOException {
        return Files.createFile(path, Arrays.copyOf(fileAttributeArray, fileAttributeArray.length));
    }

    private static final Path o00000(String string, String string2, FileAttribute ... fileAttributeArray) throws IOException {
        return Files.createTempFile(string, string2, Arrays.copyOf(fileAttributeArray, fileAttributeArray.length));
    }

    static /* synthetic */ Path o00000(String string, String string2, FileAttribute[] fileAttributeArray, int n2, Object object) throws IOException {
        if ((n2 & 1) != 0) {
            string = null;
        }
        if ((n2 & 2) != 0) {
            string2 = null;
        }
        return Files.createTempFile(string, string2, Arrays.copyOf(fileAttributeArray, fileAttributeArray.length));
    }

    public static final Path o00000(Path path, String string, String string2, FileAttribute ... fileAttributeArray) throws IOException {
        if (path != null) {
            return Files.createTempFile(path, string, string2, Arrays.copyOf(fileAttributeArray, fileAttributeArray.length));
        }
        return Files.createTempFile(string, string2, Arrays.copyOf(fileAttributeArray, fileAttributeArray.length));
    }

    public static /* synthetic */ Path o00000(Path path, String string, String string2, FileAttribute[] fileAttributeArray, int n2, Object object) throws IOException {
        if ((n2 & 2) != 0) {
            string = null;
        }
        if ((n2 & 4) != 0) {
            string2 = null;
        }
        return r.o00000(path, string, string2, fileAttributeArray);
    }

    private static final Path o00000(String string, FileAttribute ... fileAttributeArray) throws IOException {
        return Files.createTempDirectory(string, Arrays.copyOf(fileAttributeArray, fileAttributeArray.length));
    }

    static /* synthetic */ Path o00000(String string, FileAttribute[] fileAttributeArray, int n2, Object object) throws IOException {
        if ((n2 & 1) != 0) {
            string = null;
        }
        return Files.createTempDirectory(string, Arrays.copyOf(fileAttributeArray, fileAttributeArray.length));
    }

    public static final Path o00000(Path path, String string, FileAttribute ... fileAttributeArray) throws IOException {
        if (path != null) {
            return Files.createTempDirectory(path, string, Arrays.copyOf(fileAttributeArray, fileAttributeArray.length));
        }
        return Files.createTempDirectory(string, Arrays.copyOf(fileAttributeArray, fileAttributeArray.length));
    }

    public static /* synthetic */ Path o00000(Path path, String string, FileAttribute[] fileAttributeArray, int n2, Object object) throws IOException {
        if ((n2 & 2) != 0) {
            string = null;
        }
        return r.o00000(path, string, fileAttributeArray);
    }

    private static final Path \u00d400000(Path path, Path path2) {
        return path.resolve(path2);
    }

    private static final Path o00000(Path path, String string) {
        return path.resolve(string);
    }

    private static final Path o00000(String string) {
        return Paths.get(string, new String[0]);
    }

    private static final Path o00000(String string, String ... stringArray) {
        return Paths.get(string, Arrays.copyOf(stringArray, stringArray.length));
    }

    private static final Path o00000(URI uRI) {
        return Paths.get(uRI);
    }

    public static final n o00000(Path path, v ... vArray) {
        return new s(path, vArray);
    }

    public static final void o00000(Path path, FileVisitor fileVisitor, int n2, boolean bl) {
        Set set = bl ? ub.super((Object)FileVisitOption.FOLLOW_LINKS) : ub.\u00d300000();
        Files.walkFileTree(path, set, n2, fileVisitor);
    }

    public static /* synthetic */ void o00000(Path path, FileVisitor fileVisitor, int n2, boolean bl, int n3, Object object) {
        if ((n3 & 2) != 0) {
            n2 = Integer.MAX_VALUE;
        }
        if ((n3 & 4) != 0) {
            bl = false;
        }
        r.o00000(path, fileVisitor, n2, bl);
    }

    public static final void o00000(Path path, int n2, boolean bl, g g2) {
        r.o00000(path, r.o00000(g2), n2, bl);
    }

    public static /* synthetic */ void o00000(Path path, int n2, boolean bl, g g2, int n3, Object object) {
        if ((n3 & 1) != 0) {
            n2 = Integer.MAX_VALUE;
        }
        if ((n3 & 2) != 0) {
            bl = false;
        }
        r.o00000(path, n2, bl, g2);
    }

    public static final FileVisitor o00000(g g2) {
        d d2 = new d();
        g2.\u00f800000(d2);
        return d2.o00000();
    }
}

