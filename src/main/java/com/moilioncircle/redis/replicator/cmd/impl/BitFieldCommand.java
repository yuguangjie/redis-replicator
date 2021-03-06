/*
 * Copyright 2016-2017 Leon Chen
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.moilioncircle.redis.replicator.cmd.impl;

import com.moilioncircle.redis.replicator.cmd.Command;

import java.util.List;

/**
 * @author Leon Chen
 * @since 2.1.0
 */
public class BitFieldCommand implements Command {

    private static final long serialVersionUID = 1L;

    private String key;
    private byte[] rawKey;
    private List<Statement> statements;
    private List<OverFlow> overFlows;

    public BitFieldCommand() {
    }

    public BitFieldCommand(String key, List<Statement> statements, List<OverFlow> overFlows) {
        this(key, statements, overFlows, null);
    }

    public BitFieldCommand(String key, List<Statement> statements, List<OverFlow> overFlows, byte[] rawKey) {
        this.key = key;
        this.rawKey = rawKey;
        this.statements = statements;
        this.overFlows = overFlows;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public byte[] getRawKey() {
        return rawKey;
    }

    public void setRawKey(byte[] rawKey) {
        this.rawKey = rawKey;
    }

    public List<Statement> getStatements() {
        return statements;
    }

    public void setStatements(List<Statement> statements) {
        this.statements = statements;
    }

    public List<OverFlow> getOverFlows() {
        return overFlows;
    }

    public void setOverFlows(List<OverFlow> overFlows) {
        this.overFlows = overFlows;
    }

    @Override
    public String toString() {
        return "BitFieldCommand{" +
                "key='" + key + '\'' +
                ", statements=" + statements +
                ", overFlows=" + overFlows +
                '}';
    }
}
