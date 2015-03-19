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
package org.apache.nifi.web;

/**
 *
 */
public class ConfigurationAction {

    private final String field;
    private final String previousValue;
    private final String value;

    private ConfigurationAction(final Builder builder) {
        this.field = builder.field;
        this.previousValue = builder.previousValue;
        this.value = builder.value;
    }

    /**
     * Gets the name of the field, property, etc that has been modified.
     *
     * @return
     */
    public String getField() {
        return field;
    }

    /**
     * Gets the previous value.
     *
     * @return
     */
    public String getPreviousValue() {
        return previousValue;
    }

    /**
     * Gets the new value.
     *
     * @return
     */
    public String getValue() {
        return value;
    }

    public static class Builder {

        private String field;
        private String previousValue;
        private String value;

        public Builder field(final String field) {
            this.field = field;
            return this;
        }

        public Builder previousValue(final String previousValue) {
            this.previousValue = previousValue;
            return this;
        }

        public Builder value(final String value) {
            this.value = value;
            return this;
        }

        public ConfigurationAction build() {
            return new ConfigurationAction(this);
        }
    }
}
