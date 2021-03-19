/*
 * Copyright 2021 Skyscanner Limited.
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
console.log('PrivateKeys test'); // Compliant

var certificate = ''; // Compliant
var formatted = "-----BEGIN-----\nFORMAT\n-----END-----"; // Compliant
var public = "-----BEGIN PUBLIC KEY-----\nQyNTUxOQAAACCtrF27B/zd9DEpd38IbVBy93wSeYXKU0AGXMyO8ePu2QAAAKBSzpYEUs6W\n-----END PUBLIC KEY-----"; // Compliant
class Login { static password; } // Compliant

var rsa = '-----BEGIN RSA PRIVATE KEY-----\nQyNTUxOQAAACCtrF27B/zd9DEpd38IbVBy93wSeYXKU0AGXMyO8ePu2QAAAKBSzpYEUs6W\n-----END RSA PRIVATE KEY-----'; // Noncompliant
var dsa = "-----BEGIN DSA PRIVATE KEY-----\nQyNTUxOQAAACCtrF27B/zd9DEpd38IbVBy93wSeYXKU0AGXMyO8ePu2QAAAKBSzpYEUs6W\n-----END DSA PRIVATE KEY-----"; // Noncompliant
var ec = '-----BEGIN EC PRIVATE KEY-----\nQyNTUxOQAAACCtrF27B/zd9DEpd38IbVBy93wSeYXKU0AGXMyO8ePu2QAAAKBSzpYEUs6W\n-----END EC PRIVATE KEY-----'; // Noncompliant
var openssh = "-----BEGIN OPENSSH PRIVATE KEY-----\nQyNTUxOQAAACCtrF27B/zd9DEpd38IbVBy93wSeYXKU0AGXMyO8ePu2QAAAKBSzpYEUs6W\n-----END OPENSSH PRIVATE KEY-----"; // Noncompliant
var private = '-----BEGIN PRIVATE KEY-----\nQyNTUxOQAAACCtrF27B/zd9DEpd38IbVBy93wSeYXKU0AGXMyO8ePu2QAAAKBSzpYEUs6W\n-----END PRIVATE KEY-----'; // Noncompliant