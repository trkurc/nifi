/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.nifi.irc;

import org.apache.nifi.annotation.documentation.CapabilityDescription;
import org.apache.nifi.annotation.documentation.Tags;
import org.apache.nifi.controller.ControllerService;
import org.apache.nifi.processor.exception.ProcessException;


@Tags({"irc"})
@CapabilityDescription("IRC Service API.")
public interface IRCClientService extends ControllerService {

    public void joinChannel(String handlerId, String channel, IrcMessageHandler handler)  throws ProcessException;
    public void leaveChannel(String handlerId, String channel);
    public void subscribeToPrivateMessages(String handlerId, IrcMessageHandler handler);
    public void unsubscribeFromPrivateMessages(String identifier);
    public void sendMessage(String channel, String message);
    public String getServer();

}