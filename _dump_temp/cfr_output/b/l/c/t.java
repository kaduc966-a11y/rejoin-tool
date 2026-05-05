/*
 * Decompiled with CFR 0.152.
 */
package b.l.c;

import b.l.c.f;
import b.l.c.g;
import b.l.c.h;
import b.l.c.i;
import b.l.c.j;
import b.l.c.l;
import b.l.c.m;
import b.l.c.n;
import b.l.c.r;
import b.l.c.t$_b;
import b.l.c.t$_c$5$2;
import b.l.c.t$_c$5$3;
import b.l.c.u;
import b.o;
import b.o.d.b;
import b.o.d.fc;
import b.o.e.e;
import b.qd;
import b.s.mc;
import java.io.Closeable;
import java.io.IOException;
import java.nio.file.CopyOption;
import java.nio.file.DirectoryStream;
import java.nio.file.FileSystemException;
import java.nio.file.FileSystemLoopException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.SecureDirectoryStream;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
class t
extends l {
    public static final Path o00000(Path path, Path path2, e e2, boolean bl, boolean bl2) {
        if (bl2) {
            boolean bl3 = bl;
            return r.o00000(path, path2, e2, bl3, (arg_0, arg_1, arg_2) -> t.o00000(bl3, arg_0, arg_1, arg_2));
        }
        return r.o00000(path, path2, e2, bl, null, 8, null);
    }

    public static /* synthetic */ Path o00000(Path path, Path path2, e e2, boolean bl, boolean bl2, int n2, Object object) {
        if ((n2 & 2) != 0) {
            e2 = t::new;
        }
        return r.o00000(path, path2, e2, bl, bl2);
    }

    public static final Path o00000(Path path, Path path2, e e2, boolean bl, e e3) {
        Path path3 = path;
        LinkOption[] linkOptionArray = g.\u00d400000.\u00d200000(bl);
        Object object = Arrays.copyOf(linkOptionArray, linkOptionArray.length);
        if (!Files.exists(path3, Arrays.copyOf(object, ((LinkOption[])object).length))) {
            throw new NoSuchFileException(((Object)path).toString(), ((Object)path2).toString(), "The source file doesn't exist.");
        }
        LinkOption[] linkOptionArray2 = new LinkOption[]{};
        if (Files.exists(path, Arrays.copyOf(linkOptionArray2, linkOptionArray2.length)) && (bl || !Files.isSymbolicLink(path))) {
            LinkOption[] linkOptionArray3 = new LinkOption[]{};
            boolean bl2 = Files.exists(path2, Arrays.copyOf(linkOptionArray3, linkOptionArray3.length)) && !Files.isSymbolicLink(path2);
            if (!bl2 || !Files.isSameFile(path, path2)) {
                boolean bl3;
                if (!fc.o00000((Object)path.getFileSystem(), (Object)path2.getFileSystem())) {
                    bl3 = false;
                } else if (bl2) {
                    bl3 = path2.toRealPath(new LinkOption[0]).startsWith(path.toRealPath(new LinkOption[0]));
                } else {
                    Path path4 = path2.getParent();
                    if (path4 != null) {
                        Path path5 = path4;
                        LinkOption[] linkOptionArray4 = new LinkOption[]{};
                        bl3 = Files.exists(path4, Arrays.copyOf(linkOptionArray4, linkOptionArray4.length)) && path5.toRealPath(new LinkOption[0]).startsWith(path.toRealPath(new LinkOption[0]));
                    } else {
                        bl3 = false;
                    }
                }
                if (bl3) {
                    throw new FileSystemException(((Object)path).toString(), ((Object)path2).toString(), "Recursively copying a directory into its subdirectory is prohibited.");
                }
            }
        }
        path3 = path2.normalize();
        object = new ArrayList();
        r.o00000(path, 0, bl, arg_0 -> t.o00000((ArrayList)object, e3, path, path2, path3, e2, arg_0), 1, null);
        return path2;
    }

    public static /* synthetic */ Path o00000(Path path, Path path2, e e2, boolean bl, e e3, int n2, Object object) {
        if ((n2 & 2) != 0) {
            e2 = t::o00000;
        }
        if ((n2 & 8) != 0) {
            e3 = (arg_0, arg_1, arg_2) -> t.new(bl, arg_0, arg_1, arg_2);
        }
        return r.o00000(path, path2, e2, bl, e3);
    }

    private static final FileVisitResult o00000(m m2) {
        switch (t$_b.\u00d200000[m2.ordinal()]) {
            case 1: {
                return FileVisitResult.CONTINUE;
            }
            case 2: {
                return FileVisitResult.TERMINATE;
            }
            case 3: {
                return FileVisitResult.SKIP_SUBTREE;
            }
        }
        throw new qd();
    }

    private static final FileVisitResult o00000(i i2) {
        switch (t$_b.super[i2.ordinal()]) {
            case 1: {
                return FileVisitResult.TERMINATE;
            }
            case 2: {
                return FileVisitResult.SKIP_SUBTREE;
            }
        }
        throw new qd();
    }

    public static final void \u00d400000(Path object) {
        if (!((Collection)(object = t.\u00d300000((Path)object))).isEmpty()) {
            FileSystemException fileSystemException;
            FileSystemException fileSystemException2 = fileSystemException = new FileSystemException("Failed to delete one or more files. See suppressed exceptions for details.");
            for (Exception exception : (Iterable)object) {
                o.o00000((Throwable)fileSystemException2, exception);
            }
            throw (Throwable)fileSystemException;
        }
    }

    private static final List \u00d300000(Path object) {
        h h2 = new h(0, 1, null);
        boolean bl = true;
        Path path = object.getFileName();
        if (path != null) {
            Closeable closeable;
            Path path2 = path;
            Path path3 = object.getParent();
            if (path3 == null) {
                path3 = object.getFileSystem().getPath("", new String[0]);
            }
            Path path4 = path3;
            try {
                closeable = Files.newDirectoryStream(path4);
            }
            catch (Throwable throwable) {
                closeable = null;
            }
            DirectoryStream<Path> directoryStream = closeable;
            if (directoryStream != null) {
                block10: {
                    closeable = directoryStream;
                    Throwable throwable = null;
                    try {
                        Closeable closeable2 = closeable;
                        if (!(closeable2 instanceof SecureDirectoryStream)) break block10;
                        bl = false;
                        h2.Object(path4);
                        t.o00000((SecureDirectoryStream)closeable2, path2, null, h2);
                    }
                    catch (Throwable throwable2) {
                        try {
                            object = throwable2;
                            throwable = throwable2;
                            throw object;
                        }
                        catch (Throwable throwable3) {
                            b.l.o.o00000(closeable, throwable);
                            throw throwable3;
                        }
                    }
                }
                b.l.o.o00000(closeable, null);
            }
        }
        if (bl) {
            t.o00000((Path)object, null, h2);
        }
        return h2.Object();
    }

    private static final void o00000(h h2, b.o.e.h h3) {
        try {
            h3.newreturn();
            return;
        }
        catch (Exception exception) {
            h2.o00000(exception);
            return;
        }
    }

    private static final Object o00000(b.o.e.h object) {
        try {
            object = object.newreturn();
        }
        catch (NoSuchFileException noSuchFileException) {
            object = null;
        }
        return object;
    }

    private static final void o00000(SecureDirectoryStream secureDirectoryStream, Path path, Path path2, h h2) {
        h2.o00000(path);
        h h3 = h2;
        try {
            LinkOption[] linkOptionArray;
            if (path2 != null) {
                linkOptionArray = h2.\u00d200000();
                r.new((Path)linkOptionArray);
                t.o00000((Path)linkOptionArray, path2);
            }
            LinkOption[] linkOptionArray2 = new LinkOption[1];
            linkOptionArray = linkOptionArray2;
            linkOptionArray2[0] = LinkOption.NOFOLLOW_LINKS;
            if (t.o00000(secureDirectoryStream, path, linkOptionArray)) {
                int n2 = h2.o00000();
                t.o00000(secureDirectoryStream, path, h2);
                if (n2 == h2.o00000()) {
                    try {
                        secureDirectoryStream.deleteDirectory(path);
                    }
                    catch (NoSuchFileException noSuchFileException) {}
                }
            } else {
                try {
                    secureDirectoryStream.deleteFile(path);
                }
                catch (NoSuchFileException noSuchFileException) {}
            }
        }
        catch (Exception exception) {
            h3.o00000(exception);
        }
        h2.\u00d200000(path);
    }

    private static final void o00000(SecureDirectoryStream object, Path object2, h h2) {
        h h3 = h2;
        try {
            Object object3;
            try {
                LinkOption[] linkOptionArray = new LinkOption[1];
                object3 = linkOptionArray;
                linkOptionArray[0] = LinkOption.NOFOLLOW_LINKS;
                object3 = object.newDirectoryStream(object2, (LinkOption)object3);
            }
            catch (NoSuchFileException noSuchFileException) {
                object3 = null;
            }
            object = object3;
            if (object3 != null) {
                object = (Closeable)object;
                object2 = null;
                try {
                    object3 = (SecureDirectoryStream)object;
                    for (Path path : object3) {
                        t.o00000((SecureDirectoryStream)object3, path.getFileName(), h2.\u00d200000(), h2);
                    }
                }
                catch (Throwable throwable) {
                    try {
                        object3 = throwable;
                        object2 = throwable;
                        throw object3;
                    }
                    catch (Throwable throwable2) {
                        b.l.o.o00000((Closeable)object, (Throwable)object2);
                        throw throwable2;
                    }
                }
                b.l.o.o00000((Closeable)object, null);
                return;
            }
            return;
        }
        catch (Exception exception) {
            h3.o00000(exception);
            return;
        }
    }

    private static final boolean o00000(SecureDirectoryStream object, Path path, LinkOption ... linkOptionArray) {
        try {
            object = object.getFileAttributeView(path, BasicFileAttributeView.class, Arrays.copyOf(linkOptionArray, linkOptionArray.length)).readAttributes().isDirectory();
        }
        catch (NoSuchFileException noSuchFileException) {
            object = null;
        }
        SecureDirectoryStream secureDirectoryStream = object;
        if (secureDirectoryStream != null) {
            return (Boolean)((Object)secureDirectoryStream);
        }
        return false;
    }

    private static final void o00000(Path path, Path path2, h h2) {
        h h3 = h2;
        try {
            if (path2 != null) {
                r.new(path);
                t.o00000(path, path2);
            }
            path2 = path;
            LinkOption[] linkOptionArray = new LinkOption[1];
            LinkOption[] linkOptionArray2 = linkOptionArray;
            linkOptionArray[0] = LinkOption.NOFOLLOW_LINKS;
            if (Files.isDirectory(path2, Arrays.copyOf(linkOptionArray2, linkOptionArray2.length))) {
                int n2 = h2.o00000();
                t.o00000(path, h2);
                if (n2 == h2.o00000()) {
                    Files.deleteIfExists(path);
                    return;
                }
            } else {
                Files.deleteIfExists(path);
            }
            return;
        }
        catch (Exception exception) {
            h3.o00000(exception);
            return;
        }
    }

    private static final void o00000(Path object, h h2) {
        h h3 = h2;
        try {
            Object object2;
            try {
                object2 = Files.newDirectoryStream((Path)object);
            }
            catch (NoSuchFileException noSuchFileException) {
                object2 = null;
            }
            Closeable closeable = object2;
            if (closeable != null) {
                closeable = closeable;
                Throwable throwable = null;
                try {
                    object2 = closeable.iterator();
                    while (object2.hasNext()) {
                        t.o00000((Path)object2.next(), (Path)object, h2);
                    }
                }
                catch (Throwable throwable2) {
                    try {
                        object = throwable2;
                        throwable = throwable2;
                        throw object;
                    }
                    catch (Throwable throwable3) {
                        b.l.o.o00000(closeable, throwable);
                        throw throwable3;
                    }
                }
                b.l.o.o00000(closeable, null);
                return;
            }
            return;
        }
        catch (Exception exception) {
            h3.o00000(exception);
            return;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static final void new(Path path) {
        String string = r.\u00d800000(path);
        switch (string.hashCode()) {
            case 1472: {
                if (string.equals("..")) throw new n(path);
                return;
            }
            case 1473: {
                if (string.equals("./")) throw new n(path);
                return;
            }
            case 45724: {
                if (string.equals("..\\")) throw new n(path);
                return;
            }
            case 46: {
                if (string.equals(".")) throw new n(path);
                return;
            }
            case 1518: {
                if (string.equals(".\\")) throw new n(path);
                return;
            }
            case 45679: {
                if (!string.equals("../")) return;
                throw new n(path);
            }
        }
    }

    private static final void o00000(Path path, Path path2) {
        if (!Files.isSymbolicLink(path) && Files.isSameFile(path, path2)) {
            throw new FileSystemLoopException(((Object)path).toString());
        }
    }

    private static final i new(Path path, Path path2, Exception exception) {
        throw exception;
    }

    private static final m o00000(boolean bl, j linkOptionArray, Path copyOptionArray, Path path) {
        LinkOption[] linkOptionArray2 = g.\u00d400000.\u00d200000(bl);
        Path path2 = path;
        LinkOption[] linkOptionArray3 = new LinkOption[1];
        linkOptionArray = linkOptionArray3;
        linkOptionArray3[0] = LinkOption.NOFOLLOW_LINKS;
        boolean bl2 = Files.isDirectory(path2, Arrays.copyOf(linkOptionArray, linkOptionArray.length));
        LinkOption[] linkOptionArray4 = Arrays.copyOf(linkOptionArray2, linkOptionArray2.length);
        if (!Files.isDirectory((Path)copyOptionArray, Arrays.copyOf(linkOptionArray4, linkOptionArray4.length)) || !bl2) {
            if (bl2) {
                r.\u00d400000(path);
            }
            Path path3 = copyOptionArray;
            copyOptionArray = new b(2);
            copyOptionArray.\u00d200000(linkOptionArray2);
            copyOptionArray.super(StandardCopyOption.REPLACE_EXISTING);
            copyOptionArray = (CopyOption[])copyOptionArray.super(new CopyOption[copyOptionArray.super()]);
            Files.copy(path3, path, Arrays.copyOf(copyOptionArray, copyOptionArray.length));
        }
        return m.\u00d500000;
    }

    private static final i o00000(Path path, Path path2, Exception exception) {
        throw exception;
    }

    private static final m new(boolean bl, j j2, Path path, Path path2) {
        return j2.o00000(path, path2, bl);
    }

    private static final FileVisitResult o00000(ArrayList arrayList, e object, Path path, Path path2, Path path3, e e2, Path path4, BasicFileAttributes basicFileAttributes) {
        if ((object = t.\u00d300000(arrayList, object, path, path2, path3, e2, path4, basicFileAttributes)) == FileVisitResult.CONTINUE) {
            arrayList.add(path4);
        }
        return object;
    }

    private static final FileVisitResult o00000(ArrayList arrayList, e e2, Path path, Path path2, Path path3, Path path4, IOException iOException) {
        mc.if(arrayList);
        if (iOException == null) {
            return FileVisitResult.CONTINUE;
        }
        return t.new(e2, path, path2, path3, path4, iOException);
    }

    private static final Path o00000(Path path, Path path2, Path path3, Path path4) {
        path = r.return(path4, path);
        if (!(path = path2.resolve(((Object)path).toString())).normalize().startsWith(path3)) {
            throw new n(path4, path, "Copying files to outside the specified target directory is prohibited. The directory being recursively copied might contain an entry with an illegal name.");
        }
        return path;
    }

    private static final FileVisitResult new(e e2, Path path, Path path2, Path path3, Path path4, Exception exception) {
        return t.o00000((i)((Object)e2.o00000(path4, t.o00000(path, path2, path3, path4), exception)));
    }

    private static final FileVisitResult \u00d300000(ArrayList object, e e2, Path path, Path path2, Path path3, e e3, Path path4, BasicFileAttributes basicFileAttributes) {
        try {
            if (!((Collection)object).isEmpty()) {
                r.new(path4);
                t.o00000(path4, (Path)mc.thissuper(object));
            }
            object = t.o00000((m)((Object)e2.o00000(f.super, path4, t.o00000(path, path2, path3, path4))));
        }
        catch (Exception exception) {
            object = t.new(e3, path, path2, path3, path4, exception);
        }
        return object;
    }

    private static final b.i o00000(ArrayList arrayList, e e2, Path path, Path path2, Path path3, e e3, u u2) {
        u2.\u00d400000((arg_0, arg_1) -> t.o00000(arrayList, e2, path, path2, path3, e3, arg_0, arg_1));
        u2.\u00d200000(new t$_c$5$2(arrayList, e2, path, path2, path3, e3));
        u2.o00000(new t$_c$5$3(e3, path, path2, path3));
        u2.Object((arg_0, arg_1) -> t.o00000(arrayList, e3, path, path2, path3, arg_0, arg_1));
        return b.i.o00000;
    }

    public static final /* synthetic */ FileVisitResult new(ArrayList arrayList, e e2, Path path, Path path2, Path path3, e e3, Path path4, BasicFileAttributes basicFileAttributes) {
        return t.\u00d300000(arrayList, e2, path, path2, path3, e3, path4, basicFileAttributes);
    }

    public static final /* synthetic */ FileVisitResult o00000(e e2, Path path, Path path2, Path path3, Path path4, Exception exception) {
        return t.new(e2, path, path2, path3, path4, exception);
    }
}

