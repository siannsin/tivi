/*
 * Copyright 2023 Google LLC
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

package app.tivi.screens

import com.slack.circuit.runtime.Screen

@CommonParcelize
object AccountScreen : Screen

@CommonParcelize
object DiscoverScreen : Screen

@CommonParcelize
data class EpisodeDetailsScreen(val id: Long) : Screen

@CommonParcelize
data class EpisodeTrackScreen(val id: Long) : Screen

@CommonParcelize
object LibraryScreen : Screen

@CommonParcelize
object PopularShowsScreen : Screen

@CommonParcelize
object RecommendedShowsScreen : Screen

@CommonParcelize
object SearchScreen : Screen

@CommonParcelize
object SettingsScreen : Screen

@CommonParcelize
data class ShowDetailsScreen(val id: Long) : Screen

@CommonParcelize
data class ShowSeasonsScreen(val id: Long, val selectedSeasonId: Long? = null) : Screen

@CommonParcelize
object TrendingShowsScreen : Screen

@CommonParcelize
object UpNextScreen : Screen
