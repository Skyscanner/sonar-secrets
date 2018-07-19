# SonarQube™ Secrets plugin
`Sonar Secrets` plugin for SonarQube™ is designed to identify hardcoded secrets such as passwords, API keys, AWS credentials, tokens, etc. In line with best security practices it is recommended to use a credentials store (such as credstash or Vault) to contain all secrets, and refer to these using identifiers, such that the source code will never contain any cleartext secret.

This plugin supports Java and JavaScript.

# Installation Guide
### Build
```bash
cd sonar-secrets/java && mvn clean package
cd sonar-secrets/javascript && mvn clean package
```

If everything went well you should see the following message:
```
...
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 7.065 s
[INFO] Finished at: 2017-10-26T05:00:33-04:00
[INFO] Final Memory: 23M/252M
[INFO] ------------------------------------------------------------------------
```

`sonar-secrets-java-x.x.jar` will be placed in `sonar-secrets/java/target` directory.

`sonar-secrets-javascript-x.x.jar` will be placed in `sonar-secrets/javascript/target` directory.

### Install
* Copy `jar` files to your SonarQube™ plugin directory (ex: `/opt/sonarqube/extensions/plugins`)
* Restart SonarQube™ server

In startup logs you should see:
```
...
INFO  web[][o.s.s.p.ServerPluginRepository] Deploy plugin Sonar Secrets Java / x.x
INFO  web[][o.s.s.p.ServerPluginRepository] Deploy plugin Sonar Secrets JavaScript / x.x
...
```

### Configure
* Enable `sonar-secrets-java` and `sonar-secrets-javascript` in your Quality Profiles

*Note:* you can locate `sonar-secrets` rules in Web UI by using Tag filter `skyscanner`.

SonarQube™ is a trademark of SonarSource SA, Switzerland.