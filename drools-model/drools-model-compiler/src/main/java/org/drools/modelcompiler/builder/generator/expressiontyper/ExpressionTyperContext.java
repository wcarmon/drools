/*
 * Copyright 2019 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 *
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.drools.modelcompiler.builder.generator.expressiontyper;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.github.javaparser.ast.expr.Expression;

import static org.drools.core.util.StringUtils.lcFirstForBean;

public class ExpressionTyperContext {

    private List<String> usedDeclarations = new ArrayList<>();
    private Set<String> reactOnProperties = new HashSet<>();
    private List<Expression> prefixExpresssions = new ArrayList<>();

    public void addUsedDeclarations(String name) {
        usedDeclarations.add(name);
    }

    public List<String> getUsedDeclarations() {
        return usedDeclarations;
    }

    public void addReactOnProperties(String prop) {
        reactOnProperties.add(lcFirstForBean(prop));
    }

    public Set<String> getReactOnProperties() {
        return reactOnProperties;
    }

    public List<Expression> getPrefixExpresssions() {
        return prefixExpresssions;
    }
}
