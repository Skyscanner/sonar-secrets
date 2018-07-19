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
console.log('AWSCredentials test'); // Compliant

var AWS_ACCESS_KEY_ID; // Compliant
let AWS_ACCESS_KEY_ID; // Compliant
const AWS_ACCESS_KEY_ID; // Compliant
AWS_ACCESS_KEY_ID = '';  // Compliant
var AWS_ACCESS_KEY_ID = ''; // Compliant
let AWS_ACCESS_KEY_ID = ""; // Compliant
const AWS_ACCESS_KEY_ID = ""; // Compliant
AWS_ACCESS_KEY_ID = keystore['DECRYPTED']['AWS_ACCESS_KEY_ID'];  // Compliant
var AWS_ACCESS_KEY_ID = keystore['DECRYPTED']['AWS_ACCESS_KEY_ID']; // Compliant
let AWS_ACCESS_KEY_ID = keystore['DECRYPTED']['AWS_ACCESS_KEY_ID']; // Compliant
const AWS_ACCESS_KEY_ID = keystore['DECRYPTED']['AWS_ACCESS_KEY_ID']; // Compliant
AWS_ACCESS_KEY_ID = 'AWS_ACCESS_KEY_ID';  // Compliant
var AWS_ACCESS_KEY_ID = 'AWS_ACCESS_KEY_ID'; // Compliant
let AWS_ACCESS_KEY_ID = "AWS_ACCESS_KEY_ID"; // Compliant
const AWS_ACCESS_KEY_ID = "AWS_ACCESS_KEY_ID"; // Compliant
var AWS_SECRET_ACCESS_KEY; // Compliant
let AWS_SECRET_ACCESS_KEY; // Compliant
const AWS_SECRET_ACCESS_KEY; // Compliant
AWS_SECRET_ACCESS_KEY = '';  // Compliant
var AWS_SECRET_ACCESS_KEY = ''; // Compliant
let AWS_SECRET_ACCESS_KEY = ""; // Compliant
const AWS_SECRET_ACCESS_KEY = ""; // Compliant
AWS_SECRET_ACCESS_KEY = keystore['DECRYPTED']['AWS_SECRET_ACCESS_KEY'];  // Compliant
var AWS_SECRET_ACCESS_KEY = keystore['DECRYPTED']['AWS_SECRET_ACCESS_KEY']; // Compliant
let AWS_SECRET_ACCESS_KEY = keystore['DECRYPTED']['AWS_SECRET_ACCESS_KEY']; // Compliant
const AWS_SECRET_ACCESS_KEY = keystore['DECRYPTED']['AWS_SECRET_ACCESS_KEY']; // Compliant
AWS_SECRET_ACCESS_KEY = 'AWS_SECRET_ACCESS_KEY';  // Compliant
var AWS_SECRET_ACCESS_KEY = 'AWS_SECRET_ACCESS_KEY'; // Compliant
let AWS_SECRET_ACCESS_KEY = "AWS_SECRET_ACCESS_KEY"; // Compliant
const AWS_SECRET_ACCESS_KEY = "AWS_SECRET_ACCESS_KEY"; // Compliant
var AWS_SESSION_TOKEN; // Compliant
let AWS_SESSION_TOKEN; // Compliant
const AWS_SESSION_TOKEN; // Compliant
AWS_SESSION_TOKEN = '';  // Compliant
var AWS_SESSION_TOKEN = ''; // Compliant
let AWS_SESSION_TOKEN = ""; // Compliant
const AWS_SESSION_TOKEN = ""; // Compliant
AWS_SESSION_TOKEN = keystore['DECRYPTED']['PASSWORD'];  // Compliant
var AWS_SESSION_TOKEN = keystore['DECRYPTED']['AWS_SESSION_TOKEN']; // Compliant
let AWS_SESSION_TOKEN = keystore['DECRYPTED']['AWS_SESSION_TOKEN']; // Compliant
const AWS_SESSION_TOKEN = keystore['DECRYPTED']['AWS_SESSION_TOKEN']; // Compliant
AWS_SESSION_TOKEN = 'AWS_SESSION_TOKEN';  // Compliant
var AWS_SESSION_TOKEN = 'AWS_SESSION_TOKEN'; // Compliant
let AWS_SESSION_TOKEN = "AWS_SESSION_TOKEN"; // Compliant
const AWS_SESSION_TOKEN = "AWS_SESSION_TOKEN"; // Compliant
class Cloud { static AWS_ACCESS_KEY_ID; } // Compliant
class Cloud { static AWS_ACCESS_KEY_ID = ''; } // Compliant
class Cloud { static AWS_ACCESS_KEY_ID = keystore['DECRYPTED']['AWS_ACCESS_KEY_ID']; } // Compliant
class Cloud { static AWS_ACCESS_KEY_ID = 'AWS_ACCESS_KEY_ID'; } // Compliant
class Cloud { static AWS_SECRET_ACCESS_KEY; } // Compliant
class Cloud { static AWS_SECRET_ACCESS_KEY = ''; } // Compliant
class Cloud { static AWS_SECRET_ACCESS_KEY = keystore['DECRYPTED']['AWS_SECRET_ACCESS_KEY']; } // Compliant
class Cloud { static AWS_SECRET_ACCESS_KEY = 'AWS_SECRET_ACCESS_KEY'; } // Compliant
class Cloud { static AWS_SESSION_TOKEN; } // Compliant
class Cloud { static AWS_SESSION_TOKEN = ''; } // Compliant
class Cloud { static AWS_SESSION_TOKEN = keystore['DECRYPTED']['AWS_SESSION_TOKEN']; } // Compliant
class Cloud { static AWS_SESSION_TOKEN = 'AWS_SESSION_TOKEN'; } // Compliant
cloud(AWS_ACCESS_KEY_ID, AWS_SECRET_ACCESS_KEY); // Compliant
cloud(AWS_SESSION_TOKEN); // Compliant
function cloud(AWS_ACCESS_KEY_ID, AWS_SECRET_ACCESS_KEY) {} // Compliant
function cloud(AWS_ACCESS_KEY_ID='', AWS_SECRET_ACCESS_KEY="") {} // Compliant
function cloud(AWS_ACCESS_KEY_ID=keystore['DECRYPTED']['AWS_ACCESS_KEY_ID'], AWS_SECRET_ACCESS_KEY=keystore['DECRYPTED']['AWS_SECRET_ACCESS_KEY']) {} // Compliant
function cloud(AWS_SESSION_TOKEN) {} // Compliant
function cloud(AWS_SESSION_TOKEN="") {} // Compliant
function cloud(AWS_SESSION_TOKEN=keystore['DECRYPTED']['AWS_SESSION_TOKEN']) {} // Compliant
var credentials = {'AWS_ACCESS_KEY_ID': '', 'AWS_SECRET_ACCESS_KEY': ''}; // Compliant
var credentials = {'AWS_ACCESS_KEY_ID': "", 'AWS_SECRET_ACCESS_KEY': ""}; // Compliant
var credentials = {AWS_ACCESS_KEY_ID: "", AWS_SECRET_ACCESS_KEY: ""}; // Compliant
var credentials = {'AWS_ACCESS_KEY_ID': keystore['DECRYPTED']['AWS_ACCESS_KEY_ID'], 'AWS_SECRET_ACCESS_KEY': keystore['DECRYPTED']['AWS_SECRET_ACCESS_KEY']}; // Compliant
var credentials = {'AWS_SESSION_TOKEN': ''}; // Compliant
var credentials = {'AWS_SESSION_TOKEN': ""}; // Compliant
var credentials = {AWS_SESSION_TOKEN: ""}; // Compliant
var credentials = {'AWS_SESSION_TOKEN': keystore['DECRYPTED']['AWS_SESSION_TOKEN']}; // Compliant
if (AWS_ACCESS_KEY_ID == '' || AWS_SECRET_ACCESS_KEY == "") {} // Compliant
if (AWS_ACCESS_KEY_ID == keystore['DECRYPTED']['AWS_ACCESS_KEY_ID'] || AWS_SECRET_ACCESS_KEY == keystore['DECRYPTED']['AWS_SECRET_ACCESS_KEY']) {} // Compliant
if (AWS_SESSION_TOKEN == '') {} // Complian
if (AWS_SESSION_TOKEN == keystore['DECRYPTED']['AWS_SESSION_TOKEN']) {} // Compliant
require('app/organizations/preferences/controller').name; // Compliant

