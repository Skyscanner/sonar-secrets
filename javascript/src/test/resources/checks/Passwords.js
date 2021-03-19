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
console.log('Passwords test'); // Compliant

var password; // Compliant
let password; // Compliant
const password; // Compliant
password = '';  // Compliant
var password = ''; // Compliant
let password = ""; // Compliant
const password = ""; // Compliant
password = keystore['DECRYPTED']['PASSWORD'];  // Compliant
var password = keystore['DECRYPTED']['PASSWORD']; // Compliant
let password = keystore['DECRYPTED']['PASSWORD']; // Compliant
const password = keystore['DECRYPTED']['PASSWORD']; // Compliant
var passwd; // Compliant
let passwd; // Compliant
const passwd; // Compliant
passwd = '';  // Compliant
var passwd = ''; // Compliant
let passwd = ""; // Compliant
const passwd = ""; // Compliant
passwd = keystore['DECRYPTED']['PASSWORD'];  // Compliant
var passwd = keystore['DECRYPTED']['PASSWORD']; // Compliant
let passwd = keystore['DECRYPTED']['PASSWORD']; // Compliant
const passwd = keystore['DECRYPTED']['PASSWORD']; // Compliant
var pwd; // Compliant
let pwd; // Compliant
const pwd; // Compliant
pwd = '';  // Compliant
var pwd = ''; // Compliant
let pwd = ""; // Compliant
const pwd = ""; // Compliant
pwd = keystore['DECRYPTED']['PASSWORD'];  // Compliant
var pwd = keystore['DECRYPTED']['PASSWORD']; // Compliant
let pwd = keystore['DECRYPTED']['PASSWORD']; // Compliant
const pwd = keystore['DECRYPTED']['PASSWORD']; // Compliant
class Login { static password; } // Compliant
class Login { static password = ''; } // Compliant
class Login { static password = keystore['DECRYPTED']['PASSWORD']; } // Compliant
class Login { static passwd; } // Compliant
class Login { static passwd = ''; } // Compliant
class Login { static passwd = keystore['DECRYPTED']['PASSWORD']; } // Compliant
class Login { static pwd; } // Compliant
class Login { static pwd = ''; } // Compliant
class Login { static pwd = keystore['DECRYPTED']['PASSWORD']; } // Compliant
login(username, password); // Compliant
login(username, passwd); // Compliant
login(username, pwd); // Compliant
function login(username, password) {} // Compliant
function login(username, password='') {} // Compliant
function login(username, password="") {} // Compliant
function login(username, password=keystore['DECRYPTED']['PASSWORD']) {} // Compliant
function login(username, passwd) {} // Compliant
function login(username, passwd='') {} // Compliant
function login(username, passwd="") {} // Compliant
function login(username, passwd=keystore['DECRYPTED']['PASSWORD']) {} // Compliant
function login(username, pwd) {} // Compliant
function login(username, pwd='') {} // Compliant
function login(username, pwd="") {} // Compliant
function login(username, pwd=keystore['DECRYPTED']['PASSWORD']) {} // Compliant
var credentials = {'username': 'admin', 'password': ''}; // Compliant
var credentials = {'username': 'admin', "password": ""}; // Compliant
var credentials = {username: 'admin', password: ''}; // Compliant
var credentials = {'username': 'admin', 'password': keystore['DECRYPTED']['PASSWORD']}; // Compliant
var credentials = {'username': 'admin', "password": keystore['DECRYPTED']['PASSWORD']}; // Compliant
var credentials = {username: 'admin', password: keystore['DECRYPTED']['PASSWORD']}; // Compliant
var credentials = {'username': 'admin', 'passwd': ''}; // Compliant
var credentials = {'username': 'admin', "passwd": ""}; // Compliant
var credentials = {username: 'admin', passwd: ''}; // Compliant
var credentials = {'username': 'admin', 'passwd': keystore['DECRYPTED']['PASSWORD']}; // Compliant
var credentials = {'username': 'admin', "passwd": keystore['DECRYPTED']['PASSWORD']}; // Compliant
var credentials = {username: 'admin', passwd: keystore['DECRYPTED']['PASSWORD']}; // Compliant
var credentials = {'username': 'admin', 'pwd': ''}; // Compliant
var credentials = {'username': 'admin', "pwd": ""}; // Compliant
var credentials = {username: 'admin', pwd: ''}; // Compliant
var credentials = {'username': 'admin', 'pwd': keystore['DECRYPTED']['PASSWORD']}; // Compliant
var credentials = {'username': 'admin', "pwd": keystore['DECRYPTED']['PASSWORD']}; // Compliant
var credentials = {username: 'admin', pwd: keystore['DECRYPTED']['PASSWORD']}; // Compliant
var strings = {IDENTITY_ENTER_PASSWORD: "Identity Enter Password"}; // Compliant
var strings = {INVALID_USER_PASSWORD: "invalid_user_password"}; // Compliant
var strings = password !== "" ? ":" + password : ""; // Compliant
if (password == '') {} // Compliant
if (password == keystore['DECRYPTED']['PASSWORD']) {} // Compliant
if (passwd == '') {} // Compliant
if (passwd == keystore['DECRYPTED']['PASSWORD']) {} // Compliant
if (pwd == '') {} // Compliant
if (pwd == keystore['DECRYPTED']['PASSWORD']) {} // Compliant
$scope.passwordInputType = 'password'; // Compliant

var DB_passwd = 'Password1'; // Noncompliant
var dbpassword = "Password1"; // Noncompliant
var password = 'Password1'; // Noncompliant
let password = "Password1"; // Noncompliant
const password = "Password1"; // Noncompliant
password = 'Password1'; // Noncompliant
var passwd = 'Password1'; // Noncompliant
let passwd = "Password1"; // Noncompliant
const passwd = "Password1"; // Noncompliant
passwd = 'Password1'; // Noncompliant
var pwd = 'Password1'; // Noncompliant
let pwd = "Password1"; // Noncompliant
const pwd = "Password1"; // Noncompliant
pwd = 'Password1'; // Noncompliant
class Login { static password = 'Password1'; } // Noncompliant
class Login { static passwd = "Password1"; } // Noncompliant
class Login { static pwd = "Password1"; } // Noncompliant
login(username, password='Password1'); // Noncompliant
login(username, passwd="Password1"); // Noncompliant
login(username, pwd='Password1'); // Noncompliant
function login(username, password='Password1') {} // Noncompliant
function login(username, password="Password1") {} // Noncompliant
function login(username, passwd='Password1') {} // Noncompliant
function login(username, passwd="Password1") {} // Noncompliant
function login(username, pwd='Password1') {} // Noncompliant
function login(username, pwd="Password1") {} // Noncompliant
var credentials = {'username': 'admin', 'password': 'Password1'}; // Noncompliant
var credentials = {'username': 'admin', "password": "Password1"}; // Noncompliant
var credentials = {username: 'admin', password: 'Password1'}; // Noncompliant
var credentials = {'username': 'admin', 'passwd': 'Password1'}; // Noncompliant
var credentials = {'username': 'admin', "passwd": "Password1"}; // Noncompliant
var credentials = {username: 'admin', passwd: 'Password1'}; // Noncompliant
var credentials = {'username': 'admin', 'pwd': 'Password1'}; // Noncompliant
var credentials = {'username': 'admin', "pwd": "Password1"}; // Noncompliant
var credentials = {username: 'admin', pwd: 'Password1'}; // Noncompliant
if (password == 'admin') {} // Noncompliant
if (passwd == 'admin') {} // Noncompliant
if (pwd == 'admin') {} // Noncompliant