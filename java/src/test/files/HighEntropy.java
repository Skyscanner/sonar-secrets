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
class HighEntropyTestMock {
    private void test_compliant() {
        System.out.println("HighEntropy test"); // Compliant

        String low_entropy = "Along with the common chimpanzee, the bonobo is the closest extant relative to humans. [https://www.nytimes.com/2016/09/13/science/bonobos-apes-matriarchy.html]" ; // Compliant
        // String low_entropy = "Along with the common chimpanzee, the bonobo is the closest extant relative to humans. [https://www.nytimes.com/2016/09/13/science/bonobos-apes-matriarchy.html]" ; // Compliant
        final String LOW = "Along with the common chimpanzee, the bonobo is the closest extant relative to humans. [https://www.nytimes.com/2016/09/13/science/bonobos-apes-matriarchy.html]" ; // Compliant
        low_entropy = "Along with the common chimpanzee, the bonobo is the closest extant relative to humans. [https://www.nytimes.com/2016/09/13/science/bonobos-apes-matriarchy.html]" ; // Compliant
        // already in a class
        // no native JSON support in Java
    }

    private void test_noncompliant() {
        String high_entropy = "AAAAB3NzaC1yc2EAAAADAQABAAAAgQCqGKukO1De7zhZj6+H0qtjTkVxwTCpvKe4eCZ0FPqri0cb2JZfXJ/DgYSF6vUpwmJG8wVQZKjeGcjDOL5UlsuusFncCzWBQ7RKNUSesmQRMSGkVb1/3j+skZ6UtW+5u09lHNsj6tQ51s1SPrCBkedbNf0Tp0GbMJDyR4e9T04ZZw"; // Noncompliant  
        // String high_entropy = "AAAAB3NzaC1yc2EAAAADAQABAAAAgQCqGKukO1De7zhZj6+H0qtjTkVxwTCpvKe4eCZ0FPqri0cb2JZfXJ/DgYSF6vUpwmJG8wVQZKjeGcjDOL5UlsuusFncCzWBQ7RKNUSesmQRMSGkVb1/3j+skZ6UtW+5u09lHNsj6tQ51s1SPrCBkedbNf0Tp0GbMJDyR4e9T04ZZw"; // Noncompliant  
        final String HIGH = "AAAAB3NzaC1yc2EAAAADAQABAAAAgQCqGKukO1De7zhZj6+H0qtjTkVxwTCpvKe4eCZ0FPqri0cb2JZfXJ/DgYSF6vUpwmJG8wVQZKjeGcjDOL5UlsuusFncCzWBQ7RKNUSesmQRMSGkVb1/3j+skZ6UtW+5u09lHNsj6tQ51s1SPrCBkedbNf0Tp0GbMJDyR4e9T04ZZw"; // Noncompliant  
        high_entropy = "AAAAB3NzaC1yc2EAAAADAQABAAAAgQCqGKukO1De7zhZj6+H0qtjTkVxwTCpvKe4eCZ0FPqri0cb2JZfXJ/DgYSF6vUpwmJG8wVQZKjeGcjDOL5UlsuusFncCzWBQ7RKNUSesmQRMSGkVb1/3j+skZ6UtW+5u09lHNsj6tQ51s1SPrCBkedbNf0Tp0GbMJDyR4e9T04ZZw"; // Noncompliant  
        // already in a class
        // no native JSON support in Java
    }
}
