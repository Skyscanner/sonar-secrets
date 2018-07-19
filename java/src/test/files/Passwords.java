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
class PasswordsTestMock {
    private void test_compliant() {
        System.out.println("Passwords test"); // Compliant

        String password; // Compliant
        // String password; // Compliant
        final String PASSWORD; // Compliant
        password = "";  // Compliant
        // String password = ""; // Compliant
        // String password = ""; // Compliant
        // final String password = ""; // Compliant
        password = secretsLoader.getSecret("API");  // Compliant
        // String password = secretsLoader.getSecret("API"); // Compliant
        // String password = secretsLoader.getSecret("API"); // Compliant
        // final String password = secretsLoader.getSecret("API"); // Compliant
        String passwd; // Compliant
        // String passwd; // Compliant
        final String PASSWD; // Compliant
        passwd = "";  // Compliant
        // String passwd = ""; // Compliant
        // String passwd = ""; // Compliant
        // final String passwd = ""; // Compliant
        passwd = secretsLoader.getSecret("API");  // Compliant
        // String passwd = secretsLoader.getSecret("API"); // Compliant
        // String passwd = secretsLoader.getSecret("API"); // Compliant
        // final String passwd = secretsLoader.getSecret("API"); // Compliant
        String pwd; // Compliant
        // String pwd; // Compliant
        final String PWD; // Compliant
        pwd = "";  // Compliant
        String IDENTITY_ENTER_PASSWORD = "Identity Enter Password"; // Compliant
        String INVALID_USER_PASSWORD = "invalid_user_password"; // Compliant
        // String pwd = ""; // Compliant
        // String pwd = ""; // Compliant
        // final String pwd = ""; // Compliant
        pwd = secretsLoader.getSecret("API");  // Compliant
        // String pwd = secretsLoader.getSecret("API"); // Compliant
        // String pwd = secretsLoader.getSecret("API"); // Compliant
        // final String pwd = secretsLoader.getSecret("API"); // Compliant
        // already in a class
        login(username, password); // Compliant
        login(username, passwd); // Compliant
        login(username, pwd); // Compliant
        // no default function parameter values in Java
        // no native JSON support in Java
        if (password == "") {} // Compliant
        if (password == secretsLoader.getSecret("API")) {} // Compliant
        if (passwd == "") {} // Compliant
        if (passwd == secretsLoader.getSecret("API")) {} // Compliant
        if (pwd == "") {} // Compliant
        if (pwd == secretsLoader.getSecret("API")) {} // Compliant
    }

    private void test_noncompliant() {
        String DB_passwd = "Password1"; // Noncompliant
        String dbpassword = "Password1"; // Noncompliant
        String password = "Password1"; // Noncompliant
        // String password = "Password1"; // Noncompliant
        final String PASSWORD = "Password1"; // Noncompliant
        password = "Password1"; // Noncompliant
        String passwd = "Password1"; // Noncompliant
        // String passwd = "Password1"; // Noncompliant
        final String PASSWD = "Password1"; // Noncompliant
        passwd = "Password1"; // Noncompliant
        String pwd = "Password1"; // Noncompliant
        // String pwd = "Password1"; // Noncompliant
        final String PWD = "Password1"; // Noncompliant
        pwd = "Password1"; // Noncompliant
        // already in a class
        // no default function parameter values in Java
        // no native JSON support in Java
        if (password == "admin") {} // Noncompliant
        if (passwd == "admin") {} // Noncompliant
        if (pwd == "admin") {} // Noncompliant
    }
}
