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
class PrivateKeysTestMock {
    private void test_compliant() {
        System.out.println("PrivateKeys test"); // Compliant

        String certificate = ""; // Compliant
        String formatted = "-----BEGIN-----\nFORMAT\n-----END-----"; // Compliant
        String pub = "-----BEGIN PUBLIC KEY-----\nQyNTUxOQAAACCtrF27B/zd9DEpd38IbVBy93wSeYXKU0AGXMyO8ePu2QAAAKBSzpYEUs6W\n-----END PUBLIC KEY-----"; // Compliant
        // already in a class
    }

    private void test_noncompliant() {
        String rsa = "-----BEGIN RSA PRIVATE KEY-----\nQyNTUxOQAAACCtrF27B/zd9DEpd38IbVBy93wSeYXKU0AGXMyO8ePu2QAAAKBSzpYEUs6W\n-----END RSA PRIVATE KEY-----"; // Noncompliant
        String dsa = "-----BEGIN DSA PRIVATE KEY-----\nQyNTUxOQAAACCtrF27B/zd9DEpd38IbVBy93wSeYXKU0AGXMyO8ePu2QAAAKBSzpYEUs6W\n-----END DSA PRIVATE KEY-----"; // Noncompliant
        String ec = "-----BEGIN EC PRIVATE KEY-----\nQyNTUxOQAAACCtrF27B/zd9DEpd38IbVBy93wSeYXKU0AGXMyO8ePu2QAAAKBSzpYEUs6W\n-----END EC PRIVATE KEY-----"; // Noncompliant
        String openssh = "-----BEGIN OPENSSH PRIVATE KEY-----\nQyNTUxOQAAACCtrF27B/zd9DEpd38IbVBy93wSeYXKU0AGXMyO8ePu2QAAAKBSzpYEUs6W\n-----END OPENSSH PRIVATE KEY-----"; // Noncompliant
        String priv = "-----BEGIN PRIVATE KEY-----\nQyNTUxOQAAACCtrF27B/zd9DEpd38IbVBy93wSeYXKU0AGXMyO8ePu2QAAAKBSzpYEUs6W\n-----END PRIVATE KEY-----"; // Noncompliant
    }
}
