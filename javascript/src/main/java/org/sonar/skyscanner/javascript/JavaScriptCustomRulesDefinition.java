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
package org.sonar.skyscanner.javascript;

import org.sonar.plugins.javascript.api.CustomJavaScriptRulesDefinition;
import org.sonar.skyscanner.javascript.checks.Passwords;
import org.sonar.skyscanner.javascript.checks.HighEntropy;
import org.sonar.skyscanner.javascript.checks.AWSCredentials;
import org.sonar.skyscanner.javascript.checks.APIKeys;
import org.sonar.skyscanner.javascript.checks.PrivateKeys;


public class JavaScriptCustomRulesDefinition extends CustomJavaScriptRulesDefinition {

  @Override
  public String repositoryName() {
    return "Sonar Secrets JavaScript";
  }

  @Override
  public String repositoryKey() {
    return "sonar-secrets-javascript";
  }

  @Override
  public Class[] checkClasses() {
    return new Class[] {
      Passwords.class,
      HighEntropy.class,
      AWSCredentials.class,
      APIKeys.class,
      PrivateKeys.class
    };
  }
}
