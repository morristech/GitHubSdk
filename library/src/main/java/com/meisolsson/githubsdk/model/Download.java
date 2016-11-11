/*
 * Copyright 2015 Henrik Olsson
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.meisolsson.githubsdk.model;

import android.os.Parcelable;
import android.support.annotation.Nullable;

import com.google.auto.value.AutoValue;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;

@AutoValue
public abstract class Download implements Parcelable {

    @Nullable
    public abstract String url();

    @Nullable
    public abstract String name();

    @Nullable
    public abstract String description();

    @Nullable
    public abstract Integer id();

    @Nullable
    public abstract Integer size();

    @Json(name = "html_url")
    @Nullable
    public abstract String htmlUrl();

    @Json(name = "download_count")
    public abstract Integer downloadCount();

    @Json(name = "content_type")
    @Nullable
    public abstract String contentType();

    public static JsonAdapter<Download> jsonAdapter(Moshi moshi) {
        return new AutoValue_Download.MoshiJsonAdapter(moshi);
    }
}