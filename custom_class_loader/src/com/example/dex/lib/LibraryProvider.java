/*
 * Copyright 2011 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.dex.lib;

import android.content.Context;
import android.widget.Toast;

import com.example.dex.LibraryInterface;

public class LibraryProvider implements LibraryInterface {
    public void showAwesomeToast(Context context, String message) {
        if (context == null) {
            return;
        }
        Toast.makeText(context,
                       String.format("++ %s ++", message),
                       Toast.LENGTH_LONG).show();
    }
}