var aws_id = 'AKIEHI385HKH1IWUQEEN'; // Noncompliant
let aws_key = "PA3XsxZ8d8cPQLmnZzVhaRdzC6ND2a8vhbyXU/Dw"; // Noncompliant
const aws_token = 'FQoDYXdzELv//////////wEldj3948yOJRO84jgpoip239232hEOHhfkjhefkwue97jorhfiuh+XjFC9Je/YG7JCqKjrspab2lB+7/Fb1NJFjgwur47Dbhs/L7nh+/VGnwLoAo8CIqoPBLRmXItaoiuuofZnr+ktihZk1Yi55sYZ12hfRMPVbDmhf9Ke683+e9bJirhUEghw9424JOhgwrgqq99MvzCEFe4eXPOSgAcQcD2xqnnKO738tjhoh23HFqjflhefibWegfqefgqUF12hvgfwegqf'; // Noncompliant 
cloud('AKIEHI385HKH1IWUQEEN', AWS_SECRET_ACCESS_KEY); // Noncompliant
cloud(AWS_ACCESS_KEY_ID, 'PA3XsxZ8d8cPQLmnZzVhaRdzC6ND2a8vhbyXU/Dw'); // Noncompliant
cloud('FQoDYXdzELv//////////wEldj3948yOJRO84jgpoip239232hEOHhfkjhefkwue97jorhfiuh+XjFC9Je/YG7JCqKjrspab2lB+7/Fb1NJFjgwur47Dbhs/L7nh+/VGnwLoAo8CIqoPBLRmXItaoiuuofZnr+ktihZk1Yi55sYZ12hfRMPVbDmhf9Ke683+e9bJirhUEghw9424JOhgwrgqq99MvzCEFe4eXPOSgAcQcD2xqnnKO738tjhoh23HFqjflhefibWegfqefgqUF12hvgfwegqf'); // Noncompliant
function cloud(AWS_ACCESS_KEY_ID='AKIEHI385HKH1IWUQEEN', AWS_SECRET_ACCESS_KEY="") {} // Noncompliant
function cloud(AWS_ACCESS_KEY_ID='', AWS_SECRET_ACCESS_KEY="PA3XsxZ8d8cPQLmnZzVhaRdzC6ND2a8vhbyXU/Dw") {} // Noncompliant
function cloud(AWS_SESSION_TOKEN="FQoDYXdzELv//////////wEldj3948yOJRO84jgpoip239232hEOHhfkjhefkwue97jorhfiuh+XjFC9Je/YG7JCqKjrspab2lB+7/Fb1NJFjgwur47Dbhs/L7nh+/VGnwLoAo8CIqoPBLRmXItaoiuuofZnr+ktihZk1Yi55sYZ12hfRMPVbDmhf9Ke683+e9bJirhUEghw9424JOhgwrgqq99MvzCEFe4eXPOSgAcQcD2xqnnKO738tjhoh23HFqjflhefibWegfqefgqUF12hvgfwegqf") {} // Noncompliant
var credentials = {'AWS_ACCESS_KEY_ID': 'AKIEHI385HKH1IWUQEEN', 'AWS_SECRET_ACCESS_KEY': ''}; // Noncompliant
var credentials = {'AWS_ACCESS_KEY_ID': "", 'AWS_SECRET_ACCESS_KEY': "PA3XsxZ8d8cPQLmnZzVhaRdzC6ND2a8vhbyXU/Dw"}; // Noncompliant
var credentials = {'AWS_SESSION_TOKEN': 'FQoDYXdzELv//////////wEldj3948yOJRO84jgpoip239232hEOHhfkjhefkwue97jorhfiuh+XjFC9Je/YG7JCqKjrspab2lB+7/Fb1NJFjgwur47Dbhs/L7nh+/VGnwLoAo8CIqoPBLRmXItaoiuuofZnr+ktihZk1Yi55sYZ12hfRMPVbDmhf9Ke683+e9bJirhUEghw9424JOhgwrgqq99MvzCEFe4eXPOSgAcQcD2xqnnKO738tjhoh23HFqjflhefibWegfqefgqUF12hvgfwegqf'}; // Noncompliant
if (AWS_ACCESS_KEY_ID == 'AKIEHI385HKH1IWUQEEN') {} // Noncompliant
if (AWS_SECRET_ACCESS_KEY == "PA3XsxZ8d8cPQLmnZzVhaRdzC6ND2a8vhbyXU/Dw") {} // Noncompliant
if (AWS_SESSION_TOKEN == 'FQoDYXdzELv//////////wEldj3948yOJRO84jgpoip239232hEOHhfkjhefkwue97jorhfiuh+XjFC9Je/YG7JCqKjrspab2lB+7/Fb1NJFjgwur47Dbhs/L7nh+/VGnwLoAo8CIqoPBLRmXItaoiuuofZnr+ktihZk1Yi55sYZ12hfRMPVbDmhf9Ke683+e9bJirhUEghw9424JOhgwrgqq99MvzCEFe4eXPOSgAcQcD2xqnnKO738tjhoh23HFqjflhefibWegfqefgqUF12hvgfwegqf') {} // Noncompliant
var role = 'arn:aws:iam::123456789000:role/role-name'; // Noncompliant
let elastic = "arn:aws:elasticbeanstalk:us-east-1:123456789000:environment/app/MyEnvironment"; // Noncompliant
const rds = 'arn:aws:rds:eu-west-4:123456789000:db:mysql-db'; // Noncompliant
class Cloud { static S3 = 'arn:aws:s3:::my_corporate_bucket/exampleobject.png'; } // Noncompliant