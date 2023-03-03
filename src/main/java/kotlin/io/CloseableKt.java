package kotlin.io;

import java.io.Closeable;
import java.io.IOException;

public class CloseableKt {
    private CloseableKt() {
    }

    public static void closeFinally(Closeable self, Throwable t) {
        if (self == null)
            return;
        try {
            self.close();
        } catch (IOException e) {
            if (t != null)
                t.addSuppressed(e);
        }
    }
}
