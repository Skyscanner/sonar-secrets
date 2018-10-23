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
class AWSCredentialsTestMock {
    private void test_compliant() {
        System.out.println("AWSCredentials test"); // Compliant

        String AWS_ACCESS_KEY_ID; // Compliant
        // String AWS_ACCESS_KEY_ID; // Compliant
        // final String AWS_ACCESS_KEY_ID; // Compliant
        AWS_ACCESS_KEY_ID = "";  // Compliant
        // String AWS_ACCESS_KEY_ID = ""; // Compliant
        // String AWS_ACCESS_KEY_ID = ""; // Compliant
        // final String AWS_ACCESS_KEY_ID = ""; // Compliant
        AWS_ACCESS_KEY_ID = secretsLoader.getSecret("API");  // Compliant
        // String AWS_ACCESS_KEY_ID = secretsLoader.getSecret("API"); // Compliant
        // String AWS_ACCESS_KEY_ID = secretsLoader.getSecret("API"); // Compliant
        // final String AWS_ACCESS_KEY_ID = secretsLoader.getSecret("API"); // Compliant
        AWS_ACCESS_KEY_ID = "AWS_ACCESS_KEY_ID";  // Compliant
        // String AWS_ACCESS_KEY_ID = "AWS_ACCESS_KEY_ID"; // Compliant
        // String AWS_ACCESS_KEY_ID = "AWS_ACCESS_KEY_ID"; // Compliant
        // final String AWS_ACCESS_KEY_ID = "AWS_ACCESS_KEY_ID"; // Compliant
        String AWS_SECRET_ACCESS_KEY; // Compliant
        // String AWS_SECRET_ACCESS_KEY; // Compliant
        // final String AWS_SECRET_ACCESS_KEY; // Compliant
        AWS_SECRET_ACCESS_KEY = "";  // Compliant
        // String AWS_SECRET_ACCESS_KEY = ""; // Compliant
        // String AWS_SECRET_ACCESS_KEY = ""; // Compliant
        // final String AWS_SECRET_ACCESS_KEY = ""; // Compliant
        AWS_SECRET_ACCESS_KEY = secretsLoader.getSecret("API");  // Compliant
        // String AWS_SECRET_ACCESS_KEY = secretsLoader.getSecret("API"); // Compliant
        // String AWS_SECRET_ACCESS_KEY = secretsLoader.getSecret("API"); // Compliant
        // final String AWS_SECRET_ACCESS_KEY = secretsLoader.getSecret("API"); // Compliant
        AWS_SECRET_ACCESS_KEY = "AWS_SECRET_ACCESS_KEY";  // Compliant
        // String AWS_SECRET_ACCESS_KEY = "AWS_SECRET_ACCESS_KEY"; // Compliant
        // String AWS_SECRET_ACCESS_KEY = "AWS_SECRET_ACCESS_KEY"; // Compliant
        // final String AWS_SECRET_ACCESS_KEY = "AWS_SECRET_ACCESS_KEY"; // Compliant
        String AWS_SESSION_TOKEN; // Compliant
        // String AWS_SESSION_TOKEN; // Compliant
        // final String AWS_SESSION_TOKEN; // Compliant
        AWS_SESSION_TOKEN = "";  // Compliant
        // String AWS_SESSION_TOKEN = ""; // Compliant
        // String AWS_SESSION_TOKEN = ""; // Compliant
        // final String AWS_SESSION_TOKEN = ""; // Compliant
        AWS_SESSION_TOKEN = secretsLoader.getSecret("API");  // Compliant
        // String AWS_SESSION_TOKEN = secretsLoader.getSecret("API"); // Compliant
        // String AWS_SESSION_TOKEN = secretsLoader.getSecret("API"); // Compliant
        // final String AWS_SESSION_TOKEN = secretsLoader.getSecret("API"); // Compliant
        AWS_SESSION_TOKEN = "AWS_SESSION_TOKEN";  // Compliant
        // String AWS_SESSION_TOKEN = "AWS_SESSION_TOKEN"; // Compliant
        // String AWS_SESSION_TOKEN = "AWS_SESSION_TOKEN"; // Compliant
        // final String AWS_SESSION_TOKEN = "AWS_SESSION_TOKEN"; // Compliant
        // already in a class
        cloud(AWS_ACCESS_KEY_ID, AWS_SECRET_ACCESS_KEY); // Compliant
        cloud(AWS_SESSION_TOKEN); // Compliant
        // no default function parameter values in Java
        // no native JSON support in Java
        if (AWS_ACCESS_KEY_ID == "" || AWS_SECRET_ACCESS_KEY == "") {} // Compliant
        if (AWS_ACCESS_KEY_ID == secretsLoader.getSecret("API")) {} // Compliant
        if (AWS_SESSION_TOKEN == "") {} // Complian
        if (AWS_SESSION_TOKEN == secretsLoader.getSecret("API")) {} // Compliant
        require("app/organizations/preferences/controller"); // Compliant
        String role = "arn:aws:iam::123456789000:role/role-name"; // Compliant
        String elastic = "arn:aws:elasticbeanstalk:us-east-1:123456789000:environment/app/MyEnvironment"; // Compliant
        final String rds = "arn:aws:rds:eu-west-4:123456789000:db:mysql-db"; // Compliant
        final String S3 = "arn:aws:s3:::my_corporate_bucket/exampleobject.png"; // Compliant
    }

