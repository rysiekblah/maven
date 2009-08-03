package org.apache.maven.model.plugin;

/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

import org.apache.maven.model.Model;
import org.apache.maven.model.building.ModelBuildingProblems;

/**
 * Handles injection of plugin executions induced by the lifecycle bindings for a packaging.
 * 
 * @author Benjamin Bentmann
 */
public interface LifecycleBindingsInjector
{

    /**
     * Injects plugin executions induced by lifecycle bindings into the specified model.
     * 
     * @param model The model into which to inject the default plugin executions for its packaging, must not be
     *            <code>null</code>.
     * @param problems The container used to collect problems that were encountered, must not be {@code null}.
     */
    void injectLifecycleBindings( Model model, ModelBuildingProblems problems );

}
