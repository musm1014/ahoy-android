/*
 * Copyright (C) 2016 Maplebear Inc., d/b/a Instacart
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
package com.github.instacart.ahoy.delegate;

import android.support.annotation.Nullable;

import com.github.instacart.ahoy.Visit;
import com.google.auto.value.AutoValue;

import java.util.Map;

@AutoValue
public abstract class VisitParams {

    public static VisitParams create(String visitorToken, @Nullable Visit visit,
            @Nullable Map<String, Object> extraParams) {
        return new AutoValue_VisitParams(visit, visitorToken, extraParams);
    }

    @Nullable public abstract Visit visit();
    public abstract String visitorToken();
    @Nullable public abstract Map<String, Object> extraParams();
}