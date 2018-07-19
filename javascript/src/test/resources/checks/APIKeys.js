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
console.log('APIKeys test'); // Compliant

var ApiKey; // Compliant
let apikey; // Compliant
const api_key; // Compliant
var ApiKey = ''; // Compliant
let apikey = ""; // Compliant
const api_key = ''; // Compliant
TRAVEL_API_KEY = ""; // Compliant
var ApiKey = keystore['DECRYPTED']['API']; // Compliant
let apikey = keystore['DECRYPTED']['API']; // Compliant
const api_key = keystore['DECRYPTED']['API']; // Compliant
apiKey = keystore['DECRYPTED']['API']; // Compliant
var ApiToken; // Compliant
let apitoken; // Compliant
const api_token; // Compliant
var ApiToken = ''; // Compliant
let apitoken = ""; // Compliant
const api_token = ''; // Compliant
PRIVATE_API_TOKEN = ""; // Compliant
var ApiToken = keystore['DECRYPTED']['API']; // Compliant
let apitoken = keystore['DECRYPTED']['API']; // Compliant
const api_token = keystore['DECRYPTED']['API']; // Compliant
apiToken = keystore['DECRYPTED']['API']; // Compliant
var ApiSecret; // Compliant
let apisecret; // Compliant
const api_secret; // Compliant
var ApiSecret = ""; // Compliant
let apisecret = ''; // Compliant
const api_secret = ''; // Compliant
SKYSCANNER_API_SECRET = ""; // Compliant
var ApiSecret = keystore['DECRYPTED']['API']; // Compliant
let apisecret = keystore['DECRYPTED']['API']; // Compliant
const api_secret = keystore['DECRYPTED']['API']; // Compliant
apiSecret = keystore['DECRYPTED']['API']; // Compliant
class Auth { static APIKEY; } // Compliant
class Auth { static apikey = ''; } // Compliant
class Auth { static api_key = keystore['DECRYPTED']['API']; } // Compliant
class Auth { static APITOKEN; } // Compliant
class Auth { static apitoken = ""; } // Compliant
class Auth { static api_token = keystore['DECRYPTED']['API']; } // Compliant
class Auth { static APISECRET; } // Compliant
class Auth { static apisecret = ''; } // Compliant
class Auth { static api_secret = keystore['DECRYPTED']['API']; } // Compliant
auth(apikey); // Compliant
auth(api_key); // Compliant
auth(apitoken); // Compliant
auth(api_token); // Compliant
auth(apisecret); // Compliant
auth(api_secret); // Compliant
function auth(apikey) {} // Compliant
function auth(api_key='') {} // Compliant
function auth(apikey=keystore['DECRYPTED']['API']) {} // Compliant
function auth(apitoken) {} // Compliant
function auth(api_token='') {} // Compliant
function auth(apitoken=keystore['DECRYPTED']['API']) {} // Compliant
function auth(apisecret) {} // Compliant
function auth(api_secret='') {} // Compliant
function auth(apisecret=keystore['DECRYPTED']['API']) {} // Compliant
var credentials = {'username': 'admin', 'apikey': ''}; // Compliant
var credentials = {'username': 'admin', "api_key": ""}; // Compliant
var credentials = {username: 'admin', apikey: ''}; // Compliant
var credentials = {'username': 'admin', 'apikey': keystore['DECRYPTED']['API']}; // Compliant
var credentials = {'username': 'admin', "api_key": keystore['DECRYPTED']['API']}; // Compliant
var credentials = {username: 'admin', apikey: keystore['DECRYPTED']['API']}; // Compliant
var credentials = {'username': 'admin', 'apitoken': ''}; // Compliant
var credentials = {'username': 'admin', "api_token": ""}; // Compliant
var credentials = {username: 'admin', apitoken: ''}; // Compliant
var credentials = {'username': 'admin', 'apitoken': keystore['DECRYPTED']['API']}; // Compliant
var credentials = {'username': 'admin', "api_token": keystore['DECRYPTED']['API']}; // Compliant
var credentials = {username: 'admin', apitoken: keystore['DECRYPTED']['API']}; // Compliant
var credentials = {'username': 'admin', 'apisecret': ''}; // Compliant
var credentials = {'username': 'admin', "api_secret": ""}; // Compliant
var credentials = {username: 'admin', apisecret: ''}; // Compliant
var credentials = {'username': 'admin', 'apisecret': keystore['DECRYPTED']['API']}; // Compliant
var credentials = {'username': 'admin', "api_secret": keystore['DECRYPTED']['API']}; // Compliant
var credentials = {username: 'admin', apisecret: keystore['DECRYPTED']['API']}; // Compliant
if (apikey == '') {} // Compliant
if (api_key == keystore['DECRYPTED']['API']) {} // Compliant
if (apitoken == '') {} // Compliant
if (api_token == keystore['DECRYPTED']['API']) {} // Compliant
if (apisecret == '') {} // Compliant
if (api_secret == keystore['DECRYPTED']['API']) {} // Compliant

