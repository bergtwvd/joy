/*
 * Copyright 2020 the original author or authors.
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

package org.leadpony.joy.yaml.tests;

import java.io.ByteArrayInputStream;
import java.io.StringReader;
import java.nio.charset.StandardCharsets;

import jakarta.json.Json;
import jakarta.json.stream.JsonParser;

/**
 * @author leadpony
 */
public class JsonParserTest {

    public static class InputStreamTest extends AbstractJsonParserTest {
        @Override
        protected JsonParser createParser(String json) {
            byte[] bytes = json.getBytes(StandardCharsets.UTF_8);
            return Json.createParser(new ByteArrayInputStream(bytes));
        }
    }

    public static class ReaderTest extends AbstractJsonParserTest {
        @Override
        protected JsonParser createParser(String json) {
            return Json.createParser(new StringReader(json));
        }
    }
}
