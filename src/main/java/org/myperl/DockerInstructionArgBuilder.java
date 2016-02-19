package org.myperl;

import java.util.ArrayList;
import java.util.List;

/**
 * Docker instruction argument builder
 */
public class DockerInstructionArgBuilder {

    private List<String> cmdArgList = new ArrayList<String>();

    public DockerInstructionArgBuilder withArg(String cmdArg) {
        cmdArgList.add(cmdArg);
        return this;
    }

    public List<String> getCmdConfig() {
        return cmdArgList;
    }

    public DockerInstructionArg build() {
        DockerInstructionArg dockerInstructionArg = new DockerInstructionArg(this);
        //validateUserObject(user);
        return dockerInstructionArg;
    }
}
