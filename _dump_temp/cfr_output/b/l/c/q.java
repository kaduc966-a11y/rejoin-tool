/*
 * Decompiled with CFR 0.152.
 */
package b.l.c;

import b.l.c.g;
import b.l.c.k;
import b.s.db;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
final class q
extends SimpleFileVisitor {
    private final boolean \u00d300000;
    private k new;
    private db o00000;

    public q(boolean bl) {
        this.\u00d300000 = bl;
        this.o00000 = new db();
    }

    public final boolean o00000() {
        return this.\u00d300000;
    }

    public final List o00000(k object) {
        this.new = object;
        Files.walkFileTree(((k)object).String(), g.\u00d400000.o00000(this.\u00d300000), 1, this);
        this.o00000.removeFirst();
        object = this.o00000;
        this.o00000 = new db();
        return (List)object;
    }

    public final FileVisitResult o00000(Path path, BasicFileAttributes basicFileAttributes) {
        k k2 = new k(path, basicFileAttributes.fileKey(), this.new);
        this.o00000.add(k2);
        return super.preVisitDirectory(path, basicFileAttributes);
    }

    public final FileVisitResult \u00d200000(Path path, BasicFileAttributes basicFileAttributes) {
        k k2 = new k(path, null, this.new);
        this.o00000.add(k2);
        return super.visitFile(path, basicFileAttributes);
    }
}

