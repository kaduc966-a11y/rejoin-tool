/*
 * Decompiled with CFR 0.152.
 */
package b.l.c;

import b.o.e.f;
import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
final class c
extends SimpleFileVisitor {
    private final f \u00d400000;
    private final f super;
    private final f \u00d200000;
    private final f \u00d300000;

    public c(f f2, f f3, f f4, f f5) {
        this.\u00d400000 = f2;
        this.super = f3;
        this.\u00d200000 = f4;
        this.\u00d300000 = f5;
    }

    public final FileVisitResult o00000(Path path, BasicFileAttributes basicFileAttributes) {
        Object object = this.\u00d400000;
        if (object == null || (object = (FileVisitResult)((Object)object.o00000(path, basicFileAttributes))) == null) {
            object = super.preVisitDirectory(path, basicFileAttributes);
        }
        return object;
    }

    public final FileVisitResult \u00d200000(Path path, BasicFileAttributes basicFileAttributes) {
        Object object = this.super;
        if (object == null || (object = (FileVisitResult)((Object)object.o00000(path, basicFileAttributes))) == null) {
            object = super.visitFile(path, basicFileAttributes);
        }
        return object;
    }

    public final FileVisitResult \u00d200000(Path path, IOException iOException) {
        Object object = this.\u00d200000;
        if (object == null || (object = (FileVisitResult)((Object)object.o00000(path, iOException))) == null) {
            object = super.visitFileFailed(path, iOException);
        }
        return object;
    }

    public final FileVisitResult o00000(Path path, IOException iOException) {
        Object object = this.\u00d300000;
        if (object == null || (object = (FileVisitResult)((Object)object.o00000(path, iOException))) == null) {
            object = super.postVisitDirectory(path, iOException);
        }
        return object;
    }
}

