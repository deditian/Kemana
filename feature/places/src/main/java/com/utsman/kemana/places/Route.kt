/*
 * Copyright 2019 Muhammad Utsman
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

package com.utsman.kemana.places

data class Route(val routes: List<Routes>,
                 val uuid: String,
                 val code: String,
                 val waypoints: List<WayPoints>)

data class Routes(val geometry: String,
                  val distance: Double,
                  val duration: Double)

data class WayPoints(val location: List<Double>)