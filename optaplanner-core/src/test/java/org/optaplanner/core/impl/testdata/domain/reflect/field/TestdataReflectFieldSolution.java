/*
 * Copyright 2015 JBoss Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.optaplanner.core.impl.testdata.domain.reflect.field;

import java.util.Collection;
import java.util.List;

import org.optaplanner.core.api.domain.solution.PlanningEntityCollectionProperty;
import org.optaplanner.core.api.domain.solution.PlanningSolution;
import org.optaplanner.core.api.domain.solution.Solution;
import org.optaplanner.core.api.domain.valuerange.ValueRangeProvider;
import org.optaplanner.core.api.score.buildin.simple.SimpleScore;
import org.optaplanner.core.impl.domain.solution.descriptor.SolutionDescriptor;
import org.optaplanner.core.impl.testdata.domain.TestdataObject;
import org.optaplanner.core.impl.testdata.domain.TestdataUtils;
import org.optaplanner.core.impl.testdata.domain.TestdataValue;

@PlanningSolution
public class TestdataReflectFieldSolution extends TestdataObject implements Solution<SimpleScore> {

    public static SolutionDescriptor buildSolutionDescriptor() {
        return TestdataUtils.buildSolutionDescriptor(TestdataReflectFieldSolution.class, TestdataReflectFieldEntity.class);
    }

    @ValueRangeProvider(id = "valueRange")
    private List<TestdataValue> valueList;
    @PlanningEntityCollectionProperty
    private List<TestdataReflectFieldEntity> entityList;

    private SimpleScore score;

    public TestdataReflectFieldSolution() {
    }

    public TestdataReflectFieldSolution(String code) {
        super(code);
    }

    public TestdataReflectFieldSolution(String code, List<TestdataValue> valueList, List<TestdataReflectFieldEntity> entityList) {
        super(code);
        this.valueList = valueList;
        this.entityList = entityList;
    }

    public List<TestdataValue> getValueList() {
        return valueList;
    }

    public List<TestdataReflectFieldEntity> getEntityList() {
        return entityList;
    }

    public SimpleScore getScore() {
        return score;
    }

    public void setScore(SimpleScore score) {
        this.score = score;
    }

    // ************************************************************************
    // Complex methods
    // ************************************************************************

    public Collection<? extends Object> getProblemFacts() {
        return valueList;
    }

}
