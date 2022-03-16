package org.example;

import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.Platform;

public class Main {
    public interface CLibrary extends Library {
        CLibrary INSTANCE = (CLibrary)
                Native.load((Platform.isWindows() ? "msvcrt" : "c"),
                        CLibrary.class);

        void printf(String format, Object... args);
    }

    public static void main(String[] args) {
        String str = "Hui\niiiuy\tiu\n";
        CLibrary.INSTANCE.printf("%s", str);

        for (int i = 0; i < str.length(); i++) {
            CLibrary.INSTANCE.printf("\b");
        }
    }

}
