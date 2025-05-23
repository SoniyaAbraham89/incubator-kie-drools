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
package org.kie.efesto.runtimemanager.core.mocks;

import org.kie.efesto.common.api.cache.EfestoClassKey;
import org.kie.efesto.common.api.identifiers.LocalUri;
import org.kie.efesto.common.api.identifiers.ModelLocalUriId;
import org.kie.efesto.runtimemanager.api.model.EfestoInput;

public class MockKieRuntimeServiceB extends AbstractMockKieRuntimeService {

    public MockKieRuntimeServiceB() {
        super(new ModelLocalUriId(LocalUri.parse("/" + MockEfestoInputB.class.getSimpleName() + "/" + MockEfestoInputB.class.getPackage().getName())));
    }

    @Override
    public EfestoClassKey getEfestoClassKeyIdentifier() {
        return new EfestoClassKey(MockEfestoInputB.class, String.class);
    }

    @Override
    public String getModelType() {
        return MockEfestoInputB.class.getSimpleName();
    }

    @Override
    public EfestoInput getMockedEfestoInput() {
        return new MockEfestoInputB();
    }
}
