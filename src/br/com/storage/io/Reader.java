package br.com.storage.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Iterator;

public class Reader {
    public static final String RESOURCES = "resources";
    public static final String BACKUP = "backup";

    protected void generateBackup(Path file) throws IOException {
        Path backup = Paths.get(BACKUP);
        if (!Files.isDirectory(backup)) {
            Files.createDirectory(backup);
        }

        Path fileName = file.getFileName();

        String absoluteFile = System.currentTimeMillis() + "-" + fileName.toString();

        Path origin = Paths.get(file.toString());
        Path destiny = Paths.get(backup.toString(), absoluteFile);

        Files.copy(origin, destiny);
    }

    protected String returnsFile(int code) throws IOException {
        Iterator<Path> files = list();
        int i = 0;

        Path path = null;

        while (i < code) {
            path = files.next();
            i++;
        }

        return path.toString();
    }

    public Iterator<Path> list() throws IOException {
        return Files.newDirectoryStream(Paths.get(RESOURCES)).iterator();
    }
}