TRAVEL_API_KEY = '912ec803b2ce49e4a541068d495ab570'; // Noncompliant
var ApiKey = '912ec803b2ce49e4a541068d495ab570'; // Noncompliant
let apikey = "apikey"; // Noncompliant
const api_key = 'YXNkZmZmZmZm_YXNkZmZmZmZm'; // Noncompliant
apiKey = "912ec803b2ce49e4a541068d495ab570"; // Noncompliant
PRIVATE_API_TOKEN = '912ec803b2ce49e4a541068d495ab570'; // Noncompliant
var ApiToken = '912ec803b2ce49e4a541068d495ab570'; // Noncompliant
let apitoken = "apitoken"; // Noncompliant
const api_token = 'YXNkZmZmZmZm_YXNkZmZmZmZm'; // Noncompliant
apiToken = "912ec803b2ce49e4a541068d495ab570"; // Noncompliant
SKYSCANNER_API_SECRET = '912ec803b2ce49e4a541068d495ab570'; // Noncompliant
var ApiSecret = "912ec803b2ce49e4a541068d495ab570"; // Noncompliant
let apisecret = 'apisecret'; // Noncompliant
const api_secret = 'YXNkZmZmZmZm_YXNkZmZmZmZm'; // Noncompliant
apiSecret = "912ec803b2ce49e4a541068d495ab570"; // Noncompliant
var GITLAB_TOKEN = 'YXNkZmZmZmZm_YXNkZmZmZmZm'; // Noncompliant
let GITHUB_SECRET = "YXNkZmZmZmZm_YXNkZmZmZmZm"; // Noncompliant
const slack_key = "YXNkZmZmZmZm_YXNkZmZmZmZm"; // Noncompliant
Google_token = 'YXNkZmZmZmZm_YXNkZmZmZmZm'; // Noncompliant
class Auth { static apikey = '912ec803b2ce49e4a541068d495ab570'; } // Noncompliant
class Auth { static api_key = 'YXNkZmZmZmZm_YXNkZmZmZmZm'; } // Noncompliant
class Auth { static apitoken = "912ec803b2ce49e4a541068d495ab570"; } // Noncompliant
class Auth { static api_token = "YXNkZmZmZmZm_YXNkZmZmZmZm"; } // Noncompliant
class Auth { static apisecret = '912ec803b2ce49e4a541068d495ab570'; } // Noncompliant
class Auth { static api_secret = "YXNkZmZmZmZm_YXNkZmZmZmZm"; } // Noncompliant
function auth(api_key='912ec803b2ce49e4a541068d495ab570') {} // Noncompliant
function auth(api_token='912ec803b2ce49e4a541068d495ab570') {} // Noncompliant
function auth(api_secret='912ec803b2ce49e4a541068d495ab570') {} // Noncompliant
var credentials = {'username': 'admin', 'apikey': '912ec803b2ce49e4a541068d495ab570'}; // Noncompliant
var credentials = {'username': 'admin', "api_key": "YXNkZmZmZmZm_YXNkZmZmZmZm"}; // Noncompliant
var credentials = {username: 'admin', apikey: '912ec803b2ce49e4a541068d495ab570'}; // Noncompliant
var credentials = {'username': 'admin', 'apitoken': '912ec803b2ce49e4a541068d495ab570'}; // Noncompliant
var credentials = {'username': 'admin', "api_token": "YXNkZmZmZmZm_YXNkZmZmZmZm"}; // Noncompliant
var credentials = {username: 'admin', apitoken: '912ec803b2ce49e4a541068d495ab570'}; // Noncompliant
var credentials = {'username': 'admin', 'apisecret': '912ec803b2ce49e4a541068d495ab570'}; // Noncompliant
var credentials = {'username': 'admin', "api_secret": "YXNkZmZmZmZm_YXNkZmZmZmZm"}; // Noncompliant
var credentials = {username: 'admin', apisecret: '912ec803b2ce49e4a541068d495ab570'}; // Noncompliant
if (apikey == 'YXNkZmZmZmZm_YXNkZmZmZmZm') {} // Noncompliant
if (api_key == '912ec803b2ce49e4a541068d495ab570') {} // Noncompliant
if (apitoken == 'YXNkZmZmZmZm_YXNkZmZmZmZm') {} // Noncompliant
if (api_token == "912ec803b2ce49e4a541068d495ab570") {} // Noncompliant
if (apisecret == 'YXNkZmZmZmZm_YXNkZmZmZmZm') {} // Noncompliant
if (api_secret == "912ec803b2ce49e4a541068d495ab570") {} // Noncompliant