package org.myperl;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Docker File.
 */
public class DockerFile {

    private List<String> dockerFileConfig = new ArrayList<String>();

    public DockerFile(DockerFileBuilder dockerFileBuilder) {
        dockerFileConfig = dockerFileBuilder.getDockerInstructionList();
    }

    public String toString() {
        return dockerFileConfig.toString();
    }

    public void create(String filePath) throws IOException {
        FileUtils.writeLines(new File(filePath), dockerFileConfig);
    }
}
