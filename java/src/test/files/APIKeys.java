/*
 * Copyright 2018 Skyscanner Limited.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software  * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and  * limitations under the License.
 */
class APIKeysTestMock {
    private void test_compliant() {
        System.out.println("APIKeys test"); // Compliant

        String apikey; // Compliant
        final String api_key; // Compliant
        String ApiKey = ""; // Compliant
        final String APIKEY = ""; // Compliant
        TRAVEL_API_KEY = ""; // Compliant
        apiKey = secretsLoader.getSecret("API"); // Compliant
        // String ApiToken; // Compliant
        // String apitoken; // Compliant
        // final String api_token; // Compliant
        String ApiToken = ""; // Compliant
        String apitoken = ""; // Compliant
        final String api_token = ""; // Compliant
        PRIVATE_API_TOKEN = ""; // Compliant
        // String ApiToken = secretsLoader.getSecret("API"); // Compliant
        // String apitoken = secretsLoader.getSecret("API"); // Compliant
        // final String api_token = secretsLoader.getSecret("API"); // Compliant
        apiToken = secretsLoader.getSecret("API"); // Compliant
        String ApiSecret; // Compliant
        String apisecret; // Compliant
        final String api_secret; // Compliant
        // String ApiSecret = ""; // Compliant
        // String apisecret = ""; // Compliant
        // final String api_secret = ""; // Compliant
        SKYSCANNER_API_SECRET = ""; // Compliant
        // String ApiSecret = secretsLoader.getSecret("API"); // Compliant
        // String apisecret = secretsLoader.getSecret("API"); // Compliant
        // final String api_secret = secretsLoader.getSecret("API"); // Compliant
        apiSecret = secretsLoader.getSecret("API"); // Compliant
        // already in a class
        auth(apikey); // Compliant
        auth(api_key); // Compliant
        auth(apitoken); // Compliant
        auth(api_token); // Compliant
        auth(apisecret); // Compliant
        auth(api_secret); // Compliant
        // no default function parameter values in Java
        // no native JSON support in Java
        if (apikey == "") {} // Compliant
        if (api_key == secretsLoader.getSecret("API")) {} // Compliant
        if (apitoken == "") {} // Compliant
        if (api_token == secretsLoader.getSecret("API")) {} // Compliant
        if (apisecret == "") {} // Compliant
        if (api_secret == secretsLoader.getSecret("API")) {} // Compliant
    }

    private void test_noncompliant() {
        TRAVEL_API_KEY = "912ec803b2ce49e4a541068d495ab570"; // Noncompliant
        String ApiKey = "912ec803b2ce49e4a541068d495ab570"; // Noncompliant
        String apikey = "apikey"; // Noncompliant
        final String api_key = "YXNkZmZmZmZm_YXNkZmZmZmZm"; // Noncompliant
        apiKey = "912ec803b2ce49e4a541068d495ab570"; // Noncompliant
        PRIVATE_API_TOKEN = "912ec803b2ce49e4a541068d495ab570"; // Noncompliant
        String ApiToken = "912ec803b2ce49e4a541068d495ab570"; // Noncompliant
        String apitoken = "apitoken"; // Noncompliant
        final String api_token = "YXNkZmZmZmZm_YXNkZmZmZmZm"; // Noncompliant
        apiToken = "912ec803b2ce49e4a541068d495ab570"; // Noncompliant
        SKYSCANNER_API_SECRET = "912ec803b2ce49e4a541068d495ab570"; // Noncompliant
        String ApiSecret = "912ec803b2ce49e4a541068d495ab570"; // Noncompliant
        String apisecret = "apisecret"; // Noncompliant
        final String api_secret = "YXNkZmZmZmZm_YXNkZmZmZmZm"; // Noncompliant
        apiSecret = "912ec803b2ce49e4a541068d495ab570"; // Noncompliant
        String GITLAB_TOKEN = "YXNkZmZmZmZm_YXNkZmZmZmZm"; // Noncompliant
        String GITHUB_SECRET = "YXNkZmZmZmZm_YXNkZmZmZmZm"; // Noncompliant
        final String slack_key = "YXNkZmZmZmZm_YXNkZmZmZmZm"; // Noncompliant
        Google_token = "YXNkZmZmZmZm_YXNkZmZmZmZm"; // Noncompliant
        // already in a class
        // no default function parameter values in Java
        // no native JSON support in Java
        if (apikey == "YXNkZmZmZmZm_YXNkZmZmZmZm") {} // Noncompliant
        if (api_key == "912ec803b2ce49e4a541068d495ab570") {} // Noncompliant
        if (apitoken == "YXNkZmZmZmZm_YXNkZmZmZmZm") {} // Noncompliant
        if (api_token == "912ec803b2ce49e4a541068d495ab570") {} // Noncompliant
        if (apisecret == "YXNkZmZmZmZm_YXNkZmZmZmZm") {} // Noncompliant
        if (api_secret == "912ec803b2ce49e4a541068d495ab570") {} // Noncompliant
    }
}