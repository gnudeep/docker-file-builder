package org.myperl;

import java.util.ArrayList;
import java.util.List;

/**
 * Docker File Builder.
 */
public class DockerFileBuilder {

    private List<String> dockerInstructionList = new ArrayList<String>();

    public DockerFileBuilder withFrom(String dockerCmdArg) {
        String dockerCommand = DockerInstructionConstant.DOCKER_CMD_FROM + DockerInstructionConstant.SPACE + dockerCmdArg;
        dockerInstructionList.add(dockerCommand);
        return this;
    }

    public DockerFileBuilder withCopy(String dockerCmdArg) {
        String dockerCommand = DockerInstructionConstant.DOCKER_CMD_COPY + DockerInstructionConstant.SPACE  + dockerCmdArg;
        dockerInstructionList.add(dockerCommand);
        return this;
    }

    public DockerFileBuilder withEnv(String dockerCmdArg) {
        String dockerCommand = DockerInstructionConstant.DOCKER_CMD_ENV + DockerInstructionConstant.SPACE  + dockerCmdArg;
        dockerInstructionList.add(dockerCommand);
        return this;
    }

    public List<String> getDockerInstructionList() {
        return dockerInstructionList;
    }

    public DockerFile build() {
        DockerFile dockerFile = new DockerFile(this);
        //validateUserObject(user);
        return dockerFile;
    }
}
