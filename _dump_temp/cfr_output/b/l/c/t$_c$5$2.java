/*
 * Decompiled with CFR 0.152.
 */
package b.l.c;

import b.l.c.t;
import b.o.d.fc$_b;
import b.o.d.ub;
import b.o.e.e;
import b.o.e.f;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;

final class t$_c$5$2
extends ub
implements f {
    final /* synthetic */ ArrayList Stringpublicsuper;
    final /* synthetic */ e \u00f4\u00f5\u00d2000;
    final /* synthetic */ Path \u00f8\u00f5\u00d2000;
    final /* synthetic */ Path thispublicsuper;
    final /* synthetic */ Path \u00d8\u00f5\u00d2000;
    final /* synthetic */ e \u00f5\u00f5\u00d2000;

    t$_c$5$2(ArrayList arrayList, e e2, Path path, Path path2, Path path3, e e3) {
        this.Stringpublicsuper = arrayList;
        this.\u00f4\u00f5\u00d2000 = e2;
        this.\u00f8\u00f5\u00d2000 = path;
        this.thispublicsuper = path2;
        this.\u00d8\u00f5\u00d2000 = path3;
        this.\u00f5\u00f5\u00d2000 = e3;
        super(2, fc._b.class, "copy", "copyToRecursively$copy$PathsKt__PathRecursiveFunctionsKt(Ljava/util/ArrayList;Lkotlin/jvm/functions/Function3;Ljava/nio/file/Path;Ljava/nio/file/Path;Ljava/nio/file/Path;Lkotlin/jvm/functions/Function3;Ljava/nio/file/Path;Ljava/nio/file/attribute/BasicFileAttributes;)Ljava/nio/file/FileVisitResult;", 0);
    }

    public final FileVisitResult o00000(Path path, BasicFileAttributes basicFileAttributes) {
        return t.new(this.Stringpublicsuper, this.\u00f4\u00f5\u00d2000, this.\u00f8\u00f5\u00d2000, this.thispublicsuper, this.\u00d8\u00f5\u00d2000, this.\u00f5\u00f5\u00d2000, path, basicFileAttributes);
    }
}

