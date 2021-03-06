/*
 * Licensed to Elasticsearch under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.elasticsearch.hadoop.rest.commonshttp;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.elasticsearch.hadoop.cfg.Settings;
import org.elasticsearch.hadoop.rest.Transport;
import org.elasticsearch.hadoop.rest.TransportFactory;
import org.elasticsearch.hadoop.security.SecureSettings;

/**
 * Creates regular instances of {@link CommonsHttpTransport}
 */
public class CommonsHttpTransportFactory implements TransportFactory {

    private final Log log = LogFactory.getLog(this.getClass());

    @Override
    public Transport create(Settings settings, SecureSettings secureSettings, String hostInfo) {
        if (log.isDebugEnabled()) {
            log.debug("Creating new CommonsHttpTransport");
        }
        return new CommonsHttpTransport(settings, secureSettings, hostInfo);
    }
}
