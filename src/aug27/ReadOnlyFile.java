package aug27;

import java.io.File;

public class ReadOnlyFile {

    private String filePath;
    private String fileContent;

    public ReadOnlyFile(String filePath, String fileContent) {
        this.filePath = filePath;
        this.fileContent = fileContent;
    }

    public String getFilePath() {
        return filePath;
    }

    public String getFileContent() {
        return fileContent;
    }

    public boolean isReadOnly(){
        File file = new File(filePath);
        return file.exists() && !file.canWrite();
    }
}
