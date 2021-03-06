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

/**
 * @author Leon Chen
 * @since 2.1.0
 */
public class BRPopLPushCommand implements Command {

    private static final long serialVersionUID = 1L;

    private String source;
    private String destination;
    private int timeout;
    private byte[] rawSource;
    private byte[] rawDestination;

    public BRPopLPushCommand() {
    }

    public BRPopLPushCommand(String source, String destination, int timeout) {
        this(source, destination, timeout, null, null);
    }

    public BRPopLPushCommand(String source, String destination, int timeout, byte[] rawSource, byte[] rawDestination) {
        this.source = source;
        this.destination = destination;
        this.timeout = timeout;
        this.rawSource = rawSource;
        this.rawDestination = rawDestination;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getTimeout() {
        return timeout;
    }

    public void setTimeout(int timeout) {
        this.timeout = timeout;
    }

    public byte[] getRawSource() {
        return rawSource;
    }

    public void setRawSource(byte[] rawSource) {
        this.rawSource = rawSource;
    }

    public byte[] getRawDestination() {
        return rawDestination;
    }

    public void setRawDestination(byte[] rawDestination) {
        this.rawDestination = rawDestination;
    }

    @Override
    public String toString() {
        return "BRPopLPushCommand{" +
                "source='" + source + '\'' +
                ", destination='" + destination + '\'' +
                ", timeout=" + timeout +
                '}';
    }
}
