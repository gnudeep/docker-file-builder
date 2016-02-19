package org.myperl;

import java.util.ArrayList;
import java.util.List;

/**
 * Docker Instruction Argument
 */
public class DockerInstructionArg {

    private List<String> cmdArgList = new ArrayList<String>();

    public DockerInstructionArg(DockerInstructionArgBuilder dockerInstructionArgBuilder) {
        cmdArgList = dockerInstructionArgBuilder.getCmdConfig();
    }

    public String getCmdArgString() {
        String cmdArgString = null;
        for (String cmd : cmdArgList) {
            cmdArgString = cmdArgString + " " + cmd;
        }
        return cmdArgString;
    }
}
