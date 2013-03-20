/*
 * Copyright 2010 JBoss Inc
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

package org.optaplanner.core.impl.constructionheuristic;

import org.optaplanner.core.phase.AbstractSolverPhase;
import org.optaplanner.core.phase.SolverPhase;

/**
 * A {@link ConstructionHeuristicSolverPhase} is a {@link SolverPhase} which uses a construction heuristic algorithm,
 * such as first fit, best fit decreasing, cheapest insertion, ...
 * @see SolverPhase
 * @see AbstractSolverPhase
 * @see DefaultConstructionHeuristicSolverPhase
 */
public interface ConstructionHeuristicSolverPhase extends SolverPhase {

}