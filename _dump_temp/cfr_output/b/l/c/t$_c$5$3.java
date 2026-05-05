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

final class t$_c$5$3
extends ub
implements f {
    final /* synthetic */ e thisclassnew;
    final /* synthetic */ Path \u00d8\u00f4\u00d3000;
    final /* synthetic */ Path \u00d4\u00f4\u00d3000;
    final /* synthetic */ Path \u00d5\u00f4\u00d3000;

    t$_c$5$3(e e2, Path path, Path path2, Path path3) {
        this.thisclassnew = e2;
        this.\u00d8\u00f4\u00d3000 = path;
        this.\u00d4\u00f4\u00d3000 = path2;
        this.\u00d5\u00f4\u00d3000 = path3;
        super(2, fc$_b.class, "error", "copyToRecursively$error$PathsKt__PathRecursiveFunctionsKt(Lkotlin/jvm/functions/Function3;Ljava/nio/file/Path;Ljava/nio/file/Path;Ljava/nio/file/Path;Ljava/nio/file/Path;Ljava/lang/Exception;)Ljava/nio/file/FileVisitResult;", 0);
    }

    public final FileVisitResult o00000(Path path, Exception exception) {
        return t.o00000(this.thisclassnew, this.\u00d8\u00f4\u00d3000, this.\u00d4\u00f4\u00d3000, this.\u00d5\u00f4\u00d3000, path, exception);
    }
}