    private void test_noncompliant() {
        String aws_id = "AKIEHI385HKH1IWUQEEN"; // Noncompliant
        String aws_key = "PA3XsxZ8d8cPQLmnZzVhaRdzC6ND2a8vhbyXU/Dw"; // Noncompliant
        final String aws_token = "FQoDYXdzELv//////////wEldj3948yOJRO84jgpoip239232hEOHhfkjhefkwue97jorhfiuh+XjFC9Je/YG7JCqKjrspab2lB+7/Fb1NJFjgwur47Dbhs/L7nh+/VGnwLoAo8CIqoPBLRmXItaoiuuofZnr+ktihZk1Yi55sYZ12hfRMPVbDmhf9Ke683+e9bJirhUEghw9424JOhgwrgqq99MvzCEFe4eXPOSgAcQcD2xqnnKO738tjhoh23HFqjflhefibWegfqefgqUF12hvgfwegqf"; // Noncompliant 
        put(S3_ACCESS_KEY_ID, "AKIEHI385HKH1IWUQEEN"); // Noncompliant
        // Noncompliant@+1
        auth("AKIEHI385HKH1IWUQEEN", "PA3XsxZ8d8cPQLmnZzVhaRdzC6ND2a8vhbyXU/Dw"); // Noncompliant
        // no default function parameter values in Java
        // no native JSON support in Java
        if (AWS_ACCESS_KEY_ID == "AKIEHI385HKH1IWUQEEN") {} // Noncompliant
        if (AWS_SECRET_ACCESS_KEY == "PA3XsxZ8d8cPQLmnZzVhaRdzC6ND2a8vhbyXU/Dw") {} // Noncompliant
        if (AWS_SESSION_TOKEN == "FQoDYXdzELv//////////wEldj3948yOJRO84jgpoip239232hEOHhfkjhefkwue97jorhfiuh+XjFC9Je/YG7JCqKjrspab2lB+7/Fb1NJFjgwur47Dbhs/L7nh+/VGnwLoAo8CIqoPBLRmXItaoiuuofZnr+ktihZk1Yi55sYZ12hfRMPVbDmhf9Ke683+e9bJirhUEghw9424JOhgwrgqq99MvzCEFe4eXPOSgAcQcD2xqnnKO738tjhoh23HFqjflhefibWegfqefgqUF12hvgfwegqf") {} // Noncompliant
        // already in a class
    }
}
